package com.sap.stepbystep;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sap.cloud.mobile.foundation.authentication.BasicAuthDialogAuthenticator;
import com.sap.cloud.mobile.foundation.authentication.OAuth2BrowserProcessor;
import com.sap.cloud.mobile.foundation.authentication.OAuth2Configuration;
import com.sap.cloud.mobile.foundation.authentication.OAuth2Interceptor;
import com.sap.cloud.mobile.foundation.authentication.OAuth2WebViewProcessor;
import com.sap.cloud.mobile.foundation.common.ClientProvider;
import com.sap.cloud.mobile.foundation.common.EncryptionError;
import com.sap.cloud.mobile.foundation.common.EncryptionUtil;
import com.sap.cloud.mobile.foundation.common.SettingsParameters;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationLoader;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationLoaderCallback;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationPersistenceException;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationProvider;
import com.sap.cloud.mobile.foundation.configurationprovider.ConfigurationProviderError;
import com.sap.cloud.mobile.foundation.configurationprovider.DefaultPersistenceMethod;
import com.sap.cloud.mobile.foundation.configurationprovider.DiscoveryServiceConfigurationProvider;
import com.sap.cloud.mobile.foundation.configurationprovider.FileConfigurationProvider;
import com.sap.cloud.mobile.foundation.configurationprovider.ProviderIdentifier;
import com.sap.cloud.mobile.foundation.configurationprovider.ProviderInputs;
import com.sap.cloud.mobile.foundation.configurationprovider.UserInputs;
import com.sap.cloud.mobile.foundation.logging.Logging;
import com.sap.cloud.mobile.foundation.networking.AppHeadersInterceptor;
import com.sap.cloud.mobile.foundation.networking.WebkitCookieJar;
import com.sap.cloud.mobile.foundation.securestore.OpenFailureException;
import com.sap.cloud.mobile.foundation.securestore.SecureKeyValueStore;
import com.sap.cloud.mobile.foundation.user.UserInfo;
import com.sap.cloud.mobile.foundation.user.UserRoles;
import com.sap.cloud.mobile.foundation.usage.AppUsage;
import com.sap.cloud.mobile.foundation.usage.AppUsageInfo;
import com.sap.cloud.mobile.foundation.usage.AppUsageUploader;
import com.sap.cloud.mobile.odata.DataServiceException;
import com.sap.cloud.mobile.odata.OnlineODataProvider;
import com.sap.stepbystep.ESPM.ESPMContainer;
import com.sap.stepbystep.ESPM.Product;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.util.StatusPrinter;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private Integer numberOfPresses = 0;
    private final String myTag = "myDebuggingTag";
    private OkHttpClient myOkHttpClient;
    private String deviceID;
    private final String serviceURL = "https://mobile-a71f9a2af.hana.ondemand.com";
    private final String appID = "com.sap.stepbystep";
    private final String connectionID = "com.sap.edm.sampleservice.v2";
    private String messageToToast;
    private Toast toast;
    private String currentUser;
    private org.slf4j.Logger myLogger;
    private ch.qos.logback.classic.Logger myRootLogger;
    private Logging.UploadListener myLogUploadListener;
    private ESPMContainer myServiceContainer;
    private OnlineODataProvider myDataProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(myTag, "onCreate");
        setContentView(R.layout.activity_main);
        deviceID = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID);
        Logging.ConfigurationBuilder cb = new Logging.ConfigurationBuilder()
                .logToConsole(true)
                .initialLevel(Level.ERROR);
//cb.logFileCount(4);
//cb.logFileSize("1MB");
        Logging.initialize(this.getApplicationContext(), cb);
        myRootLogger = Logging.getRootLogger();
        myLogger = LoggerFactory.getLogger(MainActivity.class);
        onRegister(null);
    }

    public void onLogALine(View view) {
        Log.d(myTag, "In onLogALine");
        numberOfPresses = numberOfPresses + 1;
        Log.d(myTag, "Button pressed " + numberOfPresses + " times");
        myLogger.warn("Logged with warn, log level is {}", ((ch.qos.logback.classic.Logger) myLogger).getEffectiveLevel());  //not logged as myLogger inherits from RootLogger
        myRootLogger.warn("Logged with warn, log level is {}", myRootLogger.getEffectiveLevel()); //not logged as rootLog was set to error in onCreate
        ((ch.qos.logback.classic.Logger) myLogger).setLevel(ch.qos.logback.classic.Level.WARN);
        myLogger.warn("Logged with warn, log level is {}", ((ch.qos.logback.classic.Logger) myLogger).getEffectiveLevel());  //logged
        myRootLogger.warn("Logged with warn, log level is {}", myRootLogger.getEffectiveLevel()); //not logged as rootLog was set to error in onCreate
        myRootLogger.error("Logged with error, log level is {}", myRootLogger.getEffectiveLevel());  //logged
        //StatusPrinter.print(((ch.qos.logback.classic.Logger)myLogger).getLoggerContext());  //shows where the log is on the device
        //String p = Logging.getConsoleLoggerPattern(); //pattern used for the log can be seen and changed via setConsoleLoggerPattern
    }


    public void onRegister(View view) {
        Log.d(myTag, "In onRegister");
        Logger authLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.sap.cloud.mobile.foundation.authentication");
        authLogger.setLevel(Level.DEBUG);
        myOkHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new AppHeadersInterceptor(appID, deviceID, "1.0"))
                .authenticator(new BasicAuthDialogAuthenticator())
                .cookieJar(new WebkitCookieJar())
                .build();

        Request request = new Request.Builder()
                .get()
                .url(serviceURL + "/" + connectionID + "/")
                //               .url(serviceURL + "/" + appID + "/Connections")
                .build();

        Callback updateUICallback = new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) { //called if there is no network
                Log.d(myTag, "onFailure called during authentication " + e.getMessage());
                toastAMessage("Registration failed " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (response.isSuccessful()) {
                    Log.d(myTag, "Successfully authenticated");
                    toastAMessage("Successfully authenticated");
                    enableButtonsOnRegister(true);
                    getUser();
                    myDataProvider = new OnlineODataProvider("ESPMContainer", serviceURL + "/" + connectionID, myOkHttpClient);
                    myServiceContainer = new ESPMContainer(myDataProvider);
                } else { //called if the credentials are incorrect
                    Log.d(myTag, "Registration failed " + response.networkResponse());
                    toastAMessage("Registration failed " + response.networkResponse());
                }
            }
        };

        myOkHttpClient.newCall(request).enqueue(updateUICallback);
    }

    public void onUploadLog(View view) {
        Log.d(myTag, "In onUploadLog");

        myLogUploadListener = new Logging.UploadListener() {
            @Override
            public void onSuccess() {
                Log.d(myTag, "log upload complete, successful!");
                toastAMessage("Log upload completed and was successful!");
                Logging.removeLogUploadListener(myLogUploadListener);
            }

            @Override
            public void onError(@NonNull Throwable throwable) {
                Log.d(myTag, "log upload encountered an error with message: " + throwable.getMessage());
                toastAMessage("Log upload failed with error message: " + throwable.getMessage());
                Logging.removeLogUploadListener(myLogUploadListener);
            }

            @Override
            public void onProgress(int percentUploaded) {
                Log.d(myTag, "log upload progress: " + percentUploaded);
            }
        };
        Logging.addLogUploadListener(myLogUploadListener);

        try {
            SettingsParameters sp = new SettingsParameters(serviceURL, appID, deviceID, "1.0");
            Logging.uploadLog(myOkHttpClient, sp, Logging.UploadType.MERGE);
        } catch (MalformedURLException e) {
            myLogger.error("MalformedURLException: " + e.getMessage(), e);
        }
    }

    public void onOnlineOData(View view) {
        Log.d(myTag, "In onOnlineOData");
        new ODataQueryTask().execute();
    }

    public void onOfflineOData(View view) {
        Log.d(myTag, "In onOfflineOData");
    }

    private void toastAMessage(String msg) {
        if (toast != null && toast.getView().isShown()) {
            msg = messageToToast + "\n" + msg;
        } else {  //clear any previously shown toasts that have since stopped being displayed
            messageToToast = "";
        }
        messageToToast = msg;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {

            @Override
            public void run() {
                if (toast != null) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(),
                        messageToToast,
                        Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    private void getUser() {
        Log.d(myTag, "In getUser");
        SettingsParameters sp = null;
        try {
            sp = new SettingsParameters(serviceURL, appID, deviceID, "1.0");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UserRoles roles = new UserRoles(myOkHttpClient, sp);
        UserRoles.CallbackListener callbackListener = new UserRoles.CallbackListener() {
            @Override
            public void onSuccess(@NonNull UserInfo ui) {
                Log.d(myTag, "User Name: " + ui.getUserName());
                Log.d(myTag, "User Id: " + ui.getId());
                String[] roleList = ui.getRoles();
                Log.d(myTag, "User has the following Roles");
                for (int i = 0; i < roleList.length; i++) {
                    Log.d(myTag, "Role Name " + roleList[i]);
                }
                currentUser = ui.getId();
                toastAMessage("Currently logged with " + ui.getId());
            }

            @Override
            public void onError(@NonNull Throwable throwable) {
                toastAMessage("UserRoles onFailure " + throwable.getMessage());
            }
        };

        roles.load(callbackListener);
    }

    private void enableButtonsOnRegister(final boolean enable) {
        final Button uploadLogButton = (Button) findViewById(R.id.b_uploadLog);
        final Button onlineODataButton = (Button) findViewById(R.id.b_odata);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                uploadLogButton.setEnabled(enable);
                onlineODataButton.setEnabled(enable);
            }
        });

    }

    private class ODataQueryTask extends AsyncTask<Void, Void, List<Product>> {
        @Override
        protected List doInBackground(Void... voids) {
            if (myServiceContainer != null) {
                try {
                    return myServiceContainer.getProducts();
                } catch (DataServiceException dse) {
                    Log.d(myTag, "Exception " + dse.getMessage());
                } catch (Exception e) {
                    Log.d(myTag, "Exception " + e.getCause().getMessage());
                }
                return Arrays.asList(new Product[0]);
            } else {
                Log.d(myTag, "service container is null");
                return Arrays.asList(new Product[0]);
            }
        }

        @Override
        protected void onPostExecute(List<Product> products) {
            //Can update the UI thread here
            toastAMessage(products.size() + " products returned");
            for (Product product : products) {
                Log.d(myTag, product.getName());
                Log.d(myTag, product.getCategory());
            }
        }
    }
}
//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.1.1, on Sun May 26 21:53:19 CEST 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.sap.stepbystep.ESPM.internal;

/**
 ** <p>Utility class for unsafe type casting to nullable target type.
 **/
public abstract class Any_asNullable_com_sap_stepbystep_ESPM_Address {
    /**
     ** <p>Return (nullable) <code>value</code> cast to {@link com.sap.stepbystep.ESPM.Address}?, or <code>null</code> if <code>value</code> is <code>null</code>.</p>
     ** <dl><dt><span class='strong'>Throws:</span></dt><dd>
     ** <p>{@link com.sap.cloud.mobile.odata.core.CastException} if <code>value</code> is not of type <code>AsType</code>.</p>
     ** </dd></dl>
     ** @return (nullable) `value` cast to {@link com.sap.stepbystep.ESPM.Address}?, or `null` if `value` is `null`.
     **/
    public static @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.sap.stepbystep.ESPM.Address cast(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Object value) {
        if (value == null) {
            return null;
        }
        else if (value instanceof com.sap.stepbystep.ESPM.Address) {
            final com.sap.stepbystep.ESPM.Address var2_value = ((com.sap.stepbystep.ESPM.Address)value);
            return var2_value;
        } else {
            throw com.sap.cloud.mobile.odata.core.CastException.cannotCast(value, "com.sap.stepbystep.ESPM.Address");
        }
    }
}

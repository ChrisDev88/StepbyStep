//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.1.1, on Sun May 26 21:53:19 CEST 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.sap.stepbystep.ESPM.internal;

/**
 ** <p>Utility class for unsafe type casting to non-nullable target type.
 **/
public abstract class Any_as_com_sap_stepbystep_ESPM_ProductCategory {
    /**
     ** <p>Return <code>value</code> cast to AnyType.</p>
     ** <dl><dt><span class='strong'>Throws:</span></dt><dd>
     ** <p>{@link com.sap.cloud.mobile.odata.core.CastException} if <code>value</code> is not of type <code>AnyType</code>.</p>
     ** </dd></dl>
     ** @return `value` cast to AnyType.
     **/
    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.stepbystep.ESPM.ProductCategory cast(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Object value) {
        if (value instanceof com.sap.stepbystep.ESPM.ProductCategory) {
            final com.sap.stepbystep.ESPM.ProductCategory var_value = ((com.sap.stepbystep.ESPM.ProductCategory)value);
            return var_value;
        } else {
            throw com.sap.cloud.mobile.odata.core.CastException.cannotCast(value, "com.sap.stepbystep.ESPM.ProductCategory");
        }
    }
}

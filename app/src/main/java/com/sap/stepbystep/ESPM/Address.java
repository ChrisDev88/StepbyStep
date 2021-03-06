//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.1.1, on Sun May 26 21:53:19 CEST 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.sap.stepbystep.ESPM;

public class Address
    extends com.sap.cloud.mobile.odata.ComplexValue {
    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property houseNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("HouseNumber");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property street = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("Street");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property city = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("City");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property country = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("Country");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property postalCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("PostalCode");

    /**
     ** See <a href='#Address-boolean-'>Address(boolean)</a>.
     **/
    public Address() {
        this(true);
    }

    public Address(final boolean withDefaults) {
        super(withDefaults, com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address);
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.stepbystep.ESPM.Address copy() {
        return com.sap.stepbystep.ESPM.internal.Any_as_com_sap_stepbystep_ESPM_Address.cast(this.copyComplex());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getCity() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Address.city));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getCountry() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Address.country));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getHouseNumber() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Address.houseNumber));
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.stepbystep.ESPM.Address getOld() {
        return com.sap.stepbystep.ESPM.internal.Any_as_com_sap_stepbystep_ESPM_Address.cast(this.getOldComplex());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getPostalCode() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Address.postalCode));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getStreet() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Address.street));
    }

    /**
     ** {@inheritDoc}
     **/
    @java.lang.Override public boolean isProxy() {
        return true;
    }

    public void setCity(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Address.city, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setCountry(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Address.country, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setHouseNumber(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Address.houseNumber, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setPostalCode(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Address.postalCode, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setStreet(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Address.street, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }
}

//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.1.1, on Sun May 26 21:53:19 CEST 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.sap.stepbystep.ESPM;

public class ProductText extends com.sap.cloud.mobile.odata.EntityValue implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<ProductText> CREATOR = new android.os.Parcelable.Creator<ProductText>() {
        public ProductText createFromParcel(android.os.Parcel in) {
            com.sap.cloud.mobile.odata.JsonEntityProvider provider = com.sap.cloud.mobile.odata.JsonEntityProvider.withMetadata(ESPMContainerMetadata.document);
            ESPMContainer service = new ESPMContainer(provider);
            com.sap.cloud.mobile.odata.DataQuery query = com.sap.cloud.mobile.odata.FromJSON.entity(in.readString());
            query.setEntitySet(ESPMContainerMetadata.EntitySets.productTexts);
            query.setEntityType(ESPMContainerMetadata.EntityTypes.productText);
            com.sap.cloud.mobile.odata.EntityValue entity = service.executeQuery(query).getRequiredEntity();
            return (ProductText)entity;
        }

        public ProductText[] newArray(int size) {
            return new ProductText[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel out, int flags) {
        out.writeString(com.sap.cloud.mobile.odata.ToJSON.entity(this, com.sap.cloud.mobile.odata.DataContext.FULL_METADATA));
    }

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property id = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Id");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property language = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Language");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property longDescription = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("LongDescription");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property name = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Name");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property productID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("ProductId");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property shortDescription = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("ShortDescription");

    /**
     ** See <a href='#ProductText-boolean-'>ProductText(boolean)</a>.
     **/
    public ProductText() {
        this(true);
    }

    public ProductText(final boolean withDefaults) {
        super(withDefaults, com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText);
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.stepbystep.ESPM.ProductText copy() {
        return com.sap.stepbystep.ESPM.internal.Any_as_com_sap_stepbystep_ESPM_ProductText.cast(this.copyEntity());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Long getId() {
        return com.sap.cloud.mobile.odata.LongValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.ProductText.id));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getLanguage() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.ProductText.language));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getLongDescription() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.ProductText.longDescription));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getName() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.ProductText.name));
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.stepbystep.ESPM.ProductText getOld() {
        return com.sap.stepbystep.ESPM.internal.Any_as_com_sap_stepbystep_ESPM_ProductText.cast(this.getOldEntity());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getProductID() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.ProductText.productID));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getShortDescription() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.ProductText.shortDescription));
    }

    /**
     ** {@inheritDoc}
     **/
    @java.lang.Override public boolean isProxy() {
        return true;
    }

    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.EntityKey key(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Long id) {
        return new com.sap.cloud.mobile.odata.EntityKey().with("Id", com.sap.cloud.mobile.odata.LongValue.ofNullable(id));
    }

    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull java.util.List<com.sap.stepbystep.ESPM.@org.jetbrains.annotations.NotNull ProductText> list(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.EntityValueList from) {
        return com.sap.cloud.mobile.odata.core.ListConverter.<com.sap.cloud.mobile.odata.EntityValue,com.sap.stepbystep.ESPM.ProductText>convert(from.toGeneric());
    }

    public void setId(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Long value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.ProductText.id, com.sap.cloud.mobile.odata.LongValue.ofNullable(value));
    }

    public void setLanguage(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.ProductText.language, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setLongDescription(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.ProductText.longDescription, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setName(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.ProductText.name, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setProductID(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.ProductText.productID, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setShortDescription(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.ProductText.shortDescription, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }
}

//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.1.1, on Sun May 26 21:53:19 CEST 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.sap.stepbystep.ESPM;

public class Customer extends com.sap.cloud.mobile.odata.EntityValue implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<Customer> CREATOR = new android.os.Parcelable.Creator<Customer>() {
        public Customer createFromParcel(android.os.Parcel in) {
            com.sap.cloud.mobile.odata.JsonEntityProvider provider = com.sap.cloud.mobile.odata.JsonEntityProvider.withMetadata(ESPMContainerMetadata.document);
            ESPMContainer service = new ESPMContainer(provider);
            com.sap.cloud.mobile.odata.DataQuery query = com.sap.cloud.mobile.odata.FromJSON.entity(in.readString());
            query.setEntitySet(ESPMContainerMetadata.EntitySets.customers);
            query.setEntityType(ESPMContainerMetadata.EntityTypes.customer);
            com.sap.cloud.mobile.odata.EntityValue entity = service.executeQuery(query).getRequiredEntity();
            return (Customer)entity;
        }

        public Customer[] newArray(int size) {
            return new Customer[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel out, int flags) {
        out.writeString(com.sap.cloud.mobile.odata.ToJSON.entity(this, com.sap.cloud.mobile.odata.DataContext.FULL_METADATA));
    }

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property city = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("City");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property country = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Country");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property customerID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("CustomerId");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property dateOfBirth = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("DateOfBirth");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property emailAddress = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("EmailAddress");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property firstName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("FirstName");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property houseNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("HouseNumber");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property lastName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("LastName");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property phoneNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("PhoneNumber");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property postalCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("PostalCode");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property street = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Street");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property address = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Address");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property updatedTimestamp = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("UpdatedTimestamp");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property salesOrders = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("SalesOrders");

    /**
     ** See <a href='#Customer-boolean-'>Customer(boolean)</a>.
     **/
    public Customer() {
        this(true);
    }

    public Customer(final boolean withDefaults) {
        super(withDefaults, com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer);
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.stepbystep.ESPM.Customer copy() {
        return com.sap.stepbystep.ESPM.internal.Any_as_com_sap_stepbystep_ESPM_Customer.cast(this.copyEntity());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.sap.stepbystep.ESPM.Address getAddress() {
        return com.sap.stepbystep.ESPM.internal.Any_asNullable_com_sap_stepbystep_ESPM_Address.cast(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.address));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getCity() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.city));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getCountry() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.country));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getCustomerID() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.customerID));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.sap.cloud.mobile.odata.LocalDateTime getDateOfBirth() {
        return com.sap.cloud.mobile.odata.LocalDateTime.castOptional(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.dateOfBirth));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getEmailAddress() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.emailAddress));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getFirstName() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.firstName));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getHouseNumber() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.houseNumber));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getLastName() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.lastName));
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.stepbystep.ESPM.Customer getOld() {
        return com.sap.stepbystep.ESPM.internal.Any_as_com_sap_stepbystep_ESPM_Customer.cast(this.getOldEntity());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getPhoneNumber() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.phoneNumber));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getPostalCode() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.postalCode));
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull java.util.List<com.sap.stepbystep.ESPM.@org.jetbrains.annotations.NotNull SalesOrderHeader> getSalesOrders() {
        return com.sap.cloud.mobile.odata.core.ListConverter.<com.sap.cloud.mobile.odata.EntityValue,com.sap.stepbystep.ESPM.SalesOrderHeader>convert(com.sap.cloud.mobile.odata.EntityValueList.castRequired(this.getRequiredValue(com.sap.stepbystep.ESPM.Customer.salesOrders)).toGeneric());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getStreet() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.street));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.sap.cloud.mobile.odata.LocalDateTime getUpdatedTimestamp() {
        return com.sap.cloud.mobile.odata.LocalDateTime.castOptional(this.getOptionalValue(com.sap.stepbystep.ESPM.Customer.updatedTimestamp));
    }

    /**
     ** {@inheritDoc}
     **/
    @java.lang.Override public boolean isProxy() {
        return true;
    }

    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.EntityKey key(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String customerID) {
        return new com.sap.cloud.mobile.odata.EntityKey().with("CustomerId", com.sap.cloud.mobile.odata.StringValue.ofNullable(customerID));
    }

    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull java.util.List<com.sap.stepbystep.ESPM.@org.jetbrains.annotations.NotNull Customer> list(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.EntityValueList from) {
        return com.sap.cloud.mobile.odata.core.ListConverter.<com.sap.cloud.mobile.odata.EntityValue,com.sap.stepbystep.ESPM.Customer>convert(from.toGeneric());
    }

    public void setAddress(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.sap.stepbystep.ESPM.Address value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.address, value);
    }

    public void setCity(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.city, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setCountry(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.country, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setCustomerID(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.customerID, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setDateOfBirth(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.sap.cloud.mobile.odata.LocalDateTime value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.dateOfBirth, value);
    }

    public void setEmailAddress(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.emailAddress, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setFirstName(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.firstName, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setHouseNumber(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.houseNumber, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setLastName(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.lastName, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setPhoneNumber(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.phoneNumber, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setPostalCode(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.postalCode, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setSalesOrders(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull java.util.List<com.sap.stepbystep.ESPM.@org.jetbrains.annotations.NotNull SalesOrderHeader> value) {
        com.sap.stepbystep.ESPM.Customer.salesOrders.setEntityList(this, com.sap.cloud.mobile.odata.EntityValueList.from(com.sap.cloud.mobile.odata.core.ListConverter.<com.sap.stepbystep.ESPM.SalesOrderHeader,com.sap.cloud.mobile.odata.EntityValue>convert(value)));
    }

    public void setStreet(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.street, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setUpdatedTimestamp(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.sap.cloud.mobile.odata.LocalDateTime value) {
        this.setOptionalValue(com.sap.stepbystep.ESPM.Customer.updatedTimestamp, value);
    }
}
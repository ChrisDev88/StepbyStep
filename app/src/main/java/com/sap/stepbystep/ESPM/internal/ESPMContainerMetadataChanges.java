//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.1.1, on Sun May 26 21:53:19 CEST 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.sap.stepbystep.ESPM.internal;

public abstract class ESPMContainerMetadataChanges {
    public static void merge(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.csdl.CsdlDocument metadata) {
        metadata.setGeneratedProxies(true);
        metadata.setOpenEnumerations(true);
        com.sap.stepbystep.ESPM.ESPMContainerMetadata.document = metadata;
        com.sap.stepbystep.ESPM.internal.ESPMContainerMetadataChanges.merge1(metadata);
        com.sap.stepbystep.ESPM.internal.ESPMContainerFactory.registerAll();
    }

    private static void merge1(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.csdl.CsdlDocument metadata) {
        com.sap.cloud.mobile.odata.core.Ignore.valueOf_any(metadata);
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address = metadata.getComplexType("ESPM.Address");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer = metadata.getEntityType("ESPM.Customer");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product = metadata.getEntityType("ESPM.Product");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory = metadata.getEntityType("ESPM.ProductCategory");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText = metadata.getEntityType("ESPM.ProductText");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader = metadata.getEntityType("ESPM.PurchaseOrderHeader");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem = metadata.getEntityType("ESPM.PurchaseOrderItem");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader = metadata.getEntityType("ESPM.SalesOrderHeader");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem = metadata.getEntityType("ESPM.SalesOrderItem");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock = metadata.getEntityType("ESPM.Stock");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier = metadata.getEntityType("ESPM.Supplier");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.customers.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.customers = metadata.getEntitySet("Customers");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.productCategories.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.productCategories = metadata.getEntitySet("ProductCategories");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.productTexts.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.productTexts = metadata.getEntitySet("ProductTexts");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.products.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.products = metadata.getEntitySet("Products");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderHeaders.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderHeaders = metadata.getEntitySet("PurchaseOrderHeaders");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderItems.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderItems = metadata.getEntitySet("PurchaseOrderItems");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.salesOrderHeaders.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.salesOrderHeaders = metadata.getEntitySet("SalesOrderHeaders");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.salesOrderItems.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.salesOrderItems = metadata.getEntitySet("SalesOrderItems");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.stock.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.stock = metadata.getEntitySet("Stock");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.suppliers.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntitySets.suppliers = metadata.getEntitySet("Suppliers");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.generateSamplePurchaseOrders.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.generateSamplePurchaseOrders = metadata.getDataMethod("GenerateSamplePurchaseOrders");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.generateSampleSalesOrders.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.generateSampleSalesOrders = metadata.getDataMethod("GenerateSampleSalesOrders");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.resetSampleData.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.resetSampleData = metadata.getDataMethod("ResetSampleData");
        }
        if (!com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.updateSalesOrderStatus.isRemoved()) {
            com.sap.stepbystep.ESPM.ESPMContainerMetadata.ActionImports.updateSalesOrderStatus = metadata.getDataMethod("UpdateSalesOrderStatus");
        }
        if (!com.sap.stepbystep.ESPM.Address.houseNumber.isRemoved()) {
            com.sap.stepbystep.ESPM.Address.houseNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("HouseNumber");
        }
        if (!com.sap.stepbystep.ESPM.Address.street.isRemoved()) {
            com.sap.stepbystep.ESPM.Address.street = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("Street");
        }
        if (!com.sap.stepbystep.ESPM.Address.city.isRemoved()) {
            com.sap.stepbystep.ESPM.Address.city = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("City");
        }
        if (!com.sap.stepbystep.ESPM.Address.country.isRemoved()) {
            com.sap.stepbystep.ESPM.Address.country = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("Country");
        }
        if (!com.sap.stepbystep.ESPM.Address.postalCode.isRemoved()) {
            com.sap.stepbystep.ESPM.Address.postalCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("PostalCode");
        }
        if (!com.sap.stepbystep.ESPM.Customer.city.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.city = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("City");
        }
        if (!com.sap.stepbystep.ESPM.Customer.country.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.country = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Country");
        }
        if (!com.sap.stepbystep.ESPM.Customer.customerID.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.customerID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("CustomerId");
        }
        if (!com.sap.stepbystep.ESPM.Customer.dateOfBirth.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.dateOfBirth = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("DateOfBirth");
        }
        if (!com.sap.stepbystep.ESPM.Customer.emailAddress.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.emailAddress = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("EmailAddress");
        }
        if (!com.sap.stepbystep.ESPM.Customer.firstName.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.firstName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("FirstName");
        }
        if (!com.sap.stepbystep.ESPM.Customer.houseNumber.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.houseNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("HouseNumber");
        }
        if (!com.sap.stepbystep.ESPM.Customer.lastName.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.lastName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("LastName");
        }
        if (!com.sap.stepbystep.ESPM.Customer.phoneNumber.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.phoneNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("PhoneNumber");
        }
        if (!com.sap.stepbystep.ESPM.Customer.postalCode.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.postalCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("PostalCode");
        }
        if (!com.sap.stepbystep.ESPM.Customer.street.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.street = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Street");
        }
        if (!com.sap.stepbystep.ESPM.Customer.address.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.address = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Address");
        }
        if (!com.sap.stepbystep.ESPM.Customer.updatedTimestamp.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.updatedTimestamp = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("UpdatedTimestamp");
        }
        if (!com.sap.stepbystep.ESPM.Customer.salesOrders.isRemoved()) {
            com.sap.stepbystep.ESPM.Customer.salesOrders = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("SalesOrders");
        }
        if (!com.sap.stepbystep.ESPM.Product.category.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.category = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Category");
        }
        if (!com.sap.stepbystep.ESPM.Product.categoryName.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.categoryName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("CategoryName");
        }
        if (!com.sap.stepbystep.ESPM.Product.currencyCode.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.currencyCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("CurrencyCode");
        }
        if (!com.sap.stepbystep.ESPM.Product.dimensionDepth.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.dimensionDepth = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionDepth");
        }
        if (!com.sap.stepbystep.ESPM.Product.dimensionHeight.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.dimensionHeight = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionHeight");
        }
        if (!com.sap.stepbystep.ESPM.Product.dimensionUnit.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.dimensionUnit = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionUnit");
        }
        if (!com.sap.stepbystep.ESPM.Product.dimensionWidth.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.dimensionWidth = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionWidth");
        }
        if (!com.sap.stepbystep.ESPM.Product.longDescription.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.longDescription = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("LongDescription");
        }
        if (!com.sap.stepbystep.ESPM.Product.name.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.name = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Name");
        }
        if (!com.sap.stepbystep.ESPM.Product.pictureUrl.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.pictureUrl = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("PictureUrl");
        }
        if (!com.sap.stepbystep.ESPM.Product.price.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.price = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Price");
        }
        if (!com.sap.stepbystep.ESPM.Product.productID.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.productID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("ProductId");
        }
        if (!com.sap.stepbystep.ESPM.Product.quantityUnit.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.quantityUnit = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("QuantityUnit");
        }
        if (!com.sap.stepbystep.ESPM.Product.shortDescription.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.shortDescription = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("ShortDescription");
        }
        if (!com.sap.stepbystep.ESPM.Product.supplierID.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.supplierID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("SupplierId");
        }
        if (!com.sap.stepbystep.ESPM.Product.updatedTimestamp.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.updatedTimestamp = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("UpdatedTimestamp");
        }
        if (!com.sap.stepbystep.ESPM.Product.weight.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.weight = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Weight");
        }
        if (!com.sap.stepbystep.ESPM.Product.weightUnit.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.weightUnit = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("WeightUnit");
        }
        if (!com.sap.stepbystep.ESPM.Product.stockDetails.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.stockDetails = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("StockDetails");
        }
        if (!com.sap.stepbystep.ESPM.Product.supplierDetails.isRemoved()) {
            com.sap.stepbystep.ESPM.Product.supplierDetails = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("SupplierDetails");
        }
        if (!com.sap.stepbystep.ESPM.ProductCategory.category.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductCategory.category = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("Category");
        }
        if (!com.sap.stepbystep.ESPM.ProductCategory.categoryName.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductCategory.categoryName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("CategoryName");
        }
        if (!com.sap.stepbystep.ESPM.ProductCategory.mainCategory.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductCategory.mainCategory = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("MainCategory");
        }
        if (!com.sap.stepbystep.ESPM.ProductCategory.mainCategoryName.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductCategory.mainCategoryName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("MainCategoryName");
        }
        if (!com.sap.stepbystep.ESPM.ProductCategory.numberOfProducts.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductCategory.numberOfProducts = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("NumberOfProducts");
        }
        if (!com.sap.stepbystep.ESPM.ProductCategory.updatedTimestamp.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductCategory.updatedTimestamp = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("UpdatedTimestamp");
        }
        if (!com.sap.stepbystep.ESPM.ProductText.id.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductText.id = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Id");
        }
        if (!com.sap.stepbystep.ESPM.ProductText.language.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductText.language = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Language");
        }
        if (!com.sap.stepbystep.ESPM.ProductText.longDescription.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductText.longDescription = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("LongDescription");
        }
        if (!com.sap.stepbystep.ESPM.ProductText.name.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductText.name = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Name");
        }
        if (!com.sap.stepbystep.ESPM.ProductText.productID.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductText.productID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("ProductId");
        }
        if (!com.sap.stepbystep.ESPM.ProductText.shortDescription.isRemoved()) {
            com.sap.stepbystep.ESPM.ProductText.shortDescription = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("ShortDescription");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.currencyCode.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.currencyCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("CurrencyCode");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.grossAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.grossAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("GrossAmount");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.netAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.netAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("NetAmount");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.purchaseOrderID.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.purchaseOrderID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("PurchaseOrderId");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.supplierID.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.supplierID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("SupplierId");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.taxAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.taxAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("TaxAmount");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.items.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.items = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("Items");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderHeader.supplierDetails.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderHeader.supplierDetails = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("SupplierDetails");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.currencyCode.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.currencyCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("CurrencyCode");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.grossAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.grossAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("GrossAmount");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.itemNumber.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.itemNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ItemNumber");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.netAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.netAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("NetAmount");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.productID.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.productID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ProductId");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.purchaseOrderID.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.purchaseOrderID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("PurchaseOrderId");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.quantity.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.quantity = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("Quantity");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.quantityUnit.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.quantityUnit = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("QuantityUnit");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.taxAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.taxAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("TaxAmount");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.header.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.header = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("Header");
        }
        if (!com.sap.stepbystep.ESPM.PurchaseOrderItem.productDetails.isRemoved()) {
            com.sap.stepbystep.ESPM.PurchaseOrderItem.productDetails = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ProductDetails");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.createdAt.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.createdAt = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CreatedAt");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.currencyCode.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.currencyCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CurrencyCode");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.customerID.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.customerID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CustomerId");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.grossAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.grossAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("GrossAmount");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.lifeCycleStatus.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.lifeCycleStatus = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("LifeCycleStatus");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.lifeCycleStatusName.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.lifeCycleStatusName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("LifeCycleStatusName");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.netAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.netAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("NetAmount");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.salesOrderID.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.salesOrderID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("SalesOrderId");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.taxAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.taxAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("TaxAmount");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.items.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.items = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("Items");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderHeader.customerDetails.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderHeader.customerDetails = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CustomerDetails");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.currencyCode.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.currencyCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("CurrencyCode");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.deliveryDate.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.deliveryDate = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("DeliveryDate");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.grossAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.grossAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("GrossAmount");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.itemNumber.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.itemNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("ItemNumber");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.netAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.netAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("NetAmount");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.productID.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.productID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("ProductId");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.quantity.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.quantity = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("Quantity");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.quantityUnit.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.quantityUnit = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("QuantityUnit");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.salesOrderID.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.salesOrderID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("SalesOrderId");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.taxAmount.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.taxAmount = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("TaxAmount");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.header.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.header = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("Header");
        }
        if (!com.sap.stepbystep.ESPM.SalesOrderItem.productDetails.isRemoved()) {
            com.sap.stepbystep.ESPM.SalesOrderItem.productDetails = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("ProductDetails");
        }
        if (!com.sap.stepbystep.ESPM.Stock.lotSize.isRemoved()) {
            com.sap.stepbystep.ESPM.Stock.lotSize = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("LotSize");
        }
        if (!com.sap.stepbystep.ESPM.Stock.minStock.isRemoved()) {
            com.sap.stepbystep.ESPM.Stock.minStock = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("MinStock");
        }
        if (!com.sap.stepbystep.ESPM.Stock.productID.isRemoved()) {
            com.sap.stepbystep.ESPM.Stock.productID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("ProductId");
        }
        if (!com.sap.stepbystep.ESPM.Stock.quantity.isRemoved()) {
            com.sap.stepbystep.ESPM.Stock.quantity = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("Quantity");
        }
        if (!com.sap.stepbystep.ESPM.Stock.quantityLessMin.isRemoved()) {
            com.sap.stepbystep.ESPM.Stock.quantityLessMin = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("QuantityLessMin");
        }
        if (!com.sap.stepbystep.ESPM.Stock.updatedTimestamp.isRemoved()) {
            com.sap.stepbystep.ESPM.Stock.updatedTimestamp = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("UpdatedTimestamp");
        }
        if (!com.sap.stepbystep.ESPM.Stock.productDetails.isRemoved()) {
            com.sap.stepbystep.ESPM.Stock.productDetails = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("ProductDetails");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.city.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.city = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("City");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.country.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.country = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Country");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.emailAddress.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.emailAddress = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("EmailAddress");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.houseNumber.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.houseNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("HouseNumber");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.phoneNumber.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.phoneNumber = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("PhoneNumber");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.postalCode.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.postalCode = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("PostalCode");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.street.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.street = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Street");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.supplierID.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.supplierID = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("SupplierId");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.supplierName.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.supplierName = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("SupplierName");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.address.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.address = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Address");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.updatedTimestamp.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.updatedTimestamp = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("UpdatedTimestamp");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.products.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.products = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Products");
        }
        if (!com.sap.stepbystep.ESPM.Supplier.purchaseOrders.isRemoved()) {
            com.sap.stepbystep.ESPM.Supplier.purchaseOrders = com.sap.stepbystep.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("PurchaseOrders");
        }
    }
}

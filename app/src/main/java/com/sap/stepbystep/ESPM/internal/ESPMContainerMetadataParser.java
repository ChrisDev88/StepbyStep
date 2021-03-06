//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.1.1, on Sun May 26 21:53:19 CEST 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.sap.stepbystep.ESPM.internal;

public abstract class ESPMContainerMetadataParser {
    public static final int options = (com.sap.cloud.mobile.odata.csdl.CsdlOption.ALLOW_CASE_CONFLICTS | com.sap.cloud.mobile.odata.csdl.CsdlOption.DISABLE_FACET_WARNINGS | com.sap.cloud.mobile.odata.csdl.CsdlOption.DISABLE_NAME_VALIDATION | com.sap.cloud.mobile.odata.csdl.CsdlOption.PROCESS_MIXED_VERSIONS | com.sap.cloud.mobile.odata.csdl.CsdlOption.RETAIN_ORIGINAL_TEXT | com.sap.cloud.mobile.odata.csdl.CsdlOption.IGNORE_UNDEFINED_TERMS);

    public static final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.csdl.CsdlDocument parsed = com.sap.stepbystep.ESPM.internal.ESPMContainerMetadataParser.parse();

    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.csdl.CsdlDocument parse() {
        final com.sap.cloud.mobile.odata.csdl.CsdlParser parser = new com.sap.cloud.mobile.odata.csdl.CsdlParser();
        parser.setLogWarnings(false);
        parser.setCsdlOptions(com.sap.stepbystep.ESPM.internal.ESPMContainerMetadataParser.options);
        final com.sap.cloud.mobile.odata.csdl.CsdlDocument metadata = parser.parseInProxy(com.sap.stepbystep.ESPM.internal.ESPMContainerMetadataText.XML, "ESPM");
        metadata.setProxyVersion("18.11.0-9ee469-20181119");
        return metadata;
    }
}

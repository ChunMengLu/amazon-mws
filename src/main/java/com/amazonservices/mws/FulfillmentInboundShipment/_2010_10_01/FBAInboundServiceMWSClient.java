/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * FBA Inbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01;

import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model.*;
import com.amazonservices.mws.client.*;

public class FBAInboundServiceMWSClient implements FBAInboundServiceMWS {

    private static final String libraryName = "FBAInboundServiceMWS";

    private static final String libraryVersion = "2016-10-05";

    protected String servicePath;

    protected final MwsConnection connection;

    public FBAInboundServiceMWSClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInboundServiceMWSConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    public FBAInboundServiceMWSClient(
            String accessKey,
            String secretKey,
            FBAInboundServiceMWSConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    public FBAInboundServiceMWSClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new FBAInboundServiceMWSConfig());
    }

    public ConfirmPreorderResponse confirmPreorder(ConfirmPreorderRequest request) {
        return connection.call(
            new RequestType("ConfirmPreorder", ConfirmPreorderResponse.class, servicePath),
            request);
    }

    public ConfirmTransportRequestResponse confirmTransportRequest(ConfirmTransportInputRequest request) {
        return connection.call(
            new RequestType("ConfirmTransportRequest", ConfirmTransportRequestResponse.class, servicePath),
            request);
    }

    public CreateInboundShipmentResponse createInboundShipment(CreateInboundShipmentRequest request) {
        return connection.call(
            new RequestType("CreateInboundShipment", CreateInboundShipmentResponse.class, servicePath),
            request);
    }

    public CreateInboundShipmentPlanResponse createInboundShipmentPlan(CreateInboundShipmentPlanRequest request) {
        return connection.call(
            new RequestType("CreateInboundShipmentPlan", CreateInboundShipmentPlanResponse.class, servicePath),
            request);
    }

    public EstimateTransportRequestResponse estimateTransportRequest(EstimateTransportInputRequest request) {
        return connection.call(
            new RequestType("EstimateTransportRequest", EstimateTransportRequestResponse.class, servicePath),
            request);
    }

    public GetBillOfLadingResponse getBillOfLading(GetBillOfLadingRequest request) {
        return connection.call(
            new RequestType("GetBillOfLading", GetBillOfLadingResponse.class, servicePath),
            request);
    }

    public GetInboundGuidanceForASINResponse getInboundGuidanceForASIN(GetInboundGuidanceForASINRequest request) {
        return connection.call(
            new RequestType("GetInboundGuidanceForASIN", GetInboundGuidanceForASINResponse.class, servicePath),
            request);
    }

    public GetInboundGuidanceForSKUResponse getInboundGuidanceForSKU(GetInboundGuidanceForSKURequest request) {
        return connection.call(
            new RequestType("GetInboundGuidanceForSKU", GetInboundGuidanceForSKUResponse.class, servicePath),
            request);
    }

    public GetPackageLabelsResponse getPackageLabels(GetPackageLabelsRequest request) {
        return connection.call(
            new RequestType("GetPackageLabels", GetPackageLabelsResponse.class, servicePath),
            request);
    }

    public GetPalletLabelsResponse getPalletLabels(GetPalletLabelsRequest request) {
        return connection.call(
            new RequestType("GetPalletLabels", GetPalletLabelsResponse.class, servicePath),
            request);
    }

    public GetPreorderInfoResponse getPreorderInfo(GetPreorderInfoRequest request) {
        return connection.call(
            new RequestType("GetPreorderInfo", GetPreorderInfoResponse.class, servicePath),
            request);
    }

    public GetPrepInstructionsForASINResponse getPrepInstructionsForASIN(GetPrepInstructionsForASINRequest request) {
        return connection.call(
            new RequestType("GetPrepInstructionsForASIN", GetPrepInstructionsForASINResponse.class, servicePath),
            request);
    }

    public GetPrepInstructionsForSKUResponse getPrepInstructionsForSKU(GetPrepInstructionsForSKURequest request) {
        return connection.call(
            new RequestType("GetPrepInstructionsForSKU", GetPrepInstructionsForSKUResponse.class, servicePath),
            request);
    }

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public GetTransportContentResponse getTransportContent(GetTransportContentRequest request) {
        return connection.call(
            new RequestType("GetTransportContent", GetTransportContentResponse.class, servicePath),
            request);
    }

    public GetUniquePackageLabelsResponse getUniquePackageLabels(GetUniquePackageLabelsRequest request) {
        return connection.call(
            new RequestType("GetUniquePackageLabels", GetUniquePackageLabelsResponse.class, servicePath),
            request);
    }

    public ListInboundShipmentItemsResponse listInboundShipmentItems(ListInboundShipmentItemsRequest request) {
        return connection.call(
            new RequestType("ListInboundShipmentItems", ListInboundShipmentItemsResponse.class, servicePath),
            request);
    }

    public ListInboundShipmentItemsByNextTokenResponse listInboundShipmentItemsByNextToken(ListInboundShipmentItemsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListInboundShipmentItemsByNextToken", ListInboundShipmentItemsByNextTokenResponse.class, servicePath),
            request);
    }

    public ListInboundShipmentsResponse listInboundShipments(ListInboundShipmentsRequest request) {
        return connection.call(
            new RequestType("ListInboundShipments", ListInboundShipmentsResponse.class, servicePath),
            request);
    }

    public ListInboundShipmentsByNextTokenResponse listInboundShipmentsByNextToken(ListInboundShipmentsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListInboundShipmentsByNextToken", ListInboundShipmentsByNextTokenResponse.class, servicePath),
            request);
    }

    public PutTransportContentResponse putTransportContent(PutTransportContentRequest request) {
        return connection.call(
            new RequestType("PutTransportContent", PutTransportContentResponse.class, servicePath),
            request);
    }

    public UpdateInboundShipmentResponse updateInboundShipment(UpdateInboundShipmentRequest request) {
        return connection.call(
            new RequestType("UpdateInboundShipment", UpdateInboundShipmentResponse.class, servicePath),
            request);
    }

    public VoidTransportRequestResponse voidTransportRequest(VoidTransportInputRequest request) {
        return connection.call(
            new RequestType("VoidTransportRequest", VoidTransportRequestResponse.class, servicePath),
            request);
    }

    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new FBAInboundServiceMWSException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}

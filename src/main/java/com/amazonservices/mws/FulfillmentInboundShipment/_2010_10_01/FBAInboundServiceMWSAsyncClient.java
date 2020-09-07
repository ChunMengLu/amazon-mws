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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class FBAInboundServiceMWSAsyncClient extends FBAInboundServiceMWSClient implements FBAInboundServiceMWSAsync {

    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInboundServiceMWSConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInboundServiceMWSConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            FBAInboundServiceMWSConfig config) {
        super(accessKey, secretKey, config);
    }

    public FBAInboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<ConfirmPreorderResponse> confirmPreorderAsync(
        ConfirmPreorderRequest request) {
        return connection.callAsync(
            new RequestType("ConfirmPreorder", ConfirmPreorderResponse.class, servicePath),
            request);
    }

    public Future<ConfirmTransportRequestResponse> confirmTransportRequestAsync(
        ConfirmTransportInputRequest request) {
        return connection.callAsync(
            new RequestType("ConfirmTransportRequest", ConfirmTransportRequestResponse.class, servicePath),
            request);
    }

    public Future<CreateInboundShipmentResponse> createInboundShipmentAsync(
        CreateInboundShipmentRequest request) {
        return connection.callAsync(
            new RequestType("CreateInboundShipment", CreateInboundShipmentResponse.class, servicePath),
            request);
    }

    public Future<CreateInboundShipmentPlanResponse> createInboundShipmentPlanAsync(
        CreateInboundShipmentPlanRequest request) {
        return connection.callAsync(
            new RequestType("CreateInboundShipmentPlan", CreateInboundShipmentPlanResponse.class, servicePath),
            request);
    }

    public Future<EstimateTransportRequestResponse> estimateTransportRequestAsync(
        EstimateTransportInputRequest request) {
        return connection.callAsync(
            new RequestType("EstimateTransportRequest", EstimateTransportRequestResponse.class, servicePath),
            request);
    }

    public Future<GetBillOfLadingResponse> getBillOfLadingAsync(
        GetBillOfLadingRequest request) {
        return connection.callAsync(
            new RequestType("GetBillOfLading", GetBillOfLadingResponse.class, servicePath),
            request);
    }

    public Future<GetInboundGuidanceForASINResponse> getInboundGuidanceForASINAsync(
        GetInboundGuidanceForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetInboundGuidanceForASIN", GetInboundGuidanceForASINResponse.class, servicePath),
            request);
    }

    public Future<GetInboundGuidanceForSKUResponse> getInboundGuidanceForSKUAsync(
        GetInboundGuidanceForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetInboundGuidanceForSKU", GetInboundGuidanceForSKUResponse.class, servicePath),
            request);
    }

    public Future<GetPackageLabelsResponse> getPackageLabelsAsync(
        GetPackageLabelsRequest request) {
        return connection.callAsync(
            new RequestType("GetPackageLabels", GetPackageLabelsResponse.class, servicePath),
            request);
    }

    public Future<GetPalletLabelsResponse> getPalletLabelsAsync(
        GetPalletLabelsRequest request) {
        return connection.callAsync(
            new RequestType("GetPalletLabels", GetPalletLabelsResponse.class, servicePath),
            request);
    }

    public Future<GetPreorderInfoResponse> getPreorderInfoAsync(
        GetPreorderInfoRequest request) {
        return connection.callAsync(
            new RequestType("GetPreorderInfo", GetPreorderInfoResponse.class, servicePath),
            request);
    }

    public Future<GetPrepInstructionsForASINResponse> getPrepInstructionsForASINAsync(
        GetPrepInstructionsForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetPrepInstructionsForASIN", GetPrepInstructionsForASINResponse.class, servicePath),
            request);
    }

    public Future<GetPrepInstructionsForSKUResponse> getPrepInstructionsForSKUAsync(
        GetPrepInstructionsForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetPrepInstructionsForSKU", GetPrepInstructionsForSKUResponse.class, servicePath),
            request);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public Future<GetTransportContentResponse> getTransportContentAsync(
        GetTransportContentRequest request) {
        return connection.callAsync(
            new RequestType("GetTransportContent", GetTransportContentResponse.class, servicePath),
            request);
    }

    public Future<GetUniquePackageLabelsResponse> getUniquePackageLabelsAsync(
        GetUniquePackageLabelsRequest request) {
        return connection.callAsync(
            new RequestType("GetUniquePackageLabels", GetUniquePackageLabelsResponse.class, servicePath),
            request);
    }

    public Future<ListInboundShipmentItemsResponse> listInboundShipmentItemsAsync(
        ListInboundShipmentItemsRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipmentItems", ListInboundShipmentItemsResponse.class, servicePath),
            request);
    }

    public Future<ListInboundShipmentItemsByNextTokenResponse> listInboundShipmentItemsByNextTokenAsync(
        ListInboundShipmentItemsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipmentItemsByNextToken", ListInboundShipmentItemsByNextTokenResponse.class, servicePath),
            request);
    }

    public Future<ListInboundShipmentsResponse> listInboundShipmentsAsync(
        ListInboundShipmentsRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipments", ListInboundShipmentsResponse.class, servicePath),
            request);
    }

    public Future<ListInboundShipmentsByNextTokenResponse> listInboundShipmentsByNextTokenAsync(
        ListInboundShipmentsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListInboundShipmentsByNextToken", ListInboundShipmentsByNextTokenResponse.class, servicePath),
            request);
    }

    public Future<PutTransportContentResponse> putTransportContentAsync(
        PutTransportContentRequest request) {
        return connection.callAsync(
            new RequestType("PutTransportContent", PutTransportContentResponse.class, servicePath),
            request);
    }

    public Future<UpdateInboundShipmentResponse> updateInboundShipmentAsync(
        UpdateInboundShipmentRequest request) {
        return connection.callAsync(
            new RequestType("UpdateInboundShipment", UpdateInboundShipmentResponse.class, servicePath),
            request);
    }

    public Future<VoidTransportRequestResponse> voidTransportRequestAsync(
        VoidTransportInputRequest request) {
        return connection.callAsync(
            new RequestType("VoidTransportRequest", VoidTransportRequestResponse.class, servicePath),
            request);
    }


}

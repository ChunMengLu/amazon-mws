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
 * FBA Outbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-10-19
 * Generated: Wed Oct 19 08:37:51 PDT 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.samples;

import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSAsync;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSAsyncClient;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSException;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for GetFulfillmentPreview. */
public class GetFulfillmentPreviewAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeGetFulfillmentPreview(
            FBAOutboundServiceMWSAsync client,
            List<GetFulfillmentPreviewRequest> requestList) {
        // Call the service async.
        List<Future<GetFulfillmentPreviewResponse>> futureList =
            new ArrayList<Future<GetFulfillmentPreviewResponse>>();
        for (GetFulfillmentPreviewRequest request : requestList) {
            Future<GetFulfillmentPreviewResponse> future =
                client.getFulfillmentPreviewAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<GetFulfillmentPreviewResponse> future : futureList) {
            Object xresponse;
            try {
                GetFulfillmentPreviewResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof FBAOutboundServiceMWSException) {
                    // Exception properties are important for diagnostics.
                    FBAOutboundServiceMWSException ex =
                        (FBAOutboundServiceMWSException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        FBAOutboundServiceMWSAsyncClient client = FBAOutboundServiceMWSSampleConfig.getAsyncClient();

        // Create a request list.
        List<GetFulfillmentPreviewRequest> requestList = new ArrayList<GetFulfillmentPreviewRequest>();
        GetFulfillmentPreviewRequest request = new GetFulfillmentPreviewRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String marketplace = "example";
        request.setMarketplace(marketplace);
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        Address address = new Address();
        request.setAddress(address);
        GetFulfillmentPreviewItemList items = new GetFulfillmentPreviewItemList();
        request.setItems(items);
        ShippingSpeedCategoryList shippingSpeedCategories = new ShippingSpeedCategoryList();
        request.setShippingSpeedCategories(shippingSpeedCategories);
        Boolean includeCODFulfillmentPreview = Boolean.valueOf(true);
        request.setIncludeCODFulfillmentPreview(includeCODFulfillmentPreview);
        Boolean includeDeliveryWindows = Boolean.valueOf(true);
        request.setIncludeDeliveryWindows(includeDeliveryWindows);
        requestList.add(request);

        // Make the calls.
        GetFulfillmentPreviewAsyncSample.invokeGetFulfillmentPreview(client, requestList);

    }

}

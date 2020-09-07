/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Merchant Fulfillment Service
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.samples;

import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentServiceAsync;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentServiceAsyncClient;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentServiceException;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for CreateShipment. */
public class CreateShipmentAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeCreateShipment(
            MWSMerchantFulfillmentServiceAsync client,
            List<CreateShipmentRequest> requestList) {
        // Call the service async.
        List<Future<CreateShipmentResponse>> futureList =
            new ArrayList<Future<CreateShipmentResponse>>();
        for (CreateShipmentRequest request : requestList) {
            Future<CreateShipmentResponse> future =
                client.createShipmentAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<CreateShipmentResponse> future : futureList) {
            Object xresponse;
            try {
                CreateShipmentResponse response = future.get();
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
                if (cause instanceof MWSMerchantFulfillmentServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSMerchantFulfillmentServiceException ex =
                        (MWSMerchantFulfillmentServiceException)cause;
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
        MWSMerchantFulfillmentServiceAsyncClient client = MWSMerchantFulfillmentServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<CreateShipmentRequest> requestList = new ArrayList<CreateShipmentRequest>();
        CreateShipmentRequest request = new CreateShipmentRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        ShipmentRequestDetails shipmentRequestDetails = new ShipmentRequestDetails();
        request.setShipmentRequestDetails(shipmentRequestDetails);
        String shippingServiceId = "example";
        request.setShippingServiceId(shippingServiceId);
        String shippingServiceOfferId = "example";
        request.setShippingServiceOfferId(shippingServiceOfferId);
        String hazmatType = "example";
        request.setHazmatType(hazmatType);
        LabelFormatOptionRequest labelFormatOption = new LabelFormatOptionRequest();
        request.setLabelFormatOption(labelFormatOption);
        List<AdditionalSellerInputs> shipmentLevelSellerInputsList = new ArrayList<AdditionalSellerInputs>();
        request.setShipmentLevelSellerInputsList(shipmentLevelSellerInputsList);
        requestList.add(request);

        // Make the calls.
        CreateShipmentAsyncSample.invokeCreateShipment(client, requestList);

    }

}

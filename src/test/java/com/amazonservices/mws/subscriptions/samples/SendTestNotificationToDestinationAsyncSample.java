/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Subscriptions Service
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.samples;

import com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceAsync;
import com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceAsyncClient;
import com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceException;
import com.amazonservices.mws.subscriptions.model.Destination;
import com.amazonservices.mws.subscriptions.model.ResponseHeaderMetadata;
import com.amazonservices.mws.subscriptions.model.SendTestNotificationToDestinationInput;
import com.amazonservices.mws.subscriptions.model.SendTestNotificationToDestinationResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for SendTestNotificationToDestination. */
public class SendTestNotificationToDestinationAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeSendTestNotificationToDestination(
            MWSSubscriptionsServiceAsync client,
            List<SendTestNotificationToDestinationInput> requestList) {
        // Call the service async.
        List<Future<SendTestNotificationToDestinationResponse>> futureList =
            new ArrayList<Future<SendTestNotificationToDestinationResponse>>();
        for (SendTestNotificationToDestinationInput request : requestList) {
            Future<SendTestNotificationToDestinationResponse> future =
                client.sendTestNotificationToDestinationAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<SendTestNotificationToDestinationResponse> future : futureList) {
            Object xresponse;
            try {
                SendTestNotificationToDestinationResponse response = future.get();
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
                if (cause instanceof MWSSubscriptionsServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSSubscriptionsServiceException ex =
                        (MWSSubscriptionsServiceException)cause;
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
        MWSSubscriptionsServiceAsyncClient client = MWSSubscriptionsServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<SendTestNotificationToDestinationInput> requestList = new ArrayList<SendTestNotificationToDestinationInput>();
        SendTestNotificationToDestinationInput request = new SendTestNotificationToDestinationInput();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        Destination destination = new Destination();
        request.setDestination(destination);
        requestList.add(request);

        // Make the calls.
        SendTestNotificationToDestinationAsyncSample.invokeSendTestNotificationToDestination(client, requestList);

    }

}

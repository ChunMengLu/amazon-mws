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

import com.amazonservices.mws.subscriptions.MWSSubscriptionsService;
import com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceClient;
import com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceException;
import com.amazonservices.mws.subscriptions.model.ListRegisteredDestinationsInput;
import com.amazonservices.mws.subscriptions.model.ListRegisteredDestinationsResponse;
import com.amazonservices.mws.subscriptions.model.ResponseHeaderMetadata;


/** Sample call for ListRegisteredDestinations. */
public class ListRegisteredDestinationsSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static ListRegisteredDestinationsResponse invokeListRegisteredDestinations(
            MWSSubscriptionsService client,
            ListRegisteredDestinationsInput request) {
        try {
            // Call the service.
            ListRegisteredDestinationsResponse response = client.listRegisteredDestinations(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MWSSubscriptionsServiceException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if(rhmd != null) {
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
            }
            System.out.println("Message: "+ex.getMessage());
            System.out.println("StatusCode: "+ex.getStatusCode());
            System.out.println("ErrorCode: "+ex.getErrorCode());
            System.out.println("ErrorType: "+ex.getErrorType());
            throw ex;
        }
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        // Make sure you've set the variables in MWSSubscriptionsServiceSampleConfig.
        MWSSubscriptionsServiceClient client = MWSSubscriptionsServiceSampleConfig.getClient();

        // Create a request.
        ListRegisteredDestinationsInput request = new ListRegisteredDestinationsInput();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);

        // Make the call.
        ListRegisteredDestinationsSample.invokeListRegisteredDestinations(client, request);

    }

}

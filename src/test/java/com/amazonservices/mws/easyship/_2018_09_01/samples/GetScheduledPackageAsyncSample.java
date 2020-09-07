/*******************************************************************************
 * Copyright 2009-2018 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Easy Ship Section Service
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.samples;

import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionServiceAsync;
import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionServiceAsyncClient;
import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionServiceException;
import com.amazonservices.mws.easyship._2018_09_01.model.GetScheduledPackageRequest;
import com.amazonservices.mws.easyship._2018_09_01.model.GetScheduledPackageResponse;
import com.amazonservices.mws.easyship._2018_09_01.model.ResponseHeaderMetadata;
import com.amazonservices.mws.easyship._2018_09_01.model.ScheduledPackageId;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for GetScheduledPackage. */
public class GetScheduledPackageAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeGetScheduledPackage(
            MWSEasyShipSectionServiceAsync client,
            List<GetScheduledPackageRequest> requestList) {
        // Call the service async.
        List<Future<GetScheduledPackageResponse>> futureList =
            new ArrayList<Future<GetScheduledPackageResponse>>();
        for (GetScheduledPackageRequest request : requestList) {
            Future<GetScheduledPackageResponse> future =
                client.getScheduledPackageAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<GetScheduledPackageResponse> future : futureList) {
            Object xresponse;
            try {
                GetScheduledPackageResponse response = future.get();
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
                if (cause instanceof MWSEasyShipSectionServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSEasyShipSectionServiceException ex =
                        (MWSEasyShipSectionServiceException)cause;
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
        MWSEasyShipSectionServiceAsyncClient client = MWSEasyShipSectionServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<GetScheduledPackageRequest> requestList = new ArrayList<GetScheduledPackageRequest>();
        GetScheduledPackageRequest request = new GetScheduledPackageRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        ScheduledPackageId scheduledPackageId = new ScheduledPackageId();
        request.setScheduledPackageId(scheduledPackageId);
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        requestList.add(request);

        // Make the calls.
        GetScheduledPackageAsyncSample.invokeGetScheduledPackage(client, requestList);

    }

}

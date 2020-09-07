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
 * MWS Recommendations Section Service
 * API Version: 2013-04-01
 * Library Version: 2014-10-01
 * Generated: Fri Oct 10 17:55:39 GMT 2014
 */
package com.amazon.mws.recommendations.samples;

import com.amazon.mws.recommendations.MWSRecommendationsSectionServiceAsync;
import com.amazon.mws.recommendations.MWSRecommendationsSectionServiceAsyncClient;
import com.amazon.mws.recommendations.MWSRecommendationsSectionServiceException;
import com.amazon.mws.recommendations.model.ListRecommendationsByNextTokenRequest;
import com.amazon.mws.recommendations.model.ListRecommendationsByNextTokenResponse;
import com.amazon.mws.recommendations.model.ResponseHeaderMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for ListRecommendationsByNextToken. */
public class ListRecommendationsByNextTokenAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeListRecommendationsByNextToken(
            MWSRecommendationsSectionServiceAsync client,
            List<ListRecommendationsByNextTokenRequest> requestList) {
        // Call the service async.
        List<Future<ListRecommendationsByNextTokenResponse>> futureList =
            new ArrayList<Future<ListRecommendationsByNextTokenResponse>>();
        for (ListRecommendationsByNextTokenRequest request : requestList) {
            Future<ListRecommendationsByNextTokenResponse> future =
                client.listRecommendationsByNextTokenAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<ListRecommendationsByNextTokenResponse> future : futureList) {
            Object xresponse;
            try {
                ListRecommendationsByNextTokenResponse response = future.get();
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
                if (cause instanceof MWSRecommendationsSectionServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSRecommendationsSectionServiceException ex =
                        (MWSRecommendationsSectionServiceException)cause;
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
        MWSRecommendationsSectionServiceAsyncClient client = MWSRecommendationsSectionServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<ListRecommendationsByNextTokenRequest> requestList = new ArrayList<ListRecommendationsByNextTokenRequest>();
        ListRecommendationsByNextTokenRequest request = new ListRecommendationsByNextTokenRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String nextToken = "example";
        request.setNextToken(nextToken);
        requestList.add(request);

        // Make the calls.
        ListRecommendationsByNextTokenAsyncSample.invokeListRecommendationsByNextToken(client, requestList);

    }

}

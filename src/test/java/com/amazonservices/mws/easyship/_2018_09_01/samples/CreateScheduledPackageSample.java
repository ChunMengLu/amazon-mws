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

import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionService;
import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionServiceClient;
import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionServiceException;
import com.amazonservices.mws.easyship._2018_09_01.model.CreateScheduledPackageRequest;
import com.amazonservices.mws.easyship._2018_09_01.model.CreateScheduledPackageResponse;
import com.amazonservices.mws.easyship._2018_09_01.model.PackageRequestDetails;
import com.amazonservices.mws.easyship._2018_09_01.model.ResponseHeaderMetadata;


/** Sample call for CreateScheduledPackage. */
public class CreateScheduledPackageSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static CreateScheduledPackageResponse invokeCreateScheduledPackage(
            MWSEasyShipSectionService client,
            CreateScheduledPackageRequest request) {
        try {
            // Call the service.
            CreateScheduledPackageResponse response = client.createScheduledPackage(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MWSEasyShipSectionServiceException ex) {
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
        // Make sure you've set the variables in MWSEasyShipSectionServiceSampleConfig.
        MWSEasyShipSectionServiceClient client = MWSEasyShipSectionServiceSampleConfig.getClient();

        // Create a request.
        CreateScheduledPackageRequest request = new CreateScheduledPackageRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String amazonOrderId = "example";
        request.setAmazonOrderId(amazonOrderId);
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        PackageRequestDetails packageRequestDetails = new PackageRequestDetails();
        request.setPackageRequestDetails(packageRequestDetails);

        // Make the call.
        CreateScheduledPackageSample.invokeCreateScheduledPackage(client, request);

    }

}

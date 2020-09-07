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

import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentService;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentServiceClient;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentServiceException;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.Address;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.GetAdditionalSellerInputsRequest;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.GetAdditionalSellerInputsResponse;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.ResponseHeaderMetadata;


/** Sample call for GetAdditionalSellerInputs. */
public class GetAdditionalSellerInputsSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static GetAdditionalSellerInputsResponse invokeGetAdditionalSellerInputs(
            MWSMerchantFulfillmentService client,
            GetAdditionalSellerInputsRequest request) {
        try {
            // Call the service.
            GetAdditionalSellerInputsResponse response = client.getAdditionalSellerInputs(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MWSMerchantFulfillmentServiceException ex) {
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
        // Make sure you've set the variables in MWSMerchantFulfillmentServiceSampleConfig.
        MWSMerchantFulfillmentServiceClient client = MWSMerchantFulfillmentServiceSampleConfig.getClient();

        // Create a request.
        GetAdditionalSellerInputsRequest request = new GetAdditionalSellerInputsRequest();
        String orderId = "example";
        request.setOrderId(orderId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String sellerId = "example";
        request.setSellerId(sellerId);
        String shippingServiceId = "example";
        request.setShippingServiceId(shippingServiceId);
        Address shipFromAddress = new Address();
        request.setShipFromAddress(shipFromAddress);

        // Make the call.
        GetAdditionalSellerInputsSample.invokeGetAdditionalSellerInputs(client, request);

    }

}

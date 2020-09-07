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

import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWS;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSClient;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSException;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.*;
import com.amazonservices.mws.client.MwsUtl;

import javax.xml.datatype.XMLGregorianCalendar;


/** Sample call for CreateFulfillmentOrder. */
public class CreateFulfillmentOrderSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static CreateFulfillmentOrderResponse invokeCreateFulfillmentOrder(
            FBAOutboundServiceMWS client,
            CreateFulfillmentOrderRequest request) {
        try {
            // Call the service.
            CreateFulfillmentOrderResponse response = client.createFulfillmentOrder(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (FBAOutboundServiceMWSException ex) {
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
        // Make sure you've set the variables in FBAOutboundServiceMWSSampleConfig.
        FBAOutboundServiceMWSClient client = FBAOutboundServiceMWSSampleConfig.getClient();

        // Create a request.
        CreateFulfillmentOrderRequest request = new CreateFulfillmentOrderRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String marketplace = "example";
        request.setMarketplace(marketplace);
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        String sellerFulfillmentOrderId = "example";
        request.setSellerFulfillmentOrderId(sellerFulfillmentOrderId);
        String displayableOrderId = "example";
        request.setDisplayableOrderId(displayableOrderId);
        XMLGregorianCalendar displayableOrderDateTime = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setDisplayableOrderDateTime(displayableOrderDateTime);
        String displayableOrderComment = "example";
        request.setDisplayableOrderComment(displayableOrderComment);
        String shippingSpeedCategory = "example";
        request.setShippingSpeedCategory(shippingSpeedCategory);
        DeliveryWindow deliveryWindow = new DeliveryWindow();
        request.setDeliveryWindow(deliveryWindow);
        Address destinationAddress = new Address();
        request.setDestinationAddress(destinationAddress);
        String fulfillmentAction = "example";
        request.setFulfillmentAction(fulfillmentAction);
        String fulfillmentPolicy = "example";
        request.setFulfillmentPolicy(fulfillmentPolicy);
        String fulfillmentMethod = "example";
        request.setFulfillmentMethod(fulfillmentMethod);
        CODSettings codSettings = new CODSettings();
        request.setCODSettings(codSettings);
        String shipFromCountryCode = "example";
        request.setShipFromCountryCode(shipFromCountryCode);
        NotificationEmailList notificationEmailList = new NotificationEmailList();
        request.setNotificationEmailList(notificationEmailList);
        CreateFulfillmentOrderItemList items = new CreateFulfillmentOrderItemList();
        request.setItems(items);

        // Make the call.
        CreateFulfillmentOrderSample.invokeCreateFulfillmentOrder(client, request);

    }

}

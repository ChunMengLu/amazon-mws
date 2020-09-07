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
package com.amazonservices.mws.subscriptions;

import com.amazonservices.mws.subscriptions.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MWSSubscriptionsServiceAsyncClient extends MWSSubscriptionsServiceClient implements MWSSubscriptionsServiceAsync {

    public MWSSubscriptionsServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSSubscriptionsServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public MWSSubscriptionsServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSSubscriptionsServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public MWSSubscriptionsServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSSubscriptionsServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    public MWSSubscriptionsServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<CreateSubscriptionResponse> createSubscriptionAsync(
        CreateSubscriptionInput request) {
        return connection.callAsync(
            new RequestType("CreateSubscription", CreateSubscriptionResponse.class, servicePath),
            request);
    }

    public Future<DeleteSubscriptionResponse> deleteSubscriptionAsync(
        DeleteSubscriptionInput request) {
        return connection.callAsync(
            new RequestType("DeleteSubscription", DeleteSubscriptionResponse.class, servicePath),
            request);
    }

    public Future<DeregisterDestinationResponse> deregisterDestinationAsync(
        DeregisterDestinationInput request) {
        return connection.callAsync(
            new RequestType("DeregisterDestination", DeregisterDestinationResponse.class, servicePath),
            request);
    }

    public Future<GetSubscriptionResponse> getSubscriptionAsync(
        GetSubscriptionInput request) {
        return connection.callAsync(
            new RequestType("GetSubscription", GetSubscriptionResponse.class, servicePath),
            request);
    }

    public Future<ListRegisteredDestinationsResponse> listRegisteredDestinationsAsync(
        ListRegisteredDestinationsInput request) {
        return connection.callAsync(
            new RequestType("ListRegisteredDestinations", ListRegisteredDestinationsResponse.class, servicePath),
            request);
    }

    public Future<ListSubscriptionsResponse> listSubscriptionsAsync(
        ListSubscriptionsInput request) {
        return connection.callAsync(
            new RequestType("ListSubscriptions", ListSubscriptionsResponse.class, servicePath),
            request);
    }

    public Future<RegisterDestinationResponse> registerDestinationAsync(
        RegisterDestinationInput request) {
        return connection.callAsync(
            new RequestType("RegisterDestination", RegisterDestinationResponse.class, servicePath),
            request);
    }

    public Future<SendTestNotificationToDestinationResponse> sendTestNotificationToDestinationAsync(
        SendTestNotificationToDestinationInput request) {
        return connection.callAsync(
            new RequestType("SendTestNotificationToDestination", SendTestNotificationToDestinationResponse.class, servicePath),
            request);
    }

    public Future<UpdateSubscriptionResponse> updateSubscriptionAsync(
        UpdateSubscriptionInput request) {
        return connection.callAsync(
            new RequestType("UpdateSubscription", UpdateSubscriptionResponse.class, servicePath),
            request);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}

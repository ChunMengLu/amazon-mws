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

import java.util.concurrent.Future;

/**
 * MWS Subscriptions is a service that provides MWS developers the ability to manage subscriptions that tie a destination, such as
 *         an SQS queue, to a Notification type, such as offer listing change on Products,for a seller and marketplace.
 */
public interface MWSSubscriptionsServiceAsync extends MWSSubscriptionsService {

    /**
     * Create Subscription
     *
     * Create a new subscription.
     *
     * @param request
     *           CreateSubscriptionInput request.
     *
     * @return Future<CreateSubscriptionResponse> response.
     */
    Future<CreateSubscriptionResponse> createSubscriptionAsync(
        CreateSubscriptionInput request);

    /**
     * Delete Subscription
     *
     * Delete a subscription.
     *
     * @param request
     *           DeleteSubscriptionInput request.
     *
     * @return Future<DeleteSubscriptionResponse> response.
     */
    Future<DeleteSubscriptionResponse> deleteSubscriptionAsync(
        DeleteSubscriptionInput request);

    /**
     * Deregister Destination
     *
     * Delete a destination.
     *
     * @param request
     *           DeregisterDestinationInput request.
     *
     * @return Future<DeregisterDestinationResponse> response.
     */
    Future<DeregisterDestinationResponse> deregisterDestinationAsync(
        DeregisterDestinationInput request);

    /**
     * Get Subscription
     *
     * Retrieve subscription information.
     *
     * @param request
     *           GetSubscriptionInput request.
     *
     * @return Future<GetSubscriptionResponse> response.
     */
    Future<GetSubscriptionResponse> getSubscriptionAsync(
        GetSubscriptionInput request);

    /**
     * List Registered Destinations
     *
     * List all the destinations for the specified seller created by the developer.
     *
     * @param request
     *           ListRegisteredDestinationsInput request.
     *
     * @return Future<ListRegisteredDestinationsResponse> response.
     */
    Future<ListRegisteredDestinationsResponse> listRegisteredDestinationsAsync(
        ListRegisteredDestinationsInput request);

    /**
     * List Subscriptions
     *
     * List all the subscriptions for the specified seller created by the current developer.
     *
     * @param request
     *           ListSubscriptionsInput request.
     *
     * @return Future<ListSubscriptionsResponse> response.
     */
    Future<ListSubscriptionsResponse> listSubscriptionsAsync(
        ListSubscriptionsInput request);

    /**
     * Register Destination
     *
     * Create a new destination.
     *
     * @param request
     *           RegisterDestinationInput request.
     *
     * @return Future<RegisterDestinationResponse> response.
     */
    Future<RegisterDestinationResponse> registerDestinationAsync(
        RegisterDestinationInput request);

    /**
     * Send Test Notification To Destination
     *
     * Send a test Notification to the specified destination.
     *
     * @param request
     *           SendTestNotificationToDestinationInput request.
     *
     * @return Future<SendTestNotificationToDestinationResponse> response.
     */
    Future<SendTestNotificationToDestinationResponse> sendTestNotificationToDestinationAsync(
        SendTestNotificationToDestinationInput request);

    /**
     * Update Subscription
     *
     * Update a subscription.
     *
     * @param request
     *           UpdateSubscriptionInput request.
     *
     * @return Future<UpdateSubscriptionResponse> response.
     */
    Future<UpdateSubscriptionResponse> updateSubscriptionAsync(
        UpdateSubscriptionInput request);

    /**
     * Get Service Status
     *
     *
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return Future<GetServiceStatusResponse> response.
     */
    Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request);

}

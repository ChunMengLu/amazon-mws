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

/**
 * MWS Subscriptions is a service that provides MWS developers the ability to manage subscriptions that tie a destination, such as
 *         an SQS queue, to a Notification type, such as offer listing change on Products,for a seller and marketplace.
 */
public interface MWSSubscriptionsService {

    /**
     * Create Subscription
     *
     * Create a new subscription.
     *
     * @param request
     *           CreateSubscriptionInput request.
     *
     * @return CreateSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    CreateSubscriptionResponse createSubscription(
        CreateSubscriptionInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * Delete Subscription
     *
     * Delete a subscription.
     *
     * @param request
     *           DeleteSubscriptionInput request.
     *
     * @return DeleteSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    DeleteSubscriptionResponse deleteSubscription(
        DeleteSubscriptionInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * Deregister Destination
     *
     * Delete a destination.
     *
     * @param request
     *           DeregisterDestinationInput request.
     *
     * @return DeregisterDestinationResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    DeregisterDestinationResponse deregisterDestination(
        DeregisterDestinationInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * Get Subscription
     *
     * Retrieve subscription information.
     *
     * @param request
     *           GetSubscriptionInput request.
     *
     * @return GetSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    GetSubscriptionResponse getSubscription(
        GetSubscriptionInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * List Registered Destinations
     *
     * List all the destinations for the specified seller created by the developer.
     *
     * @param request
     *           ListRegisteredDestinationsInput request.
     *
     * @return ListRegisteredDestinationsResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    ListRegisteredDestinationsResponse listRegisteredDestinations(
        ListRegisteredDestinationsInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * List Subscriptions
     *
     * List all the subscriptions for the specified seller created by the current developer.
     *
     * @param request
     *           ListSubscriptionsInput request.
     *
     * @return ListSubscriptionsResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    ListSubscriptionsResponse listSubscriptions(
        ListSubscriptionsInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * Register Destination
     *
     * Create a new destination.
     *
     * @param request
     *           RegisterDestinationInput request.
     *
     * @return RegisterDestinationResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    RegisterDestinationResponse registerDestination(
        RegisterDestinationInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * Send Test Notification To Destination
     *
     * Send a test Notification to the specified destination.
     *
     * @param request
     *           SendTestNotificationToDestinationInput request.
     *
     * @return SendTestNotificationToDestinationResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    SendTestNotificationToDestinationResponse sendTestNotificationToDestination(
        SendTestNotificationToDestinationInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * Update Subscription
     *
     * Update a subscription.
     *
     * @param request
     *           UpdateSubscriptionInput request.
     *
     * @return UpdateSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    UpdateSubscriptionResponse updateSubscription(
        UpdateSubscriptionInput request)
        throws MWSSubscriptionsServiceException;

    /**
     * Get Service Status
     *
     * 
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    GetServiceStatusResponse getServiceStatus(
        GetServiceStatusRequest request)
        throws MWSSubscriptionsServiceException;

}

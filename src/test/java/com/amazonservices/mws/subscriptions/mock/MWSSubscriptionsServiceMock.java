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
package com.amazonservices.mws.subscriptions.mock;


import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;
import com.amazonservices.mws.subscriptions.MWSSubscriptionsService;
import com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceAsync;
import com.amazonservices.mws.subscriptions.MWSSubscriptionsServiceException;
import com.amazonservices.mws.subscriptions.model.*;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * A mock implementation of MWSSubscriptionsService that uses pre-populated set of
 * XML files that serve local data.
 *
 * It simulates responses from the MWS Subscriptions Service service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MWSSubscriptionsServiceMock
        implements MWSSubscriptionsService, MWSSubscriptionsServiceAsync {

    /**
     * Create a future that will immediately return the given response.
     *
     * @param response
     *
     * @return Future
     */
    private <T> Future<T> newFuture(final T response) {
        FutureTask<T> t = new FutureTask<T>(new Callable<T>() {
                @Override
                public T call() {
                    return response;
                }
            });
        t.run();
        return t;
    }

    /**
     * Create a new response object.
     *
     * @param cls
     *
     * @return The object.
     */
    private <T extends MwsObject> T newResponse(
            Class<T> cls) {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream(cls.getSimpleName()+".xml");
            MwsXmlReader reader = new MwsXmlReader(is);
            T obj = cls.newInstance();
            obj.readFragmentFrom(reader);
            ResponseHeaderMetadata rhmd = new ResponseHeaderMetadata(
                "mockRequestId", Arrays.asList("A","B","C"), "mockTimestamp", 0d, 0d, new Date());
            cls.getMethod("setResponseHeaderMetadata", rhmd.getClass()).invoke(obj,  rhmd);
            return obj;
        } catch (Exception e) {
            throw MwsUtl.wrap(e);
        } finally {
            MwsUtl.close(is);
        }
    }

    /**
     * Create Subscription
     * Create a new subscription.
     *
     * @param request
     *           CreateSubscriptionInput request.
     *
     * @return CreateSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(CreateSubscriptionResponse.class);
    }

    /**
    * Create Subscription
    * Create a new subscription.
    *
    * @param request
    *           CreateSubscriptionInput request.
    *
    * @return Future<CreateSubscriptionResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<CreateSubscriptionResponse> createSubscriptionAsync(CreateSubscriptionInput request) {
        return newFuture(createSubscription(request));
    }

    /**
     * Delete Subscription
     * Delete a subscription.
     *
     * @param request
     *           DeleteSubscriptionInput request.
     *
     * @return DeleteSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(DeleteSubscriptionResponse.class);
    }

    /**
    * Delete Subscription
    * Delete a subscription.
    *
    * @param request
    *           DeleteSubscriptionInput request.
    *
    * @return Future<DeleteSubscriptionResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<DeleteSubscriptionResponse> deleteSubscriptionAsync(DeleteSubscriptionInput request) {
        return newFuture(deleteSubscription(request));
    }

    /**
     * Deregister Destination
     * Delete a destination.
     *
     * @param request
     *           DeregisterDestinationInput request.
     *
     * @return DeregisterDestinationResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public DeregisterDestinationResponse deregisterDestination(DeregisterDestinationInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(DeregisterDestinationResponse.class);
    }

    /**
    * Deregister Destination
    * Delete a destination.
    *
    * @param request
    *           DeregisterDestinationInput request.
    *
    * @return Future<DeregisterDestinationResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<DeregisterDestinationResponse> deregisterDestinationAsync(DeregisterDestinationInput request) {
        return newFuture(deregisterDestination(request));
    }

    /**
     * Get Subscription
     * Retrieve subscription information.
     *
     * @param request
     *           GetSubscriptionInput request.
     *
     * @return GetSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public GetSubscriptionResponse getSubscription(GetSubscriptionInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(GetSubscriptionResponse.class);
    }

    /**
    * Get Subscription
    * Retrieve subscription information.
    *
    * @param request
    *           GetSubscriptionInput request.
    *
    * @return Future<GetSubscriptionResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<GetSubscriptionResponse> getSubscriptionAsync(GetSubscriptionInput request) {
        return newFuture(getSubscription(request));
    }

    /**
     * List Registered Destinations
     * List all the destinations for the specified seller created by the developer.
     *
     * @param request
     *           ListRegisteredDestinationsInput request.
     *
     * @return ListRegisteredDestinationsResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public ListRegisteredDestinationsResponse listRegisteredDestinations(ListRegisteredDestinationsInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(ListRegisteredDestinationsResponse.class);
    }

    /**
    * List Registered Destinations
    * List all the destinations for the specified seller created by the developer.
    *
    * @param request
    *           ListRegisteredDestinationsInput request.
    *
    * @return Future<ListRegisteredDestinationsResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<ListRegisteredDestinationsResponse> listRegisteredDestinationsAsync(ListRegisteredDestinationsInput request) {
        return newFuture(listRegisteredDestinations(request));
    }

    /**
     * List Subscriptions
     * List all the subscriptions for the specified seller created by the current developer.
     *
     * @param request
     *           ListSubscriptionsInput request.
     *
     * @return ListSubscriptionsResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(ListSubscriptionsResponse.class);
    }

    /**
    * List Subscriptions
    * List all the subscriptions for the specified seller created by the current developer.
    *
    * @param request
    *           ListSubscriptionsInput request.
    *
    * @return Future<ListSubscriptionsResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<ListSubscriptionsResponse> listSubscriptionsAsync(ListSubscriptionsInput request) {
        return newFuture(listSubscriptions(request));
    }

    /**
     * Register Destination
     * Create a new destination.
     *
     * @param request
     *           RegisterDestinationInput request.
     *
     * @return RegisterDestinationResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public RegisterDestinationResponse registerDestination(RegisterDestinationInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(RegisterDestinationResponse.class);
    }

    /**
    * Register Destination
    * Create a new destination.
    *
    * @param request
    *           RegisterDestinationInput request.
    *
    * @return Future<RegisterDestinationResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<RegisterDestinationResponse> registerDestinationAsync(RegisterDestinationInput request) {
        return newFuture(registerDestination(request));
    }

    /**
     * Send Test Notification To Destination
     * Send a test Notification to the specified destination.
     *
     * @param request
     *           SendTestNotificationToDestinationInput request.
     *
     * @return SendTestNotificationToDestinationResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public SendTestNotificationToDestinationResponse sendTestNotificationToDestination(SendTestNotificationToDestinationInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(SendTestNotificationToDestinationResponse.class);
    }

    /**
    * Send Test Notification To Destination
    * Send a test Notification to the specified destination.
    *
    * @param request
    *           SendTestNotificationToDestinationInput request.
    *
    * @return Future<SendTestNotificationToDestinationResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<SendTestNotificationToDestinationResponse> sendTestNotificationToDestinationAsync(SendTestNotificationToDestinationInput request) {
        return newFuture(sendTestNotificationToDestination(request));
    }

    /**
     * Update Subscription
     * Update a subscription.
     *
     * @param request
     *           UpdateSubscriptionInput request.
     *
     * @return UpdateSubscriptionResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionInput request)
            throws MWSSubscriptionsServiceException {
        return newResponse(UpdateSubscriptionResponse.class);
    }

    /**
    * Update Subscription
    * Update a subscription.
    *
    * @param request
    *           UpdateSubscriptionInput request.
    *
    * @return Future<UpdateSubscriptionResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<UpdateSubscriptionResponse> updateSubscriptionAsync(UpdateSubscriptionInput request) {
        return newFuture(updateSubscription(request));
    }

    /**
     * Get Service Status
     *
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws MWSSubscriptionsServiceException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request)
            throws MWSSubscriptionsServiceException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    *
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws MWSSubscriptionsServiceException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

}

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
package com.amazonservices.mws.easyship._2018_09_01.mock;


import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;
import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionService;
import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionServiceAsync;
import com.amazonservices.mws.easyship._2018_09_01.MWSEasyShipSectionServiceException;
import com.amazonservices.mws.easyship._2018_09_01.model.*;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * A mock implementation of MWSEasyShipSectionService that uses pre-populated set of
 * XML files that serve local data.
 *
 * It simulates responses from the MWS Easy Ship Section Service service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MWSEasyShipSectionServiceMock
        implements MWSEasyShipSectionService, MWSEasyShipSectionServiceAsync {

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
     * Create Scheduled Package
     * This operation schedules the order for pickup and returns scheduled package details.
     *
     * @param request
     *           CreateScheduledPackageRequest request.
     *
     * @return CreateScheduledPackageResponse response.
     *
     * @throws MWSEasyShipSectionServiceException
     */
    public CreateScheduledPackageResponse createScheduledPackage(CreateScheduledPackageRequest request)
            throws MWSEasyShipSectionServiceException {
        return newResponse(CreateScheduledPackageResponse.class);
    }

    /**
    * Create Scheduled Package
    * This operation schedules the order for pickup and returns scheduled package details.
    *
    * @param request
    *           CreateScheduledPackageRequest request.
    *
    * @return Future<CreateScheduledPackageResponse> Future containing completed response
    *
    * @throws MWSEasyShipSectionServiceException
    */
    public Future<CreateScheduledPackageResponse> createScheduledPackageAsync(CreateScheduledPackageRequest request) {
        return newFuture(createScheduledPackage(request));
    }

    /**
     * Get Scheduled Package
     * This operation returns the scheduled package details of an already scheduled order.
     *
     * @param request
     *           GetScheduledPackageRequest request.
     *
     * @return GetScheduledPackageResponse response.
     *
     * @throws MWSEasyShipSectionServiceException
     */
    public GetScheduledPackageResponse getScheduledPackage(GetScheduledPackageRequest request)
            throws MWSEasyShipSectionServiceException {
        return newResponse(GetScheduledPackageResponse.class);
    }

    /**
    * Get Scheduled Package
    * This operation returns the scheduled package details of an already scheduled order.
    *
    * @param request
    *           GetScheduledPackageRequest request.
    *
    * @return Future<GetScheduledPackageResponse> Future containing completed response
    *
    * @throws MWSEasyShipSectionServiceException
    */
    public Future<GetScheduledPackageResponse> getScheduledPackageAsync(GetScheduledPackageRequest request) {
        return newFuture(getScheduledPackage(request));
    }

    /**
     * List Pickup Slots
     * This operation returns a list of available PickupSlots.
     *
     * @param request
     *           ListPickupSlotsRequest request.
     *
     * @return ListPickupSlotsResponse response.
     *
     * @throws MWSEasyShipSectionServiceException
     */
    public ListPickupSlotsResponse listPickupSlots(ListPickupSlotsRequest request)
            throws MWSEasyShipSectionServiceException {
        return newResponse(ListPickupSlotsResponse.class);
    }

    /**
    * List Pickup Slots
    * This operation returns a list of available PickupSlots.
    *
    * @param request
    *           ListPickupSlotsRequest request.
    *
    * @return Future<ListPickupSlotsResponse> Future containing completed response
    *
    * @throws MWSEasyShipSectionServiceException
    */
    public Future<ListPickupSlotsResponse> listPickupSlotsAsync(ListPickupSlotsRequest request) {
        return newFuture(listPickupSlots(request));
    }

    /**
     * Update Scheduled Packages
     * This operation updates the schedule pickup slot of a scheduled order and returns updated scheduled package
     *         details.
     *
     * @param request
     *           UpdateScheduledPackagesRequest request.
     *
     * @return UpdateScheduledPackagesResponse response.
     *
     * @throws MWSEasyShipSectionServiceException
     */
    public UpdateScheduledPackagesResponse updateScheduledPackages(UpdateScheduledPackagesRequest request)
            throws MWSEasyShipSectionServiceException {
        return newResponse(UpdateScheduledPackagesResponse.class);
    }

    /**
    * Update Scheduled Packages
    * This operation updates the schedule pickup slot of a scheduled order and returns updated scheduled package
     *         details.
    *
    * @param request
    *           UpdateScheduledPackagesRequest request.
    *
    * @return Future<UpdateScheduledPackagesResponse> Future containing completed response
    *
    * @throws MWSEasyShipSectionServiceException
    */
    public Future<UpdateScheduledPackagesResponse> updateScheduledPackagesAsync(UpdateScheduledPackagesRequest request) {
        return newFuture(updateScheduledPackages(request));
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
     * @throws MWSEasyShipSectionServiceException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request)
            throws MWSEasyShipSectionServiceException {
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
    * @throws MWSEasyShipSectionServiceException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

}

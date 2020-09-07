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
package com.amazonservices.mws.easyship._2018_09_01;

import com.amazonservices.mws.easyship._2018_09_01.model.*;

/**
 * This is the EasyShip API section of the Marketplace Web Service. It allows clients to create and manage
 *         scheduling related operations for EasyShip orders.
 */
public interface MWSEasyShipSectionService {

    /**
     * Create Scheduled Package
     *
     * This operation schedules the order for pickup and returns scheduled package details.
     *
     * @param request
     *           CreateScheduledPackageRequest request.
     *
     * @return CreateScheduledPackageResponse response.
     *
     * @throws MWSEasyShipSectionServiceException
     */
    CreateScheduledPackageResponse createScheduledPackage(
        CreateScheduledPackageRequest request)
        throws MWSEasyShipSectionServiceException;

    /**
     * Get Scheduled Package
     *
     * This operation returns the scheduled package details of an already scheduled order.
     *
     * @param request
     *           GetScheduledPackageRequest request.
     *
     * @return GetScheduledPackageResponse response.
     *
     * @throws MWSEasyShipSectionServiceException
     */
    GetScheduledPackageResponse getScheduledPackage(
        GetScheduledPackageRequest request)
        throws MWSEasyShipSectionServiceException;

    /**
     * List Pickup Slots
     *
     * This operation returns a list of available PickupSlots.
     *
     * @param request
     *           ListPickupSlotsRequest request.
     *
     * @return ListPickupSlotsResponse response.
     *
     * @throws MWSEasyShipSectionServiceException
     */
    ListPickupSlotsResponse listPickupSlots(
        ListPickupSlotsRequest request)
        throws MWSEasyShipSectionServiceException;

    /**
     * Update Scheduled Packages
     *
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
    UpdateScheduledPackagesResponse updateScheduledPackages(
        UpdateScheduledPackagesRequest request)
        throws MWSEasyShipSectionServiceException;

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
     * @throws MWSEasyShipSectionServiceException
     */
    GetServiceStatusResponse getServiceStatus(
        GetServiceStatusRequest request)
        throws MWSEasyShipSectionServiceException;

}

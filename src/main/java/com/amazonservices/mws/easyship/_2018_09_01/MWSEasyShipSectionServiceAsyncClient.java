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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MWSEasyShipSectionServiceAsyncClient extends MWSEasyShipSectionServiceClient implements MWSEasyShipSectionServiceAsync {

    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSEasyShipSectionServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSEasyShipSectionServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSEasyShipSectionServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<CreateScheduledPackageResponse> createScheduledPackageAsync(
        CreateScheduledPackageRequest request) {
        return connection.callAsync(
            new RequestType("CreateScheduledPackage", CreateScheduledPackageResponse.class, servicePath),
            request);
    }

    public Future<GetScheduledPackageResponse> getScheduledPackageAsync(
        GetScheduledPackageRequest request) {
        return connection.callAsync(
            new RequestType("GetScheduledPackage", GetScheduledPackageResponse.class, servicePath),
            request);
    }

    public Future<ListPickupSlotsResponse> listPickupSlotsAsync(
        ListPickupSlotsRequest request) {
        return connection.callAsync(
            new RequestType("ListPickupSlots", ListPickupSlotsResponse.class, servicePath),
            request);
    }

    public Future<UpdateScheduledPackagesResponse> updateScheduledPackagesAsync(
        UpdateScheduledPackagesRequest request) {
        return connection.callAsync(
            new RequestType("UpdateScheduledPackages", UpdateScheduledPackagesResponse.class, servicePath),
            request);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}

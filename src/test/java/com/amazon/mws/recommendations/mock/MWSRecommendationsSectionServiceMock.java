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
 * MWS Recommendations Section Service
 * API Version: 2013-04-01
 * Library Version: 2014-10-01
 * Generated: Fri Oct 10 17:55:39 GMT 2014
 */
package com.amazon.mws.recommendations.mock;


import com.amazon.mws.recommendations.MWSRecommendationsSectionService;
import com.amazon.mws.recommendations.MWSRecommendationsSectionServiceAsync;
import com.amazon.mws.recommendations.MWSRecommendationsSectionServiceException;
import com.amazon.mws.recommendations.model.*;
import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * A mock implementation of MWSRecommendationsSectionService that uses pre-populated set of
 * XML files that serve local data.
 *
 * It simulates responses from the MWS Recommendations Section Service service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MWSRecommendationsSectionServiceMock
        implements MWSRecommendationsSectionService, MWSRecommendationsSectionServiceAsync {

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
     * Get Last Updated Time For Recommendations
     * Retrieving last updated time for all recommendation categories for the given marketplace and seller.
     *       If last updated time for a category is null, it indicates no active recommendations for this seller in the given marketplace for this category.
     *
     * @param request
     *           GetLastUpdatedTimeForRecommendationsRequest request.
     *
     * @return GetLastUpdatedTimeForRecommendationsResponse response.
     *
     * @throws MWSRecommendationsSectionServiceException
     */
    public GetLastUpdatedTimeForRecommendationsResponse getLastUpdatedTimeForRecommendations(GetLastUpdatedTimeForRecommendationsRequest request)
            throws MWSRecommendationsSectionServiceException {
        return newResponse(GetLastUpdatedTimeForRecommendationsResponse.class);
    }

    /**
    * Get Last Updated Time For Recommendations
    * Retrieving last updated time for all recommendation categories for the given marketplace and seller.
     *       If last updated time for a category is null, it indicates no active recommendations for this seller in the given marketplace for this category.
    *
    * @param request
    *           GetLastUpdatedTimeForRecommendationsRequest request.
    *
    * @return Future<GetLastUpdatedTimeForRecommendationsResponse> Future containing completed response
    *
    * @throws MWSRecommendationsSectionServiceException
    */
    public Future<GetLastUpdatedTimeForRecommendationsResponse> getLastUpdatedTimeForRecommendationsAsync(GetLastUpdatedTimeForRecommendationsRequest request) {
        return newFuture(getLastUpdatedTimeForRecommendations(request));
    }

    /**
     * List Recommendations
     * Retrieving first batch of recommendations.
     *
     * @param request
     *           ListRecommendationsRequest request.
     *
     * @return ListRecommendationsResponse response.
     *
     * @throws MWSRecommendationsSectionServiceException
     */
    public ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request)
            throws MWSRecommendationsSectionServiceException {
        return newResponse(ListRecommendationsResponse.class);
    }

    /**
    * List Recommendations
    * Retrieving first batch of recommendations.
    *
    * @param request
    *           ListRecommendationsRequest request.
    *
    * @return Future<ListRecommendationsResponse> Future containing completed response
    *
    * @throws MWSRecommendationsSectionServiceException
    */
    public Future<ListRecommendationsResponse> listRecommendationsAsync(ListRecommendationsRequest request) {
        return newFuture(listRecommendations(request));
    }

    /**
     * List Recommendations By Next Token
     * Retrieving recommendation by next token.
     *
     * @param request
     *           ListRecommendationsByNextTokenRequest request.
     *
     * @return ListRecommendationsByNextTokenResponse response.
     *
     * @throws MWSRecommendationsSectionServiceException
     */
    public ListRecommendationsByNextTokenResponse listRecommendationsByNextToken(ListRecommendationsByNextTokenRequest request)
            throws MWSRecommendationsSectionServiceException {
        return newResponse(ListRecommendationsByNextTokenResponse.class);
    }

    /**
    * List Recommendations By Next Token
    * Retrieving recommendation by next token.
    *
    * @param request
    *           ListRecommendationsByNextTokenRequest request.
    *
    * @return Future<ListRecommendationsByNextTokenResponse> Future containing completed response
    *
    * @throws MWSRecommendationsSectionServiceException
    */
    public Future<ListRecommendationsByNextTokenResponse> listRecommendationsByNextTokenAsync(ListRecommendationsByNextTokenRequest request) {
        return newFuture(listRecommendationsByNextToken(request));
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
     * @throws MWSRecommendationsSectionServiceException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request)
            throws MWSRecommendationsSectionServiceException {
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
    * @throws MWSRecommendationsSectionServiceException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

}

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
package com.amazon.mws.recommendations;

import com.amazon.mws.recommendations.model.*;

import java.util.concurrent.Future;

/**
 * Service serving MWS Recommendation section APIs.
 */
public interface MWSRecommendationsSectionServiceAsync extends MWSRecommendationsSectionService {

    /**
     * Get Last Updated Time For Recommendations
     *
     * Retrieving last updated time for all recommendation categories for the given marketplace and seller.
     *       If last updated time for a category is null, it indicates no active recommendations for this seller in the given marketplace for this category.
     *
     * @param request
     *           GetLastUpdatedTimeForRecommendationsRequest request.
     *
     * @return Future<GetLastUpdatedTimeForRecommendationsResponse> response.
     */
    Future<GetLastUpdatedTimeForRecommendationsResponse> getLastUpdatedTimeForRecommendationsAsync(
        GetLastUpdatedTimeForRecommendationsRequest request);

    /**
     * List Recommendations
     *
     * Retrieving first batch of recommendations.
     *
     * @param request
     *           ListRecommendationsRequest request.
     *
     * @return Future<ListRecommendationsResponse> response.
     */
    Future<ListRecommendationsResponse> listRecommendationsAsync(
        ListRecommendationsRequest request);

    /**
     * List Recommendations By Next Token
     *
     * Retrieving recommendation by next token.
     *
     * @param request
     *           ListRecommendationsByNextTokenRequest request.
     *
     * @return Future<ListRecommendationsByNextTokenResponse> response.
     */
    Future<ListRecommendationsByNextTokenResponse> listRecommendationsByNextTokenAsync(
        ListRecommendationsByNextTokenRequest request);

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

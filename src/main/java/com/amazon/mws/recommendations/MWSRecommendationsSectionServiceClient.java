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
import com.amazonservices.mws.client.*;

public class MWSRecommendationsSectionServiceClient implements MWSRecommendationsSectionService {

    private static final String libraryName = "MWSRecommendationsSectionService";

    private static final String libraryVersion = "2014-10-01";

    protected String servicePath;

    protected final MwsConnection connection;

    public MWSRecommendationsSectionServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSRecommendationsSectionServiceConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    public MWSRecommendationsSectionServiceClient(
            String accessKey,
            String secretKey,
            MWSRecommendationsSectionServiceConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    public MWSRecommendationsSectionServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MWSRecommendationsSectionServiceConfig());
    }

    public GetLastUpdatedTimeForRecommendationsResponse getLastUpdatedTimeForRecommendations(GetLastUpdatedTimeForRecommendationsRequest request) {
        return connection.call(
            new RequestType("GetLastUpdatedTimeForRecommendations", GetLastUpdatedTimeForRecommendationsResponse.class, servicePath),
            request);
    }

    public ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request) {
        return connection.call(
            new RequestType("ListRecommendations", ListRecommendationsResponse.class, servicePath),
            request);
    }

    public ListRecommendationsByNextTokenResponse listRecommendationsByNextToken(ListRecommendationsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListRecommendationsByNextToken", ListRecommendationsByNextTokenResponse.class, servicePath),
            request);
    }

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MWSRecommendationsSectionServiceException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}

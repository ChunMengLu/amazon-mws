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
 * Update Scheduled Packages Response
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * UpdateScheduledPackagesResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="UpdateScheduledPackagesResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="UpdateScheduledPackagesResult" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}UpdateScheduledPackagesResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class UpdateScheduledPackagesResponse extends AbstractMwsObject implements MWSResponse {

    private UpdateScheduledPackagesResult updateScheduledPackagesResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of UpdateScheduledPackagesResult.
     *
     * @return The value of UpdateScheduledPackagesResult.
     */
    public UpdateScheduledPackagesResult getUpdateScheduledPackagesResult() {
        return updateScheduledPackagesResult;
    }

    /**
     * Set the value of UpdateScheduledPackagesResult.
     *
     * @param updateScheduledPackagesResult
     *            The new value to set.
     */
    public void setUpdateScheduledPackagesResult(UpdateScheduledPackagesResult updateScheduledPackagesResult) {
        this.updateScheduledPackagesResult = updateScheduledPackagesResult;
    }

    /**
     * Check to see if UpdateScheduledPackagesResult is set.
     *
     * @return true if UpdateScheduledPackagesResult is set.
     */
    public boolean isSetUpdateScheduledPackagesResult() {
        return updateScheduledPackagesResult != null;
    }

    /**
     * Set the value of UpdateScheduledPackagesResult, return this.
     *
     * @param updateScheduledPackagesResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateScheduledPackagesResponse withUpdateScheduledPackagesResult(UpdateScheduledPackagesResult updateScheduledPackagesResult) {
        this.updateScheduledPackagesResult = updateScheduledPackagesResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateScheduledPackagesResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * Set the value of ResponseHeaderMetadata.
     *
     * @param responseHeaderMetadata
     *            The new value to set.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateScheduledPackagesResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        updateScheduledPackagesResult = r.read("UpdateScheduledPackagesResult", UpdateScheduledPackagesResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("UpdateScheduledPackagesResult", updateScheduledPackagesResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "UpdateScheduledPackagesResponse",this);
    }


    /** Default constructor. */
    public UpdateScheduledPackagesResponse() {
        super();
    }

}

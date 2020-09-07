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
 * List Subscriptions Response
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * ListSubscriptionsResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListSubscriptionsResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ListSubscriptionsResult" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}ListSubscriptionsResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListSubscriptionsResponse extends AbstractMwsObject implements MWSResponse {

    private ListSubscriptionsResult listSubscriptionsResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ListSubscriptionsResult.
     *
     * @return The value of ListSubscriptionsResult.
     */
    public ListSubscriptionsResult getListSubscriptionsResult() {
        return listSubscriptionsResult;
    }

    /**
     * Set the value of ListSubscriptionsResult.
     *
     * @param listSubscriptionsResult
     *            The new value to set.
     */
    public void setListSubscriptionsResult(ListSubscriptionsResult listSubscriptionsResult) {
        this.listSubscriptionsResult = listSubscriptionsResult;
    }

    /**
     * Check to see if ListSubscriptionsResult is set.
     *
     * @return true if ListSubscriptionsResult is set.
     */
    public boolean isSetListSubscriptionsResult() {
        return listSubscriptionsResult != null;
    }

    /**
     * Set the value of ListSubscriptionsResult, return this.
     *
     * @param listSubscriptionsResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListSubscriptionsResponse withListSubscriptionsResult(ListSubscriptionsResult listSubscriptionsResult) {
        this.listSubscriptionsResult = listSubscriptionsResult;
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
    public ListSubscriptionsResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public ListSubscriptionsResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        listSubscriptionsResult = r.read("ListSubscriptionsResult", ListSubscriptionsResult.class);
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
        w.write("ListSubscriptionsResult", listSubscriptionsResult);
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
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "ListSubscriptionsResponse",this);
    }

    /** Value constructor. */
    public ListSubscriptionsResponse(ListSubscriptionsResult listSubscriptionsResult,ResponseMetadata responseMetadata) {
        this.listSubscriptionsResult = listSubscriptionsResult;
        this.responseMetadata = responseMetadata;
    }


    /** Default constructor. */
    public ListSubscriptionsResponse() {
        super();
    }

}

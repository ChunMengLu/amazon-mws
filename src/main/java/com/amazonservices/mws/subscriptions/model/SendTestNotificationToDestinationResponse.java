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
 * Send Test Notification To Destination Response
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * SendTestNotificationToDestinationResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SendTestNotificationToDestinationResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SendTestNotificationToDestinationResult" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}SendTestNotificationToDestinationResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SendTestNotificationToDestinationResponse extends AbstractMwsObject implements MWSResponse {

    private SendTestNotificationToDestinationResult sendTestNotificationToDestinationResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of SendTestNotificationToDestinationResult.
     *
     * @return The value of SendTestNotificationToDestinationResult.
     */
    public SendTestNotificationToDestinationResult getSendTestNotificationToDestinationResult() {
        return sendTestNotificationToDestinationResult;
    }

    /**
     * Set the value of SendTestNotificationToDestinationResult.
     *
     * @param sendTestNotificationToDestinationResult
     *            The new value to set.
     */
    public void setSendTestNotificationToDestinationResult(SendTestNotificationToDestinationResult sendTestNotificationToDestinationResult) {
        this.sendTestNotificationToDestinationResult = sendTestNotificationToDestinationResult;
    }

    /**
     * Check to see if SendTestNotificationToDestinationResult is set.
     *
     * @return true if SendTestNotificationToDestinationResult is set.
     */
    public boolean isSetSendTestNotificationToDestinationResult() {
        return sendTestNotificationToDestinationResult != null;
    }

    /**
     * Set the value of SendTestNotificationToDestinationResult, return this.
     *
     * @param sendTestNotificationToDestinationResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public SendTestNotificationToDestinationResponse withSendTestNotificationToDestinationResult(SendTestNotificationToDestinationResult sendTestNotificationToDestinationResult) {
        this.sendTestNotificationToDestinationResult = sendTestNotificationToDestinationResult;
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
    public SendTestNotificationToDestinationResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public SendTestNotificationToDestinationResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        sendTestNotificationToDestinationResult = r.read("SendTestNotificationToDestinationResult", SendTestNotificationToDestinationResult.class);
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
        w.write("SendTestNotificationToDestinationResult", sendTestNotificationToDestinationResult);
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
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "SendTestNotificationToDestinationResponse",this);
    }

    /** Value constructor. */
    public SendTestNotificationToDestinationResponse(SendTestNotificationToDestinationResult sendTestNotificationToDestinationResult,ResponseMetadata responseMetadata) {
        this.sendTestNotificationToDestinationResult = sendTestNotificationToDestinationResult;
        this.responseMetadata = responseMetadata;
    }


    /** Default constructor. */
    public SendTestNotificationToDestinationResponse() {
        super();
    }

}

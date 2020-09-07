/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Void Transport Request Response
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * VoidTransportRequestResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="VoidTransportRequestResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="VoidTransportRequestResult" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}VoidTransportRequestResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="VoidTransportRequestResponse", propOrder={
    "voidTransportRequestResult",
    "responseMetadata"
})
@XmlRootElement(name = "VoidTransportRequestResponse")
public class VoidTransportRequestResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="VoidTransportRequestResult")
    private VoidTransportRequestResult voidTransportRequestResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of VoidTransportRequestResult.
     *
     * @return The value of VoidTransportRequestResult.
     */
    public VoidTransportRequestResult getVoidTransportRequestResult() {
        return voidTransportRequestResult;
    }

    /**
     * Set the value of VoidTransportRequestResult.
     *
     * @param voidTransportRequestResult
     *            The new value to set.
     */
    public void setVoidTransportRequestResult(VoidTransportRequestResult voidTransportRequestResult) {
        this.voidTransportRequestResult = voidTransportRequestResult;
    }

    /**
     * Check to see if VoidTransportRequestResult is set.
     *
     * @return true if VoidTransportRequestResult is set.
     */
    public boolean isSetVoidTransportRequestResult() {
        return voidTransportRequestResult != null;
    }

    /**
     * Set the value of VoidTransportRequestResult, return this.
     *
     * @param voidTransportRequestResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public VoidTransportRequestResponse withVoidTransportRequestResult(VoidTransportRequestResult voidTransportRequestResult) {
        this.voidTransportRequestResult = voidTransportRequestResult;
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
    public VoidTransportRequestResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public VoidTransportRequestResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        voidTransportRequestResult = r.read("VoidTransportRequestResult", VoidTransportRequestResult.class);
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
        w.write("VoidTransportRequestResult", voidTransportRequestResult);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "VoidTransportRequestResponse",this);
    }


    /** Value constructor. */
    public VoidTransportRequestResponse(VoidTransportRequestResult voidTransportRequestResult,ResponseMetadata responseMetadata) {
        this.voidTransportRequestResult = voidTransportRequestResult;
        this.responseMetadata = responseMetadata;
    }

    /** Default constructor. */
    public VoidTransportRequestResponse() {
        super();
    }

}

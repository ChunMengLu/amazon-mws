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
 * Get Pallet Labels Response
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
 * GetPalletLabelsResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPalletLabelsResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetPalletLabelsResult" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}GetPalletLabelsResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPalletLabelsResponse", propOrder={
    "getPalletLabelsResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetPalletLabelsResponse")
public class GetPalletLabelsResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="GetPalletLabelsResult")
    private GetPalletLabelsResult getPalletLabelsResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetPalletLabelsResult.
     *
     * @return The value of GetPalletLabelsResult.
     */
    public GetPalletLabelsResult getGetPalletLabelsResult() {
        return getPalletLabelsResult;
    }

    /**
     * Set the value of GetPalletLabelsResult.
     *
     * @param getPalletLabelsResult
     *            The new value to set.
     */
    public void setGetPalletLabelsResult(GetPalletLabelsResult getPalletLabelsResult) {
        this.getPalletLabelsResult = getPalletLabelsResult;
    }

    /**
     * Check to see if GetPalletLabelsResult is set.
     *
     * @return true if GetPalletLabelsResult is set.
     */
    public boolean isSetGetPalletLabelsResult() {
        return getPalletLabelsResult != null;
    }

    /**
     * Set the value of GetPalletLabelsResult, return this.
     *
     * @param getPalletLabelsResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPalletLabelsResponse withGetPalletLabelsResult(GetPalletLabelsResult getPalletLabelsResult) {
        this.getPalletLabelsResult = getPalletLabelsResult;
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
    public GetPalletLabelsResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetPalletLabelsResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getPalletLabelsResult = r.read("GetPalletLabelsResult", GetPalletLabelsResult.class);
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
        w.write("GetPalletLabelsResult", getPalletLabelsResult);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPalletLabelsResponse",this);
    }


    /** Value constructor. */
    public GetPalletLabelsResponse(GetPalletLabelsResult getPalletLabelsResult,ResponseMetadata responseMetadata) {
        this.getPalletLabelsResult = getPalletLabelsResult;
        this.responseMetadata = responseMetadata;
    }

    /** Default constructor. */
    public GetPalletLabelsResponse() {
        super();
    }

}

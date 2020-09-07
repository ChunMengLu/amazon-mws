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
 * Update Inbound Shipment Response
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
 * UpdateInboundShipmentResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="UpdateInboundShipmentResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="UpdateInboundShipmentResult" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}UpdateInboundShipmentResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="UpdateInboundShipmentResponse", propOrder={
    "updateInboundShipmentResult",
    "responseMetadata"
})
@XmlRootElement(name = "UpdateInboundShipmentResponse")
public class UpdateInboundShipmentResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="UpdateInboundShipmentResult")
    private UpdateInboundShipmentResult updateInboundShipmentResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of UpdateInboundShipmentResult.
     *
     * @return The value of UpdateInboundShipmentResult.
     */
    public UpdateInboundShipmentResult getUpdateInboundShipmentResult() {
        return updateInboundShipmentResult;
    }

    /**
     * Set the value of UpdateInboundShipmentResult.
     *
     * @param updateInboundShipmentResult
     *            The new value to set.
     */
    public void setUpdateInboundShipmentResult(UpdateInboundShipmentResult updateInboundShipmentResult) {
        this.updateInboundShipmentResult = updateInboundShipmentResult;
    }

    /**
     * Check to see if UpdateInboundShipmentResult is set.
     *
     * @return true if UpdateInboundShipmentResult is set.
     */
    public boolean isSetUpdateInboundShipmentResult() {
        return updateInboundShipmentResult != null;
    }

    /**
     * Set the value of UpdateInboundShipmentResult, return this.
     *
     * @param updateInboundShipmentResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateInboundShipmentResponse withUpdateInboundShipmentResult(UpdateInboundShipmentResult updateInboundShipmentResult) {
        this.updateInboundShipmentResult = updateInboundShipmentResult;
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
    public UpdateInboundShipmentResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public UpdateInboundShipmentResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        updateInboundShipmentResult = r.read("UpdateInboundShipmentResult", UpdateInboundShipmentResult.class);
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
        w.write("UpdateInboundShipmentResult", updateInboundShipmentResult);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "UpdateInboundShipmentResponse",this);
    }


    /** Value constructor. */
    public UpdateInboundShipmentResponse(UpdateInboundShipmentResult updateInboundShipmentResult,ResponseMetadata responseMetadata) {
        this.updateInboundShipmentResult = updateInboundShipmentResult;
        this.responseMetadata = responseMetadata;
    }

    /** Default constructor. */
    public UpdateInboundShipmentResponse() {
        super();
    }

}

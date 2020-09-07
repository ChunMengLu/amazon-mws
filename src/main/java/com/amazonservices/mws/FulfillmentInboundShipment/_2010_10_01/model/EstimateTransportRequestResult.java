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
 * Estimate Transport Request Result
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
 * EstimateTransportRequestResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="EstimateTransportRequestResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TransportResult" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}TransportResult" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="EstimateTransportRequestResult", propOrder={
    "transportResult"
})
@XmlRootElement(name = "EstimateTransportRequestResult")
public class EstimateTransportRequestResult extends AbstractMwsObject {

    @XmlElement(name="TransportResult")
    private TransportResult transportResult;

    /**
     * Get the value of TransportResult.
     *
     * @return The value of TransportResult.
     */
    public TransportResult getTransportResult() {
        return transportResult;
    }

    /**
     * Set the value of TransportResult.
     *
     * @param transportResult
     *            The new value to set.
     */
    public void setTransportResult(TransportResult transportResult) {
        this.transportResult = transportResult;
    }

    /**
     * Check to see if TransportResult is set.
     *
     * @return true if TransportResult is set.
     */
    public boolean isSetTransportResult() {
        return transportResult != null;
    }

    /**
     * Set the value of TransportResult, return this.
     *
     * @param transportResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public EstimateTransportRequestResult withTransportResult(TransportResult transportResult) {
        this.transportResult = transportResult;
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
        transportResult = r.read("TransportResult", TransportResult.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TransportResult", transportResult);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "EstimateTransportRequestResult",this);
    }


    /** Value constructor. */
    public EstimateTransportRequestResult(TransportResult transportResult) {
        this.transportResult = transportResult;
    }

    /** Default constructor. */
    public EstimateTransportRequestResult() {
        super();
    }

}

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
 * Transport Result
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
 * TransportResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TransportResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TransportStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TransportResult", propOrder={
    "transportStatus",
    "errorCode",
    "errorDescription"
})
@XmlRootElement(name = "TransportResult")
public class TransportResult extends AbstractMwsObject {

    @XmlElement(name="TransportStatus",required=true)
    private String transportStatus;

    @XmlElement(name="ErrorCode")
    private String errorCode;

    @XmlElement(name="ErrorDescription")
    private String errorDescription;

    /**
     * Get the value of TransportStatus.
     *
     * @return The value of TransportStatus.
     */
    public String getTransportStatus() {
        return transportStatus;
    }

    /**
     * Set the value of TransportStatus.
     *
     * @param transportStatus
     *            The new value to set.
     */
    public void setTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus;
    }

    /**
     * Check to see if TransportStatus is set.
     *
     * @return true if TransportStatus is set.
     */
    public boolean isSetTransportStatus() {
        return transportStatus != null;
    }

    /**
     * Set the value of TransportStatus, return this.
     *
     * @param transportStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportResult withTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus;
        return this;
    }

    /**
     * Get the value of ErrorCode.
     *
     * @return The value of ErrorCode.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Set the value of ErrorCode.
     *
     * @param errorCode
     *            The new value to set.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Check to see if ErrorCode is set.
     *
     * @return true if ErrorCode is set.
     */
    public boolean isSetErrorCode() {
        return errorCode != null;
    }

    /**
     * Set the value of ErrorCode, return this.
     *
     * @param errorCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the value of ErrorDescription.
     *
     * @return The value of ErrorDescription.
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Set the value of ErrorDescription.
     *
     * @param errorDescription
     *            The new value to set.
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * Check to see if ErrorDescription is set.
     *
     * @return true if ErrorDescription is set.
     */
    public boolean isSetErrorDescription() {
        return errorDescription != null;
    }

    /**
     * Set the value of ErrorDescription, return this.
     *
     * @param errorDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportResult withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
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
        transportStatus = r.read("TransportStatus", String.class);
        errorCode = r.read("ErrorCode", String.class);
        errorDescription = r.read("ErrorDescription", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TransportStatus", transportStatus);
        w.write("ErrorCode", errorCode);
        w.write("ErrorDescription", errorDescription);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "TransportResult",this);
    }

    /** Value constructor. */
    public TransportResult(String transportStatus,String errorCode,String errorDescription) {
        this.transportStatus = transportStatus;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    /** Value constructor. */
    public TransportResult(String transportStatus) {
        this.transportStatus = transportStatus;
    }

    /** Default constructor. */
    public TransportResult() {
        super();
    }

}

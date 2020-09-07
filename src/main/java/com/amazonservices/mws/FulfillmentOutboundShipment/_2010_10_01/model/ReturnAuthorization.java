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
 * Return Authorization
 * API Version: 2010-10-01
 * Library Version: 2016-10-19
 * Generated: Wed Oct 19 08:37:51 PDT 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * ReturnAuthorization complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ReturnAuthorization"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ReturnAuthorizationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="FulfillmentCenterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ReturnToAddress" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Address"/&gt;
 *             &lt;element name="AmazonRmaId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="RmaPageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ReturnAuthorization", propOrder={
    "returnAuthorizationId",
    "fulfillmentCenterId",
    "returnToAddress",
    "amazonRmaId",
    "rmaPageURL"
})
@XmlRootElement(name = "ReturnAuthorization")
public class ReturnAuthorization extends AbstractMwsObject {

    @XmlElement(name="ReturnAuthorizationId",required=true)
    private String returnAuthorizationId;

    @XmlElement(name="FulfillmentCenterId",required=true)
    private String fulfillmentCenterId;

    @XmlElement(name="ReturnToAddress",required=true)
    private Address returnToAddress;

    @XmlElement(name="AmazonRmaId",required=true)
    private String amazonRmaId;

    @XmlElement(name="RmaPageURL",required=true)
    private String rmaPageURL;

    /**
     * Get the value of ReturnAuthorizationId.
     *
     * @return The value of ReturnAuthorizationId.
     */
    public String getReturnAuthorizationId() {
        return returnAuthorizationId;
    }

    /**
     * Set the value of ReturnAuthorizationId.
     *
     * @param returnAuthorizationId
     *            The new value to set.
     */
    public void setReturnAuthorizationId(String returnAuthorizationId) {
        this.returnAuthorizationId = returnAuthorizationId;
    }

    /**
     * Check to see if ReturnAuthorizationId is set.
     *
     * @return true if ReturnAuthorizationId is set.
     */
    public boolean isSetReturnAuthorizationId() {
        return returnAuthorizationId != null;
    }

    /**
     * Set the value of ReturnAuthorizationId, return this.
     *
     * @param returnAuthorizationId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnAuthorization withReturnAuthorizationId(String returnAuthorizationId) {
        this.returnAuthorizationId = returnAuthorizationId;
        return this;
    }

    /**
     * Get the value of FulfillmentCenterId.
     *
     * @return The value of FulfillmentCenterId.
     */
    public String getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }

    /**
     * Set the value of FulfillmentCenterId.
     *
     * @param fulfillmentCenterId
     *            The new value to set.
     */
    public void setFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }

    /**
     * Check to see if FulfillmentCenterId is set.
     *
     * @return true if FulfillmentCenterId is set.
     */
    public boolean isSetFulfillmentCenterId() {
        return fulfillmentCenterId != null;
    }

    /**
     * Set the value of FulfillmentCenterId, return this.
     *
     * @param fulfillmentCenterId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnAuthorization withFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
        return this;
    }

    /**
     * Get the value of ReturnToAddress.
     *
     * @return The value of ReturnToAddress.
     */
    public Address getReturnToAddress() {
        return returnToAddress;
    }

    /**
     * Set the value of ReturnToAddress.
     *
     * @param returnToAddress
     *            The new value to set.
     */
    public void setReturnToAddress(Address returnToAddress) {
        this.returnToAddress = returnToAddress;
    }

    /**
     * Check to see if ReturnToAddress is set.
     *
     * @return true if ReturnToAddress is set.
     */
    public boolean isSetReturnToAddress() {
        return returnToAddress != null;
    }

    /**
     * Set the value of ReturnToAddress, return this.
     *
     * @param returnToAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnAuthorization withReturnToAddress(Address returnToAddress) {
        this.returnToAddress = returnToAddress;
        return this;
    }

    /**
     * Get the value of AmazonRmaId.
     *
     * @return The value of AmazonRmaId.
     */
    public String getAmazonRmaId() {
        return amazonRmaId;
    }

    /**
     * Set the value of AmazonRmaId.
     *
     * @param amazonRmaId
     *            The new value to set.
     */
    public void setAmazonRmaId(String amazonRmaId) {
        this.amazonRmaId = amazonRmaId;
    }

    /**
     * Check to see if AmazonRmaId is set.
     *
     * @return true if AmazonRmaId is set.
     */
    public boolean isSetAmazonRmaId() {
        return amazonRmaId != null;
    }

    /**
     * Set the value of AmazonRmaId, return this.
     *
     * @param amazonRmaId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnAuthorization withAmazonRmaId(String amazonRmaId) {
        this.amazonRmaId = amazonRmaId;
        return this;
    }

    /**
     * Get the value of RmaPageURL.
     *
     * @return The value of RmaPageURL.
     */
    public String getRmaPageURL() {
        return rmaPageURL;
    }

    /**
     * Set the value of RmaPageURL.
     *
     * @param rmaPageURL
     *            The new value to set.
     */
    public void setRmaPageURL(String rmaPageURL) {
        this.rmaPageURL = rmaPageURL;
    }

    /**
     * Check to see if RmaPageURL is set.
     *
     * @return true if RmaPageURL is set.
     */
    public boolean isSetRmaPageURL() {
        return rmaPageURL != null;
    }

    /**
     * Set the value of RmaPageURL, return this.
     *
     * @param rmaPageURL
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnAuthorization withRmaPageURL(String rmaPageURL) {
        this.rmaPageURL = rmaPageURL;
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
        returnAuthorizationId = r.read("ReturnAuthorizationId", String.class);
        fulfillmentCenterId = r.read("FulfillmentCenterId", String.class);
        returnToAddress = r.read("ReturnToAddress", Address.class);
        amazonRmaId = r.read("AmazonRmaId", String.class);
        rmaPageURL = r.read("RmaPageURL", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ReturnAuthorizationId", returnAuthorizationId);
        w.write("FulfillmentCenterId", fulfillmentCenterId);
        w.write("ReturnToAddress", returnToAddress);
        w.write("AmazonRmaId", amazonRmaId);
        w.write("RmaPageURL", rmaPageURL);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ReturnAuthorization",this);
    }

    /** Value constructor. */
    public ReturnAuthorization(String returnAuthorizationId,String fulfillmentCenterId,Address returnToAddress,String amazonRmaId,String rmaPageURL) {
        this.returnAuthorizationId = returnAuthorizationId;
        this.fulfillmentCenterId = fulfillmentCenterId;
        this.returnToAddress = returnToAddress;
        this.amazonRmaId = amazonRmaId;
        this.rmaPageURL = rmaPageURL;
    }

    /** Default constructor. */
    public ReturnAuthorization() {
        super();
    }

}

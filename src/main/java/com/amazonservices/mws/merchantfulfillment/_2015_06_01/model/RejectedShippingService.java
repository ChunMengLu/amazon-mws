/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Rejected Shipping Service
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * RejectedShippingService complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="RejectedShippingService"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="RejectionReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="RejectionReasonMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class RejectedShippingService extends AbstractMwsObject {

    private String carrierName;

    private String shippingServiceName;

    private String shippingServiceId;

    private String rejectionReasonCode;

    private String rejectionReasonMessage;

    /**
     * Get the value of CarrierName.
     *
     * @return The value of CarrierName.
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Set the value of CarrierName.
     *
     * @param carrierName
     *            The new value to set.
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Check to see if CarrierName is set.
     *
     * @return true if CarrierName is set.
     */
    public boolean isSetCarrierName() {
        return carrierName != null;
    }

    /**
     * Set the value of CarrierName, return this.
     *
     * @param carrierName
     *             The new value to set.
     *
     * @return This instance.
     */
    public RejectedShippingService withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get the value of ShippingServiceName.
     *
     * @return The value of ShippingServiceName.
     */
    public String getShippingServiceName() {
        return shippingServiceName;
    }

    /**
     * Set the value of ShippingServiceName.
     *
     * @param shippingServiceName
     *            The new value to set.
     */
    public void setShippingServiceName(String shippingServiceName) {
        this.shippingServiceName = shippingServiceName;
    }

    /**
     * Check to see if ShippingServiceName is set.
     *
     * @return true if ShippingServiceName is set.
     */
    public boolean isSetShippingServiceName() {
        return shippingServiceName != null;
    }

    /**
     * Set the value of ShippingServiceName, return this.
     *
     * @param shippingServiceName
     *             The new value to set.
     *
     * @return This instance.
     */
    public RejectedShippingService withShippingServiceName(String shippingServiceName) {
        this.shippingServiceName = shippingServiceName;
        return this;
    }

    /**
     * Get the value of ShippingServiceId.
     *
     * @return The value of ShippingServiceId.
     */
    public String getShippingServiceId() {
        return shippingServiceId;
    }

    /**
     * Set the value of ShippingServiceId.
     *
     * @param shippingServiceId
     *            The new value to set.
     */
    public void setShippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
    }

    /**
     * Check to see if ShippingServiceId is set.
     *
     * @return true if ShippingServiceId is set.
     */
    public boolean isSetShippingServiceId() {
        return shippingServiceId != null;
    }

    /**
     * Set the value of ShippingServiceId, return this.
     *
     * @param shippingServiceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public RejectedShippingService withShippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
        return this;
    }

    /**
     * Get the value of RejectionReasonCode.
     *
     * @return The value of RejectionReasonCode.
     */
    public String getRejectionReasonCode() {
        return rejectionReasonCode;
    }

    /**
     * Set the value of RejectionReasonCode.
     *
     * @param rejectionReasonCode
     *            The new value to set.
     */
    public void setRejectionReasonCode(String rejectionReasonCode) {
        this.rejectionReasonCode = rejectionReasonCode;
    }

    /**
     * Check to see if RejectionReasonCode is set.
     *
     * @return true if RejectionReasonCode is set.
     */
    public boolean isSetRejectionReasonCode() {
        return rejectionReasonCode != null;
    }

    /**
     * Set the value of RejectionReasonCode, return this.
     *
     * @param rejectionReasonCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public RejectedShippingService withRejectionReasonCode(String rejectionReasonCode) {
        this.rejectionReasonCode = rejectionReasonCode;
        return this;
    }

    /**
     * Get the value of RejectionReasonMessage.
     *
     * @return The value of RejectionReasonMessage.
     */
    public String getRejectionReasonMessage() {
        return rejectionReasonMessage;
    }

    /**
     * Set the value of RejectionReasonMessage.
     *
     * @param rejectionReasonMessage
     *            The new value to set.
     */
    public void setRejectionReasonMessage(String rejectionReasonMessage) {
        this.rejectionReasonMessage = rejectionReasonMessage;
    }

    /**
     * Check to see if RejectionReasonMessage is set.
     *
     * @return true if RejectionReasonMessage is set.
     */
    public boolean isSetRejectionReasonMessage() {
        return rejectionReasonMessage != null;
    }

    /**
     * Set the value of RejectionReasonMessage, return this.
     *
     * @param rejectionReasonMessage
     *             The new value to set.
     *
     * @return This instance.
     */
    public RejectedShippingService withRejectionReasonMessage(String rejectionReasonMessage) {
        this.rejectionReasonMessage = rejectionReasonMessage;
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
        carrierName = r.read("CarrierName", String.class);
        shippingServiceName = r.read("ShippingServiceName", String.class);
        shippingServiceId = r.read("ShippingServiceId", String.class);
        rejectionReasonCode = r.read("RejectionReasonCode", String.class);
        rejectionReasonMessage = r.read("RejectionReasonMessage", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CarrierName", carrierName);
        w.write("ShippingServiceName", shippingServiceName);
        w.write("ShippingServiceId", shippingServiceId);
        w.write("RejectionReasonCode", rejectionReasonCode);
        w.write("RejectionReasonMessage", rejectionReasonMessage);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "RejectedShippingService",this);
    }

    /** Value constructor. */
    public RejectedShippingService(String carrierName,String shippingServiceName,String shippingServiceId,String rejectionReasonCode) {
        this.carrierName = carrierName;
        this.shippingServiceName = shippingServiceName;
        this.shippingServiceId = shippingServiceId;
        this.rejectionReasonCode = rejectionReasonCode;
    }

    /** Default constructor. */
    public RejectedShippingService() {
        super();
    }

}

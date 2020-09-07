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
 * Invalid Return Item
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
 * InvalidReturnItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InvalidReturnItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerReturnItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerFulfillmentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="InvalidItemReason" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}InvalidItemReason"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InvalidReturnItem", propOrder={
    "sellerReturnItemId",
    "sellerFulfillmentOrderItemId",
    "invalidItemReason"
})
@XmlRootElement(name = "InvalidReturnItem")
public class InvalidReturnItem extends AbstractMwsObject {

    @XmlElement(name="SellerReturnItemId",required=true)
    private String sellerReturnItemId;

    @XmlElement(name="SellerFulfillmentOrderItemId",required=true)
    private String sellerFulfillmentOrderItemId;

    @XmlElement(name="InvalidItemReason",required=true)
    private InvalidItemReason invalidItemReason;

    /**
     * Get the value of SellerReturnItemId.
     *
     * @return The value of SellerReturnItemId.
     */
    public String getSellerReturnItemId() {
        return sellerReturnItemId;
    }

    /**
     * Set the value of SellerReturnItemId.
     *
     * @param sellerReturnItemId
     *            The new value to set.
     */
    public void setSellerReturnItemId(String sellerReturnItemId) {
        this.sellerReturnItemId = sellerReturnItemId;
    }

    /**
     * Check to see if SellerReturnItemId is set.
     *
     * @return true if SellerReturnItemId is set.
     */
    public boolean isSetSellerReturnItemId() {
        return sellerReturnItemId != null;
    }

    /**
     * Set the value of SellerReturnItemId, return this.
     *
     * @param sellerReturnItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public InvalidReturnItem withSellerReturnItemId(String sellerReturnItemId) {
        this.sellerReturnItemId = sellerReturnItemId;
        return this;
    }

    /**
     * Get the value of SellerFulfillmentOrderItemId.
     *
     * @return The value of SellerFulfillmentOrderItemId.
     */
    public String getSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId;
    }

    /**
     * Set the value of SellerFulfillmentOrderItemId.
     *
     * @param sellerFulfillmentOrderItemId
     *            The new value to set.
     */
    public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    }

    /**
     * Check to see if SellerFulfillmentOrderItemId is set.
     *
     * @return true if SellerFulfillmentOrderItemId is set.
     */
    public boolean isSetSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId != null;
    }

    /**
     * Set the value of SellerFulfillmentOrderItemId, return this.
     *
     * @param sellerFulfillmentOrderItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public InvalidReturnItem withSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * Get the value of InvalidItemReason.
     *
     * @return The value of InvalidItemReason.
     */
    public InvalidItemReason getInvalidItemReason() {
        return invalidItemReason;
    }

    /**
     * Set the value of InvalidItemReason.
     *
     * @param invalidItemReason
     *            The new value to set.
     */
    public void setInvalidItemReason(InvalidItemReason invalidItemReason) {
        this.invalidItemReason = invalidItemReason;
    }

    /**
     * Check to see if InvalidItemReason is set.
     *
     * @return true if InvalidItemReason is set.
     */
    public boolean isSetInvalidItemReason() {
        return invalidItemReason != null;
    }

    /**
     * Set the value of InvalidItemReason, return this.
     *
     * @param invalidItemReason
     *             The new value to set.
     *
     * @return This instance.
     */
    public InvalidReturnItem withInvalidItemReason(InvalidItemReason invalidItemReason) {
        this.invalidItemReason = invalidItemReason;
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
        sellerReturnItemId = r.read("SellerReturnItemId", String.class);
        sellerFulfillmentOrderItemId = r.read("SellerFulfillmentOrderItemId", String.class);
        invalidItemReason = r.read("InvalidItemReason", InvalidItemReason.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerReturnItemId", sellerReturnItemId);
        w.write("SellerFulfillmentOrderItemId", sellerFulfillmentOrderItemId);
        w.write("InvalidItemReason", invalidItemReason);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "InvalidReturnItem",this);
    }

    /** Value constructor. */
    public InvalidReturnItem(String sellerReturnItemId,String sellerFulfillmentOrderItemId,InvalidItemReason invalidItemReason) {
        this.sellerReturnItemId = sellerReturnItemId;
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        this.invalidItemReason = invalidItemReason;
    }

    /** Default constructor. */
    public InvalidReturnItem() {
        super();
    }

}

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
 * Create Return Item
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
 * CreateReturnItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateReturnItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerReturnItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerFulfillmentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AmazonShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ReturnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ReturnComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CreateReturnItem", propOrder={
    "sellerReturnItemId",
    "sellerFulfillmentOrderItemId",
    "amazonShipmentId",
    "returnReasonCode",
    "returnComment"
})
@XmlRootElement(name = "CreateReturnItem")
public class CreateReturnItem extends AbstractMwsObject {

    @XmlElement(name="SellerReturnItemId",required=true)
    private String sellerReturnItemId;

    @XmlElement(name="SellerFulfillmentOrderItemId",required=true)
    private String sellerFulfillmentOrderItemId;

    @XmlElement(name="AmazonShipmentId",required=true)
    private String amazonShipmentId;

    @XmlElement(name="ReturnReasonCode",required=true)
    private String returnReasonCode;

    @XmlElement(name="ReturnComment")
    private String returnComment;

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
    public CreateReturnItem withSellerReturnItemId(String sellerReturnItemId) {
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
    public CreateReturnItem withSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * Get the value of AmazonShipmentId.
     *
     * @return The value of AmazonShipmentId.
     */
    public String getAmazonShipmentId() {
        return amazonShipmentId;
    }

    /**
     * Set the value of AmazonShipmentId.
     *
     * @param amazonShipmentId
     *            The new value to set.
     */
    public void setAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
    }

    /**
     * Check to see if AmazonShipmentId is set.
     *
     * @return true if AmazonShipmentId is set.
     */
    public boolean isSetAmazonShipmentId() {
        return amazonShipmentId != null;
    }

    /**
     * Set the value of AmazonShipmentId, return this.
     *
     * @param amazonShipmentId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateReturnItem withAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
        return this;
    }

    /**
     * Get the value of ReturnReasonCode.
     *
     * @return The value of ReturnReasonCode.
     */
    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    /**
     * Set the value of ReturnReasonCode.
     *
     * @param returnReasonCode
     *            The new value to set.
     */
    public void setReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
    }

    /**
     * Check to see if ReturnReasonCode is set.
     *
     * @return true if ReturnReasonCode is set.
     */
    public boolean isSetReturnReasonCode() {
        return returnReasonCode != null;
    }

    /**
     * Set the value of ReturnReasonCode, return this.
     *
     * @param returnReasonCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateReturnItem withReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
        return this;
    }

    /**
     * Get the value of ReturnComment.
     *
     * @return The value of ReturnComment.
     */
    public String getReturnComment() {
        return returnComment;
    }

    /**
     * Set the value of ReturnComment.
     *
     * @param returnComment
     *            The new value to set.
     */
    public void setReturnComment(String returnComment) {
        this.returnComment = returnComment;
    }

    /**
     * Check to see if ReturnComment is set.
     *
     * @return true if ReturnComment is set.
     */
    public boolean isSetReturnComment() {
        return returnComment != null;
    }

    /**
     * Set the value of ReturnComment, return this.
     *
     * @param returnComment
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateReturnItem withReturnComment(String returnComment) {
        this.returnComment = returnComment;
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
        amazonShipmentId = r.read("AmazonShipmentId", String.class);
        returnReasonCode = r.read("ReturnReasonCode", String.class);
        returnComment = r.read("ReturnComment", String.class);
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
        w.write("AmazonShipmentId", amazonShipmentId);
        w.write("ReturnReasonCode", returnReasonCode);
        w.write("ReturnComment", returnComment);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "CreateReturnItem",this);
    }

    /** Value constructor. */
    public CreateReturnItem(String sellerReturnItemId,String sellerFulfillmentOrderItemId,String amazonShipmentId,String returnReasonCode) {
        this.sellerReturnItemId = sellerReturnItemId;
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        this.amazonShipmentId = amazonShipmentId;
        this.returnReasonCode = returnReasonCode;
    }

    /** Default constructor. */
    public CreateReturnItem() {
        super();
    }

}

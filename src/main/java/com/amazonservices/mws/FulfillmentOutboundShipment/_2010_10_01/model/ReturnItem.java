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
 * Return Item
 * API Version: 2010-10-01
 * Library Version: 2016-10-19
 * Generated: Wed Oct 19 08:37:51 PDT 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * ReturnItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ReturnItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerReturnItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerFulfillmentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AmazonShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerReturnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ReturnComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AmazonReturnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="StatusChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="ReturnAuthorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ReturnReceivedCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentCenterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ReturnItem", propOrder={
    "sellerReturnItemId",
    "sellerFulfillmentOrderItemId",
    "amazonShipmentId",
    "sellerReturnReasonCode",
    "returnComment",
    "amazonReturnReasonCode",
    "status",
    "statusChangedDate",
    "returnAuthorizationId",
    "returnReceivedCondition",
    "fulfillmentCenterId"
})
@XmlRootElement(name = "ReturnItem")
public class ReturnItem extends AbstractMwsObject {

    @XmlElement(name="SellerReturnItemId",required=true)
    private String sellerReturnItemId;

    @XmlElement(name="SellerFulfillmentOrderItemId",required=true)
    private String sellerFulfillmentOrderItemId;

    @XmlElement(name="AmazonShipmentId",required=true)
    private String amazonShipmentId;

    @XmlElement(name="SellerReturnReasonCode",required=true)
    private String sellerReturnReasonCode;

    @XmlElement(name="ReturnComment")
    private String returnComment;

    @XmlElement(name="AmazonReturnReasonCode")
    private String amazonReturnReasonCode;

    @XmlElement(name="Status",required=true)
    private String status;

    @XmlElement(name="StatusChangedDate",required=true)
    private XMLGregorianCalendar statusChangedDate;

    @XmlElement(name="ReturnAuthorizationId")
    private String returnAuthorizationId;

    @XmlElement(name="ReturnReceivedCondition")
    private String returnReceivedCondition;

    @XmlElement(name="FulfillmentCenterId")
    private String fulfillmentCenterId;

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
    public ReturnItem withSellerReturnItemId(String sellerReturnItemId) {
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
    public ReturnItem withSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
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
    public ReturnItem withAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
        return this;
    }

    /**
     * Get the value of SellerReturnReasonCode.
     *
     * @return The value of SellerReturnReasonCode.
     */
    public String getSellerReturnReasonCode() {
        return sellerReturnReasonCode;
    }

    /**
     * Set the value of SellerReturnReasonCode.
     *
     * @param sellerReturnReasonCode
     *            The new value to set.
     */
    public void setSellerReturnReasonCode(String sellerReturnReasonCode) {
        this.sellerReturnReasonCode = sellerReturnReasonCode;
    }

    /**
     * Check to see if SellerReturnReasonCode is set.
     *
     * @return true if SellerReturnReasonCode is set.
     */
    public boolean isSetSellerReturnReasonCode() {
        return sellerReturnReasonCode != null;
    }

    /**
     * Set the value of SellerReturnReasonCode, return this.
     *
     * @param sellerReturnReasonCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnItem withSellerReturnReasonCode(String sellerReturnReasonCode) {
        this.sellerReturnReasonCode = sellerReturnReasonCode;
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
    public ReturnItem withReturnComment(String returnComment) {
        this.returnComment = returnComment;
        return this;
    }

    /**
     * Get the value of AmazonReturnReasonCode.
     *
     * @return The value of AmazonReturnReasonCode.
     */
    public String getAmazonReturnReasonCode() {
        return amazonReturnReasonCode;
    }

    /**
     * Set the value of AmazonReturnReasonCode.
     *
     * @param amazonReturnReasonCode
     *            The new value to set.
     */
    public void setAmazonReturnReasonCode(String amazonReturnReasonCode) {
        this.amazonReturnReasonCode = amazonReturnReasonCode;
    }

    /**
     * Check to see if AmazonReturnReasonCode is set.
     *
     * @return true if AmazonReturnReasonCode is set.
     */
    public boolean isSetAmazonReturnReasonCode() {
        return amazonReturnReasonCode != null;
    }

    /**
     * Set the value of AmazonReturnReasonCode, return this.
     *
     * @param amazonReturnReasonCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnItem withAmazonReturnReasonCode(String amazonReturnReasonCode) {
        this.amazonReturnReasonCode = amazonReturnReasonCode;
        return this;
    }

    /**
     * Get the value of Status.
     *
     * @return The value of Status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of Status.
     *
     * @param status
     *            The new value to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Check to see if Status is set.
     *
     * @return true if Status is set.
     */
    public boolean isSetStatus() {
        return status != null;
    }

    /**
     * Set the value of Status, return this.
     *
     * @param status
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the value of StatusChangedDate.
     *
     * @return The value of StatusChangedDate.
     */
    public XMLGregorianCalendar getStatusChangedDate() {
        return statusChangedDate;
    }

    /**
     * Set the value of StatusChangedDate.
     *
     * @param statusChangedDate
     *            The new value to set.
     */
    public void setStatusChangedDate(XMLGregorianCalendar statusChangedDate) {
        this.statusChangedDate = statusChangedDate;
    }

    /**
     * Check to see if StatusChangedDate is set.
     *
     * @return true if StatusChangedDate is set.
     */
    public boolean isSetStatusChangedDate() {
        return statusChangedDate != null;
    }

    /**
     * Set the value of StatusChangedDate, return this.
     *
     * @param statusChangedDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnItem withStatusChangedDate(XMLGregorianCalendar statusChangedDate) {
        this.statusChangedDate = statusChangedDate;
        return this;
    }

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
    public ReturnItem withReturnAuthorizationId(String returnAuthorizationId) {
        this.returnAuthorizationId = returnAuthorizationId;
        return this;
    }

    /**
     * Get the value of ReturnReceivedCondition.
     *
     * @return The value of ReturnReceivedCondition.
     */
    public String getReturnReceivedCondition() {
        return returnReceivedCondition;
    }

    /**
     * Set the value of ReturnReceivedCondition.
     *
     * @param returnReceivedCondition
     *            The new value to set.
     */
    public void setReturnReceivedCondition(String returnReceivedCondition) {
        this.returnReceivedCondition = returnReceivedCondition;
    }

    /**
     * Check to see if ReturnReceivedCondition is set.
     *
     * @return true if ReturnReceivedCondition is set.
     */
    public boolean isSetReturnReceivedCondition() {
        return returnReceivedCondition != null;
    }

    /**
     * Set the value of ReturnReceivedCondition, return this.
     *
     * @param returnReceivedCondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReturnItem withReturnReceivedCondition(String returnReceivedCondition) {
        this.returnReceivedCondition = returnReceivedCondition;
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
    public ReturnItem withFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
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
        sellerReturnReasonCode = r.read("SellerReturnReasonCode", String.class);
        returnComment = r.read("ReturnComment", String.class);
        amazonReturnReasonCode = r.read("AmazonReturnReasonCode", String.class);
        status = r.read("Status", String.class);
        statusChangedDate = r.read("StatusChangedDate", XMLGregorianCalendar.class);
        returnAuthorizationId = r.read("ReturnAuthorizationId", String.class);
        returnReceivedCondition = r.read("ReturnReceivedCondition", String.class);
        fulfillmentCenterId = r.read("FulfillmentCenterId", String.class);
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
        w.write("SellerReturnReasonCode", sellerReturnReasonCode);
        w.write("ReturnComment", returnComment);
        w.write("AmazonReturnReasonCode", amazonReturnReasonCode);
        w.write("Status", status);
        w.write("StatusChangedDate", statusChangedDate);
        w.write("ReturnAuthorizationId", returnAuthorizationId);
        w.write("ReturnReceivedCondition", returnReceivedCondition);
        w.write("FulfillmentCenterId", fulfillmentCenterId);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ReturnItem",this);
    }

    /** Value constructor. */
    public ReturnItem(String sellerReturnItemId,String sellerFulfillmentOrderItemId,String amazonShipmentId,String sellerReturnReasonCode,String status,XMLGregorianCalendar statusChangedDate) {
        this.sellerReturnItemId = sellerReturnItemId;
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        this.amazonShipmentId = amazonShipmentId;
        this.sellerReturnReasonCode = sellerReturnReasonCode;
        this.status = status;
        this.statusChangedDate = statusChangedDate;
    }

    /** Default constructor. */
    public ReturnItem() {
        super();
    }

}

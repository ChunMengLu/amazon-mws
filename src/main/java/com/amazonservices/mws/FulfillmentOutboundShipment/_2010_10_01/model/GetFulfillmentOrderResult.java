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
 * Get Fulfillment Order Result
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
 * GetFulfillmentOrderResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetFulfillmentOrderResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FulfillmentOrder" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentOrder"/&gt;
 *             &lt;element name="FulfillmentOrderItem" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentOrderItemList"/&gt;
 *             &lt;element name="FulfillmentShipment" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentShipmentList" minOccurs="0"/&gt;
 *             &lt;element name="ReturnItemList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ReturnItemList"/&gt;
 *             &lt;element name="ReturnAuthorizationList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ReturnAuthorizationList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetFulfillmentOrderResult", propOrder={
    "fulfillmentOrder",
    "fulfillmentOrderItem",
    "fulfillmentShipment",
    "returnItemList",
    "returnAuthorizationList"
})
@XmlRootElement(name = "GetFulfillmentOrderResult")
public class GetFulfillmentOrderResult extends AbstractMwsObject {

    @XmlElement(name="FulfillmentOrder",required=true)
    private FulfillmentOrder fulfillmentOrder;

    @XmlElement(name="FulfillmentOrderItem",required=true)
    private FulfillmentOrderItemList fulfillmentOrderItem;

    @XmlElement(name="FulfillmentShipment")
    private FulfillmentShipmentList fulfillmentShipment;

    @XmlElement(name="ReturnItemList",required=true)
    private ReturnItemList returnItemList;

    @XmlElement(name="ReturnAuthorizationList",required=true)
    private ReturnAuthorizationList returnAuthorizationList;

    /**
     * Get the value of FulfillmentOrder.
     *
     * @return The value of FulfillmentOrder.
     */
    public FulfillmentOrder getFulfillmentOrder() {
        return fulfillmentOrder;
    }

    /**
     * Set the value of FulfillmentOrder.
     *
     * @param fulfillmentOrder
     *            The new value to set.
     */
    public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
        this.fulfillmentOrder = fulfillmentOrder;
    }

    /**
     * Check to see if FulfillmentOrder is set.
     *
     * @return true if FulfillmentOrder is set.
     */
    public boolean isSetFulfillmentOrder() {
        return fulfillmentOrder != null;
    }

    /**
     * Set the value of FulfillmentOrder, return this.
     *
     * @param fulfillmentOrder
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentOrderResult withFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
        this.fulfillmentOrder = fulfillmentOrder;
        return this;
    }

    /**
     * Get the value of FulfillmentOrderItem.
     *
     * @return The value of FulfillmentOrderItem.
     */
    public FulfillmentOrderItemList getFulfillmentOrderItem() {
        return fulfillmentOrderItem;
    }

    /**
     * Set the value of FulfillmentOrderItem.
     *
     * @param fulfillmentOrderItem
     *            The new value to set.
     */
    public void setFulfillmentOrderItem(FulfillmentOrderItemList fulfillmentOrderItem) {
        this.fulfillmentOrderItem = fulfillmentOrderItem;
    }

    /**
     * Check to see if FulfillmentOrderItem is set.
     *
     * @return true if FulfillmentOrderItem is set.
     */
    public boolean isSetFulfillmentOrderItem() {
        return fulfillmentOrderItem != null;
    }

    /**
     * Set the value of FulfillmentOrderItem, return this.
     *
     * @param fulfillmentOrderItem
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentOrderResult withFulfillmentOrderItem(FulfillmentOrderItemList fulfillmentOrderItem) {
        this.fulfillmentOrderItem = fulfillmentOrderItem;
        return this;
    }

    /**
     * Get the value of FulfillmentShipment.
     *
     * @return The value of FulfillmentShipment.
     */
    public FulfillmentShipmentList getFulfillmentShipment() {
        return fulfillmentShipment;
    }

    /**
     * Set the value of FulfillmentShipment.
     *
     * @param fulfillmentShipment
     *            The new value to set.
     */
    public void setFulfillmentShipment(FulfillmentShipmentList fulfillmentShipment) {
        this.fulfillmentShipment = fulfillmentShipment;
    }

    /**
     * Check to see if FulfillmentShipment is set.
     *
     * @return true if FulfillmentShipment is set.
     */
    public boolean isSetFulfillmentShipment() {
        return fulfillmentShipment != null;
    }

    /**
     * Set the value of FulfillmentShipment, return this.
     *
     * @param fulfillmentShipment
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentOrderResult withFulfillmentShipment(FulfillmentShipmentList fulfillmentShipment) {
        this.fulfillmentShipment = fulfillmentShipment;
        return this;
    }

    /**
     * Get the value of ReturnItemList.
     *
     * @return The value of ReturnItemList.
     */
    public ReturnItemList getReturnItemList() {
        return returnItemList;
    }

    /**
     * Set the value of ReturnItemList.
     *
     * @param returnItemList
     *            The new value to set.
     */
    public void setReturnItemList(ReturnItemList returnItemList) {
        this.returnItemList = returnItemList;
    }

    /**
     * Check to see if ReturnItemList is set.
     *
     * @return true if ReturnItemList is set.
     */
    public boolean isSetReturnItemList() {
        return returnItemList != null;
    }

    /**
     * Set the value of ReturnItemList, return this.
     *
     * @param returnItemList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentOrderResult withReturnItemList(ReturnItemList returnItemList) {
        this.returnItemList = returnItemList;
        return this;
    }

    /**
     * Get the value of ReturnAuthorizationList.
     *
     * @return The value of ReturnAuthorizationList.
     */
    public ReturnAuthorizationList getReturnAuthorizationList() {
        return returnAuthorizationList;
    }

    /**
     * Set the value of ReturnAuthorizationList.
     *
     * @param returnAuthorizationList
     *            The new value to set.
     */
    public void setReturnAuthorizationList(ReturnAuthorizationList returnAuthorizationList) {
        this.returnAuthorizationList = returnAuthorizationList;
    }

    /**
     * Check to see if ReturnAuthorizationList is set.
     *
     * @return true if ReturnAuthorizationList is set.
     */
    public boolean isSetReturnAuthorizationList() {
        return returnAuthorizationList != null;
    }

    /**
     * Set the value of ReturnAuthorizationList, return this.
     *
     * @param returnAuthorizationList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentOrderResult withReturnAuthorizationList(ReturnAuthorizationList returnAuthorizationList) {
        this.returnAuthorizationList = returnAuthorizationList;
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
        fulfillmentOrder = r.read("FulfillmentOrder", FulfillmentOrder.class);
        fulfillmentOrderItem = r.read("FulfillmentOrderItem", FulfillmentOrderItemList.class);
        fulfillmentShipment = r.read("FulfillmentShipment", FulfillmentShipmentList.class);
        returnItemList = r.read("ReturnItemList", ReturnItemList.class);
        returnAuthorizationList = r.read("ReturnAuthorizationList", ReturnAuthorizationList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("FulfillmentOrder", fulfillmentOrder);
        w.write("FulfillmentOrderItem", fulfillmentOrderItem);
        w.write("FulfillmentShipment", fulfillmentShipment);
        w.write("ReturnItemList", returnItemList);
        w.write("ReturnAuthorizationList", returnAuthorizationList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "GetFulfillmentOrderResult",this);
    }

    /** Value constructor. */
    public GetFulfillmentOrderResult(FulfillmentOrder fulfillmentOrder,FulfillmentOrderItemList fulfillmentOrderItem,ReturnItemList returnItemList,ReturnAuthorizationList returnAuthorizationList) {
        this.fulfillmentOrder = fulfillmentOrder;
        this.fulfillmentOrderItem = fulfillmentOrderItem;
        this.returnItemList = returnItemList;
        this.returnAuthorizationList = returnAuthorizationList;
    }

    /** Default constructor. */
    public GetFulfillmentOrderResult() {
        super();
    }

}

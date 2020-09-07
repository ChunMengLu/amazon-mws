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
 * Update Fulfillment Order Item
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
 * UpdateFulfillmentOrderItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="UpdateFulfillmentOrderItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerFulfillmentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DisplayableComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentNetworkSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="OrderItemDisposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PerUnitDeclaredValue" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *             &lt;element name="PerUnitPrice" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *             &lt;element name="PerUnitTax" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="UpdateFulfillmentOrderItem", propOrder={
    "sellerSKU",
    "sellerFulfillmentOrderItemId",
    "quantity",
    "giftMessage",
    "displayableComment",
    "fulfillmentNetworkSKU",
    "orderItemDisposition",
    "perUnitDeclaredValue",
    "perUnitPrice",
    "perUnitTax"
})
@XmlRootElement(name = "UpdateFulfillmentOrderItem")
public class UpdateFulfillmentOrderItem extends AbstractMwsObject {

    @XmlElement(name="SellerSKU")
    private String sellerSKU;

    @XmlElement(name="SellerFulfillmentOrderItemId",required=true)
    private String sellerFulfillmentOrderItemId;

    @XmlElement(name="Quantity",required=true)
    private int quantity;

    @XmlElement(name="GiftMessage")
    private String giftMessage;

    @XmlElement(name="DisplayableComment")
    private String displayableComment;

    @XmlElement(name="FulfillmentNetworkSKU")
    private String fulfillmentNetworkSKU;

    @XmlElement(name="OrderItemDisposition")
    private String orderItemDisposition;

    @XmlElement(name="PerUnitDeclaredValue")
    private Currency perUnitDeclaredValue;

    @XmlElement(name="PerUnitPrice")
    private Currency perUnitPrice;

    @XmlElement(name="PerUnitTax")
    private Currency perUnitTax;

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
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
    public UpdateFulfillmentOrderItem withSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * Get the value of Quantity.
     *
     * @return The value of Quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of Quantity.
     *
     * @param quantity
     *            The new value to set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Set the value of Quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the value of GiftMessage.
     *
     * @return The value of GiftMessage.
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Set the value of GiftMessage.
     *
     * @param giftMessage
     *            The new value to set.
     */
    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    /**
     * Check to see if GiftMessage is set.
     *
     * @return true if GiftMessage is set.
     */
    public boolean isSetGiftMessage() {
        return giftMessage != null;
    }

    /**
     * Set the value of GiftMessage, return this.
     *
     * @param giftMessage
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
        return this;
    }

    /**
     * Get the value of DisplayableComment.
     *
     * @return The value of DisplayableComment.
     */
    public String getDisplayableComment() {
        return displayableComment;
    }

    /**
     * Set the value of DisplayableComment.
     *
     * @param displayableComment
     *            The new value to set.
     */
    public void setDisplayableComment(String displayableComment) {
        this.displayableComment = displayableComment;
    }

    /**
     * Check to see if DisplayableComment is set.
     *
     * @return true if DisplayableComment is set.
     */
    public boolean isSetDisplayableComment() {
        return displayableComment != null;
    }

    /**
     * Set the value of DisplayableComment, return this.
     *
     * @param displayableComment
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withDisplayableComment(String displayableComment) {
        this.displayableComment = displayableComment;
        return this;
    }

    /**
     * Get the value of FulfillmentNetworkSKU.
     *
     * @return The value of FulfillmentNetworkSKU.
     */
    public String getFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU;
    }

    /**
     * Set the value of FulfillmentNetworkSKU.
     *
     * @param fulfillmentNetworkSKU
     *            The new value to set.
     */
    public void setFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    }

    /**
     * Check to see if FulfillmentNetworkSKU is set.
     *
     * @return true if FulfillmentNetworkSKU is set.
     */
    public boolean isSetFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU != null;
    }

    /**
     * Set the value of FulfillmentNetworkSKU, return this.
     *
     * @param fulfillmentNetworkSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        return this;
    }

    /**
     * Get the value of OrderItemDisposition.
     *
     * @return The value of OrderItemDisposition.
     */
    public String getOrderItemDisposition() {
        return orderItemDisposition;
    }

    /**
     * Set the value of OrderItemDisposition.
     *
     * @param orderItemDisposition
     *            The new value to set.
     */
    public void setOrderItemDisposition(String orderItemDisposition) {
        this.orderItemDisposition = orderItemDisposition;
    }

    /**
     * Check to see if OrderItemDisposition is set.
     *
     * @return true if OrderItemDisposition is set.
     */
    public boolean isSetOrderItemDisposition() {
        return orderItemDisposition != null;
    }

    /**
     * Set the value of OrderItemDisposition, return this.
     *
     * @param orderItemDisposition
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withOrderItemDisposition(String orderItemDisposition) {
        this.orderItemDisposition = orderItemDisposition;
        return this;
    }

    /**
     * Get the value of PerUnitDeclaredValue.
     *
     * @return The value of PerUnitDeclaredValue.
     */
    public Currency getPerUnitDeclaredValue() {
        return perUnitDeclaredValue;
    }

    /**
     * Set the value of PerUnitDeclaredValue.
     *
     * @param perUnitDeclaredValue
     *            The new value to set.
     */
    public void setPerUnitDeclaredValue(Currency perUnitDeclaredValue) {
        this.perUnitDeclaredValue = perUnitDeclaredValue;
    }

    /**
     * Check to see if PerUnitDeclaredValue is set.
     *
     * @return true if PerUnitDeclaredValue is set.
     */
    public boolean isSetPerUnitDeclaredValue() {
        return perUnitDeclaredValue != null;
    }

    /**
     * Set the value of PerUnitDeclaredValue, return this.
     *
     * @param perUnitDeclaredValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withPerUnitDeclaredValue(Currency perUnitDeclaredValue) {
        this.perUnitDeclaredValue = perUnitDeclaredValue;
        return this;
    }

    /**
     * Get the value of PerUnitPrice.
     *
     * @return The value of PerUnitPrice.
     */
    public Currency getPerUnitPrice() {
        return perUnitPrice;
    }

    /**
     * Set the value of PerUnitPrice.
     *
     * @param perUnitPrice
     *            The new value to set.
     */
    public void setPerUnitPrice(Currency perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    /**
     * Check to see if PerUnitPrice is set.
     *
     * @return true if PerUnitPrice is set.
     */
    public boolean isSetPerUnitPrice() {
        return perUnitPrice != null;
    }

    /**
     * Set the value of PerUnitPrice, return this.
     *
     * @param perUnitPrice
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withPerUnitPrice(Currency perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
        return this;
    }

    /**
     * Get the value of PerUnitTax.
     *
     * @return The value of PerUnitTax.
     */
    public Currency getPerUnitTax() {
        return perUnitTax;
    }

    /**
     * Set the value of PerUnitTax.
     *
     * @param perUnitTax
     *            The new value to set.
     */
    public void setPerUnitTax(Currency perUnitTax) {
        this.perUnitTax = perUnitTax;
    }

    /**
     * Check to see if PerUnitTax is set.
     *
     * @return true if PerUnitTax is set.
     */
    public boolean isSetPerUnitTax() {
        return perUnitTax != null;
    }

    /**
     * Set the value of PerUnitTax, return this.
     *
     * @param perUnitTax
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateFulfillmentOrderItem withPerUnitTax(Currency perUnitTax) {
        this.perUnitTax = perUnitTax;
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
        sellerSKU = r.read("SellerSKU", String.class);
        sellerFulfillmentOrderItemId = r.read("SellerFulfillmentOrderItemId", String.class);
        quantity = r.read("Quantity", int.class);
        giftMessage = r.read("GiftMessage", String.class);
        displayableComment = r.read("DisplayableComment", String.class);
        fulfillmentNetworkSKU = r.read("FulfillmentNetworkSKU", String.class);
        orderItemDisposition = r.read("OrderItemDisposition", String.class);
        perUnitDeclaredValue = r.read("PerUnitDeclaredValue", Currency.class);
        perUnitPrice = r.read("PerUnitPrice", Currency.class);
        perUnitTax = r.read("PerUnitTax", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerSKU", sellerSKU);
        w.write("SellerFulfillmentOrderItemId", sellerFulfillmentOrderItemId);
        w.write("Quantity", quantity);
        w.write("GiftMessage", giftMessage);
        w.write("DisplayableComment", displayableComment);
        w.write("FulfillmentNetworkSKU", fulfillmentNetworkSKU);
        w.write("OrderItemDisposition", orderItemDisposition);
        w.write("PerUnitDeclaredValue", perUnitDeclaredValue);
        w.write("PerUnitPrice", perUnitPrice);
        w.write("PerUnitTax", perUnitTax);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "UpdateFulfillmentOrderItem",this);
    }

    /** Value constructor. */
    public UpdateFulfillmentOrderItem(String sellerFulfillmentOrderItemId,int quantity) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        this.quantity = quantity;
    }

    /** Default constructor. */
    public UpdateFulfillmentOrderItem() {
        super();
    }

}

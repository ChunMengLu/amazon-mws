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
 * Create Fulfillment Order Request
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
 * CreateFulfillmentOrderRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateFulfillmentOrderRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerFulfillmentOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DisplayableOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DisplayableOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="DisplayableOrderComment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingSpeedCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DeliveryWindow" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}DeliveryWindow" minOccurs="0"/&gt;
 *             &lt;element name="DestinationAddress" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Address"/&gt;
 *             &lt;element name="FulfillmentAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CODSettings" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}CODSettings" minOccurs="0"/&gt;
 *             &lt;element name="ShipFromCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="NotificationEmailList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}NotificationEmailList" minOccurs="0"/&gt;
 *             &lt;element name="Items" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}CreateFulfillmentOrderItemList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CreateFulfillmentOrderRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplace",
    "marketplaceId",
    "sellerFulfillmentOrderId",
    "displayableOrderId",
    "displayableOrderDateTime",
    "displayableOrderComment",
    "shippingSpeedCategory",
    "deliveryWindow",
    "destinationAddress",
    "fulfillmentAction",
    "fulfillmentPolicy",
    "fulfillmentMethod",
    "codSettings",
    "shipFromCountryCode",
    "notificationEmailList",
    "items"
})
@XmlRootElement(name = "CreateFulfillmentOrderRequest")
public class CreateFulfillmentOrderRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="Marketplace")
    private String marketplace;

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    @XmlElement(name="SellerFulfillmentOrderId",required=true)
    private String sellerFulfillmentOrderId;

    @XmlElement(name="DisplayableOrderId",required=true)
    private String displayableOrderId;

    @XmlElement(name="DisplayableOrderDateTime",required=true)
    private XMLGregorianCalendar displayableOrderDateTime;

    @XmlElement(name="DisplayableOrderComment",required=true)
    private String displayableOrderComment;

    @XmlElement(name="ShippingSpeedCategory",required=true)
    private String shippingSpeedCategory;

    @XmlElement(name="DeliveryWindow")
    private DeliveryWindow deliveryWindow;

    @XmlElement(name="DestinationAddress",required=true)
    private Address destinationAddress;

    @XmlElement(name="FulfillmentAction")
    private String fulfillmentAction;

    @XmlElement(name="FulfillmentPolicy")
    private String fulfillmentPolicy;

    @XmlElement(name="FulfillmentMethod")
    private String fulfillmentMethod;

    @XmlElement(name="CODSettings")
    private CODSettings codSettings;

    @XmlElement(name="ShipFromCountryCode")
    private String shipFromCountryCode;

    @XmlElement(name="NotificationEmailList")
    private NotificationEmailList notificationEmailList;

    @XmlElement(name="Items",required=true)
    private CreateFulfillmentOrderItemList items;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of Marketplace.
     *
     * @return The value of Marketplace.
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Set the value of Marketplace.
     *
     * @param marketplace
     *            The new value to set.
     */
    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * Check to see if Marketplace is set.
     *
     * @return true if Marketplace is set.
     */
    public boolean isSetMarketplace() {
        return marketplace != null;
    }

    /**
     * Set the value of Marketplace, return this.
     *
     * @param marketplace
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withMarketplace(String marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of SellerFulfillmentOrderId.
     *
     * @return The value of SellerFulfillmentOrderId.
     */
    public String getSellerFulfillmentOrderId() {
        return sellerFulfillmentOrderId;
    }

    /**
     * Set the value of SellerFulfillmentOrderId.
     *
     * @param sellerFulfillmentOrderId
     *            The new value to set.
     */
    public void setSellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
    }

    /**
     * Check to see if SellerFulfillmentOrderId is set.
     *
     * @return true if SellerFulfillmentOrderId is set.
     */
    public boolean isSetSellerFulfillmentOrderId() {
        return sellerFulfillmentOrderId != null;
    }

    /**
     * Set the value of SellerFulfillmentOrderId, return this.
     *
     * @param sellerFulfillmentOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withSellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        return this;
    }

    /**
     * Get the value of DisplayableOrderId.
     *
     * @return The value of DisplayableOrderId.
     */
    public String getDisplayableOrderId() {
        return displayableOrderId;
    }

    /**
     * Set the value of DisplayableOrderId.
     *
     * @param displayableOrderId
     *            The new value to set.
     */
    public void setDisplayableOrderId(String displayableOrderId) {
        this.displayableOrderId = displayableOrderId;
    }

    /**
     * Check to see if DisplayableOrderId is set.
     *
     * @return true if DisplayableOrderId is set.
     */
    public boolean isSetDisplayableOrderId() {
        return displayableOrderId != null;
    }

    /**
     * Set the value of DisplayableOrderId, return this.
     *
     * @param displayableOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withDisplayableOrderId(String displayableOrderId) {
        this.displayableOrderId = displayableOrderId;
        return this;
    }

    /**
     * Get the value of DisplayableOrderDateTime.
     *
     * @return The value of DisplayableOrderDateTime.
     */
    public XMLGregorianCalendar getDisplayableOrderDateTime() {
        return displayableOrderDateTime;
    }

    /**
     * Set the value of DisplayableOrderDateTime.
     *
     * @param displayableOrderDateTime
     *            The new value to set.
     */
    public void setDisplayableOrderDateTime(XMLGregorianCalendar displayableOrderDateTime) {
        this.displayableOrderDateTime = displayableOrderDateTime;
    }

    /**
     * Check to see if DisplayableOrderDateTime is set.
     *
     * @return true if DisplayableOrderDateTime is set.
     */
    public boolean isSetDisplayableOrderDateTime() {
        return displayableOrderDateTime != null;
    }

    /**
     * Set the value of DisplayableOrderDateTime, return this.
     *
     * @param displayableOrderDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withDisplayableOrderDateTime(XMLGregorianCalendar displayableOrderDateTime) {
        this.displayableOrderDateTime = displayableOrderDateTime;
        return this;
    }

    /**
     * Get the value of DisplayableOrderComment.
     *
     * @return The value of DisplayableOrderComment.
     */
    public String getDisplayableOrderComment() {
        return displayableOrderComment;
    }

    /**
     * Set the value of DisplayableOrderComment.
     *
     * @param displayableOrderComment
     *            The new value to set.
     */
    public void setDisplayableOrderComment(String displayableOrderComment) {
        this.displayableOrderComment = displayableOrderComment;
    }

    /**
     * Check to see if DisplayableOrderComment is set.
     *
     * @return true if DisplayableOrderComment is set.
     */
    public boolean isSetDisplayableOrderComment() {
        return displayableOrderComment != null;
    }

    /**
     * Set the value of DisplayableOrderComment, return this.
     *
     * @param displayableOrderComment
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withDisplayableOrderComment(String displayableOrderComment) {
        this.displayableOrderComment = displayableOrderComment;
        return this;
    }

    /**
     * Get the value of ShippingSpeedCategory.
     *
     * @return The value of ShippingSpeedCategory.
     */
    public String getShippingSpeedCategory() {
        return shippingSpeedCategory;
    }

    /**
     * Set the value of ShippingSpeedCategory.
     *
     * @param shippingSpeedCategory
     *            The new value to set.
     */
    public void setShippingSpeedCategory(String shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
    }

    /**
     * Check to see if ShippingSpeedCategory is set.
     *
     * @return true if ShippingSpeedCategory is set.
     */
    public boolean isSetShippingSpeedCategory() {
        return shippingSpeedCategory != null;
    }

    /**
     * Set the value of ShippingSpeedCategory, return this.
     *
     * @param shippingSpeedCategory
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withShippingSpeedCategory(String shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
        return this;
    }

    /**
     * Get the value of DeliveryWindow.
     *
     * @return The value of DeliveryWindow.
     */
    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }

    /**
     * Set the value of DeliveryWindow.
     *
     * @param deliveryWindow
     *            The new value to set.
     */
    public void setDeliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }

    /**
     * Check to see if DeliveryWindow is set.
     *
     * @return true if DeliveryWindow is set.
     */
    public boolean isSetDeliveryWindow() {
        return deliveryWindow != null;
    }

    /**
     * Set the value of DeliveryWindow, return this.
     *
     * @param deliveryWindow
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withDeliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
        return this;
    }

    /**
     * Get the value of DestinationAddress.
     *
     * @return The value of DestinationAddress.
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Set the value of DestinationAddress.
     *
     * @param destinationAddress
     *            The new value to set.
     */
    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    /**
     * Check to see if DestinationAddress is set.
     *
     * @return true if DestinationAddress is set.
     */
    public boolean isSetDestinationAddress() {
        return destinationAddress != null;
    }

    /**
     * Set the value of DestinationAddress, return this.
     *
     * @param destinationAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    /**
     * Get the value of FulfillmentAction.
     *
     * @return The value of FulfillmentAction.
     */
    public String getFulfillmentAction() {
        return fulfillmentAction;
    }

    /**
     * Set the value of FulfillmentAction.
     *
     * @param fulfillmentAction
     *            The new value to set.
     */
    public void setFulfillmentAction(String fulfillmentAction) {
        this.fulfillmentAction = fulfillmentAction;
    }

    /**
     * Check to see if FulfillmentAction is set.
     *
     * @return true if FulfillmentAction is set.
     */
    public boolean isSetFulfillmentAction() {
        return fulfillmentAction != null;
    }

    /**
     * Set the value of FulfillmentAction, return this.
     *
     * @param fulfillmentAction
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withFulfillmentAction(String fulfillmentAction) {
        this.fulfillmentAction = fulfillmentAction;
        return this;
    }

    /**
     * Get the value of FulfillmentPolicy.
     *
     * @return The value of FulfillmentPolicy.
     */
    public String getFulfillmentPolicy() {
        return fulfillmentPolicy;
    }

    /**
     * Set the value of FulfillmentPolicy.
     *
     * @param fulfillmentPolicy
     *            The new value to set.
     */
    public void setFulfillmentPolicy(String fulfillmentPolicy) {
        this.fulfillmentPolicy = fulfillmentPolicy;
    }

    /**
     * Check to see if FulfillmentPolicy is set.
     *
     * @return true if FulfillmentPolicy is set.
     */
    public boolean isSetFulfillmentPolicy() {
        return fulfillmentPolicy != null;
    }

    /**
     * Set the value of FulfillmentPolicy, return this.
     *
     * @param fulfillmentPolicy
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withFulfillmentPolicy(String fulfillmentPolicy) {
        this.fulfillmentPolicy = fulfillmentPolicy;
        return this;
    }

    /**
     * Get the value of FulfillmentMethod.
     *
     * @return The value of FulfillmentMethod.
     */
    public String getFulfillmentMethod() {
        return fulfillmentMethod;
    }

    /**
     * Set the value of FulfillmentMethod.
     *
     * @param fulfillmentMethod
     *            The new value to set.
     */
    public void setFulfillmentMethod(String fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
    }

    /**
     * Check to see if FulfillmentMethod is set.
     *
     * @return true if FulfillmentMethod is set.
     */
    public boolean isSetFulfillmentMethod() {
        return fulfillmentMethod != null;
    }

    /**
     * Set the value of FulfillmentMethod, return this.
     *
     * @param fulfillmentMethod
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withFulfillmentMethod(String fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
        return this;
    }

    /**
     * Get the value of CODSettings.
     *
     * @return The value of CODSettings.
     */
    public CODSettings getCODSettings() {
        return codSettings;
    }

    /**
     * Set the value of CODSettings.
     *
     * @param codSettings
     *            The new value to set.
     */
    public void setCODSettings(CODSettings codSettings) {
        this.codSettings = codSettings;
    }

    /**
     * Check to see if CODSettings is set.
     *
     * @return true if CODSettings is set.
     */
    public boolean isSetCODSettings() {
        return codSettings != null;
    }

    /**
     * Set the value of CODSettings, return this.
     *
     * @param codSettings
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withCODSettings(CODSettings codSettings) {
        this.codSettings = codSettings;
        return this;
    }

    /**
     * Get the value of ShipFromCountryCode.
     *
     * @return The value of ShipFromCountryCode.
     */
    public String getShipFromCountryCode() {
        return shipFromCountryCode;
    }

    /**
     * Set the value of ShipFromCountryCode.
     *
     * @param shipFromCountryCode
     *            The new value to set.
     */
    public void setShipFromCountryCode(String shipFromCountryCode) {
        this.shipFromCountryCode = shipFromCountryCode;
    }

    /**
     * Check to see if ShipFromCountryCode is set.
     *
     * @return true if ShipFromCountryCode is set.
     */
    public boolean isSetShipFromCountryCode() {
        return shipFromCountryCode != null;
    }

    /**
     * Set the value of ShipFromCountryCode, return this.
     *
     * @param shipFromCountryCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withShipFromCountryCode(String shipFromCountryCode) {
        this.shipFromCountryCode = shipFromCountryCode;
        return this;
    }

    /**
     * Get the value of NotificationEmailList.
     *
     * @return The value of NotificationEmailList.
     */
    public NotificationEmailList getNotificationEmailList() {
        return notificationEmailList;
    }

    /**
     * Set the value of NotificationEmailList.
     *
     * @param notificationEmailList
     *            The new value to set.
     */
    public void setNotificationEmailList(NotificationEmailList notificationEmailList) {
        this.notificationEmailList = notificationEmailList;
    }

    /**
     * Check to see if NotificationEmailList is set.
     *
     * @return true if NotificationEmailList is set.
     */
    public boolean isSetNotificationEmailList() {
        return notificationEmailList != null;
    }

    /**
     * Set the value of NotificationEmailList, return this.
     *
     * @param notificationEmailList
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withNotificationEmailList(NotificationEmailList notificationEmailList) {
        this.notificationEmailList = notificationEmailList;
        return this;
    }

    /**
     * Get the value of Items.
     *
     * @return The value of Items.
     */
    public CreateFulfillmentOrderItemList getItems() {
        return items;
    }

    /**
     * Set the value of Items.
     *
     * @param items
     *            The new value to set.
     */
    public void setItems(CreateFulfillmentOrderItemList items) {
        this.items = items;
    }

    /**
     * Check to see if Items is set.
     *
     * @return true if Items is set.
     */
    public boolean isSetItems() {
        return items != null;
    }

    /**
     * Set the value of Items, return this.
     *
     * @param items
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentOrderRequest withItems(CreateFulfillmentOrderItemList items) {
        this.items = items;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        marketplace = r.read("Marketplace", String.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        sellerFulfillmentOrderId = r.read("SellerFulfillmentOrderId", String.class);
        displayableOrderId = r.read("DisplayableOrderId", String.class);
        displayableOrderDateTime = r.read("DisplayableOrderDateTime", XMLGregorianCalendar.class);
        displayableOrderComment = r.read("DisplayableOrderComment", String.class);
        shippingSpeedCategory = r.read("ShippingSpeedCategory", String.class);
        deliveryWindow = r.read("DeliveryWindow", DeliveryWindow.class);
        destinationAddress = r.read("DestinationAddress", Address.class);
        fulfillmentAction = r.read("FulfillmentAction", String.class);
        fulfillmentPolicy = r.read("FulfillmentPolicy", String.class);
        fulfillmentMethod = r.read("FulfillmentMethod", String.class);
        codSettings = r.read("CODSettings", CODSettings.class);
        shipFromCountryCode = r.read("ShipFromCountryCode", String.class);
        notificationEmailList = r.read("NotificationEmailList", NotificationEmailList.class);
        items = r.read("Items", CreateFulfillmentOrderItemList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("Marketplace", marketplace);
        w.write("MarketplaceId", marketplaceId);
        w.write("SellerFulfillmentOrderId", sellerFulfillmentOrderId);
        w.write("DisplayableOrderId", displayableOrderId);
        w.write("DisplayableOrderDateTime", displayableOrderDateTime);
        w.write("DisplayableOrderComment", displayableOrderComment);
        w.write("ShippingSpeedCategory", shippingSpeedCategory);
        w.write("DeliveryWindow", deliveryWindow);
        w.write("DestinationAddress", destinationAddress);
        w.write("FulfillmentAction", fulfillmentAction);
        w.write("FulfillmentPolicy", fulfillmentPolicy);
        w.write("FulfillmentMethod", fulfillmentMethod);
        w.write("CODSettings", codSettings);
        w.write("ShipFromCountryCode", shipFromCountryCode);
        w.write("NotificationEmailList", notificationEmailList);
        w.write("Items", items);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "CreateFulfillmentOrderRequest",this);
    }

    /** Value constructor. */
    public CreateFulfillmentOrderRequest(String sellerId,String sellerFulfillmentOrderId,String displayableOrderId,XMLGregorianCalendar displayableOrderDateTime,String displayableOrderComment,String shippingSpeedCategory,Address destinationAddress,CreateFulfillmentOrderItemList items) {
        this.sellerId = sellerId;
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.items = items;
    }

    /**
     * Value constructor
     *
     */
    public CreateFulfillmentOrderRequest(final String sellerId, final String marketplace, final String sellerFulfillmentOrderId, final String displayableOrderId, final XMLGregorianCalendar displayableOrderDateTime, final String displayableOrderComment, final String shippingSpeedCategory, final Address destinationAddress, final String fulfillmentPolicy, final String fulfillmentMethod, final String shipFromCountryCode, final NotificationEmailList notificationEmailList, final CreateFulfillmentOrderItemList items ) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.fulfillmentPolicy = fulfillmentPolicy;
        this.fulfillmentMethod = fulfillmentMethod;
        this.shipFromCountryCode = shipFromCountryCode;
        this.notificationEmailList = notificationEmailList;
        this.items = items;
    }

    /**
     * Value constructor
     *
     */
    public CreateFulfillmentOrderRequest(final String sellerId, final String mwsAuthToken, final String marketplace, final String sellerFulfillmentOrderId, final String displayableOrderId, final XMLGregorianCalendar displayableOrderDateTime, final String displayableOrderComment, final String shippingSpeedCategory, final Address destinationAddress, final String fulfillmentPolicy, final String fulfillmentMethod, final String shipFromCountryCode, final NotificationEmailList notificationEmailList, final CreateFulfillmentOrderItemList items ) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.fulfillmentPolicy = fulfillmentPolicy;
        this.fulfillmentMethod = fulfillmentMethod;
        this.shipFromCountryCode = shipFromCountryCode;
        this.notificationEmailList = notificationEmailList;
        this.items = items;
    }


    /**
     * Value constructor
     *
     */
    public CreateFulfillmentOrderRequest(final String sellerId, final String marketplace, final String sellerFulfillmentOrderId, final String displayableOrderId, final XMLGregorianCalendar displayableOrderDateTime, final String displayableOrderComment, final String shippingSpeedCategory, final Address destinationAddress, final String fulfillmentPolicy, final String fulfillmentMethod, final String shipFromCountryCode, final NotificationEmailList notificationEmailList, final CreateFulfillmentOrderItemList items, CODSettings cODSettings) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.fulfillmentPolicy = fulfillmentPolicy;
        this.fulfillmentMethod = fulfillmentMethod;
        this.shipFromCountryCode = shipFromCountryCode;
        this.notificationEmailList = notificationEmailList;
        this.items = items;
        this.codSettings = cODSettings;
    }

    /** Value constructor
     *
     */
    public CreateFulfillmentOrderRequest(final String sellerId, final String mwsAuthToken,final String marketplace, final String sellerFulfillmentOrderId, final String displayableOrderId, final XMLGregorianCalendar displayableOrderDateTime, final String displayableOrderComment, final String shippingSpeedCategory, final Address destinationAddress, final String fulfillmentPolicy, final String fulfillmentMethod, final String shipFromCountryCode, final NotificationEmailList notificationEmailList, final CreateFulfillmentOrderItemList items, CODSettings cODSettings) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.fulfillmentPolicy = fulfillmentPolicy;
        this.fulfillmentMethod = fulfillmentMethod;
        this.shipFromCountryCode = shipFromCountryCode;
        this.notificationEmailList = notificationEmailList;
        this.items = items;
        this.codSettings = cODSettings;
    }

    /** Default constructor. */
    public CreateFulfillmentOrderRequest() {
        super();
    }

}

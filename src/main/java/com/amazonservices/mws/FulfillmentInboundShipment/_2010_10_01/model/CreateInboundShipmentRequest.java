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
 * Create Inbound Shipment Request
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
 * CreateInboundShipmentRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateInboundShipmentRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="InboundShipmentHeader" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InboundShipmentHeader"/&gt;
 *             &lt;element name="InboundShipmentItems" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InboundShipmentItemList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CreateInboundShipmentRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplace",
    "shipmentId",
    "inboundShipmentHeader",
    "inboundShipmentItems"
})
@XmlRootElement(name = "CreateInboundShipmentRequest")
public class CreateInboundShipmentRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="Marketplace")
    private String marketplace;

    @XmlElement(name="ShipmentId")
    private String shipmentId;

    @XmlElement(name="InboundShipmentHeader",required=true)
    private InboundShipmentHeader inboundShipmentHeader;

    @XmlElement(name="InboundShipmentItems",required=true)
    private InboundShipmentItemList inboundShipmentItems;

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
    public CreateInboundShipmentRequest withSellerId(String sellerId) {
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
    public CreateInboundShipmentRequest withMWSAuthToken(String mwsAuthToken) {
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
    public CreateInboundShipmentRequest withMarketplace(String marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get the value of ShipmentId.
     *
     * @return The value of ShipmentId.
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Set the value of ShipmentId.
     *
     * @param shipmentId
     *            The new value to set.
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    /**
     * Check to see if ShipmentId is set.
     *
     * @return true if ShipmentId is set.
     */
    public boolean isSetShipmentId() {
        return shipmentId != null;
    }

    /**
     * Set the value of ShipmentId, return this.
     *
     * @param shipmentId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentRequest withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Get the value of InboundShipmentHeader.
     *
     * @return The value of InboundShipmentHeader.
     */
    public InboundShipmentHeader getInboundShipmentHeader() {
        return inboundShipmentHeader;
    }

    /**
     * Set the value of InboundShipmentHeader.
     *
     * @param inboundShipmentHeader
     *            The new value to set.
     */
    public void setInboundShipmentHeader(InboundShipmentHeader inboundShipmentHeader) {
        this.inboundShipmentHeader = inboundShipmentHeader;
    }

    /**
     * Check to see if InboundShipmentHeader is set.
     *
     * @return true if InboundShipmentHeader is set.
     */
    public boolean isSetInboundShipmentHeader() {
        return inboundShipmentHeader != null;
    }

    /**
     * Set the value of InboundShipmentHeader, return this.
     *
     * @param inboundShipmentHeader
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentRequest withInboundShipmentHeader(InboundShipmentHeader inboundShipmentHeader) {
        this.inboundShipmentHeader = inboundShipmentHeader;
        return this;
    }

    /**
     * Get the value of InboundShipmentItems.
     *
     * @return The value of InboundShipmentItems.
     */
    public InboundShipmentItemList getInboundShipmentItems() {
        return inboundShipmentItems;
    }

    /**
     * Set the value of InboundShipmentItems.
     *
     * @param inboundShipmentItems
     *            The new value to set.
     */
    public void setInboundShipmentItems(InboundShipmentItemList inboundShipmentItems) {
        this.inboundShipmentItems = inboundShipmentItems;
    }

    /**
     * Check to see if InboundShipmentItems is set.
     *
     * @return true if InboundShipmentItems is set.
     */
    public boolean isSetInboundShipmentItems() {
        return inboundShipmentItems != null;
    }

    /**
     * Set the value of InboundShipmentItems, return this.
     *
     * @param inboundShipmentItems
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentRequest withInboundShipmentItems(InboundShipmentItemList inboundShipmentItems) {
        this.inboundShipmentItems = inboundShipmentItems;
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
        shipmentId = r.read("ShipmentId", String.class);
        inboundShipmentHeader = r.read("InboundShipmentHeader", InboundShipmentHeader.class);
        inboundShipmentItems = r.read("InboundShipmentItems", InboundShipmentItemList.class);
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
        w.write("ShipmentId", shipmentId);
        w.write("InboundShipmentHeader", inboundShipmentHeader);
        w.write("InboundShipmentItems", inboundShipmentItems);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "CreateInboundShipmentRequest",this);
    }

    /** Value constructor. */
    public CreateInboundShipmentRequest(String sellerId,String mwsAuthToken,String marketplace,String shipmentId,InboundShipmentHeader inboundShipmentHeader,InboundShipmentItemList inboundShipmentItems) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.shipmentId = shipmentId;
        this.inboundShipmentHeader = inboundShipmentHeader;
        this.inboundShipmentItems = inboundShipmentItems;
    }

    /** Legacy value constructor. */
    public CreateInboundShipmentRequest(String sellerId,String marketplace,String shipmentId,InboundShipmentHeader inboundShipmentHeader,InboundShipmentItemList inboundShipmentItems) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.shipmentId = shipmentId;
        this.inboundShipmentHeader = inboundShipmentHeader;
        this.inboundShipmentItems = inboundShipmentItems;
    }

    /** Value constructor. */
    public CreateInboundShipmentRequest(String sellerId,InboundShipmentHeader inboundShipmentHeader,InboundShipmentItemList inboundShipmentItems) {
        this.sellerId = sellerId;
        this.inboundShipmentHeader = inboundShipmentHeader;
        this.inboundShipmentItems = inboundShipmentItems;
    }

    /** Default constructor. */
    public CreateInboundShipmentRequest() {
        super();
    }

}

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
 * List Inbound Shipments Request
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * ListInboundShipmentsRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListInboundShipmentsRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentStatusList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ShipmentStatusList" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentIdList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ShipmentIdList" minOccurs="0"/&gt;
 *             &lt;element name="LastUpdatedBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="LastUpdatedAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListInboundShipmentsRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplace",
    "shipmentStatusList",
    "shipmentIdList",
    "lastUpdatedBefore",
    "lastUpdatedAfter"
})
@XmlRootElement(name = "ListInboundShipmentsRequest")
public class ListInboundShipmentsRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="Marketplace")
    private String marketplace;

    @XmlElement(name="ShipmentStatusList")
    private ShipmentStatusList shipmentStatusList;

    @XmlElement(name="ShipmentIdList")
    private ShipmentIdList shipmentIdList;

    @XmlElement(name="LastUpdatedBefore")
    private XMLGregorianCalendar lastUpdatedBefore;

    @XmlElement(name="LastUpdatedAfter")
    private XMLGregorianCalendar lastUpdatedAfter;

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
    public ListInboundShipmentsRequest withSellerId(String sellerId) {
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
    public ListInboundShipmentsRequest withMWSAuthToken(String mwsAuthToken) {
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
    public ListInboundShipmentsRequest withMarketplace(String marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get the value of ShipmentStatusList.
     *
     * @return The value of ShipmentStatusList.
     */
    public ShipmentStatusList getShipmentStatusList() {
        return shipmentStatusList;
    }

    /**
     * Set the value of ShipmentStatusList.
     *
     * @param shipmentStatusList
     *            The new value to set.
     */
    public void setShipmentStatusList(ShipmentStatusList shipmentStatusList) {
        this.shipmentStatusList = shipmentStatusList;
    }

    /**
     * Check to see if ShipmentStatusList is set.
     *
     * @return true if ShipmentStatusList is set.
     */
    public boolean isSetShipmentStatusList() {
        return shipmentStatusList != null;
    }

    /**
     * Set the value of ShipmentStatusList, return this.
     *
     * @param shipmentStatusList
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInboundShipmentsRequest withShipmentStatusList(ShipmentStatusList shipmentStatusList) {
        this.shipmentStatusList = shipmentStatusList;
        return this;
    }

    /**
     * Get the value of ShipmentIdList.
     *
     * @return The value of ShipmentIdList.
     */
    public ShipmentIdList getShipmentIdList() {
        return shipmentIdList;
    }

    /**
     * Set the value of ShipmentIdList.
     *
     * @param shipmentIdList
     *            The new value to set.
     */
    public void setShipmentIdList(ShipmentIdList shipmentIdList) {
        this.shipmentIdList = shipmentIdList;
    }

    /**
     * Check to see if ShipmentIdList is set.
     *
     * @return true if ShipmentIdList is set.
     */
    public boolean isSetShipmentIdList() {
        return shipmentIdList != null;
    }

    /**
     * Set the value of ShipmentIdList, return this.
     *
     * @param shipmentIdList
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInboundShipmentsRequest withShipmentIdList(ShipmentIdList shipmentIdList) {
        this.shipmentIdList = shipmentIdList;
        return this;
    }

    /**
     * Get the value of LastUpdatedBefore.
     *
     * @return The value of LastUpdatedBefore.
     */
    public XMLGregorianCalendar getLastUpdatedBefore() {
        return lastUpdatedBefore;
    }

    /**
     * Set the value of LastUpdatedBefore.
     *
     * @param lastUpdatedBefore
     *            The new value to set.
     */
    public void setLastUpdatedBefore(XMLGregorianCalendar lastUpdatedBefore) {
        this.lastUpdatedBefore = lastUpdatedBefore;
    }

    /**
     * Check to see if LastUpdatedBefore is set.
     *
     * @return true if LastUpdatedBefore is set.
     */
    public boolean isSetLastUpdatedBefore() {
        return lastUpdatedBefore != null;
    }

    /**
     * Set the value of LastUpdatedBefore, return this.
     *
     * @param lastUpdatedBefore
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInboundShipmentsRequest withLastUpdatedBefore(XMLGregorianCalendar lastUpdatedBefore) {
        this.lastUpdatedBefore = lastUpdatedBefore;
        return this;
    }

    /**
     * Get the value of LastUpdatedAfter.
     *
     * @return The value of LastUpdatedAfter.
     */
    public XMLGregorianCalendar getLastUpdatedAfter() {
        return lastUpdatedAfter;
    }

    /**
     * Set the value of LastUpdatedAfter.
     *
     * @param lastUpdatedAfter
     *            The new value to set.
     */
    public void setLastUpdatedAfter(XMLGregorianCalendar lastUpdatedAfter) {
        this.lastUpdatedAfter = lastUpdatedAfter;
    }

    /**
     * Check to see if LastUpdatedAfter is set.
     *
     * @return true if LastUpdatedAfter is set.
     */
    public boolean isSetLastUpdatedAfter() {
        return lastUpdatedAfter != null;
    }

    /**
     * Set the value of LastUpdatedAfter, return this.
     *
     * @param lastUpdatedAfter
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInboundShipmentsRequest withLastUpdatedAfter(XMLGregorianCalendar lastUpdatedAfter) {
        this.lastUpdatedAfter = lastUpdatedAfter;
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
        shipmentStatusList = r.read("ShipmentStatusList", ShipmentStatusList.class);
        shipmentIdList = r.read("ShipmentIdList", ShipmentIdList.class);
        lastUpdatedBefore = r.read("LastUpdatedBefore", XMLGregorianCalendar.class);
        lastUpdatedAfter = r.read("LastUpdatedAfter", XMLGregorianCalendar.class);
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
        w.write("ShipmentStatusList", shipmentStatusList);
        w.write("ShipmentIdList", shipmentIdList);
        w.write("LastUpdatedBefore", lastUpdatedBefore);
        w.write("LastUpdatedAfter", lastUpdatedAfter);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ListInboundShipmentsRequest",this);
    }

    /** Value constructor. */
    public ListInboundShipmentsRequest(String sellerId,String mwsAuthToken,String marketplace,ShipmentStatusList shipmentStatusList,ShipmentIdList shipmentIdList,XMLGregorianCalendar lastUpdatedBefore,XMLGregorianCalendar lastUpdatedAfter) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.shipmentStatusList = shipmentStatusList;
        this.shipmentIdList = shipmentIdList;
        this.lastUpdatedBefore = lastUpdatedBefore;
        this.lastUpdatedAfter = lastUpdatedAfter;
    }

    /** Legacy value constructor. */
    public ListInboundShipmentsRequest(String sellerId,String marketplace,ShipmentStatusList shipmentStatusList,ShipmentIdList shipmentIdList,XMLGregorianCalendar lastUpdatedBefore,XMLGregorianCalendar lastUpdatedAfter) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.shipmentStatusList = shipmentStatusList;
        this.shipmentIdList = shipmentIdList;
        this.lastUpdatedBefore = lastUpdatedBefore;
        this.lastUpdatedAfter = lastUpdatedAfter;
    }

    /** Value constructor. */
    public ListInboundShipmentsRequest(String sellerId) {
        this.sellerId = sellerId;
    }

    /** Default constructor. */
    public ListInboundShipmentsRequest() {
        super();
    }

}

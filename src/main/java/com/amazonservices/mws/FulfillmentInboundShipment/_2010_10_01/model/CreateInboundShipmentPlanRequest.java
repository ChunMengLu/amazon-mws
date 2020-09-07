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
 * Create Inbound Shipment Plan Request
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
 * CreateInboundShipmentPlanRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateInboundShipmentPlanRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipFromAddress" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Address"/&gt;
 *             &lt;element name="LabelPrepPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipToCountrySubdivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="InboundShipmentPlanRequestItems" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InboundShipmentPlanRequestItemList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CreateInboundShipmentPlanRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplace",
    "shipFromAddress",
    "labelPrepPreference",
    "shipToCountryCode",
    "shipToCountrySubdivisionCode",
    "inboundShipmentPlanRequestItems"
})
@XmlRootElement(name = "CreateInboundShipmentPlanRequest")
public class CreateInboundShipmentPlanRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="Marketplace")
    private String marketplace;

    @XmlElement(name="ShipFromAddress",required=true)
    private Address shipFromAddress;

    @XmlElement(name="LabelPrepPreference")
    private String labelPrepPreference;

    @XmlElement(name="ShipToCountryCode")
    private String shipToCountryCode;

    @XmlElement(name="ShipToCountrySubdivisionCode")
    private String shipToCountrySubdivisionCode;

    @XmlElement(name="InboundShipmentPlanRequestItems",required=true)
    private InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems;

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
    public CreateInboundShipmentPlanRequest withSellerId(String sellerId) {
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
    public CreateInboundShipmentPlanRequest withMWSAuthToken(String mwsAuthToken) {
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
    public CreateInboundShipmentPlanRequest withMarketplace(String marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get the value of ShipFromAddress.
     *
     * @return The value of ShipFromAddress.
     */
    public Address getShipFromAddress() {
        return shipFromAddress;
    }

    /**
     * Set the value of ShipFromAddress.
     *
     * @param shipFromAddress
     *            The new value to set.
     */
    public void setShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    /**
     * Check to see if ShipFromAddress is set.
     *
     * @return true if ShipFromAddress is set.
     */
    public boolean isSetShipFromAddress() {
        return shipFromAddress != null;
    }

    /**
     * Set the value of ShipFromAddress, return this.
     *
     * @param shipFromAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentPlanRequest withShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
        return this;
    }

    /**
     * Get the value of LabelPrepPreference.
     *
     * @return The value of LabelPrepPreference.
     */
    public String getLabelPrepPreference() {
        return labelPrepPreference;
    }

    /**
     * Set the value of LabelPrepPreference.
     *
     * @param labelPrepPreference
     *            The new value to set.
     */
    public void setLabelPrepPreference(String labelPrepPreference) {
        this.labelPrepPreference = labelPrepPreference;
    }

    /**
     * Check to see if LabelPrepPreference is set.
     *
     * @return true if LabelPrepPreference is set.
     */
    public boolean isSetLabelPrepPreference() {
        return labelPrepPreference != null;
    }

    /**
     * Set the value of LabelPrepPreference, return this.
     *
     * @param labelPrepPreference
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentPlanRequest withLabelPrepPreference(String labelPrepPreference) {
        this.labelPrepPreference = labelPrepPreference;
        return this;
    }

    /**
     * Get the value of ShipToCountryCode.
     *
     * @return The value of ShipToCountryCode.
     */
    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    /**
     * Set the value of ShipToCountryCode.
     *
     * @param shipToCountryCode
     *            The new value to set.
     */
    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    /**
     * Check to see if ShipToCountryCode is set.
     *
     * @return true if ShipToCountryCode is set.
     */
    public boolean isSetShipToCountryCode() {
        return shipToCountryCode != null;
    }

    /**
     * Set the value of ShipToCountryCode, return this.
     *
     * @param shipToCountryCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentPlanRequest withShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
        return this;
    }

    /**
     * Get the value of ShipToCountrySubdivisionCode.
     *
     * @return The value of ShipToCountrySubdivisionCode.
     */
    public String getShipToCountrySubdivisionCode() {
        return shipToCountrySubdivisionCode;
    }

    /**
     * Set the value of ShipToCountrySubdivisionCode.
     *
     * @param shipToCountrySubdivisionCode
     *            The new value to set.
     */
    public void setShipToCountrySubdivisionCode(String shipToCountrySubdivisionCode) {
        this.shipToCountrySubdivisionCode = shipToCountrySubdivisionCode;
    }

    /**
     * Check to see if ShipToCountrySubdivisionCode is set.
     *
     * @return true if ShipToCountrySubdivisionCode is set.
     */
    public boolean isSetShipToCountrySubdivisionCode() {
        return shipToCountrySubdivisionCode != null;
    }

    /**
     * Set the value of ShipToCountrySubdivisionCode, return this.
     *
     * @param shipToCountrySubdivisionCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentPlanRequest withShipToCountrySubdivisionCode(String shipToCountrySubdivisionCode) {
        this.shipToCountrySubdivisionCode = shipToCountrySubdivisionCode;
        return this;
    }

    /**
     * Get the value of InboundShipmentPlanRequestItems.
     *
     * @return The value of InboundShipmentPlanRequestItems.
     */
    public InboundShipmentPlanRequestItemList getInboundShipmentPlanRequestItems() {
        return inboundShipmentPlanRequestItems;
    }

    /**
     * Set the value of InboundShipmentPlanRequestItems.
     *
     * @param inboundShipmentPlanRequestItems
     *            The new value to set.
     */
    public void setInboundShipmentPlanRequestItems(InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems) {
        this.inboundShipmentPlanRequestItems = inboundShipmentPlanRequestItems;
    }

    /**
     * Check to see if InboundShipmentPlanRequestItems is set.
     *
     * @return true if InboundShipmentPlanRequestItems is set.
     */
    public boolean isSetInboundShipmentPlanRequestItems() {
        return inboundShipmentPlanRequestItems != null;
    }

    /**
     * Set the value of InboundShipmentPlanRequestItems, return this.
     *
     * @param inboundShipmentPlanRequestItems
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateInboundShipmentPlanRequest withInboundShipmentPlanRequestItems(InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems) {
        this.inboundShipmentPlanRequestItems = inboundShipmentPlanRequestItems;
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
        shipFromAddress = r.read("ShipFromAddress", Address.class);
        labelPrepPreference = r.read("LabelPrepPreference", String.class);
        shipToCountryCode = r.read("ShipToCountryCode", String.class);
        shipToCountrySubdivisionCode = r.read("ShipToCountrySubdivisionCode", String.class);
        inboundShipmentPlanRequestItems = r.read("InboundShipmentPlanRequestItems", InboundShipmentPlanRequestItemList.class);
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
        w.write("ShipFromAddress", shipFromAddress);
        w.write("LabelPrepPreference", labelPrepPreference);
        w.write("ShipToCountryCode", shipToCountryCode);
        w.write("ShipToCountrySubdivisionCode", shipToCountrySubdivisionCode);
        w.write("InboundShipmentPlanRequestItems", inboundShipmentPlanRequestItems);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "CreateInboundShipmentPlanRequest",this);
    }

    /** Value constructor. */
    public CreateInboundShipmentPlanRequest(String sellerId,String mwsAuthToken,String marketplace,Address shipFromAddress,String labelPrepPreference,String shipToCountryCode,String shipToCountrySubdivisionCode,InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.shipFromAddress = shipFromAddress;
        this.labelPrepPreference = labelPrepPreference;
        this.shipToCountryCode = shipToCountryCode;
        this.shipToCountrySubdivisionCode = shipToCountrySubdivisionCode;
        this.inboundShipmentPlanRequestItems = inboundShipmentPlanRequestItems;
    }

    /** Legacy value constructor. */
    public CreateInboundShipmentPlanRequest(String sellerId,String marketplace,Address shipFromAddress,String labelPrepPreference,String shipToCountryCode,String shipToCountrySubdivisionCode,InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.shipFromAddress = shipFromAddress;
        this.labelPrepPreference = labelPrepPreference;
        this.shipToCountryCode = shipToCountryCode;
        this.shipToCountrySubdivisionCode = shipToCountrySubdivisionCode;
        this.inboundShipmentPlanRequestItems = inboundShipmentPlanRequestItems;
    }

    /** Value constructor. */
    public CreateInboundShipmentPlanRequest(String sellerId,Address shipFromAddress,InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems) {
        this.sellerId = sellerId;
        this.shipFromAddress = shipFromAddress;
        this.inboundShipmentPlanRequestItems = inboundShipmentPlanRequestItems;
    }

    /** Default constructor. */
    public CreateInboundShipmentPlanRequest() {
        super();
    }

}

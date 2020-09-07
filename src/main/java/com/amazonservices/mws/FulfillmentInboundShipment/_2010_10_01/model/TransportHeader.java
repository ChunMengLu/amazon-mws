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
 * Transport Header
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
 * TransportHeader complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TransportHeader"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="IsPartnered" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="ShipmentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TransportHeader", propOrder={
    "sellerId",
    "shipmentId",
    "isPartnered",
    "shipmentType"
})
@XmlRootElement(name = "TransportHeader")
public class TransportHeader extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="ShipmentId",required=true)
    private String shipmentId;

    @XmlElement(name="IsPartnered",required=true)
    private boolean isPartnered;

    @XmlElement(name="ShipmentType",required=true)
    private String shipmentType;

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
    public TransportHeader withSellerId(String sellerId) {
        this.sellerId = sellerId;
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
    public TransportHeader withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Check the value of IsPartnered.
     *
     * @return true if IsPartnered is set to true.
     */
    public boolean isIsPartnered() {
        return isPartnered;
    }

    /**
     * Get the value of IsPartnered.
     *
     * @return The value of IsPartnered.
     */
    public boolean getIsPartnered() {
        return isPartnered;
    }

    /**
     * Set the value of IsPartnered.
     *
     * @param isPartnered
     *            The new value to set.
     */
    public void setIsPartnered(boolean isPartnered) {
        this.isPartnered = isPartnered;
    }

    /**
     * Set the value of IsPartnered, return this.
     *
     * @param isPartnered
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportHeader withIsPartnered(boolean isPartnered) {
        this.isPartnered = isPartnered;
        return this;
    }

    /**
     * Get the value of ShipmentType.
     *
     * @return The value of ShipmentType.
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /**
     * Set the value of ShipmentType.
     *
     * @param shipmentType
     *            The new value to set.
     */
    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    /**
     * Check to see if ShipmentType is set.
     *
     * @return true if ShipmentType is set.
     */
    public boolean isSetShipmentType() {
        return shipmentType != null;
    }

    /**
     * Set the value of ShipmentType, return this.
     *
     * @param shipmentType
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportHeader withShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
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
        shipmentId = r.read("ShipmentId", String.class);
        isPartnered = r.read("IsPartnered", boolean.class);
        shipmentType = r.read("ShipmentType", String.class);
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
        w.write("ShipmentId", shipmentId);
        w.write("IsPartnered", isPartnered);
        w.write("ShipmentType", shipmentType);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "TransportHeader",this);
    }

    /** Value constructor. */
    public TransportHeader(String sellerId,String shipmentId,boolean isPartnered,String shipmentType) {
        this.sellerId = sellerId;
        this.shipmentId = shipmentId;
        this.isPartnered = isPartnered;
        this.shipmentType = shipmentType;
    }

    /** Default constructor. */
    public TransportHeader() {
        super();
    }

}

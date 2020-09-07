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
 * Inbound Shipment Plan
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
 * InboundShipmentPlan complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InboundShipmentPlan"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DestinationFulfillmentCenterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipToAddress" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Address" minOccurs="0"/&gt;
 *             &lt;element name="LabelPrepType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Items" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InboundShipmentPlanItemList" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedBoxContentsFee" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}BoxContentsFeeDetails" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InboundShipmentPlan", propOrder={
    "shipmentId",
    "destinationFulfillmentCenterId",
    "shipToAddress",
    "labelPrepType",
    "items",
    "estimatedBoxContentsFee"
})
@XmlRootElement(name = "InboundShipmentPlan")
public class InboundShipmentPlan extends AbstractMwsObject {

    @XmlElement(name="ShipmentId")
    private String shipmentId;

    @XmlElement(name="DestinationFulfillmentCenterId")
    private String destinationFulfillmentCenterId;

    @XmlElement(name="ShipToAddress")
    private Address shipToAddress;

    @XmlElement(name="LabelPrepType")
    private String labelPrepType;

    @XmlElement(name="Items")
    private InboundShipmentPlanItemList items;

    @XmlElement(name="EstimatedBoxContentsFee")
    private BoxContentsFeeDetails estimatedBoxContentsFee;

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
    public InboundShipmentPlan withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Get the value of DestinationFulfillmentCenterId.
     *
     * @return The value of DestinationFulfillmentCenterId.
     */
    public String getDestinationFulfillmentCenterId() {
        return destinationFulfillmentCenterId;
    }

    /**
     * Set the value of DestinationFulfillmentCenterId.
     *
     * @param destinationFulfillmentCenterId
     *            The new value to set.
     */
    public void setDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
    }

    /**
     * Check to see if DestinationFulfillmentCenterId is set.
     *
     * @return true if DestinationFulfillmentCenterId is set.
     */
    public boolean isSetDestinationFulfillmentCenterId() {
        return destinationFulfillmentCenterId != null;
    }

    /**
     * Set the value of DestinationFulfillmentCenterId, return this.
     *
     * @param destinationFulfillmentCenterId
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentPlan withDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        return this;
    }

    /**
     * Get the value of ShipToAddress.
     *
     * @return The value of ShipToAddress.
     */
    public Address getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Set the value of ShipToAddress.
     *
     * @param shipToAddress
     *            The new value to set.
     */
    public void setShipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    /**
     * Check to see if ShipToAddress is set.
     *
     * @return true if ShipToAddress is set.
     */
    public boolean isSetShipToAddress() {
        return shipToAddress != null;
    }

    /**
     * Set the value of ShipToAddress, return this.
     *
     * @param shipToAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentPlan withShipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
        return this;
    }

    /**
     * Get the value of LabelPrepType.
     *
     * @return The value of LabelPrepType.
     */
    public String getLabelPrepType() {
        return labelPrepType;
    }

    /**
     * Set the value of LabelPrepType.
     *
     * @param labelPrepType
     *            The new value to set.
     */
    public void setLabelPrepType(String labelPrepType) {
        this.labelPrepType = labelPrepType;
    }

    /**
     * Check to see if LabelPrepType is set.
     *
     * @return true if LabelPrepType is set.
     */
    public boolean isSetLabelPrepType() {
        return labelPrepType != null;
    }

    /**
     * Set the value of LabelPrepType, return this.
     *
     * @param labelPrepType
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentPlan withLabelPrepType(String labelPrepType) {
        this.labelPrepType = labelPrepType;
        return this;
    }

    /**
     * Get the value of Items.
     *
     * @return The value of Items.
     */
    public InboundShipmentPlanItemList getItems() {
        return items;
    }

    /**
     * Set the value of Items.
     *
     * @param items
     *            The new value to set.
     */
    public void setItems(InboundShipmentPlanItemList items) {
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
    public InboundShipmentPlan withItems(InboundShipmentPlanItemList items) {
        this.items = items;
        return this;
    }

    /**
     * Get the value of EstimatedBoxContentsFee.
     *
     * @return The value of EstimatedBoxContentsFee.
     */
    public BoxContentsFeeDetails getEstimatedBoxContentsFee() {
        return estimatedBoxContentsFee;
    }

    /**
     * Set the value of EstimatedBoxContentsFee.
     *
     * @param estimatedBoxContentsFee
     *            The new value to set.
     */
    public void setEstimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
        this.estimatedBoxContentsFee = estimatedBoxContentsFee;
    }

    /**
     * Check to see if EstimatedBoxContentsFee is set.
     *
     * @return true if EstimatedBoxContentsFee is set.
     */
    public boolean isSetEstimatedBoxContentsFee() {
        return estimatedBoxContentsFee != null;
    }

    /**
     * Set the value of EstimatedBoxContentsFee, return this.
     *
     * @param estimatedBoxContentsFee
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentPlan withEstimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
        this.estimatedBoxContentsFee = estimatedBoxContentsFee;
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
        shipmentId = r.read("ShipmentId", String.class);
        destinationFulfillmentCenterId = r.read("DestinationFulfillmentCenterId", String.class);
        shipToAddress = r.read("ShipToAddress", Address.class);
        labelPrepType = r.read("LabelPrepType", String.class);
        items = r.read("Items", InboundShipmentPlanItemList.class);
        estimatedBoxContentsFee = r.read("EstimatedBoxContentsFee", BoxContentsFeeDetails.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ShipmentId", shipmentId);
        w.write("DestinationFulfillmentCenterId", destinationFulfillmentCenterId);
        w.write("ShipToAddress", shipToAddress);
        w.write("LabelPrepType", labelPrepType);
        w.write("Items", items);
        w.write("EstimatedBoxContentsFee", estimatedBoxContentsFee);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InboundShipmentPlan",this);
    }


    /** Value constructor. */
    public InboundShipmentPlan(String shipmentId,String destinationFulfillmentCenterId,Address shipToAddress,String labelPrepType,InboundShipmentPlanItemList items) {
        this.shipmentId = shipmentId;
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        this.shipToAddress = shipToAddress;
        this.labelPrepType = labelPrepType;
        this.items = items;
    }

    /** Default constructor. */
    public InboundShipmentPlan() {
        super();
    }

}

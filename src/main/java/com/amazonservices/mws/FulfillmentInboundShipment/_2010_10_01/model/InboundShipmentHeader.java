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
 * Inbound Shipment Header
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
 * InboundShipmentHeader complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InboundShipmentHeader"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipFromAddress" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Address" minOccurs="0"/&gt;
 *             &lt;element name="DestinationFulfillmentCenterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AreCasesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="LabelPrepPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="IntendedBoxContentsSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InboundShipmentHeader", propOrder={
    "shipmentName",
    "shipFromAddress",
    "destinationFulfillmentCenterId",
    "areCasesRequired",
    "shipmentStatus",
    "labelPrepPreference",
    "intendedBoxContentsSource"
})
@XmlRootElement(name = "InboundShipmentHeader")
public class InboundShipmentHeader extends AbstractMwsObject {

    @XmlElement(name="ShipmentName")
    private String shipmentName;

    @XmlElement(name="ShipFromAddress")
    private Address shipFromAddress;

    @XmlElement(name="DestinationFulfillmentCenterId")
    private String destinationFulfillmentCenterId;

    @XmlElement(name="AreCasesRequired")
    private Boolean areCasesRequired;

    @XmlElement(name="ShipmentStatus")
    private String shipmentStatus;

    @XmlElement(name="LabelPrepPreference")
    private String labelPrepPreference;

    @XmlElement(name="IntendedBoxContentsSource")
    private String intendedBoxContentsSource;

    /**
     * Get the value of ShipmentName.
     *
     * @return The value of ShipmentName.
     */
    public String getShipmentName() {
        return shipmentName;
    }

    /**
     * Set the value of ShipmentName.
     *
     * @param shipmentName
     *            The new value to set.
     */
    public void setShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
    }

    /**
     * Check to see if ShipmentName is set.
     *
     * @return true if ShipmentName is set.
     */
    public boolean isSetShipmentName() {
        return shipmentName != null;
    }

    /**
     * Set the value of ShipmentName, return this.
     *
     * @param shipmentName
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentHeader withShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
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
    public InboundShipmentHeader withShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
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
    public InboundShipmentHeader withDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        return this;
    }

    /**
     * Check the value of AreCasesRequired.
     *
     * @return true if AreCasesRequired is set to true.
     */
    public boolean isAreCasesRequired() {
        return areCasesRequired!=null && areCasesRequired.booleanValue();
    }

    /**
     * Get the value of AreCasesRequired.
     *
     * @return The value of AreCasesRequired.
     */
    public Boolean getAreCasesRequired() {
        return areCasesRequired;
    }

    /**
     * Set the value of AreCasesRequired.
     *
     * @param areCasesRequired
     *            The new value to set.
     */
    public void setAreCasesRequired(Boolean areCasesRequired) {
        this.areCasesRequired = areCasesRequired;
    }

    /**
     * Check to see if AreCasesRequired is set.
     *
     * @return true if AreCasesRequired is set.
     */
    public boolean isSetAreCasesRequired() {
        return areCasesRequired != null;
    }

    /**
     * Set the value of AreCasesRequired, return this.
     *
     * @param areCasesRequired
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentHeader withAreCasesRequired(Boolean areCasesRequired) {
        this.areCasesRequired = areCasesRequired;
        return this;
    }

    /**
     * Get the value of ShipmentStatus.
     *
     * @return The value of ShipmentStatus.
     */
    public String getShipmentStatus() {
        return shipmentStatus;
    }

    /**
     * Set the value of ShipmentStatus.
     *
     * @param shipmentStatus
     *            The new value to set.
     */
    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    /**
     * Check to see if ShipmentStatus is set.
     *
     * @return true if ShipmentStatus is set.
     */
    public boolean isSetShipmentStatus() {
        return shipmentStatus != null;
    }

    /**
     * Set the value of ShipmentStatus, return this.
     *
     * @param shipmentStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentHeader withShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
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
    public InboundShipmentHeader withLabelPrepPreference(String labelPrepPreference) {
        this.labelPrepPreference = labelPrepPreference;
        return this;
    }

    /**
     * Get the value of IntendedBoxContentsSource.
     *
     * @return The value of IntendedBoxContentsSource.
     */
    public String getIntendedBoxContentsSource() {
        return intendedBoxContentsSource;
    }

    /**
     * Set the value of IntendedBoxContentsSource.
     *
     * @param intendedBoxContentsSource
     *            The new value to set.
     */
    public void setIntendedBoxContentsSource(String intendedBoxContentsSource) {
        this.intendedBoxContentsSource = intendedBoxContentsSource;
    }

    /**
     * Check to see if IntendedBoxContentsSource is set.
     *
     * @return true if IntendedBoxContentsSource is set.
     */
    public boolean isSetIntendedBoxContentsSource() {
        return intendedBoxContentsSource != null;
    }

    /**
     * Set the value of IntendedBoxContentsSource, return this.
     *
     * @param intendedBoxContentsSource
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentHeader withIntendedBoxContentsSource(String intendedBoxContentsSource) {
        this.intendedBoxContentsSource = intendedBoxContentsSource;
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
        shipmentName = r.read("ShipmentName", String.class);
        shipFromAddress = r.read("ShipFromAddress", Address.class);
        destinationFulfillmentCenterId = r.read("DestinationFulfillmentCenterId", String.class);
        areCasesRequired = r.read("AreCasesRequired", Boolean.class);
        shipmentStatus = r.read("ShipmentStatus", String.class);
        labelPrepPreference = r.read("LabelPrepPreference", String.class);
        intendedBoxContentsSource = r.read("IntendedBoxContentsSource", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ShipmentName", shipmentName);
        w.write("ShipFromAddress", shipFromAddress);
        w.write("DestinationFulfillmentCenterId", destinationFulfillmentCenterId);
        w.write("AreCasesRequired", areCasesRequired);
        w.write("ShipmentStatus", shipmentStatus);
        w.write("LabelPrepPreference", labelPrepPreference);
        w.write("IntendedBoxContentsSource", intendedBoxContentsSource);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InboundShipmentHeader",this);
    }


    /** Value constructor. */
    public InboundShipmentHeader(String shipmentName,Address shipFromAddress,String destinationFulfillmentCenterId,Boolean areCasesRequired,String shipmentStatus,String labelPrepPreference) {
        this.shipmentName = shipmentName;
        this.shipFromAddress = shipFromAddress;
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        this.areCasesRequired = areCasesRequired;
        this.shipmentStatus = shipmentStatus;
        this.labelPrepPreference = labelPrepPreference;
    }

    /** Default constructor. */
    public InboundShipmentHeader() {
        super();
    }

}

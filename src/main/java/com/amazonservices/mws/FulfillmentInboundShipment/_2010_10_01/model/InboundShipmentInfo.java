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
 * Inbound Shipment Info
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
 * InboundShipmentInfo complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InboundShipmentInfo"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipFromAddress" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Address" minOccurs="0"/&gt;
 *             &lt;element name="DestinationFulfillmentCenterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="LabelPrepType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AreCasesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="ConfirmedNeedByDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="BoxContentsSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedBoxContentsFee" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}BoxContentsFeeDetails" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InboundShipmentInfo", propOrder={
    "shipmentId",
    "shipmentName",
    "shipFromAddress",
    "destinationFulfillmentCenterId",
    "shipmentStatus",
    "labelPrepType",
    "areCasesRequired",
    "confirmedNeedByDate",
    "boxContentsSource",
    "estimatedBoxContentsFee"
})
@XmlRootElement(name = "InboundShipmentInfo")
public class InboundShipmentInfo extends AbstractMwsObject {

    @XmlElement(name="ShipmentId")
    private String shipmentId;

    @XmlElement(name="ShipmentName")
    private String shipmentName;

    @XmlElement(name="ShipFromAddress")
    private Address shipFromAddress;

    @XmlElement(name="DestinationFulfillmentCenterId")
    private String destinationFulfillmentCenterId;

    @XmlElement(name="ShipmentStatus")
    private String shipmentStatus;

    @XmlElement(name="LabelPrepType")
    private String labelPrepType;

    @XmlElement(name="AreCasesRequired")
    private Boolean areCasesRequired;

    @XmlElement(name="ConfirmedNeedByDate")
    private String confirmedNeedByDate;

    @XmlElement(name="BoxContentsSource")
    private String boxContentsSource;

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
    public InboundShipmentInfo withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

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
    public InboundShipmentInfo withShipmentName(String shipmentName) {
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
    public InboundShipmentInfo withShipFromAddress(Address shipFromAddress) {
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
    public InboundShipmentInfo withDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
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
    public InboundShipmentInfo withShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
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
    public InboundShipmentInfo withLabelPrepType(String labelPrepType) {
        this.labelPrepType = labelPrepType;
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
    public InboundShipmentInfo withAreCasesRequired(Boolean areCasesRequired) {
        this.areCasesRequired = areCasesRequired;
        return this;
    }

    /**
     * Get the value of ConfirmedNeedByDate.
     *
     * @return The value of ConfirmedNeedByDate.
     */
    public String getConfirmedNeedByDate() {
        return confirmedNeedByDate;
    }

    /**
     * Set the value of ConfirmedNeedByDate.
     *
     * @param confirmedNeedByDate
     *            The new value to set.
     */
    public void setConfirmedNeedByDate(String confirmedNeedByDate) {
        this.confirmedNeedByDate = confirmedNeedByDate;
    }

    /**
     * Check to see if ConfirmedNeedByDate is set.
     *
     * @return true if ConfirmedNeedByDate is set.
     */
    public boolean isSetConfirmedNeedByDate() {
        return confirmedNeedByDate != null;
    }

    /**
     * Set the value of ConfirmedNeedByDate, return this.
     *
     * @param confirmedNeedByDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentInfo withConfirmedNeedByDate(String confirmedNeedByDate) {
        this.confirmedNeedByDate = confirmedNeedByDate;
        return this;
    }

    /**
     * Get the value of BoxContentsSource.
     *
     * @return The value of BoxContentsSource.
     */
    public String getBoxContentsSource() {
        return boxContentsSource;
    }

    /**
     * Set the value of BoxContentsSource.
     *
     * @param boxContentsSource
     *            The new value to set.
     */
    public void setBoxContentsSource(String boxContentsSource) {
        this.boxContentsSource = boxContentsSource;
    }

    /**
     * Check to see if BoxContentsSource is set.
     *
     * @return true if BoxContentsSource is set.
     */
    public boolean isSetBoxContentsSource() {
        return boxContentsSource != null;
    }

    /**
     * Set the value of BoxContentsSource, return this.
     *
     * @param boxContentsSource
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentInfo withBoxContentsSource(String boxContentsSource) {
        this.boxContentsSource = boxContentsSource;
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
    public InboundShipmentInfo withEstimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
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
        shipmentName = r.read("ShipmentName", String.class);
        shipFromAddress = r.read("ShipFromAddress", Address.class);
        destinationFulfillmentCenterId = r.read("DestinationFulfillmentCenterId", String.class);
        shipmentStatus = r.read("ShipmentStatus", String.class);
        labelPrepType = r.read("LabelPrepType", String.class);
        areCasesRequired = r.read("AreCasesRequired", Boolean.class);
        confirmedNeedByDate = r.read("ConfirmedNeedByDate", String.class);
        boxContentsSource = r.read("BoxContentsSource", String.class);
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
        w.write("ShipmentName", shipmentName);
        w.write("ShipFromAddress", shipFromAddress);
        w.write("DestinationFulfillmentCenterId", destinationFulfillmentCenterId);
        w.write("ShipmentStatus", shipmentStatus);
        w.write("LabelPrepType", labelPrepType);
        w.write("AreCasesRequired", areCasesRequired);
        w.write("ConfirmedNeedByDate", confirmedNeedByDate);
        w.write("BoxContentsSource", boxContentsSource);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InboundShipmentInfo",this);
    }


    /** Value constructor. */
    public InboundShipmentInfo(String shipmentId,String shipmentName,Address shipFromAddress,String destinationFulfillmentCenterId,String shipmentStatus,String labelPrepType,Boolean areCasesRequired,String confirmedNeedByDate) {
        this.shipmentId = shipmentId;
        this.shipmentName = shipmentName;
        this.shipFromAddress = shipFromAddress;
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        this.shipmentStatus = shipmentStatus;
        this.labelPrepType = labelPrepType;
        this.areCasesRequired = areCasesRequired;
        this.confirmedNeedByDate = confirmedNeedByDate;
    }

    /** Default constructor. */
    public InboundShipmentInfo() {
        super();
    }

}

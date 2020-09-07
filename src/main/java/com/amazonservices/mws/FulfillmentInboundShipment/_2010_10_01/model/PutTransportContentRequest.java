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
 * Put Transport Content Request
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
 * PutTransportContentRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PutTransportContentRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="IsPartnered" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="ShipmentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="TransportDetails" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}TransportDetailInput"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PutTransportContentRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "shipmentId",
    "isPartnered",
    "shipmentType",
    "transportDetails"
})
@XmlRootElement(name = "PutTransportContentRequest")
public class PutTransportContentRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="ShipmentId",required=true)
    private String shipmentId;

    @XmlElement(name="IsPartnered",required=true)
    private boolean isPartnered;

    @XmlElement(name="ShipmentType",required=true)
    private String shipmentType;

    @XmlElement(name="TransportDetails",required=true)
    private TransportDetailInput transportDetails;

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
    public PutTransportContentRequest withSellerId(String sellerId) {
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
    public PutTransportContentRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
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
    public PutTransportContentRequest withShipmentId(String shipmentId) {
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
    public PutTransportContentRequest withIsPartnered(boolean isPartnered) {
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
    public PutTransportContentRequest withShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
        return this;
    }

    /**
     * Get the value of TransportDetails.
     *
     * @return The value of TransportDetails.
     */
    public TransportDetailInput getTransportDetails() {
        return transportDetails;
    }

    /**
     * Set the value of TransportDetails.
     *
     * @param transportDetails
     *            The new value to set.
     */
    public void setTransportDetails(TransportDetailInput transportDetails) {
        this.transportDetails = transportDetails;
    }

    /**
     * Check to see if TransportDetails is set.
     *
     * @return true if TransportDetails is set.
     */
    public boolean isSetTransportDetails() {
        return transportDetails != null;
    }

    /**
     * Set the value of TransportDetails, return this.
     *
     * @param transportDetails
     *             The new value to set.
     *
     * @return This instance.
     */
    public PutTransportContentRequest withTransportDetails(TransportDetailInput transportDetails) {
        this.transportDetails = transportDetails;
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
        shipmentId = r.read("ShipmentId", String.class);
        isPartnered = r.read("IsPartnered", boolean.class);
        shipmentType = r.read("ShipmentType", String.class);
        transportDetails = r.read("TransportDetails", TransportDetailInput.class);
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
        w.write("ShipmentId", shipmentId);
        w.write("IsPartnered", isPartnered);
        w.write("ShipmentType", shipmentType);
        w.write("TransportDetails", transportDetails);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PutTransportContentRequest",this);
    }

    /** Value constructor. */
    public PutTransportContentRequest(String sellerId,String mwsAuthToken,String shipmentId,boolean isPartnered,String shipmentType,TransportDetailInput transportDetails) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.shipmentId = shipmentId;
        this.isPartnered = isPartnered;
        this.shipmentType = shipmentType;
        this.transportDetails = transportDetails;
    }

    /** Value constructor. */
    public PutTransportContentRequest(String sellerId,String shipmentId,boolean isPartnered,String shipmentType,TransportDetailInput transportDetails) {
        this.sellerId = sellerId;
        this.shipmentId = shipmentId;
        this.isPartnered = isPartnered;
        this.shipmentType = shipmentType;
        this.transportDetails = transportDetails;
    }

    /** Default constructor. */
    public PutTransportContentRequest() {
        super();
    }

}

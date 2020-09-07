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
 * Inbound Shipment Item
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
 * InboundShipmentItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InboundShipmentItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="FulfillmentNetworkSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="QuantityShipped" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="QuantityReceived" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="QuantityInCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PrepDetailsList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PrepDetailsList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InboundShipmentItem", propOrder={
    "shipmentId",
    "sellerSKU",
    "fulfillmentNetworkSKU",
    "quantityShipped",
    "quantityReceived",
    "quantityInCase",
    "releaseDate",
    "prepDetailsList"
})
@XmlRootElement(name = "InboundShipmentItem")
public class InboundShipmentItem extends AbstractMwsObject {

    @XmlElement(name="ShipmentId")
    private String shipmentId;

    @XmlElement(name="SellerSKU",required=true)
    private String sellerSKU;

    @XmlElement(name="FulfillmentNetworkSKU")
    private String fulfillmentNetworkSKU;

    @XmlElement(name="QuantityShipped",required=true)
    private int quantityShipped;

    @XmlElement(name="QuantityReceived")
    private Integer quantityReceived;

    @XmlElement(name="QuantityInCase")
    private Integer quantityInCase;

    @XmlElement(name="ReleaseDate")
    private String releaseDate;

    @XmlElement(name="PrepDetailsList")
    private PrepDetailsList prepDetailsList;

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
    public InboundShipmentItem withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

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
    public InboundShipmentItem withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
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
    public InboundShipmentItem withFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        return this;
    }

    /**
     * Get the value of QuantityShipped.
     *
     * @return The value of QuantityShipped.
     */
    public int getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Set the value of QuantityShipped.
     *
     * @param quantityShipped
     *            The new value to set.
     */
    public void setQuantityShipped(int quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    /**
     * is QuantityShipped set.
     *
     * @return true.
     */
    public boolean isSetQuantityShipped() {
        return true;
    }

    /**
     * Set the value of QuantityShipped, return this.
     *
     * @param quantityShipped
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentItem withQuantityShipped(int quantityShipped) {
        this.quantityShipped = quantityShipped;
        return this;
    }

    /**
     * Get the value of QuantityReceived.
     *
     * @return The value of QuantityReceived.
     */
    public Integer getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Set the value of QuantityReceived.
     *
     * @param quantityReceived
     *            The new value to set.
     */
    public void setQuantityReceived(Integer quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    /**
     * Check to see if QuantityReceived is set.
     *
     * @return true if QuantityReceived is set.
     */
    public boolean isSetQuantityReceived() {
        return quantityReceived != null;
    }

    /**
     * Set the value of QuantityReceived, return this.
     *
     * @param quantityReceived
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentItem withQuantityReceived(Integer quantityReceived) {
        this.quantityReceived = quantityReceived;
        return this;
    }

    /**
     * Get the value of QuantityInCase.
     *
     * @return The value of QuantityInCase.
     */
    public Integer getQuantityInCase() {
        return quantityInCase;
    }

    /**
     * Set the value of QuantityInCase.
     *
     * @param quantityInCase
     *            The new value to set.
     */
    public void setQuantityInCase(Integer quantityInCase) {
        this.quantityInCase = quantityInCase;
    }

    /**
     * Check to see if QuantityInCase is set.
     *
     * @return true if QuantityInCase is set.
     */
    public boolean isSetQuantityInCase() {
        return quantityInCase != null;
    }

    /**
     * Set the value of QuantityInCase, return this.
     *
     * @param quantityInCase
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentItem withQuantityInCase(Integer quantityInCase) {
        this.quantityInCase = quantityInCase;
        return this;
    }

    /**
     * Get the value of ReleaseDate.
     *
     * @return The value of ReleaseDate.
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Set the value of ReleaseDate.
     *
     * @param releaseDate
     *            The new value to set.
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Check to see if ReleaseDate is set.
     *
     * @return true if ReleaseDate is set.
     */
    public boolean isSetReleaseDate() {
        return releaseDate != null;
    }

    /**
     * Set the value of ReleaseDate, return this.
     *
     * @param releaseDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentItem withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Get the value of PrepDetailsList.
     *
     * @return The value of PrepDetailsList.
     */
    public PrepDetailsList getPrepDetailsList() {
        return prepDetailsList;
    }

    /**
     * Set the value of PrepDetailsList.
     *
     * @param prepDetailsList
     *            The new value to set.
     */
    public void setPrepDetailsList(PrepDetailsList prepDetailsList) {
        this.prepDetailsList = prepDetailsList;
    }

    /**
     * Check to see if PrepDetailsList is set.
     *
     * @return true if PrepDetailsList is set.
     */
    public boolean isSetPrepDetailsList() {
        return prepDetailsList != null;
    }

    /**
     * Set the value of PrepDetailsList, return this.
     *
     * @param prepDetailsList
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentItem withPrepDetailsList(PrepDetailsList prepDetailsList) {
        this.prepDetailsList = prepDetailsList;
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
        sellerSKU = r.read("SellerSKU", String.class);
        fulfillmentNetworkSKU = r.read("FulfillmentNetworkSKU", String.class);
        quantityShipped = r.read("QuantityShipped", int.class);
        quantityReceived = r.read("QuantityReceived", Integer.class);
        quantityInCase = r.read("QuantityInCase", Integer.class);
        releaseDate = r.read("ReleaseDate", String.class);
        prepDetailsList = r.read("PrepDetailsList", PrepDetailsList.class);
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
        w.write("SellerSKU", sellerSKU);
        w.write("FulfillmentNetworkSKU", fulfillmentNetworkSKU);
        w.write("QuantityShipped", quantityShipped);
        w.write("QuantityReceived", quantityReceived);
        w.write("QuantityInCase", quantityInCase);
        w.write("ReleaseDate", releaseDate);
        w.write("PrepDetailsList", prepDetailsList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InboundShipmentItem",this);
    }

    /** Value constructor. */
    public InboundShipmentItem(String shipmentId,String sellerSKU,String fulfillmentNetworkSKU,int quantityShipped,Integer quantityReceived,Integer quantityInCase,String releaseDate) {
        this.shipmentId = shipmentId;
        this.sellerSKU = sellerSKU;
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        this.quantityShipped = quantityShipped;
        this.quantityReceived = quantityReceived;
        this.quantityInCase = quantityInCase;
        this.releaseDate = releaseDate;
    }

    /** Value constructor. */
    public InboundShipmentItem(String shipmentId,String sellerSKU,String fulfillmentNetworkSKU,int quantityShipped,Integer quantityReceived,Integer quantityInCase,String releaseDate,PrepDetailsList prepDetailsList) {
        this.shipmentId = shipmentId;
        this.sellerSKU = sellerSKU;
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        this.quantityShipped = quantityShipped;
        this.quantityReceived = quantityReceived;
        this.quantityInCase = quantityInCase;
        this.releaseDate = releaseDate;
        this.prepDetailsList = prepDetailsList;
    }

    /** Value constructor. */
    public InboundShipmentItem(String sellerSKU,int quantityShipped) {
        this.sellerSKU = sellerSKU;
        this.quantityShipped = quantityShipped;
    }

    /** Default constructor. */
    public InboundShipmentItem() {
        super();
    }

}

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
 * Inbound Shipment Plan Item
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
 * InboundShipmentPlanItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InboundShipmentPlanItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentNetworkSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="PrepDetailsList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PrepDetailsList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InboundShipmentPlanItem", propOrder={
    "sellerSKU",
    "fulfillmentNetworkSKU",
    "quantity",
    "prepDetailsList"
})
@XmlRootElement(name = "InboundShipmentPlanItem")
public class InboundShipmentPlanItem extends AbstractMwsObject {

    @XmlElement(name="SellerSKU")
    private String sellerSKU;

    @XmlElement(name="FulfillmentNetworkSKU")
    private String fulfillmentNetworkSKU;

    @XmlElement(name="Quantity")
    private Integer quantity;

    @XmlElement(name="PrepDetailsList")
    private PrepDetailsList prepDetailsList;

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
    public InboundShipmentPlanItem withSellerSKU(String sellerSKU) {
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
    public InboundShipmentPlanItem withFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        return this;
    }

    /**
     * Get the value of Quantity.
     *
     * @return The value of Quantity.
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Set the value of Quantity.
     *
     * @param quantity
     *            The new value to set.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Check to see if Quantity is set.
     *
     * @return true if Quantity is set.
     */
    public boolean isSetQuantity() {
        return quantity != null;
    }

    /**
     * Set the value of Quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentPlanItem withQuantity(Integer quantity) {
        this.quantity = quantity;
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
    public InboundShipmentPlanItem withPrepDetailsList(PrepDetailsList prepDetailsList) {
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
        sellerSKU = r.read("SellerSKU", String.class);
        fulfillmentNetworkSKU = r.read("FulfillmentNetworkSKU", String.class);
        quantity = r.read("Quantity", Integer.class);
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
        w.write("SellerSKU", sellerSKU);
        w.write("FulfillmentNetworkSKU", fulfillmentNetworkSKU);
        w.write("Quantity", quantity);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InboundShipmentPlanItem",this);
    }


    /** Value constructor. */
    public InboundShipmentPlanItem(String sellerSKU,String fulfillmentNetworkSKU,Integer quantity) {
        this.sellerSKU = sellerSKU;
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        this.quantity = quantity;
    }

    /** Value constructor. */
    public InboundShipmentPlanItem(String sellerSKU,String fulfillmentNetworkSKU,Integer quantity,PrepDetailsList prepDetailsList) {
        this.sellerSKU = sellerSKU;
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        this.quantity = quantity;
        this.prepDetailsList = prepDetailsList;
    }

    /** Default constructor. */
    public InboundShipmentPlanItem() {
        super();
    }

}

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
 * Inbound Shipment Plan Request Item
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
 * InboundShipmentPlanRequestItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InboundShipmentPlanRequestItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="QuantityInCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="PrepDetailsList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PrepDetailsList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InboundShipmentPlanRequestItem", propOrder={
    "sellerSKU",
    "asin",
    "condition",
    "quantity",
    "quantityInCase",
    "prepDetailsList"
})
@XmlRootElement(name = "InboundShipmentPlanRequestItem")
public class InboundShipmentPlanRequestItem extends AbstractMwsObject {

    @XmlElement(name="SellerSKU",required=true)
    private String sellerSKU;

    @XmlElement(name="ASIN")
    private String asin;

    @XmlElement(name="Condition")
    private String condition;

    @XmlElement(name="Quantity")
    private Integer quantity;

    @XmlElement(name="QuantityInCase")
    private Integer quantityInCase;

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
    public InboundShipmentPlanRequestItem withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentPlanRequestItem withASIN(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get the value of Condition.
     *
     * @return The value of Condition.
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Set the value of Condition.
     *
     * @param condition
     *            The new value to set.
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Check to see if Condition is set.
     *
     * @return true if Condition is set.
     */
    public boolean isSetCondition() {
        return condition != null;
    }

    /**
     * Set the value of Condition, return this.
     *
     * @param condition
     *             The new value to set.
     *
     * @return This instance.
     */
    public InboundShipmentPlanRequestItem withCondition(String condition) {
        this.condition = condition;
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
    public InboundShipmentPlanRequestItem withQuantity(Integer quantity) {
        this.quantity = quantity;
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
    public InboundShipmentPlanRequestItem withQuantityInCase(Integer quantityInCase) {
        this.quantityInCase = quantityInCase;
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
    public InboundShipmentPlanRequestItem withPrepDetailsList(PrepDetailsList prepDetailsList) {
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
        asin = r.read("ASIN", String.class);
        condition = r.read("Condition", String.class);
        quantity = r.read("Quantity", Integer.class);
        quantityInCase = r.read("QuantityInCase", Integer.class);
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
        w.write("ASIN", asin);
        w.write("Condition", condition);
        w.write("Quantity", quantity);
        w.write("QuantityInCase", quantityInCase);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InboundShipmentPlanRequestItem",this);
    }

    /** Value constructor. */
    public InboundShipmentPlanRequestItem(String sellerSKU,String asin,String condition,Integer quantity,Integer quantityInCase) {
        this.sellerSKU = sellerSKU;
        this.asin = asin;
        this.condition = condition;
        this.quantity = quantity;
        this.quantityInCase = quantityInCase;
    }

    /** Value constructor. */
    public InboundShipmentPlanRequestItem(String sellerSKU,String asin,String condition,Integer quantity,Integer quantityInCase,PrepDetailsList prepDetailsList) {
        this.sellerSKU = sellerSKU;
        this.asin = asin;
        this.condition = condition;
        this.quantity = quantity;
        this.quantityInCase = quantityInCase;
        this.prepDetailsList = prepDetailsList;
    }

    /** Value constructor. */
    public InboundShipmentPlanRequestItem(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /** Default constructor. */
    public InboundShipmentPlanRequestItem() {
        super();
    }

}

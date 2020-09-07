/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Removal Shipment Item
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * RemovalShipmentItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="RemovalShipmentItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="RemovalShipmentItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TaxCollectionModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FufillmentNetworkSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="Revenue" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="FeeAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TaxAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TaxWithheld" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class RemovalShipmentItem extends AbstractMwsObject {

    private String removalShipmentItemId;

    private String taxCollectionModel;

    private String fufillmentNetworkSKU;

    private Integer quantity;

    private Currency revenue;

    private Currency feeAmount;

    private Currency taxAmount;

    private Currency taxWithheld;

    /**
     * Get the value of RemovalShipmentItemId.
     *
     * @return The value of RemovalShipmentItemId.
     */
    public String getRemovalShipmentItemId() {
        return removalShipmentItemId;
    }

    /**
     * Set the value of RemovalShipmentItemId.
     *
     * @param removalShipmentItemId
     *            The new value to set.
     */
    public void setRemovalShipmentItemId(String removalShipmentItemId) {
        this.removalShipmentItemId = removalShipmentItemId;
    }

    /**
     * Check to see if RemovalShipmentItemId is set.
     *
     * @return true if RemovalShipmentItemId is set.
     */
    public boolean isSetRemovalShipmentItemId() {
        return removalShipmentItemId != null;
    }

    /**
     * Set the value of RemovalShipmentItemId, return this.
     *
     * @param removalShipmentItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentItem withRemovalShipmentItemId(String removalShipmentItemId) {
        this.removalShipmentItemId = removalShipmentItemId;
        return this;
    }

    /**
     * Get the value of TaxCollectionModel.
     *
     * @return The value of TaxCollectionModel.
     */
    public String getTaxCollectionModel() {
        return taxCollectionModel;
    }

    /**
     * Set the value of TaxCollectionModel.
     *
     * @param taxCollectionModel
     *            The new value to set.
     */
    public void setTaxCollectionModel(String taxCollectionModel) {
        this.taxCollectionModel = taxCollectionModel;
    }

    /**
     * Check to see if TaxCollectionModel is set.
     *
     * @return true if TaxCollectionModel is set.
     */
    public boolean isSetTaxCollectionModel() {
        return taxCollectionModel != null;
    }

    /**
     * Set the value of TaxCollectionModel, return this.
     *
     * @param taxCollectionModel
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentItem withTaxCollectionModel(String taxCollectionModel) {
        this.taxCollectionModel = taxCollectionModel;
        return this;
    }

    /**
     * Get the value of FufillmentNetworkSKU.
     *
     * @return The value of FufillmentNetworkSKU.
     */
    public String getFufillmentNetworkSKU() {
        return fufillmentNetworkSKU;
    }

    /**
     * Set the value of FufillmentNetworkSKU.
     *
     * @param fufillmentNetworkSKU
     *            The new value to set.
     */
    public void setFufillmentNetworkSKU(String fufillmentNetworkSKU) {
        this.fufillmentNetworkSKU = fufillmentNetworkSKU;
    }

    /**
     * Check to see if FufillmentNetworkSKU is set.
     *
     * @return true if FufillmentNetworkSKU is set.
     */
    public boolean isSetFufillmentNetworkSKU() {
        return fufillmentNetworkSKU != null;
    }

    /**
     * Set the value of FufillmentNetworkSKU, return this.
     *
     * @param fufillmentNetworkSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentItem withFufillmentNetworkSKU(String fufillmentNetworkSKU) {
        this.fufillmentNetworkSKU = fufillmentNetworkSKU;
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
    public RemovalShipmentItem withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the value of Revenue.
     *
     * @return The value of Revenue.
     */
    public Currency getRevenue() {
        return revenue;
    }

    /**
     * Set the value of Revenue.
     *
     * @param revenue
     *            The new value to set.
     */
    public void setRevenue(Currency revenue) {
        this.revenue = revenue;
    }

    /**
     * Check to see if Revenue is set.
     *
     * @return true if Revenue is set.
     */
    public boolean isSetRevenue() {
        return revenue != null;
    }

    /**
     * Set the value of Revenue, return this.
     *
     * @param revenue
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentItem withRevenue(Currency revenue) {
        this.revenue = revenue;
        return this;
    }

    /**
     * Get the value of FeeAmount.
     *
     * @return The value of FeeAmount.
     */
    public Currency getFeeAmount() {
        return feeAmount;
    }

    /**
     * Set the value of FeeAmount.
     *
     * @param feeAmount
     *            The new value to set.
     */
    public void setFeeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Check to see if FeeAmount is set.
     *
     * @return true if FeeAmount is set.
     */
    public boolean isSetFeeAmount() {
        return feeAmount != null;
    }

    /**
     * Set the value of FeeAmount, return this.
     *
     * @param feeAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentItem withFeeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Get the value of TaxAmount.
     *
     * @return The value of TaxAmount.
     */
    public Currency getTaxAmount() {
        return taxAmount;
    }

    /**
     * Set the value of TaxAmount.
     *
     * @param taxAmount
     *            The new value to set.
     */
    public void setTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Check to see if TaxAmount is set.
     *
     * @return true if TaxAmount is set.
     */
    public boolean isSetTaxAmount() {
        return taxAmount != null;
    }

    /**
     * Set the value of TaxAmount, return this.
     *
     * @param taxAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentItem withTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Get the value of TaxWithheld.
     *
     * @return The value of TaxWithheld.
     */
    public Currency getTaxWithheld() {
        return taxWithheld;
    }

    /**
     * Set the value of TaxWithheld.
     *
     * @param taxWithheld
     *            The new value to set.
     */
    public void setTaxWithheld(Currency taxWithheld) {
        this.taxWithheld = taxWithheld;
    }

    /**
     * Check to see if TaxWithheld is set.
     *
     * @return true if TaxWithheld is set.
     */
    public boolean isSetTaxWithheld() {
        return taxWithheld != null;
    }

    /**
     * Set the value of TaxWithheld, return this.
     *
     * @param taxWithheld
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentItem withTaxWithheld(Currency taxWithheld) {
        this.taxWithheld = taxWithheld;
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
        removalShipmentItemId = r.read("RemovalShipmentItemId", String.class);
        taxCollectionModel = r.read("TaxCollectionModel", String.class);
        fufillmentNetworkSKU = r.read("FufillmentNetworkSKU", String.class);
        quantity = r.read("Quantity", Integer.class);
        revenue = r.read("Revenue", Currency.class);
        feeAmount = r.read("FeeAmount", Currency.class);
        taxAmount = r.read("TaxAmount", Currency.class);
        taxWithheld = r.read("TaxWithheld", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("RemovalShipmentItemId", removalShipmentItemId);
        w.write("TaxCollectionModel", taxCollectionModel);
        w.write("FufillmentNetworkSKU", fufillmentNetworkSKU);
        w.write("Quantity", quantity);
        w.write("Revenue", revenue);
        w.write("FeeAmount", feeAmount);
        w.write("TaxAmount", taxAmount);
        w.write("TaxWithheld", taxWithheld);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "RemovalShipmentItem",this);
    }


    /** Default constructor. */
    public RemovalShipmentItem() {
        super();
    }

}

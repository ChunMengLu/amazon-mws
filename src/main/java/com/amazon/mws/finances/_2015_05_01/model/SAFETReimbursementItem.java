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
 * SAFET Reimbursement Item
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * SAFETReimbursementItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SAFETReimbursementItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="itemChargeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SAFETReimbursementItem extends AbstractMwsObject {

    private List<ChargeComponent> itemChargeList;

    private String productDescription;

    private String quantity;

    /**
     * Get the value of itemChargeList.
     *
     * @return The value of itemChargeList.
     */
    public List<ChargeComponent> getItemChargeList() {
        if (itemChargeList==null) {
            itemChargeList = new ArrayList<ChargeComponent>();
        }
        return itemChargeList;
    }

    /**
     * Set the value of itemChargeList.
     *
     * @param itemChargeList
     *            The new value to set.
     */
    public void setItemChargeList(List<ChargeComponent> itemChargeList) {
        this.itemChargeList = itemChargeList;
    }

    /**
     * Clear itemChargeList.
     */
    public void unsetItemChargeList() {
        this.itemChargeList = null;
    }

    /**
     * Check to see if itemChargeList is set.
     *
     * @return true if itemChargeList is set.
     */
    public boolean isSetItemChargeList() {
        return itemChargeList != null && !itemChargeList.isEmpty();
    }

    /**
     * Add values for itemChargeList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public SAFETReimbursementItem withItemChargeList(ChargeComponent... values) {
        List<ChargeComponent> list = getItemChargeList();
        for (ChargeComponent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of productDescription.
     *
     * @return The value of productDescription.
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Set the value of productDescription.
     *
     * @param productDescription
     *            The new value to set.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Check to see if productDescription is set.
     *
     * @return true if productDescription is set.
     */
    public boolean isSetProductDescription() {
        return productDescription != null;
    }

    /**
     * Set the value of productDescription, return this.
     *
     * @param productDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public SAFETReimbursementItem withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * Get the value of quantity.
     *
     * @return The value of quantity.
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity.
     *
     * @param quantity
     *            The new value to set.
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Check to see if quantity is set.
     *
     * @return true if quantity is set.
     */
    public boolean isSetQuantity() {
        return quantity != null;
    }

    /**
     * Set the value of quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public SAFETReimbursementItem withQuantity(String quantity) {
        this.quantity = quantity;
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
        itemChargeList = r.readList("itemChargeList", "ChargeComponent", ChargeComponent.class);
        productDescription = r.read("productDescription", String.class);
        quantity = r.read("quantity", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("itemChargeList", "ChargeComponent", itemChargeList);
        w.write("productDescription", productDescription);
        w.write("quantity", quantity);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "SAFETReimbursementItem",this);
    }


    /** Default constructor. */
    public SAFETReimbursementItem() {
        super();
    }

}

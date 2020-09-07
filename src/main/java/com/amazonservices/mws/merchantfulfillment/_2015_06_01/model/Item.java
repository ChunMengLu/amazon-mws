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
 * Item
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * Item complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Item"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="OrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="transparencyCodeList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ItemLevelSellerInputsList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AdditionalSellerInputs" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ItemWeight" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Weight" minOccurs="0"/&gt;
 *             &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Item extends AbstractMwsObject {

    private String orderItemId;

    private int quantity;

    private List<String> transparencyCodeList;

    private List<AdditionalSellerInputs> itemLevelSellerInputsList;

    private Weight itemWeight;

    private String itemDescription;

    /**
     * Get the value of OrderItemId.
     *
     * @return The value of OrderItemId.
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * Set the value of OrderItemId.
     *
     * @param orderItemId
     *            The new value to set.
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * Check to see if OrderItemId is set.
     *
     * @return true if OrderItemId is set.
     */
    public boolean isSetOrderItemId() {
        return orderItemId != null;
    }

    /**
     * Set the value of OrderItemId, return this.
     *
     * @param orderItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public Item withOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    /**
     * Get the value of Quantity.
     *
     * @return The value of Quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of Quantity.
     *
     * @param quantity
     *            The new value to set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Set the value of Quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public Item withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the value of transparencyCodeList.
     *
     * @return The value of transparencyCodeList.
     */
    public List<String> getTransparencyCodeList() {
        if (transparencyCodeList==null) {
            transparencyCodeList = new ArrayList<String>();
        }
        return transparencyCodeList;
    }

    /**
     * Set the value of transparencyCodeList.
     *
     * @param transparencyCodeList
     *            The new value to set.
     */
    public void setTransparencyCodeList(List<String> transparencyCodeList) {
        this.transparencyCodeList = transparencyCodeList;
    }

    /**
     * Clear transparencyCodeList.
     */
    public void unsetTransparencyCodeList() {
        this.transparencyCodeList = null;
    }

    /**
     * Check to see if transparencyCodeList is set.
     *
     * @return true if transparencyCodeList is set.
     */
    public boolean isSetTransparencyCodeList() {
        return transparencyCodeList != null && !transparencyCodeList.isEmpty();
    }

    /**
     * Add values for transparencyCodeList, return this.
     *
     * @param transparencyCodeList
     *             New values to add.
     *
     * @return This instance.
     */
    public Item withTransparencyCodeList(String... values) {
        List<String> list = getTransparencyCodeList();
        for (String value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ItemLevelSellerInputsList.
     *
     * @return The value of ItemLevelSellerInputsList.
     */
    public List<AdditionalSellerInputs> getItemLevelSellerInputsList() {
        if (itemLevelSellerInputsList==null) {
            itemLevelSellerInputsList = new ArrayList<AdditionalSellerInputs>();
        }
        return itemLevelSellerInputsList;
    }

    /**
     * Set the value of ItemLevelSellerInputsList.
     *
     * @param itemLevelSellerInputsList
     *            The new value to set.
     */
    public void setItemLevelSellerInputsList(List<AdditionalSellerInputs> itemLevelSellerInputsList) {
        this.itemLevelSellerInputsList = itemLevelSellerInputsList;
    }

    /**
     * Clear ItemLevelSellerInputsList.
     */
    public void unsetItemLevelSellerInputsList() {
        this.itemLevelSellerInputsList = null;
    }

    /**
     * Check to see if ItemLevelSellerInputsList is set.
     *
     * @return true if ItemLevelSellerInputsList is set.
     */
    public boolean isSetItemLevelSellerInputsList() {
        return itemLevelSellerInputsList != null && !itemLevelSellerInputsList.isEmpty();
    }

    /**
     * Add values for ItemLevelSellerInputsList, return this.
     *
     * @param itemLevelSellerInputsList
     *             New values to add.
     *
     * @return This instance.
     */
    public Item withItemLevelSellerInputsList(AdditionalSellerInputs... values) {
        List<AdditionalSellerInputs> list = getItemLevelSellerInputsList();
        for (AdditionalSellerInputs value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ItemWeight.
     *
     * @return The value of ItemWeight.
     */
    public Weight getItemWeight() {
        return itemWeight;
    }

    /**
     * Set the value of ItemWeight.
     *
     * @param itemWeight
     *            The new value to set.
     */
    public void setItemWeight(Weight itemWeight) {
        this.itemWeight = itemWeight;
    }

    /**
     * Check to see if ItemWeight is set.
     *
     * @return true if ItemWeight is set.
     */
    public boolean isSetItemWeight() {
        return itemWeight != null;
    }

    /**
     * Set the value of ItemWeight, return this.
     *
     * @param itemWeight
     *             The new value to set.
     *
     * @return This instance.
     */
    public Item withItemWeight(Weight itemWeight) {
        this.itemWeight = itemWeight;
        return this;
    }

    /**
     * Get the value of ItemDescription.
     *
     * @return The value of ItemDescription.
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Set the value of ItemDescription.
     *
     * @param itemDescription
     *            The new value to set.
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * Check to see if ItemDescription is set.
     *
     * @return true if ItemDescription is set.
     */
    public boolean isSetItemDescription() {
        return itemDescription != null;
    }

    /**
     * Set the value of ItemDescription, return this.
     *
     * @param itemDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public Item withItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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
        orderItemId = r.read("OrderItemId", String.class);
        quantity = r.read("Quantity", int.class);
        transparencyCodeList = r.readList("transparencyCodeList", "member", String.class);
        itemLevelSellerInputsList = r.readList("ItemLevelSellerInputsList", "member", AdditionalSellerInputs.class);
        itemWeight = r.read("ItemWeight", Weight.class);
        itemDescription = r.read("ItemDescription", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("OrderItemId", orderItemId);
        w.write("Quantity", quantity);
        w.writeList("transparencyCodeList", "member", transparencyCodeList);
        w.writeList("ItemLevelSellerInputsList", "member", itemLevelSellerInputsList);
        w.write("ItemWeight", itemWeight);
        w.write("ItemDescription", itemDescription);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Item",this);
    }

    /** Value constructor. */
    public Item(String orderItemId,int quantity) {
        this.orderItemId = orderItemId;
        this.quantity = quantity;
    }

    /** Default constructor. */
    public Item() {
        super();
    }

}

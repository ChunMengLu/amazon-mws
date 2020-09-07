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
 * Get Additional Seller Inputs Result
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
 * GetAdditionalSellerInputsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetAdditionalSellerInputsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentLevelFields" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AdditionalInputs" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ItemLevelFieldsList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ItemLevelFields" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetAdditionalSellerInputsResult extends AbstractMwsObject {

    private List<AdditionalInputs> shipmentLevelFields;

    private List<ItemLevelFields> itemLevelFieldsList;

    /**
     * Get the value of ShipmentLevelFields.
     *
     * @return The value of ShipmentLevelFields.
     */
    public List<AdditionalInputs> getShipmentLevelFields() {
        if (shipmentLevelFields==null) {
            shipmentLevelFields = new ArrayList<AdditionalInputs>();
        }
        return shipmentLevelFields;
    }

    /**
     * Set the value of ShipmentLevelFields.
     *
     * @param shipmentLevelFields
     *            The new value to set.
     */
    public void setShipmentLevelFields(List<AdditionalInputs> shipmentLevelFields) {
        this.shipmentLevelFields = shipmentLevelFields;
    }

    /**
     * Clear ShipmentLevelFields.
     */
    public void unsetShipmentLevelFields() {
        this.shipmentLevelFields = null;
    }

    /**
     * Check to see if ShipmentLevelFields is set.
     *
     * @return true if ShipmentLevelFields is set.
     */
    public boolean isSetShipmentLevelFields() {
        return shipmentLevelFields != null && !shipmentLevelFields.isEmpty();
    }

    /**
     * Add values for ShipmentLevelFields, return this.
     *
     * @param shipmentLevelFields
     *             New values to add.
     *
     * @return This instance.
     */
    public GetAdditionalSellerInputsResult withShipmentLevelFields(AdditionalInputs... values) {
        List<AdditionalInputs> list = getShipmentLevelFields();
        for (AdditionalInputs value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ItemLevelFieldsList.
     *
     * @return The value of ItemLevelFieldsList.
     */
    public List<ItemLevelFields> getItemLevelFieldsList() {
        if (itemLevelFieldsList==null) {
            itemLevelFieldsList = new ArrayList<ItemLevelFields>();
        }
        return itemLevelFieldsList;
    }

    /**
     * Set the value of ItemLevelFieldsList.
     *
     * @param itemLevelFieldsList
     *            The new value to set.
     */
    public void setItemLevelFieldsList(List<ItemLevelFields> itemLevelFieldsList) {
        this.itemLevelFieldsList = itemLevelFieldsList;
    }

    /**
     * Clear ItemLevelFieldsList.
     */
    public void unsetItemLevelFieldsList() {
        this.itemLevelFieldsList = null;
    }

    /**
     * Check to see if ItemLevelFieldsList is set.
     *
     * @return true if ItemLevelFieldsList is set.
     */
    public boolean isSetItemLevelFieldsList() {
        return itemLevelFieldsList != null && !itemLevelFieldsList.isEmpty();
    }

    /**
     * Add values for ItemLevelFieldsList, return this.
     *
     * @param itemLevelFieldsList
     *             New values to add.
     *
     * @return This instance.
     */
    public GetAdditionalSellerInputsResult withItemLevelFieldsList(ItemLevelFields... values) {
        List<ItemLevelFields> list = getItemLevelFieldsList();
        for (ItemLevelFields value : values) {
            list.add(value);
        }
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
        shipmentLevelFields = r.readList("ShipmentLevelFields", "member", AdditionalInputs.class);
        itemLevelFieldsList = r.readList("ItemLevelFieldsList", "member", ItemLevelFields.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ShipmentLevelFields", "member", shipmentLevelFields);
        w.writeList("ItemLevelFieldsList", "member", itemLevelFieldsList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "GetAdditionalSellerInputsResult",this);
    }


    /** Default constructor. */
    public GetAdditionalSellerInputsResult() {
        super();
    }

}

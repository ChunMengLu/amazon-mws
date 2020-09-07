/*******************************************************************************
 * Copyright 2009-2018 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * List Pickup Slots Result
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * ListPickupSlotsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListPickupSlotsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PickupSlotList" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}PickupSlot" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListPickupSlotsResult extends AbstractMwsObject {

    private String amazonOrderId;

    private List<PickupSlot> pickupSlotList;

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null;
    }

    /**
     * Set the value of AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListPickupSlotsResult withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of PickupSlotList.
     *
     * @return The value of PickupSlotList.
     */
    public List<PickupSlot> getPickupSlotList() {
        if (pickupSlotList==null) {
            pickupSlotList = new ArrayList<PickupSlot>();
        }
        return pickupSlotList;
    }

    /**
     * Set the value of PickupSlotList.
     *
     * @param pickupSlotList
     *            The new value to set.
     */
    public void setPickupSlotList(List<PickupSlot> pickupSlotList) {
        this.pickupSlotList = pickupSlotList;
    }

    /**
     * Clear PickupSlotList.
     */
    public void unsetPickupSlotList() {
        this.pickupSlotList = null;
    }

    /**
     * Check to see if PickupSlotList is set.
     *
     * @return true if PickupSlotList is set.
     */
    public boolean isSetPickupSlotList() {
        return pickupSlotList != null && !pickupSlotList.isEmpty();
    }

    /**
     * Add values for PickupSlotList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ListPickupSlotsResult withPickupSlotList(PickupSlot... values) {
        List<PickupSlot> list = getPickupSlotList();
        for (PickupSlot value : values) {
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
        amazonOrderId = r.read("AmazonOrderId", String.class);
        pickupSlotList = r.readList("PickupSlotList", "PickupSlot", PickupSlot.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AmazonOrderId", amazonOrderId);
        w.writeList("PickupSlotList", "PickupSlot", pickupSlotList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "ListPickupSlotsResult",this);
    }

    /** Value constructor. */
    public ListPickupSlotsResult(String amazonOrderId,List<PickupSlot> pickupSlotList) {
        this.amazonOrderId = amazonOrderId;
        this.pickupSlotList = pickupSlotList;
    }

    /** Default constructor. */
    public ListPickupSlotsResult() {
        super();
    }

}

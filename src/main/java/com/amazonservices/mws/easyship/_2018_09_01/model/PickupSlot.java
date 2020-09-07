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
 * Pickup Slot
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * PickupSlot complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PickupSlot"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SlotId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PickupTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="PickupTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PickupSlot extends AbstractMwsObject {

    private String slotId;

    private XMLGregorianCalendar pickupTimeStart;

    private XMLGregorianCalendar pickupTimeEnd;

    /**
     * Get the value of SlotId.
     *
     * @return The value of SlotId.
     */
    public String getSlotId() {
        return slotId;
    }

    /**
     * Set the value of SlotId.
     *
     * @param slotId
     *            The new value to set.
     */
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    /**
     * Check to see if SlotId is set.
     *
     * @return true if SlotId is set.
     */
    public boolean isSetSlotId() {
        return slotId != null;
    }

    /**
     * Set the value of SlotId, return this.
     *
     * @param slotId
     *             The new value to set.
     *
     * @return This instance.
     */
    public PickupSlot withSlotId(String slotId) {
        this.slotId = slotId;
        return this;
    }

    /**
     * Get the value of PickupTimeStart.
     *
     * @return The value of PickupTimeStart.
     */
    public XMLGregorianCalendar getPickupTimeStart() {
        return pickupTimeStart;
    }

    /**
     * Set the value of PickupTimeStart.
     *
     * @param pickupTimeStart
     *            The new value to set.
     */
    public void setPickupTimeStart(XMLGregorianCalendar pickupTimeStart) {
        this.pickupTimeStart = pickupTimeStart;
    }

    /**
     * Check to see if PickupTimeStart is set.
     *
     * @return true if PickupTimeStart is set.
     */
    public boolean isSetPickupTimeStart() {
        return pickupTimeStart != null;
    }

    /**
     * Set the value of PickupTimeStart, return this.
     *
     * @param pickupTimeStart
     *             The new value to set.
     *
     * @return This instance.
     */
    public PickupSlot withPickupTimeStart(XMLGregorianCalendar pickupTimeStart) {
        this.pickupTimeStart = pickupTimeStart;
        return this;
    }

    /**
     * Get the value of PickupTimeEnd.
     *
     * @return The value of PickupTimeEnd.
     */
    public XMLGregorianCalendar getPickupTimeEnd() {
        return pickupTimeEnd;
    }

    /**
     * Set the value of PickupTimeEnd.
     *
     * @param pickupTimeEnd
     *            The new value to set.
     */
    public void setPickupTimeEnd(XMLGregorianCalendar pickupTimeEnd) {
        this.pickupTimeEnd = pickupTimeEnd;
    }

    /**
     * Check to see if PickupTimeEnd is set.
     *
     * @return true if PickupTimeEnd is set.
     */
    public boolean isSetPickupTimeEnd() {
        return pickupTimeEnd != null;
    }

    /**
     * Set the value of PickupTimeEnd, return this.
     *
     * @param pickupTimeEnd
     *             The new value to set.
     *
     * @return This instance.
     */
    public PickupSlot withPickupTimeEnd(XMLGregorianCalendar pickupTimeEnd) {
        this.pickupTimeEnd = pickupTimeEnd;
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
        slotId = r.read("SlotId", String.class);
        pickupTimeStart = r.read("PickupTimeStart", XMLGregorianCalendar.class);
        pickupTimeEnd = r.read("PickupTimeEnd", XMLGregorianCalendar.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SlotId", slotId);
        w.write("PickupTimeStart", pickupTimeStart);
        w.write("PickupTimeEnd", pickupTimeEnd);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "PickupSlot",this);
    }


    /** Default constructor. */
    public PickupSlot() {
        super();
    }

}

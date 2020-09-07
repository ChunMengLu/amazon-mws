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
 * Get Preorder Info Result
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
 * GetPreorderInfoResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPreorderInfoResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentContainsPreorderableItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentConfirmedForPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ConfirmedFulfillableDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPreorderInfoResult", propOrder={
    "shipmentContainsPreorderableItems",
    "shipmentConfirmedForPreorder",
    "needByDate",
    "confirmedFulfillableDate"
})
@XmlRootElement(name = "GetPreorderInfoResult")
public class GetPreorderInfoResult extends AbstractMwsObject {

    @XmlElement(name="ShipmentContainsPreorderableItems")
    private Boolean shipmentContainsPreorderableItems;

    @XmlElement(name="ShipmentConfirmedForPreorder")
    private Boolean shipmentConfirmedForPreorder;

    @XmlElement(name="NeedByDate")
    private String needByDate;

    @XmlElement(name="ConfirmedFulfillableDate")
    private String confirmedFulfillableDate;

    /**
     * Check the value of ShipmentContainsPreorderableItems.
     *
     * @return true if ShipmentContainsPreorderableItems is set to true.
     */
    public boolean isShipmentContainsPreorderableItems() {
        return shipmentContainsPreorderableItems!=null && shipmentContainsPreorderableItems.booleanValue();
    }

    /**
     * Get the value of ShipmentContainsPreorderableItems.
     *
     * @return The value of ShipmentContainsPreorderableItems.
     */
    public Boolean getShipmentContainsPreorderableItems() {
        return shipmentContainsPreorderableItems;
    }

    /**
     * Set the value of ShipmentContainsPreorderableItems.
     *
     * @param shipmentContainsPreorderableItems
     *            The new value to set.
     */
    public void setShipmentContainsPreorderableItems(Boolean shipmentContainsPreorderableItems) {
        this.shipmentContainsPreorderableItems = shipmentContainsPreorderableItems;
    }

    /**
     * Check to see if ShipmentContainsPreorderableItems is set.
     *
     * @return true if ShipmentContainsPreorderableItems is set.
     */
    public boolean isSetShipmentContainsPreorderableItems() {
        return shipmentContainsPreorderableItems != null;
    }

    /**
     * Set the value of ShipmentContainsPreorderableItems, return this.
     *
     * @param shipmentContainsPreorderableItems
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPreorderInfoResult withShipmentContainsPreorderableItems(Boolean shipmentContainsPreorderableItems) {
        this.shipmentContainsPreorderableItems = shipmentContainsPreorderableItems;
        return this;
    }

    /**
     * Check the value of ShipmentConfirmedForPreorder.
     *
     * @return true if ShipmentConfirmedForPreorder is set to true.
     */
    public boolean isShipmentConfirmedForPreorder() {
        return shipmentConfirmedForPreorder!=null && shipmentConfirmedForPreorder.booleanValue();
    }

    /**
     * Get the value of ShipmentConfirmedForPreorder.
     *
     * @return The value of ShipmentConfirmedForPreorder.
     */
    public Boolean getShipmentConfirmedForPreorder() {
        return shipmentConfirmedForPreorder;
    }

    /**
     * Set the value of ShipmentConfirmedForPreorder.
     *
     * @param shipmentConfirmedForPreorder
     *            The new value to set.
     */
    public void setShipmentConfirmedForPreorder(Boolean shipmentConfirmedForPreorder) {
        this.shipmentConfirmedForPreorder = shipmentConfirmedForPreorder;
    }

    /**
     * Check to see if ShipmentConfirmedForPreorder is set.
     *
     * @return true if ShipmentConfirmedForPreorder is set.
     */
    public boolean isSetShipmentConfirmedForPreorder() {
        return shipmentConfirmedForPreorder != null;
    }

    /**
     * Set the value of ShipmentConfirmedForPreorder, return this.
     *
     * @param shipmentConfirmedForPreorder
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPreorderInfoResult withShipmentConfirmedForPreorder(Boolean shipmentConfirmedForPreorder) {
        this.shipmentConfirmedForPreorder = shipmentConfirmedForPreorder;
        return this;
    }

    /**
     * Get the value of NeedByDate.
     *
     * @return The value of NeedByDate.
     */
    public String getNeedByDate() {
        return needByDate;
    }

    /**
     * Set the value of NeedByDate.
     *
     * @param needByDate
     *            The new value to set.
     */
    public void setNeedByDate(String needByDate) {
        this.needByDate = needByDate;
    }

    /**
     * Check to see if NeedByDate is set.
     *
     * @return true if NeedByDate is set.
     */
    public boolean isSetNeedByDate() {
        return needByDate != null;
    }

    /**
     * Set the value of NeedByDate, return this.
     *
     * @param needByDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPreorderInfoResult withNeedByDate(String needByDate) {
        this.needByDate = needByDate;
        return this;
    }

    /**
     * Get the value of ConfirmedFulfillableDate.
     *
     * @return The value of ConfirmedFulfillableDate.
     */
    public String getConfirmedFulfillableDate() {
        return confirmedFulfillableDate;
    }

    /**
     * Set the value of ConfirmedFulfillableDate.
     *
     * @param confirmedFulfillableDate
     *            The new value to set.
     */
    public void setConfirmedFulfillableDate(String confirmedFulfillableDate) {
        this.confirmedFulfillableDate = confirmedFulfillableDate;
    }

    /**
     * Check to see if ConfirmedFulfillableDate is set.
     *
     * @return true if ConfirmedFulfillableDate is set.
     */
    public boolean isSetConfirmedFulfillableDate() {
        return confirmedFulfillableDate != null;
    }

    /**
     * Set the value of ConfirmedFulfillableDate, return this.
     *
     * @param confirmedFulfillableDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPreorderInfoResult withConfirmedFulfillableDate(String confirmedFulfillableDate) {
        this.confirmedFulfillableDate = confirmedFulfillableDate;
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
        shipmentContainsPreorderableItems = r.read("ShipmentContainsPreorderableItems", Boolean.class);
        shipmentConfirmedForPreorder = r.read("ShipmentConfirmedForPreorder", Boolean.class);
        needByDate = r.read("NeedByDate", String.class);
        confirmedFulfillableDate = r.read("ConfirmedFulfillableDate", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ShipmentContainsPreorderableItems", shipmentContainsPreorderableItems);
        w.write("ShipmentConfirmedForPreorder", shipmentConfirmedForPreorder);
        w.write("NeedByDate", needByDate);
        w.write("ConfirmedFulfillableDate", confirmedFulfillableDate);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPreorderInfoResult",this);
    }


    /** Value constructor. */
    public GetPreorderInfoResult(Boolean shipmentContainsPreorderableItems,Boolean shipmentConfirmedForPreorder,String needByDate,String confirmedFulfillableDate) {
        this.shipmentContainsPreorderableItems = shipmentContainsPreorderableItems;
        this.shipmentConfirmedForPreorder = shipmentConfirmedForPreorder;
        this.needByDate = needByDate;
        this.confirmedFulfillableDate = confirmedFulfillableDate;
    }

    /** Default constructor. */
    public GetPreorderInfoResult() {
        super();
    }

}

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
 * Confirm Preorder Result
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
 * ConfirmPreorderResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ConfirmPreorderResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ConfirmedNeedByDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ConfirmedFulfillableDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ConfirmPreorderResult", propOrder={
    "confirmedNeedByDate",
    "confirmedFulfillableDate"
})
@XmlRootElement(name = "ConfirmPreorderResult")
public class ConfirmPreorderResult extends AbstractMwsObject {

    @XmlElement(name="ConfirmedNeedByDate")
    private String confirmedNeedByDate;

    @XmlElement(name="ConfirmedFulfillableDate")
    private String confirmedFulfillableDate;

    /**
     * Get the value of ConfirmedNeedByDate.
     *
     * @return The value of ConfirmedNeedByDate.
     */
    public String getConfirmedNeedByDate() {
        return confirmedNeedByDate;
    }

    /**
     * Set the value of ConfirmedNeedByDate.
     *
     * @param confirmedNeedByDate
     *            The new value to set.
     */
    public void setConfirmedNeedByDate(String confirmedNeedByDate) {
        this.confirmedNeedByDate = confirmedNeedByDate;
    }

    /**
     * Check to see if ConfirmedNeedByDate is set.
     *
     * @return true if ConfirmedNeedByDate is set.
     */
    public boolean isSetConfirmedNeedByDate() {
        return confirmedNeedByDate != null;
    }

    /**
     * Set the value of ConfirmedNeedByDate, return this.
     *
     * @param confirmedNeedByDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ConfirmPreorderResult withConfirmedNeedByDate(String confirmedNeedByDate) {
        this.confirmedNeedByDate = confirmedNeedByDate;
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
    public ConfirmPreorderResult withConfirmedFulfillableDate(String confirmedFulfillableDate) {
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
        confirmedNeedByDate = r.read("ConfirmedNeedByDate", String.class);
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
        w.write("ConfirmedNeedByDate", confirmedNeedByDate);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ConfirmPreorderResult",this);
    }


    /** Value constructor. */
    public ConfirmPreorderResult(String confirmedNeedByDate,String confirmedFulfillableDate) {
        this.confirmedNeedByDate = confirmedNeedByDate;
        this.confirmedFulfillableDate = confirmedFulfillableDate;
    }

    /** Default constructor. */
    public ConfirmPreorderResult() {
        super();
    }

}

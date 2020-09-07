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
 * Box Contents Fee Details
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
 * BoxContentsFeeDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="BoxContentsFeeDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TotalUnits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="FeePerUnit" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Amount" minOccurs="0"/&gt;
 *             &lt;element name="TotalFee" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Amount" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BoxContentsFeeDetails", propOrder={
    "totalUnits",
    "feePerUnit",
    "totalFee"
})
@XmlRootElement(name = "BoxContentsFeeDetails")
public class BoxContentsFeeDetails extends AbstractMwsObject {

    @XmlElement(name="TotalUnits")
    private Integer totalUnits;

    @XmlElement(name="FeePerUnit")
    private Amount feePerUnit;

    @XmlElement(name="TotalFee")
    private Amount totalFee;

    /**
     * Get the value of TotalUnits.
     *
     * @return The value of TotalUnits.
     */
    public Integer getTotalUnits() {
        return totalUnits;
    }

    /**
     * Set the value of TotalUnits.
     *
     * @param totalUnits
     *            The new value to set.
     */
    public void setTotalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
    }

    /**
     * Check to see if TotalUnits is set.
     *
     * @return true if TotalUnits is set.
     */
    public boolean isSetTotalUnits() {
        return totalUnits != null;
    }

    /**
     * Set the value of TotalUnits, return this.
     *
     * @param totalUnits
     *             The new value to set.
     *
     * @return This instance.
     */
    public BoxContentsFeeDetails withTotalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
        return this;
    }

    /**
     * Get the value of FeePerUnit.
     *
     * @return The value of FeePerUnit.
     */
    public Amount getFeePerUnit() {
        return feePerUnit;
    }

    /**
     * Set the value of FeePerUnit.
     *
     * @param feePerUnit
     *            The new value to set.
     */
    public void setFeePerUnit(Amount feePerUnit) {
        this.feePerUnit = feePerUnit;
    }

    /**
     * Check to see if FeePerUnit is set.
     *
     * @return true if FeePerUnit is set.
     */
    public boolean isSetFeePerUnit() {
        return feePerUnit != null;
    }

    /**
     * Set the value of FeePerUnit, return this.
     *
     * @param feePerUnit
     *             The new value to set.
     *
     * @return This instance.
     */
    public BoxContentsFeeDetails withFeePerUnit(Amount feePerUnit) {
        this.feePerUnit = feePerUnit;
        return this;
    }

    /**
     * Get the value of TotalFee.
     *
     * @return The value of TotalFee.
     */
    public Amount getTotalFee() {
        return totalFee;
    }

    /**
     * Set the value of TotalFee.
     *
     * @param totalFee
     *            The new value to set.
     */
    public void setTotalFee(Amount totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * Check to see if TotalFee is set.
     *
     * @return true if TotalFee is set.
     */
    public boolean isSetTotalFee() {
        return totalFee != null;
    }

    /**
     * Set the value of TotalFee, return this.
     *
     * @param totalFee
     *             The new value to set.
     *
     * @return This instance.
     */
    public BoxContentsFeeDetails withTotalFee(Amount totalFee) {
        this.totalFee = totalFee;
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
        totalUnits = r.read("TotalUnits", Integer.class);
        feePerUnit = r.read("FeePerUnit", Amount.class);
        totalFee = r.read("TotalFee", Amount.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TotalUnits", totalUnits);
        w.write("FeePerUnit", feePerUnit);
        w.write("TotalFee", totalFee);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "BoxContentsFeeDetails",this);
    }


    /** Default constructor. */
    public BoxContentsFeeDetails() {
        super();
    }

}

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
 * Amazon Prep Fees Details
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
 * AmazonPrepFeesDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AmazonPrepFeesDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PrepInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeePerUnit" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Amount" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="AmazonPrepFeesDetails", propOrder={
    "prepInstruction",
    "feePerUnit"
})
@XmlRootElement(name = "AmazonPrepFeesDetails")
public class AmazonPrepFeesDetails extends AbstractMwsObject {

    @XmlElement(name="PrepInstruction")
    private String prepInstruction;

    @XmlElement(name="FeePerUnit")
    private Amount feePerUnit;

    /**
     * Get the value of PrepInstruction.
     *
     * @return The value of PrepInstruction.
     */
    public String getPrepInstruction() {
        return prepInstruction;
    }

    /**
     * Set the value of PrepInstruction.
     *
     * @param prepInstruction
     *            The new value to set.
     */
    public void setPrepInstruction(String prepInstruction) {
        this.prepInstruction = prepInstruction;
    }

    /**
     * Check to see if PrepInstruction is set.
     *
     * @return true if PrepInstruction is set.
     */
    public boolean isSetPrepInstruction() {
        return prepInstruction != null;
    }

    /**
     * Set the value of PrepInstruction, return this.
     *
     * @param prepInstruction
     *             The new value to set.
     *
     * @return This instance.
     */
    public AmazonPrepFeesDetails withPrepInstruction(String prepInstruction) {
        this.prepInstruction = prepInstruction;
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
    public AmazonPrepFeesDetails withFeePerUnit(Amount feePerUnit) {
        this.feePerUnit = feePerUnit;
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
        prepInstruction = r.read("PrepInstruction", String.class);
        feePerUnit = r.read("FeePerUnit", Amount.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PrepInstruction", prepInstruction);
        w.write("FeePerUnit", feePerUnit);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "AmazonPrepFeesDetails",this);
    }


    /** Value constructor. */
    public AmazonPrepFeesDetails(String prepInstruction,Amount feePerUnit) {
        this.prepInstruction = prepInstruction;
        this.feePerUnit = feePerUnit;
    }

    /** Default constructor. */
    public AmazonPrepFeesDetails() {
        super();
    }

}

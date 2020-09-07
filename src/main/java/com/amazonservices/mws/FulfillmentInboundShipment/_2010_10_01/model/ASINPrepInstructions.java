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
 * ASIN Prep Instructions
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
 * ASINPrepInstructions complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ASINPrepInstructions"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="BarcodeInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PrepGuidance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PrepInstructionList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PrepInstructionList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ASINPrepInstructions", propOrder={
    "asin",
    "barcodeInstruction",
    "prepGuidance",
    "prepInstructionList"
})
@XmlRootElement(name = "ASINPrepInstructions")
public class ASINPrepInstructions extends AbstractMwsObject {

    @XmlElement(name="ASIN")
    private String asin;

    @XmlElement(name="BarcodeInstruction")
    private String barcodeInstruction;

    @XmlElement(name="PrepGuidance")
    private String prepGuidance;

    @XmlElement(name="PrepInstructionList")
    private PrepInstructionList prepInstructionList;

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public ASINPrepInstructions withASIN(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get the value of BarcodeInstruction.
     *
     * @return The value of BarcodeInstruction.
     */
    public String getBarcodeInstruction() {
        return barcodeInstruction;
    }

    /**
     * Set the value of BarcodeInstruction.
     *
     * @param barcodeInstruction
     *            The new value to set.
     */
    public void setBarcodeInstruction(String barcodeInstruction) {
        this.barcodeInstruction = barcodeInstruction;
    }

    /**
     * Check to see if BarcodeInstruction is set.
     *
     * @return true if BarcodeInstruction is set.
     */
    public boolean isSetBarcodeInstruction() {
        return barcodeInstruction != null;
    }

    /**
     * Set the value of BarcodeInstruction, return this.
     *
     * @param barcodeInstruction
     *             The new value to set.
     *
     * @return This instance.
     */
    public ASINPrepInstructions withBarcodeInstruction(String barcodeInstruction) {
        this.barcodeInstruction = barcodeInstruction;
        return this;
    }

    /**
     * Get the value of PrepGuidance.
     *
     * @return The value of PrepGuidance.
     */
    public String getPrepGuidance() {
        return prepGuidance;
    }

    /**
     * Set the value of PrepGuidance.
     *
     * @param prepGuidance
     *            The new value to set.
     */
    public void setPrepGuidance(String prepGuidance) {
        this.prepGuidance = prepGuidance;
    }

    /**
     * Check to see if PrepGuidance is set.
     *
     * @return true if PrepGuidance is set.
     */
    public boolean isSetPrepGuidance() {
        return prepGuidance != null;
    }

    /**
     * Set the value of PrepGuidance, return this.
     *
     * @param prepGuidance
     *             The new value to set.
     *
     * @return This instance.
     */
    public ASINPrepInstructions withPrepGuidance(String prepGuidance) {
        this.prepGuidance = prepGuidance;
        return this;
    }

    /**
     * Get the value of PrepInstructionList.
     *
     * @return The value of PrepInstructionList.
     */
    public PrepInstructionList getPrepInstructionList() {
        return prepInstructionList;
    }

    /**
     * Set the value of PrepInstructionList.
     *
     * @param prepInstructionList
     *            The new value to set.
     */
    public void setPrepInstructionList(PrepInstructionList prepInstructionList) {
        this.prepInstructionList = prepInstructionList;
    }

    /**
     * Check to see if PrepInstructionList is set.
     *
     * @return true if PrepInstructionList is set.
     */
    public boolean isSetPrepInstructionList() {
        return prepInstructionList != null;
    }

    /**
     * Set the value of PrepInstructionList, return this.
     *
     * @param prepInstructionList
     *             The new value to set.
     *
     * @return This instance.
     */
    public ASINPrepInstructions withPrepInstructionList(PrepInstructionList prepInstructionList) {
        this.prepInstructionList = prepInstructionList;
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
        asin = r.read("ASIN", String.class);
        barcodeInstruction = r.read("BarcodeInstruction", String.class);
        prepGuidance = r.read("PrepGuidance", String.class);
        prepInstructionList = r.read("PrepInstructionList", PrepInstructionList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ASIN", asin);
        w.write("BarcodeInstruction", barcodeInstruction);
        w.write("PrepGuidance", prepGuidance);
        w.write("PrepInstructionList", prepInstructionList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ASINPrepInstructions",this);
    }


    /** Value constructor. */
    public ASINPrepInstructions(String asin,String barcodeInstruction,String prepGuidance,PrepInstructionList prepInstructionList) {
        this.asin = asin;
        this.barcodeInstruction = barcodeInstruction;
        this.prepGuidance = prepGuidance;
        this.prepInstructionList = prepInstructionList;
    }

    /** Default constructor. */
    public ASINPrepInstructions() {
        super();
    }

}

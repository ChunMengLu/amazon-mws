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
 * SKU Prep Instructions
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
 * SKUPrepInstructions complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SKUPrepInstructions"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="BarcodeInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PrepGuidance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PrepInstructionList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PrepInstructionList" minOccurs="0"/&gt;
 *             &lt;element name="AmazonPrepFeesDetailsList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}AmazonPrepFeesDetailsList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SKUPrepInstructions", propOrder={
    "sellerSKU",
    "asin",
    "barcodeInstruction",
    "prepGuidance",
    "prepInstructionList",
    "amazonPrepFeesDetailsList"
})
@XmlRootElement(name = "SKUPrepInstructions")
public class SKUPrepInstructions extends AbstractMwsObject {

    @XmlElement(name="SellerSKU")
    private String sellerSKU;

    @XmlElement(name="ASIN")
    private String asin;

    @XmlElement(name="BarcodeInstruction")
    private String barcodeInstruction;

    @XmlElement(name="PrepGuidance")
    private String prepGuidance;

    @XmlElement(name="PrepInstructionList")
    private PrepInstructionList prepInstructionList;

    @XmlElement(name="AmazonPrepFeesDetailsList")
    private AmazonPrepFeesDetailsList amazonPrepFeesDetailsList;

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUPrepInstructions withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

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
    public SKUPrepInstructions withASIN(String asin) {
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
    public SKUPrepInstructions withBarcodeInstruction(String barcodeInstruction) {
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
    public SKUPrepInstructions withPrepGuidance(String prepGuidance) {
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
    public SKUPrepInstructions withPrepInstructionList(PrepInstructionList prepInstructionList) {
        this.prepInstructionList = prepInstructionList;
        return this;
    }

    /**
     * Get the value of AmazonPrepFeesDetailsList.
     *
     * @return The value of AmazonPrepFeesDetailsList.
     */
    public AmazonPrepFeesDetailsList getAmazonPrepFeesDetailsList() {
        return amazonPrepFeesDetailsList;
    }

    /**
     * Set the value of AmazonPrepFeesDetailsList.
     *
     * @param amazonPrepFeesDetailsList
     *            The new value to set.
     */
    public void setAmazonPrepFeesDetailsList(AmazonPrepFeesDetailsList amazonPrepFeesDetailsList) {
        this.amazonPrepFeesDetailsList = amazonPrepFeesDetailsList;
    }

    /**
     * Check to see if AmazonPrepFeesDetailsList is set.
     *
     * @return true if AmazonPrepFeesDetailsList is set.
     */
    public boolean isSetAmazonPrepFeesDetailsList() {
        return amazonPrepFeesDetailsList != null;
    }

    /**
     * Set the value of AmazonPrepFeesDetailsList, return this.
     *
     * @param amazonPrepFeesDetailsList
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUPrepInstructions withAmazonPrepFeesDetailsList(AmazonPrepFeesDetailsList amazonPrepFeesDetailsList) {
        this.amazonPrepFeesDetailsList = amazonPrepFeesDetailsList;
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
        sellerSKU = r.read("SellerSKU", String.class);
        asin = r.read("ASIN", String.class);
        barcodeInstruction = r.read("BarcodeInstruction", String.class);
        prepGuidance = r.read("PrepGuidance", String.class);
        prepInstructionList = r.read("PrepInstructionList", PrepInstructionList.class);
        amazonPrepFeesDetailsList = r.read("AmazonPrepFeesDetailsList", AmazonPrepFeesDetailsList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerSKU", sellerSKU);
        w.write("ASIN", asin);
        w.write("BarcodeInstruction", barcodeInstruction);
        w.write("PrepGuidance", prepGuidance);
        w.write("PrepInstructionList", prepInstructionList);
        w.write("AmazonPrepFeesDetailsList", amazonPrepFeesDetailsList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "SKUPrepInstructions",this);
    }


    /** Value constructor. */
    public SKUPrepInstructions(String sellerSKU,String asin,String barcodeInstruction,String prepGuidance,PrepInstructionList prepInstructionList) {
        this.sellerSKU = sellerSKU;
        this.asin = asin;
        this.barcodeInstruction = barcodeInstruction;
        this.prepGuidance = prepGuidance;
        this.prepInstructionList = prepInstructionList;
    }

    /** Value constructor. */
    public SKUPrepInstructions(String sellerSKU,String asin,String barcodeInstruction,String prepGuidance,PrepInstructionList prepInstructionList,AmazonPrepFeesDetailsList amazonPrepFeesDetailsList) {
        this.sellerSKU = sellerSKU;
        this.asin = asin;
        this.barcodeInstruction = barcodeInstruction;
        this.prepGuidance = prepGuidance;
        this.prepInstructionList = prepInstructionList;
        this.amazonPrepFeesDetailsList = amazonPrepFeesDetailsList;
    }

    /** Default constructor. */
    public SKUPrepInstructions() {
        super();
    }

}

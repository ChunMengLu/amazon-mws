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
 * Get Prep Instructions For SKU Result
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
 * GetPrepInstructionsForSKUResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPrepInstructionsForSKUResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SKUPrepInstructionsList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}SKUPrepInstructionsList" minOccurs="0"/&gt;
 *             &lt;element name="InvalidSKUList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InvalidSKUList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPrepInstructionsForSKUResult", propOrder={
    "skuPrepInstructionsList",
    "invalidSKUList"
})
@XmlRootElement(name = "GetPrepInstructionsForSKUResult")
public class GetPrepInstructionsForSKUResult extends AbstractMwsObject {

    @XmlElement(name="SKUPrepInstructionsList")
    private SKUPrepInstructionsList skuPrepInstructionsList;

    @XmlElement(name="InvalidSKUList")
    private InvalidSKUList invalidSKUList;

    /**
     * Get the value of SKUPrepInstructionsList.
     *
     * @return The value of SKUPrepInstructionsList.
     */
    public SKUPrepInstructionsList getSKUPrepInstructionsList() {
        return skuPrepInstructionsList;
    }

    /**
     * Set the value of SKUPrepInstructionsList.
     *
     * @param skuPrepInstructionsList
     *            The new value to set.
     */
    public void setSKUPrepInstructionsList(SKUPrepInstructionsList skuPrepInstructionsList) {
        this.skuPrepInstructionsList = skuPrepInstructionsList;
    }

    /**
     * Check to see if SKUPrepInstructionsList is set.
     *
     * @return true if SKUPrepInstructionsList is set.
     */
    public boolean isSetSKUPrepInstructionsList() {
        return skuPrepInstructionsList != null;
    }

    /**
     * Set the value of SKUPrepInstructionsList, return this.
     *
     * @param skuPrepInstructionsList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForSKUResult withSKUPrepInstructionsList(SKUPrepInstructionsList skuPrepInstructionsList) {
        this.skuPrepInstructionsList = skuPrepInstructionsList;
        return this;
    }

    /**
     * Get the value of InvalidSKUList.
     *
     * @return The value of InvalidSKUList.
     */
    public InvalidSKUList getInvalidSKUList() {
        return invalidSKUList;
    }

    /**
     * Set the value of InvalidSKUList.
     *
     * @param invalidSKUList
     *            The new value to set.
     */
    public void setInvalidSKUList(InvalidSKUList invalidSKUList) {
        this.invalidSKUList = invalidSKUList;
    }

    /**
     * Check to see if InvalidSKUList is set.
     *
     * @return true if InvalidSKUList is set.
     */
    public boolean isSetInvalidSKUList() {
        return invalidSKUList != null;
    }

    /**
     * Set the value of InvalidSKUList, return this.
     *
     * @param invalidSKUList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForSKUResult withInvalidSKUList(InvalidSKUList invalidSKUList) {
        this.invalidSKUList = invalidSKUList;
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
        skuPrepInstructionsList = r.read("SKUPrepInstructionsList", SKUPrepInstructionsList.class);
        invalidSKUList = r.read("InvalidSKUList", InvalidSKUList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SKUPrepInstructionsList", skuPrepInstructionsList);
        w.write("InvalidSKUList", invalidSKUList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPrepInstructionsForSKUResult",this);
    }


    /** Value constructor. */
    public GetPrepInstructionsForSKUResult(SKUPrepInstructionsList skuPrepInstructionsList,InvalidSKUList invalidSKUList) {
        this.skuPrepInstructionsList = skuPrepInstructionsList;
        this.invalidSKUList = invalidSKUList;
    }

    /** Default constructor. */
    public GetPrepInstructionsForSKUResult() {
        super();
    }

}

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
 * Get Prep Instructions For ASIN Result
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
 * GetPrepInstructionsForASINResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPrepInstructionsForASINResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASINPrepInstructionsList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ASINPrepInstructionsList" minOccurs="0"/&gt;
 *             &lt;element name="InvalidASINList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InvalidASINList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPrepInstructionsForASINResult", propOrder={
    "asinPrepInstructionsList",
    "invalidASINList"
})
@XmlRootElement(name = "GetPrepInstructionsForASINResult")
public class GetPrepInstructionsForASINResult extends AbstractMwsObject {

    @XmlElement(name="ASINPrepInstructionsList")
    private ASINPrepInstructionsList asinPrepInstructionsList;

    @XmlElement(name="InvalidASINList")
    private InvalidASINList invalidASINList;

    /**
     * Get the value of ASINPrepInstructionsList.
     *
     * @return The value of ASINPrepInstructionsList.
     */
    public ASINPrepInstructionsList getASINPrepInstructionsList() {
        return asinPrepInstructionsList;
    }

    /**
     * Set the value of ASINPrepInstructionsList.
     *
     * @param asinPrepInstructionsList
     *            The new value to set.
     */
    public void setASINPrepInstructionsList(ASINPrepInstructionsList asinPrepInstructionsList) {
        this.asinPrepInstructionsList = asinPrepInstructionsList;
    }

    /**
     * Check to see if ASINPrepInstructionsList is set.
     *
     * @return true if ASINPrepInstructionsList is set.
     */
    public boolean isSetASINPrepInstructionsList() {
        return asinPrepInstructionsList != null;
    }

    /**
     * Set the value of ASINPrepInstructionsList, return this.
     *
     * @param asinPrepInstructionsList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForASINResult withASINPrepInstructionsList(ASINPrepInstructionsList asinPrepInstructionsList) {
        this.asinPrepInstructionsList = asinPrepInstructionsList;
        return this;
    }

    /**
     * Get the value of InvalidASINList.
     *
     * @return The value of InvalidASINList.
     */
    public InvalidASINList getInvalidASINList() {
        return invalidASINList;
    }

    /**
     * Set the value of InvalidASINList.
     *
     * @param invalidASINList
     *            The new value to set.
     */
    public void setInvalidASINList(InvalidASINList invalidASINList) {
        this.invalidASINList = invalidASINList;
    }

    /**
     * Check to see if InvalidASINList is set.
     *
     * @return true if InvalidASINList is set.
     */
    public boolean isSetInvalidASINList() {
        return invalidASINList != null;
    }

    /**
     * Set the value of InvalidASINList, return this.
     *
     * @param invalidASINList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForASINResult withInvalidASINList(InvalidASINList invalidASINList) {
        this.invalidASINList = invalidASINList;
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
        asinPrepInstructionsList = r.read("ASINPrepInstructionsList", ASINPrepInstructionsList.class);
        invalidASINList = r.read("InvalidASINList", InvalidASINList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ASINPrepInstructionsList", asinPrepInstructionsList);
        w.write("InvalidASINList", invalidASINList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPrepInstructionsForASINResult",this);
    }


    /** Value constructor. */
    public GetPrepInstructionsForASINResult(ASINPrepInstructionsList asinPrepInstructionsList,InvalidASINList invalidASINList) {
        this.asinPrepInstructionsList = asinPrepInstructionsList;
        this.invalidASINList = invalidASINList;
    }

    /** Default constructor. */
    public GetPrepInstructionsForASINResult() {
        super();
    }

}

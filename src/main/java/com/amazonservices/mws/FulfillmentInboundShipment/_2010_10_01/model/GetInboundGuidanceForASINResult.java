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
 * Get Inbound Guidance For ASIN Result
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
 * GetInboundGuidanceForASINResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetInboundGuidanceForASINResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASINInboundGuidanceList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ASINInboundGuidanceList" minOccurs="0"/&gt;
 *             &lt;element name="InvalidASINList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InvalidASINList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetInboundGuidanceForASINResult", propOrder={
    "asinInboundGuidanceList",
    "invalidASINList"
})
@XmlRootElement(name = "GetInboundGuidanceForASINResult")
public class GetInboundGuidanceForASINResult extends AbstractMwsObject {

    @XmlElement(name="ASINInboundGuidanceList")
    private ASINInboundGuidanceList asinInboundGuidanceList;

    @XmlElement(name="InvalidASINList")
    private InvalidASINList invalidASINList;

    /**
     * Get the value of ASINInboundGuidanceList.
     *
     * @return The value of ASINInboundGuidanceList.
     */
    public ASINInboundGuidanceList getASINInboundGuidanceList() {
        return asinInboundGuidanceList;
    }

    /**
     * Set the value of ASINInboundGuidanceList.
     *
     * @param asinInboundGuidanceList
     *            The new value to set.
     */
    public void setASINInboundGuidanceList(ASINInboundGuidanceList asinInboundGuidanceList) {
        this.asinInboundGuidanceList = asinInboundGuidanceList;
    }

    /**
     * Check to see if ASINInboundGuidanceList is set.
     *
     * @return true if ASINInboundGuidanceList is set.
     */
    public boolean isSetASINInboundGuidanceList() {
        return asinInboundGuidanceList != null;
    }

    /**
     * Set the value of ASINInboundGuidanceList, return this.
     *
     * @param asinInboundGuidanceList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetInboundGuidanceForASINResult withASINInboundGuidanceList(ASINInboundGuidanceList asinInboundGuidanceList) {
        this.asinInboundGuidanceList = asinInboundGuidanceList;
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
    public GetInboundGuidanceForASINResult withInvalidASINList(InvalidASINList invalidASINList) {
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
        asinInboundGuidanceList = r.read("ASINInboundGuidanceList", ASINInboundGuidanceList.class);
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
        w.write("ASINInboundGuidanceList", asinInboundGuidanceList);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetInboundGuidanceForASINResult",this);
    }


    /** Default constructor. */
    public GetInboundGuidanceForASINResult() {
        super();
    }

}

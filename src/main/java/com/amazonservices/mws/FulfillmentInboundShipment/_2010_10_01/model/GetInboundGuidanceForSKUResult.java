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
 * Get Inbound Guidance For SKU Result
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
 * GetInboundGuidanceForSKUResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetInboundGuidanceForSKUResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SKUInboundGuidanceList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}SKUInboundGuidanceList" minOccurs="0"/&gt;
 *             &lt;element name="InvalidSKUList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InvalidSKUList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetInboundGuidanceForSKUResult", propOrder={
    "skuInboundGuidanceList",
    "invalidSKUList"
})
@XmlRootElement(name = "GetInboundGuidanceForSKUResult")
public class GetInboundGuidanceForSKUResult extends AbstractMwsObject {

    @XmlElement(name="SKUInboundGuidanceList")
    private SKUInboundGuidanceList skuInboundGuidanceList;

    @XmlElement(name="InvalidSKUList")
    private InvalidSKUList invalidSKUList;

    /**
     * Get the value of SKUInboundGuidanceList.
     *
     * @return The value of SKUInboundGuidanceList.
     */
    public SKUInboundGuidanceList getSKUInboundGuidanceList() {
        return skuInboundGuidanceList;
    }

    /**
     * Set the value of SKUInboundGuidanceList.
     *
     * @param skuInboundGuidanceList
     *            The new value to set.
     */
    public void setSKUInboundGuidanceList(SKUInboundGuidanceList skuInboundGuidanceList) {
        this.skuInboundGuidanceList = skuInboundGuidanceList;
    }

    /**
     * Check to see if SKUInboundGuidanceList is set.
     *
     * @return true if SKUInboundGuidanceList is set.
     */
    public boolean isSetSKUInboundGuidanceList() {
        return skuInboundGuidanceList != null;
    }

    /**
     * Set the value of SKUInboundGuidanceList, return this.
     *
     * @param skuInboundGuidanceList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetInboundGuidanceForSKUResult withSKUInboundGuidanceList(SKUInboundGuidanceList skuInboundGuidanceList) {
        this.skuInboundGuidanceList = skuInboundGuidanceList;
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
    public GetInboundGuidanceForSKUResult withInvalidSKUList(InvalidSKUList invalidSKUList) {
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
        skuInboundGuidanceList = r.read("SKUInboundGuidanceList", SKUInboundGuidanceList.class);
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
        w.write("SKUInboundGuidanceList", skuInboundGuidanceList);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetInboundGuidanceForSKUResult",this);
    }


    /** Default constructor. */
    public GetInboundGuidanceForSKUResult() {
        super();
    }

}

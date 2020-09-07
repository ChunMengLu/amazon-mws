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
 * SKU Inbound Guidance List
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * SKUInboundGuidanceList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SKUInboundGuidanceList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SKUInboundGuidance" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}SKUInboundGuidance" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SKUInboundGuidanceList", propOrder={
    "skuInboundGuidance"
})
@XmlRootElement(name = "SKUInboundGuidanceList")
public class SKUInboundGuidanceList extends AbstractMwsObject {

    @XmlElement(name="SKUInboundGuidance")
    private List<SKUInboundGuidance> skuInboundGuidance;

    /**
     * Get the value of SKUInboundGuidance.
     *
     * @return The value of SKUInboundGuidance.
     */
    public List<SKUInboundGuidance> getSKUInboundGuidance() {
        if (skuInboundGuidance==null) {
            skuInboundGuidance = new ArrayList<SKUInboundGuidance>();
        }
        return skuInboundGuidance;
    }

    /**
     * Set the value of SKUInboundGuidance.
     *
     * @param skuInboundGuidance
     *            The new value to set.
     */
    public void setSKUInboundGuidance(List<SKUInboundGuidance> skuInboundGuidance) {
        this.skuInboundGuidance = skuInboundGuidance;
    }

    /**
     * Clear SKUInboundGuidance.
     */
    public void unsetSKUInboundGuidance() {
        this.skuInboundGuidance = null;
    }

    /**
     * Check to see if SKUInboundGuidance is set.
     *
     * @return true if SKUInboundGuidance is set.
     */
    public boolean isSetSKUInboundGuidance() {
        return skuInboundGuidance != null && !skuInboundGuidance.isEmpty();
    }

    /**
     * Add values for SKUInboundGuidance, return this.
     *
     * @param skuInboundGuidance
     *             New values to add.
     *
     * @return This instance.
     */
    public SKUInboundGuidanceList withSKUInboundGuidance(SKUInboundGuidance... values) {
        List<SKUInboundGuidance> list = getSKUInboundGuidance();
        for (SKUInboundGuidance value : values) {
            list.add(value);
        }
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
        skuInboundGuidance = r.readList("SKUInboundGuidance", SKUInboundGuidance.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("SKUInboundGuidance", skuInboundGuidance);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "SKUInboundGuidanceList",this);
    }


    /** Default constructor. */
    public SKUInboundGuidanceList() {
        super();
    }

}

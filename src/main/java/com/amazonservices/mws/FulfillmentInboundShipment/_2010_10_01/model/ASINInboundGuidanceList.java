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
 * ASIN Inbound Guidance List
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
 * ASINInboundGuidanceList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ASINInboundGuidanceList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASINInboundGuidance" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ASINInboundGuidance" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ASINInboundGuidanceList", propOrder={
    "asinInboundGuidance"
})
@XmlRootElement(name = "ASINInboundGuidanceList")
public class ASINInboundGuidanceList extends AbstractMwsObject {

    @XmlElement(name="ASINInboundGuidance")
    private List<ASINInboundGuidance> asinInboundGuidance;

    /**
     * Get the value of ASINInboundGuidance.
     *
     * @return The value of ASINInboundGuidance.
     */
    public List<ASINInboundGuidance> getASINInboundGuidance() {
        if (asinInboundGuidance==null) {
            asinInboundGuidance = new ArrayList<ASINInboundGuidance>();
        }
        return asinInboundGuidance;
    }

    /**
     * Set the value of ASINInboundGuidance.
     *
     * @param asinInboundGuidance
     *            The new value to set.
     */
    public void setASINInboundGuidance(List<ASINInboundGuidance> asinInboundGuidance) {
        this.asinInboundGuidance = asinInboundGuidance;
    }

    /**
     * Clear ASINInboundGuidance.
     */
    public void unsetASINInboundGuidance() {
        this.asinInboundGuidance = null;
    }

    /**
     * Check to see if ASINInboundGuidance is set.
     *
     * @return true if ASINInboundGuidance is set.
     */
    public boolean isSetASINInboundGuidance() {
        return asinInboundGuidance != null && !asinInboundGuidance.isEmpty();
    }

    /**
     * Add values for ASINInboundGuidance, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ASINInboundGuidanceList withASINInboundGuidance(ASINInboundGuidance... values) {
        List<ASINInboundGuidance> list = getASINInboundGuidance();
        for (ASINInboundGuidance value : values) {
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
        asinInboundGuidance = r.readList("ASINInboundGuidance", ASINInboundGuidance.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ASINInboundGuidance", asinInboundGuidance);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ASINInboundGuidanceList",this);
    }


    /** Default constructor. */
    public ASINInboundGuidanceList() {
        super();
    }

}

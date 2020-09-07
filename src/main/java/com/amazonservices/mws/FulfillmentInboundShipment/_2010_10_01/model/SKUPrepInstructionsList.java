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
 * SKU Prep Instructions List
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
 * SKUPrepInstructionsList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SKUPrepInstructionsList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SKUPrepInstructions" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}SKUPrepInstructions" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SKUPrepInstructionsList", propOrder={
    "skuPrepInstructions"
})
@XmlRootElement(name = "SKUPrepInstructionsList")
public class SKUPrepInstructionsList extends AbstractMwsObject {

    @XmlElement(name="SKUPrepInstructions")
    private List<SKUPrepInstructions> skuPrepInstructions;

    /**
     * Get the value of SKUPrepInstructions.
     *
     * @return The value of SKUPrepInstructions.
     */
    public List<SKUPrepInstructions> getSKUPrepInstructions() {
        if (skuPrepInstructions==null) {
            skuPrepInstructions = new ArrayList<SKUPrepInstructions>();
        }
        return skuPrepInstructions;
    }

    /**
     * Set the value of SKUPrepInstructions.
     *
     * @param skuPrepInstructions
     *            The new value to set.
     */
    public void setSKUPrepInstructions(List<SKUPrepInstructions> skuPrepInstructions) {
        this.skuPrepInstructions = skuPrepInstructions;
    }

    /**
     * Clear SKUPrepInstructions.
     */
    public void unsetSKUPrepInstructions() {
        this.skuPrepInstructions = null;
    }

    /**
     * Check to see if SKUPrepInstructions is set.
     *
     * @return true if SKUPrepInstructions is set.
     */
    public boolean isSetSKUPrepInstructions() {
        return skuPrepInstructions != null && !skuPrepInstructions.isEmpty();
    }

    /**
     * Add values for SKUPrepInstructions, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public SKUPrepInstructionsList withSKUPrepInstructions(SKUPrepInstructions... values) {
        List<SKUPrepInstructions> list = getSKUPrepInstructions();
        for (SKUPrepInstructions value : values) {
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
        skuPrepInstructions = r.readList("SKUPrepInstructions", SKUPrepInstructions.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("SKUPrepInstructions", skuPrepInstructions);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "SKUPrepInstructionsList",this);
    }


    /** Value constructor. */
    public SKUPrepInstructionsList(List<SKUPrepInstructions> skuPrepInstructions) {
        this.skuPrepInstructions = skuPrepInstructions;
    }

    /** Default constructor. */
    public SKUPrepInstructionsList() {
        super();
    }

}

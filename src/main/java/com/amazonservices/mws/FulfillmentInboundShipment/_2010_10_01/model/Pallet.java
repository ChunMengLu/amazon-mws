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
 * Pallet
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
 * Pallet complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Pallet"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Dimensions" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Dimensions"/&gt;
 *             &lt;element name="Weight" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Weight" minOccurs="0"/&gt;
 *             &lt;element name="IsStacked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Pallet", propOrder={
    "dimensions",
    "weight",
    "isStacked"
})
@XmlRootElement(name = "Pallet")
public class Pallet extends AbstractMwsObject {

    @XmlElement(name="Dimensions",required=true)
    private Dimensions dimensions;

    @XmlElement(name="Weight")
    private Weight weight;

    @XmlElement(name="IsStacked",required=true)
    private boolean isStacked;

    /**
     * Get the value of Dimensions.
     *
     * @return The value of Dimensions.
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Set the value of Dimensions.
     *
     * @param dimensions
     *            The new value to set.
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Check to see if Dimensions is set.
     *
     * @return true if Dimensions is set.
     */
    public boolean isSetDimensions() {
        return dimensions != null;
    }

    /**
     * Set the value of Dimensions, return this.
     *
     * @param dimensions
     *             The new value to set.
     *
     * @return This instance.
     */
    public Pallet withDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the value of Weight.
     *
     * @return The value of Weight.
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Set the value of Weight.
     *
     * @param weight
     *            The new value to set.
     */
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    /**
     * Check to see if Weight is set.
     *
     * @return true if Weight is set.
     */
    public boolean isSetWeight() {
        return weight != null;
    }

    /**
     * Set the value of Weight, return this.
     *
     * @param weight
     *             The new value to set.
     *
     * @return This instance.
     */
    public Pallet withWeight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Check the value of IsStacked.
     *
     * @return true if IsStacked is set to true.
     */
    public boolean isIsStacked() {
        return isStacked;
    }

    /**
     * Get the value of IsStacked.
     *
     * @return The value of IsStacked.
     */
    public boolean getIsStacked() {
        return isStacked;
    }

    /**
     * Set the value of IsStacked.
     *
     * @param isStacked
     *            The new value to set.
     */
    public void setIsStacked(boolean isStacked) {
        this.isStacked = isStacked;
    }

    /**
     * Set the value of IsStacked, return this.
     *
     * @param isStacked
     *             The new value to set.
     *
     * @return This instance.
     */
    public Pallet withIsStacked(boolean isStacked) {
        this.isStacked = isStacked;
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
        dimensions = r.read("Dimensions", Dimensions.class);
        weight = r.read("Weight", Weight.class);
        isStacked = r.read("IsStacked", boolean.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Dimensions", dimensions);
        w.write("Weight", weight);
        w.write("IsStacked", isStacked);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "Pallet",this);
    }

    /** Value constructor. */
    public Pallet(Dimensions dimensions,Weight weight,boolean isStacked) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.isStacked = isStacked;
    }

    /** Value constructor. */
    public Pallet(Dimensions dimensions,boolean isStacked) {
        this.dimensions = dimensions;
        this.isStacked = isStacked;
    }

    /** Default constructor. */
    public Pallet() {
        super();
    }

}

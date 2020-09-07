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
 * Partnered Small Parcel Package Input
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
 * PartneredSmallParcelPackageInput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PartneredSmallParcelPackageInput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Dimensions" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Dimensions"/&gt;
 *             &lt;element name="Weight" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Weight"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PartneredSmallParcelPackageInput", propOrder={
    "dimensions",
    "weight"
})
@XmlRootElement(name = "PartneredSmallParcelPackageInput")
public class PartneredSmallParcelPackageInput extends AbstractMwsObject {

    @XmlElement(name="Dimensions",required=true)
    private Dimensions dimensions;

    @XmlElement(name="Weight",required=true)
    private Weight weight;

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
    public PartneredSmallParcelPackageInput withDimensions(Dimensions dimensions) {
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
    public PartneredSmallParcelPackageInput withWeight(Weight weight) {
        this.weight = weight;
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
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PartneredSmallParcelPackageInput",this);
    }

    /** Value constructor. */
    public PartneredSmallParcelPackageInput(Dimensions dimensions,Weight weight) {
        this.dimensions = dimensions;
        this.weight = weight;
    }

    /** Default constructor. */
    public PartneredSmallParcelPackageInput() {
        super();
    }

}

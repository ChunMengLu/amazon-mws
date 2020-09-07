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
 * Dimensions
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

/**
 * Dimensions complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Dimensions"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Dimensions", propOrder={
    "length",
    "width",
    "height",
    "unit"
})
@XmlRootElement(name = "Dimensions")
public class Dimensions extends AbstractMwsObject {

    @XmlElement(name="Length",required=true)
    private BigDecimal length;

    @XmlElement(name="Width",required=true)
    private BigDecimal width;

    @XmlElement(name="Height",required=true)
    private BigDecimal height;

    @XmlElement(name="Unit",required=true)
    private String unit;

    /**
     * Get the value of Length.
     *
     * @return The value of Length.
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Set the value of Length.
     *
     * @param length
     *            The new value to set.
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * Check to see if Length is set.
     *
     * @return true if Length is set.
     */
    public boolean isSetLength() {
        return length != null;
    }

    /**
     * Set the value of Length, return this.
     *
     * @param length
     *             The new value to set.
     *
     * @return This instance.
     */
    public Dimensions withLength(BigDecimal length) {
        this.length = length;
        return this;
    }

    /**
     * Get the value of Width.
     *
     * @return The value of Width.
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Set the value of Width.
     *
     * @param width
     *            The new value to set.
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * Check to see if Width is set.
     *
     * @return true if Width is set.
     */
    public boolean isSetWidth() {
        return width != null;
    }

    /**
     * Set the value of Width, return this.
     *
     * @param width
     *             The new value to set.
     *
     * @return This instance.
     */
    public Dimensions withWidth(BigDecimal width) {
        this.width = width;
        return this;
    }

    /**
     * Get the value of Height.
     *
     * @return The value of Height.
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Set the value of Height.
     *
     * @param height
     *            The new value to set.
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * Check to see if Height is set.
     *
     * @return true if Height is set.
     */
    public boolean isSetHeight() {
        return height != null;
    }

    /**
     * Set the value of Height, return this.
     *
     * @param height
     *             The new value to set.
     *
     * @return This instance.
     */
    public Dimensions withHeight(BigDecimal height) {
        this.height = height;
        return this;
    }

    /**
     * Get the value of Unit.
     *
     * @return The value of Unit.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Set the value of Unit.
     *
     * @param unit
     *            The new value to set.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Check to see if Unit is set.
     *
     * @return true if Unit is set.
     */
    public boolean isSetUnit() {
        return unit != null;
    }

    /**
     * Set the value of Unit, return this.
     *
     * @param unit
     *             The new value to set.
     *
     * @return This instance.
     */
    public Dimensions withUnit(String unit) {
        this.unit = unit;
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
        length = r.read("Length", BigDecimal.class);
        width = r.read("Width", BigDecimal.class);
        height = r.read("Height", BigDecimal.class);
        unit = r.read("Unit", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Length", length);
        w.write("Width", width);
        w.write("Height", height);
        w.write("Unit", unit);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "Dimensions",this);
    }

    /** Value constructor. */
    public Dimensions(BigDecimal length,BigDecimal width,BigDecimal height,String unit) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.unit = unit;
    }

    /** Default constructor. */
    public Dimensions() {
        super();
    }

}

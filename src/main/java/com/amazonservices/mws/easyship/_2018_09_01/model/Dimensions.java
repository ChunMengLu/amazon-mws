/*******************************************************************************
 * Copyright 2009-2018 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Dimensions
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

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
 *             &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Dimensions extends AbstractMwsObject {

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

    private String unit;

    private String name;

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
     * Get the value of Name.
     *
     * @return The value of Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of Name.
     *
     * @param name
     *            The new value to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Check to see if Name is set.
     *
     * @return true if Name is set.
     */
    public boolean isSetName() {
        return name != null;
    }

    /**
     * Set the value of Name, return this.
     *
     * @param name
     *             The new value to set.
     *
     * @return This instance.
     */
    public Dimensions withName(String name) {
        this.name = name;
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
        name = r.read("Name", String.class);
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
        w.write("Name", name);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "Dimensions",this);
    }


    /** Default constructor. */
    public Dimensions() {
        super();
    }

}

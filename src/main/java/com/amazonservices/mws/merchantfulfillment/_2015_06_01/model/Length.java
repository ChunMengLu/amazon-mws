/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Length
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.math.BigDecimal;

/**
 * Length complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Length"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Length extends AbstractMwsObject {

    private BigDecimal value;

    private String unit;

    /**
     * Get the value of value.
     *
     * @return The value of value.
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Set the value of value.
     *
     * @param value
     *            The new value to set.
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Check to see if value is set.
     *
     * @return true if value is set.
     */
    public boolean isSetValue() {
        return value != null;
    }

    /**
     * Set the value of value, return this.
     *
     * @param value
     *             The new value to set.
     *
     * @return This instance.
     */
    public Length withValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * Get the value of unit.
     *
     * @return The value of unit.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Set the value of unit.
     *
     * @param unit
     *            The new value to set.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Check to see if unit is set.
     *
     * @return true if unit is set.
     */
    public boolean isSetUnit() {
        return unit != null;
    }

    /**
     * Set the value of unit, return this.
     *
     * @param unit
     *             The new value to set.
     *
     * @return This instance.
     */
    public Length withUnit(String unit) {
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
        value = r.read("value", BigDecimal.class);
        unit = r.read("unit", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("value", value);
        w.write("unit", unit);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Length",this);
    }


    /** Default constructor. */
    public Length() {
        super();
    }

}

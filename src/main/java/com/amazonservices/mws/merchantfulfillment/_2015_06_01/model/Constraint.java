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
 * Constraint
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * Constraint complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Constraint"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ValidationRegEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ValidationString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Constraint extends AbstractMwsObject {

    private String validationRegEx;

    private String validationString;

    /**
     * Get the value of ValidationRegEx.
     *
     * @return The value of ValidationRegEx.
     */
    public String getValidationRegEx() {
        return validationRegEx;
    }

    /**
     * Set the value of ValidationRegEx.
     *
     * @param validationRegEx
     *            The new value to set.
     */
    public void setValidationRegEx(String validationRegEx) {
        this.validationRegEx = validationRegEx;
    }

    /**
     * Check to see if ValidationRegEx is set.
     *
     * @return true if ValidationRegEx is set.
     */
    public boolean isSetValidationRegEx() {
        return validationRegEx != null;
    }

    /**
     * Set the value of ValidationRegEx, return this.
     *
     * @param validationRegEx
     *             The new value to set.
     *
     * @return This instance.
     */
    public Constraint withValidationRegEx(String validationRegEx) {
        this.validationRegEx = validationRegEx;
        return this;
    }

    /**
     * Get the value of ValidationString.
     *
     * @return The value of ValidationString.
     */
    public String getValidationString() {
        return validationString;
    }

    /**
     * Set the value of ValidationString.
     *
     * @param validationString
     *            The new value to set.
     */
    public void setValidationString(String validationString) {
        this.validationString = validationString;
    }

    /**
     * Check to see if ValidationString is set.
     *
     * @return true if ValidationString is set.
     */
    public boolean isSetValidationString() {
        return validationString != null;
    }

    /**
     * Set the value of ValidationString, return this.
     *
     * @param validationString
     *             The new value to set.
     *
     * @return This instance.
     */
    public Constraint withValidationString(String validationString) {
        this.validationString = validationString;
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
        validationRegEx = r.read("ValidationRegEx", String.class);
        validationString = r.read("ValidationString", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ValidationRegEx", validationRegEx);
        w.write("ValidationString", validationString);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Constraint",this);
    }

    /** Value constructor. */
    public Constraint(String validationString) {
        this.validationString = validationString;
    }

    /** Default constructor. */
    public Constraint() {
        super();
    }

}

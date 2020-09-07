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
 * Label Customization
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * LabelCustomization complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="LabelCustomization"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CustomTextForLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="StandardIdForLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class LabelCustomization extends AbstractMwsObject {

    private String customTextForLabel;

    private String standardIdForLabel;

    /**
     * Get the value of CustomTextForLabel.
     *
     * @return The value of CustomTextForLabel.
     */
    public String getCustomTextForLabel() {
        return customTextForLabel;
    }

    /**
     * Set the value of CustomTextForLabel.
     *
     * @param customTextForLabel
     *            The new value to set.
     */
    public void setCustomTextForLabel(String customTextForLabel) {
        this.customTextForLabel = customTextForLabel;
    }

    /**
     * Check to see if CustomTextForLabel is set.
     *
     * @return true if CustomTextForLabel is set.
     */
    public boolean isSetCustomTextForLabel() {
        return customTextForLabel != null;
    }

    /**
     * Set the value of CustomTextForLabel, return this.
     *
     * @param customTextForLabel
     *             The new value to set.
     *
     * @return This instance.
     */
    public LabelCustomization withCustomTextForLabel(String customTextForLabel) {
        this.customTextForLabel = customTextForLabel;
        return this;
    }

    /**
     * Get the value of StandardIdForLabel.
     *
     * @return The value of StandardIdForLabel.
     */
    public String getStandardIdForLabel() {
        return standardIdForLabel;
    }

    /**
     * Set the value of StandardIdForLabel.
     *
     * @param standardIdForLabel
     *            The new value to set.
     */
    public void setStandardIdForLabel(String standardIdForLabel) {
        this.standardIdForLabel = standardIdForLabel;
    }

    /**
     * Check to see if StandardIdForLabel is set.
     *
     * @return true if StandardIdForLabel is set.
     */
    public boolean isSetStandardIdForLabel() {
        return standardIdForLabel != null;
    }

    /**
     * Set the value of StandardIdForLabel, return this.
     *
     * @param standardIdForLabel
     *             The new value to set.
     *
     * @return This instance.
     */
    public LabelCustomization withStandardIdForLabel(String standardIdForLabel) {
        this.standardIdForLabel = standardIdForLabel;
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
        customTextForLabel = r.read("CustomTextForLabel", String.class);
        standardIdForLabel = r.read("StandardIdForLabel", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CustomTextForLabel", customTextForLabel);
        w.write("StandardIdForLabel", standardIdForLabel);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "LabelCustomization",this);
    }


    /** Default constructor. */
    public LabelCustomization() {
        super();
    }

}

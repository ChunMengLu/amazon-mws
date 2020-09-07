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
 * Additional Seller Inputs
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * AdditionalSellerInputs complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AdditionalSellerInputs"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AdditionalInputFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AdditionalSellerInput" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AdditionalSellerInput"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AdditionalSellerInputs extends AbstractMwsObject {

    private String additionalInputFieldName;

    private AdditionalSellerInput additionalSellerInput;

    /**
     * Get the value of AdditionalInputFieldName.
     *
     * @return The value of AdditionalInputFieldName.
     */
    public String getAdditionalInputFieldName() {
        return additionalInputFieldName;
    }

    /**
     * Set the value of AdditionalInputFieldName.
     *
     * @param additionalInputFieldName
     *            The new value to set.
     */
    public void setAdditionalInputFieldName(String additionalInputFieldName) {
        this.additionalInputFieldName = additionalInputFieldName;
    }

    /**
     * Check to see if AdditionalInputFieldName is set.
     *
     * @return true if AdditionalInputFieldName is set.
     */
    public boolean isSetAdditionalInputFieldName() {
        return additionalInputFieldName != null;
    }

    /**
     * Set the value of AdditionalInputFieldName, return this.
     *
     * @param additionalInputFieldName
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInputs withAdditionalInputFieldName(String additionalInputFieldName) {
        this.additionalInputFieldName = additionalInputFieldName;
        return this;
    }

    /**
     * Get the value of AdditionalSellerInput.
     *
     * @return The value of AdditionalSellerInput.
     */
    public AdditionalSellerInput getAdditionalSellerInput() {
        return additionalSellerInput;
    }

    /**
     * Set the value of AdditionalSellerInput.
     *
     * @param additionalSellerInput
     *            The new value to set.
     */
    public void setAdditionalSellerInput(AdditionalSellerInput additionalSellerInput) {
        this.additionalSellerInput = additionalSellerInput;
    }

    /**
     * Check to see if AdditionalSellerInput is set.
     *
     * @return true if AdditionalSellerInput is set.
     */
    public boolean isSetAdditionalSellerInput() {
        return additionalSellerInput != null;
    }

    /**
     * Set the value of AdditionalSellerInput, return this.
     *
     * @param additionalSellerInput
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInputs withAdditionalSellerInput(AdditionalSellerInput additionalSellerInput) {
        this.additionalSellerInput = additionalSellerInput;
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
        additionalInputFieldName = r.read("AdditionalInputFieldName", String.class);
        additionalSellerInput = r.read("AdditionalSellerInput", AdditionalSellerInput.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AdditionalInputFieldName", additionalInputFieldName);
        w.write("AdditionalSellerInput", additionalSellerInput);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "AdditionalSellerInputs",this);
    }

    /** Value constructor. */
    public AdditionalSellerInputs(String additionalInputFieldName,AdditionalSellerInput additionalSellerInput) {
        this.additionalInputFieldName = additionalInputFieldName;
        this.additionalSellerInput = additionalSellerInput;
    }

    /** Default constructor. */
    public AdditionalSellerInputs() {
        super();
    }

}

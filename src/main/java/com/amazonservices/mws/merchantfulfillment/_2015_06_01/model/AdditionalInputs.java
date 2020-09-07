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
 * Additional Inputs
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * AdditionalInputs complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AdditionalInputs"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AdditionalInputFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerInputDefinition" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}SellerInputDefinition" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AdditionalInputs extends AbstractMwsObject {

    private String additionalInputFieldName;

    private SellerInputDefinition sellerInputDefinition;

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
    public AdditionalInputs withAdditionalInputFieldName(String additionalInputFieldName) {
        this.additionalInputFieldName = additionalInputFieldName;
        return this;
    }

    /**
     * Get the value of SellerInputDefinition.
     *
     * @return The value of SellerInputDefinition.
     */
    public SellerInputDefinition getSellerInputDefinition() {
        return sellerInputDefinition;
    }

    /**
     * Set the value of SellerInputDefinition.
     *
     * @param sellerInputDefinition
     *            The new value to set.
     */
    public void setSellerInputDefinition(SellerInputDefinition sellerInputDefinition) {
        this.sellerInputDefinition = sellerInputDefinition;
    }

    /**
     * Check to see if SellerInputDefinition is set.
     *
     * @return true if SellerInputDefinition is set.
     */
    public boolean isSetSellerInputDefinition() {
        return sellerInputDefinition != null;
    }

    /**
     * Set the value of SellerInputDefinition, return this.
     *
     * @param sellerInputDefinition
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalInputs withSellerInputDefinition(SellerInputDefinition sellerInputDefinition) {
        this.sellerInputDefinition = sellerInputDefinition;
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
        sellerInputDefinition = r.read("SellerInputDefinition", SellerInputDefinition.class);
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
        w.write("SellerInputDefinition", sellerInputDefinition);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "AdditionalInputs",this);
    }


    /** Default constructor. */
    public AdditionalInputs() {
        super();
    }

}

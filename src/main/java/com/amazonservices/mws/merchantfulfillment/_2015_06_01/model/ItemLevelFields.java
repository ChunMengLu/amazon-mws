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
 * Item Level Fields
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * ItemLevelFields complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ItemLevelFields"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Asin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AdditionalInputs" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AdditionalInputs" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ItemLevelFields extends AbstractMwsObject {

    private String asin;

    private List<AdditionalInputs> additionalInputs;

    /**
     * Get the value of Asin.
     *
     * @return The value of Asin.
     */
    public String getAsin() {
        return asin;
    }

    /**
     * Set the value of Asin.
     *
     * @param asin
     *            The new value to set.
     */
    public void setAsin(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if Asin is set.
     *
     * @return true if Asin is set.
     */
    public boolean isSetAsin() {
        return asin != null;
    }

    /**
     * Set the value of Asin, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public ItemLevelFields withAsin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get the value of AdditionalInputs.
     *
     * @return The value of AdditionalInputs.
     */
    public List<AdditionalInputs> getAdditionalInputs() {
        if (additionalInputs==null) {
            additionalInputs = new ArrayList<AdditionalInputs>();
        }
        return additionalInputs;
    }

    /**
     * Set the value of AdditionalInputs.
     *
     * @param additionalInputs
     *            The new value to set.
     */
    public void setAdditionalInputs(List<AdditionalInputs> additionalInputs) {
        this.additionalInputs = additionalInputs;
    }

    /**
     * Clear AdditionalInputs.
     */
    public void unsetAdditionalInputs() {
        this.additionalInputs = null;
    }

    /**
     * Check to see if AdditionalInputs is set.
     *
     * @return true if AdditionalInputs is set.
     */
    public boolean isSetAdditionalInputs() {
        return additionalInputs != null && !additionalInputs.isEmpty();
    }

    /**
     * Add values for AdditionalInputs, return this.
     *
     * @param additionalInputs
     *             New values to add.
     *
     * @return This instance.
     */
    public ItemLevelFields withAdditionalInputs(AdditionalInputs... values) {
        List<AdditionalInputs> list = getAdditionalInputs();
        for (AdditionalInputs value : values) {
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
        asin = r.read("Asin", String.class);
        additionalInputs = r.readList("AdditionalInputs", "member", AdditionalInputs.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Asin", asin);
        w.writeList("AdditionalInputs", "member", additionalInputs);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "ItemLevelFields",this);
    }

    /** Value constructor. */
    public ItemLevelFields(String asin,List<AdditionalInputs> additionalInputs) {
        this.asin = asin;
        this.additionalInputs = additionalInputs;
    }

    /** Default constructor. */
    public ItemLevelFields() {
        super();
    }

}

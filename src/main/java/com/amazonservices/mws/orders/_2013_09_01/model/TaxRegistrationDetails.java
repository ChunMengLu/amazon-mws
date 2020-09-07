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
 * Tax Registration Details
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * TaxRegistrationDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TaxRegistrationDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="taxRegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="taxRegistrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="taxRegistrationAuthority" type="{https://mws.amazonservices.com/Orders/2013-09-01}TaxRegistrationAuthority" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class TaxRegistrationDetails extends AbstractMwsObject {

    private String taxRegistrationType;

    private String taxRegistrationId;

    private TaxRegistrationAuthority taxRegistrationAuthority;

    /**
     * Get the value of taxRegistrationType.
     *
     * @return The value of taxRegistrationType.
     */
    public String getTaxRegistrationType() {
        return taxRegistrationType;
    }

    /**
     * Set the value of taxRegistrationType.
     *
     * @param taxRegistrationType
     *            The new value to set.
     */
    public void setTaxRegistrationType(String taxRegistrationType) {
        this.taxRegistrationType = taxRegistrationType;
    }

    /**
     * Check to see if taxRegistrationType is set.
     *
     * @return true if taxRegistrationType is set.
     */
    public boolean isSetTaxRegistrationType() {
        return taxRegistrationType != null;
    }

    /**
     * Set the value of taxRegistrationType, return this.
     *
     * @param taxRegistrationType
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationDetails withTaxRegistrationType(String taxRegistrationType) {
        this.taxRegistrationType = taxRegistrationType;
        return this;
    }

    /**
     * Get the value of taxRegistrationId.
     *
     * @return The value of taxRegistrationId.
     */
    public String getTaxRegistrationId() {
        return taxRegistrationId;
    }

    /**
     * Set the value of taxRegistrationId.
     *
     * @param taxRegistrationId
     *            The new value to set.
     */
    public void setTaxRegistrationId(String taxRegistrationId) {
        this.taxRegistrationId = taxRegistrationId;
    }

    /**
     * Check to see if taxRegistrationId is set.
     *
     * @return true if taxRegistrationId is set.
     */
    public boolean isSetTaxRegistrationId() {
        return taxRegistrationId != null;
    }

    /**
     * Set the value of taxRegistrationId, return this.
     *
     * @param taxRegistrationId
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationDetails withTaxRegistrationId(String taxRegistrationId) {
        this.taxRegistrationId = taxRegistrationId;
        return this;
    }

    /**
     * Get the value of taxRegistrationAuthority.
     *
     * @return The value of taxRegistrationAuthority.
     */
    public TaxRegistrationAuthority getTaxRegistrationAuthority() {
        return taxRegistrationAuthority;
    }

    /**
     * Set the value of taxRegistrationAuthority.
     *
     * @param taxRegistrationAuthority
     *            The new value to set.
     */
    public void setTaxRegistrationAuthority(TaxRegistrationAuthority taxRegistrationAuthority) {
        this.taxRegistrationAuthority = taxRegistrationAuthority;
    }

    /**
     * Check to see if taxRegistrationAuthority is set.
     *
     * @return true if taxRegistrationAuthority is set.
     */
    public boolean isSetTaxRegistrationAuthority() {
        return taxRegistrationAuthority != null;
    }

    /**
     * Set the value of taxRegistrationAuthority, return this.
     *
     * @param taxRegistrationAuthority
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationDetails withTaxRegistrationAuthority(TaxRegistrationAuthority taxRegistrationAuthority) {
        this.taxRegistrationAuthority = taxRegistrationAuthority;
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
        taxRegistrationType = r.read("taxRegistrationType", String.class);
        taxRegistrationId = r.read("taxRegistrationId", String.class);
        taxRegistrationAuthority = r.read("taxRegistrationAuthority", TaxRegistrationAuthority.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("taxRegistrationType", taxRegistrationType);
        w.write("taxRegistrationId", taxRegistrationId);
        w.write("taxRegistrationAuthority", taxRegistrationAuthority);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "TaxRegistrationDetails",this);
    }


    /** Default constructor. */
    public TaxRegistrationDetails() {
        super();
    }

}

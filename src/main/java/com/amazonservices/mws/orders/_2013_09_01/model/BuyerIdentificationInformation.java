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
 * Buyer Identification Information
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * BuyerIdentificationInformation complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="BuyerIdentificationInformation"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="BuyerCitizenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="BuyerLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class BuyerIdentificationInformation extends AbstractMwsObject {

    private String buyerCitizenId;

    private String buyerLegalName;

    /**
     * Get the value of BuyerCitizenId.
     *
     * @return The value of BuyerCitizenId.
     */
    public String getBuyerCitizenId() {
        return buyerCitizenId;
    }

    /**
     * Set the value of BuyerCitizenId.
     *
     * @param buyerCitizenId
     *            The new value to set.
     */
    public void setBuyerCitizenId(String buyerCitizenId) {
        this.buyerCitizenId = buyerCitizenId;
    }

    /**
     * Check to see if BuyerCitizenId is set.
     *
     * @return true if BuyerCitizenId is set.
     */
    public boolean isSetBuyerCitizenId() {
        return buyerCitizenId != null;
    }

    /**
     * Set the value of BuyerCitizenId, return this.
     *
     * @param buyerCitizenId
     *             The new value to set.
     *
     * @return This instance.
     */
    public BuyerIdentificationInformation withBuyerCitizenId(String buyerCitizenId) {
        this.buyerCitizenId = buyerCitizenId;
        return this;
    }

    /**
     * Get the value of BuyerLegalName.
     *
     * @return The value of BuyerLegalName.
     */
    public String getBuyerLegalName() {
        return buyerLegalName;
    }

    /**
     * Set the value of BuyerLegalName.
     *
     * @param buyerLegalName
     *            The new value to set.
     */
    public void setBuyerLegalName(String buyerLegalName) {
        this.buyerLegalName = buyerLegalName;
    }

    /**
     * Check to see if BuyerLegalName is set.
     *
     * @return true if BuyerLegalName is set.
     */
    public boolean isSetBuyerLegalName() {
        return buyerLegalName != null;
    }

    /**
     * Set the value of BuyerLegalName, return this.
     *
     * @param buyerLegalName
     *             The new value to set.
     *
     * @return This instance.
     */
    public BuyerIdentificationInformation withBuyerLegalName(String buyerLegalName) {
        this.buyerLegalName = buyerLegalName;
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
        buyerCitizenId = r.read("BuyerCitizenId", String.class);
        buyerLegalName = r.read("BuyerLegalName", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("BuyerCitizenId", buyerCitizenId);
        w.write("BuyerLegalName", buyerLegalName);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "BuyerIdentificationInformation",this);
    }


    /** Default constructor. */
    public BuyerIdentificationInformation() {
        super();
    }

}

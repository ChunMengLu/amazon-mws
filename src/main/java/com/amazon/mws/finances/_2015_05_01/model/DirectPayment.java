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
 * Direct Payment
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * DirectPayment complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DirectPayment"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DirectPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DirectPaymentAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DirectPayment extends AbstractMwsObject {

    private String directPaymentType;

    private Currency directPaymentAmount;

    /**
     * Get the value of DirectPaymentType.
     *
     * @return The value of DirectPaymentType.
     */
    public String getDirectPaymentType() {
        return directPaymentType;
    }

    /**
     * Set the value of DirectPaymentType.
     *
     * @param directPaymentType
     *            The new value to set.
     */
    public void setDirectPaymentType(String directPaymentType) {
        this.directPaymentType = directPaymentType;
    }

    /**
     * Check to see if DirectPaymentType is set.
     *
     * @return true if DirectPaymentType is set.
     */
    public boolean isSetDirectPaymentType() {
        return directPaymentType != null;
    }

    /**
     * Set the value of DirectPaymentType, return this.
     *
     * @param directPaymentType
     *             The new value to set.
     *
     * @return This instance.
     */
    public DirectPayment withDirectPaymentType(String directPaymentType) {
        this.directPaymentType = directPaymentType;
        return this;
    }

    /**
     * Get the value of DirectPaymentAmount.
     *
     * @return The value of DirectPaymentAmount.
     */
    public Currency getDirectPaymentAmount() {
        return directPaymentAmount;
    }

    /**
     * Set the value of DirectPaymentAmount.
     *
     * @param directPaymentAmount
     *            The new value to set.
     */
    public void setDirectPaymentAmount(Currency directPaymentAmount) {
        this.directPaymentAmount = directPaymentAmount;
    }

    /**
     * Check to see if DirectPaymentAmount is set.
     *
     * @return true if DirectPaymentAmount is set.
     */
    public boolean isSetDirectPaymentAmount() {
        return directPaymentAmount != null;
    }

    /**
     * Set the value of DirectPaymentAmount, return this.
     *
     * @param directPaymentAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public DirectPayment withDirectPaymentAmount(Currency directPaymentAmount) {
        this.directPaymentAmount = directPaymentAmount;
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
        directPaymentType = r.read("DirectPaymentType", String.class);
        directPaymentAmount = r.read("DirectPaymentAmount", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DirectPaymentType", directPaymentType);
        w.write("DirectPaymentAmount", directPaymentAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "DirectPayment",this);
    }


    /** Default constructor. */
    public DirectPayment() {
        super();
    }

}

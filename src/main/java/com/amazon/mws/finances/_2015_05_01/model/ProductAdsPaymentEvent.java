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
 * Product Ads Payment Event
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * ProductAdsPaymentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ProductAdsPaymentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="postedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="baseValue" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="taxValue" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="transactionValue" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ProductAdsPaymentEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String transactionType;

    private String invoiceId;

    private Currency baseValue;

    private Currency taxValue;

    private Currency transactionValue;

    /**
     * Get the value of postedDate.
     *
     * @return The value of postedDate.
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Set the value of postedDate.
     *
     * @param postedDate
     *            The new value to set.
     */
    public void setPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
    }

    /**
     * Check to see if postedDate is set.
     *
     * @return true if postedDate is set.
     */
    public boolean isSetPostedDate() {
        return postedDate != null;
    }

    /**
     * Set the value of postedDate, return this.
     *
     * @param postedDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ProductAdsPaymentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of transactionType.
     *
     * @return The value of transactionType.
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Set the value of transactionType.
     *
     * @param transactionType
     *            The new value to set.
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Check to see if transactionType is set.
     *
     * @return true if transactionType is set.
     */
    public boolean isSetTransactionType() {
        return transactionType != null;
    }

    /**
     * Set the value of transactionType, return this.
     *
     * @param transactionType
     *             The new value to set.
     *
     * @return This instance.
     */
    public ProductAdsPaymentEvent withTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get the value of invoiceId.
     *
     * @return The value of invoiceId.
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Set the value of invoiceId.
     *
     * @param invoiceId
     *            The new value to set.
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Check to see if invoiceId is set.
     *
     * @return true if invoiceId is set.
     */
    public boolean isSetInvoiceId() {
        return invoiceId != null;
    }

    /**
     * Set the value of invoiceId, return this.
     *
     * @param invoiceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ProductAdsPaymentEvent withInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Get the value of baseValue.
     *
     * @return The value of baseValue.
     */
    public Currency getBaseValue() {
        return baseValue;
    }

    /**
     * Set the value of baseValue.
     *
     * @param baseValue
     *            The new value to set.
     */
    public void setBaseValue(Currency baseValue) {
        this.baseValue = baseValue;
    }

    /**
     * Check to see if baseValue is set.
     *
     * @return true if baseValue is set.
     */
    public boolean isSetBaseValue() {
        return baseValue != null;
    }

    /**
     * Set the value of baseValue, return this.
     *
     * @param baseValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public ProductAdsPaymentEvent withBaseValue(Currency baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    /**
     * Get the value of taxValue.
     *
     * @return The value of taxValue.
     */
    public Currency getTaxValue() {
        return taxValue;
    }

    /**
     * Set the value of taxValue.
     *
     * @param taxValue
     *            The new value to set.
     */
    public void setTaxValue(Currency taxValue) {
        this.taxValue = taxValue;
    }

    /**
     * Check to see if taxValue is set.
     *
     * @return true if taxValue is set.
     */
    public boolean isSetTaxValue() {
        return taxValue != null;
    }

    /**
     * Set the value of taxValue, return this.
     *
     * @param taxValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public ProductAdsPaymentEvent withTaxValue(Currency taxValue) {
        this.taxValue = taxValue;
        return this;
    }

    /**
     * Get the value of transactionValue.
     *
     * @return The value of transactionValue.
     */
    public Currency getTransactionValue() {
        return transactionValue;
    }

    /**
     * Set the value of transactionValue.
     *
     * @param transactionValue
     *            The new value to set.
     */
    public void setTransactionValue(Currency transactionValue) {
        this.transactionValue = transactionValue;
    }

    /**
     * Check to see if transactionValue is set.
     *
     * @return true if transactionValue is set.
     */
    public boolean isSetTransactionValue() {
        return transactionValue != null;
    }

    /**
     * Set the value of transactionValue, return this.
     *
     * @param transactionValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public ProductAdsPaymentEvent withTransactionValue(Currency transactionValue) {
        this.transactionValue = transactionValue;
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
        postedDate = r.read("postedDate", XMLGregorianCalendar.class);
        transactionType = r.read("transactionType", String.class);
        invoiceId = r.read("invoiceId", String.class);
        baseValue = r.read("baseValue", Currency.class);
        taxValue = r.read("taxValue", Currency.class);
        transactionValue = r.read("transactionValue", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("postedDate", postedDate);
        w.write("transactionType", transactionType);
        w.write("invoiceId", invoiceId);
        w.write("baseValue", baseValue);
        w.write("taxValue", taxValue);
        w.write("transactionValue", transactionValue);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ProductAdsPaymentEvent",this);
    }


    /** Default constructor. */
    public ProductAdsPaymentEvent() {
        super();
    }

}

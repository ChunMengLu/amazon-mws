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
 * Seller Deal Payment Event
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
 * SellerDealPaymentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SellerDealPaymentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="postedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="dealDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="feeAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="taxAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="totalAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SellerDealPaymentEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String dealId;

    private String dealDescription;

    private String eventType;

    private String feeType;

    private Currency feeAmount;

    private Currency taxAmount;

    private Currency totalAmount;

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
    public SellerDealPaymentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of dealId.
     *
     * @return The value of dealId.
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Set the value of dealId.
     *
     * @param dealId
     *            The new value to set.
     */
    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    /**
     * Check to see if dealId is set.
     *
     * @return true if dealId is set.
     */
    public boolean isSetDealId() {
        return dealId != null;
    }

    /**
     * Set the value of dealId, return this.
     *
     * @param dealId
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerDealPaymentEvent withDealId(String dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
     * Get the value of dealDescription.
     *
     * @return The value of dealDescription.
     */
    public String getDealDescription() {
        return dealDescription;
    }

    /**
     * Set the value of dealDescription.
     *
     * @param dealDescription
     *            The new value to set.
     */
    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    /**
     * Check to see if dealDescription is set.
     *
     * @return true if dealDescription is set.
     */
    public boolean isSetDealDescription() {
        return dealDescription != null;
    }

    /**
     * Set the value of dealDescription, return this.
     *
     * @param dealDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerDealPaymentEvent withDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
        return this;
    }

    /**
     * Get the value of eventType.
     *
     * @return The value of eventType.
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Set the value of eventType.
     *
     * @param eventType
     *            The new value to set.
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * Check to see if eventType is set.
     *
     * @return true if eventType is set.
     */
    public boolean isSetEventType() {
        return eventType != null;
    }

    /**
     * Set the value of eventType, return this.
     *
     * @param eventType
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerDealPaymentEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the value of feeType.
     *
     * @return The value of feeType.
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Set the value of feeType.
     *
     * @param feeType
     *            The new value to set.
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * Check to see if feeType is set.
     *
     * @return true if feeType is set.
     */
    public boolean isSetFeeType() {
        return feeType != null;
    }

    /**
     * Set the value of feeType, return this.
     *
     * @param feeType
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerDealPaymentEvent withFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Get the value of feeAmount.
     *
     * @return The value of feeAmount.
     */
    public Currency getFeeAmount() {
        return feeAmount;
    }

    /**
     * Set the value of feeAmount.
     *
     * @param feeAmount
     *            The new value to set.
     */
    public void setFeeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Check to see if feeAmount is set.
     *
     * @return true if feeAmount is set.
     */
    public boolean isSetFeeAmount() {
        return feeAmount != null;
    }

    /**
     * Set the value of feeAmount, return this.
     *
     * @param feeAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerDealPaymentEvent withFeeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Get the value of taxAmount.
     *
     * @return The value of taxAmount.
     */
    public Currency getTaxAmount() {
        return taxAmount;
    }

    /**
     * Set the value of taxAmount.
     *
     * @param taxAmount
     *            The new value to set.
     */
    public void setTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Check to see if taxAmount is set.
     *
     * @return true if taxAmount is set.
     */
    public boolean isSetTaxAmount() {
        return taxAmount != null;
    }

    /**
     * Set the value of taxAmount, return this.
     *
     * @param taxAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerDealPaymentEvent withTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Get the value of totalAmount.
     *
     * @return The value of totalAmount.
     */
    public Currency getTotalAmount() {
        return totalAmount;
    }

    /**
     * Set the value of totalAmount.
     *
     * @param totalAmount
     *            The new value to set.
     */
    public void setTotalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Check to see if totalAmount is set.
     *
     * @return true if totalAmount is set.
     */
    public boolean isSetTotalAmount() {
        return totalAmount != null;
    }

    /**
     * Set the value of totalAmount, return this.
     *
     * @param totalAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerDealPaymentEvent withTotalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
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
        dealId = r.read("dealId", String.class);
        dealDescription = r.read("dealDescription", String.class);
        eventType = r.read("eventType", String.class);
        feeType = r.read("feeType", String.class);
        feeAmount = r.read("feeAmount", Currency.class);
        taxAmount = r.read("taxAmount", Currency.class);
        totalAmount = r.read("totalAmount", Currency.class);
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
        w.write("dealId", dealId);
        w.write("dealDescription", dealDescription);
        w.write("eventType", eventType);
        w.write("feeType", feeType);
        w.write("feeAmount", feeAmount);
        w.write("taxAmount", taxAmount);
        w.write("totalAmount", totalAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "SellerDealPaymentEvent",this);
    }


    /** Default constructor. */
    public SellerDealPaymentEvent() {
        super();
    }

}

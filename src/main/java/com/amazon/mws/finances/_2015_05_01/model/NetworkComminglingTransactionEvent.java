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
 * Network Commingling Transaction Event
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
 * NetworkComminglingTransactionEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="NetworkComminglingTransactionEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="NetCoTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SwapReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TaxExclusiveAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TaxAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class NetworkComminglingTransactionEvent extends AbstractMwsObject {

    private String transactionType;

    private XMLGregorianCalendar postedDate;

    private String netCoTransactionID;

    private String swapReason;

    private String asin;

    private String marketplaceId;

    private Currency taxExclusiveAmount;

    private Currency taxAmount;

    /**
     * Get the value of TransactionType.
     *
     * @return The value of TransactionType.
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Set the value of TransactionType.
     *
     * @param transactionType
     *            The new value to set.
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Check to see if TransactionType is set.
     *
     * @return true if TransactionType is set.
     */
    public boolean isSetTransactionType() {
        return transactionType != null;
    }

    /**
     * Set the value of TransactionType, return this.
     *
     * @param transactionType
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get the value of PostedDate.
     *
     * @return The value of PostedDate.
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Set the value of PostedDate.
     *
     * @param postedDate
     *            The new value to set.
     */
    public void setPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
    }

    /**
     * Check to see if PostedDate is set.
     *
     * @return true if PostedDate is set.
     */
    public boolean isSetPostedDate() {
        return postedDate != null;
    }

    /**
     * Set the value of PostedDate, return this.
     *
     * @param postedDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of NetCoTransactionID.
     *
     * @return The value of NetCoTransactionID.
     */
    public String getNetCoTransactionID() {
        return netCoTransactionID;
    }

    /**
     * Set the value of NetCoTransactionID.
     *
     * @param netCoTransactionID
     *            The new value to set.
     */
    public void setNetCoTransactionID(String netCoTransactionID) {
        this.netCoTransactionID = netCoTransactionID;
    }

    /**
     * Check to see if NetCoTransactionID is set.
     *
     * @return true if NetCoTransactionID is set.
     */
    public boolean isSetNetCoTransactionID() {
        return netCoTransactionID != null;
    }

    /**
     * Set the value of NetCoTransactionID, return this.
     *
     * @param netCoTransactionID
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withNetCoTransactionID(String netCoTransactionID) {
        this.netCoTransactionID = netCoTransactionID;
        return this;
    }

    /**
     * Get the value of SwapReason.
     *
     * @return The value of SwapReason.
     */
    public String getSwapReason() {
        return swapReason;
    }

    /**
     * Set the value of SwapReason.
     *
     * @param swapReason
     *            The new value to set.
     */
    public void setSwapReason(String swapReason) {
        this.swapReason = swapReason;
    }

    /**
     * Check to see if SwapReason is set.
     *
     * @return true if SwapReason is set.
     */
    public boolean isSetSwapReason() {
        return swapReason != null;
    }

    /**
     * Set the value of SwapReason, return this.
     *
     * @param swapReason
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withSwapReason(String swapReason) {
        this.swapReason = swapReason;
        return this;
    }

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withASIN(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of TaxExclusiveAmount.
     *
     * @return The value of TaxExclusiveAmount.
     */
    public Currency getTaxExclusiveAmount() {
        return taxExclusiveAmount;
    }

    /**
     * Set the value of TaxExclusiveAmount.
     *
     * @param taxExclusiveAmount
     *            The new value to set.
     */
    public void setTaxExclusiveAmount(Currency taxExclusiveAmount) {
        this.taxExclusiveAmount = taxExclusiveAmount;
    }

    /**
     * Check to see if TaxExclusiveAmount is set.
     *
     * @return true if TaxExclusiveAmount is set.
     */
    public boolean isSetTaxExclusiveAmount() {
        return taxExclusiveAmount != null;
    }

    /**
     * Set the value of TaxExclusiveAmount, return this.
     *
     * @param taxExclusiveAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withTaxExclusiveAmount(Currency taxExclusiveAmount) {
        this.taxExclusiveAmount = taxExclusiveAmount;
        return this;
    }

    /**
     * Get the value of TaxAmount.
     *
     * @return The value of TaxAmount.
     */
    public Currency getTaxAmount() {
        return taxAmount;
    }

    /**
     * Set the value of TaxAmount.
     *
     * @param taxAmount
     *            The new value to set.
     */
    public void setTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Check to see if TaxAmount is set.
     *
     * @return true if TaxAmount is set.
     */
    public boolean isSetTaxAmount() {
        return taxAmount != null;
    }

    /**
     * Set the value of TaxAmount, return this.
     *
     * @param taxAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public NetworkComminglingTransactionEvent withTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
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
        transactionType = r.read("TransactionType", String.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        netCoTransactionID = r.read("NetCoTransactionID", String.class);
        swapReason = r.read("SwapReason", String.class);
        asin = r.read("ASIN", String.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        taxExclusiveAmount = r.read("TaxExclusiveAmount", Currency.class);
        taxAmount = r.read("TaxAmount", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TransactionType", transactionType);
        w.write("PostedDate", postedDate);
        w.write("NetCoTransactionID", netCoTransactionID);
        w.write("SwapReason", swapReason);
        w.write("ASIN", asin);
        w.write("MarketplaceId", marketplaceId);
        w.write("TaxExclusiveAmount", taxExclusiveAmount);
        w.write("TaxAmount", taxAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "NetworkComminglingTransactionEvent",this);
    }


    /** Default constructor. */
    public NetworkComminglingTransactionEvent() {
        super();
    }

}

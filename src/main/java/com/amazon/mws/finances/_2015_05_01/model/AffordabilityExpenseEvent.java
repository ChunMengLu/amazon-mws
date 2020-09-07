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
 * Affordability Expense Event
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
 * AffordabilityExpenseEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AffordabilityExpenseEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="BaseExpense" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TaxTypeCGST" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TaxTypeSGST" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TaxTypeIGST" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="TotalExpense" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AffordabilityExpenseEvent extends AbstractMwsObject {

    private String amazonOrderId;

    private XMLGregorianCalendar postedDate;

    private String marketplaceId;

    private String transactionType;

    private Currency baseExpense;

    private Currency taxTypeCGST;

    private Currency taxTypeSGST;

    private Currency taxTypeIGST;

    private Currency totalExpense;

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null;
    }

    /**
     * Set the value of AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public AffordabilityExpenseEvent withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
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
    public AffordabilityExpenseEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
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
    public AffordabilityExpenseEvent withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

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
    public AffordabilityExpenseEvent withTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get the value of BaseExpense.
     *
     * @return The value of BaseExpense.
     */
    public Currency getBaseExpense() {
        return baseExpense;
    }

    /**
     * Set the value of BaseExpense.
     *
     * @param baseExpense
     *            The new value to set.
     */
    public void setBaseExpense(Currency baseExpense) {
        this.baseExpense = baseExpense;
    }

    /**
     * Check to see if BaseExpense is set.
     *
     * @return true if BaseExpense is set.
     */
    public boolean isSetBaseExpense() {
        return baseExpense != null;
    }

    /**
     * Set the value of BaseExpense, return this.
     *
     * @param baseExpense
     *             The new value to set.
     *
     * @return This instance.
     */
    public AffordabilityExpenseEvent withBaseExpense(Currency baseExpense) {
        this.baseExpense = baseExpense;
        return this;
    }

    /**
     * Get the value of TaxTypeCGST.
     *
     * @return The value of TaxTypeCGST.
     */
    public Currency getTaxTypeCGST() {
        return taxTypeCGST;
    }

    /**
     * Set the value of TaxTypeCGST.
     *
     * @param taxTypeCGST
     *            The new value to set.
     */
    public void setTaxTypeCGST(Currency taxTypeCGST) {
        this.taxTypeCGST = taxTypeCGST;
    }

    /**
     * Check to see if TaxTypeCGST is set.
     *
     * @return true if TaxTypeCGST is set.
     */
    public boolean isSetTaxTypeCGST() {
        return taxTypeCGST != null;
    }

    /**
     * Set the value of TaxTypeCGST, return this.
     *
     * @param taxTypeCGST
     *             The new value to set.
     *
     * @return This instance.
     */
    public AffordabilityExpenseEvent withTaxTypeCGST(Currency taxTypeCGST) {
        this.taxTypeCGST = taxTypeCGST;
        return this;
    }

    /**
     * Get the value of TaxTypeSGST.
     *
     * @return The value of TaxTypeSGST.
     */
    public Currency getTaxTypeSGST() {
        return taxTypeSGST;
    }

    /**
     * Set the value of TaxTypeSGST.
     *
     * @param taxTypeSGST
     *            The new value to set.
     */
    public void setTaxTypeSGST(Currency taxTypeSGST) {
        this.taxTypeSGST = taxTypeSGST;
    }

    /**
     * Check to see if TaxTypeSGST is set.
     *
     * @return true if TaxTypeSGST is set.
     */
    public boolean isSetTaxTypeSGST() {
        return taxTypeSGST != null;
    }

    /**
     * Set the value of TaxTypeSGST, return this.
     *
     * @param taxTypeSGST
     *             The new value to set.
     *
     * @return This instance.
     */
    public AffordabilityExpenseEvent withTaxTypeSGST(Currency taxTypeSGST) {
        this.taxTypeSGST = taxTypeSGST;
        return this;
    }

    /**
     * Get the value of TaxTypeIGST.
     *
     * @return The value of TaxTypeIGST.
     */
    public Currency getTaxTypeIGST() {
        return taxTypeIGST;
    }

    /**
     * Set the value of TaxTypeIGST.
     *
     * @param taxTypeIGST
     *            The new value to set.
     */
    public void setTaxTypeIGST(Currency taxTypeIGST) {
        this.taxTypeIGST = taxTypeIGST;
    }

    /**
     * Check to see if TaxTypeIGST is set.
     *
     * @return true if TaxTypeIGST is set.
     */
    public boolean isSetTaxTypeIGST() {
        return taxTypeIGST != null;
    }

    /**
     * Set the value of TaxTypeIGST, return this.
     *
     * @param taxTypeIGST
     *             The new value to set.
     *
     * @return This instance.
     */
    public AffordabilityExpenseEvent withTaxTypeIGST(Currency taxTypeIGST) {
        this.taxTypeIGST = taxTypeIGST;
        return this;
    }

    /**
     * Get the value of TotalExpense.
     *
     * @return The value of TotalExpense.
     */
    public Currency getTotalExpense() {
        return totalExpense;
    }

    /**
     * Set the value of TotalExpense.
     *
     * @param totalExpense
     *            The new value to set.
     */
    public void setTotalExpense(Currency totalExpense) {
        this.totalExpense = totalExpense;
    }

    /**
     * Check to see if TotalExpense is set.
     *
     * @return true if TotalExpense is set.
     */
    public boolean isSetTotalExpense() {
        return totalExpense != null;
    }

    /**
     * Set the value of TotalExpense, return this.
     *
     * @param totalExpense
     *             The new value to set.
     *
     * @return This instance.
     */
    public AffordabilityExpenseEvent withTotalExpense(Currency totalExpense) {
        this.totalExpense = totalExpense;
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
        amazonOrderId = r.read("AmazonOrderId", String.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        transactionType = r.read("TransactionType", String.class);
        baseExpense = r.read("BaseExpense", Currency.class);
        taxTypeCGST = r.read("TaxTypeCGST", Currency.class);
        taxTypeSGST = r.read("TaxTypeSGST", Currency.class);
        taxTypeIGST = r.read("TaxTypeIGST", Currency.class);
        totalExpense = r.read("TotalExpense", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AmazonOrderId", amazonOrderId);
        w.write("PostedDate", postedDate);
        w.write("MarketplaceId", marketplaceId);
        w.write("TransactionType", transactionType);
        w.write("BaseExpense", baseExpense);
        w.write("TaxTypeCGST", taxTypeCGST);
        w.write("TaxTypeSGST", taxTypeSGST);
        w.write("TaxTypeIGST", taxTypeIGST);
        w.write("TotalExpense", totalExpense);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "AffordabilityExpenseEvent",this);
    }


    /** Default constructor. */
    public AffordabilityExpenseEvent() {
        super();
    }

}

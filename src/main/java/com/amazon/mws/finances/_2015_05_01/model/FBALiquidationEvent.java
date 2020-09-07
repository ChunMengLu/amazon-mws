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
 * FBA Liquidation Event
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
 * FBALiquidationEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FBALiquidationEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="OriginalRemovalOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="LiquidationProceedsAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="LiquidationFeeAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class FBALiquidationEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String originalRemovalOrderId;

    private Currency liquidationProceedsAmount;

    private Currency liquidationFeeAmount;

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
    public FBALiquidationEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of OriginalRemovalOrderId.
     *
     * @return The value of OriginalRemovalOrderId.
     */
    public String getOriginalRemovalOrderId() {
        return originalRemovalOrderId;
    }

    /**
     * Set the value of OriginalRemovalOrderId.
     *
     * @param originalRemovalOrderId
     *            The new value to set.
     */
    public void setOriginalRemovalOrderId(String originalRemovalOrderId) {
        this.originalRemovalOrderId = originalRemovalOrderId;
    }

    /**
     * Check to see if OriginalRemovalOrderId is set.
     *
     * @return true if OriginalRemovalOrderId is set.
     */
    public boolean isSetOriginalRemovalOrderId() {
        return originalRemovalOrderId != null;
    }

    /**
     * Set the value of OriginalRemovalOrderId, return this.
     *
     * @param originalRemovalOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FBALiquidationEvent withOriginalRemovalOrderId(String originalRemovalOrderId) {
        this.originalRemovalOrderId = originalRemovalOrderId;
        return this;
    }

    /**
     * Get the value of LiquidationProceedsAmount.
     *
     * @return The value of LiquidationProceedsAmount.
     */
    public Currency getLiquidationProceedsAmount() {
        return liquidationProceedsAmount;
    }

    /**
     * Set the value of LiquidationProceedsAmount.
     *
     * @param liquidationProceedsAmount
     *            The new value to set.
     */
    public void setLiquidationProceedsAmount(Currency liquidationProceedsAmount) {
        this.liquidationProceedsAmount = liquidationProceedsAmount;
    }

    /**
     * Check to see if LiquidationProceedsAmount is set.
     *
     * @return true if LiquidationProceedsAmount is set.
     */
    public boolean isSetLiquidationProceedsAmount() {
        return liquidationProceedsAmount != null;
    }

    /**
     * Set the value of LiquidationProceedsAmount, return this.
     *
     * @param liquidationProceedsAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public FBALiquidationEvent withLiquidationProceedsAmount(Currency liquidationProceedsAmount) {
        this.liquidationProceedsAmount = liquidationProceedsAmount;
        return this;
    }

    /**
     * Get the value of LiquidationFeeAmount.
     *
     * @return The value of LiquidationFeeAmount.
     */
    public Currency getLiquidationFeeAmount() {
        return liquidationFeeAmount;
    }

    /**
     * Set the value of LiquidationFeeAmount.
     *
     * @param liquidationFeeAmount
     *            The new value to set.
     */
    public void setLiquidationFeeAmount(Currency liquidationFeeAmount) {
        this.liquidationFeeAmount = liquidationFeeAmount;
    }

    /**
     * Check to see if LiquidationFeeAmount is set.
     *
     * @return true if LiquidationFeeAmount is set.
     */
    public boolean isSetLiquidationFeeAmount() {
        return liquidationFeeAmount != null;
    }

    /**
     * Set the value of LiquidationFeeAmount, return this.
     *
     * @param liquidationFeeAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public FBALiquidationEvent withLiquidationFeeAmount(Currency liquidationFeeAmount) {
        this.liquidationFeeAmount = liquidationFeeAmount;
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
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        originalRemovalOrderId = r.read("OriginalRemovalOrderId", String.class);
        liquidationProceedsAmount = r.read("LiquidationProceedsAmount", Currency.class);
        liquidationFeeAmount = r.read("LiquidationFeeAmount", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PostedDate", postedDate);
        w.write("OriginalRemovalOrderId", originalRemovalOrderId);
        w.write("LiquidationProceedsAmount", liquidationProceedsAmount);
        w.write("LiquidationFeeAmount", liquidationFeeAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "FBALiquidationEvent",this);
    }


    /** Default constructor. */
    public FBALiquidationEvent() {
        super();
    }

}

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
 * TDS Reimbursement Event
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
 * TDSReimbursementEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TDSReimbursementEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="TdsOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ReimbursedAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class TDSReimbursementEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String tdsOrderId;

    private Currency reimbursedAmount;

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
    public TDSReimbursementEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of TdsOrderId.
     *
     * @return The value of TdsOrderId.
     */
    public String getTdsOrderId() {
        return tdsOrderId;
    }

    /**
     * Set the value of TdsOrderId.
     *
     * @param tdsOrderId
     *            The new value to set.
     */
    public void setTdsOrderId(String tdsOrderId) {
        this.tdsOrderId = tdsOrderId;
    }

    /**
     * Check to see if TdsOrderId is set.
     *
     * @return true if TdsOrderId is set.
     */
    public boolean isSetTdsOrderId() {
        return tdsOrderId != null;
    }

    /**
     * Set the value of TdsOrderId, return this.
     *
     * @param tdsOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public TDSReimbursementEvent withTdsOrderId(String tdsOrderId) {
        this.tdsOrderId = tdsOrderId;
        return this;
    }

    /**
     * Get the value of ReimbursedAmount.
     *
     * @return The value of ReimbursedAmount.
     */
    public Currency getReimbursedAmount() {
        return reimbursedAmount;
    }

    /**
     * Set the value of ReimbursedAmount.
     *
     * @param reimbursedAmount
     *            The new value to set.
     */
    public void setReimbursedAmount(Currency reimbursedAmount) {
        this.reimbursedAmount = reimbursedAmount;
    }

    /**
     * Check to see if ReimbursedAmount is set.
     *
     * @return true if ReimbursedAmount is set.
     */
    public boolean isSetReimbursedAmount() {
        return reimbursedAmount != null;
    }

    /**
     * Set the value of ReimbursedAmount, return this.
     *
     * @param reimbursedAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public TDSReimbursementEvent withReimbursedAmount(Currency reimbursedAmount) {
        this.reimbursedAmount = reimbursedAmount;
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
        tdsOrderId = r.read("TdsOrderId", String.class);
        reimbursedAmount = r.read("ReimbursedAmount", Currency.class);
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
        w.write("TdsOrderId", tdsOrderId);
        w.write("ReimbursedAmount", reimbursedAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "TDSReimbursementEvent",this);
    }


    /** Default constructor. */
    public TDSReimbursementEvent() {
        super();
    }

}

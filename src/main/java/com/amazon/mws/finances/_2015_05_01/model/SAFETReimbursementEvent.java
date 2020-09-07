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
 * SAFET Reimbursement Event
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * SAFETReimbursementEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SAFETReimbursementEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="SAFETClaimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ReimbursedAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *             &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SAFETReimbursementItemList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SAFETReimbursementItem" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SAFETReimbursementEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String safetClaimId;

    private Currency reimbursedAmount;

    private String reasonCode;

    private List<SAFETReimbursementItem> safetReimbursementItemList;

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
    public SAFETReimbursementEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of SAFETClaimId.
     *
     * @return The value of SAFETClaimId.
     */
    public String getSAFETClaimId() {
        return safetClaimId;
    }

    /**
     * Set the value of SAFETClaimId.
     *
     * @param safetClaimId
     *            The new value to set.
     */
    public void setSAFETClaimId(String safetClaimId) {
        this.safetClaimId = safetClaimId;
    }

    /**
     * Check to see if SAFETClaimId is set.
     *
     * @return true if SAFETClaimId is set.
     */
    public boolean isSetSAFETClaimId() {
        return safetClaimId != null;
    }

    /**
     * Set the value of SAFETClaimId, return this.
     *
     * @param safetClaimId
     *             The new value to set.
     *
     * @return This instance.
     */
    public SAFETReimbursementEvent withSAFETClaimId(String safetClaimId) {
        this.safetClaimId = safetClaimId;
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
    public SAFETReimbursementEvent withReimbursedAmount(Currency reimbursedAmount) {
        this.reimbursedAmount = reimbursedAmount;
        return this;
    }

    /**
     * Get the value of ReasonCode.
     *
     * @return The value of ReasonCode.
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Set the value of ReasonCode.
     *
     * @param reasonCode
     *            The new value to set.
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Check to see if ReasonCode is set.
     *
     * @return true if ReasonCode is set.
     */
    public boolean isSetReasonCode() {
        return reasonCode != null;
    }

    /**
     * Set the value of ReasonCode, return this.
     *
     * @param reasonCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public SAFETReimbursementEvent withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * Get the value of SAFETReimbursementItemList.
     *
     * @return The value of SAFETReimbursementItemList.
     */
    public List<SAFETReimbursementItem> getSAFETReimbursementItemList() {
        if (safetReimbursementItemList==null) {
            safetReimbursementItemList = new ArrayList<SAFETReimbursementItem>();
        }
        return safetReimbursementItemList;
    }

    /**
     * Set the value of SAFETReimbursementItemList.
     *
     * @param safetReimbursementItemList
     *            The new value to set.
     */
    public void setSAFETReimbursementItemList(List<SAFETReimbursementItem> safetReimbursementItemList) {
        this.safetReimbursementItemList = safetReimbursementItemList;
    }

    /**
     * Clear SAFETReimbursementItemList.
     */
    public void unsetSAFETReimbursementItemList() {
        this.safetReimbursementItemList = null;
    }

    /**
     * Check to see if SAFETReimbursementItemList is set.
     *
     * @return true if SAFETReimbursementItemList is set.
     */
    public boolean isSetSAFETReimbursementItemList() {
        return safetReimbursementItemList != null && !safetReimbursementItemList.isEmpty();
    }

    /**
     * Add values for SAFETReimbursementItemList, return this.
     *
     * @param safetReimbursementItemList
     *             New values to add.
     *
     * @return This instance.
     */
    public SAFETReimbursementEvent withSAFETReimbursementItemList(SAFETReimbursementItem... values) {
        List<SAFETReimbursementItem> list = getSAFETReimbursementItemList();
        for (SAFETReimbursementItem value : values) {
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
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        safetClaimId = r.read("SAFETClaimId", String.class);
        reimbursedAmount = r.read("ReimbursedAmount", Currency.class);
        reasonCode = r.read("ReasonCode", String.class);
        safetReimbursementItemList = r.readList("SAFETReimbursementItemList", "SAFETReimbursementItem", SAFETReimbursementItem.class);
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
        w.write("SAFETClaimId", safetClaimId);
        w.write("ReimbursedAmount", reimbursedAmount);
        w.write("ReasonCode", reasonCode);
        w.writeList("SAFETReimbursementItemList", "SAFETReimbursementItem", safetReimbursementItemList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "SAFETReimbursementEvent",this);
    }


    /** Default constructor. */
    public SAFETReimbursementEvent() {
        super();
    }

}

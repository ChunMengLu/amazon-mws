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
 * Seller Review Enrollment Payment Event
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
 * SellerReviewEnrollmentPaymentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SellerReviewEnrollmentPaymentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="EnrollmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ParentASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeComponent" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" minOccurs="0"/&gt;
 *             &lt;element name="ChargeComponent" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" minOccurs="0"/&gt;
 *             &lt;element name="TotalAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SellerReviewEnrollmentPaymentEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String enrollmentId;

    private String parentASIN;

    private FeeComponent feeComponent;

    private ChargeComponent chargeComponent;

    private Currency totalAmount;

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
    public SellerReviewEnrollmentPaymentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of EnrollmentId.
     *
     * @return The value of EnrollmentId.
     */
    public String getEnrollmentId() {
        return enrollmentId;
    }

    /**
     * Set the value of EnrollmentId.
     *
     * @param enrollmentId
     *            The new value to set.
     */
    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * Check to see if EnrollmentId is set.
     *
     * @return true if EnrollmentId is set.
     */
    public boolean isSetEnrollmentId() {
        return enrollmentId != null;
    }

    /**
     * Set the value of EnrollmentId, return this.
     *
     * @param enrollmentId
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerReviewEnrollmentPaymentEvent withEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }

    /**
     * Get the value of ParentASIN.
     *
     * @return The value of ParentASIN.
     */
    public String getParentASIN() {
        return parentASIN;
    }

    /**
     * Set the value of ParentASIN.
     *
     * @param parentASIN
     *            The new value to set.
     */
    public void setParentASIN(String parentASIN) {
        this.parentASIN = parentASIN;
    }

    /**
     * Check to see if ParentASIN is set.
     *
     * @return true if ParentASIN is set.
     */
    public boolean isSetParentASIN() {
        return parentASIN != null;
    }

    /**
     * Set the value of ParentASIN, return this.
     *
     * @param parentASIN
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerReviewEnrollmentPaymentEvent withParentASIN(String parentASIN) {
        this.parentASIN = parentASIN;
        return this;
    }

    /**
     * Get the value of FeeComponent.
     *
     * @return The value of FeeComponent.
     */
    public FeeComponent getFeeComponent() {
        return feeComponent;
    }

    /**
     * Set the value of FeeComponent.
     *
     * @param feeComponent
     *            The new value to set.
     */
    public void setFeeComponent(FeeComponent feeComponent) {
        this.feeComponent = feeComponent;
    }

    /**
     * Check to see if FeeComponent is set.
     *
     * @return true if FeeComponent is set.
     */
    public boolean isSetFeeComponent() {
        return feeComponent != null;
    }

    /**
     * Set the value of FeeComponent, return this.
     *
     * @param feeComponent
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerReviewEnrollmentPaymentEvent withFeeComponent(FeeComponent feeComponent) {
        this.feeComponent = feeComponent;
        return this;
    }

    /**
     * Get the value of ChargeComponent.
     *
     * @return The value of ChargeComponent.
     */
    public ChargeComponent getChargeComponent() {
        return chargeComponent;
    }

    /**
     * Set the value of ChargeComponent.
     *
     * @param chargeComponent
     *            The new value to set.
     */
    public void setChargeComponent(ChargeComponent chargeComponent) {
        this.chargeComponent = chargeComponent;
    }

    /**
     * Check to see if ChargeComponent is set.
     *
     * @return true if ChargeComponent is set.
     */
    public boolean isSetChargeComponent() {
        return chargeComponent != null;
    }

    /**
     * Set the value of ChargeComponent, return this.
     *
     * @param chargeComponent
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerReviewEnrollmentPaymentEvent withChargeComponent(ChargeComponent chargeComponent) {
        this.chargeComponent = chargeComponent;
        return this;
    }

    /**
     * Get the value of TotalAmount.
     *
     * @return The value of TotalAmount.
     */
    public Currency getTotalAmount() {
        return totalAmount;
    }

    /**
     * Set the value of TotalAmount.
     *
     * @param totalAmount
     *            The new value to set.
     */
    public void setTotalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Check to see if TotalAmount is set.
     *
     * @return true if TotalAmount is set.
     */
    public boolean isSetTotalAmount() {
        return totalAmount != null;
    }

    /**
     * Set the value of TotalAmount, return this.
     *
     * @param totalAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerReviewEnrollmentPaymentEvent withTotalAmount(Currency totalAmount) {
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
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        enrollmentId = r.read("EnrollmentId", String.class);
        parentASIN = r.read("ParentASIN", String.class);
        feeComponent = r.read("FeeComponent", FeeComponent.class);
        chargeComponent = r.read("ChargeComponent", ChargeComponent.class);
        totalAmount = r.read("TotalAmount", Currency.class);
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
        w.write("EnrollmentId", enrollmentId);
        w.write("ParentASIN", parentASIN);
        w.write("FeeComponent", feeComponent);
        w.write("ChargeComponent", chargeComponent);
        w.write("TotalAmount", totalAmount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "SellerReviewEnrollmentPaymentEvent",this);
    }


    /** Default constructor. */
    public SellerReviewEnrollmentPaymentEvent() {
        super();
    }

}

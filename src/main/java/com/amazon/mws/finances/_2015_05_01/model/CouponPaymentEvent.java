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
 * Coupon Payment Event
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
 * CouponPaymentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CouponPaymentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="CouponId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerCouponDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ClipOrRedemptionCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *             &lt;element name="PaymentEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeComponent" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" minOccurs="0"/&gt;
 *             &lt;element name="ChargeComponent" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" minOccurs="0"/&gt;
 *             &lt;element name="TotalAmount" type="{http://mws.amazonservices.com/Finances/2015-05-01}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class CouponPaymentEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String couponId;

    private String sellerCouponDescription;

    private Long clipOrRedemptionCount;

    private String paymentEventId;

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
    public CouponPaymentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of CouponId.
     *
     * @return The value of CouponId.
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * Set the value of CouponId.
     *
     * @param couponId
     *            The new value to set.
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * Check to see if CouponId is set.
     *
     * @return true if CouponId is set.
     */
    public boolean isSetCouponId() {
        return couponId != null;
    }

    /**
     * Set the value of CouponId, return this.
     *
     * @param couponId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CouponPaymentEvent withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * Get the value of SellerCouponDescription.
     *
     * @return The value of SellerCouponDescription.
     */
    public String getSellerCouponDescription() {
        return sellerCouponDescription;
    }

    /**
     * Set the value of SellerCouponDescription.
     *
     * @param sellerCouponDescription
     *            The new value to set.
     */
    public void setSellerCouponDescription(String sellerCouponDescription) {
        this.sellerCouponDescription = sellerCouponDescription;
    }

    /**
     * Check to see if SellerCouponDescription is set.
     *
     * @return true if SellerCouponDescription is set.
     */
    public boolean isSetSellerCouponDescription() {
        return sellerCouponDescription != null;
    }

    /**
     * Set the value of SellerCouponDescription, return this.
     *
     * @param sellerCouponDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public CouponPaymentEvent withSellerCouponDescription(String sellerCouponDescription) {
        this.sellerCouponDescription = sellerCouponDescription;
        return this;
    }

    /**
     * Get the value of ClipOrRedemptionCount.
     *
     * @return The value of ClipOrRedemptionCount.
     */
    public Long getClipOrRedemptionCount() {
        return clipOrRedemptionCount;
    }

    /**
     * Set the value of ClipOrRedemptionCount.
     *
     * @param clipOrRedemptionCount
     *            The new value to set.
     */
    public void setClipOrRedemptionCount(Long clipOrRedemptionCount) {
        this.clipOrRedemptionCount = clipOrRedemptionCount;
    }

    /**
     * Check to see if ClipOrRedemptionCount is set.
     *
     * @return true if ClipOrRedemptionCount is set.
     */
    public boolean isSetClipOrRedemptionCount() {
        return clipOrRedemptionCount != null;
    }

    /**
     * Set the value of ClipOrRedemptionCount, return this.
     *
     * @param clipOrRedemptionCount
     *             The new value to set.
     *
     * @return This instance.
     */
    public CouponPaymentEvent withClipOrRedemptionCount(Long clipOrRedemptionCount) {
        this.clipOrRedemptionCount = clipOrRedemptionCount;
        return this;
    }

    /**
     * Get the value of PaymentEventId.
     *
     * @return The value of PaymentEventId.
     */
    public String getPaymentEventId() {
        return paymentEventId;
    }

    /**
     * Set the value of PaymentEventId.
     *
     * @param paymentEventId
     *            The new value to set.
     */
    public void setPaymentEventId(String paymentEventId) {
        this.paymentEventId = paymentEventId;
    }

    /**
     * Check to see if PaymentEventId is set.
     *
     * @return true if PaymentEventId is set.
     */
    public boolean isSetPaymentEventId() {
        return paymentEventId != null;
    }

    /**
     * Set the value of PaymentEventId, return this.
     *
     * @param paymentEventId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CouponPaymentEvent withPaymentEventId(String paymentEventId) {
        this.paymentEventId = paymentEventId;
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
    public CouponPaymentEvent withFeeComponent(FeeComponent feeComponent) {
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
    public CouponPaymentEvent withChargeComponent(ChargeComponent chargeComponent) {
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
    public CouponPaymentEvent withTotalAmount(Currency totalAmount) {
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
        couponId = r.read("CouponId", String.class);
        sellerCouponDescription = r.read("SellerCouponDescription", String.class);
        clipOrRedemptionCount = r.read("ClipOrRedemptionCount", Long.class);
        paymentEventId = r.read("PaymentEventId", String.class);
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
        w.write("CouponId", couponId);
        w.write("SellerCouponDescription", sellerCouponDescription);
        w.write("ClipOrRedemptionCount", clipOrRedemptionCount);
        w.write("PaymentEventId", paymentEventId);
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
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "CouponPaymentEvent",this);
    }


    /** Default constructor. */
    public CouponPaymentEvent() {
        super();
    }

}

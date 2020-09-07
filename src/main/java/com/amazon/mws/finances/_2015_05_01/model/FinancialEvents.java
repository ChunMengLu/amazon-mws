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
 * Financial Events
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * FinancialEvents complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FinancialEvents"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ShipmentSettleEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentSettleEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RefundEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="GuaranteeClaimEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ChargebackEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PayWithAmazonEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}PayWithAmazonEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ServiceProviderCreditEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SolutionProviderCreditEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RetrochargeEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RetrochargeEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RentalTransactionEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RentalTransactionEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PerformanceBondRefundEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}PerformanceBondRefundEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ProductAdsPaymentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ProductAdsPaymentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ServiceFeeEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ServiceFeeEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="SellerDealPaymentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SellerDealPaymentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="DebtRecoveryEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}DebtRecoveryEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="LoanServicingEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}LoanServicingEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="AdjustmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}AdjustmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="SAFETReimbursementEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SAFETReimbursementEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="SellerReviewEnrollmentPaymentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SellerReviewEnrollmentPaymentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="FBALiquidationEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FBALiquidationEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="CouponPaymentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}CouponPaymentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ImagingServicesFeeEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ImagingServicesFeeEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="NetworkComminglingTransactionEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}NetworkComminglingTransactionEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="AffordabilityExpenseEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}AffordabilityExpenseEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="AffordabilityExpenseReversalEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}AffordabilityExpenseEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RemovalShipmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RemovalShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="TrialShipmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}TrialShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="TDSReimbursementEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}TDSReimbursementEvent" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class FinancialEvents extends AbstractMwsObject {

    private List<ShipmentEvent> shipmentEventList;

    private List<ShipmentSettleEvent> shipmentSettleEventList;

    private List<ShipmentEvent> refundEventList;

    private List<ShipmentEvent> guaranteeClaimEventList;

    private List<ShipmentEvent> chargebackEventList;

    private List<PayWithAmazonEvent> payWithAmazonEventList;

    private List<SolutionProviderCreditEvent> serviceProviderCreditEventList;

    private List<RetrochargeEvent> retrochargeEventList;

    private List<RentalTransactionEvent> rentalTransactionEventList;

    private List<PerformanceBondRefundEvent> performanceBondRefundEventList;

    private List<ProductAdsPaymentEvent> productAdsPaymentEventList;

    private List<ServiceFeeEvent> serviceFeeEventList;

    private List<SellerDealPaymentEvent> sellerDealPaymentEventList;

    private List<DebtRecoveryEvent> debtRecoveryEventList;

    private List<LoanServicingEvent> loanServicingEventList;

    private List<AdjustmentEvent> adjustmentEventList;

    private List<SAFETReimbursementEvent> safetReimbursementEventList;

    private List<SellerReviewEnrollmentPaymentEvent> sellerReviewEnrollmentPaymentEventList;

    private List<FBALiquidationEvent> fbaLiquidationEventList;

    private List<CouponPaymentEvent> couponPaymentEventList;

    private List<ImagingServicesFeeEvent> imagingServicesFeeEventList;

    private List<NetworkComminglingTransactionEvent> networkComminglingTransactionEventList;

    private List<AffordabilityExpenseEvent> affordabilityExpenseEventList;

    private List<AffordabilityExpenseEvent> affordabilityExpenseReversalEventList;

    private List<RemovalShipmentEvent> removalShipmentEventList;

    private List<TrialShipmentEvent> trialShipmentEventList;

    private List<TDSReimbursementEvent> tdsReimbursementEventList;

    /**
     * Get the value of ShipmentEventList.
     *
     * @return The value of ShipmentEventList.
     */
    public List<ShipmentEvent> getShipmentEventList() {
        if (shipmentEventList==null) {
            shipmentEventList = new ArrayList<ShipmentEvent>();
        }
        return shipmentEventList;
    }

    /**
     * Set the value of ShipmentEventList.
     *
     * @param shipmentEventList
     *            The new value to set.
     */
    public void setShipmentEventList(List<ShipmentEvent> shipmentEventList) {
        this.shipmentEventList = shipmentEventList;
    }

    /**
     * Clear ShipmentEventList.
     */
    public void unsetShipmentEventList() {
        this.shipmentEventList = null;
    }

    /**
     * Check to see if ShipmentEventList is set.
     *
     * @return true if ShipmentEventList is set.
     */
    public boolean isSetShipmentEventList() {
        return shipmentEventList != null && !shipmentEventList.isEmpty();
    }

    /**
     * Add values for ShipmentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withShipmentEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getShipmentEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ShipmentSettleEventList.
     *
     * @return The value of ShipmentSettleEventList.
     */
    public List<ShipmentSettleEvent> getShipmentSettleEventList() {
        if (shipmentSettleEventList==null) {
            shipmentSettleEventList = new ArrayList<ShipmentSettleEvent>();
        }
        return shipmentSettleEventList;
    }

    /**
     * Set the value of ShipmentSettleEventList.
     *
     * @param shipmentSettleEventList
     *            The new value to set.
     */
    public void setShipmentSettleEventList(List<ShipmentSettleEvent> shipmentSettleEventList) {
        this.shipmentSettleEventList = shipmentSettleEventList;
    }

    /**
     * Clear ShipmentSettleEventList.
     */
    public void unsetShipmentSettleEventList() {
        this.shipmentSettleEventList = null;
    }

    /**
     * Check to see if ShipmentSettleEventList is set.
     *
     * @return true if ShipmentSettleEventList is set.
     */
    public boolean isSetShipmentSettleEventList() {
        return shipmentSettleEventList != null && !shipmentSettleEventList.isEmpty();
    }

    /**
     * Add values for ShipmentSettleEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withShipmentSettleEventList(ShipmentSettleEvent... values) {
        List<ShipmentSettleEvent> list = getShipmentSettleEventList();
        for (ShipmentSettleEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RefundEventList.
     *
     * @return The value of RefundEventList.
     */
    public List<ShipmentEvent> getRefundEventList() {
        if (refundEventList==null) {
            refundEventList = new ArrayList<ShipmentEvent>();
        }
        return refundEventList;
    }

    /**
     * Set the value of RefundEventList.
     *
     * @param refundEventList
     *            The new value to set.
     */
    public void setRefundEventList(List<ShipmentEvent> refundEventList) {
        this.refundEventList = refundEventList;
    }

    /**
     * Clear RefundEventList.
     */
    public void unsetRefundEventList() {
        this.refundEventList = null;
    }

    /**
     * Check to see if RefundEventList is set.
     *
     * @return true if RefundEventList is set.
     */
    public boolean isSetRefundEventList() {
        return refundEventList != null && !refundEventList.isEmpty();
    }

    /**
     * Add values for RefundEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRefundEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getRefundEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of GuaranteeClaimEventList.
     *
     * @return The value of GuaranteeClaimEventList.
     */
    public List<ShipmentEvent> getGuaranteeClaimEventList() {
        if (guaranteeClaimEventList==null) {
            guaranteeClaimEventList = new ArrayList<ShipmentEvent>();
        }
        return guaranteeClaimEventList;
    }

    /**
     * Set the value of GuaranteeClaimEventList.
     *
     * @param guaranteeClaimEventList
     *            The new value to set.
     */
    public void setGuaranteeClaimEventList(List<ShipmentEvent> guaranteeClaimEventList) {
        this.guaranteeClaimEventList = guaranteeClaimEventList;
    }

    /**
     * Clear GuaranteeClaimEventList.
     */
    public void unsetGuaranteeClaimEventList() {
        this.guaranteeClaimEventList = null;
    }

    /**
     * Check to see if GuaranteeClaimEventList is set.
     *
     * @return true if GuaranteeClaimEventList is set.
     */
    public boolean isSetGuaranteeClaimEventList() {
        return guaranteeClaimEventList != null && !guaranteeClaimEventList.isEmpty();
    }

    /**
     * Add values for GuaranteeClaimEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withGuaranteeClaimEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getGuaranteeClaimEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ChargebackEventList.
     *
     * @return The value of ChargebackEventList.
     */
    public List<ShipmentEvent> getChargebackEventList() {
        if (chargebackEventList==null) {
            chargebackEventList = new ArrayList<ShipmentEvent>();
        }
        return chargebackEventList;
    }

    /**
     * Set the value of ChargebackEventList.
     *
     * @param chargebackEventList
     *            The new value to set.
     */
    public void setChargebackEventList(List<ShipmentEvent> chargebackEventList) {
        this.chargebackEventList = chargebackEventList;
    }

    /**
     * Clear ChargebackEventList.
     */
    public void unsetChargebackEventList() {
        this.chargebackEventList = null;
    }

    /**
     * Check to see if ChargebackEventList is set.
     *
     * @return true if ChargebackEventList is set.
     */
    public boolean isSetChargebackEventList() {
        return chargebackEventList != null && !chargebackEventList.isEmpty();
    }

    /**
     * Add values for ChargebackEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withChargebackEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getChargebackEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PayWithAmazonEventList.
     *
     * @return The value of PayWithAmazonEventList.
     */
    public List<PayWithAmazonEvent> getPayWithAmazonEventList() {
        if (payWithAmazonEventList==null) {
            payWithAmazonEventList = new ArrayList<PayWithAmazonEvent>();
        }
        return payWithAmazonEventList;
    }

    /**
     * Set the value of PayWithAmazonEventList.
     *
     * @param payWithAmazonEventList
     *            The new value to set.
     */
    public void setPayWithAmazonEventList(List<PayWithAmazonEvent> payWithAmazonEventList) {
        this.payWithAmazonEventList = payWithAmazonEventList;
    }

    /**
     * Clear PayWithAmazonEventList.
     */
    public void unsetPayWithAmazonEventList() {
        this.payWithAmazonEventList = null;
    }

    /**
     * Check to see if PayWithAmazonEventList is set.
     *
     * @return true if PayWithAmazonEventList is set.
     */
    public boolean isSetPayWithAmazonEventList() {
        return payWithAmazonEventList != null && !payWithAmazonEventList.isEmpty();
    }

    /**
     * Add values for PayWithAmazonEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withPayWithAmazonEventList(PayWithAmazonEvent... values) {
        List<PayWithAmazonEvent> list = getPayWithAmazonEventList();
        for (PayWithAmazonEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ServiceProviderCreditEventList.
     *
     * @return The value of ServiceProviderCreditEventList.
     */
    public List<SolutionProviderCreditEvent> getServiceProviderCreditEventList() {
        if (serviceProviderCreditEventList==null) {
            serviceProviderCreditEventList = new ArrayList<SolutionProviderCreditEvent>();
        }
        return serviceProviderCreditEventList;
    }

    /**
     * Set the value of ServiceProviderCreditEventList.
     *
     * @param serviceProviderCreditEventList
     *            The new value to set.
     */
    public void setServiceProviderCreditEventList(List<SolutionProviderCreditEvent> serviceProviderCreditEventList) {
        this.serviceProviderCreditEventList = serviceProviderCreditEventList;
    }

    /**
     * Clear ServiceProviderCreditEventList.
     */
    public void unsetServiceProviderCreditEventList() {
        this.serviceProviderCreditEventList = null;
    }

    /**
     * Check to see if ServiceProviderCreditEventList is set.
     *
     * @return true if ServiceProviderCreditEventList is set.
     */
    public boolean isSetServiceProviderCreditEventList() {
        return serviceProviderCreditEventList != null && !serviceProviderCreditEventList.isEmpty();
    }

    /**
     * Add values for ServiceProviderCreditEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withServiceProviderCreditEventList(SolutionProviderCreditEvent... values) {
        List<SolutionProviderCreditEvent> list = getServiceProviderCreditEventList();
        for (SolutionProviderCreditEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RetrochargeEventList.
     *
     * @return The value of RetrochargeEventList.
     */
    public List<RetrochargeEvent> getRetrochargeEventList() {
        if (retrochargeEventList==null) {
            retrochargeEventList = new ArrayList<RetrochargeEvent>();
        }
        return retrochargeEventList;
    }

    /**
     * Set the value of RetrochargeEventList.
     *
     * @param retrochargeEventList
     *            The new value to set.
     */
    public void setRetrochargeEventList(List<RetrochargeEvent> retrochargeEventList) {
        this.retrochargeEventList = retrochargeEventList;
    }

    /**
     * Clear RetrochargeEventList.
     */
    public void unsetRetrochargeEventList() {
        this.retrochargeEventList = null;
    }

    /**
     * Check to see if RetrochargeEventList is set.
     *
     * @return true if RetrochargeEventList is set.
     */
    public boolean isSetRetrochargeEventList() {
        return retrochargeEventList != null && !retrochargeEventList.isEmpty();
    }

    /**
     * Add values for RetrochargeEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRetrochargeEventList(RetrochargeEvent... values) {
        List<RetrochargeEvent> list = getRetrochargeEventList();
        for (RetrochargeEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RentalTransactionEventList.
     *
     * @return The value of RentalTransactionEventList.
     */
    public List<RentalTransactionEvent> getRentalTransactionEventList() {
        if (rentalTransactionEventList==null) {
            rentalTransactionEventList = new ArrayList<RentalTransactionEvent>();
        }
        return rentalTransactionEventList;
    }

    /**
     * Set the value of RentalTransactionEventList.
     *
     * @param rentalTransactionEventList
     *            The new value to set.
     */
    public void setRentalTransactionEventList(List<RentalTransactionEvent> rentalTransactionEventList) {
        this.rentalTransactionEventList = rentalTransactionEventList;
    }

    /**
     * Clear RentalTransactionEventList.
     */
    public void unsetRentalTransactionEventList() {
        this.rentalTransactionEventList = null;
    }

    /**
     * Check to see if RentalTransactionEventList is set.
     *
     * @return true if RentalTransactionEventList is set.
     */
    public boolean isSetRentalTransactionEventList() {
        return rentalTransactionEventList != null && !rentalTransactionEventList.isEmpty();
    }

    /**
     * Add values for RentalTransactionEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRentalTransactionEventList(RentalTransactionEvent... values) {
        List<RentalTransactionEvent> list = getRentalTransactionEventList();
        for (RentalTransactionEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PerformanceBondRefundEventList.
     *
     * @return The value of PerformanceBondRefundEventList.
     */
    public List<PerformanceBondRefundEvent> getPerformanceBondRefundEventList() {
        if (performanceBondRefundEventList==null) {
            performanceBondRefundEventList = new ArrayList<PerformanceBondRefundEvent>();
        }
        return performanceBondRefundEventList;
    }

    /**
     * Set the value of PerformanceBondRefundEventList.
     *
     * @param performanceBondRefundEventList
     *            The new value to set.
     */
    public void setPerformanceBondRefundEventList(List<PerformanceBondRefundEvent> performanceBondRefundEventList) {
        this.performanceBondRefundEventList = performanceBondRefundEventList;
    }

    /**
     * Clear PerformanceBondRefundEventList.
     */
    public void unsetPerformanceBondRefundEventList() {
        this.performanceBondRefundEventList = null;
    }

    /**
     * Check to see if PerformanceBondRefundEventList is set.
     *
     * @return true if PerformanceBondRefundEventList is set.
     */
    public boolean isSetPerformanceBondRefundEventList() {
        return performanceBondRefundEventList != null && !performanceBondRefundEventList.isEmpty();
    }

    /**
     * Add values for PerformanceBondRefundEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withPerformanceBondRefundEventList(PerformanceBondRefundEvent... values) {
        List<PerformanceBondRefundEvent> list = getPerformanceBondRefundEventList();
        for (PerformanceBondRefundEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ProductAdsPaymentEventList.
     *
     * @return The value of ProductAdsPaymentEventList.
     */
    public List<ProductAdsPaymentEvent> getProductAdsPaymentEventList() {
        if (productAdsPaymentEventList==null) {
            productAdsPaymentEventList = new ArrayList<ProductAdsPaymentEvent>();
        }
        return productAdsPaymentEventList;
    }

    /**
     * Set the value of ProductAdsPaymentEventList.
     *
     * @param productAdsPaymentEventList
     *            The new value to set.
     */
    public void setProductAdsPaymentEventList(List<ProductAdsPaymentEvent> productAdsPaymentEventList) {
        this.productAdsPaymentEventList = productAdsPaymentEventList;
    }

    /**
     * Clear ProductAdsPaymentEventList.
     */
    public void unsetProductAdsPaymentEventList() {
        this.productAdsPaymentEventList = null;
    }

    /**
     * Check to see if ProductAdsPaymentEventList is set.
     *
     * @return true if ProductAdsPaymentEventList is set.
     */
    public boolean isSetProductAdsPaymentEventList() {
        return productAdsPaymentEventList != null && !productAdsPaymentEventList.isEmpty();
    }

    /**
     * Add values for ProductAdsPaymentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withProductAdsPaymentEventList(ProductAdsPaymentEvent... values) {
        List<ProductAdsPaymentEvent> list = getProductAdsPaymentEventList();
        for (ProductAdsPaymentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ServiceFeeEventList.
     *
     * @return The value of ServiceFeeEventList.
     */
    public List<ServiceFeeEvent> getServiceFeeEventList() {
        if (serviceFeeEventList==null) {
            serviceFeeEventList = new ArrayList<ServiceFeeEvent>();
        }
        return serviceFeeEventList;
    }

    /**
     * Set the value of ServiceFeeEventList.
     *
     * @param serviceFeeEventList
     *            The new value to set.
     */
    public void setServiceFeeEventList(List<ServiceFeeEvent> serviceFeeEventList) {
        this.serviceFeeEventList = serviceFeeEventList;
    }

    /**
     * Clear ServiceFeeEventList.
     */
    public void unsetServiceFeeEventList() {
        this.serviceFeeEventList = null;
    }

    /**
     * Check to see if ServiceFeeEventList is set.
     *
     * @return true if ServiceFeeEventList is set.
     */
    public boolean isSetServiceFeeEventList() {
        return serviceFeeEventList != null && !serviceFeeEventList.isEmpty();
    }

    /**
     * Add values for ServiceFeeEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withServiceFeeEventList(ServiceFeeEvent... values) {
        List<ServiceFeeEvent> list = getServiceFeeEventList();
        for (ServiceFeeEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of SellerDealPaymentEventList.
     *
     * @return The value of SellerDealPaymentEventList.
     */
    public List<SellerDealPaymentEvent> getSellerDealPaymentEventList() {
        if (sellerDealPaymentEventList==null) {
            sellerDealPaymentEventList = new ArrayList<SellerDealPaymentEvent>();
        }
        return sellerDealPaymentEventList;
    }

    /**
     * Set the value of SellerDealPaymentEventList.
     *
     * @param sellerDealPaymentEventList
     *            The new value to set.
     */
    public void setSellerDealPaymentEventList(List<SellerDealPaymentEvent> sellerDealPaymentEventList) {
        this.sellerDealPaymentEventList = sellerDealPaymentEventList;
    }

    /**
     * Clear SellerDealPaymentEventList.
     */
    public void unsetSellerDealPaymentEventList() {
        this.sellerDealPaymentEventList = null;
    }

    /**
     * Check to see if SellerDealPaymentEventList is set.
     *
     * @return true if SellerDealPaymentEventList is set.
     */
    public boolean isSetSellerDealPaymentEventList() {
        return sellerDealPaymentEventList != null && !sellerDealPaymentEventList.isEmpty();
    }

    /**
     * Add values for SellerDealPaymentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withSellerDealPaymentEventList(SellerDealPaymentEvent... values) {
        List<SellerDealPaymentEvent> list = getSellerDealPaymentEventList();
        for (SellerDealPaymentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of DebtRecoveryEventList.
     *
     * @return The value of DebtRecoveryEventList.
     */
    public List<DebtRecoveryEvent> getDebtRecoveryEventList() {
        if (debtRecoveryEventList==null) {
            debtRecoveryEventList = new ArrayList<DebtRecoveryEvent>();
        }
        return debtRecoveryEventList;
    }

    /**
     * Set the value of DebtRecoveryEventList.
     *
     * @param debtRecoveryEventList
     *            The new value to set.
     */
    public void setDebtRecoveryEventList(List<DebtRecoveryEvent> debtRecoveryEventList) {
        this.debtRecoveryEventList = debtRecoveryEventList;
    }

    /**
     * Clear DebtRecoveryEventList.
     */
    public void unsetDebtRecoveryEventList() {
        this.debtRecoveryEventList = null;
    }

    /**
     * Check to see if DebtRecoveryEventList is set.
     *
     * @return true if DebtRecoveryEventList is set.
     */
    public boolean isSetDebtRecoveryEventList() {
        return debtRecoveryEventList != null && !debtRecoveryEventList.isEmpty();
    }

    /**
     * Add values for DebtRecoveryEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withDebtRecoveryEventList(DebtRecoveryEvent... values) {
        List<DebtRecoveryEvent> list = getDebtRecoveryEventList();
        for (DebtRecoveryEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of LoanServicingEventList.
     *
     * @return The value of LoanServicingEventList.
     */
    public List<LoanServicingEvent> getLoanServicingEventList() {
        if (loanServicingEventList==null) {
            loanServicingEventList = new ArrayList<LoanServicingEvent>();
        }
        return loanServicingEventList;
    }

    /**
     * Set the value of LoanServicingEventList.
     *
     * @param loanServicingEventList
     *            The new value to set.
     */
    public void setLoanServicingEventList(List<LoanServicingEvent> loanServicingEventList) {
        this.loanServicingEventList = loanServicingEventList;
    }

    /**
     * Clear LoanServicingEventList.
     */
    public void unsetLoanServicingEventList() {
        this.loanServicingEventList = null;
    }

    /**
     * Check to see if LoanServicingEventList is set.
     *
     * @return true if LoanServicingEventList is set.
     */
    public boolean isSetLoanServicingEventList() {
        return loanServicingEventList != null && !loanServicingEventList.isEmpty();
    }

    /**
     * Add values for LoanServicingEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withLoanServicingEventList(LoanServicingEvent... values) {
        List<LoanServicingEvent> list = getLoanServicingEventList();
        for (LoanServicingEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of AdjustmentEventList.
     *
     * @return The value of AdjustmentEventList.
     */
    public List<AdjustmentEvent> getAdjustmentEventList() {
        if (adjustmentEventList==null) {
            adjustmentEventList = new ArrayList<AdjustmentEvent>();
        }
        return adjustmentEventList;
    }

    /**
     * Set the value of AdjustmentEventList.
     *
     * @param adjustmentEventList
     *            The new value to set.
     */
    public void setAdjustmentEventList(List<AdjustmentEvent> adjustmentEventList) {
        this.adjustmentEventList = adjustmentEventList;
    }

    /**
     * Clear AdjustmentEventList.
     */
    public void unsetAdjustmentEventList() {
        this.adjustmentEventList = null;
    }

    /**
     * Check to see if AdjustmentEventList is set.
     *
     * @return true if AdjustmentEventList is set.
     */
    public boolean isSetAdjustmentEventList() {
        return adjustmentEventList != null && !adjustmentEventList.isEmpty();
    }

    /**
     * Add values for AdjustmentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withAdjustmentEventList(AdjustmentEvent... values) {
        List<AdjustmentEvent> list = getAdjustmentEventList();
        for (AdjustmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of SAFETReimbursementEventList.
     *
     * @return The value of SAFETReimbursementEventList.
     */
    public List<SAFETReimbursementEvent> getSAFETReimbursementEventList() {
        if (safetReimbursementEventList==null) {
            safetReimbursementEventList = new ArrayList<SAFETReimbursementEvent>();
        }
        return safetReimbursementEventList;
    }

    /**
     * Set the value of SAFETReimbursementEventList.
     *
     * @param safetReimbursementEventList
     *            The new value to set.
     */
    public void setSAFETReimbursementEventList(List<SAFETReimbursementEvent> safetReimbursementEventList) {
        this.safetReimbursementEventList = safetReimbursementEventList;
    }

    /**
     * Clear SAFETReimbursementEventList.
     */
    public void unsetSAFETReimbursementEventList() {
        this.safetReimbursementEventList = null;
    }

    /**
     * Check to see if SAFETReimbursementEventList is set.
     *
     * @return true if SAFETReimbursementEventList is set.
     */
    public boolean isSetSAFETReimbursementEventList() {
        return safetReimbursementEventList != null && !safetReimbursementEventList.isEmpty();
    }

    /**
     * Add values for SAFETReimbursementEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withSAFETReimbursementEventList(SAFETReimbursementEvent... values) {
        List<SAFETReimbursementEvent> list = getSAFETReimbursementEventList();
        for (SAFETReimbursementEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of SellerReviewEnrollmentPaymentEventList.
     *
     * @return The value of SellerReviewEnrollmentPaymentEventList.
     */
    public List<SellerReviewEnrollmentPaymentEvent> getSellerReviewEnrollmentPaymentEventList() {
        if (sellerReviewEnrollmentPaymentEventList==null) {
            sellerReviewEnrollmentPaymentEventList = new ArrayList<SellerReviewEnrollmentPaymentEvent>();
        }
        return sellerReviewEnrollmentPaymentEventList;
    }

    /**
     * Set the value of SellerReviewEnrollmentPaymentEventList.
     *
     * @param sellerReviewEnrollmentPaymentEventList
     *            The new value to set.
     */
    public void setSellerReviewEnrollmentPaymentEventList(List<SellerReviewEnrollmentPaymentEvent> sellerReviewEnrollmentPaymentEventList) {
        this.sellerReviewEnrollmentPaymentEventList = sellerReviewEnrollmentPaymentEventList;
    }

    /**
     * Clear SellerReviewEnrollmentPaymentEventList.
     */
    public void unsetSellerReviewEnrollmentPaymentEventList() {
        this.sellerReviewEnrollmentPaymentEventList = null;
    }

    /**
     * Check to see if SellerReviewEnrollmentPaymentEventList is set.
     *
     * @return true if SellerReviewEnrollmentPaymentEventList is set.
     */
    public boolean isSetSellerReviewEnrollmentPaymentEventList() {
        return sellerReviewEnrollmentPaymentEventList != null && !sellerReviewEnrollmentPaymentEventList.isEmpty();
    }

    /**
     * Add values for SellerReviewEnrollmentPaymentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withSellerReviewEnrollmentPaymentEventList(SellerReviewEnrollmentPaymentEvent... values) {
        List<SellerReviewEnrollmentPaymentEvent> list = getSellerReviewEnrollmentPaymentEventList();
        for (SellerReviewEnrollmentPaymentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of FBALiquidationEventList.
     *
     * @return The value of FBALiquidationEventList.
     */
    public List<FBALiquidationEvent> getFBALiquidationEventList() {
        if (fbaLiquidationEventList==null) {
            fbaLiquidationEventList = new ArrayList<FBALiquidationEvent>();
        }
        return fbaLiquidationEventList;
    }

    /**
     * Set the value of FBALiquidationEventList.
     *
     * @param fbaLiquidationEventList
     *            The new value to set.
     */
    public void setFBALiquidationEventList(List<FBALiquidationEvent> fbaLiquidationEventList) {
        this.fbaLiquidationEventList = fbaLiquidationEventList;
    }

    /**
     * Clear FBALiquidationEventList.
     */
    public void unsetFBALiquidationEventList() {
        this.fbaLiquidationEventList = null;
    }

    /**
     * Check to see if FBALiquidationEventList is set.
     *
     * @return true if FBALiquidationEventList is set.
     */
    public boolean isSetFBALiquidationEventList() {
        return fbaLiquidationEventList != null && !fbaLiquidationEventList.isEmpty();
    }

    /**
     * Add values for FBALiquidationEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withFBALiquidationEventList(FBALiquidationEvent... values) {
        List<FBALiquidationEvent> list = getFBALiquidationEventList();
        for (FBALiquidationEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of CouponPaymentEventList.
     *
     * @return The value of CouponPaymentEventList.
     */
    public List<CouponPaymentEvent> getCouponPaymentEventList() {
        if (couponPaymentEventList==null) {
            couponPaymentEventList = new ArrayList<CouponPaymentEvent>();
        }
        return couponPaymentEventList;
    }

    /**
     * Set the value of CouponPaymentEventList.
     *
     * @param couponPaymentEventList
     *            The new value to set.
     */
    public void setCouponPaymentEventList(List<CouponPaymentEvent> couponPaymentEventList) {
        this.couponPaymentEventList = couponPaymentEventList;
    }

    /**
     * Clear CouponPaymentEventList.
     */
    public void unsetCouponPaymentEventList() {
        this.couponPaymentEventList = null;
    }

    /**
     * Check to see if CouponPaymentEventList is set.
     *
     * @return true if CouponPaymentEventList is set.
     */
    public boolean isSetCouponPaymentEventList() {
        return couponPaymentEventList != null && !couponPaymentEventList.isEmpty();
    }

    /**
     * Add values for CouponPaymentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withCouponPaymentEventList(CouponPaymentEvent... values) {
        List<CouponPaymentEvent> list = getCouponPaymentEventList();
        for (CouponPaymentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ImagingServicesFeeEventList.
     *
     * @return The value of ImagingServicesFeeEventList.
     */
    public List<ImagingServicesFeeEvent> getImagingServicesFeeEventList() {
        if (imagingServicesFeeEventList==null) {
            imagingServicesFeeEventList = new ArrayList<ImagingServicesFeeEvent>();
        }
        return imagingServicesFeeEventList;
    }

    /**
     * Set the value of ImagingServicesFeeEventList.
     *
     * @param imagingServicesFeeEventList
     *            The new value to set.
     */
    public void setImagingServicesFeeEventList(List<ImagingServicesFeeEvent> imagingServicesFeeEventList) {
        this.imagingServicesFeeEventList = imagingServicesFeeEventList;
    }

    /**
     * Clear ImagingServicesFeeEventList.
     */
    public void unsetImagingServicesFeeEventList() {
        this.imagingServicesFeeEventList = null;
    }

    /**
     * Check to see if ImagingServicesFeeEventList is set.
     *
     * @return true if ImagingServicesFeeEventList is set.
     */
    public boolean isSetImagingServicesFeeEventList() {
        return imagingServicesFeeEventList != null && !imagingServicesFeeEventList.isEmpty();
    }

    /**
     * Add values for ImagingServicesFeeEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withImagingServicesFeeEventList(ImagingServicesFeeEvent... values) {
        List<ImagingServicesFeeEvent> list = getImagingServicesFeeEventList();
        for (ImagingServicesFeeEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of NetworkComminglingTransactionEventList.
     *
     * @return The value of NetworkComminglingTransactionEventList.
     */
    public List<NetworkComminglingTransactionEvent> getNetworkComminglingTransactionEventList() {
        if (networkComminglingTransactionEventList==null) {
            networkComminglingTransactionEventList = new ArrayList<NetworkComminglingTransactionEvent>();
        }
        return networkComminglingTransactionEventList;
    }

    /**
     * Set the value of NetworkComminglingTransactionEventList.
     *
     * @param networkComminglingTransactionEventList
     *            The new value to set.
     */
    public void setNetworkComminglingTransactionEventList(List<NetworkComminglingTransactionEvent> networkComminglingTransactionEventList) {
        this.networkComminglingTransactionEventList = networkComminglingTransactionEventList;
    }

    /**
     * Clear NetworkComminglingTransactionEventList.
     */
    public void unsetNetworkComminglingTransactionEventList() {
        this.networkComminglingTransactionEventList = null;
    }

    /**
     * Check to see if NetworkComminglingTransactionEventList is set.
     *
     * @return true if NetworkComminglingTransactionEventList is set.
     */
    public boolean isSetNetworkComminglingTransactionEventList() {
        return networkComminglingTransactionEventList != null && !networkComminglingTransactionEventList.isEmpty();
    }

    /**
     * Add values for NetworkComminglingTransactionEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withNetworkComminglingTransactionEventList(NetworkComminglingTransactionEvent... values) {
        List<NetworkComminglingTransactionEvent> list = getNetworkComminglingTransactionEventList();
        for (NetworkComminglingTransactionEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of AffordabilityExpenseEventList.
     *
     * @return The value of AffordabilityExpenseEventList.
     */
    public List<AffordabilityExpenseEvent> getAffordabilityExpenseEventList() {
        if (affordabilityExpenseEventList==null) {
            affordabilityExpenseEventList = new ArrayList<AffordabilityExpenseEvent>();
        }
        return affordabilityExpenseEventList;
    }

    /**
     * Set the value of AffordabilityExpenseEventList.
     *
     * @param affordabilityExpenseEventList
     *            The new value to set.
     */
    public void setAffordabilityExpenseEventList(List<AffordabilityExpenseEvent> affordabilityExpenseEventList) {
        this.affordabilityExpenseEventList = affordabilityExpenseEventList;
    }

    /**
     * Clear AffordabilityExpenseEventList.
     */
    public void unsetAffordabilityExpenseEventList() {
        this.affordabilityExpenseEventList = null;
    }

    /**
     * Check to see if AffordabilityExpenseEventList is set.
     *
     * @return true if AffordabilityExpenseEventList is set.
     */
    public boolean isSetAffordabilityExpenseEventList() {
        return affordabilityExpenseEventList != null && !affordabilityExpenseEventList.isEmpty();
    }

    /**
     * Add values for AffordabilityExpenseEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withAffordabilityExpenseEventList(AffordabilityExpenseEvent... values) {
        List<AffordabilityExpenseEvent> list = getAffordabilityExpenseEventList();
        for (AffordabilityExpenseEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of AffordabilityExpenseReversalEventList.
     *
     * @return The value of AffordabilityExpenseReversalEventList.
     */
    public List<AffordabilityExpenseEvent> getAffordabilityExpenseReversalEventList() {
        if (affordabilityExpenseReversalEventList==null) {
            affordabilityExpenseReversalEventList = new ArrayList<AffordabilityExpenseEvent>();
        }
        return affordabilityExpenseReversalEventList;
    }

    /**
     * Set the value of AffordabilityExpenseReversalEventList.
     *
     * @param affordabilityExpenseReversalEventList
     *            The new value to set.
     */
    public void setAffordabilityExpenseReversalEventList(List<AffordabilityExpenseEvent> affordabilityExpenseReversalEventList) {
        this.affordabilityExpenseReversalEventList = affordabilityExpenseReversalEventList;
    }

    /**
     * Clear AffordabilityExpenseReversalEventList.
     */
    public void unsetAffordabilityExpenseReversalEventList() {
        this.affordabilityExpenseReversalEventList = null;
    }

    /**
     * Check to see if AffordabilityExpenseReversalEventList is set.
     *
     * @return true if AffordabilityExpenseReversalEventList is set.
     */
    public boolean isSetAffordabilityExpenseReversalEventList() {
        return affordabilityExpenseReversalEventList != null && !affordabilityExpenseReversalEventList.isEmpty();
    }

    /**
     * Add values for AffordabilityExpenseReversalEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withAffordabilityExpenseReversalEventList(AffordabilityExpenseEvent... values) {
        List<AffordabilityExpenseEvent> list = getAffordabilityExpenseReversalEventList();
        for (AffordabilityExpenseEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RemovalShipmentEventList.
     *
     * @return The value of RemovalShipmentEventList.
     */
    public List<RemovalShipmentEvent> getRemovalShipmentEventList() {
        if (removalShipmentEventList==null) {
            removalShipmentEventList = new ArrayList<RemovalShipmentEvent>();
        }
        return removalShipmentEventList;
    }

    /**
     * Set the value of RemovalShipmentEventList.
     *
     * @param removalShipmentEventList
     *            The new value to set.
     */
    public void setRemovalShipmentEventList(List<RemovalShipmentEvent> removalShipmentEventList) {
        this.removalShipmentEventList = removalShipmentEventList;
    }

    /**
     * Clear RemovalShipmentEventList.
     */
    public void unsetRemovalShipmentEventList() {
        this.removalShipmentEventList = null;
    }

    /**
     * Check to see if RemovalShipmentEventList is set.
     *
     * @return true if RemovalShipmentEventList is set.
     */
    public boolean isSetRemovalShipmentEventList() {
        return removalShipmentEventList != null && !removalShipmentEventList.isEmpty();
    }

    /**
     * Add values for RemovalShipmentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRemovalShipmentEventList(RemovalShipmentEvent... values) {
        List<RemovalShipmentEvent> list = getRemovalShipmentEventList();
        for (RemovalShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of TrialShipmentEventList.
     *
     * @return The value of TrialShipmentEventList.
     */
    public List<TrialShipmentEvent> getTrialShipmentEventList() {
        if (trialShipmentEventList==null) {
            trialShipmentEventList = new ArrayList<TrialShipmentEvent>();
        }
        return trialShipmentEventList;
    }

    /**
     * Set the value of TrialShipmentEventList.
     *
     * @param trialShipmentEventList
     *            The new value to set.
     */
    public void setTrialShipmentEventList(List<TrialShipmentEvent> trialShipmentEventList) {
        this.trialShipmentEventList = trialShipmentEventList;
    }

    /**
     * Clear TrialShipmentEventList.
     */
    public void unsetTrialShipmentEventList() {
        this.trialShipmentEventList = null;
    }

    /**
     * Check to see if TrialShipmentEventList is set.
     *
     * @return true if TrialShipmentEventList is set.
     */
    public boolean isSetTrialShipmentEventList() {
        return trialShipmentEventList != null && !trialShipmentEventList.isEmpty();
    }

    /**
     * Add values for TrialShipmentEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withTrialShipmentEventList(TrialShipmentEvent... values) {
        List<TrialShipmentEvent> list = getTrialShipmentEventList();
        for (TrialShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of TDSReimbursementEventList.
     *
     * @return The value of TDSReimbursementEventList.
     */
    public List<TDSReimbursementEvent> getTDSReimbursementEventList() {
        if (tdsReimbursementEventList==null) {
            tdsReimbursementEventList = new ArrayList<TDSReimbursementEvent>();
        }
        return tdsReimbursementEventList;
    }

    /**
     * Set the value of TDSReimbursementEventList.
     *
     * @param tdsReimbursementEventList
     *            The new value to set.
     */
    public void setTDSReimbursementEventList(List<TDSReimbursementEvent> tdsReimbursementEventList) {
        this.tdsReimbursementEventList = tdsReimbursementEventList;
    }

    /**
     * Clear TDSReimbursementEventList.
     */
    public void unsetTDSReimbursementEventList() {
        this.tdsReimbursementEventList = null;
    }

    /**
     * Check to see if TDSReimbursementEventList is set.
     *
     * @return true if TDSReimbursementEventList is set.
     */
    public boolean isSetTDSReimbursementEventList() {
        return tdsReimbursementEventList != null && !tdsReimbursementEventList.isEmpty();
    }

    /**
     * Add values for TDSReimbursementEventList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withTDSReimbursementEventList(TDSReimbursementEvent... values) {
        List<TDSReimbursementEvent> list = getTDSReimbursementEventList();
        for (TDSReimbursementEvent value : values) {
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
        shipmentEventList = r.readList("ShipmentEventList", "ShipmentEvent", ShipmentEvent.class);
        shipmentSettleEventList = r.readList("ShipmentSettleEventList", "ShipmentSettleEvent", ShipmentSettleEvent.class);
        refundEventList = r.readList("RefundEventList", "ShipmentEvent", ShipmentEvent.class);
        guaranteeClaimEventList = r.readList("GuaranteeClaimEventList", "ShipmentEvent", ShipmentEvent.class);
        chargebackEventList = r.readList("ChargebackEventList", "ShipmentEvent", ShipmentEvent.class);
        payWithAmazonEventList = r.readList("PayWithAmazonEventList", "PayWithAmazonEvent", PayWithAmazonEvent.class);
        serviceProviderCreditEventList = r.readList("ServiceProviderCreditEventList", "SolutionProviderCreditEvent", SolutionProviderCreditEvent.class);
        retrochargeEventList = r.readList("RetrochargeEventList", "RetrochargeEvent", RetrochargeEvent.class);
        rentalTransactionEventList = r.readList("RentalTransactionEventList", "RentalTransactionEvent", RentalTransactionEvent.class);
        performanceBondRefundEventList = r.readList("PerformanceBondRefundEventList", "PerformanceBondRefundEvent", PerformanceBondRefundEvent.class);
        productAdsPaymentEventList = r.readList("ProductAdsPaymentEventList", "ProductAdsPaymentEvent", ProductAdsPaymentEvent.class);
        serviceFeeEventList = r.readList("ServiceFeeEventList", "ServiceFeeEvent", ServiceFeeEvent.class);
        sellerDealPaymentEventList = r.readList("SellerDealPaymentEventList", "SellerDealPaymentEvent", SellerDealPaymentEvent.class);
        debtRecoveryEventList = r.readList("DebtRecoveryEventList", "DebtRecoveryEvent", DebtRecoveryEvent.class);
        loanServicingEventList = r.readList("LoanServicingEventList", "LoanServicingEvent", LoanServicingEvent.class);
        adjustmentEventList = r.readList("AdjustmentEventList", "AdjustmentEvent", AdjustmentEvent.class);
        safetReimbursementEventList = r.readList("SAFETReimbursementEventList", "SAFETReimbursementEvent", SAFETReimbursementEvent.class);
        sellerReviewEnrollmentPaymentEventList = r.readList("SellerReviewEnrollmentPaymentEventList", "SellerReviewEnrollmentPaymentEvent", SellerReviewEnrollmentPaymentEvent.class);
        fbaLiquidationEventList = r.readList("FBALiquidationEventList", "FBALiquidationEvent", FBALiquidationEvent.class);
        couponPaymentEventList = r.readList("CouponPaymentEventList", "CouponPaymentEvent", CouponPaymentEvent.class);
        imagingServicesFeeEventList = r.readList("ImagingServicesFeeEventList", "ImagingServicesFeeEvent", ImagingServicesFeeEvent.class);
        networkComminglingTransactionEventList = r.readList("NetworkComminglingTransactionEventList", "NetworkComminglingTransactionEvent", NetworkComminglingTransactionEvent.class);
        affordabilityExpenseEventList = r.readList("AffordabilityExpenseEventList", "AffordabilityExpenseEvent", AffordabilityExpenseEvent.class);
        affordabilityExpenseReversalEventList = r.readList("AffordabilityExpenseReversalEventList", "AffordabilityExpenseEvent", AffordabilityExpenseEvent.class);
        removalShipmentEventList = r.readList("RemovalShipmentEventList", "RemovalShipmentEvent", RemovalShipmentEvent.class);
        trialShipmentEventList = r.readList("TrialShipmentEventList", "TrialShipmentEvent", TrialShipmentEvent.class);
        tdsReimbursementEventList = r.readList("TDSReimbursementEventList", "TDSReimbursementEvent", TDSReimbursementEvent.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ShipmentEventList", "ShipmentEvent", shipmentEventList);
        w.writeList("ShipmentSettleEventList", "ShipmentSettleEvent", shipmentSettleEventList);
        w.writeList("RefundEventList", "ShipmentEvent", refundEventList);
        w.writeList("GuaranteeClaimEventList", "ShipmentEvent", guaranteeClaimEventList);
        w.writeList("ChargebackEventList", "ShipmentEvent", chargebackEventList);
        w.writeList("PayWithAmazonEventList", "PayWithAmazonEvent", payWithAmazonEventList);
        w.writeList("ServiceProviderCreditEventList", "SolutionProviderCreditEvent", serviceProviderCreditEventList);
        w.writeList("RetrochargeEventList", "RetrochargeEvent", retrochargeEventList);
        w.writeList("RentalTransactionEventList", "RentalTransactionEvent", rentalTransactionEventList);
        w.writeList("PerformanceBondRefundEventList", "PerformanceBondRefundEvent", performanceBondRefundEventList);
        w.writeList("ProductAdsPaymentEventList", "ProductAdsPaymentEvent", productAdsPaymentEventList);
        w.writeList("ServiceFeeEventList", "ServiceFeeEvent", serviceFeeEventList);
        w.writeList("SellerDealPaymentEventList", "SellerDealPaymentEvent", sellerDealPaymentEventList);
        w.writeList("DebtRecoveryEventList", "DebtRecoveryEvent", debtRecoveryEventList);
        w.writeList("LoanServicingEventList", "LoanServicingEvent", loanServicingEventList);
        w.writeList("AdjustmentEventList", "AdjustmentEvent", adjustmentEventList);
        w.writeList("SAFETReimbursementEventList", "SAFETReimbursementEvent", safetReimbursementEventList);
        w.writeList("SellerReviewEnrollmentPaymentEventList", "SellerReviewEnrollmentPaymentEvent", sellerReviewEnrollmentPaymentEventList);
        w.writeList("FBALiquidationEventList", "FBALiquidationEvent", fbaLiquidationEventList);
        w.writeList("CouponPaymentEventList", "CouponPaymentEvent", couponPaymentEventList);
        w.writeList("ImagingServicesFeeEventList", "ImagingServicesFeeEvent", imagingServicesFeeEventList);
        w.writeList("NetworkComminglingTransactionEventList", "NetworkComminglingTransactionEvent", networkComminglingTransactionEventList);
        w.writeList("AffordabilityExpenseEventList", "AffordabilityExpenseEvent", affordabilityExpenseEventList);
        w.writeList("AffordabilityExpenseReversalEventList", "AffordabilityExpenseEvent", affordabilityExpenseReversalEventList);
        w.writeList("RemovalShipmentEventList", "RemovalShipmentEvent", removalShipmentEventList);
        w.writeList("TrialShipmentEventList", "TrialShipmentEvent", trialShipmentEventList);
        w.writeList("TDSReimbursementEventList", "TDSReimbursementEvent", tdsReimbursementEventList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "FinancialEvents",this);
    }


    /** Default constructor. */
    public FinancialEvents() {
        super();
    }

}

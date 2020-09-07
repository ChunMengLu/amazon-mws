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
 * Get Eligible Shipping Services Request
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * GetEligibleShippingServicesRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetEligibleShippingServicesRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentRequestDetails" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ShipmentRequestDetails"/&gt;
 *             &lt;element name="ShippingOfferingFilter" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ShippingOfferingFilter" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetEligibleShippingServicesRequest extends AbstractMwsObject {

    private String sellerId;

    private String mwsAuthToken;

    private ShipmentRequestDetails shipmentRequestDetails;

    private ShippingOfferingFilter shippingOfferingFilter;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetEligibleShippingServicesRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetEligibleShippingServicesRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of ShipmentRequestDetails.
     *
     * @return The value of ShipmentRequestDetails.
     */
    public ShipmentRequestDetails getShipmentRequestDetails() {
        return shipmentRequestDetails;
    }

    /**
     * Set the value of ShipmentRequestDetails.
     *
     * @param shipmentRequestDetails
     *            The new value to set.
     */
    public void setShipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
        this.shipmentRequestDetails = shipmentRequestDetails;
    }

    /**
     * Check to see if ShipmentRequestDetails is set.
     *
     * @return true if ShipmentRequestDetails is set.
     */
    public boolean isSetShipmentRequestDetails() {
        return shipmentRequestDetails != null;
    }

    /**
     * Set the value of ShipmentRequestDetails, return this.
     *
     * @param shipmentRequestDetails
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetEligibleShippingServicesRequest withShipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
        this.shipmentRequestDetails = shipmentRequestDetails;
        return this;
    }

    /**
     * Get the value of ShippingOfferingFilter.
     *
     * @return The value of ShippingOfferingFilter.
     */
    public ShippingOfferingFilter getShippingOfferingFilter() {
        return shippingOfferingFilter;
    }

    /**
     * Set the value of ShippingOfferingFilter.
     *
     * @param shippingOfferingFilter
     *            The new value to set.
     */
    public void setShippingOfferingFilter(ShippingOfferingFilter shippingOfferingFilter) {
        this.shippingOfferingFilter = shippingOfferingFilter;
    }

    /**
     * Check to see if ShippingOfferingFilter is set.
     *
     * @return true if ShippingOfferingFilter is set.
     */
    public boolean isSetShippingOfferingFilter() {
        return shippingOfferingFilter != null;
    }

    /**
     * Set the value of ShippingOfferingFilter, return this.
     *
     * @param shippingOfferingFilter
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetEligibleShippingServicesRequest withShippingOfferingFilter(ShippingOfferingFilter shippingOfferingFilter) {
        this.shippingOfferingFilter = shippingOfferingFilter;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        shipmentRequestDetails = r.read("ShipmentRequestDetails", ShipmentRequestDetails.class);
        shippingOfferingFilter = r.read("ShippingOfferingFilter", ShippingOfferingFilter.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("ShipmentRequestDetails", shipmentRequestDetails);
        w.write("ShippingOfferingFilter", shippingOfferingFilter);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "GetEligibleShippingServicesRequest",this);
    }

    /** Legacy Value constructor - DEPRECATED: mwsAuthToken is not part of this request object. This is kept for legacy support purposes.*/
    public GetEligibleShippingServicesRequest(String sellerId,String mwsAuthToken,ShipmentRequestDetails shipmentRequestDetails) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.shipmentRequestDetails = shipmentRequestDetails;
    }

    /** Value constructor. */
    public GetEligibleShippingServicesRequest(String sellerId,ShipmentRequestDetails shipmentRequestDetails) {
        this.sellerId = sellerId;
        this.shipmentRequestDetails = shipmentRequestDetails;
    }

    /** Default constructor. */
    public GetEligibleShippingServicesRequest() {
        super();
    }

}

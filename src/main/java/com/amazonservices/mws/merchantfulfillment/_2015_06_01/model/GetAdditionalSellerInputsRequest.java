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
 * Get Additional Seller Inputs Request
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * GetAdditionalSellerInputsRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetAdditionalSellerInputsRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShipFromAddress" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Address"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetAdditionalSellerInputsRequest extends AbstractMwsObject {

    private String orderId;

    private String mwsAuthToken;

    private String sellerId;

    private String shippingServiceId;

    private Address shipFromAddress;

    /**
     * Get the value of OrderId.
     *
     * @return The value of OrderId.
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Set the value of OrderId.
     *
     * @param orderId
     *            The new value to set.
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Check to see if OrderId is set.
     *
     * @return true if OrderId is set.
     */
    public boolean isSetOrderId() {
        return orderId != null;
    }

    /**
     * Set the value of OrderId, return this.
     *
     * @param orderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetAdditionalSellerInputsRequest withOrderId(String orderId) {
        this.orderId = orderId;
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
    public GetAdditionalSellerInputsRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

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
    public GetAdditionalSellerInputsRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of ShippingServiceId.
     *
     * @return The value of ShippingServiceId.
     */
    public String getShippingServiceId() {
        return shippingServiceId;
    }

    /**
     * Set the value of ShippingServiceId.
     *
     * @param shippingServiceId
     *            The new value to set.
     */
    public void setShippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
    }

    /**
     * Check to see if ShippingServiceId is set.
     *
     * @return true if ShippingServiceId is set.
     */
    public boolean isSetShippingServiceId() {
        return shippingServiceId != null;
    }

    /**
     * Set the value of ShippingServiceId, return this.
     *
     * @param shippingServiceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetAdditionalSellerInputsRequest withShippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
        return this;
    }

    /**
     * Get the value of ShipFromAddress.
     *
     * @return The value of ShipFromAddress.
     */
    public Address getShipFromAddress() {
        return shipFromAddress;
    }

    /**
     * Set the value of ShipFromAddress.
     *
     * @param shipFromAddress
     *            The new value to set.
     */
    public void setShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    /**
     * Check to see if ShipFromAddress is set.
     *
     * @return true if ShipFromAddress is set.
     */
    public boolean isSetShipFromAddress() {
        return shipFromAddress != null;
    }

    /**
     * Set the value of ShipFromAddress, return this.
     *
     * @param shipFromAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetAdditionalSellerInputsRequest withShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
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
        orderId = r.read("OrderId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        sellerId = r.read("SellerId", String.class);
        shippingServiceId = r.read("ShippingServiceId", String.class);
        shipFromAddress = r.read("ShipFromAddress", Address.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("OrderId", orderId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("SellerId", sellerId);
        w.write("ShippingServiceId", shippingServiceId);
        w.write("ShipFromAddress", shipFromAddress);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "GetAdditionalSellerInputsRequest",this);
    }

    /** Value constructor. */
    public GetAdditionalSellerInputsRequest(String orderId,String sellerId,String shippingServiceId,Address shipFromAddress) {
        this.orderId = orderId;
        this.sellerId = sellerId;
        this.shippingServiceId = shippingServiceId;
        this.shipFromAddress = shipFromAddress;
    }

    /** Default constructor. */
    public GetAdditionalSellerInputsRequest() {
        super();
    }

}

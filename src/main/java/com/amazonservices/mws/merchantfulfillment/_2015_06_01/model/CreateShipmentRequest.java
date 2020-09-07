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
 * Create Shipment Request
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * CreateShipmentRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateShipmentRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentRequestDetails" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ShipmentRequestDetails"/&gt;
 *             &lt;element name="ShippingServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingServiceOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="HazmatType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="LabelFormatOption" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}LabelFormatOptionRequest" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentLevelSellerInputsList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AdditionalSellerInputs" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class CreateShipmentRequest extends AbstractMwsObject {

    private String sellerId;

    private String mwsAuthToken;

    private ShipmentRequestDetails shipmentRequestDetails;

    private String shippingServiceId;

    private String shippingServiceOfferId;

    private String hazmatType;

    private LabelFormatOptionRequest labelFormatOption;

    private List<AdditionalSellerInputs> shipmentLevelSellerInputsList;

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
    public CreateShipmentRequest withSellerId(String sellerId) {
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
    public CreateShipmentRequest withMWSAuthToken(String mwsAuthToken) {
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
    public CreateShipmentRequest withShipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
        this.shipmentRequestDetails = shipmentRequestDetails;
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
    public CreateShipmentRequest withShippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
        return this;
    }

    /**
     * Get the value of ShippingServiceOfferId.
     *
     * @return The value of ShippingServiceOfferId.
     */
    public String getShippingServiceOfferId() {
        return shippingServiceOfferId;
    }

    /**
     * Set the value of ShippingServiceOfferId.
     *
     * @param shippingServiceOfferId
     *            The new value to set.
     */
    public void setShippingServiceOfferId(String shippingServiceOfferId) {
        this.shippingServiceOfferId = shippingServiceOfferId;
    }

    /**
     * Check to see if ShippingServiceOfferId is set.
     *
     * @return true if ShippingServiceOfferId is set.
     */
    public boolean isSetShippingServiceOfferId() {
        return shippingServiceOfferId != null;
    }

    /**
     * Set the value of ShippingServiceOfferId, return this.
     *
     * @param shippingServiceOfferId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateShipmentRequest withShippingServiceOfferId(String shippingServiceOfferId) {
        this.shippingServiceOfferId = shippingServiceOfferId;
        return this;
    }

    /**
     * Get the value of HazmatType.
     *
     * @return The value of HazmatType.
     */
    public String getHazmatType() {
        return hazmatType;
    }

    /**
     * Set the value of HazmatType.
     *
     * @param hazmatType
     *            The new value to set.
     */
    public void setHazmatType(String hazmatType) {
        this.hazmatType = hazmatType;
    }

    /**
     * Check to see if HazmatType is set.
     *
     * @return true if HazmatType is set.
     */
    public boolean isSetHazmatType() {
        return hazmatType != null;
    }

    /**
     * Set the value of HazmatType, return this.
     *
     * @param hazmatType
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateShipmentRequest withHazmatType(String hazmatType) {
        this.hazmatType = hazmatType;
        return this;
    }

    /**
     * Get the value of LabelFormatOption.
     *
     * @return The value of LabelFormatOption.
     */
    public LabelFormatOptionRequest getLabelFormatOption() {
        return labelFormatOption;
    }

    /**
     * Set the value of LabelFormatOption.
     *
     * @param labelFormatOption
     *            The new value to set.
     */
    public void setLabelFormatOption(LabelFormatOptionRequest labelFormatOption) {
        this.labelFormatOption = labelFormatOption;
    }

    /**
     * Check to see if LabelFormatOption is set.
     *
     * @return true if LabelFormatOption is set.
     */
    public boolean isSetLabelFormatOption() {
        return labelFormatOption != null;
    }

    /**
     * Set the value of LabelFormatOption, return this.
     *
     * @param labelFormatOption
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateShipmentRequest withLabelFormatOption(LabelFormatOptionRequest labelFormatOption) {
        this.labelFormatOption = labelFormatOption;
        return this;
    }

    /**
     * Get the value of ShipmentLevelSellerInputsList.
     *
     * @return The value of ShipmentLevelSellerInputsList.
     */
    public List<AdditionalSellerInputs> getShipmentLevelSellerInputsList() {
        if (shipmentLevelSellerInputsList==null) {
            shipmentLevelSellerInputsList = new ArrayList<AdditionalSellerInputs>();
        }
        return shipmentLevelSellerInputsList;
    }

    /**
     * Set the value of ShipmentLevelSellerInputsList.
     *
     * @param shipmentLevelSellerInputsList
     *            The new value to set.
     */
    public void setShipmentLevelSellerInputsList(List<AdditionalSellerInputs> shipmentLevelSellerInputsList) {
        this.shipmentLevelSellerInputsList = shipmentLevelSellerInputsList;
    }

    /**
     * Clear ShipmentLevelSellerInputsList.
     */
    public void unsetShipmentLevelSellerInputsList() {
        this.shipmentLevelSellerInputsList = null;
    }

    /**
     * Check to see if ShipmentLevelSellerInputsList is set.
     *
     * @return true if ShipmentLevelSellerInputsList is set.
     */
    public boolean isSetShipmentLevelSellerInputsList() {
        return shipmentLevelSellerInputsList != null && !shipmentLevelSellerInputsList.isEmpty();
    }

    /**
     * Add values for ShipmentLevelSellerInputsList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public CreateShipmentRequest withShipmentLevelSellerInputsList(AdditionalSellerInputs... values) {
        List<AdditionalSellerInputs> list = getShipmentLevelSellerInputsList();
        for (AdditionalSellerInputs value : values) {
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        shipmentRequestDetails = r.read("ShipmentRequestDetails", ShipmentRequestDetails.class);
        shippingServiceId = r.read("ShippingServiceId", String.class);
        shippingServiceOfferId = r.read("ShippingServiceOfferId", String.class);
        hazmatType = r.read("HazmatType", String.class);
        labelFormatOption = r.read("LabelFormatOption", LabelFormatOptionRequest.class);
        shipmentLevelSellerInputsList = r.readList("ShipmentLevelSellerInputsList", "member", AdditionalSellerInputs.class);
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
        w.write("ShippingServiceId", shippingServiceId);
        w.write("ShippingServiceOfferId", shippingServiceOfferId);
        w.write("HazmatType", hazmatType);
        w.write("LabelFormatOption", labelFormatOption);
        w.writeList("ShipmentLevelSellerInputsList", "member", shipmentLevelSellerInputsList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "CreateShipmentRequest",this);
    }

    /** Legacy Value constructor - DEPRECATED: mwsAuthToken is not part of this request object. This is kept for legacy support purposes.*/
    public CreateShipmentRequest(String sellerId,String mwsAuthToken,ShipmentRequestDetails shipmentRequestDetails,String shippingServiceId,String shippingServiceOfferId) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.shipmentRequestDetails = shipmentRequestDetails;
        this.shippingServiceId = shippingServiceId;
        this.shippingServiceOfferId = shippingServiceOfferId;
    }

    /** Legacy value constructor. */
    public CreateShipmentRequest(String sellerId,ShipmentRequestDetails shipmentRequestDetails,String shippingServiceId,String shippingServiceOfferId) {
        this.sellerId = sellerId;
        this.shipmentRequestDetails = shipmentRequestDetails;
        this.shippingServiceId = shippingServiceId;
        this.shippingServiceOfferId = shippingServiceOfferId;
    }

    /** Value constructor. */
    public CreateShipmentRequest(String sellerId,ShipmentRequestDetails shipmentRequestDetails,String shippingServiceId) {
        this.sellerId = sellerId;
        this.shipmentRequestDetails = shipmentRequestDetails;
        this.shippingServiceId = shippingServiceId;
    }

    /** Default constructor. */
    public CreateShipmentRequest() {
        super();
    }

}

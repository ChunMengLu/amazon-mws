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
 * Shipping Service
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * ShippingService complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShippingService"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShippingServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingServiceOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="EarliestEstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="LatestEstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="Rate" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}CurrencyAmount"/&gt;
 *             &lt;element name="ShippingServiceOptions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ShippingServiceOptions"/&gt;
 *             &lt;element name="AvailableShippingServiceOptions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AvailableShippingServiceOptions" minOccurs="0"/&gt;
 *             &lt;element name="AvailableLabelFormats" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *             &lt;element name="AvailableFormatOptionsForLabel" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}LabelFormatOption" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RequiresAdditionalSellerInputs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ShippingService extends AbstractMwsObject {

    private String shippingServiceName;

    private String carrierName;

    private String shippingServiceId;

    private String shippingServiceOfferId;

    private XMLGregorianCalendar shipDate;

    private XMLGregorianCalendar earliestEstimatedDeliveryDate;

    private XMLGregorianCalendar latestEstimatedDeliveryDate;

    private CurrencyAmount rate;

    private ShippingServiceOptions shippingServiceOptions;

    private AvailableShippingServiceOptions availableShippingServiceOptions;

    private List<String> availableLabelFormats;

    private List<LabelFormatOption> availableFormatOptionsForLabel;

    private boolean requiresAdditionalSellerInputs;

    /**
     * Get the value of ShippingServiceName.
     *
     * @return The value of ShippingServiceName.
     */
    public String getShippingServiceName() {
        return shippingServiceName;
    }

    /**
     * Set the value of ShippingServiceName.
     *
     * @param shippingServiceName
     *            The new value to set.
     */
    public void setShippingServiceName(String shippingServiceName) {
        this.shippingServiceName = shippingServiceName;
    }

    /**
     * Check to see if ShippingServiceName is set.
     *
     * @return true if ShippingServiceName is set.
     */
    public boolean isSetShippingServiceName() {
        return shippingServiceName != null;
    }

    /**
     * Set the value of ShippingServiceName, return this.
     *
     * @param shippingServiceName
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withShippingServiceName(String shippingServiceName) {
        this.shippingServiceName = shippingServiceName;
        return this;
    }

    /**
     * Get the value of CarrierName.
     *
     * @return The value of CarrierName.
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Set the value of CarrierName.
     *
     * @param carrierName
     *            The new value to set.
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Check to see if CarrierName is set.
     *
     * @return true if CarrierName is set.
     */
    public boolean isSetCarrierName() {
        return carrierName != null;
    }

    /**
     * Set the value of CarrierName, return this.
     *
     * @param carrierName
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withCarrierName(String carrierName) {
        this.carrierName = carrierName;
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
    public ShippingService withShippingServiceId(String shippingServiceId) {
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
    public ShippingService withShippingServiceOfferId(String shippingServiceOfferId) {
        this.shippingServiceOfferId = shippingServiceOfferId;
        return this;
    }

    /**
     * Get the value of ShipDate.
     *
     * @return The value of ShipDate.
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Set the value of ShipDate.
     *
     * @param shipDate
     *            The new value to set.
     */
    public void setShipDate(XMLGregorianCalendar shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * Check to see if ShipDate is set.
     *
     * @return true if ShipDate is set.
     */
    public boolean isSetShipDate() {
        return shipDate != null;
    }

    /**
     * Set the value of ShipDate, return this.
     *
     * @param shipDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withShipDate(XMLGregorianCalendar shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Get the value of EarliestEstimatedDeliveryDate.
     *
     * @return The value of EarliestEstimatedDeliveryDate.
     */
    public XMLGregorianCalendar getEarliestEstimatedDeliveryDate() {
        return earliestEstimatedDeliveryDate;
    }

    /**
     * Set the value of EarliestEstimatedDeliveryDate.
     *
     * @param earliestEstimatedDeliveryDate
     *            The new value to set.
     */
    public void setEarliestEstimatedDeliveryDate(XMLGregorianCalendar earliestEstimatedDeliveryDate) {
        this.earliestEstimatedDeliveryDate = earliestEstimatedDeliveryDate;
    }

    /**
     * Check to see if EarliestEstimatedDeliveryDate is set.
     *
     * @return true if EarliestEstimatedDeliveryDate is set.
     */
    public boolean isSetEarliestEstimatedDeliveryDate() {
        return earliestEstimatedDeliveryDate != null;
    }

    /**
     * Set the value of EarliestEstimatedDeliveryDate, return this.
     *
     * @param earliestEstimatedDeliveryDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withEarliestEstimatedDeliveryDate(XMLGregorianCalendar earliestEstimatedDeliveryDate) {
        this.earliestEstimatedDeliveryDate = earliestEstimatedDeliveryDate;
        return this;
    }

    /**
     * Get the value of LatestEstimatedDeliveryDate.
     *
     * @return The value of LatestEstimatedDeliveryDate.
     */
    public XMLGregorianCalendar getLatestEstimatedDeliveryDate() {
        return latestEstimatedDeliveryDate;
    }

    /**
     * Set the value of LatestEstimatedDeliveryDate.
     *
     * @param latestEstimatedDeliveryDate
     *            The new value to set.
     */
    public void setLatestEstimatedDeliveryDate(XMLGregorianCalendar latestEstimatedDeliveryDate) {
        this.latestEstimatedDeliveryDate = latestEstimatedDeliveryDate;
    }

    /**
     * Check to see if LatestEstimatedDeliveryDate is set.
     *
     * @return true if LatestEstimatedDeliveryDate is set.
     */
    public boolean isSetLatestEstimatedDeliveryDate() {
        return latestEstimatedDeliveryDate != null;
    }

    /**
     * Set the value of LatestEstimatedDeliveryDate, return this.
     *
     * @param latestEstimatedDeliveryDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withLatestEstimatedDeliveryDate(XMLGregorianCalendar latestEstimatedDeliveryDate) {
        this.latestEstimatedDeliveryDate = latestEstimatedDeliveryDate;
        return this;
    }

    /**
     * Get the value of Rate.
     *
     * @return The value of Rate.
     */
    public CurrencyAmount getRate() {
        return rate;
    }

    /**
     * Set the value of Rate.
     *
     * @param rate
     *            The new value to set.
     */
    public void setRate(CurrencyAmount rate) {
        this.rate = rate;
    }

    /**
     * Check to see if Rate is set.
     *
     * @return true if Rate is set.
     */
    public boolean isSetRate() {
        return rate != null;
    }

    /**
     * Set the value of Rate, return this.
     *
     * @param rate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withRate(CurrencyAmount rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get the value of ShippingServiceOptions.
     *
     * @return The value of ShippingServiceOptions.
     */
    public ShippingServiceOptions getShippingServiceOptions() {
        return shippingServiceOptions;
    }

    /**
     * Set the value of ShippingServiceOptions.
     *
     * @param shippingServiceOptions
     *            The new value to set.
     */
    public void setShippingServiceOptions(ShippingServiceOptions shippingServiceOptions) {
        this.shippingServiceOptions = shippingServiceOptions;
    }

    /**
     * Check to see if ShippingServiceOptions is set.
     *
     * @return true if ShippingServiceOptions is set.
     */
    public boolean isSetShippingServiceOptions() {
        return shippingServiceOptions != null;
    }

    /**
     * Set the value of ShippingServiceOptions, return this.
     *
     * @param shippingServiceOptions
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withShippingServiceOptions(ShippingServiceOptions shippingServiceOptions) {
        this.shippingServiceOptions = shippingServiceOptions;
        return this;
    }

    /**
     * Get the value of AvailableShippingServiceOptions.
     *
     * @return The value of AvailableShippingServiceOptions.
     */
    public AvailableShippingServiceOptions getAvailableShippingServiceOptions() {
        return availableShippingServiceOptions;
    }

    /**
     * Set the value of AvailableShippingServiceOptions.
     *
     * @param availableShippingServiceOptions
     *            The new value to set.
     */
    public void setAvailableShippingServiceOptions(AvailableShippingServiceOptions availableShippingServiceOptions) {
        this.availableShippingServiceOptions = availableShippingServiceOptions;
    }

    /**
     * Check to see if AvailableShippingServiceOptions is set.
     *
     * @return true if AvailableShippingServiceOptions is set.
     */
    public boolean isSetAvailableShippingServiceOptions() {
        return availableShippingServiceOptions != null;
    }

    /**
     * Set the value of AvailableShippingServiceOptions, return this.
     *
     * @param availableShippingServiceOptions
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withAvailableShippingServiceOptions(AvailableShippingServiceOptions availableShippingServiceOptions) {
        this.availableShippingServiceOptions = availableShippingServiceOptions;
        return this;
    }

    /**
     * Get the value of AvailableLabelFormats.
     *
     * @return The value of AvailableLabelFormats.
     */
    public List<String> getAvailableLabelFormats() {
        if (availableLabelFormats==null) {
            availableLabelFormats = new ArrayList<String>();
        }
        return availableLabelFormats;
    }

    /**
     * Set the value of AvailableLabelFormats.
     *
     * @param availableLabelFormats
     *            The new value to set.
     */
    public void setAvailableLabelFormats(List<String> availableLabelFormats) {
        this.availableLabelFormats = availableLabelFormats;
    }

    /**
     * Clear AvailableLabelFormats.
     */
    public void unsetAvailableLabelFormats() {
        this.availableLabelFormats = null;
    }

    /**
     * Check to see if AvailableLabelFormats is set.
     *
     * @return true if AvailableLabelFormats is set.
     */
    public boolean isSetAvailableLabelFormats() {
        return availableLabelFormats != null && !availableLabelFormats.isEmpty();
    }

    /**
     * Add values for AvailableLabelFormats, return this.
     *
     * @param availableLabelFormats
     *             New values to add.
     *
     * @return This instance.
     */
    public ShippingService withAvailableLabelFormats(String... values) {
        List<String> list = getAvailableLabelFormats();
        for (String value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of AvailableFormatOptionsForLabel.
     *
     * @return The value of AvailableFormatOptionsForLabel.
     */
    public List<LabelFormatOption> getAvailableFormatOptionsForLabel() {
        if (availableFormatOptionsForLabel==null) {
            availableFormatOptionsForLabel = new ArrayList<LabelFormatOption>();
        }
        return availableFormatOptionsForLabel;
    }

    /**
     * Set the value of AvailableFormatOptionsForLabel.
     *
     * @param availableFormatOptionsForLabel
     *            The new value to set.
     */
    public void setAvailableFormatOptionsForLabel(List<LabelFormatOption> availableFormatOptionsForLabel) {
        this.availableFormatOptionsForLabel = availableFormatOptionsForLabel;
    }

    /**
     * Clear AvailableFormatOptionsForLabel.
     */
    public void unsetAvailableFormatOptionsForLabel() {
        this.availableFormatOptionsForLabel = null;
    }

    /**
     * Check to see if AvailableFormatOptionsForLabel is set.
     *
     * @return true if AvailableFormatOptionsForLabel is set.
     */
    public boolean isSetAvailableFormatOptionsForLabel() {
        return availableFormatOptionsForLabel != null && !availableFormatOptionsForLabel.isEmpty();
    }

    /**
     * Add values for AvailableFormatOptionsForLabel, return this.
     *
     * @param availableFormatOptionsForLabel
     *             New values to add.
     *
     * @return This instance.
     */
    public ShippingService withAvailableFormatOptionsForLabel(LabelFormatOption... values) {
        List<LabelFormatOption> list = getAvailableFormatOptionsForLabel();
        for (LabelFormatOption value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Check the value of RequiresAdditionalSellerInputs.
     *
     * @return true if RequiresAdditionalSellerInputs is set to true.
     */
    public boolean isRequiresAdditionalSellerInputs() {
        return requiresAdditionalSellerInputs;
    }

    /**
     * Get the value of RequiresAdditionalSellerInputs.
     *
     * @return The value of RequiresAdditionalSellerInputs.
     */
    public boolean getRequiresAdditionalSellerInputs() {
        return requiresAdditionalSellerInputs;
    }

    /**
     * Set the value of RequiresAdditionalSellerInputs.
     *
     * @param requiresAdditionalSellerInputs
     *            The new value to set.
     */
    public void setRequiresAdditionalSellerInputs(boolean requiresAdditionalSellerInputs) {
        this.requiresAdditionalSellerInputs = requiresAdditionalSellerInputs;
    }

    /**
     * Set the value of RequiresAdditionalSellerInputs, return this.
     *
     * @param requiresAdditionalSellerInputs
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingService withRequiresAdditionalSellerInputs(boolean requiresAdditionalSellerInputs) {
        this.requiresAdditionalSellerInputs = requiresAdditionalSellerInputs;
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
        shippingServiceName = r.read("ShippingServiceName", String.class);
        carrierName = r.read("CarrierName", String.class);
        shippingServiceId = r.read("ShippingServiceId", String.class);
        shippingServiceOfferId = r.read("ShippingServiceOfferId", String.class);
        shipDate = r.read("ShipDate", XMLGregorianCalendar.class);
        earliestEstimatedDeliveryDate = r.read("EarliestEstimatedDeliveryDate", XMLGregorianCalendar.class);
        latestEstimatedDeliveryDate = r.read("LatestEstimatedDeliveryDate", XMLGregorianCalendar.class);
        rate = r.read("Rate", CurrencyAmount.class);
        shippingServiceOptions = r.read("ShippingServiceOptions", ShippingServiceOptions.class);
        availableShippingServiceOptions = r.read("AvailableShippingServiceOptions", AvailableShippingServiceOptions.class);
        availableLabelFormats = r.readList("AvailableLabelFormats", "LabelFormat", String.class);
        availableFormatOptionsForLabel = r.readList("AvailableFormatOptionsForLabel", "LabelFormatOption", LabelFormatOption.class);
        requiresAdditionalSellerInputs = r.read("RequiresAdditionalSellerInputs", boolean.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ShippingServiceName", shippingServiceName);
        w.write("CarrierName", carrierName);
        w.write("ShippingServiceId", shippingServiceId);
        w.write("ShippingServiceOfferId", shippingServiceOfferId);
        w.write("ShipDate", shipDate);
        w.write("EarliestEstimatedDeliveryDate", earliestEstimatedDeliveryDate);
        w.write("LatestEstimatedDeliveryDate", latestEstimatedDeliveryDate);
        w.write("Rate", rate);
        w.write("ShippingServiceOptions", shippingServiceOptions);
        w.write("AvailableShippingServiceOptions", availableShippingServiceOptions);
        w.writeList("AvailableLabelFormats", "LabelFormat", availableLabelFormats);
        w.writeList("AvailableFormatOptionsForLabel", "LabelFormatOption", availableFormatOptionsForLabel);
        w.write("RequiresAdditionalSellerInputs", requiresAdditionalSellerInputs);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "ShippingService",this);
    }

    /** Legacy Value constructor. */
    public ShippingService(String shippingServiceName,String carrierName,String shippingServiceId,String shippingServiceOfferId,XMLGregorianCalendar shipDate,XMLGregorianCalendar earliestEstimatedDeliveryDate,XMLGregorianCalendar latestEstimatedDeliveryDate,CurrencyAmount rate,ShippingServiceOptions shippingServiceOptions) {
        this.shippingServiceName = shippingServiceName;
        this.carrierName = carrierName;
        this.shippingServiceId = shippingServiceId;
        this.shippingServiceOfferId = shippingServiceOfferId;
        this.shipDate = shipDate;
        this.earliestEstimatedDeliveryDate = earliestEstimatedDeliveryDate;
        this.latestEstimatedDeliveryDate = latestEstimatedDeliveryDate;
        this.rate = rate;
        this.shippingServiceOptions = shippingServiceOptions;
    }

    /** Value constructor. */
    public ShippingService(String shippingServiceName,String carrierName,String shippingServiceId,String shippingServiceOfferId,XMLGregorianCalendar shipDate,CurrencyAmount rate,ShippingServiceOptions shippingServiceOptions,List<LabelFormatOption> availableFormatOptionsForLabel,boolean requiresAdditionalSellerInputs) {
        this.shippingServiceName = shippingServiceName;
        this.carrierName = carrierName;
        this.shippingServiceId = shippingServiceId;
        this.shippingServiceOfferId = shippingServiceOfferId;
        this.shipDate = shipDate;
        this.rate = rate;
        this.shippingServiceOptions = shippingServiceOptions;
        this.availableFormatOptionsForLabel = availableFormatOptionsForLabel;
        this.requiresAdditionalSellerInputs = requiresAdditionalSellerInputs;
    }

    /** Default constructor. */
    public ShippingService() {
        super();
    }

}

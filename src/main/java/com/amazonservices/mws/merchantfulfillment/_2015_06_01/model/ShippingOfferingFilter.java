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
 * Shipping Offering Filter
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * ShippingOfferingFilter complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShippingOfferingFilter"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="IncludePackingSlipWithLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="IncludeComplexShippingOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="CarrierWillPickUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DeliveryExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ShippingOfferingFilter extends AbstractMwsObject {

    private Boolean includePackingSlipWithLabel;

    private Boolean includeComplexShippingOptions;

    private String carrierWillPickUp;

    private String deliveryExperience;

    /**
     * Check the value of IncludePackingSlipWithLabel.
     *
     * @return true if IncludePackingSlipWithLabel is set to true.
     */
    public boolean isIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel!=null && includePackingSlipWithLabel.booleanValue();
    }

    /**
     * Get the value of IncludePackingSlipWithLabel.
     *
     * @return The value of IncludePackingSlipWithLabel.
     */
    public Boolean getIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel;
    }

    /**
     * Set the value of IncludePackingSlipWithLabel.
     *
     * @param includePackingSlipWithLabel
     *            The new value to set.
     */
    public void setIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
    }

    /**
     * Check to see if IncludePackingSlipWithLabel is set.
     *
     * @return true if IncludePackingSlipWithLabel is set.
     */
    public boolean isSetIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel != null;
    }

    /**
     * Set the value of IncludePackingSlipWithLabel, return this.
     *
     * @param includePackingSlipWithLabel
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingOfferingFilter withIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
        return this;
    }

    /**
     * Check the value of IncludeComplexShippingOptions.
     *
     * @return true if IncludeComplexShippingOptions is set to true.
     */
    public boolean isIncludeComplexShippingOptions() {
        return includeComplexShippingOptions!=null && includeComplexShippingOptions.booleanValue();
    }

    /**
     * Get the value of IncludeComplexShippingOptions.
     *
     * @return The value of IncludeComplexShippingOptions.
     */
    public Boolean getIncludeComplexShippingOptions() {
        return includeComplexShippingOptions;
    }

    /**
     * Set the value of IncludeComplexShippingOptions.
     *
     * @param includeComplexShippingOptions
     *            The new value to set.
     */
    public void setIncludeComplexShippingOptions(Boolean includeComplexShippingOptions) {
        this.includeComplexShippingOptions = includeComplexShippingOptions;
    }

    /**
     * Check to see if IncludeComplexShippingOptions is set.
     *
     * @return true if IncludeComplexShippingOptions is set.
     */
    public boolean isSetIncludeComplexShippingOptions() {
        return includeComplexShippingOptions != null;
    }

    /**
     * Set the value of IncludeComplexShippingOptions, return this.
     *
     * @param includeComplexShippingOptions
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingOfferingFilter withIncludeComplexShippingOptions(Boolean includeComplexShippingOptions) {
        this.includeComplexShippingOptions = includeComplexShippingOptions;
        return this;
    }

    /**
     * Get the value of CarrierWillPickUp.
     *
     * @return The value of CarrierWillPickUp.
     */
    public String getCarrierWillPickUp() {
        return carrierWillPickUp;
    }

    /**
     * Set the value of CarrierWillPickUp.
     *
     * @param carrierWillPickUp
     *            The new value to set.
     */
    public void setCarrierWillPickUp(String carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
    }

    /**
     * Check to see if CarrierWillPickUp is set.
     *
     * @return true if CarrierWillPickUp is set.
     */
    public boolean isSetCarrierWillPickUp() {
        return carrierWillPickUp != null;
    }

    /**
     * Set the value of CarrierWillPickUp, return this.
     *
     * @param carrierWillPickUp
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingOfferingFilter withCarrierWillPickUp(String carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
        return this;
    }

    /**
     * Get the value of DeliveryExperience.
     *
     * @return The value of DeliveryExperience.
     */
    public String getDeliveryExperience() {
        return deliveryExperience;
    }

    /**
     * Set the value of DeliveryExperience.
     *
     * @param deliveryExperience
     *            The new value to set.
     */
    public void setDeliveryExperience(String deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
    }

    /**
     * Check to see if DeliveryExperience is set.
     *
     * @return true if DeliveryExperience is set.
     */
    public boolean isSetDeliveryExperience() {
        return deliveryExperience != null;
    }

    /**
     * Set the value of DeliveryExperience, return this.
     *
     * @param deliveryExperience
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingOfferingFilter withDeliveryExperience(String deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
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
        includePackingSlipWithLabel = r.read("IncludePackingSlipWithLabel", Boolean.class);
        includeComplexShippingOptions = r.read("IncludeComplexShippingOptions", Boolean.class);
        carrierWillPickUp = r.read("CarrierWillPickUp", String.class);
        deliveryExperience = r.read("DeliveryExperience", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("IncludePackingSlipWithLabel", includePackingSlipWithLabel);
        w.write("IncludeComplexShippingOptions", includeComplexShippingOptions);
        w.write("CarrierWillPickUp", carrierWillPickUp);
        w.write("DeliveryExperience", deliveryExperience);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "ShippingOfferingFilter",this);
    }


    /** Default constructor. */
    public ShippingOfferingFilter() {
        super();
    }

}

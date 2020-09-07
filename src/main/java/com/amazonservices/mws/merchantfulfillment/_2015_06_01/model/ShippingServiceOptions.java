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
 * Shipping Service Options
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * ShippingServiceOptions complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShippingServiceOptions"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DeliveryExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DeclaredValue" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}CurrencyAmount" minOccurs="0"/&gt;
 *             &lt;element name="CarrierWillPickUp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="CarrierWillPickUpOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="LabelFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ShippingServiceOptions extends AbstractMwsObject {

    private String deliveryExperience;

    private CurrencyAmount declaredValue;

    private Boolean carrierWillPickUp;

    private String carrierWillPickUpOption;

    private String labelFormat;

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
    public ShippingServiceOptions withDeliveryExperience(String deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
        return this;
    }

    /**
     * Get the value of DeclaredValue.
     *
     * @return The value of DeclaredValue.
     */
    public CurrencyAmount getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Set the value of DeclaredValue.
     *
     * @param declaredValue
     *            The new value to set.
     */
    public void setDeclaredValue(CurrencyAmount declaredValue) {
        this.declaredValue = declaredValue;
    }

    /**
     * Check to see if DeclaredValue is set.
     *
     * @return true if DeclaredValue is set.
     */
    public boolean isSetDeclaredValue() {
        return declaredValue != null;
    }

    /**
     * Set the value of DeclaredValue, return this.
     *
     * @param declaredValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingServiceOptions withDeclaredValue(CurrencyAmount declaredValue) {
        this.declaredValue = declaredValue;
        return this;
    }

    /**
     * Check the value of CarrierWillPickUp.
     *
     * @return true if CarrierWillPickUp is set to true.
     */
    public boolean isCarrierWillPickUp() {
        return carrierWillPickUp!=null && carrierWillPickUp.booleanValue();
    }

    /**
     * Get the value of CarrierWillPickUp.
     *
     * @return The value of CarrierWillPickUp.
     */
    public Boolean getCarrierWillPickUp() {
        return carrierWillPickUp;
    }

    /**
     * Set the value of CarrierWillPickUp.
     *
     * @param carrierWillPickUp
     *            The new value to set.
     */
    public void setCarrierWillPickUp(Boolean carrierWillPickUp) {
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
    public ShippingServiceOptions withCarrierWillPickUp(Boolean carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
        return this;
    }

    /**
     * Get the value of CarrierWillPickUpOption.
     *
     * @return The value of CarrierWillPickUpOption.
     */
    public String getCarrierWillPickUpOption() {
        return carrierWillPickUpOption;
    }

    /**
     * Set the value of CarrierWillPickUpOption.
     *
     * @param carrierWillPickUpOption
     *            The new value to set.
     */
    public void setCarrierWillPickUpOption(String carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
    }

    /**
     * Check to see if CarrierWillPickUpOption is set.
     *
     * @return true if CarrierWillPickUpOption is set.
     */
    public boolean isSetCarrierWillPickUpOption() {
        return carrierWillPickUpOption != null;
    }

    /**
     * Set the value of CarrierWillPickUpOption, return this.
     *
     * @param carrierWillPickUpOption
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingServiceOptions withCarrierWillPickUpOption(String carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
        return this;
    }

    /**
     * Get the value of LabelFormat.
     *
     * @return The value of LabelFormat.
     */
    public String getLabelFormat() {
        return labelFormat;
    }

    /**
     * Set the value of LabelFormat.
     *
     * @param labelFormat
     *            The new value to set.
     */
    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
    }

    /**
     * Check to see if LabelFormat is set.
     *
     * @return true if LabelFormat is set.
     */
    public boolean isSetLabelFormat() {
        return labelFormat != null;
    }

    /**
     * Set the value of LabelFormat, return this.
     *
     * @param labelFormat
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingServiceOptions withLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
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
        deliveryExperience = r.read("DeliveryExperience", String.class);
        declaredValue = r.read("DeclaredValue", CurrencyAmount.class);
        carrierWillPickUp = r.read("CarrierWillPickUp", Boolean.class);
        carrierWillPickUpOption = r.read("CarrierWillPickUpOption", String.class);
        labelFormat = r.read("LabelFormat", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DeliveryExperience", deliveryExperience);
        w.write("DeclaredValue", declaredValue);
        w.write("CarrierWillPickUp", carrierWillPickUp);
        w.write("CarrierWillPickUpOption", carrierWillPickUpOption);
        w.write("LabelFormat", labelFormat);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "ShippingServiceOptions",this);
    }


    /** Legacy Value constructor. */
    public ShippingServiceOptions(String deliveryExperience,CurrencyAmount declaredValue,boolean carrierWillPickUp) {
        this.deliveryExperience = deliveryExperience;
        this.declaredValue = declaredValue;
        this.carrierWillPickUp = carrierWillPickUp;
    }

    /** Default constructor. */
    public ShippingServiceOptions() {
        super();
    }

}

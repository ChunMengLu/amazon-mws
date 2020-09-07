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
 * Available Delivery Experience Option
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * AvailableDeliveryExperienceOption complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AvailableDeliveryExperienceOption"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DeliveryExperienceOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Charge" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}CurrencyAmount"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AvailableDeliveryExperienceOption extends AbstractMwsObject {

    private String deliveryExperienceOption;

    private CurrencyAmount charge;

    /**
     * Get the value of DeliveryExperienceOption.
     *
     * @return The value of DeliveryExperienceOption.
     */
    public String getDeliveryExperienceOption() {
        return deliveryExperienceOption;
    }

    /**
     * Set the value of DeliveryExperienceOption.
     *
     * @param deliveryExperienceOption
     *            The new value to set.
     */
    public void setDeliveryExperienceOption(String deliveryExperienceOption) {
        this.deliveryExperienceOption = deliveryExperienceOption;
    }

    /**
     * Check to see if DeliveryExperienceOption is set.
     *
     * @return true if DeliveryExperienceOption is set.
     */
    public boolean isSetDeliveryExperienceOption() {
        return deliveryExperienceOption != null;
    }

    /**
     * Set the value of DeliveryExperienceOption, return this.
     *
     * @param deliveryExperienceOption
     *             The new value to set.
     *
     * @return This instance.
     */
    public AvailableDeliveryExperienceOption withDeliveryExperienceOption(String deliveryExperienceOption) {
        this.deliveryExperienceOption = deliveryExperienceOption;
        return this;
    }

    /**
     * Get the value of Charge.
     *
     * @return The value of Charge.
     */
    public CurrencyAmount getCharge() {
        return charge;
    }

    /**
     * Set the value of Charge.
     *
     * @param charge
     *            The new value to set.
     */
    public void setCharge(CurrencyAmount charge) {
        this.charge = charge;
    }

    /**
     * Check to see if Charge is set.
     *
     * @return true if Charge is set.
     */
    public boolean isSetCharge() {
        return charge != null;
    }

    /**
     * Set the value of Charge, return this.
     *
     * @param charge
     *             The new value to set.
     *
     * @return This instance.
     */
    public AvailableDeliveryExperienceOption withCharge(CurrencyAmount charge) {
        this.charge = charge;
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
        deliveryExperienceOption = r.read("DeliveryExperienceOption", String.class);
        charge = r.read("Charge", CurrencyAmount.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DeliveryExperienceOption", deliveryExperienceOption);
        w.write("Charge", charge);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "AvailableDeliveryExperienceOption",this);
    }

    /** Value constructor. */
    public AvailableDeliveryExperienceOption(String deliveryExperienceOption,CurrencyAmount charge) {
        this.deliveryExperienceOption = deliveryExperienceOption;
        this.charge = charge;
    }

    /** Default constructor. */
    public AvailableDeliveryExperienceOption() {
        super();
    }

}

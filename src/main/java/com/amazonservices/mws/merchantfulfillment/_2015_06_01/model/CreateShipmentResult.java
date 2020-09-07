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
 * Create Shipment Result
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * CreateShipmentResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateShipmentResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Shipment" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Shipment"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class CreateShipmentResult extends AbstractMwsObject {

    private Shipment shipment;

    /**
     * Get the value of Shipment.
     *
     * @return The value of Shipment.
     */
    public Shipment getShipment() {
        return shipment;
    }

    /**
     * Set the value of Shipment.
     *
     * @param shipment
     *            The new value to set.
     */
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    /**
     * Check to see if Shipment is set.
     *
     * @return true if Shipment is set.
     */
    public boolean isSetShipment() {
        return shipment != null;
    }

    /**
     * Set the value of Shipment, return this.
     *
     * @param shipment
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateShipmentResult withShipment(Shipment shipment) {
        this.shipment = shipment;
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
        shipment = r.read("Shipment", Shipment.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Shipment", shipment);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "CreateShipmentResult",this);
    }

    /** Value constructor. */
    public CreateShipmentResult(Shipment shipment) {
        this.shipment = shipment;
    }

    /** Default constructor. */
    public CreateShipmentResult() {
        super();
    }

}

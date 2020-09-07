/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Non Partnered Ltl Data Input
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * NonPartneredLtlDataInput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="NonPartneredLtlDataInput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ProNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="NonPartneredLtlDataInput", propOrder={
    "carrierName",
    "proNumber"
})
@XmlRootElement(name = "NonPartneredLtlDataInput")
public class NonPartneredLtlDataInput extends AbstractMwsObject {

    @XmlElement(name="CarrierName",required=true)
    private String carrierName;

    @XmlElement(name="ProNumber",required=true)
    private String proNumber;

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
    public NonPartneredLtlDataInput withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get the value of ProNumber.
     *
     * @return The value of ProNumber.
     */
    public String getProNumber() {
        return proNumber;
    }

    /**
     * Set the value of ProNumber.
     *
     * @param proNumber
     *            The new value to set.
     */
    public void setProNumber(String proNumber) {
        this.proNumber = proNumber;
    }

    /**
     * Check to see if ProNumber is set.
     *
     * @return true if ProNumber is set.
     */
    public boolean isSetProNumber() {
        return proNumber != null;
    }

    /**
     * Set the value of ProNumber, return this.
     *
     * @param proNumber
     *             The new value to set.
     *
     * @return This instance.
     */
    public NonPartneredLtlDataInput withProNumber(String proNumber) {
        this.proNumber = proNumber;
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
        carrierName = r.read("CarrierName", String.class);
        proNumber = r.read("ProNumber", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CarrierName", carrierName);
        w.write("ProNumber", proNumber);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "NonPartneredLtlDataInput",this);
    }

    /** Value constructor. */
    public NonPartneredLtlDataInput(String carrierName,String proNumber) {
        this.carrierName = carrierName;
        this.proNumber = proNumber;
    }

    /** Default constructor. */
    public NonPartneredLtlDataInput() {
        super();
    }

}

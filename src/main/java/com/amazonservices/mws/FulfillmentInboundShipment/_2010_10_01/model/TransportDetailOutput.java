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
 * Transport Detail Output
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
 * TransportDetailOutput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TransportDetailOutput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PartneredSmallParcelData" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PartneredSmallParcelDataOutput" minOccurs="0"/&gt;
 *             &lt;element name="NonPartneredSmallParcelData" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}NonPartneredSmallParcelDataOutput" minOccurs="0"/&gt;
 *             &lt;element name="PartneredLtlData" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PartneredLtlDataOutput" minOccurs="0"/&gt;
 *             &lt;element name="NonPartneredLtlData" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}NonPartneredLtlDataOutput" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TransportDetailOutput", propOrder={
    "partneredSmallParcelData",
    "nonPartneredSmallParcelData",
    "partneredLtlData",
    "nonPartneredLtlData"
})
@XmlRootElement(name = "TransportDetailOutput")
public class TransportDetailOutput extends AbstractMwsObject {

    @XmlElement(name="PartneredSmallParcelData")
    private PartneredSmallParcelDataOutput partneredSmallParcelData;

    @XmlElement(name="NonPartneredSmallParcelData")
    private NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData;

    @XmlElement(name="PartneredLtlData")
    private PartneredLtlDataOutput partneredLtlData;

    @XmlElement(name="NonPartneredLtlData")
    private NonPartneredLtlDataOutput nonPartneredLtlData;

    /**
     * Get the value of PartneredSmallParcelData.
     *
     * @return The value of PartneredSmallParcelData.
     */
    public PartneredSmallParcelDataOutput getPartneredSmallParcelData() {
        return partneredSmallParcelData;
    }

    /**
     * Set the value of PartneredSmallParcelData.
     *
     * @param partneredSmallParcelData
     *            The new value to set.
     */
    public void setPartneredSmallParcelData(PartneredSmallParcelDataOutput partneredSmallParcelData) {
        this.partneredSmallParcelData = partneredSmallParcelData;
    }

    /**
     * Check to see if PartneredSmallParcelData is set.
     *
     * @return true if PartneredSmallParcelData is set.
     */
    public boolean isSetPartneredSmallParcelData() {
        return partneredSmallParcelData != null;
    }

    /**
     * Set the value of PartneredSmallParcelData, return this.
     *
     * @param partneredSmallParcelData
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportDetailOutput withPartneredSmallParcelData(PartneredSmallParcelDataOutput partneredSmallParcelData) {
        this.partneredSmallParcelData = partneredSmallParcelData;
        return this;
    }

    /**
     * Get the value of NonPartneredSmallParcelData.
     *
     * @return The value of NonPartneredSmallParcelData.
     */
    public NonPartneredSmallParcelDataOutput getNonPartneredSmallParcelData() {
        return nonPartneredSmallParcelData;
    }

    /**
     * Set the value of NonPartneredSmallParcelData.
     *
     * @param nonPartneredSmallParcelData
     *            The new value to set.
     */
    public void setNonPartneredSmallParcelData(NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData) {
        this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
    }

    /**
     * Check to see if NonPartneredSmallParcelData is set.
     *
     * @return true if NonPartneredSmallParcelData is set.
     */
    public boolean isSetNonPartneredSmallParcelData() {
        return nonPartneredSmallParcelData != null;
    }

    /**
     * Set the value of NonPartneredSmallParcelData, return this.
     *
     * @param nonPartneredSmallParcelData
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportDetailOutput withNonPartneredSmallParcelData(NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData) {
        this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
        return this;
    }

    /**
     * Get the value of PartneredLtlData.
     *
     * @return The value of PartneredLtlData.
     */
    public PartneredLtlDataOutput getPartneredLtlData() {
        return partneredLtlData;
    }

    /**
     * Set the value of PartneredLtlData.
     *
     * @param partneredLtlData
     *            The new value to set.
     */
    public void setPartneredLtlData(PartneredLtlDataOutput partneredLtlData) {
        this.partneredLtlData = partneredLtlData;
    }

    /**
     * Check to see if PartneredLtlData is set.
     *
     * @return true if PartneredLtlData is set.
     */
    public boolean isSetPartneredLtlData() {
        return partneredLtlData != null;
    }

    /**
     * Set the value of PartneredLtlData, return this.
     *
     * @param partneredLtlData
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportDetailOutput withPartneredLtlData(PartneredLtlDataOutput partneredLtlData) {
        this.partneredLtlData = partneredLtlData;
        return this;
    }

    /**
     * Get the value of NonPartneredLtlData.
     *
     * @return The value of NonPartneredLtlData.
     */
    public NonPartneredLtlDataOutput getNonPartneredLtlData() {
        return nonPartneredLtlData;
    }

    /**
     * Set the value of NonPartneredLtlData.
     *
     * @param nonPartneredLtlData
     *            The new value to set.
     */
    public void setNonPartneredLtlData(NonPartneredLtlDataOutput nonPartneredLtlData) {
        this.nonPartneredLtlData = nonPartneredLtlData;
    }

    /**
     * Check to see if NonPartneredLtlData is set.
     *
     * @return true if NonPartneredLtlData is set.
     */
    public boolean isSetNonPartneredLtlData() {
        return nonPartneredLtlData != null;
    }

    /**
     * Set the value of NonPartneredLtlData, return this.
     *
     * @param nonPartneredLtlData
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportDetailOutput withNonPartneredLtlData(NonPartneredLtlDataOutput nonPartneredLtlData) {
        this.nonPartneredLtlData = nonPartneredLtlData;
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
        partneredSmallParcelData = r.read("PartneredSmallParcelData", PartneredSmallParcelDataOutput.class);
        nonPartneredSmallParcelData = r.read("NonPartneredSmallParcelData", NonPartneredSmallParcelDataOutput.class);
        partneredLtlData = r.read("PartneredLtlData", PartneredLtlDataOutput.class);
        nonPartneredLtlData = r.read("NonPartneredLtlData", NonPartneredLtlDataOutput.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PartneredSmallParcelData", partneredSmallParcelData);
        w.write("NonPartneredSmallParcelData", nonPartneredSmallParcelData);
        w.write("PartneredLtlData", partneredLtlData);
        w.write("NonPartneredLtlData", nonPartneredLtlData);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "TransportDetailOutput",this);
    }


    /** Value constructor. */
    public TransportDetailOutput(PartneredSmallParcelDataOutput partneredSmallParcelData,NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData,PartneredLtlDataOutput partneredLtlData,NonPartneredLtlDataOutput nonPartneredLtlData) {
        this.partneredSmallParcelData = partneredSmallParcelData;
        this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
        this.partneredLtlData = partneredLtlData;
        this.nonPartneredLtlData = nonPartneredLtlData;
    }

    /** Default constructor. */
    public TransportDetailOutput() {
        super();
    }

}

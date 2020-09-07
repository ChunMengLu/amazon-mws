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
 * Partnered Small Parcel Data Input
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
 * PartneredSmallParcelDataInput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PartneredSmallParcelDataInput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PackageList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PartneredSmallParcelPackageInputList" minOccurs="0"/&gt;
 *             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PartneredSmallParcelDataInput", propOrder={
    "packageList",
    "carrierName"
})
@XmlRootElement(name = "PartneredSmallParcelDataInput")
public class PartneredSmallParcelDataInput extends AbstractMwsObject {

    @XmlElement(name="PackageList")
    private PartneredSmallParcelPackageInputList packageList;

    @XmlElement(name="CarrierName")
    private String carrierName;

    /**
     * Get the value of PackageList.
     *
     * @return The value of PackageList.
     */
    public PartneredSmallParcelPackageInputList getPackageList() {
        return packageList;
    }

    /**
     * Set the value of PackageList.
     *
     * @param packageList
     *            The new value to set.
     */
    public void setPackageList(PartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
    }

    /**
     * Check to see if PackageList is set.
     *
     * @return true if PackageList is set.
     */
    public boolean isSetPackageList() {
        return packageList != null;
    }

    /**
     * Set the value of PackageList, return this.
     *
     * @param packageList
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredSmallParcelDataInput withPackageList(PartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
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
    public PartneredSmallParcelDataInput withCarrierName(String carrierName) {
        this.carrierName = carrierName;
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
        packageList = r.read("PackageList", PartneredSmallParcelPackageInputList.class);
        carrierName = r.read("CarrierName", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PackageList", packageList);
        w.write("CarrierName", carrierName);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PartneredSmallParcelDataInput",this);
    }


    /** Value constructor. */
    public PartneredSmallParcelDataInput(PartneredSmallParcelPackageInputList packageList,String carrierName) {
        this.packageList = packageList;
        this.carrierName = carrierName;
    }

    /** Default constructor. */
    public PartneredSmallParcelDataInput() {
        super();
    }

}

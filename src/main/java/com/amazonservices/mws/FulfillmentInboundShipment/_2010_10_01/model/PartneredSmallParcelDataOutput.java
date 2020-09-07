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
 * Partnered Small Parcel Data Output
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
 * PartneredSmallParcelDataOutput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PartneredSmallParcelDataOutput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PackageList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PartneredSmallParcelPackageOutputList"/&gt;
 *             &lt;element name="PartneredEstimate" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PartneredEstimate" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PartneredSmallParcelDataOutput", propOrder={
    "packageList",
    "partneredEstimate"
})
@XmlRootElement(name = "PartneredSmallParcelDataOutput")
public class PartneredSmallParcelDataOutput extends AbstractMwsObject {

    @XmlElement(name="PackageList",required=true)
    private PartneredSmallParcelPackageOutputList packageList;

    @XmlElement(name="PartneredEstimate")
    private PartneredEstimate partneredEstimate;

    /**
     * Get the value of PackageList.
     *
     * @return The value of PackageList.
     */
    public PartneredSmallParcelPackageOutputList getPackageList() {
        return packageList;
    }

    /**
     * Set the value of PackageList.
     *
     * @param packageList
     *            The new value to set.
     */
    public void setPackageList(PartneredSmallParcelPackageOutputList packageList) {
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
    public PartneredSmallParcelDataOutput withPackageList(PartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * Get the value of PartneredEstimate.
     *
     * @return The value of PartneredEstimate.
     */
    public PartneredEstimate getPartneredEstimate() {
        return partneredEstimate;
    }

    /**
     * Set the value of PartneredEstimate.
     *
     * @param partneredEstimate
     *            The new value to set.
     */
    public void setPartneredEstimate(PartneredEstimate partneredEstimate) {
        this.partneredEstimate = partneredEstimate;
    }

    /**
     * Check to see if PartneredEstimate is set.
     *
     * @return true if PartneredEstimate is set.
     */
    public boolean isSetPartneredEstimate() {
        return partneredEstimate != null;
    }

    /**
     * Set the value of PartneredEstimate, return this.
     *
     * @param partneredEstimate
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredSmallParcelDataOutput withPartneredEstimate(PartneredEstimate partneredEstimate) {
        this.partneredEstimate = partneredEstimate;
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
        packageList = r.read("PackageList", PartneredSmallParcelPackageOutputList.class);
        partneredEstimate = r.read("PartneredEstimate", PartneredEstimate.class);
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
        w.write("PartneredEstimate", partneredEstimate);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PartneredSmallParcelDataOutput",this);
    }

    /** Value constructor. */
    public PartneredSmallParcelDataOutput(PartneredSmallParcelPackageOutputList packageList,PartneredEstimate partneredEstimate) {
        this.packageList = packageList;
        this.partneredEstimate = partneredEstimate;
    }

    /** Value constructor. */
    public PartneredSmallParcelDataOutput(PartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
    }

    /** Default constructor. */
    public PartneredSmallParcelDataOutput() {
        super();
    }

}

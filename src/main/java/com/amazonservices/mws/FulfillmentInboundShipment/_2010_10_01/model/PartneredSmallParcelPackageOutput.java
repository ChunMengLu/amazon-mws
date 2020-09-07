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
 * Partnered Small Parcel Package Output
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
 * PartneredSmallParcelPackageOutput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PartneredSmallParcelPackageOutput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Dimensions" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Dimensions"/&gt;
 *             &lt;element name="Weight" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Weight"/&gt;
 *             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="TrackingId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PackageStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PartneredSmallParcelPackageOutput", propOrder={
    "dimensions",
    "weight",
    "carrierName",
    "trackingId",
    "packageStatus"
})
@XmlRootElement(name = "PartneredSmallParcelPackageOutput")
public class PartneredSmallParcelPackageOutput extends AbstractMwsObject {

    @XmlElement(name="Dimensions",required=true)
    private Dimensions dimensions;

    @XmlElement(name="Weight",required=true)
    private Weight weight;

    @XmlElement(name="CarrierName",required=true)
    private String carrierName;

    @XmlElement(name="TrackingId",required=true)
    private String trackingId;

    @XmlElement(name="PackageStatus",required=true)
    private String packageStatus;

    /**
     * Get the value of Dimensions.
     *
     * @return The value of Dimensions.
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Set the value of Dimensions.
     *
     * @param dimensions
     *            The new value to set.
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Check to see if Dimensions is set.
     *
     * @return true if Dimensions is set.
     */
    public boolean isSetDimensions() {
        return dimensions != null;
    }

    /**
     * Set the value of Dimensions, return this.
     *
     * @param dimensions
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredSmallParcelPackageOutput withDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the value of Weight.
     *
     * @return The value of Weight.
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Set the value of Weight.
     *
     * @param weight
     *            The new value to set.
     */
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    /**
     * Check to see if Weight is set.
     *
     * @return true if Weight is set.
     */
    public boolean isSetWeight() {
        return weight != null;
    }

    /**
     * Set the value of Weight, return this.
     *
     * @param weight
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredSmallParcelPackageOutput withWeight(Weight weight) {
        this.weight = weight;
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
    public PartneredSmallParcelPackageOutput withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get the value of TrackingId.
     *
     * @return The value of TrackingId.
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Set the value of TrackingId.
     *
     * @param trackingId
     *            The new value to set.
     */
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * Check to see if TrackingId is set.
     *
     * @return true if TrackingId is set.
     */
    public boolean isSetTrackingId() {
        return trackingId != null;
    }

    /**
     * Set the value of TrackingId, return this.
     *
     * @param trackingId
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredSmallParcelPackageOutput withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get the value of PackageStatus.
     *
     * @return The value of PackageStatus.
     */
    public String getPackageStatus() {
        return packageStatus;
    }

    /**
     * Set the value of PackageStatus.
     *
     * @param packageStatus
     *            The new value to set.
     */
    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    /**
     * Check to see if PackageStatus is set.
     *
     * @return true if PackageStatus is set.
     */
    public boolean isSetPackageStatus() {
        return packageStatus != null;
    }

    /**
     * Set the value of PackageStatus, return this.
     *
     * @param packageStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredSmallParcelPackageOutput withPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
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
        dimensions = r.read("Dimensions", Dimensions.class);
        weight = r.read("Weight", Weight.class);
        carrierName = r.read("CarrierName", String.class);
        trackingId = r.read("TrackingId", String.class);
        packageStatus = r.read("PackageStatus", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Dimensions", dimensions);
        w.write("Weight", weight);
        w.write("CarrierName", carrierName);
        w.write("TrackingId", trackingId);
        w.write("PackageStatus", packageStatus);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PartneredSmallParcelPackageOutput",this);
    }

    /** Value constructor. */
    public PartneredSmallParcelPackageOutput(Dimensions dimensions,Weight weight,String carrierName,String trackingId,String packageStatus) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.carrierName = carrierName;
        this.trackingId = trackingId;
        this.packageStatus = packageStatus;
    }

    /** Default constructor. */
    public PartneredSmallParcelPackageOutput() {
        super();
    }

}

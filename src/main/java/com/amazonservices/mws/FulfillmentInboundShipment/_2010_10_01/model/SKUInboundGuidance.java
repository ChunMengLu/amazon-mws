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
 * SKU Inbound Guidance
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
 * SKUInboundGuidance complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SKUInboundGuidance"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="InboundGuidance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="GuidanceReasonList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}GuidanceReasonList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SKUInboundGuidance", propOrder={
    "sellerSKU",
    "asin",
    "inboundGuidance",
    "guidanceReasonList"
})
@XmlRootElement(name = "SKUInboundGuidance")
public class SKUInboundGuidance extends AbstractMwsObject {

    @XmlElement(name="SellerSKU")
    private String sellerSKU;

    @XmlElement(name="ASIN")
    private String asin;

    @XmlElement(name="InboundGuidance")
    private String inboundGuidance;

    @XmlElement(name="GuidanceReasonList")
    private GuidanceReasonList guidanceReasonList;

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUInboundGuidance withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUInboundGuidance withASIN(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get the value of InboundGuidance.
     *
     * @return The value of InboundGuidance.
     */
    public String getInboundGuidance() {
        return inboundGuidance;
    }

    /**
     * Set the value of InboundGuidance.
     *
     * @param inboundGuidance
     *            The new value to set.
     */
    public void setInboundGuidance(String inboundGuidance) {
        this.inboundGuidance = inboundGuidance;
    }

    /**
     * Check to see if InboundGuidance is set.
     *
     * @return true if InboundGuidance is set.
     */
    public boolean isSetInboundGuidance() {
        return inboundGuidance != null;
    }

    /**
     * Set the value of InboundGuidance, return this.
     *
     * @param inboundGuidance
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUInboundGuidance withInboundGuidance(String inboundGuidance) {
        this.inboundGuidance = inboundGuidance;
        return this;
    }

    /**
     * Get the value of GuidanceReasonList.
     *
     * @return The value of GuidanceReasonList.
     */
    public GuidanceReasonList getGuidanceReasonList() {
        return guidanceReasonList;
    }

    /**
     * Set the value of GuidanceReasonList.
     *
     * @param guidanceReasonList
     *            The new value to set.
     */
    public void setGuidanceReasonList(GuidanceReasonList guidanceReasonList) {
        this.guidanceReasonList = guidanceReasonList;
    }

    /**
     * Check to see if GuidanceReasonList is set.
     *
     * @return true if GuidanceReasonList is set.
     */
    public boolean isSetGuidanceReasonList() {
        return guidanceReasonList != null;
    }

    /**
     * Set the value of GuidanceReasonList, return this.
     *
     * @param guidanceReasonList
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUInboundGuidance withGuidanceReasonList(GuidanceReasonList guidanceReasonList) {
        this.guidanceReasonList = guidanceReasonList;
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
        sellerSKU = r.read("SellerSKU", String.class);
        asin = r.read("ASIN", String.class);
        inboundGuidance = r.read("InboundGuidance", String.class);
        guidanceReasonList = r.read("GuidanceReasonList", GuidanceReasonList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerSKU", sellerSKU);
        w.write("ASIN", asin);
        w.write("InboundGuidance", inboundGuidance);
        w.write("GuidanceReasonList", guidanceReasonList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "SKUInboundGuidance",this);
    }


    /** Default constructor. */
    public SKUInboundGuidance() {
        super();
    }

}

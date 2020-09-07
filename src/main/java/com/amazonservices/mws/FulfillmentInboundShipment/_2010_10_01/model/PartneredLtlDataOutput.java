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
 * Partnered Ltl Data Output
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
 * PartneredLtlDataOutput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PartneredLtlDataOutput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Contact" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Contact"/&gt;
 *             &lt;element name="BoxCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *             &lt;element name="SellerFreightClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FreightReadyDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PalletList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PalletList"/&gt;
 *             &lt;element name="TotalWeight" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Weight"/&gt;
 *             &lt;element name="SellerDeclaredValue" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Amount" minOccurs="0"/&gt;
 *             &lt;element name="AmazonCalculatedValue" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Amount" minOccurs="0"/&gt;
 *             &lt;element name="PreviewPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PreviewDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PreviewFreightClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AmazonReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="IsBillOfLadingAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="PartneredEstimate" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PartneredEstimate" minOccurs="0"/&gt;
 *             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PartneredLtlDataOutput", propOrder={
    "contact",
    "boxCount",
    "sellerFreightClass",
    "freightReadyDate",
    "palletList",
    "totalWeight",
    "sellerDeclaredValue",
    "amazonCalculatedValue",
    "previewPickupDate",
    "previewDeliveryDate",
    "previewFreightClass",
    "amazonReferenceId",
    "isBillOfLadingAvailable",
    "partneredEstimate",
    "carrierName"
})
@XmlRootElement(name = "PartneredLtlDataOutput")
public class PartneredLtlDataOutput extends AbstractMwsObject {

    @XmlElement(name="Contact",required=true)
    private Contact contact;

    @XmlElement(name="BoxCount",required=true)
    private long boxCount;

    @XmlElement(name="SellerFreightClass")
    private String sellerFreightClass;

    @XmlElement(name="FreightReadyDate",required=true)
    private String freightReadyDate;

    @XmlElement(name="PalletList",required=true)
    private PalletList palletList;

    @XmlElement(name="TotalWeight",required=true)
    private Weight totalWeight;

    @XmlElement(name="SellerDeclaredValue")
    private Amount sellerDeclaredValue;

    @XmlElement(name="AmazonCalculatedValue")
    private Amount amazonCalculatedValue;

    @XmlElement(name="PreviewPickupDate",required=true)
    private String previewPickupDate;

    @XmlElement(name="PreviewDeliveryDate",required=true)
    private String previewDeliveryDate;

    @XmlElement(name="PreviewFreightClass",required=true)
    private String previewFreightClass;

    @XmlElement(name="AmazonReferenceId",required=true)
    private String amazonReferenceId;

    @XmlElement(name="IsBillOfLadingAvailable",required=true)
    private boolean isBillOfLadingAvailable;

    @XmlElement(name="PartneredEstimate")
    private PartneredEstimate partneredEstimate;

    @XmlElement(name="CarrierName")
    private String carrierName;

    /**
     * Get the value of Contact.
     *
     * @return The value of Contact.
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Set the value of Contact.
     *
     * @param contact
     *            The new value to set.
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * Check to see if Contact is set.
     *
     * @return true if Contact is set.
     */
    public boolean isSetContact() {
        return contact != null;
    }

    /**
     * Set the value of Contact, return this.
     *
     * @param contact
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Get the value of BoxCount.
     *
     * @return The value of BoxCount.
     */
    public long getBoxCount() {
        return boxCount;
    }

    /**
     * Set the value of BoxCount.
     *
     * @param boxCount
     *            The new value to set.
     */
    public void setBoxCount(long boxCount) {
        this.boxCount = boxCount;
    }

    /**
     * Set the value of BoxCount, return this.
     *
     * @param boxCount
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withBoxCount(long boxCount) {
        this.boxCount = boxCount;
        return this;
    }

    /**
     * Get the value of SellerFreightClass.
     *
     * @return The value of SellerFreightClass.
     */
    public String getSellerFreightClass() {
        return sellerFreightClass;
    }

    /**
     * Set the value of SellerFreightClass.
     *
     * @param sellerFreightClass
     *            The new value to set.
     */
    public void setSellerFreightClass(String sellerFreightClass) {
        this.sellerFreightClass = sellerFreightClass;
    }

    /**
     * Check to see if SellerFreightClass is set.
     *
     * @return true if SellerFreightClass is set.
     */
    public boolean isSetSellerFreightClass() {
        return sellerFreightClass != null;
    }

    /**
     * Set the value of SellerFreightClass, return this.
     *
     * @param sellerFreightClass
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withSellerFreightClass(String sellerFreightClass) {
        this.sellerFreightClass = sellerFreightClass;
        return this;
    }

    /**
     * Get the value of FreightReadyDate.
     *
     * @return The value of FreightReadyDate.
     */
    public String getFreightReadyDate() {
        return freightReadyDate;
    }

    /**
     * Set the value of FreightReadyDate.
     *
     * @param freightReadyDate
     *            The new value to set.
     */
    public void setFreightReadyDate(String freightReadyDate) {
        this.freightReadyDate = freightReadyDate;
    }

    /**
     * Check to see if FreightReadyDate is set.
     *
     * @return true if FreightReadyDate is set.
     */
    public boolean isSetFreightReadyDate() {
        return freightReadyDate != null;
    }

    /**
     * Set the value of FreightReadyDate, return this.
     *
     * @param freightReadyDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withFreightReadyDate(String freightReadyDate) {
        this.freightReadyDate = freightReadyDate;
        return this;
    }

    /**
     * Get the value of PalletList.
     *
     * @return The value of PalletList.
     */
    public PalletList getPalletList() {
        return palletList;
    }

    /**
     * Set the value of PalletList.
     *
     * @param palletList
     *            The new value to set.
     */
    public void setPalletList(PalletList palletList) {
        this.palletList = palletList;
    }

    /**
     * Check to see if PalletList is set.
     *
     * @return true if PalletList is set.
     */
    public boolean isSetPalletList() {
        return palletList != null;
    }

    /**
     * Set the value of PalletList, return this.
     *
     * @param palletList
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withPalletList(PalletList palletList) {
        this.palletList = palletList;
        return this;
    }

    /**
     * Get the value of TotalWeight.
     *
     * @return The value of TotalWeight.
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }

    /**
     * Set the value of TotalWeight.
     *
     * @param totalWeight
     *            The new value to set.
     */
    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * Check to see if TotalWeight is set.
     *
     * @return true if TotalWeight is set.
     */
    public boolean isSetTotalWeight() {
        return totalWeight != null;
    }

    /**
     * Set the value of TotalWeight, return this.
     *
     * @param totalWeight
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    /**
     * Get the value of SellerDeclaredValue.
     *
     * @return The value of SellerDeclaredValue.
     */
    public Amount getSellerDeclaredValue() {
        return sellerDeclaredValue;
    }

    /**
     * Set the value of SellerDeclaredValue.
     *
     * @param sellerDeclaredValue
     *            The new value to set.
     */
    public void setSellerDeclaredValue(Amount sellerDeclaredValue) {
        this.sellerDeclaredValue = sellerDeclaredValue;
    }

    /**
     * Check to see if SellerDeclaredValue is set.
     *
     * @return true if SellerDeclaredValue is set.
     */
    public boolean isSetSellerDeclaredValue() {
        return sellerDeclaredValue != null;
    }

    /**
     * Set the value of SellerDeclaredValue, return this.
     *
     * @param sellerDeclaredValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withSellerDeclaredValue(Amount sellerDeclaredValue) {
        this.sellerDeclaredValue = sellerDeclaredValue;
        return this;
    }

    /**
     * Get the value of AmazonCalculatedValue.
     *
     * @return The value of AmazonCalculatedValue.
     */
    public Amount getAmazonCalculatedValue() {
        return amazonCalculatedValue;
    }

    /**
     * Set the value of AmazonCalculatedValue.
     *
     * @param amazonCalculatedValue
     *            The new value to set.
     */
    public void setAmazonCalculatedValue(Amount amazonCalculatedValue) {
        this.amazonCalculatedValue = amazonCalculatedValue;
    }

    /**
     * Check to see if AmazonCalculatedValue is set.
     *
     * @return true if AmazonCalculatedValue is set.
     */
    public boolean isSetAmazonCalculatedValue() {
        return amazonCalculatedValue != null;
    }

    /**
     * Set the value of AmazonCalculatedValue, return this.
     *
     * @param amazonCalculatedValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withAmazonCalculatedValue(Amount amazonCalculatedValue) {
        this.amazonCalculatedValue = amazonCalculatedValue;
        return this;
    }

    /**
     * Get the value of PreviewPickupDate.
     *
     * @return The value of PreviewPickupDate.
     */
    public String getPreviewPickupDate() {
        return previewPickupDate;
    }

    /**
     * Set the value of PreviewPickupDate.
     *
     * @param previewPickupDate
     *            The new value to set.
     */
    public void setPreviewPickupDate(String previewPickupDate) {
        this.previewPickupDate = previewPickupDate;
    }

    /**
     * Check to see if PreviewPickupDate is set.
     *
     * @return true if PreviewPickupDate is set.
     */
    public boolean isSetPreviewPickupDate() {
        return previewPickupDate != null;
    }

    /**
     * Set the value of PreviewPickupDate, return this.
     *
     * @param previewPickupDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withPreviewPickupDate(String previewPickupDate) {
        this.previewPickupDate = previewPickupDate;
        return this;
    }

    /**
     * Get the value of PreviewDeliveryDate.
     *
     * @return The value of PreviewDeliveryDate.
     */
    public String getPreviewDeliveryDate() {
        return previewDeliveryDate;
    }

    /**
     * Set the value of PreviewDeliveryDate.
     *
     * @param previewDeliveryDate
     *            The new value to set.
     */
    public void setPreviewDeliveryDate(String previewDeliveryDate) {
        this.previewDeliveryDate = previewDeliveryDate;
    }

    /**
     * Check to see if PreviewDeliveryDate is set.
     *
     * @return true if PreviewDeliveryDate is set.
     */
    public boolean isSetPreviewDeliveryDate() {
        return previewDeliveryDate != null;
    }

    /**
     * Set the value of PreviewDeliveryDate, return this.
     *
     * @param previewDeliveryDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withPreviewDeliveryDate(String previewDeliveryDate) {
        this.previewDeliveryDate = previewDeliveryDate;
        return this;
    }

    /**
     * Get the value of PreviewFreightClass.
     *
     * @return The value of PreviewFreightClass.
     */
    public String getPreviewFreightClass() {
        return previewFreightClass;
    }

    /**
     * Set the value of PreviewFreightClass.
     *
     * @param previewFreightClass
     *            The new value to set.
     */
    public void setPreviewFreightClass(String previewFreightClass) {
        this.previewFreightClass = previewFreightClass;
    }

    /**
     * Check to see if PreviewFreightClass is set.
     *
     * @return true if PreviewFreightClass is set.
     */
    public boolean isSetPreviewFreightClass() {
        return previewFreightClass != null;
    }

    /**
     * Set the value of PreviewFreightClass, return this.
     *
     * @param previewFreightClass
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withPreviewFreightClass(String previewFreightClass) {
        this.previewFreightClass = previewFreightClass;
        return this;
    }

    /**
     * Get the value of AmazonReferenceId.
     *
     * @return The value of AmazonReferenceId.
     */
    public String getAmazonReferenceId() {
        return amazonReferenceId;
    }

    /**
     * Set the value of AmazonReferenceId.
     *
     * @param amazonReferenceId
     *            The new value to set.
     */
    public void setAmazonReferenceId(String amazonReferenceId) {
        this.amazonReferenceId = amazonReferenceId;
    }

    /**
     * Check to see if AmazonReferenceId is set.
     *
     * @return true if AmazonReferenceId is set.
     */
    public boolean isSetAmazonReferenceId() {
        return amazonReferenceId != null;
    }

    /**
     * Set the value of AmazonReferenceId, return this.
     *
     * @param amazonReferenceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withAmazonReferenceId(String amazonReferenceId) {
        this.amazonReferenceId = amazonReferenceId;
        return this;
    }

    /**
     * Check the value of IsBillOfLadingAvailable.
     *
     * @return true if IsBillOfLadingAvailable is set to true.
     */
    public boolean isIsBillOfLadingAvailable() {
        return isBillOfLadingAvailable;
    }

    /**
     * Get the value of IsBillOfLadingAvailable.
     *
     * @return The value of IsBillOfLadingAvailable.
     */
    public boolean getIsBillOfLadingAvailable() {
        return isBillOfLadingAvailable;
    }

    /**
     * Set the value of IsBillOfLadingAvailable.
     *
     * @param isBillOfLadingAvailable
     *            The new value to set.
     */
    public void setIsBillOfLadingAvailable(boolean isBillOfLadingAvailable) {
        this.isBillOfLadingAvailable = isBillOfLadingAvailable;
    }

    /**
     * Set the value of IsBillOfLadingAvailable, return this.
     *
     * @param isBillOfLadingAvailable
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataOutput withIsBillOfLadingAvailable(boolean isBillOfLadingAvailable) {
        this.isBillOfLadingAvailable = isBillOfLadingAvailable;
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
    public PartneredLtlDataOutput withPartneredEstimate(PartneredEstimate partneredEstimate) {
        this.partneredEstimate = partneredEstimate;
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
    public PartneredLtlDataOutput withCarrierName(String carrierName) {
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
        contact = r.read("Contact", Contact.class);
        boxCount = r.read("BoxCount", long.class);
        sellerFreightClass = r.read("SellerFreightClass", String.class);
        freightReadyDate = r.read("FreightReadyDate", String.class);
        palletList = r.read("PalletList", PalletList.class);
        totalWeight = r.read("TotalWeight", Weight.class);
        sellerDeclaredValue = r.read("SellerDeclaredValue", Amount.class);
        amazonCalculatedValue = r.read("AmazonCalculatedValue", Amount.class);
        previewPickupDate = r.read("PreviewPickupDate", String.class);
        previewDeliveryDate = r.read("PreviewDeliveryDate", String.class);
        previewFreightClass = r.read("PreviewFreightClass", String.class);
        amazonReferenceId = r.read("AmazonReferenceId", String.class);
        isBillOfLadingAvailable = r.read("IsBillOfLadingAvailable", boolean.class);
        partneredEstimate = r.read("PartneredEstimate", PartneredEstimate.class);
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
        w.write("Contact", contact);
        w.write("BoxCount", boxCount);
        w.write("SellerFreightClass", sellerFreightClass);
        w.write("FreightReadyDate", freightReadyDate);
        w.write("PalletList", palletList);
        w.write("TotalWeight", totalWeight);
        w.write("SellerDeclaredValue", sellerDeclaredValue);
        w.write("AmazonCalculatedValue", amazonCalculatedValue);
        w.write("PreviewPickupDate", previewPickupDate);
        w.write("PreviewDeliveryDate", previewDeliveryDate);
        w.write("PreviewFreightClass", previewFreightClass);
        w.write("AmazonReferenceId", amazonReferenceId);
        w.write("IsBillOfLadingAvailable", isBillOfLadingAvailable);
        w.write("PartneredEstimate", partneredEstimate);
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
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PartneredLtlDataOutput",this);
    }

    /** Value constructor. */
    public PartneredLtlDataOutput(Contact contact,long boxCount,String sellerFreightClass,String freightReadyDate,PalletList palletList,Weight totalWeight,Amount sellerDeclaredValue,Amount amazonCalculatedValue,String previewPickupDate,String previewDeliveryDate,String previewFreightClass,String amazonReferenceId,boolean isBillOfLadingAvailable,PartneredEstimate partneredEstimate,String carrierName) {
        this.contact = contact;
        this.boxCount = boxCount;
        this.sellerFreightClass = sellerFreightClass;
        this.freightReadyDate = freightReadyDate;
        this.palletList = palletList;
        this.totalWeight = totalWeight;
        this.sellerDeclaredValue = sellerDeclaredValue;
        this.amazonCalculatedValue = amazonCalculatedValue;
        this.previewPickupDate = previewPickupDate;
        this.previewDeliveryDate = previewDeliveryDate;
        this.previewFreightClass = previewFreightClass;
        this.amazonReferenceId = amazonReferenceId;
        this.isBillOfLadingAvailable = isBillOfLadingAvailable;
        this.partneredEstimate = partneredEstimate;
        this.carrierName = carrierName;
    }

    /** Value constructor. */
    public PartneredLtlDataOutput(Contact contact,long boxCount,String freightReadyDate,PalletList palletList,Weight totalWeight,String previewPickupDate,String previewDeliveryDate,String previewFreightClass,String amazonReferenceId,boolean isBillOfLadingAvailable) {
        this.contact = contact;
        this.boxCount = boxCount;
        this.freightReadyDate = freightReadyDate;
        this.palletList = palletList;
        this.totalWeight = totalWeight;
        this.previewPickupDate = previewPickupDate;
        this.previewDeliveryDate = previewDeliveryDate;
        this.previewFreightClass = previewFreightClass;
        this.amazonReferenceId = amazonReferenceId;
        this.isBillOfLadingAvailable = isBillOfLadingAvailable;
    }

    /** Default constructor. */
    public PartneredLtlDataOutput() {
        super();
    }

}

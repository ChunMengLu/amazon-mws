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
 * Partnered Ltl Data Input
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
 * PartneredLtlDataInput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PartneredLtlDataInput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Contact" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Contact" minOccurs="0"/&gt;
 *             &lt;element name="BoxCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *             &lt;element name="SellerFreightClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FreightReadyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PalletList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PalletList" minOccurs="0"/&gt;
 *             &lt;element name="TotalWeight" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Weight" minOccurs="0"/&gt;
 *             &lt;element name="SellerDeclaredValue" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Amount" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PartneredLtlDataInput", propOrder={
    "contact",
    "boxCount",
    "sellerFreightClass",
    "freightReadyDate",
    "palletList",
    "totalWeight",
    "sellerDeclaredValue"
})
@XmlRootElement(name = "PartneredLtlDataInput")
public class PartneredLtlDataInput extends AbstractMwsObject {

    @XmlElement(name="Contact")
    private Contact contact;

    @XmlElement(name="BoxCount")
    private Long boxCount;

    @XmlElement(name="SellerFreightClass")
    private String sellerFreightClass;

    @XmlElement(name="FreightReadyDate")
    private String freightReadyDate;

    @XmlElement(name="PalletList")
    private PalletList palletList;

    @XmlElement(name="TotalWeight")
    private Weight totalWeight;

    @XmlElement(name="SellerDeclaredValue")
    private Amount sellerDeclaredValue;

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
    public PartneredLtlDataInput withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Get the value of BoxCount.
     *
     * @return The value of BoxCount.
     */
    public Long getBoxCount() {
        return boxCount;
    }

    /**
     * Set the value of BoxCount.
     *
     * @param boxCount
     *            The new value to set.
     */
    public void setBoxCount(Long boxCount) {
        this.boxCount = boxCount;
    }

    /**
     * Check to see if BoxCount is set.
     *
     * @return true if BoxCount is set.
     */
    public boolean isSetBoxCount() {
        return boxCount != null;
    }

    /**
     * Set the value of BoxCount, return this.
     *
     * @param boxCount
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredLtlDataInput withBoxCount(Long boxCount) {
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
    public PartneredLtlDataInput withSellerFreightClass(String sellerFreightClass) {
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
    public PartneredLtlDataInput withFreightReadyDate(String freightReadyDate) {
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
    public PartneredLtlDataInput withPalletList(PalletList palletList) {
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
    public PartneredLtlDataInput withTotalWeight(Weight totalWeight) {
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
    public PartneredLtlDataInput withSellerDeclaredValue(Amount sellerDeclaredValue) {
        this.sellerDeclaredValue = sellerDeclaredValue;
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
        boxCount = r.read("BoxCount", Long.class);
        sellerFreightClass = r.read("SellerFreightClass", String.class);
        freightReadyDate = r.read("FreightReadyDate", String.class);
        palletList = r.read("PalletList", PalletList.class);
        totalWeight = r.read("TotalWeight", Weight.class);
        sellerDeclaredValue = r.read("SellerDeclaredValue", Amount.class);
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
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PartneredLtlDataInput",this);
    }


    /** Value constructor. */
    public PartneredLtlDataInput(Contact contact,Long boxCount,String sellerFreightClass,String freightReadyDate,PalletList palletList,Weight totalWeight,Amount sellerDeclaredValue) {
        this.contact = contact;
        this.boxCount = boxCount;
        this.sellerFreightClass = sellerFreightClass;
        this.freightReadyDate = freightReadyDate;
        this.palletList = palletList;
        this.totalWeight = totalWeight;
        this.sellerDeclaredValue = sellerDeclaredValue;
    }

    /** Default constructor. */
    public PartneredLtlDataInput() {
        super();
    }

}

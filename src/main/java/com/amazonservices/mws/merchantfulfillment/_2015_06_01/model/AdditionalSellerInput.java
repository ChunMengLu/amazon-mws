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
 * Additional Seller Input
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * AdditionalSellerInput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AdditionalSellerInput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsBoolean" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsInteger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsAddress" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Address" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsWeight" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Weight" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsDimension" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Length" minOccurs="0"/&gt;
 *             &lt;element name="ValueAsCurrency" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}CurrencyAmount" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AdditionalSellerInput extends AbstractMwsObject {

    private String dataType;

    private String valueAsString;

    private Boolean valueAsBoolean;

    private Integer valueAsInteger;

    private XMLGregorianCalendar valueAsTimestamp;

    private Address valueAsAddress;

    private Weight valueAsWeight;

    private Length valueAsDimension;

    private CurrencyAmount valueAsCurrency;

    /**
     * Get the value of DataType.
     *
     * @return The value of DataType.
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Set the value of DataType.
     *
     * @param dataType
     *            The new value to set.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Check to see if DataType is set.
     *
     * @return true if DataType is set.
     */
    public boolean isSetDataType() {
        return dataType != null;
    }

    /**
     * Set the value of DataType, return this.
     *
     * @param dataType
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the value of ValueAsString.
     *
     * @return The value of ValueAsString.
     */
    public String getValueAsString() {
        return valueAsString;
    }

    /**
     * Set the value of ValueAsString.
     *
     * @param valueAsString
     *            The new value to set.
     */
    public void setValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
    }

    /**
     * Check to see if ValueAsString is set.
     *
     * @return true if ValueAsString is set.
     */
    public boolean isSetValueAsString() {
        return valueAsString != null;
    }

    /**
     * Set the value of ValueAsString, return this.
     *
     * @param valueAsString
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
        return this;
    }

    /**
     * Check the value of ValueAsBoolean.
     *
     * @return true if ValueAsBoolean is set to true.
     */
    public boolean isValueAsBoolean() {
        return valueAsBoolean!=null && valueAsBoolean.booleanValue();
    }

    /**
     * Get the value of ValueAsBoolean.
     *
     * @return The value of ValueAsBoolean.
     */
    public Boolean getValueAsBoolean() {
        return valueAsBoolean;
    }

    /**
     * Set the value of ValueAsBoolean.
     *
     * @param valueAsBoolean
     *            The new value to set.
     */
    public void setValueAsBoolean(Boolean valueAsBoolean) {
        this.valueAsBoolean = valueAsBoolean;
    }

    /**
     * Check to see if ValueAsBoolean is set.
     *
     * @return true if ValueAsBoolean is set.
     */
    public boolean isSetValueAsBoolean() {
        return valueAsBoolean != null;
    }

    /**
     * Set the value of ValueAsBoolean, return this.
     *
     * @param valueAsBoolean
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsBoolean(Boolean valueAsBoolean) {
        this.valueAsBoolean = valueAsBoolean;
        return this;
    }

    /**
     * Get the value of ValueAsInteger.
     *
     * @return The value of ValueAsInteger.
     */
    public Integer getValueAsInteger() {
        return valueAsInteger;
    }

    /**
     * Set the value of ValueAsInteger.
     *
     * @param valueAsInteger
     *            The new value to set.
     */
    public void setValueAsInteger(Integer valueAsInteger) {
        this.valueAsInteger = valueAsInteger;
    }

    /**
     * Check to see if ValueAsInteger is set.
     *
     * @return true if ValueAsInteger is set.
     */
    public boolean isSetValueAsInteger() {
        return valueAsInteger != null;
    }

    /**
     * Set the value of ValueAsInteger, return this.
     *
     * @param valueAsInteger
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsInteger(Integer valueAsInteger) {
        this.valueAsInteger = valueAsInteger;
        return this;
    }

    /**
     * Get the value of ValueAsTimestamp.
     *
     * @return The value of ValueAsTimestamp.
     */
    public XMLGregorianCalendar getValueAsTimestamp() {
        return valueAsTimestamp;
    }

    /**
     * Set the value of ValueAsTimestamp.
     *
     * @param valueAsTimestamp
     *            The new value to set.
     */
    public void setValueAsTimestamp(XMLGregorianCalendar valueAsTimestamp) {
        this.valueAsTimestamp = valueAsTimestamp;
    }

    /**
     * Check to see if ValueAsTimestamp is set.
     *
     * @return true if ValueAsTimestamp is set.
     */
    public boolean isSetValueAsTimestamp() {
        return valueAsTimestamp != null;
    }

    /**
     * Set the value of ValueAsTimestamp, return this.
     *
     * @param valueAsTimestamp
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsTimestamp(XMLGregorianCalendar valueAsTimestamp) {
        this.valueAsTimestamp = valueAsTimestamp;
        return this;
    }

    /**
     * Get the value of ValueAsAddress.
     *
     * @return The value of ValueAsAddress.
     */
    public Address getValueAsAddress() {
        return valueAsAddress;
    }

    /**
     * Set the value of ValueAsAddress.
     *
     * @param valueAsAddress
     *            The new value to set.
     */
    public void setValueAsAddress(Address valueAsAddress) {
        this.valueAsAddress = valueAsAddress;
    }

    /**
     * Check to see if ValueAsAddress is set.
     *
     * @return true if ValueAsAddress is set.
     */
    public boolean isSetValueAsAddress() {
        return valueAsAddress != null;
    }

    /**
     * Set the value of ValueAsAddress, return this.
     *
     * @param valueAsAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsAddress(Address valueAsAddress) {
        this.valueAsAddress = valueAsAddress;
        return this;
    }

    /**
     * Get the value of ValueAsWeight.
     *
     * @return The value of ValueAsWeight.
     */
    public Weight getValueAsWeight() {
        return valueAsWeight;
    }

    /**
     * Set the value of ValueAsWeight.
     *
     * @param valueAsWeight
     *            The new value to set.
     */
    public void setValueAsWeight(Weight valueAsWeight) {
        this.valueAsWeight = valueAsWeight;
    }

    /**
     * Check to see if ValueAsWeight is set.
     *
     * @return true if ValueAsWeight is set.
     */
    public boolean isSetValueAsWeight() {
        return valueAsWeight != null;
    }

    /**
     * Set the value of ValueAsWeight, return this.
     *
     * @param valueAsWeight
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsWeight(Weight valueAsWeight) {
        this.valueAsWeight = valueAsWeight;
        return this;
    }

    /**
     * Get the value of ValueAsDimension.
     *
     * @return The value of ValueAsDimension.
     */
    public Length getValueAsDimension() {
        return valueAsDimension;
    }

    /**
     * Set the value of ValueAsDimension.
     *
     * @param valueAsDimension
     *            The new value to set.
     */
    public void setValueAsDimension(Length valueAsDimension) {
        this.valueAsDimension = valueAsDimension;
    }

    /**
     * Check to see if ValueAsDimension is set.
     *
     * @return true if ValueAsDimension is set.
     */
    public boolean isSetValueAsDimension() {
        return valueAsDimension != null;
    }

    /**
     * Set the value of ValueAsDimension, return this.
     *
     * @param valueAsDimension
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsDimension(Length valueAsDimension) {
        this.valueAsDimension = valueAsDimension;
        return this;
    }

    /**
     * Get the value of ValueAsCurrency.
     *
     * @return The value of ValueAsCurrency.
     */
    public CurrencyAmount getValueAsCurrency() {
        return valueAsCurrency;
    }

    /**
     * Set the value of ValueAsCurrency.
     *
     * @param valueAsCurrency
     *            The new value to set.
     */
    public void setValueAsCurrency(CurrencyAmount valueAsCurrency) {
        this.valueAsCurrency = valueAsCurrency;
    }

    /**
     * Check to see if ValueAsCurrency is set.
     *
     * @return true if ValueAsCurrency is set.
     */
    public boolean isSetValueAsCurrency() {
        return valueAsCurrency != null;
    }

    /**
     * Set the value of ValueAsCurrency, return this.
     *
     * @param valueAsCurrency
     *             The new value to set.
     *
     * @return This instance.
     */
    public AdditionalSellerInput withValueAsCurrency(CurrencyAmount valueAsCurrency) {
        this.valueAsCurrency = valueAsCurrency;
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
        dataType = r.read("DataType", String.class);
        valueAsString = r.read("ValueAsString", String.class);
        valueAsBoolean = r.read("ValueAsBoolean", Boolean.class);
        valueAsInteger = r.read("ValueAsInteger", Integer.class);
        valueAsTimestamp = r.read("ValueAsTimestamp", XMLGregorianCalendar.class);
        valueAsAddress = r.read("ValueAsAddress", Address.class);
        valueAsWeight = r.read("ValueAsWeight", Weight.class);
        valueAsDimension = r.read("ValueAsDimension", Length.class);
        valueAsCurrency = r.read("ValueAsCurrency", CurrencyAmount.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DataType", dataType);
        w.write("ValueAsString", valueAsString);
        w.write("ValueAsBoolean", valueAsBoolean);
        w.write("ValueAsInteger", valueAsInteger);
        w.write("ValueAsTimestamp", valueAsTimestamp);
        w.write("ValueAsAddress", valueAsAddress);
        w.write("ValueAsWeight", valueAsWeight);
        w.write("ValueAsDimension", valueAsDimension);
        w.write("ValueAsCurrency", valueAsCurrency);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "AdditionalSellerInput",this);
    }


    /** Default constructor. */
    public AdditionalSellerInput() {
        super();
    }

}

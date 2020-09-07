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
 * Seller Input Definition
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * SellerInputDefinition complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SellerInputDefinition"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Constraints" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Constraint" maxOccurs="unbounded"/&gt;
 *             &lt;element name="InputDisplayText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="InputTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="StoredValue" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AdditionalSellerInput"/&gt;
 *             &lt;element name="RestrictedSetValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SellerInputDefinition extends AbstractMwsObject {

    private boolean isRequired;

    private String dataType;

    private List<Constraint> constraints;

    private String inputDisplayText;

    private String inputTarget;

    private AdditionalSellerInput storedValue;

    private List<String> restrictedSetValues;

    /**
     * Check the value of IsRequired.
     *
     * @return true if IsRequired is set to true.
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Get the value of IsRequired.
     *
     * @return The value of IsRequired.
     */
    public boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Set the value of IsRequired.
     *
     * @param isRequired
     *            The new value to set.
     */
    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * Set the value of IsRequired, return this.
     *
     * @param isRequired
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerInputDefinition withIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

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
    public SellerInputDefinition withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the value of Constraints.
     *
     * @return The value of Constraints.
     */
    public List<Constraint> getConstraints() {
        if (constraints==null) {
            constraints = new ArrayList<Constraint>();
        }
        return constraints;
    }

    /**
     * Set the value of Constraints.
     *
     * @param constraints
     *            The new value to set.
     */
    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }

    /**
     * Clear Constraints.
     */
    public void unsetConstraints() {
        this.constraints = null;
    }

    /**
     * Check to see if Constraints is set.
     *
     * @return true if Constraints is set.
     */
    public boolean isSetConstraints() {
        return constraints != null && !constraints.isEmpty();
    }

    /**
     * Add values for Constraints, return this.
     *
     * @param constraints
     *             New values to add.
     *
     * @return This instance.
     */
    public SellerInputDefinition withConstraints(Constraint... values) {
        List<Constraint> list = getConstraints();
        for (Constraint value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of InputDisplayText.
     *
     * @return The value of InputDisplayText.
     */
    public String getInputDisplayText() {
        return inputDisplayText;
    }

    /**
     * Set the value of InputDisplayText.
     *
     * @param inputDisplayText
     *            The new value to set.
     */
    public void setInputDisplayText(String inputDisplayText) {
        this.inputDisplayText = inputDisplayText;
    }

    /**
     * Check to see if InputDisplayText is set.
     *
     * @return true if InputDisplayText is set.
     */
    public boolean isSetInputDisplayText() {
        return inputDisplayText != null;
    }

    /**
     * Set the value of InputDisplayText, return this.
     *
     * @param inputDisplayText
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerInputDefinition withInputDisplayText(String inputDisplayText) {
        this.inputDisplayText = inputDisplayText;
        return this;
    }

    /**
     * Get the value of InputTarget.
     *
     * @return The value of InputTarget.
     */
    public String getInputTarget() {
        return inputTarget;
    }

    /**
     * Set the value of InputTarget.
     *
     * @param inputTarget
     *            The new value to set.
     */
    public void setInputTarget(String inputTarget) {
        this.inputTarget = inputTarget;
    }

    /**
     * Check to see if InputTarget is set.
     *
     * @return true if InputTarget is set.
     */
    public boolean isSetInputTarget() {
        return inputTarget != null;
    }

    /**
     * Set the value of InputTarget, return this.
     *
     * @param inputTarget
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerInputDefinition withInputTarget(String inputTarget) {
        this.inputTarget = inputTarget;
        return this;
    }

    /**
     * Get the value of StoredValue.
     *
     * @return The value of StoredValue.
     */
    public AdditionalSellerInput getStoredValue() {
        return storedValue;
    }

    /**
     * Set the value of StoredValue.
     *
     * @param storedValue
     *            The new value to set.
     */
    public void setStoredValue(AdditionalSellerInput storedValue) {
        this.storedValue = storedValue;
    }

    /**
     * Check to see if StoredValue is set.
     *
     * @return true if StoredValue is set.
     */
    public boolean isSetStoredValue() {
        return storedValue != null;
    }

    /**
     * Set the value of StoredValue, return this.
     *
     * @param storedValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerInputDefinition withStoredValue(AdditionalSellerInput storedValue) {
        this.storedValue = storedValue;
        return this;
    }

    /**
     * Get the value of RestrictedSetValues.
     *
     * @return The value of RestrictedSetValues.
     */
    public List<String> getRestrictedSetValues() {
        if (restrictedSetValues==null) {
            restrictedSetValues = new ArrayList<String>();
        }
        return restrictedSetValues;
    }

    /**
     * Set the value of RestrictedSetValues.
     *
     * @param restrictedSetValues
     *            The new value to set.
     */
    public void setRestrictedSetValues(List<String> restrictedSetValues) {
        this.restrictedSetValues = restrictedSetValues;
    }

    /**
     * Clear RestrictedSetValues.
     */
    public void unsetRestrictedSetValues() {
        this.restrictedSetValues = null;
    }

    /**
     * Check to see if RestrictedSetValues is set.
     *
     * @return true if RestrictedSetValues is set.
     */
    public boolean isSetRestrictedSetValues() {
        return restrictedSetValues != null && !restrictedSetValues.isEmpty();
    }

    /**
     * Add values for RestrictedSetValues, return this.
     *
     * @param restrictedSetValues
     *             New values to add.
     *
     * @return This instance.
     */
    public SellerInputDefinition withRestrictedSetValues(String... values) {
        List<String> list = getRestrictedSetValues();
        for (String value : values) {
            list.add(value);
        }
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
        isRequired = r.read("IsRequired", boolean.class);
        dataType = r.read("DataType", String.class);
        constraints = r.readList("Constraints", "member", Constraint.class);
        inputDisplayText = r.read("InputDisplayText", String.class);
        inputTarget = r.read("InputTarget", String.class);
        storedValue = r.read("StoredValue", AdditionalSellerInput.class);
        restrictedSetValues = r.readList("RestrictedSetValues", "member", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("IsRequired", isRequired);
        w.write("DataType", dataType);
        w.writeList("Constraints", "member", constraints);
        w.write("InputDisplayText", inputDisplayText);
        w.write("InputTarget", inputTarget);
        w.write("StoredValue", storedValue);
        w.writeList("RestrictedSetValues", "member", restrictedSetValues);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "SellerInputDefinition",this);
    }

    /** Value constructor. */
    public SellerInputDefinition(boolean isRequired,String dataType,List<Constraint> constraints,String inputDisplayText,AdditionalSellerInput storedValue) {
        this.isRequired = isRequired;
        this.dataType = dataType;
        this.constraints = constraints;
        this.inputDisplayText = inputDisplayText;
        this.storedValue = storedValue;
    }

    /** Default constructor. */
    public SellerInputDefinition() {
        super();
    }

}

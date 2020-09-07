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
 * Reason Code Details
 * API Version: 2010-10-01
 * Library Version: 2016-10-19
 * Generated: Wed Oct 19 08:37:51 PDT 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * ReasonCodeDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ReasonCodeDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ReturnReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="TranslatedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ReasonCodeDetails", propOrder={
    "returnReasonCode",
    "description",
    "translatedDescription"
})
@XmlRootElement(name = "ReasonCodeDetails")
public class ReasonCodeDetails extends AbstractMwsObject {

    @XmlElement(name="ReturnReasonCode",required=true)
    private String returnReasonCode;

    @XmlElement(name="Description",required=true)
    private String description;

    @XmlElement(name="TranslatedDescription")
    private String translatedDescription;

    /**
     * Get the value of ReturnReasonCode.
     *
     * @return The value of ReturnReasonCode.
     */
    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    /**
     * Set the value of ReturnReasonCode.
     *
     * @param returnReasonCode
     *            The new value to set.
     */
    public void setReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
    }

    /**
     * Check to see if ReturnReasonCode is set.
     *
     * @return true if ReturnReasonCode is set.
     */
    public boolean isSetReturnReasonCode() {
        return returnReasonCode != null;
    }

    /**
     * Set the value of ReturnReasonCode, return this.
     *
     * @param returnReasonCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReasonCodeDetails withReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
        return this;
    }

    /**
     * Get the value of Description.
     *
     * @return The value of Description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of Description.
     *
     * @param description
     *            The new value to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Check to see if Description is set.
     *
     * @return true if Description is set.
     */
    public boolean isSetDescription() {
        return description != null;
    }

    /**
     * Set the value of Description, return this.
     *
     * @param description
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReasonCodeDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the value of TranslatedDescription.
     *
     * @return The value of TranslatedDescription.
     */
    public String getTranslatedDescription() {
        return translatedDescription;
    }

    /**
     * Set the value of TranslatedDescription.
     *
     * @param translatedDescription
     *            The new value to set.
     */
    public void setTranslatedDescription(String translatedDescription) {
        this.translatedDescription = translatedDescription;
    }

    /**
     * Check to see if TranslatedDescription is set.
     *
     * @return true if TranslatedDescription is set.
     */
    public boolean isSetTranslatedDescription() {
        return translatedDescription != null;
    }

    /**
     * Set the value of TranslatedDescription, return this.
     *
     * @param translatedDescription
     *             The new value to set.
     *
     * @return This instance.
     */
    public ReasonCodeDetails withTranslatedDescription(String translatedDescription) {
        this.translatedDescription = translatedDescription;
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
        returnReasonCode = r.read("ReturnReasonCode", String.class);
        description = r.read("Description", String.class);
        translatedDescription = r.read("TranslatedDescription", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ReturnReasonCode", returnReasonCode);
        w.write("Description", description);
        w.write("TranslatedDescription", translatedDescription);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ReasonCodeDetails",this);
    }

    /** Value constructor. */
    public ReasonCodeDetails(String returnReasonCode,String description) {
        this.returnReasonCode = returnReasonCode;
        this.description = description;
    }

    /** Default constructor. */
    public ReasonCodeDetails() {
        super();
    }

}

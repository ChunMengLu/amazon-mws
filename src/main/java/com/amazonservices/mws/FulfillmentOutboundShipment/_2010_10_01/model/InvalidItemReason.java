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
 * Invalid Item Reason
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
 * InvalidItemReason complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InvalidItemReason"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="InvalidItemReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InvalidItemReason", propOrder={
    "invalidItemReasonCode",
    "description"
})
@XmlRootElement(name = "InvalidItemReason")
public class InvalidItemReason extends AbstractMwsObject {

    @XmlElement(name="InvalidItemReasonCode",required=true)
    private String invalidItemReasonCode;

    @XmlElement(name="Description",required=true)
    private String description;

    /**
     * Get the value of InvalidItemReasonCode.
     *
     * @return The value of InvalidItemReasonCode.
     */
    public String getInvalidItemReasonCode() {
        return invalidItemReasonCode;
    }

    /**
     * Set the value of InvalidItemReasonCode.
     *
     * @param invalidItemReasonCode
     *            The new value to set.
     */
    public void setInvalidItemReasonCode(String invalidItemReasonCode) {
        this.invalidItemReasonCode = invalidItemReasonCode;
    }

    /**
     * Check to see if InvalidItemReasonCode is set.
     *
     * @return true if InvalidItemReasonCode is set.
     */
    public boolean isSetInvalidItemReasonCode() {
        return invalidItemReasonCode != null;
    }

    /**
     * Set the value of InvalidItemReasonCode, return this.
     *
     * @param invalidItemReasonCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public InvalidItemReason withInvalidItemReasonCode(String invalidItemReasonCode) {
        this.invalidItemReasonCode = invalidItemReasonCode;
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
    public InvalidItemReason withDescription(String description) {
        this.description = description;
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
        invalidItemReasonCode = r.read("InvalidItemReasonCode", String.class);
        description = r.read("Description", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("InvalidItemReasonCode", invalidItemReasonCode);
        w.write("Description", description);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "InvalidItemReason",this);
    }

    /** Value constructor. */
    public InvalidItemReason(String invalidItemReasonCode,String description) {
        this.invalidItemReasonCode = invalidItemReasonCode;
        this.description = description;
    }

    /** Default constructor. */
    public InvalidItemReason() {
        super();
    }

}

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
 * Partnered Estimate
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
 * PartneredEstimate complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PartneredEstimate"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Amount" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}Amount"/&gt;
 *             &lt;element name="ConfirmDeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="VoidDeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PartneredEstimate", propOrder={
    "amount",
    "confirmDeadline",
    "voidDeadline"
})
@XmlRootElement(name = "PartneredEstimate")
public class PartneredEstimate extends AbstractMwsObject {

    @XmlElement(name="Amount",required=true)
    private Amount amount;

    @XmlElement(name="ConfirmDeadline")
    private String confirmDeadline;

    @XmlElement(name="VoidDeadline")
    private String voidDeadline;

    /**
     * Get the value of Amount.
     *
     * @return The value of Amount.
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Set the value of Amount.
     *
     * @param amount
     *            The new value to set.
     */
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /**
     * Check to see if Amount is set.
     *
     * @return true if Amount is set.
     */
    public boolean isSetAmount() {
        return amount != null;
    }

    /**
     * Set the value of Amount, return this.
     *
     * @param amount
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredEstimate withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the value of ConfirmDeadline.
     *
     * @return The value of ConfirmDeadline.
     */
    public String getConfirmDeadline() {
        return confirmDeadline;
    }

    /**
     * Set the value of ConfirmDeadline.
     *
     * @param confirmDeadline
     *            The new value to set.
     */
    public void setConfirmDeadline(String confirmDeadline) {
        this.confirmDeadline = confirmDeadline;
    }

    /**
     * Check to see if ConfirmDeadline is set.
     *
     * @return true if ConfirmDeadline is set.
     */
    public boolean isSetConfirmDeadline() {
        return confirmDeadline != null;
    }

    /**
     * Set the value of ConfirmDeadline, return this.
     *
     * @param confirmDeadline
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredEstimate withConfirmDeadline(String confirmDeadline) {
        this.confirmDeadline = confirmDeadline;
        return this;
    }

    /**
     * Get the value of VoidDeadline.
     *
     * @return The value of VoidDeadline.
     */
    public String getVoidDeadline() {
        return voidDeadline;
    }

    /**
     * Set the value of VoidDeadline.
     *
     * @param voidDeadline
     *            The new value to set.
     */
    public void setVoidDeadline(String voidDeadline) {
        this.voidDeadline = voidDeadline;
    }

    /**
     * Check to see if VoidDeadline is set.
     *
     * @return true if VoidDeadline is set.
     */
    public boolean isSetVoidDeadline() {
        return voidDeadline != null;
    }

    /**
     * Set the value of VoidDeadline, return this.
     *
     * @param voidDeadline
     *             The new value to set.
     *
     * @return This instance.
     */
    public PartneredEstimate withVoidDeadline(String voidDeadline) {
        this.voidDeadline = voidDeadline;
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
        amount = r.read("Amount", Amount.class);
        confirmDeadline = r.read("ConfirmDeadline", String.class);
        voidDeadline = r.read("VoidDeadline", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Amount", amount);
        w.write("ConfirmDeadline", confirmDeadline);
        w.write("VoidDeadline", voidDeadline);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PartneredEstimate",this);
    }

    /** Value constructor. */
    public PartneredEstimate(Amount amount,String confirmDeadline,String voidDeadline) {
        this.amount = amount;
        this.confirmDeadline = confirmDeadline;
        this.voidDeadline = voidDeadline;
    }

    /** Value constructor. */
    public PartneredEstimate(Amount amount) {
        this.amount = amount;
    }

    /** Default constructor. */
    public PartneredEstimate() {
        super();
    }

}

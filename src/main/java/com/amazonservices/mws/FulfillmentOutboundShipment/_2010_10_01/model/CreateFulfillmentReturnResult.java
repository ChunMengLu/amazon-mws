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
 * Create Fulfillment Return Result
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
 * CreateFulfillmentReturnResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateFulfillmentReturnResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ReturnItemList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ReturnItemList" minOccurs="0"/&gt;
 *             &lt;element name="InvalidReturnItemList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}InvalidReturnItemList" minOccurs="0"/&gt;
 *             &lt;element name="ReturnAuthorizationList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ReturnAuthorizationList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CreateFulfillmentReturnResult", propOrder={
    "returnItemList",
    "invalidReturnItemList",
    "returnAuthorizationList"
})
@XmlRootElement(name = "CreateFulfillmentReturnResult")
public class CreateFulfillmentReturnResult extends AbstractMwsObject {

    @XmlElement(name="ReturnItemList")
    private ReturnItemList returnItemList;

    @XmlElement(name="InvalidReturnItemList")
    private InvalidReturnItemList invalidReturnItemList;

    @XmlElement(name="ReturnAuthorizationList")
    private ReturnAuthorizationList returnAuthorizationList;

    /**
     * Get the value of ReturnItemList.
     *
     * @return The value of ReturnItemList.
     */
    public ReturnItemList getReturnItemList() {
        return returnItemList;
    }

    /**
     * Set the value of ReturnItemList.
     *
     * @param returnItemList
     *            The new value to set.
     */
    public void setReturnItemList(ReturnItemList returnItemList) {
        this.returnItemList = returnItemList;
    }

    /**
     * Check to see if ReturnItemList is set.
     *
     * @return true if ReturnItemList is set.
     */
    public boolean isSetReturnItemList() {
        return returnItemList != null;
    }

    /**
     * Set the value of ReturnItemList, return this.
     *
     * @param returnItemList
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentReturnResult withReturnItemList(ReturnItemList returnItemList) {
        this.returnItemList = returnItemList;
        return this;
    }

    /**
     * Get the value of InvalidReturnItemList.
     *
     * @return The value of InvalidReturnItemList.
     */
    public InvalidReturnItemList getInvalidReturnItemList() {
        return invalidReturnItemList;
    }

    /**
     * Set the value of InvalidReturnItemList.
     *
     * @param invalidReturnItemList
     *            The new value to set.
     */
    public void setInvalidReturnItemList(InvalidReturnItemList invalidReturnItemList) {
        this.invalidReturnItemList = invalidReturnItemList;
    }

    /**
     * Check to see if InvalidReturnItemList is set.
     *
     * @return true if InvalidReturnItemList is set.
     */
    public boolean isSetInvalidReturnItemList() {
        return invalidReturnItemList != null;
    }

    /**
     * Set the value of InvalidReturnItemList, return this.
     *
     * @param invalidReturnItemList
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentReturnResult withInvalidReturnItemList(InvalidReturnItemList invalidReturnItemList) {
        this.invalidReturnItemList = invalidReturnItemList;
        return this;
    }

    /**
     * Get the value of ReturnAuthorizationList.
     *
     * @return The value of ReturnAuthorizationList.
     */
    public ReturnAuthorizationList getReturnAuthorizationList() {
        return returnAuthorizationList;
    }

    /**
     * Set the value of ReturnAuthorizationList.
     *
     * @param returnAuthorizationList
     *            The new value to set.
     */
    public void setReturnAuthorizationList(ReturnAuthorizationList returnAuthorizationList) {
        this.returnAuthorizationList = returnAuthorizationList;
    }

    /**
     * Check to see if ReturnAuthorizationList is set.
     *
     * @return true if ReturnAuthorizationList is set.
     */
    public boolean isSetReturnAuthorizationList() {
        return returnAuthorizationList != null;
    }

    /**
     * Set the value of ReturnAuthorizationList, return this.
     *
     * @param returnAuthorizationList
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateFulfillmentReturnResult withReturnAuthorizationList(ReturnAuthorizationList returnAuthorizationList) {
        this.returnAuthorizationList = returnAuthorizationList;
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
        returnItemList = r.read("ReturnItemList", ReturnItemList.class);
        invalidReturnItemList = r.read("InvalidReturnItemList", InvalidReturnItemList.class);
        returnAuthorizationList = r.read("ReturnAuthorizationList", ReturnAuthorizationList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ReturnItemList", returnItemList);
        w.write("InvalidReturnItemList", invalidReturnItemList);
        w.write("ReturnAuthorizationList", returnAuthorizationList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "CreateFulfillmentReturnResult",this);
    }


    /** Default constructor. */
    public CreateFulfillmentReturnResult() {
        super();
    }

}

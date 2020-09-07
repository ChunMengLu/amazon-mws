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
 * Prep Details List
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * PrepDetailsList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PrepDetailsList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PrepDetails" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}PrepDetails" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PrepDetailsList", propOrder={
    "prepDetails"
})
@XmlRootElement(name = "PrepDetailsList")
public class PrepDetailsList extends AbstractMwsObject {

    @XmlElement(name="PrepDetails")
    private List<PrepDetails> prepDetails;

    /**
     * Get the value of PrepDetails.
     *
     * @return The value of PrepDetails.
     */
    public List<PrepDetails> getPrepDetails() {
        if (prepDetails==null) {
            prepDetails = new ArrayList<PrepDetails>();
        }
        return prepDetails;
    }

    /**
     * Set the value of PrepDetails.
     *
     * @param prepDetails
     *            The new value to set.
     */
    public void setPrepDetails(List<PrepDetails> prepDetails) {
        this.prepDetails = prepDetails;
    }

    /**
     * Clear PrepDetails.
     */
    public void unsetPrepDetails() {
        this.prepDetails = null;
    }

    /**
     * Check to see if PrepDetails is set.
     *
     * @return true if PrepDetails is set.
     */
    public boolean isSetPrepDetails() {
        return prepDetails != null && !prepDetails.isEmpty();
    }

    /**
     * Add values for PrepDetails, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public PrepDetailsList withPrepDetails(PrepDetails... values) {
        List<PrepDetails> list = getPrepDetails();
        for (PrepDetails value : values) {
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
        prepDetails = r.readList("PrepDetails", PrepDetails.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("PrepDetails", prepDetails);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PrepDetailsList",this);
    }


    /** Value constructor. */
    public PrepDetailsList(List<PrepDetails> prepDetails) {
        this.prepDetails = prepDetails;
    }

    /** Default constructor. */
    public PrepDetailsList() {
        super();
    }

}

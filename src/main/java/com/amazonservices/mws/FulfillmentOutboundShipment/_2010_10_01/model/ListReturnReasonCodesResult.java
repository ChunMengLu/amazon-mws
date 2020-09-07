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
 * List Return Reason Codes Result
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
 * ListReturnReasonCodesResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListReturnReasonCodesResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ReasonCodeDetailsList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ReasonCodeDetailsList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListReturnReasonCodesResult", propOrder={
    "reasonCodeDetailsList"
})
@XmlRootElement(name = "ListReturnReasonCodesResult")
public class ListReturnReasonCodesResult extends AbstractMwsObject {

    @XmlElement(name="ReasonCodeDetailsList")
    private ReasonCodeDetailsList reasonCodeDetailsList;

    /**
     * Get the value of ReasonCodeDetailsList.
     *
     * @return The value of ReasonCodeDetailsList.
     */
    public ReasonCodeDetailsList getReasonCodeDetailsList() {
        return reasonCodeDetailsList;
    }

    /**
     * Set the value of ReasonCodeDetailsList.
     *
     * @param reasonCodeDetailsList
     *            The new value to set.
     */
    public void setReasonCodeDetailsList(ReasonCodeDetailsList reasonCodeDetailsList) {
        this.reasonCodeDetailsList = reasonCodeDetailsList;
    }

    /**
     * Check to see if ReasonCodeDetailsList is set.
     *
     * @return true if ReasonCodeDetailsList is set.
     */
    public boolean isSetReasonCodeDetailsList() {
        return reasonCodeDetailsList != null;
    }

    /**
     * Set the value of ReasonCodeDetailsList, return this.
     *
     * @param reasonCodeDetailsList
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListReturnReasonCodesResult withReasonCodeDetailsList(ReasonCodeDetailsList reasonCodeDetailsList) {
        this.reasonCodeDetailsList = reasonCodeDetailsList;
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
        reasonCodeDetailsList = r.read("ReasonCodeDetailsList", ReasonCodeDetailsList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ReasonCodeDetailsList", reasonCodeDetailsList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ListReturnReasonCodesResult",this);
    }


    /** Default constructor. */
    public ListReturnReasonCodesResult() {
        super();
    }

}

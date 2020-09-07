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
 * Invalid SKU List
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
 * InvalidSKUList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InvalidSKUList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="InvalidSKU" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InvalidSKU" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InvalidSKUList", propOrder={
    "invalidSKU"
})
@XmlRootElement(name = "InvalidSKUList")
public class InvalidSKUList extends AbstractMwsObject {

    @XmlElement(name="InvalidSKU")
    private List<InvalidSKU> invalidSKU;

    /**
     * Get the value of InvalidSKU.
     *
     * @return The value of InvalidSKU.
     */
    public List<InvalidSKU> getInvalidSKU() {
        if (invalidSKU==null) {
            invalidSKU = new ArrayList<InvalidSKU>();
        }
        return invalidSKU;
    }

    /**
     * Set the value of InvalidSKU.
     *
     * @param invalidSKU
     *            The new value to set.
     */
    public void setInvalidSKU(List<InvalidSKU> invalidSKU) {
        this.invalidSKU = invalidSKU;
    }

    /**
     * Clear InvalidSKU.
     */
    public void unsetInvalidSKU() {
        this.invalidSKU = null;
    }

    /**
     * Check to see if InvalidSKU is set.
     *
     * @return true if InvalidSKU is set.
     */
    public boolean isSetInvalidSKU() {
        return invalidSKU != null && !invalidSKU.isEmpty();
    }

    /**
     * Add values for InvalidSKU, return this.
     *
     * @param invalidSKU
     *             New values to add.
     *
     * @return This instance.
     */
    public InvalidSKUList withInvalidSKU(InvalidSKU... values) {
        List<InvalidSKU> list = getInvalidSKU();
        for (InvalidSKU value : values) {
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
        invalidSKU = r.readList("InvalidSKU", InvalidSKU.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("InvalidSKU", invalidSKU);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InvalidSKUList",this);
    }


    /** Value constructor. */
    public InvalidSKUList(List<InvalidSKU> invalidSKU) {
        this.invalidSKU = invalidSKU;
    }

    /** Default constructor. */
    public InvalidSKUList() {
        super();
    }

}

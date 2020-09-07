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
 * Invalid ASIN List
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
 * InvalidASINList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InvalidASINList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="InvalidASIN" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}InvalidASIN" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InvalidASINList", propOrder={
    "invalidASIN"
})
@XmlRootElement(name = "InvalidASINList")
public class InvalidASINList extends AbstractMwsObject {

    @XmlElement(name="InvalidASIN")
    private List<InvalidASIN> invalidASIN;

    /**
     * Get the value of InvalidASIN.
     *
     * @return The value of InvalidASIN.
     */
    public List<InvalidASIN> getInvalidASIN() {
        if (invalidASIN==null) {
            invalidASIN = new ArrayList<InvalidASIN>();
        }
        return invalidASIN;
    }

    /**
     * Set the value of InvalidASIN.
     *
     * @param invalidASIN
     *            The new value to set.
     */
    public void setInvalidASIN(List<InvalidASIN> invalidASIN) {
        this.invalidASIN = invalidASIN;
    }

    /**
     * Clear InvalidASIN.
     */
    public void unsetInvalidASIN() {
        this.invalidASIN = null;
    }

    /**
     * Check to see if InvalidASIN is set.
     *
     * @return true if InvalidASIN is set.
     */
    public boolean isSetInvalidASIN() {
        return invalidASIN != null && !invalidASIN.isEmpty();
    }

    /**
     * Add values for InvalidASIN, return this.
     *
     * @param invalidASIN
     *             New values to add.
     *
     * @return This instance.
     */
    public InvalidASINList withInvalidASIN(InvalidASIN... values) {
        List<InvalidASIN> list = getInvalidASIN();
        for (InvalidASIN value : values) {
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
        invalidASIN = r.readList("InvalidASIN", InvalidASIN.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("InvalidASIN", invalidASIN);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "InvalidASINList",this);
    }


    /** Value constructor. */
    public InvalidASINList(List<InvalidASIN> invalidASIN) {
        this.invalidASIN = invalidASIN;
    }

    /** Default constructor. */
    public InvalidASINList() {
        super();
    }

}

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
 * Prep Instruction List
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
 * PrepInstructionList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PrepInstructionList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PrepInstruction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PrepInstructionList", propOrder={
    "prepInstruction"
})
@XmlRootElement(name = "PrepInstructionList")
public class PrepInstructionList extends AbstractMwsObject {

    @XmlElement(name="PrepInstruction")
    private List<String> prepInstruction;

    /**
     * Get the value of PrepInstruction.
     *
     * @return The value of PrepInstruction.
     */
    public List<String> getPrepInstruction() {
        if (prepInstruction==null) {
            prepInstruction = new ArrayList<String>();
        }
        return prepInstruction;
    }

    /**
     * Set the value of PrepInstruction.
     *
     * @param prepInstruction
     *            The new value to set.
     */
    public void setPrepInstruction(List<String> prepInstruction) {
        this.prepInstruction = prepInstruction;
    }

    /**
     * Clear PrepInstruction.
     */
    public void unsetPrepInstruction() {
        this.prepInstruction = null;
    }

    /**
     * Check to see if PrepInstruction is set.
     *
     * @return true if PrepInstruction is set.
     */
    public boolean isSetPrepInstruction() {
        return prepInstruction != null && !prepInstruction.isEmpty();
    }

    /**
     * Add values for PrepInstruction, return this.
     *
     * @param prepInstruction
     *             New values to add.
     *
     * @return This instance.
     */
    public PrepInstructionList withPrepInstruction(String... values) {
        List<String> list = getPrepInstruction();
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
        prepInstruction = r.readList("PrepInstruction", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("PrepInstruction", prepInstruction);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "PrepInstructionList",this);
    }


    /** Value constructor. */
    public PrepInstructionList(List<String> prepInstruction) {
        this.prepInstruction = prepInstruction;
    }

    /** Default constructor. */
    public PrepInstructionList() {
        super();
    }

}

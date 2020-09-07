/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * List Registered Destinations Result
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * ListRegisteredDestinationsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListRegisteredDestinationsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DestinationList" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}DestinationList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListRegisteredDestinationsResult extends AbstractMwsObject {

    private DestinationList destinationList;

    /**
     * Get the value of DestinationList.
     *
     * @return The value of DestinationList.
     */
    public DestinationList getDestinationList() {
        return destinationList;
    }

    /**
     * Set the value of DestinationList.
     *
     * @param destinationList
     *            The new value to set.
     */
    public void setDestinationList(DestinationList destinationList) {
        this.destinationList = destinationList;
    }

    /**
     * Check to see if DestinationList is set.
     *
     * @return true if DestinationList is set.
     */
    public boolean isSetDestinationList() {
        return destinationList != null;
    }

    /**
     * Set the value of DestinationList, return this.
     *
     * @param destinationList
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListRegisteredDestinationsResult withDestinationList(DestinationList destinationList) {
        this.destinationList = destinationList;
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
        destinationList = r.read("DestinationList", DestinationList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DestinationList", destinationList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "ListRegisteredDestinationsResult",this);
    }

    /** Value constructor. */
    public ListRegisteredDestinationsResult(DestinationList destinationList) {
        this.destinationList = destinationList;
    }


    /** Default constructor. */
    public ListRegisteredDestinationsResult() {
        super();
    }

}

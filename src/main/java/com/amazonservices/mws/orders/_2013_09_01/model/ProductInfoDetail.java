/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Product Info Detail
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * ProductInfoDetail complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ProductInfoDetail"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ProductInfoDetail extends AbstractMwsObject {

    private Integer numberOfItems;

    /**
     * Get the value of NumberOfItems.
     *
     * @return The value of NumberOfItems.
     */
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Set the value of NumberOfItems.
     *
     * @param numberOfItems
     *            The new value to set.
     */
    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    /**
     * Check to see if NumberOfItems is set.
     *
     * @return true if NumberOfItems is set.
     */
    public boolean isSetNumberOfItems() {
        return numberOfItems != null;
    }

    /**
     * Set the value of NumberOfItems, return this.
     *
     * @param numberOfItems
     *             The new value to set.
     *
     * @return This instance.
     */
    public ProductInfoDetail withNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
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
        numberOfItems = r.read("NumberOfItems", Integer.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("NumberOfItems", numberOfItems);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "ProductInfoDetail",this);
    }


    /** Default constructor. */
    public ProductInfoDetail() {
        super();
    }

}

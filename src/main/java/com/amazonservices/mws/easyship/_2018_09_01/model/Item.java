/*******************************************************************************
 * Copyright 2009-2018 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Item
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * Item complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Item"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="OrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="OrderItemSerialNumberList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Item extends AbstractMwsObject {

    private String orderItemId;

    private List<String> orderItemSerialNumberList;

    /**
     * Get the value of OrderItemId.
     *
     * @return The value of OrderItemId.
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * Set the value of OrderItemId.
     *
     * @param orderItemId
     *            The new value to set.
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * Check to see if OrderItemId is set.
     *
     * @return true if OrderItemId is set.
     */
    public boolean isSetOrderItemId() {
        return orderItemId != null;
    }

    /**
     * Set the value of OrderItemId, return this.
     *
     * @param orderItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public Item withOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    /**
     * Get the value of OrderItemSerialNumberList.
     *
     * @return The value of OrderItemSerialNumberList.
     */
    public List<String> getOrderItemSerialNumberList() {
        if (orderItemSerialNumberList==null) {
            orderItemSerialNumberList = new ArrayList<String>();
        }
        return orderItemSerialNumberList;
    }

    /**
     * Set the value of OrderItemSerialNumberList.
     *
     * @param orderItemSerialNumberList
     *            The new value to set.
     */
    public void setOrderItemSerialNumberList(List<String> orderItemSerialNumberList) {
        this.orderItemSerialNumberList = orderItemSerialNumberList;
    }

    /**
     * Clear OrderItemSerialNumberList.
     */
    public void unsetOrderItemSerialNumberList() {
        this.orderItemSerialNumberList = null;
    }

    /**
     * Check to see if OrderItemSerialNumberList is set.
     *
     * @return true if OrderItemSerialNumberList is set.
     */
    public boolean isSetOrderItemSerialNumberList() {
        return orderItemSerialNumberList != null && !orderItemSerialNumberList.isEmpty();
    }

    /**
     * Add values for OrderItemSerialNumberList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public Item withOrderItemSerialNumberList(String... values) {
        List<String> list = getOrderItemSerialNumberList();
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
        orderItemId = r.read("OrderItemId", String.class);
        orderItemSerialNumberList = r.readList("OrderItemSerialNumberList", "member", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("OrderItemId", orderItemId);
        w.writeList("OrderItemSerialNumberList", "member", orderItemSerialNumberList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "Item",this);
    }

    /** Value constructor. */
    public Item(String orderItemId,List<String> orderItemSerialNumberList) {
        this.orderItemId = orderItemId;
        this.orderItemSerialNumberList = orderItemSerialNumberList;
    }

    /** Default constructor. */
    public Item() {
        super();
    }

}

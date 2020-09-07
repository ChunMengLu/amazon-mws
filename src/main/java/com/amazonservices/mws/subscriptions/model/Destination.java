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
 * Destination
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * Destination complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Destination"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DeliveryChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AttributeList" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}AttributeKeyValueList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Destination extends AbstractMwsObject {

    private String deliveryChannel;

    private AttributeKeyValueList attributeList;

    /**
     * Get the value of DeliveryChannel.
     *
     * @return The value of DeliveryChannel.
     */
    public String getDeliveryChannel() {
        return deliveryChannel;
    }

    /**
     * Set the value of DeliveryChannel.
     *
     * @param deliveryChannel
     *            The new value to set.
     */
    public void setDeliveryChannel(String deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }

    /**
     * Check to see if DeliveryChannel is set.
     *
     * @return true if DeliveryChannel is set.
     */
    public boolean isSetDeliveryChannel() {
        return deliveryChannel != null;
    }

    /**
     * Set the value of DeliveryChannel, return this.
     *
     * @param deliveryChannel
     *             The new value to set.
     *
     * @return This instance.
     */
    public Destination withDeliveryChannel(String deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
        return this;
    }

    /**
     * Get the value of AttributeList.
     *
     * @return The value of AttributeList.
     */
    public AttributeKeyValueList getAttributeList() {
        return attributeList;
    }

    /**
     * Set the value of AttributeList.
     *
     * @param attributeList
     *            The new value to set.
     */
    public void setAttributeList(AttributeKeyValueList attributeList) {
        this.attributeList = attributeList;
    }

    /**
     * Check to see if AttributeList is set.
     *
     * @return true if AttributeList is set.
     */
    public boolean isSetAttributeList() {
        return attributeList != null;
    }

    /**
     * Set the value of AttributeList, return this.
     *
     * @param attributeList
     *             The new value to set.
     *
     * @return This instance.
     */
    public Destination withAttributeList(AttributeKeyValueList attributeList) {
        this.attributeList = attributeList;
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
        deliveryChannel = r.read("DeliveryChannel", String.class);
        attributeList = r.read("AttributeList", AttributeKeyValueList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DeliveryChannel", deliveryChannel);
        w.write("AttributeList", attributeList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "Destination",this);
    }

    /** Value constructor. */
    public Destination(String deliveryChannel,AttributeKeyValueList attributeList) {
        this.deliveryChannel = deliveryChannel;
        this.attributeList = attributeList;
    }


    /** Default constructor. */
    public Destination() {
        super();
    }

}

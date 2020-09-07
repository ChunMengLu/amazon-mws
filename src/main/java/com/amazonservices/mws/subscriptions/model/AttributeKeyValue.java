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
 * Attribute Key Value
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * AttributeKeyValue complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AttributeKeyValue"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AttributeKeyValue extends AbstractMwsObject {

    private String key;

    private String value;

    /**
     * Get the value of Key.
     *
     * @return The value of Key.
     */
    public String getKey() {
        return key;
    }

    /**
     * Set the value of Key.
     *
     * @param key
     *            The new value to set.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Check to see if Key is set.
     *
     * @return true if Key is set.
     */
    public boolean isSetKey() {
        return key != null;
    }

    /**
     * Set the value of Key, return this.
     *
     * @param key
     *             The new value to set.
     *
     * @return This instance.
     */
    public AttributeKeyValue withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value of Value.
     *
     * @return The value of Value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Set the value of Value.
     *
     * @param value
     *            The new value to set.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Check to see if Value is set.
     *
     * @return true if Value is set.
     */
    public boolean isSetValue() {
        return value != null;
    }

    /**
     * Set the value of Value, return this.
     *
     * @param value
     *             The new value to set.
     *
     * @return This instance.
     */
    public AttributeKeyValue withValue(String value) {
        this.value = value;
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
        key = r.read("Key", String.class);
        value = r.read("Value", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Key", key);
        w.write("Value", value);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "AttributeKeyValue",this);
    }

    /** Value constructor. */
    public AttributeKeyValue(String key,String value) {
        this.key = key;
        this.value = value;
    }


    /** Default constructor. */
    public AttributeKeyValue() {
        super();
    }

}

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
 * Contact
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * Contact complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Contact"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Contact", propOrder={
    "name",
    "phone",
    "email",
    "fax"
})
@XmlRootElement(name = "Contact")
public class Contact extends AbstractMwsObject {

    @XmlElement(name="Name",required=true)
    private String name;

    @XmlElement(name="Phone",required=true)
    private String phone;

    @XmlElement(name="Email",required=true)
    private String email;

    @XmlElement(name="Fax")
    private String fax;

    /**
     * Get the value of Name.
     *
     * @return The value of Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of Name.
     *
     * @param name
     *            The new value to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Check to see if Name is set.
     *
     * @return true if Name is set.
     */
    public boolean isSetName() {
        return name != null;
    }

    /**
     * Set the value of Name, return this.
     *
     * @param name
     *             The new value to set.
     *
     * @return This instance.
     */
    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of Phone.
     *
     * @return The value of Phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the value of Phone.
     *
     * @param phone
     *            The new value to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Check to see if Phone is set.
     *
     * @return true if Phone is set.
     */
    public boolean isSetPhone() {
        return phone != null;
    }

    /**
     * Set the value of Phone, return this.
     *
     * @param phone
     *             The new value to set.
     *
     * @return This instance.
     */
    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get the value of Email.
     *
     * @return The value of Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of Email.
     *
     * @param email
     *            The new value to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Check to see if Email is set.
     *
     * @return true if Email is set.
     */
    public boolean isSetEmail() {
        return email != null;
    }

    /**
     * Set the value of Email, return this.
     *
     * @param email
     *             The new value to set.
     *
     * @return This instance.
     */
    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the value of Fax.
     *
     * @return The value of Fax.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Set the value of Fax.
     *
     * @param fax
     *            The new value to set.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Check to see if Fax is set.
     *
     * @return true if Fax is set.
     */
    public boolean isSetFax() {
        return fax != null;
    }

    /**
     * Set the value of Fax, return this.
     *
     * @param fax
     *             The new value to set.
     *
     * @return This instance.
     */
    public Contact withFax(String fax) {
        this.fax = fax;
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
        name = r.read("Name", String.class);
        phone = r.read("Phone", String.class);
        email = r.read("Email", String.class);
        fax = r.read("Fax", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Name", name);
        w.write("Phone", phone);
        w.write("Email", email);
        w.write("Fax", fax);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "Contact",this);
    }

    /** Value constructor. */
    public Contact(String name,String phone,String email,String fax) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.fax = fax;
    }

    /** Value constructor. */
    public Contact(String name,String phone,String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    /** Default constructor. */
    public Contact() {
        super();
    }

}

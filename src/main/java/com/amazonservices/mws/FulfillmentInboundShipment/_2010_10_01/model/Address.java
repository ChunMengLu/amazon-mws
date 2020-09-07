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
 * Address
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
 * Address complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Address"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DistrictOrCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Address", propOrder={
    "name",
    "addressLine1",
    "addressLine2",
    "districtOrCounty",
    "city",
    "stateOrProvinceCode",
    "countryCode",
    "postalCode"
})
@XmlRootElement(name = "Address")
public class Address extends AbstractMwsObject {

    @XmlElement(name="Name",required=true)
    private String name;

    @XmlElement(name="AddressLine1",required=true)
    private String addressLine1;

    @XmlElement(name="AddressLine2")
    private String addressLine2;

    @XmlElement(name="DistrictOrCounty")
    private String districtOrCounty;

    @XmlElement(name="City",required=true)
    private String city;

    @XmlElement(name="StateOrProvinceCode")
    private String stateOrProvinceCode;

    @XmlElement(name="CountryCode",required=true)
    private String countryCode;

    @XmlElement(name="PostalCode")
    private String postalCode;

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
    public Address withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of AddressLine1.
     *
     * @return The value of AddressLine1.
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Set the value of AddressLine1.
     *
     * @param addressLine1
     *            The new value to set.
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Check to see if AddressLine1 is set.
     *
     * @return true if AddressLine1 is set.
     */
    public boolean isSetAddressLine1() {
        return addressLine1 != null;
    }

    /**
     * Set the value of AddressLine1, return this.
     *
     * @param addressLine1
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get the value of AddressLine2.
     *
     * @return The value of AddressLine2.
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Set the value of AddressLine2.
     *
     * @param addressLine2
     *            The new value to set.
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Check to see if AddressLine2 is set.
     *
     * @return true if AddressLine2 is set.
     */
    public boolean isSetAddressLine2() {
        return addressLine2 != null;
    }

    /**
     * Set the value of AddressLine2, return this.
     *
     * @param addressLine2
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get the value of DistrictOrCounty.
     *
     * @return The value of DistrictOrCounty.
     */
    public String getDistrictOrCounty() {
        return districtOrCounty;
    }

    /**
     * Set the value of DistrictOrCounty.
     *
     * @param districtOrCounty
     *            The new value to set.
     */
    public void setDistrictOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
    }

    /**
     * Check to see if DistrictOrCounty is set.
     *
     * @return true if DistrictOrCounty is set.
     */
    public boolean isSetDistrictOrCounty() {
        return districtOrCounty != null;
    }

    /**
     * Set the value of DistrictOrCounty, return this.
     *
     * @param districtOrCounty
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withDistrictOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
        return this;
    }

    /**
     * Get the value of City.
     *
     * @return The value of City.
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the value of City.
     *
     * @param city
     *            The new value to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Check to see if City is set.
     *
     * @return true if City is set.
     */
    public boolean isSetCity() {
        return city != null;
    }

    /**
     * Set the value of City, return this.
     *
     * @param city
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the value of StateOrProvinceCode.
     *
     * @return The value of StateOrProvinceCode.
     */
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Set the value of StateOrProvinceCode.
     *
     * @param stateOrProvinceCode
     *            The new value to set.
     */
    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    /**
     * Check to see if StateOrProvinceCode is set.
     *
     * @return true if StateOrProvinceCode is set.
     */
    public boolean isSetStateOrProvinceCode() {
        return stateOrProvinceCode != null;
    }

    /**
     * Set the value of StateOrProvinceCode, return this.
     *
     * @param stateOrProvinceCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
        return this;
    }

    /**
     * Get the value of CountryCode.
     *
     * @return The value of CountryCode.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Set the value of CountryCode.
     *
     * @param countryCode
     *            The new value to set.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Check to see if CountryCode is set.
     *
     * @return true if CountryCode is set.
     */
    public boolean isSetCountryCode() {
        return countryCode != null;
    }

    /**
     * Set the value of CountryCode, return this.
     *
     * @param countryCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the value of PostalCode.
     *
     * @return The value of PostalCode.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Set the value of PostalCode.
     *
     * @param postalCode
     *            The new value to set.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Check to see if PostalCode is set.
     *
     * @return true if PostalCode is set.
     */
    public boolean isSetPostalCode() {
        return postalCode != null;
    }

    /**
     * Set the value of PostalCode, return this.
     *
     * @param postalCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
        addressLine1 = r.read("AddressLine1", String.class);
        addressLine2 = r.read("AddressLine2", String.class);
        districtOrCounty = r.read("DistrictOrCounty", String.class);
        city = r.read("City", String.class);
        stateOrProvinceCode = r.read("StateOrProvinceCode", String.class);
        countryCode = r.read("CountryCode", String.class);
        postalCode = r.read("PostalCode", String.class);
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
        w.write("AddressLine1", addressLine1);
        w.write("AddressLine2", addressLine2);
        w.write("DistrictOrCounty", districtOrCounty);
        w.write("City", city);
        w.write("StateOrProvinceCode", stateOrProvinceCode);
        w.write("CountryCode", countryCode);
        w.write("PostalCode", postalCode);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "Address",this);
    }

    /** Value constructor. */
    public Address(String name,String addressLine1,String addressLine2,String districtOrCounty,String city,String stateOrProvinceCode,String countryCode,String postalCode) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.districtOrCounty = districtOrCounty;
        this.city = city;
        this.stateOrProvinceCode = stateOrProvinceCode;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
    }

    /** Value constructor. */
    public Address(String name,String addressLine1,String city,String countryCode) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.countryCode = countryCode;
    }

    /** Default constructor. */
    public Address() {
        super();
    }

}

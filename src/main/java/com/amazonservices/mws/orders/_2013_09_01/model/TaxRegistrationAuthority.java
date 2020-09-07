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
 * Tax Registration Authority
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * TaxRegistrationAuthority complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TaxRegistrationAuthority"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="warehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class TaxRegistrationAuthority extends AbstractMwsObject {

    private String country;

    private String state;

    private String district;

    private String province;

    private String city;

    private String warehouseId;

    /**
     * Get the value of country.
     *
     * @return The value of country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the value of country.
     *
     * @param country
     *            The new value to set.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Check to see if country is set.
     *
     * @return true if country is set.
     */
    public boolean isSetCountry() {
        return country != null;
    }

    /**
     * Set the value of country, return this.
     *
     * @param country
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationAuthority withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the value of state.
     *
     * @return The value of state.
     */
    public String getState() {
        return state;
    }

    /**
     * Set the value of state.
     *
     * @param state
     *            The new value to set.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Check to see if state is set.
     *
     * @return true if state is set.
     */
    public boolean isSetState() {
        return state != null;
    }

    /**
     * Set the value of state, return this.
     *
     * @param state
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationAuthority withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the value of district.
     *
     * @return The value of district.
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Set the value of district.
     *
     * @param district
     *            The new value to set.
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Check to see if district is set.
     *
     * @return true if district is set.
     */
    public boolean isSetDistrict() {
        return district != null;
    }

    /**
     * Set the value of district, return this.
     *
     * @param district
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationAuthority withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * Get the value of province.
     *
     * @return The value of province.
     */
    public String getProvince() {
        return province;
    }

    /**
     * Set the value of province.
     *
     * @param province
     *            The new value to set.
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Check to see if province is set.
     *
     * @return true if province is set.
     */
    public boolean isSetProvince() {
        return province != null;
    }

    /**
     * Set the value of province, return this.
     *
     * @param province
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationAuthority withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * Get the value of city.
     *
     * @return The value of city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the value of city.
     *
     * @param city
     *            The new value to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Check to see if city is set.
     *
     * @return true if city is set.
     */
    public boolean isSetCity() {
        return city != null;
    }

    /**
     * Set the value of city, return this.
     *
     * @param city
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationAuthority withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the value of warehouseId.
     *
     * @return The value of warehouseId.
     */
    public String getWarehouseId() {
        return warehouseId;
    }

    /**
     * Set the value of warehouseId.
     *
     * @param warehouseId
     *            The new value to set.
     */
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * Check to see if warehouseId is set.
     *
     * @return true if warehouseId is set.
     */
    public boolean isSetWarehouseId() {
        return warehouseId != null;
    }

    /**
     * Set the value of warehouseId, return this.
     *
     * @param warehouseId
     *             The new value to set.
     *
     * @return This instance.
     */
    public TaxRegistrationAuthority withWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
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
        country = r.read("country", String.class);
        state = r.read("state", String.class);
        district = r.read("district", String.class);
        province = r.read("province", String.class);
        city = r.read("city", String.class);
        warehouseId = r.read("warehouseId", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("country", country);
        w.write("state", state);
        w.write("district", district);
        w.write("province", province);
        w.write("city", city);
        w.write("warehouseId", warehouseId);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "TaxRegistrationAuthority",this);
    }


    /** Default constructor. */
    public TaxRegistrationAuthority() {
        super();
    }

}

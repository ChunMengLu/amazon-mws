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
 * Get Prep Instructions For ASIN Request
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
 * GetPrepInstructionsForASINRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPrepInstructionsForASINRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AsinList" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}AsinList"/&gt;
 *             &lt;element name="ShipToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPrepInstructionsForASINRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "asinList",
    "shipToCountryCode"
})
@XmlRootElement(name = "GetPrepInstructionsForASINRequest")
public class GetPrepInstructionsForASINRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="AsinList",required=true)
    private AsinList asinList;

    @XmlElement(name="ShipToCountryCode",required=true)
    private String shipToCountryCode;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForASINRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForASINRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of AsinList.
     *
     * @return The value of AsinList.
     */
    public AsinList getAsinList() {
        return asinList;
    }

    /**
     * Set the value of AsinList.
     *
     * @param asinList
     *            The new value to set.
     */
    public void setAsinList(AsinList asinList) {
        this.asinList = asinList;
    }

    /**
     * Check to see if AsinList is set.
     *
     * @return true if AsinList is set.
     */
    public boolean isSetAsinList() {
        return asinList != null;
    }

    /**
     * Set the value of AsinList, return this.
     *
     * @param asinList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForASINRequest withAsinList(AsinList asinList) {
        this.asinList = asinList;
        return this;
    }

    /**
     * Get the value of ShipToCountryCode.
     *
     * @return The value of ShipToCountryCode.
     */
    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    /**
     * Set the value of ShipToCountryCode.
     *
     * @param shipToCountryCode
     *            The new value to set.
     */
    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    /**
     * Check to see if ShipToCountryCode is set.
     *
     * @return true if ShipToCountryCode is set.
     */
    public boolean isSetShipToCountryCode() {
        return shipToCountryCode != null;
    }

    /**
     * Set the value of ShipToCountryCode, return this.
     *
     * @param shipToCountryCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPrepInstructionsForASINRequest withShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        asinList = r.read("AsinList", AsinList.class);
        shipToCountryCode = r.read("ShipToCountryCode", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("AsinList", asinList);
        w.write("ShipToCountryCode", shipToCountryCode);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPrepInstructionsForASINRequest",this);
    }

    /** Value constructor. */
    public GetPrepInstructionsForASINRequest(String sellerId,String mwsAuthToken,AsinList asinList,String shipToCountryCode) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.asinList = asinList;
        this.shipToCountryCode = shipToCountryCode;
    }

    /** Value constructor. */
    public GetPrepInstructionsForASINRequest(String sellerId,AsinList asinList,String shipToCountryCode) {
        this.sellerId = sellerId;
        this.asinList = asinList;
        this.shipToCountryCode = shipToCountryCode;
    }

    /** Default constructor. */
    public GetPrepInstructionsForASINRequest() {
        super();
    }

}

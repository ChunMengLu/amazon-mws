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
 * Get Package Labels Request
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
 * GetPackageLabelsRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPackageLabelsRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="NumberOfPackages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPackageLabelsRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "shipmentId",
    "pageType",
    "numberOfPackages"
})
@XmlRootElement(name = "GetPackageLabelsRequest")
public class GetPackageLabelsRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="ShipmentId",required=true)
    private String shipmentId;

    @XmlElement(name="PageType",required=true)
    private String pageType;

    @XmlElement(name="NumberOfPackages")
    private Integer numberOfPackages;

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
    public GetPackageLabelsRequest withSellerId(String sellerId) {
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
    public GetPackageLabelsRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of ShipmentId.
     *
     * @return The value of ShipmentId.
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Set the value of ShipmentId.
     *
     * @param shipmentId
     *            The new value to set.
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    /**
     * Check to see if ShipmentId is set.
     *
     * @return true if ShipmentId is set.
     */
    public boolean isSetShipmentId() {
        return shipmentId != null;
    }

    /**
     * Set the value of ShipmentId, return this.
     *
     * @param shipmentId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageLabelsRequest withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Get the value of PageType.
     *
     * @return The value of PageType.
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Set the value of PageType.
     *
     * @param pageType
     *            The new value to set.
     */
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    /**
     * Check to see if PageType is set.
     *
     * @return true if PageType is set.
     */
    public boolean isSetPageType() {
        return pageType != null;
    }

    /**
     * Set the value of PageType, return this.
     *
     * @param pageType
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageLabelsRequest withPageType(String pageType) {
        this.pageType = pageType;
        return this;
    }

    /**
     * Get the value of NumberOfPackages.
     *
     * @return The value of NumberOfPackages.
     */
    public Integer getNumberOfPackages() {
        return numberOfPackages;
    }

    /**
     * Set the value of NumberOfPackages.
     *
     * @param numberOfPackages
     *            The new value to set.
     */
    public void setNumberOfPackages(Integer numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    /**
     * Check to see if NumberOfPackages is set.
     *
     * @return true if NumberOfPackages is set.
     */
    public boolean isSetNumberOfPackages() {
        return numberOfPackages != null;
    }

    /**
     * Set the value of NumberOfPackages, return this.
     *
     * @param numberOfPackages
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageLabelsRequest withNumberOfPackages(Integer numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
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
        shipmentId = r.read("ShipmentId", String.class);
        pageType = r.read("PageType", String.class);
        numberOfPackages = r.read("NumberOfPackages", Integer.class);
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
        w.write("ShipmentId", shipmentId);
        w.write("PageType", pageType);
        w.write("NumberOfPackages", numberOfPackages);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPackageLabelsRequest",this);
    }

    /** Value constructor. */
    public GetPackageLabelsRequest(String sellerId,String mwsAuthToken,String shipmentId,String pageType,Integer numberOfPackages) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.shipmentId = shipmentId;
        this.pageType = pageType;
        this.numberOfPackages = numberOfPackages;
    }

    /** Legacy value constructor. */
    public GetPackageLabelsRequest(String sellerId,String shipmentId,String pageType,Integer numberOfPackages) {
        this.sellerId = sellerId;
        this.shipmentId = shipmentId;
        this.pageType = pageType;
        this.numberOfPackages = numberOfPackages;
    }

    /** Value constructor. */
    public GetPackageLabelsRequest(String sellerId,String shipmentId,String pageType) {
        this.sellerId = sellerId;
        this.shipmentId = shipmentId;
        this.pageType = pageType;
    }

    /** Default constructor. */
    public GetPackageLabelsRequest() {
        super();
    }

}

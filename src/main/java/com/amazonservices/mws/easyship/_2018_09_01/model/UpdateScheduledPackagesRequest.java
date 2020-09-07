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
 * Update Scheduled Packages Request
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
 * UpdateScheduledPackagesRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="UpdateScheduledPackagesRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ScheduledPackageUpdateDetailsList" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}ScheduledPackageUpdateDetails" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class UpdateScheduledPackagesRequest extends AbstractMwsObject {

    private String sellerId;

    private String mwsAuthToken;

    private String marketplaceId;

    private List<ScheduledPackageUpdateDetails> scheduledPackageUpdateDetailsList;

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
    public UpdateScheduledPackagesRequest withSellerId(String sellerId) {
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
    public UpdateScheduledPackagesRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public UpdateScheduledPackagesRequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of ScheduledPackageUpdateDetailsList.
     *
     * @return The value of ScheduledPackageUpdateDetailsList.
     */
    public List<ScheduledPackageUpdateDetails> getScheduledPackageUpdateDetailsList() {
        if (scheduledPackageUpdateDetailsList==null) {
            scheduledPackageUpdateDetailsList = new ArrayList<ScheduledPackageUpdateDetails>();
        }
        return scheduledPackageUpdateDetailsList;
    }

    /**
     * Set the value of ScheduledPackageUpdateDetailsList.
     *
     * @param scheduledPackageUpdateDetailsList
     *            The new value to set.
     */
    public void setScheduledPackageUpdateDetailsList(List<ScheduledPackageUpdateDetails> scheduledPackageUpdateDetailsList) {
        this.scheduledPackageUpdateDetailsList = scheduledPackageUpdateDetailsList;
    }

    /**
     * Clear ScheduledPackageUpdateDetailsList.
     */
    public void unsetScheduledPackageUpdateDetailsList() {
        this.scheduledPackageUpdateDetailsList = null;
    }

    /**
     * Check to see if ScheduledPackageUpdateDetailsList is set.
     *
     * @return true if ScheduledPackageUpdateDetailsList is set.
     */
    public boolean isSetScheduledPackageUpdateDetailsList() {
        return scheduledPackageUpdateDetailsList != null && !scheduledPackageUpdateDetailsList.isEmpty();
    }

    /**
     * Add values for ScheduledPackageUpdateDetailsList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public UpdateScheduledPackagesRequest withScheduledPackageUpdateDetailsList(ScheduledPackageUpdateDetails... values) {
        List<ScheduledPackageUpdateDetails> list = getScheduledPackageUpdateDetailsList();
        for (ScheduledPackageUpdateDetails value : values) {
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        scheduledPackageUpdateDetailsList = r.readList("ScheduledPackageUpdateDetailsList", "ScheduledPackageUpdateDetails", ScheduledPackageUpdateDetails.class);
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
        w.write("MarketplaceId", marketplaceId);
        w.writeList("ScheduledPackageUpdateDetailsList", "ScheduledPackageUpdateDetails", scheduledPackageUpdateDetailsList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "UpdateScheduledPackagesRequest",this);
    }

    /** Value constructor. */
    public UpdateScheduledPackagesRequest(String sellerId,String marketplaceId,List<ScheduledPackageUpdateDetails> scheduledPackageUpdateDetailsList) {
        this.sellerId = sellerId;
        this.marketplaceId = marketplaceId;
        this.scheduledPackageUpdateDetailsList = scheduledPackageUpdateDetailsList;
    }

    /** Default constructor. */
    public UpdateScheduledPackagesRequest() {
        super();
    }

}

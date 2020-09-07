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
 * Delete Subscription Input
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * DeleteSubscriptionInput complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DeleteSubscriptionInput"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="NotificationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Destination" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}Destination"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DeleteSubscriptionInput extends AbstractMwsObject {

    private String sellerId;

    private String mwsAuthToken;

    private String marketplaceId;

    private String notificationType;

    private Destination destination;

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
    public DeleteSubscriptionInput withSellerId(String sellerId) {
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
    public DeleteSubscriptionInput withMWSAuthToken(String mwsAuthToken) {
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
    public DeleteSubscriptionInput withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of NotificationType.
     *
     * @return The value of NotificationType.
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Set the value of NotificationType.
     *
     * @param notificationType
     *            The new value to set.
     */
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * Check to see if NotificationType is set.
     *
     * @return true if NotificationType is set.
     */
    public boolean isSetNotificationType() {
        return notificationType != null;
    }

    /**
     * Set the value of NotificationType, return this.
     *
     * @param notificationType
     *             The new value to set.
     *
     * @return This instance.
     */
    public DeleteSubscriptionInput withNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * Get the value of Destination.
     *
     * @return The value of Destination.
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Set the value of Destination.
     *
     * @param destination
     *            The new value to set.
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * Check to see if Destination is set.
     *
     * @return true if Destination is set.
     */
    public boolean isSetDestination() {
        return destination != null;
    }

    /**
     * Set the value of Destination, return this.
     *
     * @param destination
     *             The new value to set.
     *
     * @return This instance.
     */
    public DeleteSubscriptionInput withDestination(Destination destination) {
        this.destination = destination;
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
        notificationType = r.read("NotificationType", String.class);
        destination = r.read("Destination", Destination.class);
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
        w.write("NotificationType", notificationType);
        w.write("Destination", destination);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "DeleteSubscriptionInput",this);
    }

    /** Value constructor. */
    public DeleteSubscriptionInput(String sellerId,String mwsAuthToken,String marketplaceId,String notificationType,Destination destination) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplaceId = marketplaceId;
        this.notificationType = notificationType;
        this.destination = destination;
    }

    /** Legacy value constructor. */
    public DeleteSubscriptionInput(String sellerId,String marketplaceId,String notificationType,Destination destination) {
        this.sellerId = sellerId;
        this.marketplaceId = marketplaceId;
        this.notificationType = notificationType;
        this.destination = destination;
    }


    /** Default constructor. */
    public DeleteSubscriptionInput() {
        super();
    }

}

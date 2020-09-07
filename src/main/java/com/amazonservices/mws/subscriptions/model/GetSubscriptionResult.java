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
 * Get Subscription Result
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * GetSubscriptionResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetSubscriptionResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Subscription" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}Subscription"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetSubscriptionResult extends AbstractMwsObject {

    private Subscription subscription;

    /**
     * Get the value of Subscription.
     *
     * @return The value of Subscription.
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Set the value of Subscription.
     *
     * @param subscription
     *            The new value to set.
     */
    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Check to see if Subscription is set.
     *
     * @return true if Subscription is set.
     */
    public boolean isSetSubscription() {
        return subscription != null;
    }

    /**
     * Set the value of Subscription, return this.
     *
     * @param subscription
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetSubscriptionResult withSubscription(Subscription subscription) {
        this.subscription = subscription;
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
        subscription = r.read("Subscription", Subscription.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Subscription", subscription);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "GetSubscriptionResult",this);
    }

    /** Value constructor. */
    public GetSubscriptionResult(Subscription subscription) {
        this.subscription = subscription;
    }


    /** Default constructor. */
    public GetSubscriptionResult() {
        super();
    }

}

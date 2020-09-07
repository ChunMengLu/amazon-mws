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
 * Subscription
 * API Version: 2013-07-01
 * Library Version: 2014-09-30
 * Generated: Tue Sep 16 08:58:06 PDT 2014
 */
package com.amazonservices.mws.subscriptions.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * Subscription complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Subscription"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="NotificationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Destination" type="{http://mws.amazonservices.com/schema/Subscriptions/2013-07-01}Destination"/&gt;
 *             &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Subscription extends AbstractMwsObject {

    private String notificationType;

    private Destination destination;

    private boolean isEnabled;

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
    public Subscription withNotificationType(String notificationType) {
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
    public Subscription withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Check the value of IsEnabled.
     *
     * @return true if IsEnabled is set to true.
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Get the value of IsEnabled.
     *
     * @return The value of IsEnabled.
     */
    public boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Set the value of IsEnabled.
     *
     * @param isEnabled
     *            The new value to set.
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * Set the value of IsEnabled, return this.
     *
     * @param isEnabled
     *             The new value to set.
     *
     * @return This instance.
     */
    public Subscription withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
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
        notificationType = r.read("NotificationType", String.class);
        destination = r.read("Destination", Destination.class);
        isEnabled = r.read("IsEnabled", boolean.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("NotificationType", notificationType);
        w.write("Destination", destination);
        w.write("IsEnabled", isEnabled);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Subscriptions/2013-07-01", "Subscription",this);
    }

    /** Value constructor. */
    public Subscription(String notificationType,Destination destination,boolean isEnabled) {
        this.notificationType = notificationType;
        this.destination = destination;
        this.isEnabled = isEnabled;
    }


    /** Default constructor. */
    public Subscription() {
        super();
    }

}

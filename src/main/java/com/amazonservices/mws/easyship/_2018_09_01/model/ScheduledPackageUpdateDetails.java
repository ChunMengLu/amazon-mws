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
 * Scheduled Package Update Details
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * ScheduledPackageUpdateDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ScheduledPackageUpdateDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ScheduledPackageId" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}ScheduledPackageId"/&gt;
 *             &lt;element name="PackagePickupSlot" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}PickupSlot"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ScheduledPackageUpdateDetails extends AbstractMwsObject {

    private ScheduledPackageId scheduledPackageId;

    private PickupSlot packagePickupSlot;

    /**
     * Get the value of ScheduledPackageId.
     *
     * @return The value of ScheduledPackageId.
     */
    public ScheduledPackageId getScheduledPackageId() {
        return scheduledPackageId;
    }

    /**
     * Set the value of ScheduledPackageId.
     *
     * @param scheduledPackageId
     *            The new value to set.
     */
    public void setScheduledPackageId(ScheduledPackageId scheduledPackageId) {
        this.scheduledPackageId = scheduledPackageId;
    }

    /**
     * Check to see if ScheduledPackageId is set.
     *
     * @return true if ScheduledPackageId is set.
     */
    public boolean isSetScheduledPackageId() {
        return scheduledPackageId != null;
    }

    /**
     * Set the value of ScheduledPackageId, return this.
     *
     * @param scheduledPackageId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ScheduledPackageUpdateDetails withScheduledPackageId(ScheduledPackageId scheduledPackageId) {
        this.scheduledPackageId = scheduledPackageId;
        return this;
    }

    /**
     * Get the value of PackagePickupSlot.
     *
     * @return The value of PackagePickupSlot.
     */
    public PickupSlot getPackagePickupSlot() {
        return packagePickupSlot;
    }

    /**
     * Set the value of PackagePickupSlot.
     *
     * @param packagePickupSlot
     *            The new value to set.
     */
    public void setPackagePickupSlot(PickupSlot packagePickupSlot) {
        this.packagePickupSlot = packagePickupSlot;
    }

    /**
     * Check to see if PackagePickupSlot is set.
     *
     * @return true if PackagePickupSlot is set.
     */
    public boolean isSetPackagePickupSlot() {
        return packagePickupSlot != null;
    }

    /**
     * Set the value of PackagePickupSlot, return this.
     *
     * @param packagePickupSlot
     *             The new value to set.
     *
     * @return This instance.
     */
    public ScheduledPackageUpdateDetails withPackagePickupSlot(PickupSlot packagePickupSlot) {
        this.packagePickupSlot = packagePickupSlot;
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
        scheduledPackageId = r.read("ScheduledPackageId", ScheduledPackageId.class);
        packagePickupSlot = r.read("PackagePickupSlot", PickupSlot.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ScheduledPackageId", scheduledPackageId);
        w.write("PackagePickupSlot", packagePickupSlot);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "ScheduledPackageUpdateDetails",this);
    }

    /** Value constructor. */
    public ScheduledPackageUpdateDetails(ScheduledPackageId scheduledPackageId,PickupSlot packagePickupSlot) {
        this.scheduledPackageId = scheduledPackageId;
        this.packagePickupSlot = packagePickupSlot;
    }

    /** Default constructor. */
    public ScheduledPackageUpdateDetails() {
        super();
    }

}

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
 * Create Scheduled Package Result
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonservices.mws.easyship._2018_09_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * CreateScheduledPackageResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CreateScheduledPackageResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ScheduledPackage" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Package"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class CreateScheduledPackageResult extends AbstractMwsObject {

    private Package scheduledPackage;

    /**
     * Get the value of ScheduledPackage.
     *
     * @return The value of ScheduledPackage.
     */
    public Package getScheduledPackage() {
        return scheduledPackage;
    }

    /**
     * Set the value of ScheduledPackage.
     *
     * @param scheduledPackage
     *            The new value to set.
     */
    public void setScheduledPackage(Package scheduledPackage) {
        this.scheduledPackage = scheduledPackage;
    }

    /**
     * Check to see if ScheduledPackage is set.
     *
     * @return true if ScheduledPackage is set.
     */
    public boolean isSetScheduledPackage() {
        return scheduledPackage != null;
    }

    /**
     * Set the value of ScheduledPackage, return this.
     *
     * @param scheduledPackage
     *             The new value to set.
     *
     * @return This instance.
     */
    public CreateScheduledPackageResult withScheduledPackage(Package scheduledPackage) {
        this.scheduledPackage = scheduledPackage;
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
        scheduledPackage = r.read("ScheduledPackage", Package.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ScheduledPackage", scheduledPackage);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "CreateScheduledPackageResult",this);
    }

    /** Value constructor. */
    public CreateScheduledPackageResult(Package scheduledPackage) {
        this.scheduledPackage = scheduledPackage;
    }

    /** Default constructor. */
    public CreateScheduledPackageResult() {
        super();
    }

}

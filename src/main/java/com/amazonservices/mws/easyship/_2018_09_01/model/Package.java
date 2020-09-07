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
 * Package
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
 * Package complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Package"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ScheduledPackageId" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}ScheduledPackageId"/&gt;
 *             &lt;element name="PackageDimensions" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Dimensions"/&gt;
 *             &lt;element name="PackageWeight" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Weight"/&gt;
 *             &lt;element name="PackageItemList" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Item" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PackagePickupSlot" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}PickupSlot"/&gt;
 *             &lt;element name="PackageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Invoice" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}InvoiceData" minOccurs="0"/&gt;
 *             &lt;element name="PackageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Package extends AbstractMwsObject {

    private ScheduledPackageId scheduledPackageId;

    private Dimensions packageDimensions;

    private Weight packageWeight;

    private List<Item> packageItemList;

    private PickupSlot packagePickupSlot;

    private String packageIdentifier;

    private InvoiceData invoice;

    private String packageStatus;

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
    public Package withScheduledPackageId(ScheduledPackageId scheduledPackageId) {
        this.scheduledPackageId = scheduledPackageId;
        return this;
    }

    /**
     * Get the value of PackageDimensions.
     *
     * @return The value of PackageDimensions.
     */
    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Set the value of PackageDimensions.
     *
     * @param packageDimensions
     *            The new value to set.
     */
    public void setPackageDimensions(Dimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    /**
     * Check to see if PackageDimensions is set.
     *
     * @return true if PackageDimensions is set.
     */
    public boolean isSetPackageDimensions() {
        return packageDimensions != null;
    }

    /**
     * Set the value of PackageDimensions, return this.
     *
     * @param packageDimensions
     *             The new value to set.
     *
     * @return This instance.
     */
    public Package withPackageDimensions(Dimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
        return this;
    }

    /**
     * Get the value of PackageWeight.
     *
     * @return The value of PackageWeight.
     */
    public Weight getPackageWeight() {
        return packageWeight;
    }

    /**
     * Set the value of PackageWeight.
     *
     * @param packageWeight
     *            The new value to set.
     */
    public void setPackageWeight(Weight packageWeight) {
        this.packageWeight = packageWeight;
    }

    /**
     * Check to see if PackageWeight is set.
     *
     * @return true if PackageWeight is set.
     */
    public boolean isSetPackageWeight() {
        return packageWeight != null;
    }

    /**
     * Set the value of PackageWeight, return this.
     *
     * @param packageWeight
     *             The new value to set.
     *
     * @return This instance.
     */
    public Package withPackageWeight(Weight packageWeight) {
        this.packageWeight = packageWeight;
        return this;
    }

    /**
     * Get the value of PackageItemList.
     *
     * @return The value of PackageItemList.
     */
    public List<Item> getPackageItemList() {
        if (packageItemList==null) {
            packageItemList = new ArrayList<Item>();
        }
        return packageItemList;
    }

    /**
     * Set the value of PackageItemList.
     *
     * @param packageItemList
     *            The new value to set.
     */
    public void setPackageItemList(List<Item> packageItemList) {
        this.packageItemList = packageItemList;
    }

    /**
     * Clear PackageItemList.
     */
    public void unsetPackageItemList() {
        this.packageItemList = null;
    }

    /**
     * Check to see if PackageItemList is set.
     *
     * @return true if PackageItemList is set.
     */
    public boolean isSetPackageItemList() {
        return packageItemList != null && !packageItemList.isEmpty();
    }

    /**
     * Add values for PackageItemList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public Package withPackageItemList(Item... values) {
        List<Item> list = getPackageItemList();
        for (Item value : values) {
            list.add(value);
        }
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
    public Package withPackagePickupSlot(PickupSlot packagePickupSlot) {
        this.packagePickupSlot = packagePickupSlot;
        return this;
    }

    /**
     * Get the value of PackageIdentifier.
     *
     * @return The value of PackageIdentifier.
     */
    public String getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * Set the value of PackageIdentifier.
     *
     * @param packageIdentifier
     *            The new value to set.
     */
    public void setPackageIdentifier(String packageIdentifier) {
        this.packageIdentifier = packageIdentifier;
    }

    /**
     * Check to see if PackageIdentifier is set.
     *
     * @return true if PackageIdentifier is set.
     */
    public boolean isSetPackageIdentifier() {
        return packageIdentifier != null;
    }

    /**
     * Set the value of PackageIdentifier, return this.
     *
     * @param packageIdentifier
     *             The new value to set.
     *
     * @return This instance.
     */
    public Package withPackageIdentifier(String packageIdentifier) {
        this.packageIdentifier = packageIdentifier;
        return this;
    }

    /**
     * Get the value of Invoice.
     *
     * @return The value of Invoice.
     */
    public InvoiceData getInvoice() {
        return invoice;
    }

    /**
     * Set the value of Invoice.
     *
     * @param invoice
     *            The new value to set.
     */
    public void setInvoice(InvoiceData invoice) {
        this.invoice = invoice;
    }

    /**
     * Check to see if Invoice is set.
     *
     * @return true if Invoice is set.
     */
    public boolean isSetInvoice() {
        return invoice != null;
    }

    /**
     * Set the value of Invoice, return this.
     *
     * @param invoice
     *             The new value to set.
     *
     * @return This instance.
     */
    public Package withInvoice(InvoiceData invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Get the value of PackageStatus.
     *
     * @return The value of PackageStatus.
     */
    public String getPackageStatus() {
        return packageStatus;
    }

    /**
     * Set the value of PackageStatus.
     *
     * @param packageStatus
     *            The new value to set.
     */
    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    /**
     * Check to see if PackageStatus is set.
     *
     * @return true if PackageStatus is set.
     */
    public boolean isSetPackageStatus() {
        return packageStatus != null;
    }

    /**
     * Set the value of PackageStatus, return this.
     *
     * @param packageStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public Package withPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
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
        packageDimensions = r.read("PackageDimensions", Dimensions.class);
        packageWeight = r.read("PackageWeight", Weight.class);
        packageItemList = r.readList("PackageItemList", "Item", Item.class);
        packagePickupSlot = r.read("PackagePickupSlot", PickupSlot.class);
        packageIdentifier = r.read("PackageIdentifier", String.class);
        invoice = r.read("Invoice", InvoiceData.class);
        packageStatus = r.read("PackageStatus", String.class);
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
        w.write("PackageDimensions", packageDimensions);
        w.write("PackageWeight", packageWeight);
        w.writeList("PackageItemList", "Item", packageItemList);
        w.write("PackagePickupSlot", packagePickupSlot);
        w.write("PackageIdentifier", packageIdentifier);
        w.write("Invoice", invoice);
        w.write("PackageStatus", packageStatus);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "Package",this);
    }

    /** Value constructor. */
    public Package(ScheduledPackageId scheduledPackageId,Dimensions packageDimensions,Weight packageWeight,PickupSlot packagePickupSlot) {
        this.scheduledPackageId = scheduledPackageId;
        this.packageDimensions = packageDimensions;
        this.packageWeight = packageWeight;
        this.packagePickupSlot = packagePickupSlot;
    }

    /** Default constructor. */
    public Package() {
        super();
    }

}

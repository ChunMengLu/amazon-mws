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
 * Package Request Details
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
 * PackageRequestDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PackageRequestDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PackageDimensions" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Dimensions" minOccurs="0"/&gt;
 *             &lt;element name="PackageWeight" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Weight" minOccurs="0"/&gt;
 *             &lt;element name="PackageItemList" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Item" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PackagePickupSlot" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}PickupSlot"/&gt;
 *             &lt;element name="PackageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PackageRequestDetails extends AbstractMwsObject {

    private Dimensions packageDimensions;

    private Weight packageWeight;

    private List<Item> packageItemList;

    private PickupSlot packagePickupSlot;

    private String packageIdentifier;

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
    public PackageRequestDetails withPackageDimensions(Dimensions packageDimensions) {
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
    public PackageRequestDetails withPackageWeight(Weight packageWeight) {
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
    public PackageRequestDetails withPackageItemList(Item... values) {
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
    public PackageRequestDetails withPackagePickupSlot(PickupSlot packagePickupSlot) {
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
    public PackageRequestDetails withPackageIdentifier(String packageIdentifier) {
        this.packageIdentifier = packageIdentifier;
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
        packageDimensions = r.read("PackageDimensions", Dimensions.class);
        packageWeight = r.read("PackageWeight", Weight.class);
        packageItemList = r.readList("PackageItemList", "Item", Item.class);
        packagePickupSlot = r.read("PackagePickupSlot", PickupSlot.class);
        packageIdentifier = r.read("PackageIdentifier", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PackageDimensions", packageDimensions);
        w.write("PackageWeight", packageWeight);
        w.writeList("PackageItemList", "Item", packageItemList);
        w.write("PackagePickupSlot", packagePickupSlot);
        w.write("PackageIdentifier", packageIdentifier);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "PackageRequestDetails",this);
    }

    /** Value constructor. */
    public PackageRequestDetails(PickupSlot packagePickupSlot) {
        this.packagePickupSlot = packagePickupSlot;
    }

    /** Default constructor. */
    public PackageRequestDetails() {
        super();
    }

}

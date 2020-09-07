/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Label
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * Label complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Label"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CustomTextForLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Dimensions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}LabelDimensions"/&gt;
 *             &lt;element name="FileContents" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}FileContents"/&gt;
 *             &lt;element name="LabelFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="StandardIdForLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Label extends AbstractMwsObject {

    private String customTextForLabel;

    private LabelDimensions dimensions;

    private FileContents fileContents;

    private String labelFormat;

    private String standardIdForLabel;

    /**
     * Get the value of CustomTextForLabel.
     *
     * @return The value of CustomTextForLabel.
     */
    public String getCustomTextForLabel() {
        return customTextForLabel;
    }

    /**
     * Set the value of CustomTextForLabel.
     *
     * @param customTextForLabel
     *            The new value to set.
     */
    public void setCustomTextForLabel(String customTextForLabel) {
        this.customTextForLabel = customTextForLabel;
    }

    /**
     * Check to see if CustomTextForLabel is set.
     *
     * @return true if CustomTextForLabel is set.
     */
    public boolean isSetCustomTextForLabel() {
        return customTextForLabel != null;
    }

    /**
     * Set the value of CustomTextForLabel, return this.
     *
     * @param customTextForLabel
     *             The new value to set.
     *
     * @return This instance.
     */
    public Label withCustomTextForLabel(String customTextForLabel) {
        this.customTextForLabel = customTextForLabel;
        return this;
    }

    /**
     * Get the value of Dimensions.
     *
     * @return The value of Dimensions.
     */
    public LabelDimensions getDimensions() {
        return dimensions;
    }

    /**
     * Set the value of Dimensions.
     *
     * @param dimensions
     *            The new value to set.
     */
    public void setDimensions(LabelDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Check to see if Dimensions is set.
     *
     * @return true if Dimensions is set.
     */
    public boolean isSetDimensions() {
        return dimensions != null;
    }

    /**
     * Set the value of Dimensions, return this.
     *
     * @param dimensions
     *             The new value to set.
     *
     * @return This instance.
     */
    public Label withDimensions(LabelDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the value of FileContents.
     *
     * @return The value of FileContents.
     */
    public FileContents getFileContents() {
        return fileContents;
    }

    /**
     * Set the value of FileContents.
     *
     * @param fileContents
     *            The new value to set.
     */
    public void setFileContents(FileContents fileContents) {
        this.fileContents = fileContents;
    }

    /**
     * Check to see if FileContents is set.
     *
     * @return true if FileContents is set.
     */
    public boolean isSetFileContents() {
        return fileContents != null;
    }

    /**
     * Set the value of FileContents, return this.
     *
     * @param fileContents
     *             The new value to set.
     *
     * @return This instance.
     */
    public Label withFileContents(FileContents fileContents) {
        this.fileContents = fileContents;
        return this;
    }

    /**
     * Get the value of LabelFormat.
     *
     * @return The value of LabelFormat.
     */
    public String getLabelFormat() {
        return labelFormat;
    }

    /**
     * Set the value of LabelFormat.
     *
     * @param labelFormat
     *            The new value to set.
     */
    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
    }

    /**
     * Check to see if LabelFormat is set.
     *
     * @return true if LabelFormat is set.
     */
    public boolean isSetLabelFormat() {
        return labelFormat != null;
    }

    /**
     * Set the value of LabelFormat, return this.
     *
     * @param labelFormat
     *             The new value to set.
     *
     * @return This instance.
     */
    public Label withLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
        return this;
    }

    /**
     * Get the value of StandardIdForLabel.
     *
     * @return The value of StandardIdForLabel.
     */
    public String getStandardIdForLabel() {
        return standardIdForLabel;
    }

    /**
     * Set the value of StandardIdForLabel.
     *
     * @param standardIdForLabel
     *            The new value to set.
     */
    public void setStandardIdForLabel(String standardIdForLabel) {
        this.standardIdForLabel = standardIdForLabel;
    }

    /**
     * Check to see if StandardIdForLabel is set.
     *
     * @return true if StandardIdForLabel is set.
     */
    public boolean isSetStandardIdForLabel() {
        return standardIdForLabel != null;
    }

    /**
     * Set the value of StandardIdForLabel, return this.
     *
     * @param standardIdForLabel
     *             The new value to set.
     *
     * @return This instance.
     */
    public Label withStandardIdForLabel(String standardIdForLabel) {
        this.standardIdForLabel = standardIdForLabel;
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
        customTextForLabel = r.read("CustomTextForLabel", String.class);
        dimensions = r.read("Dimensions", LabelDimensions.class);
        fileContents = r.read("FileContents", FileContents.class);
        labelFormat = r.read("LabelFormat", String.class);
        standardIdForLabel = r.read("StandardIdForLabel", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CustomTextForLabel", customTextForLabel);
        w.write("Dimensions", dimensions);
        w.write("FileContents", fileContents);
        w.write("LabelFormat", labelFormat);
        w.write("StandardIdForLabel", standardIdForLabel);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Label",this);
    }

    /** Value constructor. */
    public Label(LabelDimensions dimensions,FileContents fileContents) {
        this.dimensions = dimensions;
        this.fileContents = fileContents;
    }

    /** Default constructor. */
    public Label() {
        super();
    }

}

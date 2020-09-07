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
 * Trial Shipment Event
 * API Version: 2015-05-01
 * Library Version: 2020-02-21
 * Generated: Fri Feb 21 09:07:25 PST 2020
 */
package com.amazon.mws.finances._2015_05_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * TrialShipmentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TrialShipmentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FinancialEventGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class TrialShipmentEvent extends AbstractMwsObject {

    private String amazonOrderId;

    private String financialEventGroupId;

    private XMLGregorianCalendar postedDate;

    private String sku;

    private List<FeeComponent> feeList;

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null;
    }

    /**
     * Set the value of AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrialShipmentEvent withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of FinancialEventGroupId.
     *
     * @return The value of FinancialEventGroupId.
     */
    public String getFinancialEventGroupId() {
        return financialEventGroupId;
    }

    /**
     * Set the value of FinancialEventGroupId.
     *
     * @param financialEventGroupId
     *            The new value to set.
     */
    public void setFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
    }

    /**
     * Check to see if FinancialEventGroupId is set.
     *
     * @return true if FinancialEventGroupId is set.
     */
    public boolean isSetFinancialEventGroupId() {
        return financialEventGroupId != null;
    }

    /**
     * Set the value of FinancialEventGroupId, return this.
     *
     * @param financialEventGroupId
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrialShipmentEvent withFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
        return this;
    }

    /**
     * Get the value of PostedDate.
     *
     * @return The value of PostedDate.
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Set the value of PostedDate.
     *
     * @param postedDate
     *            The new value to set.
     */
    public void setPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
    }

    /**
     * Check to see if PostedDate is set.
     *
     * @return true if PostedDate is set.
     */
    public boolean isSetPostedDate() {
        return postedDate != null;
    }

    /**
     * Set the value of PostedDate, return this.
     *
     * @param postedDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrialShipmentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of SKU.
     *
     * @return The value of SKU.
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Set the value of SKU.
     *
     * @param sku
     *            The new value to set.
     */
    public void setSKU(String sku) {
        this.sku = sku;
    }

    /**
     * Check to see if SKU is set.
     *
     * @return true if SKU is set.
     */
    public boolean isSetSKU() {
        return sku != null;
    }

    /**
     * Set the value of SKU, return this.
     *
     * @param sku
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrialShipmentEvent withSKU(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the value of FeeList.
     *
     * @return The value of FeeList.
     */
    public List<FeeComponent> getFeeList() {
        if (feeList==null) {
            feeList = new ArrayList<FeeComponent>();
        }
        return feeList;
    }

    /**
     * Set the value of FeeList.
     *
     * @param feeList
     *            The new value to set.
     */
    public void setFeeList(List<FeeComponent> feeList) {
        this.feeList = feeList;
    }

    /**
     * Clear FeeList.
     */
    public void unsetFeeList() {
        this.feeList = null;
    }

    /**
     * Check to see if FeeList is set.
     *
     * @return true if FeeList is set.
     */
    public boolean isSetFeeList() {
        return feeList != null && !feeList.isEmpty();
    }

    /**
     * Add values for FeeList, return this.
     *
     * @param feeList
     *             New values to add.
     *
     * @return This instance.
     */
    public TrialShipmentEvent withFeeList(FeeComponent... values) {
        List<FeeComponent> list = getFeeList();
        for (FeeComponent value : values) {
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
        amazonOrderId = r.read("AmazonOrderId", String.class);
        financialEventGroupId = r.read("FinancialEventGroupId", String.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        sku = r.read("SKU", String.class);
        feeList = r.readList("FeeList", "FeeComponent", FeeComponent.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AmazonOrderId", amazonOrderId);
        w.write("FinancialEventGroupId", financialEventGroupId);
        w.write("PostedDate", postedDate);
        w.write("SKU", sku);
        w.writeList("FeeList", "FeeComponent", feeList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "TrialShipmentEvent",this);
    }


    /** Default constructor. */
    public TrialShipmentEvent() {
        super();
    }

}

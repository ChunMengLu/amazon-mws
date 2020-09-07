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
 * Imaging Services Fee Event
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
 * ImagingServicesFeeEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ImagingServicesFeeEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ImagingRequestBillingItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="FeeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FeeComponent" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ImagingServicesFeeEvent extends AbstractMwsObject {

    private String imagingRequestBillingItemID;

    private String asin;

    private XMLGregorianCalendar postedDate;

    private List<FeeComponent> feeList;

    /**
     * Get the value of ImagingRequestBillingItemID.
     *
     * @return The value of ImagingRequestBillingItemID.
     */
    public String getImagingRequestBillingItemID() {
        return imagingRequestBillingItemID;
    }

    /**
     * Set the value of ImagingRequestBillingItemID.
     *
     * @param imagingRequestBillingItemID
     *            The new value to set.
     */
    public void setImagingRequestBillingItemID(String imagingRequestBillingItemID) {
        this.imagingRequestBillingItemID = imagingRequestBillingItemID;
    }

    /**
     * Check to see if ImagingRequestBillingItemID is set.
     *
     * @return true if ImagingRequestBillingItemID is set.
     */
    public boolean isSetImagingRequestBillingItemID() {
        return imagingRequestBillingItemID != null;
    }

    /**
     * Set the value of ImagingRequestBillingItemID, return this.
     *
     * @param imagingRequestBillingItemID
     *             The new value to set.
     *
     * @return This instance.
     */
    public ImagingServicesFeeEvent withImagingRequestBillingItemID(String imagingRequestBillingItemID) {
        this.imagingRequestBillingItemID = imagingRequestBillingItemID;
        return this;
    }

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public ImagingServicesFeeEvent withASIN(String asin) {
        this.asin = asin;
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
    public ImagingServicesFeeEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
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
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public ImagingServicesFeeEvent withFeeList(FeeComponent... values) {
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
        imagingRequestBillingItemID = r.read("ImagingRequestBillingItemID", String.class);
        asin = r.read("ASIN", String.class);
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
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
        w.write("ImagingRequestBillingItemID", imagingRequestBillingItemID);
        w.write("ASIN", asin);
        w.write("PostedDate", postedDate);
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
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "ImagingServicesFeeEvent",this);
    }


    /** Default constructor. */
    public ImagingServicesFeeEvent() {
        super();
    }

}

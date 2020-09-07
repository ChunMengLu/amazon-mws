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
 * Removal Shipment Event
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
 * RemovalShipmentEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="RemovalShipmentEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="RemovalShipmentItemList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RemovalShipmentItem" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class RemovalShipmentEvent extends AbstractMwsObject {

    private XMLGregorianCalendar postedDate;

    private String orderId;

    private String transactionType;

    private List<RemovalShipmentItem> removalShipmentItemList;

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
    public RemovalShipmentEvent withPostedDate(XMLGregorianCalendar postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get the value of OrderId.
     *
     * @return The value of OrderId.
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Set the value of OrderId.
     *
     * @param orderId
     *            The new value to set.
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Check to see if OrderId is set.
     *
     * @return true if OrderId is set.
     */
    public boolean isSetOrderId() {
        return orderId != null;
    }

    /**
     * Set the value of OrderId, return this.
     *
     * @param orderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentEvent withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get the value of TransactionType.
     *
     * @return The value of TransactionType.
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Set the value of TransactionType.
     *
     * @param transactionType
     *            The new value to set.
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Check to see if TransactionType is set.
     *
     * @return true if TransactionType is set.
     */
    public boolean isSetTransactionType() {
        return transactionType != null;
    }

    /**
     * Set the value of TransactionType, return this.
     *
     * @param transactionType
     *             The new value to set.
     *
     * @return This instance.
     */
    public RemovalShipmentEvent withTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get the value of RemovalShipmentItemList.
     *
     * @return The value of RemovalShipmentItemList.
     */
    public List<RemovalShipmentItem> getRemovalShipmentItemList() {
        if (removalShipmentItemList==null) {
            removalShipmentItemList = new ArrayList<RemovalShipmentItem>();
        }
        return removalShipmentItemList;
    }

    /**
     * Set the value of RemovalShipmentItemList.
     *
     * @param removalShipmentItemList
     *            The new value to set.
     */
    public void setRemovalShipmentItemList(List<RemovalShipmentItem> removalShipmentItemList) {
        this.removalShipmentItemList = removalShipmentItemList;
    }

    /**
     * Clear RemovalShipmentItemList.
     */
    public void unsetRemovalShipmentItemList() {
        this.removalShipmentItemList = null;
    }

    /**
     * Check to see if RemovalShipmentItemList is set.
     *
     * @return true if RemovalShipmentItemList is set.
     */
    public boolean isSetRemovalShipmentItemList() {
        return removalShipmentItemList != null && !removalShipmentItemList.isEmpty();
    }

    /**
     * Add values for RemovalShipmentItemList, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public RemovalShipmentEvent withRemovalShipmentItemList(RemovalShipmentItem... values) {
        List<RemovalShipmentItem> list = getRemovalShipmentItemList();
        for (RemovalShipmentItem value : values) {
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
        postedDate = r.read("PostedDate", XMLGregorianCalendar.class);
        orderId = r.read("OrderId", String.class);
        transactionType = r.read("TransactionType", String.class);
        removalShipmentItemList = r.readList("RemovalShipmentItemList", "RemovalShipmentItem", RemovalShipmentItem.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PostedDate", postedDate);
        w.write("OrderId", orderId);
        w.write("TransactionType", transactionType);
        w.writeList("RemovalShipmentItemList", "RemovalShipmentItem", removalShipmentItemList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "RemovalShipmentEvent",this);
    }


    /** Default constructor. */
    public RemovalShipmentEvent() {
        super();
    }

}

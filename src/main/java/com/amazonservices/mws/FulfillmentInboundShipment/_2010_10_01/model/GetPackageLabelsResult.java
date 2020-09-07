/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Get Package Labels Result
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * GetPackageLabelsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPackageLabelsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TransportDocument" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}TransportDocument" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPackageLabelsResult", propOrder={
    "transportDocument"
})
@XmlRootElement(name = "GetPackageLabelsResult")
public class GetPackageLabelsResult extends AbstractMwsObject {

    @XmlElement(name="TransportDocument")
    private TransportDocument transportDocument;

    /**
     * Get the value of TransportDocument.
     *
     * @return The value of TransportDocument.
     */
    public TransportDocument getTransportDocument() {
        return transportDocument;
    }

    /**
     * Set the value of TransportDocument.
     *
     * @param transportDocument
     *            The new value to set.
     */
    public void setTransportDocument(TransportDocument transportDocument) {
        this.transportDocument = transportDocument;
    }

    /**
     * Check to see if TransportDocument is set.
     *
     * @return true if TransportDocument is set.
     */
    public boolean isSetTransportDocument() {
        return transportDocument != null;
    }

    /**
     * Set the value of TransportDocument, return this.
     *
     * @param transportDocument
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageLabelsResult withTransportDocument(TransportDocument transportDocument) {
        this.transportDocument = transportDocument;
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
        transportDocument = r.read("TransportDocument", TransportDocument.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TransportDocument", transportDocument);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPackageLabelsResult",this);
    }


    /** Value constructor. */
    public GetPackageLabelsResult(TransportDocument transportDocument) {
        this.transportDocument = transportDocument;
    }

    /** Default constructor. */
    public GetPackageLabelsResult() {
        super();
    }

}

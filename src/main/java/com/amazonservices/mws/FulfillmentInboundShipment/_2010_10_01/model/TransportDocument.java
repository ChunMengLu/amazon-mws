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
 * Transport Document
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
 * TransportDocument complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TransportDocument"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PdfDocument" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Checksum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TransportDocument", propOrder={
    "pdfDocument",
    "checksum"
})
@XmlRootElement(name = "TransportDocument")
public class TransportDocument extends AbstractMwsObject {

    @XmlElement(name="PdfDocument",required=true)
    private String pdfDocument;

    @XmlElement(name="Checksum",required=true)
    private String checksum;

    /**
     * Get the value of PdfDocument.
     *
     * @return The value of PdfDocument.
     */
    public String getPdfDocument() {
        return pdfDocument;
    }

    /**
     * Set the value of PdfDocument.
     *
     * @param pdfDocument
     *            The new value to set.
     */
    public void setPdfDocument(String pdfDocument) {
        this.pdfDocument = pdfDocument;
    }

    /**
     * Check to see if PdfDocument is set.
     *
     * @return true if PdfDocument is set.
     */
    public boolean isSetPdfDocument() {
        return pdfDocument != null;
    }

    /**
     * Set the value of PdfDocument, return this.
     *
     * @param pdfDocument
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportDocument withPdfDocument(String pdfDocument) {
        this.pdfDocument = pdfDocument;
        return this;
    }

    /**
     * Get the value of Checksum.
     *
     * @return The value of Checksum.
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Set the value of Checksum.
     *
     * @param checksum
     *            The new value to set.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * Check to see if Checksum is set.
     *
     * @return true if Checksum is set.
     */
    public boolean isSetChecksum() {
        return checksum != null;
    }

    /**
     * Set the value of Checksum, return this.
     *
     * @param checksum
     *             The new value to set.
     *
     * @return This instance.
     */
    public TransportDocument withChecksum(String checksum) {
        this.checksum = checksum;
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
        pdfDocument = r.read("PdfDocument", String.class);
        checksum = r.read("Checksum", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PdfDocument", pdfDocument);
        w.write("Checksum", checksum);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "TransportDocument",this);
    }

    /** Value constructor. */
    public TransportDocument(String pdfDocument,String checksum) {
        this.pdfDocument = pdfDocument;
        this.checksum = checksum;
    }

    /** Default constructor. */
    public TransportDocument() {
        super();
    }

}

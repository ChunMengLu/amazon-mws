
package com.amazonaws.mws.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://mws.amazonaws.com/doc/2009-01-01/}GetReportScheduleListByNextTokenResult"/&gt;
 *         &lt;element ref="{http://mws.amazonaws.com/doc/2009-01-01/}ResponseMetadata"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Wed Feb 18 13:28:59 PST 2009
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getReportScheduleListByNextTokenResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetReportScheduleListByNextTokenResponse")
public class GetReportScheduleListByNextTokenResponse {

    @XmlElement(name = "GetReportScheduleListByNextTokenResult", required = true)
    protected GetReportScheduleListByNextTokenResult getReportScheduleListByNextTokenResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    /**
     * Default constructor
     *
     */
    public GetReportScheduleListByNextTokenResponse() {
        super();
    }

    /**
     * Value constructor
     *
     */
    public GetReportScheduleListByNextTokenResponse(final GetReportScheduleListByNextTokenResult getReportScheduleListByNextTokenResult, final ResponseMetadata responseMetadata) {
        this.getReportScheduleListByNextTokenResult = getReportScheduleListByNextTokenResult;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Gets the value of the getReportScheduleListByNextTokenResult property.
     *
     * @return
     *     possible object is
     *     {@link GetReportScheduleListByNextTokenResult }
     *
     */
    public GetReportScheduleListByNextTokenResult getGetReportScheduleListByNextTokenResult() {
        return getReportScheduleListByNextTokenResult;
    }

    /**
     * Sets the value of the getReportScheduleListByNextTokenResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetReportScheduleListByNextTokenResult }
     *
     */
    public void setGetReportScheduleListByNextTokenResult(GetReportScheduleListByNextTokenResult value) {
        this.getReportScheduleListByNextTokenResult = value;
    }

    public boolean isSetGetReportScheduleListByNextTokenResult() {
        return (this.getReportScheduleListByNextTokenResult!= null);
    }

    /**
     * Gets the value of the responseMetadata property.
     *
     * @return
     *     possible object is
     *     {@link ResponseMetadata }
     *
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Sets the value of the responseMetadata property.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseMetadata }
     *
     */
    public void setResponseMetadata(ResponseMetadata value) {
        this.responseMetadata = value;
    }

    public boolean isSetResponseMetadata() {
        return (this.responseMetadata!= null);
    }

    /**
     * Sets the value of the GetReportScheduleListByNextTokenResult property.
     *
     * @param value
     * @return
     *     this instance
     */
    public GetReportScheduleListByNextTokenResponse withGetReportScheduleListByNextTokenResult(GetReportScheduleListByNextTokenResult value) {
        setGetReportScheduleListByNextTokenResult(value);
        return this;
    }

    /**
     * Sets the value of the ResponseMetadata property.
     *
     * @param value
     * @return
     *     this instance
     */
    public GetReportScheduleListByNextTokenResponse withResponseMetadata(ResponseMetadata value) {
        setResponseMetadata(value);
        return this;
    }

    @javax.xml.bind.annotation.XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;


    public boolean isSetResponseHeaderMetadata() {
        return this.responseHeaderMetadata != null;
    }


    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }


    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     *
     * XML string representation of this object
     *
     * @return XML String
     */
    public String toXML() {
        StringBuffer xml = new StringBuffer();
        xml.append("<GetReportScheduleListByNextTokenResponse xmlns=\"http://mws.amazonaws.com/doc/2009-01-01/\">");
        if (isSetGetReportScheduleListByNextTokenResult()) {
            GetReportScheduleListByNextTokenResult  getReportScheduleListByNextTokenResult = getGetReportScheduleListByNextTokenResult();
            xml.append("<GetReportScheduleListByNextTokenResult>");
            xml.append(getReportScheduleListByNextTokenResult.toXMLFragment());
            xml.append("</GetReportScheduleListByNextTokenResult>");
        }
        if (isSetResponseMetadata()) {
            ResponseMetadata  responseMetadata = getResponseMetadata();
            xml.append("<ResponseMetadata>");
            xml.append(responseMetadata.toXMLFragment());
            xml.append("</ResponseMetadata>");
        }
        xml.append("</GetReportScheduleListByNextTokenResponse>");
        return xml.toString();
    }

    /**
     *
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
    }



    /**
     *
     * JSON string representation of this object
     *
     * @return JSON String
     */
    public String toJSON() {
        StringBuffer json = new StringBuffer();
        json.append("{\"GetReportScheduleListByNextTokenResponse\" : {");
        json.append(quoteJSON("@xmlns"));
        json.append(" : ");
        json.append(quoteJSON("http://mws.amazonaws.com/doc/2009-01-01/"));
        boolean first = true;
        json.append(", ");
        if (isSetGetReportScheduleListByNextTokenResult()) {
            if (!first) json.append(", ");
            json.append("\"GetReportScheduleListByNextTokenResult\" : {");
            GetReportScheduleListByNextTokenResult  getReportScheduleListByNextTokenResult = getGetReportScheduleListByNextTokenResult();

            json.append(getReportScheduleListByNextTokenResult.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetResponseMetadata()) {
            if (!first) json.append(", ");
            json.append("\"ResponseMetadata\" : {");
            ResponseMetadata  responseMetadata = getResponseMetadata();

            json.append(responseMetadata.toJSONFragment());
            json.append("}");
            first = false;
        }
        json.append("}");
        json.append("}");
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
                }
            }
        }
        sb.append("\"");
        return sb.toString();
    }


}

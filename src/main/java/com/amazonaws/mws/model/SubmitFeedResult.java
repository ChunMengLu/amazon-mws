
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
 *         &lt;element name="FeedSubmissionInfo" type="{http://mws.amazonaws.com/doc/2009-01-01/}FeedSubmissionInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Tue Feb 03 16:00:09 PST 2009
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "feedSubmissionInfo"
})
@XmlRootElement(name = "SubmitFeedResult")
public class SubmitFeedResult {

    @XmlElement(name = "FeedSubmissionInfo", required = true)
    protected FeedSubmissionInfo feedSubmissionInfo;

    /**
     * Default constructor
     *
     */
    public SubmitFeedResult() {
        super();
    }

    /**
     * Value constructor
     *
     */
    public SubmitFeedResult(final FeedSubmissionInfo feedSubmissionInfo) {
        this.feedSubmissionInfo = feedSubmissionInfo;
    }

    /**
     * Gets the value of the feedSubmissionInfo property.
     *
     * @return
     *     possible object is
     *     {@link FeedSubmissionInfo }
     *
     */
    public FeedSubmissionInfo getFeedSubmissionInfo() {
        return feedSubmissionInfo;
    }

    /**
     * Sets the value of the feedSubmissionInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link FeedSubmissionInfo }
     *
     */
    public void setFeedSubmissionInfo(FeedSubmissionInfo value) {
        this.feedSubmissionInfo = value;
    }

    public boolean isSetFeedSubmissionInfo() {
        return (this.feedSubmissionInfo!= null);
    }

    /**
     * Sets the value of the FeedSubmissionInfo property.
     *
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedResult withFeedSubmissionInfo(FeedSubmissionInfo value) {
        setFeedSubmissionInfo(value);
        return this;
    }


    /**
     *
     * XML fragment representation of this object
     *
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetFeedSubmissionInfo()) {
            FeedSubmissionInfo  feedSubmissionInfo = getFeedSubmissionInfo();
            xml.append("<FeedSubmissionInfo>");
            xml.append(feedSubmissionInfo.toXMLFragment());
            xml.append("</FeedSubmissionInfo>");
        }
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
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetFeedSubmissionInfo()) {
            if (!first) json.append(", ");
            json.append("\"FeedSubmissionInfo\" : {");
            FeedSubmissionInfo  feedSubmissionInfo = getFeedSubmissionInfo();


            json.append(feedSubmissionInfo.toJSONFragment());
            json.append("}");
            first = false;
        }
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


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
 *         &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReportTypeList" type="{http://mws.amazonaws.com/doc/2009-01-01/}TypeList" minOccurs="0"/&gt;
 *         &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "marketplace",
    "merchant",
    "reportTypeList",
    "mwsAuthToken"
})
@XmlRootElement(name = "GetReportScheduleListRequest")
public class GetReportScheduleListRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "ReportTypeList")
    protected TypeList reportTypeList;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;
    /**
     * Default constructor
     *
     */
    public GetReportScheduleListRequest() {
        super();
    }

    /**
     * Value constructor
     *
     */
    public GetReportScheduleListRequest(final String marketplace, final String merchant, final TypeList reportTypeList) {
        this(marketplace, merchant, reportTypeList, null);
    }

    public GetReportScheduleListRequest(final String marketplace,
            final String merchant,
            final TypeList reportTypeList,
            final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.reportTypeList = reportTypeList;
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Gets the value of the marketplace property.
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Sets the value of the marketplace property.
     *
     * @deprecated Not used anymore.  MWS ignores this parameter, but it is left
     * in here for backwards compatibility.
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketplace(String value) {
        this.marketplace = value;
    }

    /**
     * @deprecated  See {@link #setMarketplace(String)}
     */
    public boolean isSetMarketplace() {
        return (this.marketplace!= null);
    }

    /**
     * Gets the value of the merchant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    public boolean isSetMerchant() {
        return (this.merchant!= null);
    }

    /**
     * Gets the value of the mwsAuthToken property.
     *
     * possible object is
     *     {@link String}
     */
    public String getMWSAuthToken() {
    	return mwsAuthToken;
    }

    /**
     * Sets the value of the mwsAuthToken property
     * @param authTokenValue
     * 		allowed object is
     * 		{@link String}
     */
    public void setMWSAuthToken(String authTokenValue) {
    	this.mwsAuthToken = authTokenValue;
    }

    public boolean isSetMWSAuthToken() {
    	return (this.mwsAuthToken!=null);
    }


    /**
     * Gets the value of the reportTypeList property.
     *
     * @return
     *     possible object is
     *     {@link TypeList }
     *
     */
    public TypeList getReportTypeList() {
        return reportTypeList;
    }

    /**
     * Sets the value of the reportTypeList property.
     *
     * @param value
     *     allowed object is
     *     {@link TypeList }
     *
     */
    public void setReportTypeList(TypeList value) {
        this.reportTypeList = value;
    }

    public boolean isSetReportTypeList() {
        return (this.reportTypeList!= null);
    }

    /**
     * Sets the value of the Marketplace property.
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value
     * @return
     *     this instance
     */
    public GetReportScheduleListRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }

    /**
     * Sets the value of the Merchant property.
     *
     * @param value
     * @return
     *     this instance
     */
    public GetReportScheduleListRequest withMerchant(String value) {
        setMerchant(value);
        return this;
    }

    /**
     * Sets the value of the MWSAuthToken property.
     *
     * @param value
     * @return
     *     this instance
     */
    public GetReportScheduleListRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the ReportTypeList property.
     *
     * @param value
     * @return
     *     this instance
     */
    public GetReportScheduleListRequest withReportTypeList(TypeList value) {
        setReportTypeList(value);
        return this;
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
        if (isSetMarketplace()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Marketplace"));
            json.append(" : ");
            json.append(quoteJSON(getMarketplace()));
            first = false;
        }
        if (isSetMerchant()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Merchant"));
            json.append(" : ");
            json.append(quoteJSON(getMerchant()));
            first = false;
        }
        if (isSetReportTypeList()) {
            if (!first) json.append(", ");
            json.append("\"ReportTypeList\" : {");
            TypeList  reportTypeList = getReportTypeList();


            json.append(reportTypeList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetMWSAuthToken()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("MWSAuthToken"));
            json.append(" : ");
            json.append(quoteJSON(getMWSAuthToken()));
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

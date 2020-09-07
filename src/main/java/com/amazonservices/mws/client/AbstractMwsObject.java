/*******************************************************************************
 * Copyright 2009-2012 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Marketplace Web Service Runtime Client Library
 */
package com.amazonservices.mws.client;

/**
 * Abstract class that provides default implementations for some of the
 * MwsObject interface methods.
 *
 * @author mayerj
 */
public abstract class AbstractMwsObject implements com.amazonservices.mws.client.MwsObject {

    @Override
    public String toJSON() {
        com.amazonservices.mws.client.MwsWriter w = new com.amazonservices.mws.client.MwsJsonBuilder();
        this.writeTo(w);
        return w.toString();
    }

    @Override
    public String toJSONFragment() {
        com.amazonservices.mws.client.MwsWriter w = new com.amazonservices.mws.client.MwsJsonBuilder();
        this.writeFragmentTo(w);
        return w.toString();
    }

    @Override
    public String toXML() {
        com.amazonservices.mws.client.MwsWriter w = new com.amazonservices.mws.client.MwsXmlBuilder();
        this.writeTo(w);
        return w.toString();
    }

    @Override
    public String toXMLFragment() {
        com.amazonservices.mws.client.MwsWriter w = new com.amazonservices.mws.client.MwsXmlBuilder();
        this.writeFragmentTo(w);
        return w.toString();
    }

}

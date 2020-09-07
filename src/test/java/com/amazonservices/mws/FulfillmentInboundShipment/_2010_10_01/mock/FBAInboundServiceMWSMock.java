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
 * FBA Inbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.mock;


import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.FBAInboundServiceMWS;
import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.FBAInboundServiceMWSAsync;
import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.FBAInboundServiceMWSException;
import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model.*;
import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * A mock implementation of FBAInboundServiceMWS that uses pre-populated set of
 * XML files that serve local data.
 *
 * It simulates responses from the FBA Inbound Service MWS service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class FBAInboundServiceMWSMock
        implements FBAInboundServiceMWS, FBAInboundServiceMWSAsync {

    /**
     * Create a future that will immediately return the given response.
     *
     * @param response
     *
     * @return Future
     */
    private <T> Future<T> newFuture(final T response) {
        FutureTask<T> t = new FutureTask<T>(new Callable<T>() {
                @Override
                public T call() {
                    return response;
                }
            });
        t.run();
        return t;
    }

    /**
     * Create a new response object.
     *
     * @param cls
     *
     * @return The object.
     */
    private <T extends MwsObject> T newResponse(
            Class<T> cls) {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream(cls.getSimpleName()+".xml");
            MwsXmlReader reader = new MwsXmlReader(is);
            T obj = cls.newInstance();
            obj.readFragmentFrom(reader);
            ResponseHeaderMetadata rhmd = new ResponseHeaderMetadata(
                "mockRequestId", Arrays.asList("A","B","C"), "mockTimestamp", 0d, 0d, new Date());
            cls.getMethod("setResponseHeaderMetadata", rhmd.getClass()).invoke(obj,  rhmd);
            return obj;
        } catch (Exception e) {
            throw MwsUtl.wrap(e);
        } finally {
            MwsUtl.close(is);
        }
    }

    /**
     * Confirm Preorder
     * Given a shipment id. and date as input, this API confirms a shipment as a
     * pre-order.
     * This date must be the same as the NeedByDate (NBD) that is returned in the
     * GetPreorderInfo API. Any other date will result in an appropriate error code.
     * All items in the shipment with a release date on or after the
     * ConfirmedFulfillableDate ( also returned by the GetPreorderInfo  API) would
     * be pre-orderable on the website and would be fulfilled without promise breaks,
     * if the NBD is met.
     *
     * @param request
     *           ConfirmPreorderRequest request.
     *
     * @return ConfirmPreorderResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public ConfirmPreorderResponse confirmPreorder(ConfirmPreorderRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(ConfirmPreorderResponse.class);
    }

    /**
    * Confirm Preorder
    * Given a shipment id. and date as input, this API confirms a shipment as a
     * pre-order.
     * This date must be the same as the NeedByDate (NBD) that is returned in the
     * GetPreorderInfo API. Any other date will result in an appropriate error code.
     * All items in the shipment with a release date on or after the
     * ConfirmedFulfillableDate ( also returned by the GetPreorderInfo  API) would
     * be pre-orderable on the website and would be fulfilled without promise breaks,
     * if the NBD is met.
    *
    * @param request
    *           ConfirmPreorderRequest request.
    *
    * @return Future<ConfirmPreorderResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<ConfirmPreorderResponse> confirmPreorderAsync(ConfirmPreorderRequest request) {
        return newFuture(confirmPreorder(request));
    }

    /**
     * Confirm Transport Request
     * Confirms the estimate returned by the EstimateTransportRequest operation.
     *     Once this operation has been called successfully, the seller agrees to allow Amazon to charge
     *     their account the amount returned in the estimate.
     *
     * @param request
     *           ConfirmTransportInputRequest request.
     *
     * @return ConfirmTransportRequestResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public ConfirmTransportRequestResponse confirmTransportRequest(ConfirmTransportInputRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(ConfirmTransportRequestResponse.class);
    }

    /**
    * Confirm Transport Request
    * Confirms the estimate returned by the EstimateTransportRequest operation.
     *     Once this operation has been called successfully, the seller agrees to allow Amazon to charge
     *     their account the amount returned in the estimate.
    *
    * @param request
    *           ConfirmTransportInputRequest request.
    *
    * @return Future<ConfirmTransportRequestResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<ConfirmTransportRequestResponse> confirmTransportRequestAsync(ConfirmTransportInputRequest request) {
        return newFuture(confirmTransportRequest(request));
    }

    /**
     * Create Inbound Shipment
     * Creates an inbound shipment. It may include up to 200 items.
     * The initial status of a shipment will be set to 'Working'.
     * This operation will simply return a shipment Id upon success,
     * otherwise an explicit error will be returned.
     * More items may be added using the Update call.
     *
     * @param request
     *           CreateInboundShipmentRequest request.
     *
     * @return CreateInboundShipmentResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public CreateInboundShipmentResponse createInboundShipment(CreateInboundShipmentRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(CreateInboundShipmentResponse.class);
    }

    /**
    * Create Inbound Shipment
    * Creates an inbound shipment. It may include up to 200 items.
     * The initial status of a shipment will be set to 'Working'.
     * This operation will simply return a shipment Id upon success,
     * otherwise an explicit error will be returned.
     * More items may be added using the Update call.
    *
    * @param request
    *           CreateInboundShipmentRequest request.
    *
    * @return Future<CreateInboundShipmentResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<CreateInboundShipmentResponse> createInboundShipmentAsync(CreateInboundShipmentRequest request) {
        return newFuture(createInboundShipment(request));
    }

    /**
     * Create Inbound Shipment Plan
     * Plans inbound shipments for a set of items.  Registers identifiers if needed,
     * and assigns ShipmentIds for planned shipments.
     * When all the items are not all in the same category (e.g. some sortable, some
     * non-sortable) it may be necessary to create multiple shipments (one for each
     * of the shipment groups returned).
     *
     * @param request
     *           CreateInboundShipmentPlanRequest request.
     *
     * @return CreateInboundShipmentPlanResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public CreateInboundShipmentPlanResponse createInboundShipmentPlan(CreateInboundShipmentPlanRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(CreateInboundShipmentPlanResponse.class);
    }

    /**
    * Create Inbound Shipment Plan
    * Plans inbound shipments for a set of items.  Registers identifiers if needed,
     * and assigns ShipmentIds for planned shipments.
     * When all the items are not all in the same category (e.g. some sortable, some
     * non-sortable) it may be necessary to create multiple shipments (one for each
     * of the shipment groups returned).
    *
    * @param request
    *           CreateInboundShipmentPlanRequest request.
    *
    * @return Future<CreateInboundShipmentPlanResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<CreateInboundShipmentPlanResponse> createInboundShipmentPlanAsync(CreateInboundShipmentPlanRequest request) {
        return newFuture(createInboundShipmentPlan(request));
    }

    /**
     * Estimate Transport Request
     * Initiates the process for requesting an estimated shipping cost based-on the shipment
     *     for which the request is being made, whether or not the carrier shipment is partnered/non-partnered
     *     and the carrier type.
     *
     * @param request
     *           EstimateTransportInputRequest request.
     *
     * @return EstimateTransportRequestResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public EstimateTransportRequestResponse estimateTransportRequest(EstimateTransportInputRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(EstimateTransportRequestResponse.class);
    }

    /**
    * Estimate Transport Request
    * Initiates the process for requesting an estimated shipping cost based-on the shipment
     *     for which the request is being made, whether or not the carrier shipment is partnered/non-partnered
     *     and the carrier type.
    *
    * @param request
    *           EstimateTransportInputRequest request.
    *
    * @return Future<EstimateTransportRequestResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<EstimateTransportRequestResponse> estimateTransportRequestAsync(EstimateTransportInputRequest request) {
        return newFuture(estimateTransportRequest(request));
    }

    /**
     * Get Bill Of Lading
     * Retrieves the PDF-formatted BOL data for a partnered LTL shipment.
     *     This PDF data will be ZIP'd and then it will be encoded as a Base64 string, and a
     *     MD5 hash is included with the response to validate the BOL data which will be encoded as Base64.
     *
     * @param request
     *           GetBillOfLadingRequest request.
     *
     * @return GetBillOfLadingResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetBillOfLadingResponse getBillOfLading(GetBillOfLadingRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetBillOfLadingResponse.class);
    }

    /**
    * Get Bill Of Lading
    * Retrieves the PDF-formatted BOL data for a partnered LTL shipment.
     *     This PDF data will be ZIP'd and then it will be encoded as a Base64 string, and a
     *     MD5 hash is included with the response to validate the BOL data which will be encoded as Base64.
    *
    * @param request
    *           GetBillOfLadingRequest request.
    *
    * @return Future<GetBillOfLadingResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetBillOfLadingResponse> getBillOfLadingAsync(GetBillOfLadingRequest request) {
        return newFuture(getBillOfLading(request));
    }

    /**
     * Get Inbound Guidance For ASIN
     * Given a list of ASINs and shipToCountryCode, this API returns Inbound
     *      guidance to ASINs in request with optional reason code if applicable.
     *
     * @param request
     *           GetInboundGuidanceForASINRequest request.
     *
     * @return GetInboundGuidanceForASINResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetInboundGuidanceForASINResponse getInboundGuidanceForASIN(GetInboundGuidanceForASINRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetInboundGuidanceForASINResponse.class);
    }

    /**
    * Get Inbound Guidance For ASIN
    * Given a list of ASINs and shipToCountryCode, this API returns Inbound
     *      guidance to ASINs in request with optional reason code if applicable.
    *
    * @param request
    *           GetInboundGuidanceForASINRequest request.
    *
    * @return Future<GetInboundGuidanceForASINResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetInboundGuidanceForASINResponse> getInboundGuidanceForASINAsync(GetInboundGuidanceForASINRequest request) {
        return newFuture(getInboundGuidanceForASIN(request));
    }

    /**
     * Get Inbound Guidance For SKU
     * Given a list of SKUs and shipToCountryCode, this API returns Inbound
     *      guidance to SKUs in request with optional reason code if applicable.
     *
     * @param request
     *           GetInboundGuidanceForSKURequest request.
     *
     * @return GetInboundGuidanceForSKUResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetInboundGuidanceForSKUResponse getInboundGuidanceForSKU(GetInboundGuidanceForSKURequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetInboundGuidanceForSKUResponse.class);
    }

    /**
    * Get Inbound Guidance For SKU
    * Given a list of SKUs and shipToCountryCode, this API returns Inbound
     *      guidance to SKUs in request with optional reason code if applicable.
    *
    * @param request
    *           GetInboundGuidanceForSKURequest request.
    *
    * @return Future<GetInboundGuidanceForSKUResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetInboundGuidanceForSKUResponse> getInboundGuidanceForSKUAsync(GetInboundGuidanceForSKURequest request) {
        return newFuture(getInboundGuidanceForSKU(request));
    }

    /**
     * Get Package Labels
     * Retrieves the PDF-formatted package label data for the packages of the
     *     shipment. These labels will include relevant data for shipments utilizing
     *     Amazon-partnered carriers. The PDF data will be ZIP'd and then it will be encoded as a Base64 string, and
     *     MD5 hash is included with the response to validate the label data which will be encoded as Base64.
     *     The language of the address and FC prep instructions sections of the labels are
     *     determined by the marketplace in which the request is being made and the marketplace of
     *     the destination FC, respectively.
     *
     *     Only select PageTypes are supported in each marketplace. By marketplace, the
     *     supported types are:
     *       * US non-partnered UPS: PackageLabel_Letter_6
     *       * US partnered-UPS: PackageLabel_Letter_2
     *       * GB, DE, FR, IT, ES: PackageLabel_A4_4, PackageLabel_Plain_Paper
     *       * Partnered EU: PackageLabel_A4_2
     *       * JP/CN: PackageLabel_Plain_Paper
     *
     * @param request
     *           GetPackageLabelsRequest request.
     *
     * @return GetPackageLabelsResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetPackageLabelsResponse getPackageLabels(GetPackageLabelsRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetPackageLabelsResponse.class);
    }

    /**
    * Get Package Labels
    * Retrieves the PDF-formatted package label data for the packages of the
     *     shipment. These labels will include relevant data for shipments utilizing
     *     Amazon-partnered carriers. The PDF data will be ZIP'd and then it will be encoded as a Base64 string, and
     *     MD5 hash is included with the response to validate the label data which will be encoded as Base64.
     *     The language of the address and FC prep instructions sections of the labels are
     *     determined by the marketplace in which the request is being made and the marketplace of
     *     the destination FC, respectively.
     *
     *     Only select PageTypes are supported in each marketplace. By marketplace, the
     *     supported types are:
     *       * US non-partnered UPS: PackageLabel_Letter_6
     *       * US partnered-UPS: PackageLabel_Letter_2
     *       * GB, DE, FR, IT, ES: PackageLabel_A4_4, PackageLabel_Plain_Paper
     *       * Partnered EU: PackageLabel_A4_2
     *       * JP/CN: PackageLabel_Plain_Paper
    *
    * @param request
    *           GetPackageLabelsRequest request.
    *
    * @return Future<GetPackageLabelsResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetPackageLabelsResponse> getPackageLabelsAsync(GetPackageLabelsRequest request) {
        return newFuture(getPackageLabels(request));
    }

    /**
     * Get Pallet Labels
     * Retrieves the PDF-formatted pallet label data for the pallets in an LTL shipment. These labels
     *     include relevant data for shipments being sent to Amazon Fulfillment Centers. The PDF data will be
     *     ZIP'd and then it will be encoded as a Base64 string, and MD5 hash is included with the response to
     *     validate the label data which will be encoded as Base64. The language of the address and FC prep
     *     instructions sections of the labels are determined by the marketplace in which the request is being
     *     made and the marketplace of the destination FC, respectively.
     *
     * @param request
     *           GetPalletLabelsRequest request.
     *
     * @return GetPalletLabelsResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetPalletLabelsResponse getPalletLabels(GetPalletLabelsRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetPalletLabelsResponse.class);
    }

    /**
    * Get Pallet Labels
    * Retrieves the PDF-formatted pallet label data for the pallets in an LTL shipment. These labels
     *     include relevant data for shipments being sent to Amazon Fulfillment Centers. The PDF data will be
     *     ZIP'd and then it will be encoded as a Base64 string, and MD5 hash is included with the response to
     *     validate the label data which will be encoded as Base64. The language of the address and FC prep
     *     instructions sections of the labels are determined by the marketplace in which the request is being
     *     made and the marketplace of the destination FC, respectively.
    *
    * @param request
    *           GetPalletLabelsRequest request.
    *
    * @return Future<GetPalletLabelsResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetPalletLabelsResponse> getPalletLabelsAsync(GetPalletLabelsRequest request) {
        return newFuture(getPalletLabels(request));
    }

    /**
     * Get Preorder Info
     * Given a shipment id. as input, based on the release date of the items in the
     * shipment, this API returns the suggested need By Date that the shipment items
     * must reach Amazon FC to successfully fulfill Pre-Orders without any promise
     * breaks.
     * This API also returns the confirmed Fullfillable date. All items in the
     * shipment that have a release date on or after this date would have the
     * pre-order buy box show up on the detail page if this shipment is marked as a
     * pre-orderable.
     *
     * @param request
     *           GetPreorderInfoRequest request.
     *
     * @return GetPreorderInfoResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetPreorderInfoResponse getPreorderInfo(GetPreorderInfoRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetPreorderInfoResponse.class);
    }

    /**
    * Get Preorder Info
    * Given a shipment id. as input, based on the release date of the items in the
     * shipment, this API returns the suggested need By Date that the shipment items
     * must reach Amazon FC to successfully fulfill Pre-Orders without any promise
     * breaks.
     * This API also returns the confirmed Fullfillable date. All items in the
     * shipment that have a release date on or after this date would have the
     * pre-order buy box show up on the detail page if this shipment is marked as a
     * pre-orderable.
    *
    * @param request
    *           GetPreorderInfoRequest request.
    *
    * @return Future<GetPreorderInfoResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetPreorderInfoResponse> getPreorderInfoAsync(GetPreorderInfoRequest request) {
        return newFuture(getPreorderInfo(request));
    }

    /**
     * Get Prep Instructions For ASIN
     * Returns the required prep that must be performed for a set of items, identified
     * by ASINs, that will be sent to Amazon. It returns guidance for the seller
     * on how to prepare the items to be sent in to Amazon's Fulfillment Centers, and
     * identifies the labeling required for the items, and gives the seller a list
     * of additional required prep that must be performed.
     *
     * @param request
     *           GetPrepInstructionsForASINRequest request.
     *
     * @return GetPrepInstructionsForASINResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetPrepInstructionsForASINResponse getPrepInstructionsForASIN(GetPrepInstructionsForASINRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetPrepInstructionsForASINResponse.class);
    }

    /**
    * Get Prep Instructions For ASIN
    * Returns the required prep that must be performed for a set of items, identified
     * by ASINs, that will be sent to Amazon. It returns guidance for the seller
     * on how to prepare the items to be sent in to Amazon's Fulfillment Centers, and
     * identifies the labeling required for the items, and gives the seller a list
     * of additional required prep that must be performed.
    *
    * @param request
    *           GetPrepInstructionsForASINRequest request.
    *
    * @return Future<GetPrepInstructionsForASINResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetPrepInstructionsForASINResponse> getPrepInstructionsForASINAsync(GetPrepInstructionsForASINRequest request) {
        return newFuture(getPrepInstructionsForASIN(request));
    }

    /**
     * Get Prep Instructions For SKU
     * Returns the required prep that must be performed for a set of items, identified
     * by SellerSKUs, that will be sent to Amazon. It returns guidance for the seller
     * on how to prepare the items to be sent in to Amazon's Fulfillment Centers, and
     * identifies the labeling required for the items, and gives the seller a list
     * of additional required prep that must be performed.
     *
     * @param request
     *           GetPrepInstructionsForSKURequest request.
     *
     * @return GetPrepInstructionsForSKUResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetPrepInstructionsForSKUResponse getPrepInstructionsForSKU(GetPrepInstructionsForSKURequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetPrepInstructionsForSKUResponse.class);
    }

    /**
    * Get Prep Instructions For SKU
    * Returns the required prep that must be performed for a set of items, identified
     * by SellerSKUs, that will be sent to Amazon. It returns guidance for the seller
     * on how to prepare the items to be sent in to Amazon's Fulfillment Centers, and
     * identifies the labeling required for the items, and gives the seller a list
     * of additional required prep that must be performed.
    *
    * @param request
    *           GetPrepInstructionsForSKURequest request.
    *
    * @return Future<GetPrepInstructionsForSKUResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetPrepInstructionsForSKUResponse> getPrepInstructionsForSKUAsync(GetPrepInstructionsForSKURequest request) {
        return newFuture(getPrepInstructionsForSKU(request));
    }

    /**
     * Get Service Status
     * Gets the status of the service.
     *   Status is one of GREEN, RED representing:
     *   GREEN: The service section is operating normally.
     *   RED: The service section disruption.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * Gets the status of the service.
     *   Status is one of GREEN, RED representing:
     *   GREEN: The service section is operating normally.
     *   RED: The service section disruption.
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

    /**
     * Get Transport Content
     * A read-only operation which sellers use to retrieve the current
     *     details about the transportation of an inbound shipment, including status of the
     *     partnered carrier workflow and status of individual packages when they arrive at our FCs.
     *
     * @param request
     *           GetTransportContentRequest request.
     *
     * @return GetTransportContentResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetTransportContentResponse getTransportContent(GetTransportContentRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetTransportContentResponse.class);
    }

    /**
    * Get Transport Content
    * A read-only operation which sellers use to retrieve the current
     *     details about the transportation of an inbound shipment, including status of the
     *     partnered carrier workflow and status of individual packages when they arrive at our FCs.
    *
    * @param request
    *           GetTransportContentRequest request.
    *
    * @return Future<GetTransportContentResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetTransportContentResponse> getTransportContentAsync(GetTransportContentRequest request) {
        return newFuture(getTransportContent(request));
    }

    /**
     * Get Unique Package Labels
     * Retrieves the PDF-formatted package label data for the packages of the
     *     shipment. These labels will include relevant data for shipments utilizing
     *     Amazon-partnered carriers. Each label contains a unique package identifier that represents the mapping between
     *     physical and virtual packages. This API requires that Carton Information has been provided for all packages in the
     *     shipment. The PDF data will be ZIP'd and then it will be encoded as a Base64 string, and
     *     MD5 hash is included with the response to validate the label data which will be encoded as Base64.
     *     The language of the address and FC prep instructions sections of the labels are
     *     determined by the marketplace in which the request is being made and the marketplace of
     *     the destination FC, respectively.
     *
     *     Only select PageTypes are supported in each marketplace. By marketplace, the
     *     supported types are:
     *       * US non-partnered UPS: PackageLabel_Letter_6
     *       * US partnered-UPS: PackageLabel_Letter_2
     *       * GB, DE, FR, IT, ES: PackageLabel_A4_4, PackageLabel_Plain_Paper
     *       * Partnered EU: PackageLabel_A4_2
     *       * JP/CN: PackageLabel_Plain_Paper
     *
     * @param request
     *           GetUniquePackageLabelsRequest request.
     *
     * @return GetUniquePackageLabelsResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public GetUniquePackageLabelsResponse getUniquePackageLabels(GetUniquePackageLabelsRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(GetUniquePackageLabelsResponse.class);
    }

    /**
    * Get Unique Package Labels
    * Retrieves the PDF-formatted package label data for the packages of the
     *     shipment. These labels will include relevant data for shipments utilizing
     *     Amazon-partnered carriers. Each label contains a unique package identifier that represents the mapping between
     *     physical and virtual packages. This API requires that Carton Information has been provided for all packages in the
     *     shipment. The PDF data will be ZIP'd and then it will be encoded as a Base64 string, and
     *     MD5 hash is included with the response to validate the label data which will be encoded as Base64.
     *     The language of the address and FC prep instructions sections of the labels are
     *     determined by the marketplace in which the request is being made and the marketplace of
     *     the destination FC, respectively.
     *
     *     Only select PageTypes are supported in each marketplace. By marketplace, the
     *     supported types are:
     *       * US non-partnered UPS: PackageLabel_Letter_6
     *       * US partnered-UPS: PackageLabel_Letter_2
     *       * GB, DE, FR, IT, ES: PackageLabel_A4_4, PackageLabel_Plain_Paper
     *       * Partnered EU: PackageLabel_A4_2
     *       * JP/CN: PackageLabel_Plain_Paper
    *
    * @param request
    *           GetUniquePackageLabelsRequest request.
    *
    * @return Future<GetUniquePackageLabelsResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<GetUniquePackageLabelsResponse> getUniquePackageLabelsAsync(GetUniquePackageLabelsRequest request) {
        return newFuture(getUniquePackageLabels(request));
    }

    /**
     * List Inbound Shipment Items
     * Gets the first set of inbound shipment items for the given ShipmentId or
     * all inbound shipment items updated between the given date range.
     * A NextToken is also returned to further iterate through the Seller's
     * remaining inbound shipment items. To get the next set of inbound
     * shipment items, you must call ListInboundShipmentItemsByNextToken and
     * pass in the 'NextToken' this call returned. If a NextToken is not
     * returned, it indicates the end-of-data. Use LastUpdatedBefore
     * and LastUpdatedAfter to filter results based on last updated time.
     * Either the ShipmentId or a pair of LastUpdatedBefore and LastUpdatedAfter
     * must be passed in. if ShipmentId is set, the LastUpdatedBefore and
     * LastUpdatedAfter will be ignored.
     *
     * @param request
     *           ListInboundShipmentItemsRequest request.
     *
     * @return ListInboundShipmentItemsResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public ListInboundShipmentItemsResponse listInboundShipmentItems(ListInboundShipmentItemsRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(ListInboundShipmentItemsResponse.class);
    }

    /**
    * List Inbound Shipment Items
    * Gets the first set of inbound shipment items for the given ShipmentId or
     * all inbound shipment items updated between the given date range.
     * A NextToken is also returned to further iterate through the Seller's
     * remaining inbound shipment items. To get the next set of inbound
     * shipment items, you must call ListInboundShipmentItemsByNextToken and
     * pass in the 'NextToken' this call returned. If a NextToken is not
     * returned, it indicates the end-of-data. Use LastUpdatedBefore
     * and LastUpdatedAfter to filter results based on last updated time.
     * Either the ShipmentId or a pair of LastUpdatedBefore and LastUpdatedAfter
     * must be passed in. if ShipmentId is set, the LastUpdatedBefore and
     * LastUpdatedAfter will be ignored.
    *
    * @param request
    *           ListInboundShipmentItemsRequest request.
    *
    * @return Future<ListInboundShipmentItemsResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<ListInboundShipmentItemsResponse> listInboundShipmentItemsAsync(ListInboundShipmentItemsRequest request) {
        return newFuture(listInboundShipmentItems(request));
    }

    /**
     * List Inbound Shipment Items By Next Token
     * Gets the next set of inbound shipment items with the NextToken
     * which can be used to iterate through the remaining inbound shipment
     * items. If a NextToken is not returned, it indicates the end-of-data.
     * You must first call ListInboundShipmentItems to get a 'NextToken'.
     *
     * @param request
     *           ListInboundShipmentItemsByNextTokenRequest request.
     *
     * @return ListInboundShipmentItemsByNextTokenResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public ListInboundShipmentItemsByNextTokenResponse listInboundShipmentItemsByNextToken(ListInboundShipmentItemsByNextTokenRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(ListInboundShipmentItemsByNextTokenResponse.class);
    }

    /**
    * List Inbound Shipment Items By Next Token
    * Gets the next set of inbound shipment items with the NextToken
     * which can be used to iterate through the remaining inbound shipment
     * items. If a NextToken is not returned, it indicates the end-of-data.
     * You must first call ListInboundShipmentItems to get a 'NextToken'.
    *
    * @param request
    *           ListInboundShipmentItemsByNextTokenRequest request.
    *
    * @return Future<ListInboundShipmentItemsByNextTokenResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<ListInboundShipmentItemsByNextTokenResponse> listInboundShipmentItemsByNextTokenAsync(ListInboundShipmentItemsByNextTokenRequest request) {
        return newFuture(listInboundShipmentItemsByNextToken(request));
    }

    /**
     * List Inbound Shipments
     * Get the first set of inbound shipments created by a Seller according to
     * the specified shipment status or the specified shipment Id. A NextToken
     * is also returned to further iterate through the Seller's remaining
     * shipments. If a NextToken is not returned, it indicates the end-of-data.
     * At least one of ShipmentStatusList and ShipmentIdList must be passed in.
     * if both are passed in, then only shipments that match the specified
     * shipment Id and specified shipment status will be returned.
     * the LastUpdatedBefore and LastUpdatedAfter are optional, they are used
     * to filter results based on last update time of the shipment.
     *
     * @param request
     *           ListInboundShipmentsRequest request.
     *
     * @return ListInboundShipmentsResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public ListInboundShipmentsResponse listInboundShipments(ListInboundShipmentsRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(ListInboundShipmentsResponse.class);
    }

    /**
    * List Inbound Shipments
    * Get the first set of inbound shipments created by a Seller according to
     * the specified shipment status or the specified shipment Id. A NextToken
     * is also returned to further iterate through the Seller's remaining
     * shipments. If a NextToken is not returned, it indicates the end-of-data.
     * At least one of ShipmentStatusList and ShipmentIdList must be passed in.
     * if both are passed in, then only shipments that match the specified
     * shipment Id and specified shipment status will be returned.
     * the LastUpdatedBefore and LastUpdatedAfter are optional, they are used
     * to filter results based on last update time of the shipment.
    *
    * @param request
    *           ListInboundShipmentsRequest request.
    *
    * @return Future<ListInboundShipmentsResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<ListInboundShipmentsResponse> listInboundShipmentsAsync(ListInboundShipmentsRequest request) {
        return newFuture(listInboundShipments(request));
    }

    /**
     * List Inbound Shipments By Next Token
     * Gets the next set of inbound shipments created by a Seller with the
     * NextToken which can be used to iterate through the remaining inbound
     * shipments. If a NextToken is not returned, it indicates the end-of-data.
     *
     * @param request
     *           ListInboundShipmentsByNextTokenRequest request.
     *
     * @return ListInboundShipmentsByNextTokenResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public ListInboundShipmentsByNextTokenResponse listInboundShipmentsByNextToken(ListInboundShipmentsByNextTokenRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(ListInboundShipmentsByNextTokenResponse.class);
    }

    /**
    * List Inbound Shipments By Next Token
    * Gets the next set of inbound shipments created by a Seller with the
     * NextToken which can be used to iterate through the remaining inbound
     * shipments. If a NextToken is not returned, it indicates the end-of-data.
    *
    * @param request
    *           ListInboundShipmentsByNextTokenRequest request.
    *
    * @return Future<ListInboundShipmentsByNextTokenResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<ListInboundShipmentsByNextTokenResponse> listInboundShipmentsByNextTokenAsync(ListInboundShipmentsByNextTokenRequest request) {
        return newFuture(listInboundShipmentsByNextToken(request));
    }

    /**
     * Put Transport Content
     * A write operation which sellers use to provide transportation details regarding
     *     how an inbound shipment will arrive at Amazon's Fulfillment Centers.
     *
     * @param request
     *           PutTransportContentRequest request.
     *
     * @return PutTransportContentResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public PutTransportContentResponse putTransportContent(PutTransportContentRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(PutTransportContentResponse.class);
    }

    /**
    * Put Transport Content
    * A write operation which sellers use to provide transportation details regarding
     *     how an inbound shipment will arrive at Amazon's Fulfillment Centers.
    *
    * @param request
    *           PutTransportContentRequest request.
    *
    * @return Future<PutTransportContentResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<PutTransportContentResponse> putTransportContentAsync(PutTransportContentRequest request) {
        return newFuture(putTransportContent(request));
    }

    /**
     * Update Inbound Shipment
     * Updates an pre-existing inbound shipment specified by the
     * ShipmentId. It may include up to 200 items.
     * If InboundShipmentHeader is set. it replaces the header information
     * for the given shipment.
     * If InboundShipmentItems is set. it adds, replaces and removes
     * the line time to inbound shipment.
     * For non-existing item, it will add the item for new line item;
     * For existing line items, it will replace the QuantityShipped for the item.
     * For QuantityShipped = 0, it indicates the item should be removed from the shipment
     *
     * This operation will simply return a shipment Id upon success,
     * otherwise an explicit error will be returned.
     *
     * @param request
     *           UpdateInboundShipmentRequest request.
     *
     * @return UpdateInboundShipmentResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public UpdateInboundShipmentResponse updateInboundShipment(UpdateInboundShipmentRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(UpdateInboundShipmentResponse.class);
    }

    /**
    * Update Inbound Shipment
    * Updates an pre-existing inbound shipment specified by the
     * ShipmentId. It may include up to 200 items.
     * If InboundShipmentHeader is set. it replaces the header information
     * for the given shipment.
     * If InboundShipmentItems is set. it adds, replaces and removes
     * the line time to inbound shipment.
     * For non-existing item, it will add the item for new line item;
     * For existing line items, it will replace the QuantityShipped for the item.
     * For QuantityShipped = 0, it indicates the item should be removed from the shipment
     *
     * This operation will simply return a shipment Id upon success,
     * otherwise an explicit error will be returned.
    *
    * @param request
    *           UpdateInboundShipmentRequest request.
    *
    * @return Future<UpdateInboundShipmentResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<UpdateInboundShipmentResponse> updateInboundShipmentAsync(UpdateInboundShipmentRequest request) {
        return newFuture(updateInboundShipment(request));
    }

    /**
     * Void Transport Request
     * Voids a previously-confirmed transport request. It only succeeds for requests
     *     made by the VoidDeadline provided in the PartneredEstimate component of the
     *     response of the GetTransportContent operation for a shipment. Currently this
     *     deadline is 24 hours after confirming a transport request for a partnered small parcel
     *     request and 1 hour after confirming a transport request for a partnered LTL/TL
     *     request, though this is subject to change at any time without notice.
     *
     * @param request
     *           VoidTransportInputRequest request.
     *
     * @return VoidTransportRequestResponse response.
     *
     * @throws FBAInboundServiceMWSException
     */
    public VoidTransportRequestResponse voidTransportRequest(VoidTransportInputRequest request)
            throws FBAInboundServiceMWSException {
        return newResponse(VoidTransportRequestResponse.class);
    }

    /**
    * Void Transport Request
    * Voids a previously-confirmed transport request. It only succeeds for requests
     *     made by the VoidDeadline provided in the PartneredEstimate component of the
     *     response of the GetTransportContent operation for a shipment. Currently this
     *     deadline is 24 hours after confirming a transport request for a partnered small parcel
     *     request and 1 hour after confirming a transport request for a partnered LTL/TL
     *     request, though this is subject to change at any time without notice.
    *
    * @param request
    *           VoidTransportInputRequest request.
    *
    * @return Future<VoidTransportRequestResponse> Future containing completed response
    *
    * @throws FBAInboundServiceMWSException
    */
    public Future<VoidTransportRequestResponse> voidTransportRequestAsync(VoidTransportInputRequest request) {
        return newFuture(voidTransportRequest(request));
    }

}

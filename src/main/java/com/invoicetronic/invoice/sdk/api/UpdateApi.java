/*
 * Italian eInvoice API
 * The Italian eInvoice API is a RESTful API that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. The API also provides advanced features as encryption at rest, invoice validation, multiple upload formats, webhooks, event logging, client SDKs for commonly used languages, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.invoicetronic.invoice.sdk.api;

import com.invoicetronic.invoice.sdk.ApiCallback;
import com.invoicetronic.invoice.sdk.ApiClient;
import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.ApiResponse;
import com.invoicetronic.invoice.sdk.Configuration;
import com.invoicetronic.invoice.sdk.Pair;
import com.invoicetronic.invoice.sdk.ProgressRequestBody;
import com.invoicetronic.invoice.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.time.OffsetDateTime;
import com.invoicetronic.invoice.sdk.model.ProblemHttpResult;
import com.invoicetronic.invoice.sdk.model.Update;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UpdateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UpdateApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for invoiceV1UpdateGet
     * @param companyId Company id (optional)
     * @param identifier SDI identifier. (optional)
     * @param unread Unread items only. (optional)
     * @param sendId Send item&#39;s id. (optional)
     * @param state SDI state (optional)
     * @param lastUpdateFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param lastUpdateTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param page Page number. Defaults to 1. (optional, default to 1)
     * @param pageSize Items per page. Defaults to 50. Cannot be greater than 200. (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoiceV1UpdateGetCall(Integer companyId, String identifier, Boolean unread, Integer sendId, String state, OffsetDateTime lastUpdateFrom, OffsetDateTime lastUpdateTo, OffsetDateTime dateSentFrom, OffsetDateTime dateSentTo, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/invoice/v1/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (companyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("company_id", companyId));
        }

        if (identifier != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifier", identifier));
        }

        if (unread != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("unread", unread));
        }

        if (sendId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("send_id", sendId));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("state", state));
        }

        if (lastUpdateFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_update_from", lastUpdateFrom));
        }

        if (lastUpdateTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_update_to", lastUpdateTo));
        }

        if (dateSentFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_sent_from", dateSentFrom));
        }

        if (dateSentTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_sent_to", dateSentTo));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invoiceV1UpdateGetValidateBeforeCall(Integer companyId, String identifier, Boolean unread, Integer sendId, String state, OffsetDateTime lastUpdateFrom, OffsetDateTime lastUpdateTo, OffsetDateTime dateSentFrom, OffsetDateTime dateSentTo, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return invoiceV1UpdateGetCall(companyId, identifier, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize, _callback);

    }

    /**
     * List updates
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     * @param companyId Company id (optional)
     * @param identifier SDI identifier. (optional)
     * @param unread Unread items only. (optional)
     * @param sendId Send item&#39;s id. (optional)
     * @param state SDI state (optional)
     * @param lastUpdateFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param lastUpdateTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param page Page number. Defaults to 1. (optional, default to 1)
     * @param pageSize Items per page. Defaults to 50. Cannot be greater than 200. (optional, default to 100)
     * @return List&lt;Update&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public List<Update> invoiceV1UpdateGet(Integer companyId, String identifier, Boolean unread, Integer sendId, String state, OffsetDateTime lastUpdateFrom, OffsetDateTime lastUpdateTo, OffsetDateTime dateSentFrom, OffsetDateTime dateSentTo, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<List<Update>> localVarResp = invoiceV1UpdateGetWithHttpInfo(companyId, identifier, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * List updates
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     * @param companyId Company id (optional)
     * @param identifier SDI identifier. (optional)
     * @param unread Unread items only. (optional)
     * @param sendId Send item&#39;s id. (optional)
     * @param state SDI state (optional)
     * @param lastUpdateFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param lastUpdateTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param page Page number. Defaults to 1. (optional, default to 1)
     * @param pageSize Items per page. Defaults to 50. Cannot be greater than 200. (optional, default to 100)
     * @return ApiResponse&lt;List&lt;Update&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Update>> invoiceV1UpdateGetWithHttpInfo(Integer companyId, String identifier, Boolean unread, Integer sendId, String state, OffsetDateTime lastUpdateFrom, OffsetDateTime lastUpdateTo, OffsetDateTime dateSentFrom, OffsetDateTime dateSentTo, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = invoiceV1UpdateGetValidateBeforeCall(companyId, identifier, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize, null);
        Type localVarReturnType = new TypeToken<List<Update>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List updates (asynchronously)
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     * @param companyId Company id (optional)
     * @param identifier SDI identifier. (optional)
     * @param unread Unread items only. (optional)
     * @param sendId Send item&#39;s id. (optional)
     * @param state SDI state (optional)
     * @param lastUpdateFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param lastUpdateTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentFrom UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param dateSentTo UTC ISO 8601 (2024-11-29T12:34:56Z) (optional)
     * @param page Page number. Defaults to 1. (optional, default to 1)
     * @param pageSize Items per page. Defaults to 50. Cannot be greater than 200. (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoiceV1UpdateGetAsync(Integer companyId, String identifier, Boolean unread, Integer sendId, String state, OffsetDateTime lastUpdateFrom, OffsetDateTime lastUpdateTo, OffsetDateTime dateSentFrom, OffsetDateTime dateSentTo, Integer page, Integer pageSize, final ApiCallback<List<Update>> _callback) throws ApiException {

        okhttp3.Call localVarCall = invoiceV1UpdateGetValidateBeforeCall(companyId, identifier, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<List<Update>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for invoiceV1UpdateIdGet
     * @param id Item id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoiceV1UpdateIdGetCall(Integer id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/invoice/v1/update/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invoiceV1UpdateIdGetValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling invoiceV1UpdateIdGet(Async)");
        }

        return invoiceV1UpdateIdGetCall(id, _callback);

    }

    /**
     * Get an update by id
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     * @param id Item id (required)
     * @return Update
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public Update invoiceV1UpdateIdGet(Integer id) throws ApiException {
        ApiResponse<Update> localVarResp = invoiceV1UpdateIdGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get an update by id
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     * @param id Item id (required)
     * @return ApiResponse&lt;Update&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Update> invoiceV1UpdateIdGetWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = invoiceV1UpdateIdGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Update>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an update by id (asynchronously)
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     * @param id Item id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invoiceV1UpdateIdGetAsync(Integer id, final ApiCallback<Update> _callback) throws ApiException {

        okhttp3.Call localVarCall = invoiceV1UpdateIdGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Update>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

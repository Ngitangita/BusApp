/*
 * BusApp
 * Mon STD22047
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BusLine;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusLineApi {
    private ApiClient localVarApiClient;

    public BusLineApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BusLineApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createBusLine
     * @param busLine Created busLine object (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBusLineCall(BusLine busLine, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = busLine;

        // create path and map variables
        String localVarPath = "/busLine/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createBusLineValidateBeforeCall(BusLine busLine, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createBusLineCall(busLine, _callback);
        return localVarCall;

    }

    /**
     * Create busLine
     * This can only be done by the logged in busLine.
     * @param busLine Created busLine object (optional)
     * @return BusLine
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public BusLine createBusLine(BusLine busLine) throws ApiException {
        ApiResponse<BusLine> localVarResp = createBusLineWithHttpInfo(busLine);
        return localVarResp.getData();
    }

    /**
     * Create busLine
     * This can only be done by the logged in busLine.
     * @param busLine Created busLine object (optional)
     * @return ApiResponse&lt;BusLine&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BusLine> createBusLineWithHttpInfo(BusLine busLine) throws ApiException {
        okhttp3.Call localVarCall = createBusLineValidateBeforeCall(busLine, null);
        Type localVarReturnType = new TypeToken<BusLine>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create busLine (asynchronously)
     * This can only be done by the logged in busLine.
     * @param busLine Created busLine object (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBusLineAsync(BusLine busLine, final ApiCallback<BusLine> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBusLineValidateBeforeCall(busLine, _callback);
        Type localVarReturnType = new TypeToken<BusLine>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteBusLine
     * @param id The id that needs to be deleted (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid lineNumber supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Id not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBusLineCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/busLine/delete/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteBusLineValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteBusLine(Async)");
        }
        

        okhttp3.Call localVarCall = deleteBusLineCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete busLine
     * This can only be done by the logged in busLine.
     * @param id The id that needs to be deleted (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid lineNumber supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Id not found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteBusLine(String id) throws ApiException {
        deleteBusLineWithHttpInfo(id);
    }

    /**
     * Delete busLine
     * This can only be done by the logged in busLine.
     * @param id The id that needs to be deleted (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid lineNumber supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Id not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteBusLineWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = deleteBusLineValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete busLine (asynchronously)
     * This can only be done by the logged in busLine.
     * @param id The id that needs to be deleted (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid lineNumber supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Id not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBusLineAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteBusLineValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBusLine
     * @param id The name that needs to be fetched. Use busLine1 for testing.  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid busLineId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> BusLine not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBusLineCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/busLine/get/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBusLineValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBusLine(Async)");
        }
        

        okhttp3.Call localVarCall = getBusLineCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get route by busLine id
     * 
     * @param id The name that needs to be fetched. Use busLine1 for testing.  (required)
     * @return BusLine
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid busLineId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> BusLine not found </td><td>  -  </td></tr>
     </table>
     */
    public BusLine getBusLine(String id) throws ApiException {
        ApiResponse<BusLine> localVarResp = getBusLineWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get route by busLine id
     * 
     * @param id The name that needs to be fetched. Use busLine1 for testing.  (required)
     * @return ApiResponse&lt;BusLine&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid busLineId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> BusLine not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BusLine> getBusLineWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getBusLineValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<BusLine>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get route by busLine id (asynchronously)
     * 
     * @param id The name that needs to be fetched. Use busLine1 for testing.  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid busLineId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> BusLine not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBusLineAsync(String id, final ApiCallback<BusLine> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBusLineValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<BusLine>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateBusLine
     * @param id name that need to be deleted (required)
     * @param busLine Update an existent busLine in the busLine (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateBusLineCall(String id, BusLine busLine, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = busLine;

        // create path and map variables
        String localVarPath = "/busLine/update/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateBusLineValidateBeforeCall(String id, BusLine busLine, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateBusLine(Async)");
        }
        

        okhttp3.Call localVarCall = updateBusLineCall(id, busLine, _callback);
        return localVarCall;

    }

    /**
     * Update busLine
     * This can only be done by the logged in busLine.
     * @param id name that need to be deleted (required)
     * @param busLine Update an existent busLine in the busLine (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public void updateBusLine(String id, BusLine busLine) throws ApiException {
        updateBusLineWithHttpInfo(id, busLine);
    }

    /**
     * Update busLine
     * This can only be done by the logged in busLine.
     * @param id name that need to be deleted (required)
     * @param busLine Update an existent busLine in the busLine (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateBusLineWithHttpInfo(String id, BusLine busLine) throws ApiException {
        okhttp3.Call localVarCall = updateBusLineValidateBeforeCall(id, busLine, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update busLine (asynchronously)
     * This can only be done by the logged in busLine.
     * @param id name that need to be deleted (required)
     * @param busLine Update an existent busLine in the busLine (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateBusLineAsync(String id, BusLine busLine, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateBusLineValidateBeforeCall(id, busLine, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
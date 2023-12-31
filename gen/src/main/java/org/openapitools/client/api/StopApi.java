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


import org.openapitools.client.model.Stop;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopApi {
    private ApiClient localVarApiClient;

    public StopApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StopApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createStop
     * @param stop Created stop object (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createStopCall(Stop stop, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = stop;

        // create path and map variables
        String localVarPath = "/stop/add";

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
    private okhttp3.Call createStopValidateBeforeCall(Stop stop, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createStopCall(stop, _callback);
        return localVarCall;

    }

    /**
     * Create stop
     * This can only be done by the logged in stop.
     * @param stop Created stop object (optional)
     * @return Stop
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public Stop createStop(Stop stop) throws ApiException {
        ApiResponse<Stop> localVarResp = createStopWithHttpInfo(stop);
        return localVarResp.getData();
    }

    /**
     * Create stop
     * This can only be done by the logged in stop.
     * @param stop Created stop object (optional)
     * @return ApiResponse&lt;Stop&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Stop> createStopWithHttpInfo(Stop stop) throws ApiException {
        okhttp3.Call localVarCall = createStopValidateBeforeCall(stop, null);
        Type localVarReturnType = new TypeToken<Stop>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create stop (asynchronously)
     * This can only be done by the logged in stop.
     * @param stop Created stop object (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createStopAsync(Stop stop, final ApiCallback<Stop> _callback) throws ApiException {

        okhttp3.Call localVarCall = createStopValidateBeforeCall(stop, _callback);
        Type localVarReturnType = new TypeToken<Stop>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteStopByID
     * @param id The name that needs to be deleted (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid stopName supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteStopByIDCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stop/delete/{id}"
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
    private okhttp3.Call deleteStopByIDValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteStopByID(Async)");
        }
        

        okhttp3.Call localVarCall = deleteStopByIDCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete stop
     * This can only be done by the logged in stop.
     * @param id The name that needs to be deleted (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid stopName supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteStopByID(String id) throws ApiException {
        deleteStopByIDWithHttpInfo(id);
    }

    /**
     * Delete stop
     * This can only be done by the logged in stop.
     * @param id The name that needs to be deleted (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid stopName supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteStopByIDWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = deleteStopByIDValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete stop (asynchronously)
     * This can only be done by the logged in stop.
     * @param id The name that needs to be deleted (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid stopName supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteStopByIDAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteStopByIDValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getStop
     * @param id The name that needs to be fetched. Use stop1 for testing.  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid stopId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStopCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stop/get/{id}"
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
    private okhttp3.Call getStopValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getStop(Async)");
        }
        

        okhttp3.Call localVarCall = getStopCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get teacher by stop id
     * 
     * @param id The name that needs to be fetched. Use stop1 for testing.  (required)
     * @return Stop
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid stopId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public Stop getStop(String id) throws ApiException {
        ApiResponse<Stop> localVarResp = getStopWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get teacher by stop id
     * 
     * @param id The name that needs to be fetched. Use stop1 for testing.  (required)
     * @return ApiResponse&lt;Stop&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid stopId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Stop> getStopWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getStopValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Stop>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get teacher by stop id (asynchronously)
     * 
     * @param id The name that needs to be fetched. Use stop1 for testing.  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid stopId supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStopAsync(String id, final ApiCallback<Stop> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStopValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Stop>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateStopById
     * @param id name that need to be deleted (required)
     * @param stop Update an existent stop in the store (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateStopByIdCall(String id, Stop stop, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = stop;

        // create path and map variables
        String localVarPath = "/stop/update/put/{id}"
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
    private okhttp3.Call updateStopByIdValidateBeforeCall(String id, Stop stop, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateStopById(Async)");
        }
        

        okhttp3.Call localVarCall = updateStopByIdCall(id, stop, _callback);
        return localVarCall;

    }

    /**
     * Update stop
     * This can only be done by the logged in stop.
     * @param id name that need to be deleted (required)
     * @param stop Update an existent stop in the store (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public void updateStopById(String id, Stop stop) throws ApiException {
        updateStopByIdWithHttpInfo(id, stop);
    }

    /**
     * Update stop
     * This can only be done by the logged in stop.
     * @param id name that need to be deleted (required)
     * @param stop Update an existent stop in the store (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateStopByIdWithHttpInfo(String id, Stop stop) throws ApiException {
        okhttp3.Call localVarCall = updateStopByIdValidateBeforeCall(id, stop, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update stop (asynchronously)
     * This can only be done by the logged in stop.
     * @param id name that need to be deleted (required)
     * @param stop Update an existent stop in the store (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateStopByIdAsync(String id, Stop stop, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateStopByIdValidateBeforeCall(id, stop, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

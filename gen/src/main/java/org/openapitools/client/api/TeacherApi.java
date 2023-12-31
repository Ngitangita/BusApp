/*
 * Onbourding API
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


import org.openapitools.client.model.Teacher;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherApi {
    private ApiClient localVarApiClient;

    public TeacherApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TeacherApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createTeacher
     * @param teacher Created teacher object (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTeacherCall(Teacher teacher, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = teacher;

        // create path and map variables
        String localVarPath = "/teacher";

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
    private okhttp3.Call createTeacherValidateBeforeCall(Teacher teacher, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createTeacherCall(teacher, _callback);
        return localVarCall;

    }

    /**
     * Create teacher
     * This can only be done by the logged in teacher.
     * @param teacher Created teacher object (optional)
     * @return Teacher
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public Teacher createTeacher(Teacher teacher) throws ApiException {
        ApiResponse<Teacher> localVarResp = createTeacherWithHttpInfo(teacher);
        return localVarResp.getData();
    }

    /**
     * Create teacher
     * This can only be done by the logged in teacher.
     * @param teacher Created teacher object (optional)
     * @return ApiResponse&lt;Teacher&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Teacher> createTeacherWithHttpInfo(Teacher teacher) throws ApiException {
        okhttp3.Call localVarCall = createTeacherValidateBeforeCall(teacher, null);
        Type localVarReturnType = new TypeToken<Teacher>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create teacher (asynchronously)
     * This can only be done by the logged in teacher.
     * @param teacher Created teacher object (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTeacherAsync(Teacher teacher, final ApiCallback<Teacher> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTeacherValidateBeforeCall(teacher, _callback);
        Type localVarReturnType = new TypeToken<Teacher>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTeacherByName
     * @param toky The name that needs to be fetched. Use teacher1 for testing.  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid teachername supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Teacher not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTeacherByNameCall(String toky, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/teacher/{Toky}"
            .replaceAll("\\{" + "Toky" + "\\}", localVarApiClient.escapeString(toky.toString()));

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
    private okhttp3.Call getTeacherByNameValidateBeforeCall(String toky, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'toky' is set
        if (toky == null) {
            throw new ApiException("Missing the required parameter 'toky' when calling getTeacherByName(Async)");
        }
        

        okhttp3.Call localVarCall = getTeacherByNameCall(toky, _callback);
        return localVarCall;

    }

    /**
     * Get teacher by teacher name
     * 
     * @param toky The name that needs to be fetched. Use teacher1 for testing.  (required)
     * @return Teacher
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid teachername supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Teacher not found </td><td>  -  </td></tr>
     </table>
     */
    public Teacher getTeacherByName(String toky) throws ApiException {
        ApiResponse<Teacher> localVarResp = getTeacherByNameWithHttpInfo(toky);
        return localVarResp.getData();
    }

    /**
     * Get teacher by teacher name
     * 
     * @param toky The name that needs to be fetched. Use teacher1 for testing.  (required)
     * @return ApiResponse&lt;Teacher&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid teachername supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Teacher not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Teacher> getTeacherByNameWithHttpInfo(String toky) throws ApiException {
        okhttp3.Call localVarCall = getTeacherByNameValidateBeforeCall(toky, null);
        Type localVarReturnType = new TypeToken<Teacher>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get teacher by teacher name (asynchronously)
     * 
     * @param toky The name that needs to be fetched. Use teacher1 for testing.  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid teachername supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Teacher not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTeacherByNameAsync(String toky, final ApiCallback<Teacher> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTeacherByNameValidateBeforeCall(toky, _callback);
        Type localVarReturnType = new TypeToken<Teacher>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

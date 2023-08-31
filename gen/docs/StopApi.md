# StopApi

All URIs are relative to *https://STD22047.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStop**](StopApi.md#createStop) | **POST** /stop/add | Create stop
[**deleteStopByID**](StopApi.md#deleteStopByID) | **DELETE** /stop/delete/{id} | Delete stop
[**getStop**](StopApi.md#getStop) | **GET** /stop/get/{id} | Get teacher by stop id
[**updateStopById**](StopApi.md#updateStopById) | **PUT** /stop/update/put/{id} | Update stop


<a name="createStop"></a>
# **createStop**
> Stop createStop(stop)

Create stop

This can only be done by the logged in stop.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StopApi apiInstance = new StopApi(defaultClient);
    Stop stop = new Stop(); // Stop | Created stop object
    try {
      Stop result = apiInstance.createStop(stop);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StopApi#createStop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stop** | [**Stop**](Stop.md)| Created stop object | [optional]

### Return type

[**Stop**](Stop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="deleteStopByID"></a>
# **deleteStopByID**
> deleteStopByID(id)

Delete stop

This can only be done by the logged in stop.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StopApi apiInstance = new StopApi(defaultClient);
    String id = "id_example"; // String | The name that needs to be deleted
    try {
      apiInstance.deleteStopByID(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling StopApi#deleteStopByID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The name that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Invalid stopName supplied |  -  |
**404** | Stop not found |  -  |

<a name="getStop"></a>
# **getStop**
> Stop getStop(id)

Get teacher by stop id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StopApi apiInstance = new StopApi(defaultClient);
    String id = "id_example"; // String | The name that needs to be fetched. Use stop1 for testing. 
    try {
      Stop result = apiInstance.getStop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StopApi#getStop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The name that needs to be fetched. Use stop1 for testing.  |

### Return type

[**Stop**](Stop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid stopId supplied |  -  |
**404** | Stop not found |  -  |

<a name="updateStopById"></a>
# **updateStopById**
> updateStopById(id, stop)

Update stop

This can only be done by the logged in stop.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StopApi apiInstance = new StopApi(defaultClient);
    String id = "id_example"; // String | name that need to be deleted
    Stop stop = new Stop(); // Stop | Update an existent stop in the store
    try {
      apiInstance.updateStopById(id, stop);
    } catch (ApiException e) {
      System.err.println("Exception when calling StopApi#updateStopById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| name that need to be deleted |
 **stop** | [**Stop**](Stop.md)| Update an existent stop in the store | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |


# BusLineApi

All URIs are relative to *https://STD22047.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBusLine**](BusLineApi.md#createBusLine) | **POST** /busLine/add | Create busLine
[**deleteBusLine**](BusLineApi.md#deleteBusLine) | **DELETE** /busLine/delete/{id} | Delete busLine
[**getBusLine**](BusLineApi.md#getBusLine) | **GET** /busLine/get/{id} | Get route by busLine id
[**updateBusLine**](BusLineApi.md#updateBusLine) | **PUT** /busLine/update/{id} | Update busLine


<a name="createBusLine"></a>
# **createBusLine**
> BusLine createBusLine(busLine)

Create busLine

This can only be done by the logged in busLine.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusLineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    BusLineApi apiInstance = new BusLineApi(defaultClient);
    BusLine busLine = new BusLine(); // BusLine | Created busLine object
    try {
      BusLine result = apiInstance.createBusLine(busLine);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusLineApi#createBusLine");
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
 **busLine** | [**BusLine**](BusLine.md)| Created busLine object | [optional]

### Return type

[**BusLine**](BusLine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="deleteBusLine"></a>
# **deleteBusLine**
> deleteBusLine(id)

Delete busLine

This can only be done by the logged in busLine.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusLineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    BusLineApi apiInstance = new BusLineApi(defaultClient);
    String id = "id_example"; // String | The id that needs to be deleted
    try {
      apiInstance.deleteBusLine(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusLineApi#deleteBusLine");
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
 **id** | **String**| The id that needs to be deleted |

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
**400** | Invalid lineNumber supplied |  -  |
**404** | Id not found |  -  |

<a name="getBusLine"></a>
# **getBusLine**
> BusLine getBusLine(id)

Get route by busLine id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusLineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    BusLineApi apiInstance = new BusLineApi(defaultClient);
    String id = "id_example"; // String | The name that needs to be fetched. Use busLine1 for testing. 
    try {
      BusLine result = apiInstance.getBusLine(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusLineApi#getBusLine");
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
 **id** | **String**| The name that needs to be fetched. Use busLine1 for testing.  |

### Return type

[**BusLine**](BusLine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid busLineId supplied |  -  |
**404** | BusLine not found |  -  |

<a name="updateBusLine"></a>
# **updateBusLine**
> updateBusLine(id, busLine)

Update busLine

This can only be done by the logged in busLine.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusLineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    BusLineApi apiInstance = new BusLineApi(defaultClient);
    String id = "id_example"; // String | name that need to be deleted
    BusLine busLine = new BusLine(); // BusLine | Update an existent busLine in the busLine
    try {
      apiInstance.updateBusLine(id, busLine);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusLineApi#updateBusLine");
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
 **busLine** | [**BusLine**](BusLine.md)| Update an existent busLine in the busLine | [optional]

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


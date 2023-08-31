# RouteApi

All URIs are relative to *https://STD22047.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoutes**](RouteApi.md#createRoutes) | **POST** /route/add | Create route
[**deleteRoute**](RouteApi.md#deleteRoute) | **DELETE** /route/delete/{id} | Delete route
[**getRoute**](RouteApi.md#getRoute) | **GET** /route/get/{id} | Get route by route id
[**updateRoute**](RouteApi.md#updateRoute) | **PUT** /route/update/{id} | Update route


<a name="createRoutes"></a>
# **createRoutes**
> Route createRoutes(route)

Create route

This can only be done by the logged in route.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    RouteApi apiInstance = new RouteApi(defaultClient);
    Route route = new Route(); // Route | Created route object
    try {
      Route result = apiInstance.createRoutes(route);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteApi#createRoutes");
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
 **route** | [**Route**](Route.md)| Created route object | [optional]

### Return type

[**Route**](Route.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="deleteRoute"></a>
# **deleteRoute**
> deleteRoute(id)

Delete route

This can only be done by the logged in route.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    RouteApi apiInstance = new RouteApi(defaultClient);
    String id = "id_example"; // String | The id that needs to be deleted
    try {
      apiInstance.deleteRoute(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteApi#deleteRoute");
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
**400** | Invalid routeName supplied |  -  |
**404** | Id not found |  -  |

<a name="getRoute"></a>
# **getRoute**
> Route getRoute(id)

Get route by route id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    RouteApi apiInstance = new RouteApi(defaultClient);
    String id = "id_example"; // String | The name that needs to be fetched. Use route1 for testing. 
    try {
      Route result = apiInstance.getRoute(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteApi#getRoute");
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
 **id** | **String**| The name that needs to be fetched. Use route1 for testing.  |

### Return type

[**Route**](Route.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid routeId supplied |  -  |
**404** | Stop not found |  -  |

<a name="updateRoute"></a>
# **updateRoute**
> updateRoute(id, route)

Update route

This can only be done by the logged in route.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    RouteApi apiInstance = new RouteApi(defaultClient);
    String id = "id_example"; // String | name that need to be deleted
    Route route = new Route(); // Route | Update an existent route in the store
    try {
      apiInstance.updateRoute(id, route);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteApi#updateRoute");
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
 **route** | [**Route**](Route.md)| Update an existent route in the store | [optional]

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


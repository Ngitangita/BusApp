# TeacherApi

All URIs are relative to *https://STD22047.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTeacher**](TeacherApi.md#createTeacher) | **POST** /teacher | Create teacher
[**getTeacherByName**](TeacherApi.md#getTeacherByName) | **GET** /teacher/{Toky} | Get teacher by teacher name


<a name="createTeacher"></a>
# **createTeacher**
> Teacher createTeacher(teacher)

Create teacher

This can only be done by the logged in teacher.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeacherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    TeacherApi apiInstance = new TeacherApi(defaultClient);
    Teacher teacher = new Teacher(); // Teacher | Created teacher object
    try {
      Teacher result = apiInstance.createTeacher(teacher);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeacherApi#createTeacher");
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
 **teacher** | [**Teacher**](Teacher.md)| Created teacher object | [optional]

### Return type

[**Teacher**](Teacher.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="getTeacherByName"></a>
# **getTeacherByName**
> Teacher getTeacherByName(toky)

Get teacher by teacher name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeacherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    TeacherApi apiInstance = new TeacherApi(defaultClient);
    String toky = "toky_example"; // String | The name that needs to be fetched. Use teacher1 for testing. 
    try {
      Teacher result = apiInstance.getTeacherByName(toky);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeacherApi#getTeacherByName");
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
 **toky** | **String**| The name that needs to be fetched. Use teacher1 for testing.  |

### Return type

[**Teacher**](Teacher.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid teachername supplied |  -  |
**404** | Teacher not found |  -  |


# StudentsApi

All URIs are relative to *https://STD22047.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStudents**](StudentsApi.md#createStudents) | **POST** /students | Create students
[**deleteStudents**](StudentsApi.md#deleteStudents) | **DELETE** /students/{Elisé} | Delete students
[**getStudentsByName**](StudentsApi.md#getStudentsByName) | **GET** /students/{Elisé} | Get students by students name
[**updateStudents**](StudentsApi.md#updateStudents) | **PUT** /students/{Elisé} | Update students


<a name="createStudents"></a>
# **createStudents**
> Student createStudents(student)

Create students

This can only be done by the logged in students.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StudentsApi apiInstance = new StudentsApi(defaultClient);
    Student student = new Student(); // Student | Created students object
    try {
      Student result = apiInstance.createStudents(student);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentsApi#createStudents");
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
 **student** | [**Student**](Student.md)| Created students object | [optional]

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="deleteStudents"></a>
# **deleteStudents**
> deleteStudents(elisé)

Delete students

This can only be done by the logged in students.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StudentsApi apiInstance = new StudentsApi(defaultClient);
    String elisé = "elisé_example"; // String | The name that needs to be deleted
    try {
      apiInstance.deleteStudents(elisé);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentsApi#deleteStudents");
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
 **elisé** | **String**| The name that needs to be deleted |

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
**400** | Invalid studentsname supplied |  -  |
**404** | Students not found |  -  |

<a name="getStudentsByName"></a>
# **getStudentsByName**
> Student getStudentsByName(elisé)

Get students by students name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StudentsApi apiInstance = new StudentsApi(defaultClient);
    String elisé = "elisé_example"; // String | The name that needs to be fetched. Use students1 for testing. 
    try {
      Student result = apiInstance.getStudentsByName(elisé);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentsApi#getStudentsByName");
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
 **elisé** | **String**| The name that needs to be fetched. Use students1 for testing.  |

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid studentsname supplied |  -  |
**404** | Students not found |  -  |

<a name="updateStudents"></a>
# **updateStudents**
> updateStudents(elisé, student)

Update students

This can only be done by the logged in students.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://STD22047.com");

    StudentsApi apiInstance = new StudentsApi(defaultClient);
    String elisé = "elisé_example"; // String | name that need to be deleted
    Student student = new Student(); // Student | Update an existent students in the store
    try {
      apiInstance.updateStudents(elisé, student);
    } catch (ApiException e) {
      System.err.println("Exception when calling StudentsApi#updateStudents");
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
 **elisé** | **String**| name that need to be deleted |
 **student** | [**Student**](Student.md)| Update an existent students in the store | [optional]

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


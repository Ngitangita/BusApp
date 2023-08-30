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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Teacher;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeacherApi
 */
@Ignore
public class TeacherApiTest {

    private final TeacherApi api = new TeacherApi();

    
    /**
     * Create teacher
     *
     * This can only be done by the logged in teacher.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTeacherTest() throws ApiException {
        Teacher teacher = null;
        Teacher response = api.createTeacher(teacher);

        // TODO: test validations
    }
    
    /**
     * Get teacher by teacher name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeacherByNameTest() throws ApiException {
        String toky = null;
        Teacher response = api.getTeacherByName(toky);

        // TODO: test validations
    }
    
}

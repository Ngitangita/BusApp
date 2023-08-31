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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Route;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RouteApi
 */
@Ignore
public class RouteApiTest {

    private final RouteApi api = new RouteApi();

    
    /**
     * Create route
     *
     * This can only be done by the logged in route.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoutesTest() throws ApiException {
        Route route = null;
        Route response = api.createRoutes(route);

        // TODO: test validations
    }
    
    /**
     * Delete route
     *
     * This can only be done by the logged in route.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRouteTest() throws ApiException {
        String id = null;
        api.deleteRoute(id);

        // TODO: test validations
    }
    
    /**
     * Get route by route id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRouteTest() throws ApiException {
        String id = null;
        Route response = api.getRoute(id);

        // TODO: test validations
    }
    
    /**
     * Update route
     *
     * This can only be done by the logged in route.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRouteTest() throws ApiException {
        String id = null;
        Route route = null;
        api.updateRoute(id, route);

        // TODO: test validations
    }
    
}
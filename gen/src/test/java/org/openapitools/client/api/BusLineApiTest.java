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
import org.openapitools.client.model.BusLine;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BusLineApi
 */
@Ignore
public class BusLineApiTest {

    private final BusLineApi api = new BusLineApi();

    
    /**
     * Create busLine
     *
     * This can only be done by the logged in busLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBusLineTest() throws ApiException {
        BusLine busLine = null;
        BusLine response = api.createBusLine(busLine);

        // TODO: test validations
    }
    
    /**
     * Delete busLine
     *
     * This can only be done by the logged in busLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBusLineTest() throws ApiException {
        String id = null;
        api.deleteBusLine(id);

        // TODO: test validations
    }
    
    /**
     * Get route by busLine id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBusLineTest() throws ApiException {
        String id = null;
        BusLine response = api.getBusLine(id);

        // TODO: test validations
    }
    
    /**
     * Update busLine
     *
     * This can only be done by the logged in busLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBusLineTest() throws ApiException {
        String id = null;
        BusLine busLine = null;
        api.updateBusLine(id, busLine);

        // TODO: test validations
    }
    
}
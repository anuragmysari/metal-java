/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.IPAssignment;
import com.equinix.openapi.metal.v1.model.IPReservation;
import com.equinix.openapi.metal.v1.model.IPReservationFacility;
import com.equinix.openapi.metal.v1.model.IPReservationMetro;
import com.equinix.openapi.metal.v1.model.MetalGatewayLite;
import com.equinix.openapi.metal.v1.model.ParentBlock;
import com.equinix.openapi.metal.v1.model.Project;
import com.equinix.openapi.metal.v1.model.User;
import com.equinix.openapi.metal.v1.model.Vrf;
import com.equinix.openapi.metal.v1.model.VrfIPReservation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for FindIPAddressById200Response
 */
public class FindIPAddressById200ResponseTest {
    private final FindIPAddressById200Response model = new FindIPAddressById200Response();

    /**
     * Model tests for FindIPAddressById200Response
     */
    @Test
    public void testFindIPAddressById200Response() {
        // TODO: test FindIPAddressById200Response
    }

    /**
     * Test the property 'address'
     */
    @Test
    public void addressTest() {
        // TODO: test address
    }

    /**
     * Test the property 'addressFamily'
     */
    @Test
    public void addressFamilyTest() {
        // TODO: test addressFamily
    }

    /**
     * Test the property 'assignedTo'
     */
    @Test
    public void assignedToTest() {
        // TODO: test assignedTo
    }

    /**
     * Test the property 'cidr'
     */
    @Test
    public void cidrTest() {
        // TODO: test cidr
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'gateway'
     */
    @Test
    public void gatewayTest() {
        // TODO: test gateway
    }

    /**
     * Test the property 'globalIp'
     */
    @Test
    public void globalIpTest() {
        // TODO: test globalIp
    }

    /**
     * Test the property 'href'
     */
    @Test
    public void hrefTest() {
        // TODO: test href
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'manageable'
     */
    @Test
    public void manageableTest() {
        // TODO: test manageable
    }

    /**
     * Test the property 'management'
     */
    @Test
    public void managementTest() {
        // TODO: test management
    }

    /**
     * Test the property 'metro'
     */
    @Test
    public void metroTest() {
        // TODO: test metro
    }

    /**
     * Test the property 'netmask'
     */
    @Test
    public void netmaskTest() {
        // TODO: test netmask
    }

    /**
     * Test the property 'network'
     */
    @Test
    public void networkTest() {
        // TODO: test network
    }

    /**
     * Test the property 'parentBlock'
     */
    @Test
    public void parentBlockTest() {
        // TODO: test parentBlock
    }

    /**
     * Test the property '_public'
     */
    @Test
    public void _publicTest() {
        // TODO: test _public
    }

    /**
     * Test the property 'addon'
     */
    @Test
    public void addonTest() {
        // TODO: test addon
    }

    /**
     * Test the property 'assignments'
     */
    @Test
    public void assignmentsTest() {
        // TODO: test assignments
    }

    /**
     * Test the property 'bill'
     */
    @Test
    public void billTest() {
        // TODO: test bill
    }

    /**
     * Test the property 'facility'
     */
    @Test
    public void facilityTest() {
        // TODO: test facility
    }

    /**
     * Test the property 'metalGateway'
     */
    @Test
    public void metalGatewayTest() {
        // TODO: test metalGateway
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'details'
     */
    @Test
    public void detailsTest() {
        // TODO: test details
    }

    /**
     * Test the property 'customdata'
     */
    @Test
    public void customdataTest() {
        // TODO: test customdata
    }

    /**
     * Test the property 'project'
     */
    @Test
    public void projectTest() {
        // TODO: test project
    }

    /**
     * Test the property 'projectLite'
     */
    @Test
    public void projectLiteTest() {
        // TODO: test projectLite
    }

    /**
     * Test the property 'requestedBy'
     */
    @Test
    public void requestedByTest() {
        // TODO: test requestedBy
    }

    /**
     * Test the property 'available'
     */
    @Test
    public void availableTest() {
        // TODO: test available
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'vrf'
     */
    @Test
    public void vrfTest() {
        // TODO: test vrf
    }

}

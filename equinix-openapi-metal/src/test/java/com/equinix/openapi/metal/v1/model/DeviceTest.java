/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import com.equinix.openapi.metal.v1.model.DeviceActionsInner;
import com.equinix.openapi.metal.v1.model.DeviceCreatedBy;
import com.equinix.openapi.metal.v1.model.DeviceMetro;
import com.equinix.openapi.metal.v1.model.DeviceProject;
import com.equinix.openapi.metal.v1.model.DeviceProjectLite;
import com.equinix.openapi.metal.v1.model.Event;
import com.equinix.openapi.metal.v1.model.Facility;
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.IPAssignment;
import com.equinix.openapi.metal.v1.model.OperatingSystem;
import com.equinix.openapi.metal.v1.model.Plan;
import com.equinix.openapi.metal.v1.model.Port;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Device
 */
public class DeviceTest {
    private final Device model = new Device();

    /**
     * Model tests for Device
     */
    @Test
    public void testDevice() {
        // TODO: test Device
    }

    /**
     * Test the property 'alwaysPxe'
     */
    @Test
    public void alwaysPxeTest() {
        // TODO: test alwaysPxe
    }

    /**
     * Test the property 'billingCycle'
     */
    @Test
    public void billingCycleTest() {
        // TODO: test billingCycle
    }

    /**
     * Test the property 'bondingMode'
     */
    @Test
    public void bondingModeTest() {
        // TODO: test bondingMode
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'customdata'
     */
    @Test
    public void customdataTest() {
        // TODO: test customdata
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'facility'
     */
    @Test
    public void facilityTest() {
        // TODO: test facility
    }

    /**
     * Test the property 'hardwareReservation'
     */
    @Test
    public void hardwareReservationTest() {
        // TODO: test hardwareReservation
    }

    /**
     * Test the property 'hostname'
     */
    @Test
    public void hostnameTest() {
        // TODO: test hostname
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
     * Test the property 'imageUrl'
     */
    @Test
    public void imageUrlTest() {
        // TODO: test imageUrl
    }

    /**
     * Test the property 'ipAddresses'
     */
    @Test
    public void ipAddressesTest() {
        // TODO: test ipAddresses
    }

    /**
     * Test the property 'ipxeScriptUrl'
     */
    @Test
    public void ipxeScriptUrlTest() {
        // TODO: test ipxeScriptUrl
    }

    /**
     * Test the property 'iqn'
     */
    @Test
    public void iqnTest() {
        // TODO: test iqn
    }

    /**
     * Test the property 'locked'
     */
    @Test
    public void lockedTest() {
        // TODO: test locked
    }

    /**
     * Test the property 'metro'
     */
    @Test
    public void metroTest() {
        // TODO: test metro
    }

    /**
     * Test the property 'networkPorts'
     */
    @Test
    public void networkPortsTest() {
        // TODO: test networkPorts
    }

    /**
     * Test the property 'operatingSystem'
     */
    @Test
    public void operatingSystemTest() {
        // TODO: test operatingSystem
    }

    /**
     * Test the property 'actions'
     */
    @Test
    public void actionsTest() {
        // TODO: test actions
    }

    /**
     * Test the property 'plan'
     */
    @Test
    public void planTest() {
        // TODO: test plan
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
     * Test the property 'provisioningEvents'
     */
    @Test
    public void provisioningEventsTest() {
        // TODO: test provisioningEvents
    }

    /**
     * Test the property 'provisioningPercentage'
     */
    @Test
    public void provisioningPercentageTest() {
        // TODO: test provisioningPercentage
    }

    /**
     * Test the property 'rootPassword'
     */
    @Test
    public void rootPasswordTest() {
        // TODO: test rootPassword
    }

    /**
     * Test the property 'shortId'
     */
    @Test
    public void shortIdTest() {
        // TODO: test shortId
    }

    /**
     * Test the property 'spotInstance'
     */
    @Test
    public void spotInstanceTest() {
        // TODO: test spotInstance
    }

    /**
     * Test the property 'spotPriceMax'
     */
    @Test
    public void spotPriceMaxTest() {
        // TODO: test spotPriceMax
    }

    /**
     * Test the property 'sshKeys'
     */
    @Test
    public void sshKeysTest() {
        // TODO: test sshKeys
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'switchUuid'
     */
    @Test
    public void switchUuidTest() {
        // TODO: test switchUuid
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'terminationTime'
     */
    @Test
    public void terminationTimeTest() {
        // TODO: test terminationTime
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'user'
     */
    @Test
    public void userTest() {
        // TODO: test user
    }

    /**
     * Test the property 'userdata'
     */
    @Test
    public void userdataTest() {
        // TODO: test userdata
    }

    /**
     * Test the property 'volumes'
     */
    @Test
    public void volumesTest() {
        // TODO: test volumes
    }

}

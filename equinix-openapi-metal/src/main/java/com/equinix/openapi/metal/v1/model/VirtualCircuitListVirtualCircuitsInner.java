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

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.VirtualCircuit;
import com.equinix.openapi.metal.v1.model.Vrf;
import com.equinix.openapi.metal.v1.model.VrfVirtualCircuit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.equinix.openapi.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualCircuitListVirtualCircuitsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(VirtualCircuitListVirtualCircuitsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VirtualCircuitListVirtualCircuitsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VirtualCircuitListVirtualCircuitsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VirtualCircuit> adapterVirtualCircuit = gson.getDelegateAdapter(this, TypeToken.get(VirtualCircuit.class));
            final TypeAdapter<VrfVirtualCircuit> adapterVrfVirtualCircuit = gson.getDelegateAdapter(this, TypeToken.get(VrfVirtualCircuit.class));

            return (TypeAdapter<T>) new TypeAdapter<VirtualCircuitListVirtualCircuitsInner>() {
                @Override
                public void write(JsonWriter out, VirtualCircuitListVirtualCircuitsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `VirtualCircuit`
                    if (value.getActualInstance() instanceof VirtualCircuit) {
                        JsonObject obj = adapterVirtualCircuit.toJsonTree((VirtualCircuit)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `VrfVirtualCircuit`
                    if (value.getActualInstance() instanceof VrfVirtualCircuit) {
                        JsonObject obj = adapterVrfVirtualCircuit.toJsonTree((VrfVirtualCircuit)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: VirtualCircuit, VrfVirtualCircuit");
                }

                @Override
                public VirtualCircuitListVirtualCircuitsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize VirtualCircuit
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VirtualCircuit.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'VirtualCircuit'");
                        VirtualCircuitListVirtualCircuitsInner ret = new VirtualCircuitListVirtualCircuitsInner();
                        ret.setActualInstance(adapterVirtualCircuit.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'VirtualCircuit'", e);
                    }

                    // deserialize VrfVirtualCircuit
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VrfVirtualCircuit.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'VrfVirtualCircuit'");
                        VirtualCircuitListVirtualCircuitsInner ret = new VirtualCircuitListVirtualCircuitsInner();
                        ret.setActualInstance(adapterVrfVirtualCircuit.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'VrfVirtualCircuit'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for VirtualCircuitListVirtualCircuitsInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public VirtualCircuitListVirtualCircuitsInner() {
        super("anyOf", Boolean.FALSE);
    }

    public VirtualCircuitListVirtualCircuitsInner(VirtualCircuit o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public VirtualCircuitListVirtualCircuitsInner(VrfVirtualCircuit o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("VirtualCircuit", new GenericType<VirtualCircuit>() {
        });
        schemas.put("VrfVirtualCircuit", new GenericType<VrfVirtualCircuit>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return VirtualCircuitListVirtualCircuitsInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * VirtualCircuit, VrfVirtualCircuit
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof VirtualCircuit) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof VrfVirtualCircuit) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be VirtualCircuit, VrfVirtualCircuit");
    }

    /**
     * Get the actual instance, which can be the following:
     * VirtualCircuit, VrfVirtualCircuit
     *
     * @return The actual instance (VirtualCircuit, VrfVirtualCircuit)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `VirtualCircuit`. If the actual instance is not `VirtualCircuit`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VirtualCircuit`
     * @throws ClassCastException if the instance is not `VirtualCircuit`
     */
    public VirtualCircuit getVirtualCircuit() throws ClassCastException {
        return (VirtualCircuit)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VrfVirtualCircuit`. If the actual instance is not `VrfVirtualCircuit`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VrfVirtualCircuit`
     * @throws ClassCastException if the instance is not `VrfVirtualCircuit`
     */
    public VrfVirtualCircuit getVrfVirtualCircuit() throws ClassCastException {
        return (VrfVirtualCircuit)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VirtualCircuitListVirtualCircuitsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with VirtualCircuit
    try {
      VirtualCircuit.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with VrfVirtualCircuit
    try {
      VrfVirtualCircuit.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for VirtualCircuitListVirtualCircuitsInner with anyOf schemas: VirtualCircuit, VrfVirtualCircuit. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of VirtualCircuitListVirtualCircuitsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VirtualCircuitListVirtualCircuitsInner
  * @throws IOException if the JSON string is invalid with respect to VirtualCircuitListVirtualCircuitsInner
  */
  public static VirtualCircuitListVirtualCircuitsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualCircuitListVirtualCircuitsInner.class);
  }

 /**
  * Convert an instance of VirtualCircuitListVirtualCircuitsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


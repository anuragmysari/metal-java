/**
 * Packet API
 * This is the API for Packet. Interact with your devices, user account, and projects.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: help@packet.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.packet.client.api;

import com.sun.jersey.api.client.GenericType;

import net.packet.client.ApiException;
import net.packet.client.ApiClient;
import net.packet.client.Configuration;
import net.packet.client.model.*;
import net.packet.client.Pair;

import net.packet.client.model.IPReservation;
import net.packet.client.model.IPReservationRequestInput;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-01T08:27:06.669-05:00")
public class IPReservationsApi {
  private ApiClient apiClient;

  public IPReservationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IPReservationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete the ip reservation
   * Remove an IP reservation from the project.
   * @param reservationId IP Reservation UUID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIPReservation(String reservationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reservationId' is set
    if (reservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'reservationId' when calling deleteIPReservation");
    }
    
    // create path and map variables
    String localVarPath = "/ips/{reservation_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "reservation_id" + "\\}", apiClient.escapeString(reservationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "x_auth_token" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieve an ip reservation
   * Returns a single ip reservation if the user has access
   * @param reservationId IP Reservation UUID (required)
   * @param include related attributes to include (optional)
   * @return IPReservation
   * @throws ApiException if fails to make API call
   */
  public IPReservation findIPReservationById(String reservationId, String include) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reservationId' is set
    if (reservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'reservationId' when calling findIPReservationById");
    }
    
    // create path and map variables
    String localVarPath = "/ips/{reservation_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "reservation_id" + "\\}", apiClient.escapeString(reservationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "x_auth_token" };

    GenericType<IPReservation> localVarReturnType = new GenericType<IPReservation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Requesting ip reservations
   * Request more IP space for a project in order to have additional IP addresses to assign to devices.
   * @param projectId Project UUID (required)
   * @param ipReservationRequest IP Reservation Request to create (required)
   * @throws ApiException if fails to make API call
   */
  public void requestIPReservation(String projectId, IPReservationRequestInput ipReservationRequest) throws ApiException {
    Object localVarPostBody = ipReservationRequest;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling requestIPReservation");
    }
    
    // verify the required parameter 'ipReservationRequest' is set
    if (ipReservationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ipReservationRequest' when calling requestIPReservation");
    }
    
    // create path and map variables
    String localVarPath = "/projects/{id}/ips".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "x_auth_token" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}

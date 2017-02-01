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


package net.packet.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CapacityPerBaremetal
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-01T08:27:06.669-05:00")
public class CapacityPerBaremetal   {
  @JsonProperty("level")
  private String level = null;

  @JsonProperty("available_servers")
  private Integer availableServers = null;

  @JsonProperty("total_servers")
  private Integer totalServers = null;

  @JsonProperty("market_buffer_percentage")
  private Integer marketBufferPercentage = null;

  @JsonProperty("market_floor_price")
  private Float marketFloorPrice = null;

  public CapacityPerBaremetal level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public CapacityPerBaremetal availableServers(Integer availableServers) {
    this.availableServers = availableServers;
    return this;
  }

   /**
   * Get availableServers
   * @return availableServers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAvailableServers() {
    return availableServers;
  }

  public void setAvailableServers(Integer availableServers) {
    this.availableServers = availableServers;
  }

  public CapacityPerBaremetal totalServers(Integer totalServers) {
    this.totalServers = totalServers;
    return this;
  }

   /**
   * Get totalServers
   * @return totalServers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalServers() {
    return totalServers;
  }

  public void setTotalServers(Integer totalServers) {
    this.totalServers = totalServers;
  }

  public CapacityPerBaremetal marketBufferPercentage(Integer marketBufferPercentage) {
    this.marketBufferPercentage = marketBufferPercentage;
    return this;
  }

   /**
   * Get marketBufferPercentage
   * @return marketBufferPercentage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMarketBufferPercentage() {
    return marketBufferPercentage;
  }

  public void setMarketBufferPercentage(Integer marketBufferPercentage) {
    this.marketBufferPercentage = marketBufferPercentage;
  }

  public CapacityPerBaremetal marketFloorPrice(Float marketFloorPrice) {
    this.marketFloorPrice = marketFloorPrice;
    return this;
  }

   /**
   * Get marketFloorPrice
   * @return marketFloorPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getMarketFloorPrice() {
    return marketFloorPrice;
  }

  public void setMarketFloorPrice(Float marketFloorPrice) {
    this.marketFloorPrice = marketFloorPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPerBaremetal capacityPerBaremetal = (CapacityPerBaremetal) o;
    return Objects.equals(this.level, capacityPerBaremetal.level) &&
        Objects.equals(this.availableServers, capacityPerBaremetal.availableServers) &&
        Objects.equals(this.totalServers, capacityPerBaremetal.totalServers) &&
        Objects.equals(this.marketBufferPercentage, capacityPerBaremetal.marketBufferPercentage) &&
        Objects.equals(this.marketFloorPrice, capacityPerBaremetal.marketFloorPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, availableServers, totalServers, marketBufferPercentage, marketFloorPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPerBaremetal {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    availableServers: ").append(toIndentedString(availableServers)).append("\n");
    sb.append("    totalServers: ").append(toIndentedString(totalServers)).append("\n");
    sb.append("    marketBufferPercentage: ").append(toIndentedString(marketBufferPercentage)).append("\n");
    sb.append("    marketFloorPrice: ").append(toIndentedString(marketFloorPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


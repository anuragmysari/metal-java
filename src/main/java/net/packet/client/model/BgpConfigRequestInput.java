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
 * BgpConfigRequestInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-01T08:27:06.669-05:00")
public class BgpConfigRequestInput   {
  @JsonProperty("deployment_type")
  private String deploymentType = null;

  @JsonProperty("asn")
  private Integer asn = null;

  @JsonProperty("md5")
  private String md5 = null;

  @JsonProperty("use_case")
  private String useCase = null;

  public BgpConfigRequestInput deploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * Get deploymentType
   * @return deploymentType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
  }

  public BgpConfigRequestInput asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getAsn() {
    return asn;
  }

  public void setAsn(Integer asn) {
    this.asn = asn;
  }

  public BgpConfigRequestInput md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public BgpConfigRequestInput useCase(String useCase) {
    this.useCase = useCase;
    return this;
  }

   /**
   * Get useCase
   * @return useCase
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUseCase() {
    return useCase;
  }

  public void setUseCase(String useCase) {
    this.useCase = useCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpConfigRequestInput bgpConfigRequestInput = (BgpConfigRequestInput) o;
    return Objects.equals(this.deploymentType, bgpConfigRequestInput.deploymentType) &&
        Objects.equals(this.asn, bgpConfigRequestInput.asn) &&
        Objects.equals(this.md5, bgpConfigRequestInput.md5) &&
        Objects.equals(this.useCase, bgpConfigRequestInput.useCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentType, asn, md5, useCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpConfigRequestInput {\n");
    
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
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


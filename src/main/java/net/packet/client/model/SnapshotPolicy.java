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
import net.packet.client.model.Href;
import org.joda.time.DateTime;


/**
 * SnapshotPolicy
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-01T08:27:06.669-05:00")
public class SnapshotPolicy   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("snapshot_count")
  private Integer snapshotCount = null;

  @JsonProperty("snapshot_frequency")
  private String snapshotFrequency = null;

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  @JsonProperty("updated_at")
  private DateTime updatedAt = null;

  @JsonProperty("volume")
  private Href volume = null;

  @JsonProperty("href")
  private String href = null;

  public SnapshotPolicy id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SnapshotPolicy snapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
    return this;
  }

   /**
   * Get snapshotCount
   * maximum: 256.0
   * @return snapshotCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSnapshotCount() {
    return snapshotCount;
  }

  public void setSnapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
  }

  public SnapshotPolicy snapshotFrequency(String snapshotFrequency) {
    this.snapshotFrequency = snapshotFrequency;
    return this;
  }

   /**
   * Get snapshotFrequency
   * @return snapshotFrequency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSnapshotFrequency() {
    return snapshotFrequency;
  }

  public void setSnapshotFrequency(String snapshotFrequency) {
    this.snapshotFrequency = snapshotFrequency;
  }

  public SnapshotPolicy createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SnapshotPolicy updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public SnapshotPolicy volume(Href volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(example = "null", value = "")
  public Href getVolume() {
    return volume;
  }

  public void setVolume(Href volume) {
    this.volume = volume;
  }

  public SnapshotPolicy href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotPolicy snapshotPolicy = (SnapshotPolicy) o;
    return Objects.equals(this.id, snapshotPolicy.id) &&
        Objects.equals(this.snapshotCount, snapshotPolicy.snapshotCount) &&
        Objects.equals(this.snapshotFrequency, snapshotPolicy.snapshotFrequency) &&
        Objects.equals(this.createdAt, snapshotPolicy.createdAt) &&
        Objects.equals(this.updatedAt, snapshotPolicy.updatedAt) &&
        Objects.equals(this.volume, snapshotPolicy.volume) &&
        Objects.equals(this.href, snapshotPolicy.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, snapshotCount, snapshotFrequency, createdAt, updatedAt, volume, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotPolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    snapshotCount: ").append(toIndentedString(snapshotCount)).append("\n");
    sb.append("    snapshotFrequency: ").append(toIndentedString(snapshotFrequency)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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


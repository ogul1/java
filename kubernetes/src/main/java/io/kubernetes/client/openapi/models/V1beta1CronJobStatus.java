/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CronJobStatus represents the current state of a cron job.
 */
@ApiModel(description = "CronJobStatus represents the current state of a cron job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-20T22:55:54.394Z[Etc/UTC]")
public class V1beta1CronJobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<V1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULE_TIME = "lastScheduleTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULE_TIME)
  private OffsetDateTime lastScheduleTime;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_TIME = "lastSuccessfulTime";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_TIME)
  private OffsetDateTime lastSuccessfulTime;


  public V1beta1CronJobStatus active(List<V1ObjectReference> active) {
    
    this.active = active;
    return this;
  }

  public V1beta1CronJobStatus addActiveItem(V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * A list of pointers to currently running jobs.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of pointers to currently running jobs.")

  public List<V1ObjectReference> getActive() {
    return active;
  }


  public void setActive(List<V1ObjectReference> active) {
    this.active = active;
  }


  public V1beta1CronJobStatus lastScheduleTime(OffsetDateTime lastScheduleTime) {
    
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

   /**
   * Information when was the last time the job was successfully scheduled.
   * @return lastScheduleTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information when was the last time the job was successfully scheduled.")

  public OffsetDateTime getLastScheduleTime() {
    return lastScheduleTime;
  }


  public void setLastScheduleTime(OffsetDateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }


  public V1beta1CronJobStatus lastSuccessfulTime(OffsetDateTime lastSuccessfulTime) {
    
    this.lastSuccessfulTime = lastSuccessfulTime;
    return this;
  }

   /**
   * Information when was the last time the job successfully completed.
   * @return lastSuccessfulTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information when was the last time the job successfully completed.")

  public OffsetDateTime getLastSuccessfulTime() {
    return lastSuccessfulTime;
  }


  public void setLastSuccessfulTime(OffsetDateTime lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CronJobStatus v1beta1CronJobStatus = (V1beta1CronJobStatus) o;
    return Objects.equals(this.active, v1beta1CronJobStatus.active) &&
        Objects.equals(this.lastScheduleTime, v1beta1CronJobStatus.lastScheduleTime) &&
        Objects.equals(this.lastSuccessfulTime, v1beta1CronJobStatus.lastSuccessfulTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime, lastSuccessfulTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CronJobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
    sb.append("    lastSuccessfulTime: ").append(toIndentedString(lastSuccessfulTime)).append("\n");
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


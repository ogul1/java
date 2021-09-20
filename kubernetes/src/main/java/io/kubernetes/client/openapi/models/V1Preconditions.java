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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 */
@ApiModel(description = "Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-20T22:55:54.394Z[Etc/UTC]")
public class V1Preconditions {
  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public V1Preconditions resourceVersion(String resourceVersion) {
    
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Specifies the target ResourceVersion
   * @return resourceVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the target ResourceVersion")

  public String getResourceVersion() {
    return resourceVersion;
  }


  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public V1Preconditions uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Specifies the target UID.
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the target UID.")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Preconditions v1Preconditions = (V1Preconditions) o;
    return Objects.equals(this.resourceVersion, v1Preconditions.resourceVersion) &&
        Objects.equals(this.uid, v1Preconditions.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceVersion, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Preconditions {\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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


/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Credentials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-04T15:10:30.801Z")
public class Credentials {
  @SerializedName("district_username")
  private String districtUsername = null;

  public Credentials districtUsername(String districtUsername) {
    this.districtUsername = districtUsername;
    return this;
  }

   /**
   * Get districtUsername
   * @return districtUsername
  **/
  @ApiModelProperty(value = "")
  public String getDistrictUsername() {
    return districtUsername;
  }

  public void setDistrictUsername(String districtUsername) {
    this.districtUsername = districtUsername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credentials credentials = (Credentials) o;
    return Objects.equals(this.districtUsername, credentials.districtUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtUsername);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credentials {\n");
    
    sb.append("    districtUsername: ").append(toIndentedString(districtUsername)).append("\n");
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


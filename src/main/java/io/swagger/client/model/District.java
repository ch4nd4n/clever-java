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
 * District
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-15T20:43:34.953Z")
public class District {
  @SerializedName("id")
  private String id = null;

  @SerializedName("mdr_number")
  private String mdrNumber = null;

  @SerializedName("name")
  private String name = null;

  public District id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public District mdrNumber(String mdrNumber) {
    this.mdrNumber = mdrNumber;
    return this;
  }

   /**
   * Get mdrNumber
   * @return mdrNumber
  **/
  @ApiModelProperty(value = "")
  public String getMdrNumber() {
    return mdrNumber;
  }

  public void setMdrNumber(String mdrNumber) {
    this.mdrNumber = mdrNumber;
  }

  public District name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    District district = (District) o;
    return Objects.equals(this.id, district.id) &&
        Objects.equals(this.mdrNumber, district.mdrNumber) &&
        Objects.equals(this.name, district.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mdrNumber, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class District {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mdrNumber: ").append(toIndentedString(mdrNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


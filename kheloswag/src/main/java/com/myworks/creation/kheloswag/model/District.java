package com.myworks.creation.kheloswag.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * District
 */
@Validated

public class District   {
  @JsonProperty("districtId")
  private Integer districtId = null;

  @JsonProperty("stateId")
  private Integer stateId = null;

  @JsonProperty("districtName")
  private String districtName = null;

  @JsonProperty("creationTime")
  private String creationTime = null;

  @JsonProperty("modificationTime")
  private String modificationTime = null;

  public District districtId(Integer districtId) {
    this.districtId = districtId;
    return this;
  }

  /**
   * Get districtId
   * @return districtId
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getDistrictId() {
    return districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

  public District stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  public District districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Get districtName
   * @return districtName
  **/
  @ApiModelProperty(example = "Vizag", value = "")


  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public District creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
  **/
  @ApiModelProperty(example = "2019-10-11", value = "")


  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public District modificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
    return this;
  }

  /**
   * Get modificationTime
   * @return modificationTime
  **/
  @ApiModelProperty(example = "2019-10-11", value = "")


  public String getModificationTime() {
    return modificationTime;
  }

  public void setModificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
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
    return Objects.equals(this.districtId, district.districtId) &&
        Objects.equals(this.stateId, district.stateId) &&
        Objects.equals(this.districtName, district.districtName) &&
        Objects.equals(this.creationTime, district.creationTime) &&
        Objects.equals(this.modificationTime, district.modificationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtId, stateId, districtName, creationTime, modificationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class District {\n");
    
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    modificationTime: ").append(toIndentedString(modificationTime)).append("\n");
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


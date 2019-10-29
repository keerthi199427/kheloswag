package com.myworks.creation.kheloswag.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.myworks.creation.kheloswag.model.District;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Districts
 */
@Validated

public class Districts   {
  @JsonProperty("districtsList")
  @Valid
  private List<District> districtsList = null;

  public Districts districtsList(List<District> districtsList) {
    this.districtsList = districtsList;
    return this;
  }

  public Districts addDistrictsListItem(District districtsListItem) {
    if (this.districtsList == null) {
      this.districtsList = new ArrayList<>();
    }
    this.districtsList.add(districtsListItem);
    return this;
  }

  /**
   * Get districtsList
   * @return districtsList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<District> getDistrictsList() {
    return districtsList;
  }

  public void setDistrictsList(List<District> districtsList) {
    this.districtsList = districtsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Districts districts = (Districts) o;
    return Objects.equals(this.districtsList, districts.districtsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Districts {\n");
    
    sb.append("    districtsList: ").append(toIndentedString(districtsList)).append("\n");
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


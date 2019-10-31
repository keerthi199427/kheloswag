package com.myworks.creation.kheloswag.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.myworks.creation.kheloswag.model.Ground;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Grounds
 */
@Validated

public class Grounds   {
  @JsonProperty("groundsList")
  @Valid
  private List<Ground> groundsList = null;

  public Grounds groundsList(List<Ground> groundsList) {
    this.groundsList = groundsList;
    return this;
  }

  public Grounds addGroundsListItem(Ground groundsListItem) {
    if (this.groundsList == null) {
      this.groundsList = new ArrayList<>();
    }
    this.groundsList.add(groundsListItem);
    return this;
  }

  /**
   * Get groundsList
   * @return groundsList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Ground> getGroundsList() {
    return groundsList;
  }

  public void setGroundsList(List<Ground> groundsList) {
    this.groundsList = groundsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grounds grounds = (Grounds) o;
    return Objects.equals(this.groundsList, grounds.groundsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groundsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grounds {\n");
    
    sb.append("    groundsList: ").append(toIndentedString(groundsList)).append("\n");
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


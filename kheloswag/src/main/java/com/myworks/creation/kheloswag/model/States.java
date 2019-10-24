package com.myworks.creation.kheloswag.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.myworks.creation.kheloswag.model.State;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * States
 */
@Validated

public class States   {
  @JsonProperty("statesList")
  @Valid
  private List<State> statesList = null;

  public States statesList(List<State> statesList) {
    this.statesList = statesList;
    return this;
  }

  public States addStatesListItem(State statesListItem) {
    if (this.statesList == null) {
      this.statesList = new ArrayList<>();
    }
    this.statesList.add(statesListItem);
    return this;
  }

  /**
   * Get statesList
   * @return statesList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<State> getStatesList() {
    return statesList;
  }

  public void setStatesList(List<State> statesList) {
    this.statesList = statesList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    States states = (States) o;
    return Objects.equals(this.statesList, states.statesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statesList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class States {\n");
    
    sb.append("    statesList: ").append(toIndentedString(statesList)).append("\n");
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


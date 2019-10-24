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
 * State
 */
@Validated

public class State   {
  @JsonProperty("stateId")
  private Integer stateId = null;

  @JsonProperty("stateName")
  private String stateName = null;

  @JsonProperty("creationTime")
  private String creationTime = null;

  @JsonProperty("modificationTime")
  private String modificationTime = null;

  public State stateId(Integer stateId) {
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

  public State stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

  /**
   * Get stateName
   * @return stateName
  **/
  @ApiModelProperty(example = "Orissa", value = "")


  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public State creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
  **/
  @ApiModelProperty(example = "Orissa", value = "")


  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public State modificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
    return this;
  }

  /**
   * Get modificationTime
   * @return modificationTime
  **/
  @ApiModelProperty(example = "Orissa", value = "")


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
    State state = (State) o;
    return Objects.equals(this.stateId, state.stateId) &&
        Objects.equals(this.stateName, state.stateName) &&
        Objects.equals(this.creationTime, state.creationTime) &&
        Objects.equals(this.modificationTime, state.modificationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateId, stateName, creationTime, modificationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
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


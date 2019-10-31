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
 * Ground
 */
@Validated

public class Ground   {
  @JsonProperty("groundId")
  private Integer groundId = null;

  @JsonProperty("groundName")
  private String groundName = null;

  @JsonProperty("groundState")
  private String groundState = null;

  @JsonProperty("groundDistrict")
  private String groundDistrict = null;

  @JsonProperty("gameId")
  private Integer gameId = null;

  @JsonProperty("gameName")
  private String gameName = null;

  @JsonProperty("groundCreationTime")
  private String groundCreationTime = null;

  @JsonProperty("groundModificationTime")
  private String groundModificationTime = null;

  @JsonProperty("groundActive")
  private Boolean groundActive = null;

  public Ground groundId(Integer groundId) {
    this.groundId = groundId;
    return this;
  }

  /**
   * Get groundId
   * @return groundId
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getGroundId() {
    return groundId;
  }

  public void setGroundId(Integer groundId) {
    this.groundId = groundId;
  }

  public Ground groundName(String groundName) {
    this.groundName = groundName;
    return this;
  }

  /**
   * Get groundName
   * @return groundName
  **/
  @ApiModelProperty(example = "ZPH- Public grounds", value = "")


  public String getGroundName() {
    return groundName;
  }

  public void setGroundName(String groundName) {
    this.groundName = groundName;
  }

  public Ground groundState(String groundState) {
    this.groundState = groundState;
    return this;
  }

  /**
   * Get groundState
   * @return groundState
  **/
  @ApiModelProperty(example = "Andhra Pradesh", value = "")


  public String getGroundState() {
    return groundState;
  }

  public void setGroundState(String groundState) {
    this.groundState = groundState;
  }

  public Ground groundDistrict(String groundDistrict) {
    this.groundDistrict = groundDistrict;
    return this;
  }

  /**
   * Get groundDistrict
   * @return groundDistrict
  **/
  @ApiModelProperty(example = "Visakha", value = "")


  public String getGroundDistrict() {
    return groundDistrict;
  }

  public void setGroundDistrict(String groundDistrict) {
    this.groundDistrict = groundDistrict;
  }

  public Ground gameId(Integer gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Get gameId
   * @return gameId
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public Ground gameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

  /**
   * Get gameName
   * @return gameName
  **/
  @ApiModelProperty(example = "Cricket", value = "")


  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public Ground groundCreationTime(String groundCreationTime) {
    this.groundCreationTime = groundCreationTime;
    return this;
  }

  /**
   * Get groundCreationTime
   * @return groundCreationTime
  **/
  @ApiModelProperty(example = "2019-10-11 10:25", value = "")


  public String getGroundCreationTime() {
    return groundCreationTime;
  }

  public void setGroundCreationTime(String groundCreationTime) {
    this.groundCreationTime = groundCreationTime;
  }

  public Ground groundModificationTime(String groundModificationTime) {
    this.groundModificationTime = groundModificationTime;
    return this;
  }

  /**
   * Get groundModificationTime
   * @return groundModificationTime
  **/
  @ApiModelProperty(example = "2019-10-11 10:25", value = "")


  public String getGroundModificationTime() {
    return groundModificationTime;
  }

  public void setGroundModificationTime(String groundModificationTime) {
    this.groundModificationTime = groundModificationTime;
  }

  public Ground groundActive(Boolean groundActive) {
    this.groundActive = groundActive;
    return this;
  }

  /**
   * Get groundActive
   * @return groundActive
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isGroundActive() {
    return groundActive;
  }

  public void setGroundActive(Boolean groundActive) {
    this.groundActive = groundActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ground ground = (Ground) o;
    return Objects.equals(this.groundId, ground.groundId) &&
        Objects.equals(this.groundName, ground.groundName) &&
        Objects.equals(this.groundState, ground.groundState) &&
        Objects.equals(this.groundDistrict, ground.groundDistrict) &&
        Objects.equals(this.gameId, ground.gameId) &&
        Objects.equals(this.gameName, ground.gameName) &&
        Objects.equals(this.groundCreationTime, ground.groundCreationTime) &&
        Objects.equals(this.groundModificationTime, ground.groundModificationTime) &&
        Objects.equals(this.groundActive, ground.groundActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groundId, groundName, groundState, groundDistrict, gameId, gameName, groundCreationTime, groundModificationTime, groundActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ground {\n");
    
    sb.append("    groundId: ").append(toIndentedString(groundId)).append("\n");
    sb.append("    groundName: ").append(toIndentedString(groundName)).append("\n");
    sb.append("    groundState: ").append(toIndentedString(groundState)).append("\n");
    sb.append("    groundDistrict: ").append(toIndentedString(groundDistrict)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    gameName: ").append(toIndentedString(gameName)).append("\n");
    sb.append("    groundCreationTime: ").append(toIndentedString(groundCreationTime)).append("\n");
    sb.append("    groundModificationTime: ").append(toIndentedString(groundModificationTime)).append("\n");
    sb.append("    groundActive: ").append(toIndentedString(groundActive)).append("\n");
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


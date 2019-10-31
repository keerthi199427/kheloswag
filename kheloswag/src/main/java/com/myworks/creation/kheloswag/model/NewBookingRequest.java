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
 * NewBookingRequest
 */
@Validated

public class NewBookingRequest   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("stateName")
  private String stateName = null;

  @JsonProperty("districtName")
  private String districtName = null;

  @JsonProperty("groundName")
  private String groundName = null;

  @JsonProperty("gameId")
  private String gameId = null;

  @JsonProperty("gameName")
  private String gameName = null;

  @JsonProperty("gameBookingDate")
  private String gameBookingDate = null;

  @JsonProperty("gameStartTime")
  private String gameStartTime = null;

  @JsonProperty("gameEndTime")
  private String gameEndTime = null;

  @JsonProperty("bookingActive")
  private Boolean bookingActive = null;

  public NewBookingRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "123", value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public NewBookingRequest stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

  /**
   * Get stateName
   * @return stateName
  **/
  @ApiModelProperty(example = "Punjab", value = "")


  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public NewBookingRequest districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Get districtName
   * @return districtName
  **/
  @ApiModelProperty(example = "Chandigarh", value = "")


  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public NewBookingRequest groundName(String groundName) {
    this.groundName = groundName;
    return this;
  }

  /**
   * Get groundName
   * @return groundName
  **/
  @ApiModelProperty(example = "ZPH - Villur", value = "")


  public String getGroundName() {
    return groundName;
  }

  public void setGroundName(String groundName) {
    this.groundName = groundName;
  }

  public NewBookingRequest gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Get gameId
   * @return gameId
  **/
  @ApiModelProperty(example = "1", value = "")


  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public NewBookingRequest gameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

  /**
   * Get gameName
   * @return gameName
  **/
  @ApiModelProperty(example = "Volley ball", value = "")


  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public NewBookingRequest gameBookingDate(String gameBookingDate) {
    this.gameBookingDate = gameBookingDate;
    return this;
  }

  /**
   * Game Booking Date
   * @return gameBookingDate
  **/
  @ApiModelProperty(example = "2019-10-31", value = "Game Booking Date")


  public String getGameBookingDate() {
    return gameBookingDate;
  }

  public void setGameBookingDate(String gameBookingDate) {
    this.gameBookingDate = gameBookingDate;
  }

  public NewBookingRequest gameStartTime(String gameStartTime) {
    this.gameStartTime = gameStartTime;
    return this;
  }

  /**
   * Get gameStartTime
   * @return gameStartTime
  **/
  @ApiModelProperty(example = "06:00, 10:00, 14:00, 18:00", value = "")


  public String getGameStartTime() {
    return gameStartTime;
  }

  public void setGameStartTime(String gameStartTime) {
    this.gameStartTime = gameStartTime;
  }

  public NewBookingRequest gameEndTime(String gameEndTime) {
    this.gameEndTime = gameEndTime;
    return this;
  }

  /**
   * Get gameEndTime
   * @return gameEndTime
  **/
  @ApiModelProperty(example = "09:00, 13:00, 17:00, 21:00", value = "")


  public String getGameEndTime() {
    return gameEndTime;
  }

  public void setGameEndTime(String gameEndTime) {
    this.gameEndTime = gameEndTime;
  }

  public NewBookingRequest bookingActive(Boolean bookingActive) {
    this.bookingActive = bookingActive;
    return this;
  }

  /**
   * Flag for Ground Booking Slot
   * @return bookingActive
  **/
  @ApiModelProperty(example = "true", value = "Flag for Ground Booking Slot")


  public Boolean isBookingActive() {
    return bookingActive;
  }

  public void setBookingActive(Boolean bookingActive) {
    this.bookingActive = bookingActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBookingRequest newBookingRequest = (NewBookingRequest) o;
    return Objects.equals(this.userId, newBookingRequest.userId) &&
        Objects.equals(this.stateName, newBookingRequest.stateName) &&
        Objects.equals(this.districtName, newBookingRequest.districtName) &&
        Objects.equals(this.groundName, newBookingRequest.groundName) &&
        Objects.equals(this.gameId, newBookingRequest.gameId) &&
        Objects.equals(this.gameName, newBookingRequest.gameName) &&
        Objects.equals(this.gameBookingDate, newBookingRequest.gameBookingDate) &&
        Objects.equals(this.gameStartTime, newBookingRequest.gameStartTime) &&
        Objects.equals(this.gameEndTime, newBookingRequest.gameEndTime) &&
        Objects.equals(this.bookingActive, newBookingRequest.bookingActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, stateName, districtName, groundName, gameId, gameName, gameBookingDate, gameStartTime, gameEndTime, bookingActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBookingRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    groundName: ").append(toIndentedString(groundName)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    gameName: ").append(toIndentedString(gameName)).append("\n");
    sb.append("    gameBookingDate: ").append(toIndentedString(gameBookingDate)).append("\n");
    sb.append("    gameStartTime: ").append(toIndentedString(gameStartTime)).append("\n");
    sb.append("    gameEndTime: ").append(toIndentedString(gameEndTime)).append("\n");
    sb.append("    bookingActive: ").append(toIndentedString(bookingActive)).append("\n");
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


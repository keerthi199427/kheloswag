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
 * NewBookingResponse
 */
@Validated

public class NewBookingResponse   {
  @JsonProperty("bookingId")
  private String bookingId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("stateName")
  private String stateName = null;

  @JsonProperty("districtName")
  private String districtName = null;

  @JsonProperty("groundName")
  private String groundName = null;

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

  public NewBookingResponse bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  **/
  @ApiModelProperty(example = "123", value = "")


  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }

  public NewBookingResponse userId(String userId) {
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

  public NewBookingResponse stateName(String stateName) {
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

  public NewBookingResponse districtName(String districtName) {
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

  public NewBookingResponse groundName(String groundName) {
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

  public NewBookingResponse gameName(String gameName) {
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

  public NewBookingResponse gameBookingDate(String gameBookingDate) {
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

  public NewBookingResponse gameStartTime(String gameStartTime) {
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

  public NewBookingResponse gameEndTime(String gameEndTime) {
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

  public NewBookingResponse bookingActive(Boolean bookingActive) {
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
    NewBookingResponse newBookingResponse = (NewBookingResponse) o;
    return Objects.equals(this.bookingId, newBookingResponse.bookingId) &&
        Objects.equals(this.userId, newBookingResponse.userId) &&
        Objects.equals(this.stateName, newBookingResponse.stateName) &&
        Objects.equals(this.districtName, newBookingResponse.districtName) &&
        Objects.equals(this.groundName, newBookingResponse.groundName) &&
        Objects.equals(this.gameName, newBookingResponse.gameName) &&
        Objects.equals(this.gameBookingDate, newBookingResponse.gameBookingDate) &&
        Objects.equals(this.gameStartTime, newBookingResponse.gameStartTime) &&
        Objects.equals(this.gameEndTime, newBookingResponse.gameEndTime) &&
        Objects.equals(this.bookingActive, newBookingResponse.bookingActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, userId, stateName, districtName, groundName, gameName, gameBookingDate, gameStartTime, gameEndTime, bookingActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBookingResponse {\n");
    
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    groundName: ").append(toIndentedString(groundName)).append("\n");
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


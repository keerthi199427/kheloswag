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
 * User
 */
@Validated

public class User   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userAge")
  private String userAge = null;

  @JsonProperty("userGender")
  private String userGender = null;

  @JsonProperty("userMobile")
  private String userMobile = null;

  @JsonProperty("userEmail")
  private String userEmail = null;

  @JsonProperty("userState")
  private String userState = null;

  @JsonProperty("userCreationTime")
  private String userCreationTime = null;

  @JsonProperty("userModificationTime")
  private String userModificationTime = null;

  public User userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "1234", value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public User userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "keerthi", value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User userAge(String userAge) {
    this.userAge = userAge;
    return this;
  }

  /**
   * Get userAge
   * @return userAge
  **/
  @ApiModelProperty(example = "34", value = "")


  public String getUserAge() {
    return userAge;
  }

  public void setUserAge(String userAge) {
    this.userAge = userAge;
  }

  public User userGender(String userGender) {
    this.userGender = userGender;
    return this;
  }

  /**
   * Get userGender
   * @return userGender
  **/
  @ApiModelProperty(example = "Male", value = "")


  public String getUserGender() {
    return userGender;
  }

  public void setUserGender(String userGender) {
    this.userGender = userGender;
  }

  public User userMobile(String userMobile) {
    this.userMobile = userMobile;
    return this;
  }

  /**
   * Get userMobile
   * @return userMobile
  **/
  @ApiModelProperty(example = "9463131136", value = "")


  public String getUserMobile() {
    return userMobile;
  }

  public void setUserMobile(String userMobile) {
    this.userMobile = userMobile;
  }

  public User userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
  **/
  @ApiModelProperty(example = "ajlahlsdnal@gmail.com", value = "")


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public User userState(String userState) {
    this.userState = userState;
    return this;
  }

  /**
   * Get userState
   * @return userState
  **/
  @ApiModelProperty(example = "Madhya Pradesh", value = "")


  public String getUserState() {
    return userState;
  }

  public void setUserState(String userState) {
    this.userState = userState;
  }

  public User userCreationTime(String userCreationTime) {
    this.userCreationTime = userCreationTime;
    return this;
  }

  /**
   * Get userCreationTime
   * @return userCreationTime
  **/
  @ApiModelProperty(example = "2019-10-11", value = "")


  public String getUserCreationTime() {
    return userCreationTime;
  }

  public void setUserCreationTime(String userCreationTime) {
    this.userCreationTime = userCreationTime;
  }

  public User userModificationTime(String userModificationTime) {
    this.userModificationTime = userModificationTime;
    return this;
  }

  /**
   * Get userModificationTime
   * @return userModificationTime
  **/
  @ApiModelProperty(example = "2019-10-11", value = "")


  public String getUserModificationTime() {
    return userModificationTime;
  }

  public void setUserModificationTime(String userModificationTime) {
    this.userModificationTime = userModificationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.userAge, user.userAge) &&
        Objects.equals(this.userGender, user.userGender) &&
        Objects.equals(this.userMobile, user.userMobile) &&
        Objects.equals(this.userEmail, user.userEmail) &&
        Objects.equals(this.userState, user.userState) &&
        Objects.equals(this.userCreationTime, user.userCreationTime) &&
        Objects.equals(this.userModificationTime, user.userModificationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, userAge, userGender, userMobile, userEmail, userState, userCreationTime, userModificationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userAge: ").append(toIndentedString(userAge)).append("\n");
    sb.append("    userGender: ").append(toIndentedString(userGender)).append("\n");
    sb.append("    userMobile: ").append(toIndentedString(userMobile)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userState: ").append(toIndentedString(userState)).append("\n");
    sb.append("    userCreationTime: ").append(toIndentedString(userCreationTime)).append("\n");
    sb.append("    userModificationTime: ").append(toIndentedString(userModificationTime)).append("\n");
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


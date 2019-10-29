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
 * UserRequest
 */
@Validated

public class UserRequest   {
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

  public UserRequest userName(String userName) {
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

  public UserRequest userAge(String userAge) {
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

  public UserRequest userGender(String userGender) {
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

  public UserRequest userMobile(String userMobile) {
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

  public UserRequest userEmail(String userEmail) {
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

  public UserRequest userState(String userState) {
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

  public UserRequest userCreationTime(String userCreationTime) {
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

  public UserRequest userModificationTime(String userModificationTime) {
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
    UserRequest userRequest = (UserRequest) o;
    return Objects.equals(this.userName, userRequest.userName) &&
        Objects.equals(this.userAge, userRequest.userAge) &&
        Objects.equals(this.userGender, userRequest.userGender) &&
        Objects.equals(this.userMobile, userRequest.userMobile) &&
        Objects.equals(this.userEmail, userRequest.userEmail) &&
        Objects.equals(this.userState, userRequest.userState) &&
        Objects.equals(this.userCreationTime, userRequest.userCreationTime) &&
        Objects.equals(this.userModificationTime, userRequest.userModificationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, userAge, userGender, userMobile, userEmail, userState, userCreationTime, userModificationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRequest {\n");
    
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


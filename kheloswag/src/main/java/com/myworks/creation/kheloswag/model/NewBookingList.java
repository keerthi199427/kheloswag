package com.myworks.creation.kheloswag.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.myworks.creation.kheloswag.model.NewBookingResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewBookingList
 */
@Validated

public class NewBookingList   {
  @JsonProperty("bookingsList")
  @Valid
  private List<NewBookingResponse> bookingsList = null;

  public NewBookingList bookingsList(List<NewBookingResponse> bookingsList) {
    this.bookingsList = bookingsList;
    return this;
  }

  public NewBookingList addBookingsListItem(NewBookingResponse bookingsListItem) {
    if (this.bookingsList == null) {
      this.bookingsList = new ArrayList<>();
    }
    this.bookingsList.add(bookingsListItem);
    return this;
  }

  /**
   * Get bookingsList
   * @return bookingsList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<NewBookingResponse> getBookingsList() {
    return bookingsList;
  }

  public void setBookingsList(List<NewBookingResponse> bookingsList) {
    this.bookingsList = bookingsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBookingList newBookingList = (NewBookingList) o;
    return Objects.equals(this.bookingsList, newBookingList.bookingsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBookingList {\n");
    
    sb.append("    bookingsList: ").append(toIndentedString(bookingsList)).append("\n");
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


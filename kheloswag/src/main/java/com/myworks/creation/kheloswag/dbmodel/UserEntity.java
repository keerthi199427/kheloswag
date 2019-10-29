package com.myworks.creation.kheloswag.dbmodel;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name= "user_details")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_age")
    private String userAge;

    @Column(name = "user_gender")
    private String userGender;

    @Column(name = "user_mobile")
    private String userMobile;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_state")
    private String userState;

    @Column(name = "user_cre_ts", nullable = false)
    private ZonedDateTime userCreationTime;

    @Column(name = "user_updt_ts" , nullable = false)
    private ZonedDateTime userModificationTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public ZonedDateTime getUserCreationTime() {
        return userCreationTime;
    }

    public void setUserCreationTime(ZonedDateTime userCreationTime) {
        this.userCreationTime = userCreationTime;
    }

    public ZonedDateTime getUserModificationTime() {
        return userModificationTime;
    }

    public void setUserModificationTime(ZonedDateTime userModificationTime) {
        this.userModificationTime = userModificationTime;
    }
}

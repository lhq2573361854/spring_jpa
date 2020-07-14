package com.tianling.jpa.entities;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author: TianLing
 * @Year: 2020
 * @DateTime: 2020/7/14 17:37
 */
@Entity
@Table(name = "user_info", schema = "demo")
public class UserInfoEntity {
    private int userId;
    private String userName;
    private String userPhone;
    private String userAccount;
    private String userPassword;
    private String userMark;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_phone")
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "user_account")
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Basic
    @Column(name = "user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_mark")
    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfoEntity that = (UserInfoEntity) o;
        return userId == that.userId &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userPhone, that.userPhone) &&
                Objects.equals(userAccount, that.userAccount) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(userMark, that.userMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPhone, userAccount, userPassword, userMark);
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userMark='" + userMark + '\'' +
                '}';
    }
}

package hht.dragon.entity;

import java.util.Date;

public class User {
    private String userId;

    private String userName;

    private String userEmail;

    private String userPhone;

    private Date userDate;

    private Integer contributeNum;

    private Integer credit;

    private Integer identity;

    private String userImg;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public Integer getContributeNum() {
        return contributeNum;
    }

    public void setContributeNum(Integer contributeNum) {
        this.contributeNum = contributeNum;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
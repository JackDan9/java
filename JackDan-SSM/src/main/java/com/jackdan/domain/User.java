package com.jackdan.domain;

import java.util.Date;

public class User {
    private String userId;

    private String userName;

    private String password;

    private String userNickname;

    private String userTruename;

    private String userImg;

    private Date birthday;

    private Integer gender;

    private String address;

    private String industry;

    private String career;

    private String email;

    private String telphone;

    private String qq;

    private String wechat;

    private String knowField;

    private String professionalSkill;

    private String province;

    private String city;

    private String introduction;

    private Integer visitedNum;

    public User(String userId, String userName, String password, String userNickname, String userTruename, String userImg, Date birthday, Integer gender, String address, String industry, String career, String email, String telphone, String qq, String wechat, String knowField, String professionalSkill, String province, String city, String introduction, Integer visitedNum) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userNickname = userNickname;
        this.userTruename = userTruename;
        this.userImg = userImg;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.industry = industry;
        this.career = career;
        this.email = email;
        this.telphone = telphone;
        this.qq = qq;
        this.wechat = wechat;
        this.knowField = knowField;
        this.professionalSkill = professionalSkill;
        this.province = province;
        this.city = city;
        this.introduction = introduction;
        this.visitedNum = visitedNum;
    }

    public User() {
        super();
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserTruename() {
        return userTruename;
    }

    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getKnowField() {
        return knowField;
    }

    public void setKnowField(String knowField) {
        this.knowField = knowField;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getVisitedNum() {
        return visitedNum;
    }

    public void setVisitedNum(Integer visitedNum) {
        this.visitedNum = visitedNum;
    }
}
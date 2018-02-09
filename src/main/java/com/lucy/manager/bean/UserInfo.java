package com.lucy.manager.bean;

import java.util.Date;

public class UserInfo {
    private Integer userinfoid;

    private String phone;

    private String country;

    private String province;

    private String city;

    private String address;

    private String realname;

    private Date birthday;

    private String gender;

    private String avatar;

    private Date inserttime;

    public UserInfo(Integer userinfoid, String phone, String country, String province, String city, String address, String realname, Date birthday, String gender, String avatar, Date inserttime) {
        super();
        this.userinfoid = userinfoid;
        this.phone = phone;
        this.country = country;
        this.province = province;
        this.city = city;
        this.address = address;
        this.realname = realname;
        this.birthday = birthday;
        this.gender = gender;
        this.avatar = avatar;
        this.inserttime = inserttime;
    }

    public UserInfo() {
        super();
    }

    public Integer getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
}
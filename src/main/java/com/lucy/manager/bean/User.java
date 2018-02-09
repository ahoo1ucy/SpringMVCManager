package com.lucy.manager.bean;

import java.util.Date;

public class User {
    private Integer userid;

    private String account;

    private String username;

    private String password;

    private String token;

    private Integer level;

    private Integer userinfoid;

    private Integer userpointid;

    private Date inserttime;

    private UserInfo userInfo;

    private UserPoint userPoint;

    public User(Integer userid, String account, String username, String password, String token, Integer level, Integer userinfoid, Integer userpointid, Date inserttime) {
        super();
        this.userid = userid;
        this.account = account;
        this.username = username;
        this.password = password;
        this.token = token;
        this.level = level;
        this.userinfoid = userinfoid;
        this.userpointid = userpointid;
        this.inserttime = inserttime;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Integer getUserpointid() {
        return userpointid;
    }

    public void setUserpointid(Integer userpointid) {
        this.userpointid = userpointid;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public UserInfo getUserInfo() { return userInfo; }

    public void setUserInfo(UserInfo userInfo) { this.userInfo = userInfo; }

    public UserPoint getUserPoint() { return userPoint; }

    public void setUserPoint(UserPoint userPoint) { this.userPoint = userPoint; }
}
package com.lucy.manager.bean;

import java.util.Date;

public class UserPoint {
    private Integer userpointid;

    private Integer cintegral;

    private Integer tintegral;

    private Date inserttime;

    public UserPoint(Integer userpointid, Integer cintegral, Integer tintegral, Date inserttime) {
        super();
        this.userpointid = userpointid;
        this.cintegral = cintegral;
        this.tintegral = tintegral;
        this.inserttime = inserttime;
    }

    public UserPoint() {
        super();
    }

    public Integer getUserpointid() {
        return userpointid;
    }

    public void setUserpointid(Integer userpointid) {
        this.userpointid = userpointid;
    }

    public Integer getCintegral() {
        return cintegral;
    }

    public void setCintegral(Integer cintegral) {
        this.cintegral = cintegral;
    }

    public Integer getTintegral() {
        return tintegral;
    }

    public void setTintegral(Integer tintegral) {
        this.tintegral = tintegral;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
}
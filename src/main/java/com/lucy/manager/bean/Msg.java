package com.lucy.manager.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回通用类
 */

public class Msg {
    //状态码
    private int code;

    //状态信息
    private String msg;

    //用户返回数据
    private Map<String,Object> data = new HashMap<String, Object>();

    //成功返回
    public static Msg success(){
        Msg result = new Msg();
        result.setCode(0);
        result.setMsg("SUCCESS");
        return result;
    }

    //失败返回
    public static Msg fail(){
        Msg result = new Msg();
        result.setCode(1);
        result.setMsg("FAIL");
        return result;
    }

    //自定义返回
    public static Msg returnMsg(int code,String msg){
        Msg result = new Msg();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    //添加到数据源
    public Msg add(String key, Object value){
        this.getData().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}

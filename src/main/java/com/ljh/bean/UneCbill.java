package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UneCbill implements Serializable {

    private static final long serialVersionUID=1L;

    private String fbillno;

    private String fcreatetime;

    private String fauthor;

    private String fbusno;

    private String appcontent;

    private String appcode;

    private String errmsg;


    public String getFbillno() {
        return fbillno;
    }

    public void setFbillno(String fbillno) {
        this.fbillno = fbillno;
    }

    public String getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(String fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    public String getFauthor() {
        return fauthor;
    }

    public void setFauthor(String fauthor) {
        this.fauthor = fauthor;
    }

    public String getFbusno() {
        return fbusno;
    }

    public void setFbusno(String fbusno) {
        this.fbusno = fbusno;
    }

    public String getAppcontent() {
        return appcontent;
    }

    public void setAppcontent(String appcontent) {
        this.appcontent = appcontent;
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "UneCbill{" +
        "fbillno=" + fbillno +
        ", fcreatetime=" + fcreatetime +
        ", fauthor=" + fauthor +
        ", fbusno=" + fbusno +
        ", appcontent=" + appcontent +
        ", appcode=" + appcode +
        ", errmsg=" + errmsg +
        "}";
    }
}

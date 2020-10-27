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
public class MzyyCk implements Serializable {

    private static final long serialVersionUID=1L;

    private String yyDate;

    private String haobie;

    private String yyfs;

    private String yyType;

    private String yyDept;

    private String yySeeDate;

    private String ynCancel;

    private String pihao;


    public String getYyDate() {
        return yyDate;
    }

    public void setYyDate(String yyDate) {
        this.yyDate = yyDate;
    }

    public String getHaobie() {
        return haobie;
    }

    public void setHaobie(String haobie) {
        this.haobie = haobie;
    }

    public String getYyfs() {
        return yyfs;
    }

    public void setYyfs(String yyfs) {
        this.yyfs = yyfs;
    }

    public String getYyType() {
        return yyType;
    }

    public void setYyType(String yyType) {
        this.yyType = yyType;
    }

    public String getYyDept() {
        return yyDept;
    }

    public void setYyDept(String yyDept) {
        this.yyDept = yyDept;
    }

    public String getYySeeDate() {
        return yySeeDate;
    }

    public void setYySeeDate(String yySeeDate) {
        this.yySeeDate = yySeeDate;
    }

    public String getYnCancel() {
        return ynCancel;
    }

    public void setYnCancel(String ynCancel) {
        this.ynCancel = ynCancel;
    }

    public String getPihao() {
        return pihao;
    }

    public void setPihao(String pihao) {
        this.pihao = pihao;
    }

    @Override
    public String toString() {
        return "MzyyCk{" +
        "yyDate=" + yyDate +
        ", haobie=" + haobie +
        ", yyfs=" + yyfs +
        ", yyType=" + yyType +
        ", yyDept=" + yyDept +
        ", yySeeDate=" + yySeeDate +
        ", ynCancel=" + ynCancel +
        ", pihao=" + pihao +
        "}";
    }
}

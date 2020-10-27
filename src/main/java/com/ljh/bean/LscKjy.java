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
public class LscKjy implements Serializable {

    private static final long serialVersionUID=1L;

    private String date1;

    private String biaoshi;

    private String haobie;

    private String yizhu;

    private String proname;


    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getBiaoshi() {
        return biaoshi;
    }

    public void setBiaoshi(String biaoshi) {
        this.biaoshi = biaoshi;
    }

    public String getHaobie() {
        return haobie;
    }

    public void setHaobie(String haobie) {
        this.haobie = haobie;
    }

    public String getYizhu() {
        return yizhu;
    }

    public void setYizhu(String yizhu) {
        this.yizhu = yizhu;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    @Override
    public String toString() {
        return "LscKjy{" +
        "date1=" + date1 +
        ", biaoshi=" + biaoshi +
        ", haobie=" + haobie +
        ", yizhu=" + yizhu +
        ", proname=" + proname +
        "}";
    }
}

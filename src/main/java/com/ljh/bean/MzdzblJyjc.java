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
public class MzdzblJyjc implements Serializable {

    private static final long serialVersionUID=1L;

    private String jyjcId;

    private String regTime;

    private String projectname;

    private String bm;

    private String jcTime;


    public String getJyjcId() {
        return jyjcId;
    }

    public void setJyjcId(String jyjcId) {
        this.jyjcId = jyjcId;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    public String getJcTime() {
        return jcTime;
    }

    public void setJcTime(String jcTime) {
        this.jcTime = jcTime;
    }

    @Override
    public String toString() {
        return "MzdzblJyjc{" +
        "jyjcId=" + jyjcId +
        ", regTime=" + regTime +
        ", projectname=" + projectname +
        ", bm=" + bm +
        ", jcTime=" + jcTime +
        "}";
    }
}

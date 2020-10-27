package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class MzsyjmzsrsCk implements Serializable {

    private static final long serialVersionUID=1L;

    private String jzbs;

    private String haobie;

    private String project;

    private String name;

    private LocalDateTime yzDate;

    private String sfStatus;


    public String getJzbs() {
        return jzbs;
    }

    public void setJzbs(String jzbs) {
        this.jzbs = jzbs;
    }

    public String getHaobie() {
        return haobie;
    }

    public void setHaobie(String haobie) {
        this.haobie = haobie;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getYzDate() {
        return yzDate;
    }

    public void setYzDate(LocalDateTime yzDate) {
        this.yzDate = yzDate;
    }

    public String getSfStatus() {
        return sfStatus;
    }

    public void setSfStatus(String sfStatus) {
        this.sfStatus = sfStatus;
    }

    @Override
    public String toString() {
        return "MzsyjmzsrsCk{" +
        "jzbs=" + jzbs +
        ", haobie=" + haobie +
        ", project=" + project +
        ", name=" + name +
        ", yzDate=" + yzDate +
        ", sfStatus=" + sfStatus +
        "}";
    }
}

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
public class VQyylDoctorInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosorgcode;

    private String resourcecode;

    private String resourcename;

    private String docttile;

    private String persontype;

    private String personid;

    private String doctsex;

    private String doctinfo;

    private String doctspecialty;

    private String onedeptcode;

    private String deptcode;

    private String isregister;

    private String isdelete;


    public String getHosorgcode() {
        return hosorgcode;
    }

    public void setHosorgcode(String hosorgcode) {
        this.hosorgcode = hosorgcode;
    }

    public String getResourcecode() {
        return resourcecode;
    }

    public void setResourcecode(String resourcecode) {
        this.resourcecode = resourcecode;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getDocttile() {
        return docttile;
    }

    public void setDocttile(String docttile) {
        this.docttile = docttile;
    }

    public String getPersontype() {
        return persontype;
    }

    public void setPersontype(String persontype) {
        this.persontype = persontype;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getDoctsex() {
        return doctsex;
    }

    public void setDoctsex(String doctsex) {
        this.doctsex = doctsex;
    }

    public String getDoctinfo() {
        return doctinfo;
    }

    public void setDoctinfo(String doctinfo) {
        this.doctinfo = doctinfo;
    }

    public String getDoctspecialty() {
        return doctspecialty;
    }

    public void setDoctspecialty(String doctspecialty) {
        this.doctspecialty = doctspecialty;
    }

    public String getOnedeptcode() {
        return onedeptcode;
    }

    public void setOnedeptcode(String onedeptcode) {
        this.onedeptcode = onedeptcode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getIsregister() {
        return isregister;
    }

    public void setIsregister(String isregister) {
        this.isregister = isregister;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "VQyylDoctorInfo{" +
        "hosorgcode=" + hosorgcode +
        ", resourcecode=" + resourcecode +
        ", resourcename=" + resourcename +
        ", docttile=" + docttile +
        ", persontype=" + persontype +
        ", personid=" + personid +
        ", doctsex=" + doctsex +
        ", doctinfo=" + doctinfo +
        ", doctspecialty=" + doctspecialty +
        ", onedeptcode=" + onedeptcode +
        ", deptcode=" + deptcode +
        ", isregister=" + isregister +
        ", isdelete=" + isdelete +
        "}";
    }
}

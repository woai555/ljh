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
public class VQyylOutpatientInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String resourcecode;

    private String resourcename;

    private String outpatinfo;

    private String hosorgcode;

    private String onedeptcode;

    private String deptcode;

    private String isdelete;


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

    public String getOutpatinfo() {
        return outpatinfo;
    }

    public void setOutpatinfo(String outpatinfo) {
        this.outpatinfo = outpatinfo;
    }

    public String getHosorgcode() {
        return hosorgcode;
    }

    public void setHosorgcode(String hosorgcode) {
        this.hosorgcode = hosorgcode;
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

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "VQyylOutpatientInfo{" +
        "resourcecode=" + resourcecode +
        ", resourcename=" + resourcename +
        ", outpatinfo=" + outpatinfo +
        ", hosorgcode=" + hosorgcode +
        ", onedeptcode=" + onedeptcode +
        ", deptcode=" + deptcode +
        ", isdelete=" + isdelete +
        "}";
    }
}

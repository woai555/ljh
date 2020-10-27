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
public class VQyylSecondDeptInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosorgcode;

    private String onedeptcode;

    private String deptcode;

    private String deptname;

    private String isregister;

    private String isdelete;


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

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
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
        return "VQyylSecondDeptInfo{" +
        "hosorgcode=" + hosorgcode +
        ", onedeptcode=" + onedeptcode +
        ", deptcode=" + deptcode +
        ", deptname=" + deptname +
        ", isregister=" + isregister +
        ", isdelete=" + isdelete +
        "}";
    }
}

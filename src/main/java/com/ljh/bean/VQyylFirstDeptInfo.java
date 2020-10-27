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
public class VQyylFirstDeptInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosorgcode;

    private String deptcode;

    private String deptname;

    private String normdeptcode;

    private String normdeptname;

    private String isdelete;

    private String isregister;


    public String getHosorgcode() {
        return hosorgcode;
    }

    public void setHosorgcode(String hosorgcode) {
        this.hosorgcode = hosorgcode;
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

    public String getNormdeptcode() {
        return normdeptcode;
    }

    public void setNormdeptcode(String normdeptcode) {
        this.normdeptcode = normdeptcode;
    }

    public String getNormdeptname() {
        return normdeptname;
    }

    public void setNormdeptname(String normdeptname) {
        this.normdeptname = normdeptname;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getIsregister() {
        return isregister;
    }

    public void setIsregister(String isregister) {
        this.isregister = isregister;
    }

    @Override
    public String toString() {
        return "VQyylFirstDeptInfo{" +
        "hosorgcode=" + hosorgcode +
        ", deptcode=" + deptcode +
        ", deptname=" + deptname +
        ", normdeptcode=" + normdeptcode +
        ", normdeptname=" + normdeptname +
        ", isdelete=" + isdelete +
        ", isregister=" + isregister +
        "}";
    }
}

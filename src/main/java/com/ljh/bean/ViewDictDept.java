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
public class ViewDictDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String depttypecode;

    private String depttypename;

    private String deptcode;

    private String deptname;

    private String specialflag;

    private String phone;

    private String address;

    private String inputcode;

    private String shortname;

    private String deptmemo;

    private String indexno;


    public String getDepttypecode() {
        return depttypecode;
    }

    public void setDepttypecode(String depttypecode) {
        this.depttypecode = depttypecode;
    }

    public String getDepttypename() {
        return depttypename;
    }

    public void setDepttypename(String depttypename) {
        this.depttypename = depttypename;
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

    public String getSpecialflag() {
        return specialflag;
    }

    public void setSpecialflag(String specialflag) {
        this.specialflag = specialflag;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getDeptmemo() {
        return deptmemo;
    }

    public void setDeptmemo(String deptmemo) {
        this.deptmemo = deptmemo;
    }

    public String getIndexno() {
        return indexno;
    }

    public void setIndexno(String indexno) {
        this.indexno = indexno;
    }

    @Override
    public String toString() {
        return "ViewDictDept{" +
        "depttypecode=" + depttypecode +
        ", depttypename=" + depttypename +
        ", deptcode=" + deptcode +
        ", deptname=" + deptname +
        ", specialflag=" + specialflag +
        ", phone=" + phone +
        ", address=" + address +
        ", inputcode=" + inputcode +
        ", shortname=" + shortname +
        ", deptmemo=" + deptmemo +
        ", indexno=" + indexno +
        "}";
    }
}

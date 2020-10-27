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
public class VWebDeptPatreged implements Serializable {

    private static final long serialVersionUID=1L;

    private String patname;

    private String idcardno;

    private String deptname;

    private String deptid;

    private String sectid;

    private String sectname;


    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getSectid() {
        return sectid;
    }

    public void setSectid(String sectid) {
        this.sectid = sectid;
    }

    public String getSectname() {
        return sectname;
    }

    public void setSectname(String sectname) {
        this.sectname = sectname;
    }

    @Override
    public String toString() {
        return "VWebDeptPatreged{" +
        "patname=" + patname +
        ", idcardno=" + idcardno +
        ", deptname=" + deptname +
        ", deptid=" + deptid +
        ", sectid=" + sectid +
        ", sectname=" + sectname +
        "}";
    }
}

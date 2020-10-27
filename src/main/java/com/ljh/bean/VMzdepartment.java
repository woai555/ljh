package com.ljh.bean;

import java.math.BigDecimal;
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
public class VMzdepartment implements Serializable {

    private static final long serialVersionUID=1L;

    private String departmentcode;

    private String spellcode;

    private String departmentname;

    private BigDecimal inhosregistermax;

    private BigDecimal inhosregisterednum;

    private String isnode;

    private String isvalid;


    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getSpellcode() {
        return spellcode;
    }

    public void setSpellcode(String spellcode) {
        this.spellcode = spellcode;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public BigDecimal getInhosregistermax() {
        return inhosregistermax;
    }

    public void setInhosregistermax(BigDecimal inhosregistermax) {
        this.inhosregistermax = inhosregistermax;
    }

    public BigDecimal getInhosregisterednum() {
        return inhosregisterednum;
    }

    public void setInhosregisterednum(BigDecimal inhosregisterednum) {
        this.inhosregisterednum = inhosregisterednum;
    }

    public String getIsnode() {
        return isnode;
    }

    public void setIsnode(String isnode) {
        this.isnode = isnode;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }

    @Override
    public String toString() {
        return "VMzdepartment{" +
        "departmentcode=" + departmentcode +
        ", spellcode=" + spellcode +
        ", departmentname=" + departmentname +
        ", inhosregistermax=" + inhosregistermax +
        ", inhosregisterednum=" + inhosregisterednum +
        ", isnode=" + isnode +
        ", isvalid=" + isvalid +
        "}";
    }
}

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
public class VWsdocDepartment implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptid;

    private String name;

    private BigDecimal sortindex;

    private String description;

    private String parentid;

    private String parentname;


    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSortindex() {
        return sortindex;
    }

    public void setSortindex(BigDecimal sortindex) {
        this.sortindex = sortindex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    @Override
    public String toString() {
        return "VWsdocDepartment{" +
        "deptid=" + deptid +
        ", name=" + name +
        ", sortindex=" + sortindex +
        ", description=" + description +
        ", parentid=" + parentid +
        ", parentname=" + parentname +
        "}";
    }
}

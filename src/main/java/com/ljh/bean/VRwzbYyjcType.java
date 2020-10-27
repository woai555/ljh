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
public class VRwzbYyjcType implements Serializable {

    private static final long serialVersionUID=1L;

    private String typeId;

    private String typeName;

    private BigDecimal bz;

    private String deptCode;

    private String deptName;


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public BigDecimal getBz() {
        return bz;
    }

    public void setBz(BigDecimal bz) {
        this.bz = bz;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "VRwzbYyjcType{" +
        "typeId=" + typeId +
        ", typeName=" + typeName +
        ", bz=" + bz +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        "}";
    }
}

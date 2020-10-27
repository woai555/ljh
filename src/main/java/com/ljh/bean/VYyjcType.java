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
public class VYyjcType implements Serializable {

    private static final long serialVersionUID=1L;

    private String typeId;

    private String typeName;

    private String deptCode;

    private BigDecimal degreedif;

    private BigDecimal typesource;

    private BigDecimal bz;


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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getDegreedif() {
        return degreedif;
    }

    public void setDegreedif(BigDecimal degreedif) {
        this.degreedif = degreedif;
    }

    public BigDecimal getTypesource() {
        return typesource;
    }

    public void setTypesource(BigDecimal typesource) {
        this.typesource = typesource;
    }

    public BigDecimal getBz() {
        return bz;
    }

    public void setBz(BigDecimal bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "VYyjcType{" +
        "typeId=" + typeId +
        ", typeName=" + typeName +
        ", deptCode=" + deptCode +
        ", degreedif=" + degreedif +
        ", typesource=" + typesource +
        ", bz=" + bz +
        "}";
    }
}

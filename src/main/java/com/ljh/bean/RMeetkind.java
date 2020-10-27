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
public class RMeetkind implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "KIND_CODE", type = IdType.AUTO)
    private String kindCode;

    private String kindName;

    private BigDecimal kindType;

    /**
     * 挂号科室
     */
    private String deptCode;


    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public BigDecimal getKindType() {
        return kindType;
    }

    public void setKindType(BigDecimal kindType) {
        this.kindType = kindType;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "RMeetkind{" +
        "kindCode=" + kindCode +
        ", kindName=" + kindName +
        ", kindType=" + kindType +
        ", deptCode=" + deptCode +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 虹桥人员表和HIS人员表对照
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class VLisoper implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * HIS编码
     */
    @TableId(value = "OPERID", type = IdType.AUTO)
    private BigDecimal operid;

    /**
     * 姓名
     */
    private String name;

    /**
     * LIS编码
     */
    private BigDecimal liscode;

    /**
     * 科室
     */
    private BigDecimal unitid;


    public BigDecimal getOperid() {
        return operid;
    }

    public void setOperid(BigDecimal operid) {
        this.operid = operid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLiscode() {
        return liscode;
    }

    public void setLiscode(BigDecimal liscode) {
        this.liscode = liscode;
    }

    public BigDecimal getUnitid() {
        return unitid;
    }

    public void setUnitid(BigDecimal unitid) {
        this.unitid = unitid;
    }

    @Override
    public String toString() {
        return "VLisoper{" +
        "operid=" + operid +
        ", name=" + name +
        ", liscode=" + liscode +
        ", unitid=" + unitid +
        "}";
    }
}

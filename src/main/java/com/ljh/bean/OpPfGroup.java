package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 批费项目表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpPfGroup implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 非药品代码
     */
    @TableId(value = "UNDRUG_CODE", type = IdType.AUTO)
    private String undrugCode;

    /**
     * 非药品名称
     */
    private String undrugName;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 批费类别
     */
    private String groupid;

    /**
     * 批费单位置
     */
    private Integer orderid;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "OpPfGroup{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", deptCode=" + deptCode +
        ", groupid=" + groupid +
        ", orderid=" + orderid +
        "}";
    }
}

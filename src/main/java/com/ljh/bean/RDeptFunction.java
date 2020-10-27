package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医院科室功能设置表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDeptFunction implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室功能分类编码
     */
    @TableId(value = "DEPT_FUNCTIONCODE", type = IdType.AUTO)
    private String deptFunctioncode;

    /**
     * 科室功能分类名称
     */
    private String deptFunctionname;

    /**
     * 科室功能分类属性 --1：不固定级数（各最终节点级数必须小于等于科室分类级别）;2：固定级数（各最终节点级数必须等于科室分类级别）
     */
    private BigDecimal deptFunctionpro;

    /**
     * 科室分类级数
     */
    private BigDecimal levellimit;

    /**
     * 排列顺序
     */
    private BigDecimal orderid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作人员ID
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatortime;


    public String getDeptFunctioncode() {
        return deptFunctioncode;
    }

    public void setDeptFunctioncode(String deptFunctioncode) {
        this.deptFunctioncode = deptFunctioncode;
    }

    public String getDeptFunctionname() {
        return deptFunctionname;
    }

    public void setDeptFunctionname(String deptFunctionname) {
        this.deptFunctionname = deptFunctionname;
    }

    public BigDecimal getDeptFunctionpro() {
        return deptFunctionpro;
    }

    public void setDeptFunctionpro(BigDecimal deptFunctionpro) {
        this.deptFunctionpro = deptFunctionpro;
    }

    public BigDecimal getLevellimit() {
        return levellimit;
    }

    public void setLevellimit(BigDecimal levellimit) {
        this.levellimit = levellimit;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "RDeptFunction{" +
        "deptFunctioncode=" + deptFunctioncode +
        ", deptFunctionname=" + deptFunctionname +
        ", deptFunctionpro=" + deptFunctionpro +
        ", levellimit=" + levellimit +
        ", orderid=" + orderid +
        ", remark=" + remark +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}

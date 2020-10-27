package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医院科室分类表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDepttype implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室分类流水号   --PRESCRIPTTYPE = 1
     */
    @TableId(value = "DEPTTYPE_NO", type = IdType.AUTO)
    private String depttypeNo;

    /**
     * 科室分类名称
     */
    private String depttypeName;

    /**
     * 科室分类拼音
     */
    private String spell;

    /**
     * 科室分类顺序
     */
    private BigDecimal orderid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作员ID
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatortime;


    public String getDepttypeNo() {
        return depttypeNo;
    }

    public void setDepttypeNo(String depttypeNo) {
        this.depttypeNo = depttypeNo;
    }

    public String getDepttypeName() {
        return depttypeName;
    }

    public void setDepttypeName(String depttypeName) {
        this.depttypeName = depttypeName;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
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
        return "RDepttype{" +
        "depttypeNo=" + depttypeNo +
        ", depttypeName=" + depttypeName +
        ", spell=" + spell +
        ", orderid=" + orderid +
        ", remark=" + remark +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class RDeptStaticUnnecessary implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptFunctioncode;

    private String deptCode;

    private String deptName;

    private BigDecimal depttypelevel;

    private BigDecimal orderid;

    private String deptorderid;

    private BigDecimal deptkind;

    private String superiordeptcode;

    private String operatorid;

    private LocalDateTime operatortime;


    public String getDeptFunctioncode() {
        return deptFunctioncode;
    }

    public void setDeptFunctioncode(String deptFunctioncode) {
        this.deptFunctioncode = deptFunctioncode;
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

    public BigDecimal getDepttypelevel() {
        return depttypelevel;
    }

    public void setDepttypelevel(BigDecimal depttypelevel) {
        this.depttypelevel = depttypelevel;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getDeptorderid() {
        return deptorderid;
    }

    public void setDeptorderid(String deptorderid) {
        this.deptorderid = deptorderid;
    }

    public BigDecimal getDeptkind() {
        return deptkind;
    }

    public void setDeptkind(BigDecimal deptkind) {
        this.deptkind = deptkind;
    }

    public String getSuperiordeptcode() {
        return superiordeptcode;
    }

    public void setSuperiordeptcode(String superiordeptcode) {
        this.superiordeptcode = superiordeptcode;
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
        return "RDeptStaticUnnecessary{" +
        "deptFunctioncode=" + deptFunctioncode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", depttypelevel=" + depttypelevel +
        ", orderid=" + orderid +
        ", deptorderid=" + deptorderid +
        ", deptkind=" + deptkind +
        ", superiordeptcode=" + superiordeptcode +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}

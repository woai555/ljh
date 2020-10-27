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
public class ViewMrmsDayAccountTemp implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String name;

    private String deptCode;

    private String deptName;

    private LocalDateTime inDate;

    private LocalDateTime outDate;

    private BigDecimal sPrepay;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public BigDecimal getsPrepay() {
        return sPrepay;
    }

    public void setsPrepay(BigDecimal sPrepay) {
        this.sPrepay = sPrepay;
    }

    @Override
    public String toString() {
        return "ViewMrmsDayAccountTemp{" +
        "inpatientNo=" + inpatientNo +
        ", name=" + name +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", inDate=" + inDate +
        ", outDate=" + outDate +
        ", sPrepay=" + sPrepay +
        "}";
    }
}

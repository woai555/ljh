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
public class VTjUndrugInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String multiitemcode;

    private String undrugName;

    private BigDecimal undrugPrice;

    private String specs;

    private String unit;

    private String deptCode;

    private String deptName;

    private LocalDateTime operDate;

    private String stopFlag;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getMultiitemcode() {
        return multiitemcode;
    }

    public void setMultiitemcode(String multiitemcode) {
        this.multiitemcode = multiitemcode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public BigDecimal getUndrugPrice() {
        return undrugPrice;
    }

    public void setUndrugPrice(BigDecimal undrugPrice) {
        this.undrugPrice = undrugPrice;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }

    @Override
    public String toString() {
        return "VTjUndrugInfo{" +
        "undrugCode=" + undrugCode +
        ", multiitemcode=" + multiitemcode +
        ", undrugName=" + undrugName +
        ", undrugPrice=" + undrugPrice +
        ", specs=" + specs +
        ", unit=" + unit +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", operDate=" + operDate +
        ", stopFlag=" + stopFlag +
        "}";
    }
}

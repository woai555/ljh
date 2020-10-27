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
public class MServices implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "SERVICES_CODE", type = IdType.AUTO)
    private String servicesCode;

    private String servicesName;

    private String feeType;

    private String fLevel;

    private String hostClass;

    private String bedClass;

    private BigDecimal santard;

    private BigDecimal sRadio;

    private String remark;

    private String spFlag;

    private String acitonCode;


    public String getServicesCode() {
        return servicesCode;
    }

    public void setServicesCode(String servicesCode) {
        this.servicesCode = servicesCode;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getfLevel() {
        return fLevel;
    }

    public void setfLevel(String fLevel) {
        this.fLevel = fLevel;
    }

    public String getHostClass() {
        return hostClass;
    }

    public void setHostClass(String hostClass) {
        this.hostClass = hostClass;
    }

    public String getBedClass() {
        return bedClass;
    }

    public void setBedClass(String bedClass) {
        this.bedClass = bedClass;
    }

    public BigDecimal getSantard() {
        return santard;
    }

    public void setSantard(BigDecimal santard) {
        this.santard = santard;
    }

    public BigDecimal getsRadio() {
        return sRadio;
    }

    public void setsRadio(BigDecimal sRadio) {
        this.sRadio = sRadio;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSpFlag() {
        return spFlag;
    }

    public void setSpFlag(String spFlag) {
        this.spFlag = spFlag;
    }

    public String getAcitonCode() {
        return acitonCode;
    }

    public void setAcitonCode(String acitonCode) {
        this.acitonCode = acitonCode;
    }

    @Override
    public String toString() {
        return "MServices{" +
        "servicesCode=" + servicesCode +
        ", servicesName=" + servicesName +
        ", feeType=" + feeType +
        ", fLevel=" + fLevel +
        ", hostClass=" + hostClass +
        ", bedClass=" + bedClass +
        ", santard=" + santard +
        ", sRadio=" + sRadio +
        ", remark=" + remark +
        ", spFlag=" + spFlag +
        ", acitonCode=" + acitonCode +
        "}";
    }
}

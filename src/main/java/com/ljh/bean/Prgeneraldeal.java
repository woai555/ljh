package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 救治记录-一般处理子表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Prgeneraldeal implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编码
     */
    @TableId(value = "PR_CODE", type = IdType.AUTO)
    private BigDecimal prCode;

    /**
     * 救治编码
     */
    private String treatmentCode;

    /**
     * 处理序号
     */
    private BigDecimal dealNumber;

    /**
     * 名称
     */
    private String prName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastupdatetime;


    public BigDecimal getPrCode() {
        return prCode;
    }

    public void setPrCode(BigDecimal prCode) {
        this.prCode = prCode;
    }

    public String getTreatmentCode() {
        return treatmentCode;
    }

    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    public BigDecimal getDealNumber() {
        return dealNumber;
    }

    public void setDealNumber(BigDecimal dealNumber) {
        this.dealNumber = dealNumber;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(LocalDateTime lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    @Override
    public String toString() {
        return "Prgeneraldeal{" +
        "prCode=" + prCode +
        ", treatmentCode=" + treatmentCode +
        ", dealNumber=" + dealNumber +
        ", prName=" + prName +
        ", remark=" + remark +
        ", lastupdatetime=" + lastupdatetime +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 诊断证明登记
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MzZdzmdj implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 诊断登记流水号
     */
    @TableId(value = "ZHENDUAN_NO", type = IdType.AUTO)
    private BigDecimal zhenduanNo;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 介绍信
     */
    private String introduction;

    /**
     * 审批科室
     */
    private String doctDeptid;

    /**
     * 病历号
     */
    private String cardNo;

    /**
     * 医生签字
     */
    private String doctName;

    /**
     * 审核登记日期
     */
    private LocalDateTime operDate;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 操作人
     */
    private String operName;


    public BigDecimal getZhenduanNo() {
        return zhenduanNo;
    }

    public void setZhenduanNo(BigDecimal zhenduanNo) {
        this.zhenduanNo = zhenduanNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getDoctDeptid() {
        return doctDeptid;
    }

    public void setDoctDeptid(String doctDeptid) {
        this.doctDeptid = doctDeptid;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Override
    public String toString() {
        return "MzZdzmdj{" +
        "zhenduanNo=" + zhenduanNo +
        ", patientName=" + patientName +
        ", introduction=" + introduction +
        ", doctDeptid=" + doctDeptid +
        ", cardNo=" + cardNo +
        ", doctName=" + doctName +
        ", operDate=" + operDate +
        ", remark=" + remark +
        ", operName=" + operName +
        "}";
    }
}

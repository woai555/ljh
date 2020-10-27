package com.ljh.bean;

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
public class ViewMrmbaseMzblExamed implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDtime;

    private String pname;

    private String medicalType;

    private String examFlag;

    private String deptName;

    private LocalDateTime treatBgndate;

    private LocalDateTime outDate;

    private LocalDateTime operBgnDatetime;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public String getExamFlag() {
        return examFlag;
    }

    public void setExamFlag(String examFlag) {
        this.examFlag = examFlag;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public LocalDateTime getTreatBgndate() {
        return treatBgndate;
    }

    public void setTreatBgndate(LocalDateTime treatBgndate) {
        this.treatBgndate = treatBgndate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public LocalDateTime getOperBgnDatetime() {
        return operBgnDatetime;
    }

    public void setOperBgnDatetime(LocalDateTime operBgnDatetime) {
        this.operBgnDatetime = operBgnDatetime;
    }

    @Override
    public String toString() {
        return "ViewMrmbaseMzblExamed{" +
        "cardNo=" + cardNo +
        ", regDtime=" + regDtime +
        ", pname=" + pname +
        ", medicalType=" + medicalType +
        ", examFlag=" + examFlag +
        ", deptName=" + deptName +
        ", treatBgndate=" + treatBgndate +
        ", outDate=" + outDate +
        ", operBgnDatetime=" + operBgnDatetime +
        "}";
    }
}

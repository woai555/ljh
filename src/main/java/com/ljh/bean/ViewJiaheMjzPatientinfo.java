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
public class ViewJiaheMjzPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    private String patientId;

    private String visitId;

    private LocalDateTime seeDate;

    private LocalDateTime outDate;

    private String deptCode;

    private String operdeptname;

    private String emplCode;

    private String emplName;

    private String name;

    private String sex;

    private String doctorid;

    private String emergencyNo;

    private String emLeave;

    private String seeNo;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperdeptname() {
        return operdeptname;
    }

    public void setOperdeptname(String operdeptname) {
        this.operdeptname = operdeptname;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getEmergencyNo() {
        return emergencyNo;
    }

    public void setEmergencyNo(String emergencyNo) {
        this.emergencyNo = emergencyNo;
    }

    public String getEmLeave() {
        return emLeave;
    }

    public void setEmLeave(String emLeave) {
        this.emLeave = emLeave;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    @Override
    public String toString() {
        return "ViewJiaheMjzPatientinfo{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", patientId=" + patientId +
        ", visitId=" + visitId +
        ", seeDate=" + seeDate +
        ", outDate=" + outDate +
        ", deptCode=" + deptCode +
        ", operdeptname=" + operdeptname +
        ", emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", name=" + name +
        ", sex=" + sex +
        ", doctorid=" + doctorid +
        ", emergencyNo=" + emergencyNo +
        ", emLeave=" + emLeave +
        ", seeNo=" + seeNo +
        "}";
    }
}

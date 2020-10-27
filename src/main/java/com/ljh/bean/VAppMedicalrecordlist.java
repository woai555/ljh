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
public class VAppMedicalrecordlist implements Serializable {

    private static final long serialVersionUID=1L;

    private String mcardNo;

    private String cardnoJyt;

    private String recordId;

    private LocalDateTime inHosDate;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime leaveHosDate;

    private String type;

    private LocalDateTime expectTime;

    private String docName;

    private String docId;

    private String deptName;

    private String deptId;

    private String expectAddr;

    private String diagType;

    private String diagResult;

    private BigDecimal age;

    private String sex;

    private String accessPatId;


    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public LocalDateTime getInHosDate() {
        return inHosDate;
    }

    public void setInHosDate(LocalDateTime inHosDate) {
        this.inHosDate = inHosDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getLeaveHosDate() {
        return leaveHosDate;
    }

    public void setLeaveHosDate(LocalDateTime leaveHosDate) {
        this.leaveHosDate = leaveHosDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(LocalDateTime expectTime) {
        this.expectTime = expectTime;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getExpectAddr() {
        return expectAddr;
    }

    public void setExpectAddr(String expectAddr) {
        this.expectAddr = expectAddr;
    }

    public String getDiagType() {
        return diagType;
    }

    public void setDiagType(String diagType) {
        this.diagType = diagType;
    }

    public String getDiagResult() {
        return diagResult;
    }

    public void setDiagResult(String diagResult) {
        this.diagResult = diagResult;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    @Override
    public String toString() {
        return "VAppMedicalrecordlist{" +
        "mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", recordId=" + recordId +
        ", inHosDate=" + inHosDate +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", leaveHosDate=" + leaveHosDate +
        ", type=" + type +
        ", expectTime=" + expectTime +
        ", docName=" + docName +
        ", docId=" + docId +
        ", deptName=" + deptName +
        ", deptId=" + deptId +
        ", expectAddr=" + expectAddr +
        ", diagType=" + diagType +
        ", diagResult=" + diagResult +
        ", age=" + age +
        ", sex=" + sex +
        ", accessPatId=" + accessPatId +
        "}";
    }
}

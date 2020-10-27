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
public class VAppCrisis implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String cardType;

    private String patName;

    private String idCardNo;

    private String accessPatId;

    private String deptName;

    private String projectName;

    private String crisisName;

    private LocalDateTime reportTime;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCrisisName() {
        return crisisName;
    }

    public void setCrisisName(String crisisName) {
        this.crisisName = crisisName;
    }

    public LocalDateTime getReportTime() {
        return reportTime;
    }

    public void setReportTime(LocalDateTime reportTime) {
        this.reportTime = reportTime;
    }

    @Override
    public String toString() {
        return "VAppCrisis{" +
        "cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", patName=" + patName +
        ", idCardNo=" + idCardNo +
        ", accessPatId=" + accessPatId +
        ", deptName=" + deptName +
        ", projectName=" + projectName +
        ", crisisName=" + crisisName +
        ", reportTime=" + reportTime +
        "}";
    }
}

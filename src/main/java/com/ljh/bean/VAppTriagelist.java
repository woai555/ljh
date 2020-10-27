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
public class VAppTriagelist implements Serializable {

    private static final long serialVersionUID=1L;

    private String mcardNo;

    private String cardnoJyt;

    private String idCardType;

    private String idCard;

    private String patName;

    private String accessPatId;

    private LocalDateTime regDate;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String deptName;

    private String deptId;

    private String hosDeptName;


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

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
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

    public String getHosDeptName() {
        return hosDeptName;
    }

    public void setHosDeptName(String hosDeptName) {
        this.hosDeptName = hosDeptName;
    }

    @Override
    public String toString() {
        return "VAppTriagelist{" +
        "mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", idCardType=" + idCardType +
        ", idCard=" + idCard +
        ", patName=" + patName +
        ", accessPatId=" + accessPatId +
        ", regDate=" + regDate +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", deptName=" + deptName +
        ", deptId=" + deptId +
        ", hosDeptName=" + hosDeptName +
        "}";
    }
}

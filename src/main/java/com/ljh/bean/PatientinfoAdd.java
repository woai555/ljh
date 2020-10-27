package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 【加号】患者信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PatientinfoAdd implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String mcardNo;

    private String name;

    private String sexCode;

    private String idenno;

    private String loginName;

    private LocalDateTime loginTime;

    private String bz;

    private LocalDateTime regTime;

    @TableId(value = "ROW_NUM", type = IdType.AUTO)
    private BigDecimal rowNum;

    /**
     * 加号类型
     */
    private String itemType;

    /**
     * 本院职工饭卡卡号
     */
    private String byzzCode;

    private String emplCode;

    private LocalDateTime operDate;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 科室
     */
    private String deptCode;

    /**
     * 级别
     */
    private String reglevlCode;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public BigDecimal getRowNum() {
        return rowNum;
    }

    public void setRowNum(BigDecimal rowNum) {
        this.rowNum = rowNum;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getByzzCode() {
        return byzzCode;
    }

    public void setByzzCode(String byzzCode) {
        this.byzzCode = byzzCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    @Override
    public String toString() {
        return "PatientinfoAdd{" +
        "cardNo=" + cardNo +
        ", mcardNo=" + mcardNo +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", idenno=" + idenno +
        ", loginName=" + loginName +
        ", loginTime=" + loginTime +
        ", bz=" + bz +
        ", regTime=" + regTime +
        ", rowNum=" + rowNum +
        ", itemType=" + itemType +
        ", byzzCode=" + byzzCode +
        ", emplCode=" + emplCode +
        ", operDate=" + operDate +
        ", noonCode=" + noonCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        "}";
    }
}

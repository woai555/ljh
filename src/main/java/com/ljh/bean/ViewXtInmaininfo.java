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
public class ViewXtInmaininfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String patientNo;

    private String name;

    private String sexCode;

    private LocalDateTime birthday;

    private String linkmanTel;

    private String mcardNo;

    private String cardNo;

    private String deptCode;

    private String houseDocCode;

    private String idenno;

    private LocalDateTime indate;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
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

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getHouseDocCode() {
        return houseDocCode;
    }

    public void setHouseDocCode(String houseDocCode) {
        this.houseDocCode = houseDocCode;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public LocalDateTime getIndate() {
        return indate;
    }

    public void setIndate(LocalDateTime indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "ViewXtInmaininfo{" +
        "inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", birthday=" + birthday +
        ", linkmanTel=" + linkmanTel +
        ", mcardNo=" + mcardNo +
        ", cardNo=" + cardNo +
        ", deptCode=" + deptCode +
        ", houseDocCode=" + houseDocCode +
        ", idenno=" + idenno +
        ", indate=" + indate +
        "}";
    }
}

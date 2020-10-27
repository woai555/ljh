package com.ljh.bean;

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
public class ViewHlhtPtAmbulatoryesd implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String jcptNo;

    private String clinicCode;

    private String name;

    private String visitId;

    private String visitType;

    private String visitTypename;

    private String seeDate;

    private String hostTell;

    private String realDoctid;

    private String realDoctname;

    private String deptCode;

    private String deptName;

    private String jgno;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getJcptNo() {
        return jcptNo;
    }

    public void setJcptNo(String jcptNo) {
        this.jcptNo = jcptNo;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getVisitTypename() {
        return visitTypename;
    }

    public void setVisitTypename(String visitTypename) {
        this.visitTypename = visitTypename;
    }

    public String getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(String seeDate) {
        this.seeDate = seeDate;
    }

    public String getHostTell() {
        return hostTell;
    }

    public void setHostTell(String hostTell) {
        this.hostTell = hostTell;
    }

    public String getRealDoctid() {
        return realDoctid;
    }

    public void setRealDoctid(String realDoctid) {
        this.realDoctid = realDoctid;
    }

    public String getRealDoctname() {
        return realDoctname;
    }

    public void setRealDoctname(String realDoctname) {
        this.realDoctname = realDoctname;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getJgno() {
        return jgno;
    }

    public void setJgno(String jgno) {
        this.jgno = jgno;
    }

    @Override
    public String toString() {
        return "ViewHlhtPtAmbulatoryesd{" +
        "cardNo=" + cardNo +
        ", jcptNo=" + jcptNo +
        ", clinicCode=" + clinicCode +
        ", name=" + name +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", visitTypename=" + visitTypename +
        ", seeDate=" + seeDate +
        ", hostTell=" + hostTell +
        ", realDoctid=" + realDoctid +
        ", realDoctname=" + realDoctname +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", jgno=" + jgno +
        "}";
    }
}

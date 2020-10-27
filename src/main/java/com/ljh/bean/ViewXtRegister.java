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
public class ViewXtRegister implements Serializable {

    private static final long serialVersionUID=1L;

    private String clinicCode;

    private String name;

    private String sexCode;

    private LocalDateTime birthday;

    private String relaPhone;

    private String mcardNo;

    private String cardNo;

    private String idenno;

    private String deptCode;

    private String doctCode;

    private LocalDateTime regDate;


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

    public String getRelaPhone() {
        return relaPhone;
    }

    public void setRelaPhone(String relaPhone) {
        this.relaPhone = relaPhone;
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

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "ViewXtRegister{" +
        "clinicCode=" + clinicCode +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", birthday=" + birthday +
        ", relaPhone=" + relaPhone +
        ", mcardNo=" + mcardNo +
        ", cardNo=" + cardNo +
        ", idenno=" + idenno +
        ", deptCode=" + deptCode +
        ", doctCode=" + doctCode +
        ", regDate=" + regDate +
        "}";
    }
}

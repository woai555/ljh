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
public class ViewJiaheSeedoctrecord implements Serializable {

    private static final long serialVersionUID=1L;

    private String seeNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String patientName;

    private Integer age;

    private String sex;

    private BigDecimal weight;

    private String mcardNo;

    private LocalDateTime seeDate;

    private String seeDeptid;

    private String seeDeptnm;

    private String seeDoctid;

    private String seeDoctnm;

    private String hostTell;

    private String currentIllness;

    private String anamnesis;

    private String allergen;

    private String checkbody;

    private String remark;

    private String other;

    private String adminical;

    private String disposition;

    private String diagCode1;

    private String diagName1;

    private String diagCode2;

    private String diagName2;

    private String diagCode3;

    private String diagName3;

    private String diagCode4;

    private String diagName4;

    private String diagCode5;

    private String diagName5;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getSeeDeptid() {
        return seeDeptid;
    }

    public void setSeeDeptid(String seeDeptid) {
        this.seeDeptid = seeDeptid;
    }

    public String getSeeDeptnm() {
        return seeDeptnm;
    }

    public void setSeeDeptnm(String seeDeptnm) {
        this.seeDeptnm = seeDeptnm;
    }

    public String getSeeDoctid() {
        return seeDoctid;
    }

    public void setSeeDoctid(String seeDoctid) {
        this.seeDoctid = seeDoctid;
    }

    public String getSeeDoctnm() {
        return seeDoctnm;
    }

    public void setSeeDoctnm(String seeDoctnm) {
        this.seeDoctnm = seeDoctnm;
    }

    public String getHostTell() {
        return hostTell;
    }

    public void setHostTell(String hostTell) {
        this.hostTell = hostTell;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public String getCheckbody() {
        return checkbody;
    }

    public void setCheckbody(String checkbody) {
        this.checkbody = checkbody;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getAdminical() {
        return adminical;
    }

    public void setAdminical(String adminical) {
        this.adminical = adminical;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getDiagCode1() {
        return diagCode1;
    }

    public void setDiagCode1(String diagCode1) {
        this.diagCode1 = diagCode1;
    }

    public String getDiagName1() {
        return diagName1;
    }

    public void setDiagName1(String diagName1) {
        this.diagName1 = diagName1;
    }

    public String getDiagCode2() {
        return diagCode2;
    }

    public void setDiagCode2(String diagCode2) {
        this.diagCode2 = diagCode2;
    }

    public String getDiagName2() {
        return diagName2;
    }

    public void setDiagName2(String diagName2) {
        this.diagName2 = diagName2;
    }

    public String getDiagCode3() {
        return diagCode3;
    }

    public void setDiagCode3(String diagCode3) {
        this.diagCode3 = diagCode3;
    }

    public String getDiagName3() {
        return diagName3;
    }

    public void setDiagName3(String diagName3) {
        this.diagName3 = diagName3;
    }

    public String getDiagCode4() {
        return diagCode4;
    }

    public void setDiagCode4(String diagCode4) {
        this.diagCode4 = diagCode4;
    }

    public String getDiagName4() {
        return diagName4;
    }

    public void setDiagName4(String diagName4) {
        this.diagName4 = diagName4;
    }

    public String getDiagCode5() {
        return diagCode5;
    }

    public void setDiagCode5(String diagCode5) {
        this.diagCode5 = diagCode5;
    }

    public String getDiagName5() {
        return diagName5;
    }

    public void setDiagName5(String diagName5) {
        this.diagName5 = diagName5;
    }

    @Override
    public String toString() {
        return "ViewJiaheSeedoctrecord{" +
        "seeNo=" + seeNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", patientName=" + patientName +
        ", age=" + age +
        ", sex=" + sex +
        ", weight=" + weight +
        ", mcardNo=" + mcardNo +
        ", seeDate=" + seeDate +
        ", seeDeptid=" + seeDeptid +
        ", seeDeptnm=" + seeDeptnm +
        ", seeDoctid=" + seeDoctid +
        ", seeDoctnm=" + seeDoctnm +
        ", hostTell=" + hostTell +
        ", currentIllness=" + currentIllness +
        ", anamnesis=" + anamnesis +
        ", allergen=" + allergen +
        ", checkbody=" + checkbody +
        ", remark=" + remark +
        ", other=" + other +
        ", adminical=" + adminical +
        ", disposition=" + disposition +
        ", diagCode1=" + diagCode1 +
        ", diagName1=" + diagName1 +
        ", diagCode2=" + diagCode2 +
        ", diagName2=" + diagName2 +
        ", diagCode3=" + diagCode3 +
        ", diagName3=" + diagName3 +
        ", diagCode4=" + diagCode4 +
        ", diagName4=" + diagName4 +
        ", diagCode5=" + diagCode5 +
        ", diagName5=" + diagName5 +
        "}";
    }
}

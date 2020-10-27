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
public class ViewBlPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String diagnosecardid;

    private String patname;

    private String birthday;

    private String age;

    private String sex;

    private String heigt;

    private String weight;

    private String nation;

    private String cardno;

    private String insuranceno;

    private String idcardno;

    private String depcode;

    private String wardcode;

    private String deptname;

    private String wardname;

    private String bedno;

    private String billtype;

    private String region;

    private String abo;

    private String rhd;

    private String diagnose;

    private String ptimes;

    private String operationname;

    private String anamnesis;

    private String antagonism;

    private String pregnant;

    private String allergy;

    private String zysf;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDiagnosecardid() {
        return diagnosecardid;
    }

    public void setDiagnosecardid(String diagnosecardid) {
        this.diagnosecardid = diagnosecardid;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeigt() {
        return heigt;
    }

    public void setHeigt(String heigt) {
        this.heigt = heigt;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getInsuranceno() {
        return insuranceno;
    }

    public void setInsuranceno(String insuranceno) {
        this.insuranceno = insuranceno;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getDepcode() {
        return depcode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public String getWardcode() {
        return wardcode;
    }

    public void setWardcode(String wardcode) {
        this.wardcode = wardcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getWardname() {
        return wardname;
    }

    public void setWardname(String wardname) {
        this.wardname = wardname;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public String getRhd() {
        return rhd;
    }

    public void setRhd(String rhd) {
        this.rhd = rhd;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getPtimes() {
        return ptimes;
    }

    public void setPtimes(String ptimes) {
        this.ptimes = ptimes;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getAntagonism() {
        return antagonism;
    }

    public void setAntagonism(String antagonism) {
        this.antagonism = antagonism;
    }

    public String getPregnant() {
        return pregnant;
    }

    public void setPregnant(String pregnant) {
        this.pregnant = pregnant;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getZysf() {
        return zysf;
    }

    public void setZysf(String zysf) {
        this.zysf = zysf;
    }

    @Override
    public String toString() {
        return "ViewBlPatientinfo{" +
        "patientId=" + patientId +
        ", diagnosecardid=" + diagnosecardid +
        ", patname=" + patname +
        ", birthday=" + birthday +
        ", age=" + age +
        ", sex=" + sex +
        ", heigt=" + heigt +
        ", weight=" + weight +
        ", nation=" + nation +
        ", cardno=" + cardno +
        ", insuranceno=" + insuranceno +
        ", idcardno=" + idcardno +
        ", depcode=" + depcode +
        ", wardcode=" + wardcode +
        ", deptname=" + deptname +
        ", wardname=" + wardname +
        ", bedno=" + bedno +
        ", billtype=" + billtype +
        ", region=" + region +
        ", abo=" + abo +
        ", rhd=" + rhd +
        ", diagnose=" + diagnose +
        ", ptimes=" + ptimes +
        ", operationname=" + operationname +
        ", anamnesis=" + anamnesis +
        ", antagonism=" + antagonism +
        ", pregnant=" + pregnant +
        ", allergy=" + allergy +
        ", zysf=" + zysf +
        "}";
    }
}

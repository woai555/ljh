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
public class ViewMjEmRegister implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime regDate;

    private String name;

    private String sexCode;

    private LocalDateTime birthday;

    private String cardNo;

    private String deptName;

    private String home;

    private String seeDoctnm;

    private BigDecimal ynChannel;

    private String grade;

    private String diagName;

    private String leave;

    private String symptom;

    private String result;

    private String nursename;

    private LocalDateTime seeDate;

    private BigDecimal animalHeat;

    private String bloodPressure;

    private String mind;

    private BigDecimal pulse;

    private String contagion;

    private String comeType;

    private Integer bloodOxygen;

    private Integer breath;

    private String remark;

    private String triageserialno;

    private BigDecimal weight;

    private String yncancel;

    private String clinicNo;


    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getSeeDoctnm() {
        return seeDoctnm;
    }

    public void setSeeDoctnm(String seeDoctnm) {
        this.seeDoctnm = seeDoctnm;
    }

    public BigDecimal getYnChannel() {
        return ynChannel;
    }

    public void setYnChannel(BigDecimal ynChannel) {
        this.ynChannel = ynChannel;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNursename() {
        return nursename;
    }

    public void setNursename(String nursename) {
        this.nursename = nursename;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public BigDecimal getAnimalHeat() {
        return animalHeat;
    }

    public void setAnimalHeat(BigDecimal animalHeat) {
        this.animalHeat = animalHeat;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }

    public BigDecimal getPulse() {
        return pulse;
    }

    public void setPulse(BigDecimal pulse) {
        this.pulse = pulse;
    }

    public String getContagion() {
        return contagion;
    }

    public void setContagion(String contagion) {
        this.contagion = contagion;
    }

    public String getComeType() {
        return comeType;
    }

    public void setComeType(String comeType) {
        this.comeType = comeType;
    }

    public Integer getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(Integer bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public Integer getBreath() {
        return breath;
    }

    public void setBreath(Integer breath) {
        this.breath = breath;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTriageserialno() {
        return triageserialno;
    }

    public void setTriageserialno(String triageserialno) {
        this.triageserialno = triageserialno;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getYncancel() {
        return yncancel;
    }

    public void setYncancel(String yncancel) {
        this.yncancel = yncancel;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    @Override
    public String toString() {
        return "ViewMjEmRegister{" +
        "regDate=" + regDate +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", birthday=" + birthday +
        ", cardNo=" + cardNo +
        ", deptName=" + deptName +
        ", home=" + home +
        ", seeDoctnm=" + seeDoctnm +
        ", ynChannel=" + ynChannel +
        ", grade=" + grade +
        ", diagName=" + diagName +
        ", leave=" + leave +
        ", symptom=" + symptom +
        ", result=" + result +
        ", nursename=" + nursename +
        ", seeDate=" + seeDate +
        ", animalHeat=" + animalHeat +
        ", bloodPressure=" + bloodPressure +
        ", mind=" + mind +
        ", pulse=" + pulse +
        ", contagion=" + contagion +
        ", comeType=" + comeType +
        ", bloodOxygen=" + bloodOxygen +
        ", breath=" + breath +
        ", remark=" + remark +
        ", triageserialno=" + triageserialno +
        ", weight=" + weight +
        ", yncancel=" + yncancel +
        ", clinicNo=" + clinicNo +
        "}";
    }
}

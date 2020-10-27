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
public class VRegister implements Serializable {

    private static final long serialVersionUID=1L;

    private String registerno;

    private String departmentcode;

    private String departmentname;

    private String registertypecode;

    private String registertypename;

    private LocalDateTime occurdate;

    private String occurtime;

    private String optcode;

    private String optname;

    private String doctorcode;

    private String doctorname;

    private String patientid;

    private String patientname;

    private String sex;

    private BigDecimal age;

    private BigDecimal amount;

    private BigDecimal registerfee;

    private BigDecimal itemfee;

    private BigDecimal expertfee;

    private String isstriked;

    private LocalDateTime strikedate;

    private String striketime;

    private String strikeoptcode;

    private String strikeoptname;

    private String strikedregisterno;

    private String redregisterflag;

    private String medicareflag;

    private String centercode;

    private String deskno;

    private String deskname;

    private String roomno;

    private String roomname;

    private String diagnosisdeskno;

    private String diagnosisdeskname;

    private String diagnosisstate;

    private String isregister;

    private String regno;

    private String am;

    private String note;


    public String getRegisterno() {
        return registerno;
    }

    public void setRegisterno(String registerno) {
        this.registerno = registerno;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getRegistertypecode() {
        return registertypecode;
    }

    public void setRegistertypecode(String registertypecode) {
        this.registertypecode = registertypecode;
    }

    public String getRegistertypename() {
        return registertypename;
    }

    public void setRegistertypename(String registertypename) {
        this.registertypename = registertypename;
    }

    public LocalDateTime getOccurdate() {
        return occurdate;
    }

    public void setOccurdate(LocalDateTime occurdate) {
        this.occurdate = occurdate;
    }

    public String getOccurtime() {
        return occurtime;
    }

    public void setOccurtime(String occurtime) {
        this.occurtime = occurtime;
    }

    public String getOptcode() {
        return optcode;
    }

    public void setOptcode(String optcode) {
        this.optcode = optcode;
    }

    public String getOptname() {
        return optname;
    }

    public void setOptname(String optname) {
        this.optname = optname;
    }

    public String getDoctorcode() {
        return doctorcode;
    }

    public void setDoctorcode(String doctorcode) {
        this.doctorcode = doctorcode;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRegisterfee() {
        return registerfee;
    }

    public void setRegisterfee(BigDecimal registerfee) {
        this.registerfee = registerfee;
    }

    public BigDecimal getItemfee() {
        return itemfee;
    }

    public void setItemfee(BigDecimal itemfee) {
        this.itemfee = itemfee;
    }

    public BigDecimal getExpertfee() {
        return expertfee;
    }

    public void setExpertfee(BigDecimal expertfee) {
        this.expertfee = expertfee;
    }

    public String getIsstriked() {
        return isstriked;
    }

    public void setIsstriked(String isstriked) {
        this.isstriked = isstriked;
    }

    public LocalDateTime getStrikedate() {
        return strikedate;
    }

    public void setStrikedate(LocalDateTime strikedate) {
        this.strikedate = strikedate;
    }

    public String getStriketime() {
        return striketime;
    }

    public void setStriketime(String striketime) {
        this.striketime = striketime;
    }

    public String getStrikeoptcode() {
        return strikeoptcode;
    }

    public void setStrikeoptcode(String strikeoptcode) {
        this.strikeoptcode = strikeoptcode;
    }

    public String getStrikeoptname() {
        return strikeoptname;
    }

    public void setStrikeoptname(String strikeoptname) {
        this.strikeoptname = strikeoptname;
    }

    public String getStrikedregisterno() {
        return strikedregisterno;
    }

    public void setStrikedregisterno(String strikedregisterno) {
        this.strikedregisterno = strikedregisterno;
    }

    public String getRedregisterflag() {
        return redregisterflag;
    }

    public void setRedregisterflag(String redregisterflag) {
        this.redregisterflag = redregisterflag;
    }

    public String getMedicareflag() {
        return medicareflag;
    }

    public void setMedicareflag(String medicareflag) {
        this.medicareflag = medicareflag;
    }

    public String getCentercode() {
        return centercode;
    }

    public void setCentercode(String centercode) {
        this.centercode = centercode;
    }

    public String getDeskno() {
        return deskno;
    }

    public void setDeskno(String deskno) {
        this.deskno = deskno;
    }

    public String getDeskname() {
        return deskname;
    }

    public void setDeskname(String deskname) {
        this.deskname = deskname;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getDiagnosisdeskno() {
        return diagnosisdeskno;
    }

    public void setDiagnosisdeskno(String diagnosisdeskno) {
        this.diagnosisdeskno = diagnosisdeskno;
    }

    public String getDiagnosisdeskname() {
        return diagnosisdeskname;
    }

    public void setDiagnosisdeskname(String diagnosisdeskname) {
        this.diagnosisdeskname = diagnosisdeskname;
    }

    public String getDiagnosisstate() {
        return diagnosisstate;
    }

    public void setDiagnosisstate(String diagnosisstate) {
        this.diagnosisstate = diagnosisstate;
    }

    public String getIsregister() {
        return isregister;
    }

    public void setIsregister(String isregister) {
        this.isregister = isregister;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "VRegister{" +
        "registerno=" + registerno +
        ", departmentcode=" + departmentcode +
        ", departmentname=" + departmentname +
        ", registertypecode=" + registertypecode +
        ", registertypename=" + registertypename +
        ", occurdate=" + occurdate +
        ", occurtime=" + occurtime +
        ", optcode=" + optcode +
        ", optname=" + optname +
        ", doctorcode=" + doctorcode +
        ", doctorname=" + doctorname +
        ", patientid=" + patientid +
        ", patientname=" + patientname +
        ", sex=" + sex +
        ", age=" + age +
        ", amount=" + amount +
        ", registerfee=" + registerfee +
        ", itemfee=" + itemfee +
        ", expertfee=" + expertfee +
        ", isstriked=" + isstriked +
        ", strikedate=" + strikedate +
        ", striketime=" + striketime +
        ", strikeoptcode=" + strikeoptcode +
        ", strikeoptname=" + strikeoptname +
        ", strikedregisterno=" + strikedregisterno +
        ", redregisterflag=" + redregisterflag +
        ", medicareflag=" + medicareflag +
        ", centercode=" + centercode +
        ", deskno=" + deskno +
        ", deskname=" + deskname +
        ", roomno=" + roomno +
        ", roomname=" + roomname +
        ", diagnosisdeskno=" + diagnosisdeskno +
        ", diagnosisdeskname=" + diagnosisdeskname +
        ", diagnosisstate=" + diagnosisstate +
        ", isregister=" + isregister +
        ", regno=" + regno +
        ", am=" + am +
        ", note=" + note +
        "}";
    }
}

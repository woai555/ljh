package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewHlhtPacscommitapplicatin implements Serializable {

    private static final long serialVersionUID=1L;

    private String applicationid;

    private String hispatienttypeid;

    private String hispatientid;

    private String imageno;

    private String patientindexid;

    private String patientname;

    private String gender;

    private String birthday;

    private String phonenumber;

    private String address;

    private String requesttime;

    private String reqdepartmentid;

    private String reqdepartmentname;

    private String hospitalid;

    private String reqdoctorid;

    private String reqdoctorname;

    private String chiefcomplaint;

    private String bedno;

    private String diagnose;

    private String abstracthistory;

    private String devicetypeid;

    private String devicetypename;

    private String deviceid;

    private String costs;

    private String studyitems;

    private String estimatetime;

    private String estimatetypeid;

    private String exedeptid;

    private String exedeptname;

    private String queueno;

    private String idnumber;

    private String sickroom;

    private String hospitalname;

    private String cardno;

    private String societyid;

    private String remark;

    private String positionid;

    private String positionname;

    private String checkmethodid;

    private String checkmethodname;

    private String checkitemcode;

    private String checkitemname;

    private String recipeNo;

    private BigDecimal sequenceNo;

    private String nationality;

    private String folk;

    private String backupfiled2;

    private String backupfiled3;

    private String operatorid;

    private String operateType;


    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    public String getHispatienttypeid() {
        return hispatienttypeid;
    }

    public void setHispatienttypeid(String hispatienttypeid) {
        this.hispatienttypeid = hispatienttypeid;
    }

    public String getHispatientid() {
        return hispatientid;
    }

    public void setHispatientid(String hispatientid) {
        this.hispatientid = hispatientid;
    }

    public String getImageno() {
        return imageno;
    }

    public void setImageno(String imageno) {
        this.imageno = imageno;
    }

    public String getPatientindexid() {
        return patientindexid;
    }

    public void setPatientindexid(String patientindexid) {
        this.patientindexid = patientindexid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(String requesttime) {
        this.requesttime = requesttime;
    }

    public String getReqdepartmentid() {
        return reqdepartmentid;
    }

    public void setReqdepartmentid(String reqdepartmentid) {
        this.reqdepartmentid = reqdepartmentid;
    }

    public String getReqdepartmentname() {
        return reqdepartmentname;
    }

    public void setReqdepartmentname(String reqdepartmentname) {
        this.reqdepartmentname = reqdepartmentname;
    }

    public String getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(String hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getReqdoctorid() {
        return reqdoctorid;
    }

    public void setReqdoctorid(String reqdoctorid) {
        this.reqdoctorid = reqdoctorid;
    }

    public String getReqdoctorname() {
        return reqdoctorname;
    }

    public void setReqdoctorname(String reqdoctorname) {
        this.reqdoctorname = reqdoctorname;
    }

    public String getChiefcomplaint() {
        return chiefcomplaint;
    }

    public void setChiefcomplaint(String chiefcomplaint) {
        this.chiefcomplaint = chiefcomplaint;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getAbstracthistory() {
        return abstracthistory;
    }

    public void setAbstracthistory(String abstracthistory) {
        this.abstracthistory = abstracthistory;
    }

    public String getDevicetypeid() {
        return devicetypeid;
    }

    public void setDevicetypeid(String devicetypeid) {
        this.devicetypeid = devicetypeid;
    }

    public String getDevicetypename() {
        return devicetypename;
    }

    public void setDevicetypename(String devicetypename) {
        this.devicetypename = devicetypename;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getCosts() {
        return costs;
    }

    public void setCosts(String costs) {
        this.costs = costs;
    }

    public String getStudyitems() {
        return studyitems;
    }

    public void setStudyitems(String studyitems) {
        this.studyitems = studyitems;
    }

    public String getEstimatetime() {
        return estimatetime;
    }

    public void setEstimatetime(String estimatetime) {
        this.estimatetime = estimatetime;
    }

    public String getEstimatetypeid() {
        return estimatetypeid;
    }

    public void setEstimatetypeid(String estimatetypeid) {
        this.estimatetypeid = estimatetypeid;
    }

    public String getExedeptid() {
        return exedeptid;
    }

    public void setExedeptid(String exedeptid) {
        this.exedeptid = exedeptid;
    }

    public String getExedeptname() {
        return exedeptname;
    }

    public void setExedeptname(String exedeptname) {
        this.exedeptname = exedeptname;
    }

    public String getQueueno() {
        return queueno;
    }

    public void setQueueno(String queueno) {
        this.queueno = queueno;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getSickroom() {
        return sickroom;
    }

    public void setSickroom(String sickroom) {
        this.sickroom = sickroom;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getSocietyid() {
        return societyid;
    }

    public void setSocietyid(String societyid) {
        this.societyid = societyid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPositionid() {
        return positionid;
    }

    public void setPositionid(String positionid) {
        this.positionid = positionid;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public String getCheckmethodid() {
        return checkmethodid;
    }

    public void setCheckmethodid(String checkmethodid) {
        this.checkmethodid = checkmethodid;
    }

    public String getCheckmethodname() {
        return checkmethodname;
    }

    public void setCheckmethodname(String checkmethodname) {
        this.checkmethodname = checkmethodname;
    }

    public String getCheckitemcode() {
        return checkitemcode;
    }

    public void setCheckitemcode(String checkitemcode) {
        this.checkitemcode = checkitemcode;
    }

    public String getCheckitemname() {
        return checkitemname;
    }

    public void setCheckitemname(String checkitemname) {
        this.checkitemname = checkitemname;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public BigDecimal getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(BigDecimal sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public String getBackupfiled2() {
        return backupfiled2;
    }

    public void setBackupfiled2(String backupfiled2) {
        this.backupfiled2 = backupfiled2;
    }

    public String getBackupfiled3() {
        return backupfiled3;
    }

    public void setBackupfiled3(String backupfiled3) {
        this.backupfiled3 = backupfiled3;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Override
    public String toString() {
        return "ViewHlhtPacscommitapplicatin{" +
        "applicationid=" + applicationid +
        ", hispatienttypeid=" + hispatienttypeid +
        ", hispatientid=" + hispatientid +
        ", imageno=" + imageno +
        ", patientindexid=" + patientindexid +
        ", patientname=" + patientname +
        ", gender=" + gender +
        ", birthday=" + birthday +
        ", phonenumber=" + phonenumber +
        ", address=" + address +
        ", requesttime=" + requesttime +
        ", reqdepartmentid=" + reqdepartmentid +
        ", reqdepartmentname=" + reqdepartmentname +
        ", hospitalid=" + hospitalid +
        ", reqdoctorid=" + reqdoctorid +
        ", reqdoctorname=" + reqdoctorname +
        ", chiefcomplaint=" + chiefcomplaint +
        ", bedno=" + bedno +
        ", diagnose=" + diagnose +
        ", abstracthistory=" + abstracthistory +
        ", devicetypeid=" + devicetypeid +
        ", devicetypename=" + devicetypename +
        ", deviceid=" + deviceid +
        ", costs=" + costs +
        ", studyitems=" + studyitems +
        ", estimatetime=" + estimatetime +
        ", estimatetypeid=" + estimatetypeid +
        ", exedeptid=" + exedeptid +
        ", exedeptname=" + exedeptname +
        ", queueno=" + queueno +
        ", idnumber=" + idnumber +
        ", sickroom=" + sickroom +
        ", hospitalname=" + hospitalname +
        ", cardno=" + cardno +
        ", societyid=" + societyid +
        ", remark=" + remark +
        ", positionid=" + positionid +
        ", positionname=" + positionname +
        ", checkmethodid=" + checkmethodid +
        ", checkmethodname=" + checkmethodname +
        ", checkitemcode=" + checkitemcode +
        ", checkitemname=" + checkitemname +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", nationality=" + nationality +
        ", folk=" + folk +
        ", backupfiled2=" + backupfiled2 +
        ", backupfiled3=" + backupfiled3 +
        ", operatorid=" + operatorid +
        ", operateType=" + operateType +
        "}";
    }
}

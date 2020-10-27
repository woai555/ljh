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
public class VPacs implements Serializable {

    private static final long serialVersionUID=1L;

    private String recipe;

    private String cardNo;

    private String itemCode;

    private String reqDept;

    private LocalDateTime operDate;

    private String hispatientid;

    private String patientname;

    private String sex;

    private String birthday;

    private String reqdepartmentname;

    private String machineType;

    private String zhusu;

    private String xianbingshi;

    private String jiwangshi;

    private String chati;

    private String youguanjiancha;

    private String diagnose;

    private String linchuangyinxiang;

    private String diagnose2;

    private String diagnose3;

    private String diagnose4;

    private String diagnose5;

    private String pacsname;

    private String beizhu;

    private String combNo;

    private String yaoqiuyumudi;

    private String reqdoctor;

    private String reqdoctorname;

    private String yyDate;

    private String zhuyishixiang;

    private String deptName;

    private String jianchadidian;

    private BigDecimal patienttypeid;

    private String societyid;

    private String otherpatientid;

    private String enetpatientid;

    private String idnumber;

    private String phonenumber;

    private String address;

    private String email;

    private String folk;

    private String nationality;

    private String sickbed;

    private String sickroom;

    private String reqhospital;

    private String abstracthistory;

    private String backupfield1;

    private String blZysx;

    private String jianchabuwei;


    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getReqDept() {
        return reqDept;
    }

    public void setReqDept(String reqDept) {
        this.reqDept = reqDept;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getHispatientid() {
        return hispatientid;
    }

    public void setHispatientid(String hispatientid) {
        this.hispatientid = hispatientid;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getReqdepartmentname() {
        return reqdepartmentname;
    }

    public void setReqdepartmentname(String reqdepartmentname) {
        this.reqdepartmentname = reqdepartmentname;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getZhusu() {
        return zhusu;
    }

    public void setZhusu(String zhusu) {
        this.zhusu = zhusu;
    }

    public String getXianbingshi() {
        return xianbingshi;
    }

    public void setXianbingshi(String xianbingshi) {
        this.xianbingshi = xianbingshi;
    }

    public String getJiwangshi() {
        return jiwangshi;
    }

    public void setJiwangshi(String jiwangshi) {
        this.jiwangshi = jiwangshi;
    }

    public String getChati() {
        return chati;
    }

    public void setChati(String chati) {
        this.chati = chati;
    }

    public String getYouguanjiancha() {
        return youguanjiancha;
    }

    public void setYouguanjiancha(String youguanjiancha) {
        this.youguanjiancha = youguanjiancha;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getLinchuangyinxiang() {
        return linchuangyinxiang;
    }

    public void setLinchuangyinxiang(String linchuangyinxiang) {
        this.linchuangyinxiang = linchuangyinxiang;
    }

    public String getDiagnose2() {
        return diagnose2;
    }

    public void setDiagnose2(String diagnose2) {
        this.diagnose2 = diagnose2;
    }

    public String getDiagnose3() {
        return diagnose3;
    }

    public void setDiagnose3(String diagnose3) {
        this.diagnose3 = diagnose3;
    }

    public String getDiagnose4() {
        return diagnose4;
    }

    public void setDiagnose4(String diagnose4) {
        this.diagnose4 = diagnose4;
    }

    public String getDiagnose5() {
        return diagnose5;
    }

    public void setDiagnose5(String diagnose5) {
        this.diagnose5 = diagnose5;
    }

    public String getPacsname() {
        return pacsname;
    }

    public void setPacsname(String pacsname) {
        this.pacsname = pacsname;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public String getYaoqiuyumudi() {
        return yaoqiuyumudi;
    }

    public void setYaoqiuyumudi(String yaoqiuyumudi) {
        this.yaoqiuyumudi = yaoqiuyumudi;
    }

    public String getReqdoctor() {
        return reqdoctor;
    }

    public void setReqdoctor(String reqdoctor) {
        this.reqdoctor = reqdoctor;
    }

    public String getReqdoctorname() {
        return reqdoctorname;
    }

    public void setReqdoctorname(String reqdoctorname) {
        this.reqdoctorname = reqdoctorname;
    }

    public String getYyDate() {
        return yyDate;
    }

    public void setYyDate(String yyDate) {
        this.yyDate = yyDate;
    }

    public String getZhuyishixiang() {
        return zhuyishixiang;
    }

    public void setZhuyishixiang(String zhuyishixiang) {
        this.zhuyishixiang = zhuyishixiang;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getJianchadidian() {
        return jianchadidian;
    }

    public void setJianchadidian(String jianchadidian) {
        this.jianchadidian = jianchadidian;
    }

    public BigDecimal getPatienttypeid() {
        return patienttypeid;
    }

    public void setPatienttypeid(BigDecimal patienttypeid) {
        this.patienttypeid = patienttypeid;
    }

    public String getSocietyid() {
        return societyid;
    }

    public void setSocietyid(String societyid) {
        this.societyid = societyid;
    }

    public String getOtherpatientid() {
        return otherpatientid;
    }

    public void setOtherpatientid(String otherpatientid) {
        this.otherpatientid = otherpatientid;
    }

    public String getEnetpatientid() {
        return enetpatientid;
    }

    public void setEnetpatientid(String enetpatientid) {
        this.enetpatientid = enetpatientid;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSickbed() {
        return sickbed;
    }

    public void setSickbed(String sickbed) {
        this.sickbed = sickbed;
    }

    public String getSickroom() {
        return sickroom;
    }

    public void setSickroom(String sickroom) {
        this.sickroom = sickroom;
    }

    public String getReqhospital() {
        return reqhospital;
    }

    public void setReqhospital(String reqhospital) {
        this.reqhospital = reqhospital;
    }

    public String getAbstracthistory() {
        return abstracthistory;
    }

    public void setAbstracthistory(String abstracthistory) {
        this.abstracthistory = abstracthistory;
    }

    public String getBackupfield1() {
        return backupfield1;
    }

    public void setBackupfield1(String backupfield1) {
        this.backupfield1 = backupfield1;
    }

    public String getBlZysx() {
        return blZysx;
    }

    public void setBlZysx(String blZysx) {
        this.blZysx = blZysx;
    }

    public String getJianchabuwei() {
        return jianchabuwei;
    }

    public void setJianchabuwei(String jianchabuwei) {
        this.jianchabuwei = jianchabuwei;
    }

    @Override
    public String toString() {
        return "VPacs{" +
        "recipe=" + recipe +
        ", cardNo=" + cardNo +
        ", itemCode=" + itemCode +
        ", reqDept=" + reqDept +
        ", operDate=" + operDate +
        ", hispatientid=" + hispatientid +
        ", patientname=" + patientname +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", reqdepartmentname=" + reqdepartmentname +
        ", machineType=" + machineType +
        ", zhusu=" + zhusu +
        ", xianbingshi=" + xianbingshi +
        ", jiwangshi=" + jiwangshi +
        ", chati=" + chati +
        ", youguanjiancha=" + youguanjiancha +
        ", diagnose=" + diagnose +
        ", linchuangyinxiang=" + linchuangyinxiang +
        ", diagnose2=" + diagnose2 +
        ", diagnose3=" + diagnose3 +
        ", diagnose4=" + diagnose4 +
        ", diagnose5=" + diagnose5 +
        ", pacsname=" + pacsname +
        ", beizhu=" + beizhu +
        ", combNo=" + combNo +
        ", yaoqiuyumudi=" + yaoqiuyumudi +
        ", reqdoctor=" + reqdoctor +
        ", reqdoctorname=" + reqdoctorname +
        ", yyDate=" + yyDate +
        ", zhuyishixiang=" + zhuyishixiang +
        ", deptName=" + deptName +
        ", jianchadidian=" + jianchadidian +
        ", patienttypeid=" + patienttypeid +
        ", societyid=" + societyid +
        ", otherpatientid=" + otherpatientid +
        ", enetpatientid=" + enetpatientid +
        ", idnumber=" + idnumber +
        ", phonenumber=" + phonenumber +
        ", address=" + address +
        ", email=" + email +
        ", folk=" + folk +
        ", nationality=" + nationality +
        ", sickbed=" + sickbed +
        ", sickroom=" + sickroom +
        ", reqhospital=" + reqhospital +
        ", abstracthistory=" + abstracthistory +
        ", backupfield1=" + backupfield1 +
        ", blZysx=" + blZysx +
        ", jianchabuwei=" + jianchabuwei +
        "}";
    }
}

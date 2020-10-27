package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 麻醉申请资料档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpAnaesthesia implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 麻醉申请单号
     */
    @TableId(value = "ANAE_APPNO", type = IdType.AUTO)
    private String anaeAppno;

    /**
     * 申请来源
     */
    private String anaeAppsrc;

    /**
     * 申请用途
     */
    private String anaeAppgal;

    /**
     * 住院流水号
     */
    private String inpatientNo;

    /**
     * 住院病历号
     */
    private String patientNo;

    /**
     * 门诊病历号
     */
    private String cardNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 麻醉方式编码
     */
    private String anaescode;

    /**
     * 申请科室代码
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 申请人代码
     */
    private String appUsercd;

    /**
     * 申请人姓名
     */
    private String appUsernm;

    /**
     * 申请手术时间
     */
    private LocalDateTime useTime;

    /**
     * 申请单状态
     */
    private String appStat;

    /**
     * 手术编号
     */
    private String opsAppno;

    /**
     * 说明
     */
    private String anaeNote;

    /**
     * 麻醉医师编码
     */
    private String anaeDoccode;

    /**
     * 麻醉医师姓名
     */
    private String anaeDocname;


    public String getAnaeAppno() {
        return anaeAppno;
    }

    public void setAnaeAppno(String anaeAppno) {
        this.anaeAppno = anaeAppno;
    }

    public String getAnaeAppsrc() {
        return anaeAppsrc;
    }

    public void setAnaeAppsrc(String anaeAppsrc) {
        this.anaeAppsrc = anaeAppsrc;
    }

    public String getAnaeAppgal() {
        return anaeAppgal;
    }

    public void setAnaeAppgal(String anaeAppgal) {
        this.anaeAppgal = anaeAppgal;
    }

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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getAnaescode() {
        return anaescode;
    }

    public void setAnaescode(String anaescode) {
        this.anaescode = anaescode;
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

    public String getAppUsercd() {
        return appUsercd;
    }

    public void setAppUsercd(String appUsercd) {
        this.appUsercd = appUsercd;
    }

    public String getAppUsernm() {
        return appUsernm;
    }

    public void setAppUsernm(String appUsernm) {
        this.appUsernm = appUsernm;
    }

    public LocalDateTime getUseTime() {
        return useTime;
    }

    public void setUseTime(LocalDateTime useTime) {
        this.useTime = useTime;
    }

    public String getAppStat() {
        return appStat;
    }

    public void setAppStat(String appStat) {
        this.appStat = appStat;
    }

    public String getOpsAppno() {
        return opsAppno;
    }

    public void setOpsAppno(String opsAppno) {
        this.opsAppno = opsAppno;
    }

    public String getAnaeNote() {
        return anaeNote;
    }

    public void setAnaeNote(String anaeNote) {
        this.anaeNote = anaeNote;
    }

    public String getAnaeDoccode() {
        return anaeDoccode;
    }

    public void setAnaeDoccode(String anaeDoccode) {
        this.anaeDoccode = anaeDoccode;
    }

    public String getAnaeDocname() {
        return anaeDocname;
    }

    public void setAnaeDocname(String anaeDocname) {
        this.anaeDocname = anaeDocname;
    }

    @Override
    public String toString() {
        return "OpAnaesthesia{" +
        "anaeAppno=" + anaeAppno +
        ", anaeAppsrc=" + anaeAppsrc +
        ", anaeAppgal=" + anaeAppgal +
        ", inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", anaescode=" + anaescode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", appUsercd=" + appUsercd +
        ", appUsernm=" + appUsernm +
        ", useTime=" + useTime +
        ", appStat=" + appStat +
        ", opsAppno=" + opsAppno +
        ", anaeNote=" + anaeNote +
        ", anaeDoccode=" + anaeDoccode +
        ", anaeDocname=" + anaeDocname +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 员工代码表(R_Employee)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class REmployee implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 员工代号
     */
    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;

    /**
     * 姓名
     */
    private String emplName;

    /**
     * 英文姓名
     */
    private String emplEname;

    /**
     * 性别
     */
    private String sexCode;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职务代号
     */
    private String posiCode;

    /**
     * 职级代号
     */
    private String levlCode;

    /**
     * 身份证号
     */
    private String idenno;

    /**
     * 所属科室号
     */
    private String deptCode;

    /**
     * 所属护理站
     */
    private String nurseCellCode;

    /**
     * 专长
     */
    private String speciality;

    /**
     * 是否专家
     */
    private String ynexpert;

    /**
     * 人员类型
     */
    private String emplType;

    /**
     * 是否可开麻药
     */
    private String ynlistdrug;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    private String zhiwu;

    /**
     * 手术规模
     */
    private String operGrade;

    /**
     * 允许开抗生素等级 0不允许开kss 1允许开非限制使用 2允许开限制使用 3允许开特殊使用
     */
    private String ynkss;

    /**
     * 是否允许开自费药,0不可以,1可以
     */
    private String ynzfy;

    /**
     * 只能本科内医生预约的专家 1
     */
    private String nbyy;

    /**
     * 专业组分组
     */
    private String profGroup;

    /**
     * ca32位码
     */
    private String pCardno;

    /**
     * 职业证书编码
     */
    private String doctCardid;

    /**
     * 本院职工诊健医令诊断证明打印权限：1 允许；0 不允许
     */
    private String printPermit;

    /**
     * 奖金系统工资号
     */
    private String codeGz;

    /**
     * 绩效科室
     */
    private String deptGz;

    /**
     * 绿色通道准入权限
     */
    private String gchannelPower;

    /**
     * 是否专业组
     */
    private String ifgroup;

    /**
     * CA32位码
     */
    private String caid;

    /**
     * 集成平台全局编号
     */
    private String jcptno;

    /**
     * 1：隶属科室DEPT_CODE(亚科),排班排大科室,应虚拟科室要求增加; 2:京医通平台同一医生在多科显示，对照关系见r_emplvsdept,3互联网医院专属
     */
    private String bz;

    /**
     * 互联网问诊权限
     */
    private String onlineFlag;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmplEname() {
        return emplEname;
    }

    public void setEmplEname(String emplEname) {
        this.emplEname = emplEname;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosiCode() {
        return posiCode;
    }

    public void setPosiCode(String posiCode) {
        this.posiCode = posiCode;
    }

    public String getLevlCode() {
        return levlCode;
    }

    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public String getNurseCellCode() {
        return nurseCellCode;
    }

    public void setNurseCellCode(String nurseCellCode) {
        this.nurseCellCode = nurseCellCode;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getYnexpert() {
        return ynexpert;
    }

    public void setYnexpert(String ynexpert) {
        this.ynexpert = ynexpert;
    }

    public String getEmplType() {
        return emplType;
    }

    public void setEmplType(String emplType) {
        this.emplType = emplType;
    }

    public String getYnlistdrug() {
        return ynlistdrug;
    }

    public void setYnlistdrug(String ynlistdrug) {
        this.ynlistdrug = ynlistdrug;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }

    public String getOperGrade() {
        return operGrade;
    }

    public void setOperGrade(String operGrade) {
        this.operGrade = operGrade;
    }

    public String getYnkss() {
        return ynkss;
    }

    public void setYnkss(String ynkss) {
        this.ynkss = ynkss;
    }

    public String getYnzfy() {
        return ynzfy;
    }

    public void setYnzfy(String ynzfy) {
        this.ynzfy = ynzfy;
    }

    public String getNbyy() {
        return nbyy;
    }

    public void setNbyy(String nbyy) {
        this.nbyy = nbyy;
    }

    public String getProfGroup() {
        return profGroup;
    }

    public void setProfGroup(String profGroup) {
        this.profGroup = profGroup;
    }

    public String getpCardno() {
        return pCardno;
    }

    public void setpCardno(String pCardno) {
        this.pCardno = pCardno;
    }

    public String getDoctCardid() {
        return doctCardid;
    }

    public void setDoctCardid(String doctCardid) {
        this.doctCardid = doctCardid;
    }

    public String getPrintPermit() {
        return printPermit;
    }

    public void setPrintPermit(String printPermit) {
        this.printPermit = printPermit;
    }

    public String getCodeGz() {
        return codeGz;
    }

    public void setCodeGz(String codeGz) {
        this.codeGz = codeGz;
    }

    public String getDeptGz() {
        return deptGz;
    }

    public void setDeptGz(String deptGz) {
        this.deptGz = deptGz;
    }

    public String getGchannelPower() {
        return gchannelPower;
    }

    public void setGchannelPower(String gchannelPower) {
        this.gchannelPower = gchannelPower;
    }

    public String getIfgroup() {
        return ifgroup;
    }

    public void setIfgroup(String ifgroup) {
        this.ifgroup = ifgroup;
    }

    public String getCaid() {
        return caid;
    }

    public void setCaid(String caid) {
        this.caid = caid;
    }

    public String getJcptno() {
        return jcptno;
    }

    public void setJcptno(String jcptno) {
        this.jcptno = jcptno;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getOnlineFlag() {
        return onlineFlag;
    }

    public void setOnlineFlag(String onlineFlag) {
        this.onlineFlag = onlineFlag;
    }

    @Override
    public String toString() {
        return "REmployee{" +
        "emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", emplEname=" + emplEname +
        ", sexCode=" + sexCode +
        ", age=" + age +
        ", posiCode=" + posiCode +
        ", levlCode=" + levlCode +
        ", idenno=" + idenno +
        ", deptCode=" + deptCode +
        ", nurseCellCode=" + nurseCellCode +
        ", speciality=" + speciality +
        ", ynexpert=" + ynexpert +
        ", emplType=" + emplType +
        ", ynlistdrug=" + ynlistdrug +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", zhiwu=" + zhiwu +
        ", operGrade=" + operGrade +
        ", ynkss=" + ynkss +
        ", ynzfy=" + ynzfy +
        ", nbyy=" + nbyy +
        ", profGroup=" + profGroup +
        ", pCardno=" + pCardno +
        ", doctCardid=" + doctCardid +
        ", printPermit=" + printPermit +
        ", codeGz=" + codeGz +
        ", deptGz=" + deptGz +
        ", gchannelPower=" + gchannelPower +
        ", ifgroup=" + ifgroup +
        ", caid=" + caid +
        ", jcptno=" + jcptno +
        ", bz=" + bz +
        ", onlineFlag=" + onlineFlag +
        "}";
    }
}

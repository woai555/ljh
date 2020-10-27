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
public class RegisterAssign implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "REG_ID", type = IdType.AUTO)
    private String regId;

    /**
     * 卡号
     */
    private String treatCardNo;

    /**
     * 医保卡号
     */
    private String healthcareCardNo;

    /**
     * 京医通卡号
     */
    private String jytCardNo;

    /**
     * 患者编号
     */
    private String patCode;

    /**
     * 患者名称
     */
    private String patName;

    /**
     * 性别
     */
    private String patSex;

    /**
     * 医生编码
     */
    private String doctorCode;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 科室编码
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 专业编码
     */
    private String profCode;

    /**
     * 专业名称
     */
    private String profName;

    /**
     * 挂号级别
     */
    private String regGrade;

    /**
     * 看诊序号
     */
    private Integer regSeqNo;

    /**
     * 看诊时间
     */
    private LocalDateTime regTime;

    /**
     * 午别
     */
    private String noonFlag;

    /**
     * 接诊状态
     */
    private Integer isJz;

    /**
     * 呼叫位置
     */
    private BigDecimal room;

    /**
     * 呼叫状态
     */
    private String status;

    /**
     * 呼叫时间
     */
    private LocalDateTime callTime;

    /**
     * 报道标识
     */
    private Integer arrival;

    /**
     * 报道时间
     */
    private LocalDateTime arrivalTime;

    /**
     * 年龄
     */
    private String age;

    /**
     * 上屏时间
     */
    private LocalDateTime upScreenTime;

    /**
     * 上屏时间
     */
    private BigDecimal upScreen;

    /**
     * 患者退号标识(1退号 0正常)
     */
    private String withdrawFlag;

    /**
     * 分诊大夫编码
     */
    private String triageDoct;

    private String clinicCode;

    /**
     * 分诊大夫名称
     */
    private String triageDoctname;

    /**
     * 诊室名称
     */
    private String roomname;

    /**
     * 呼叫大夫编码
     */
    private String callDoctcode;

    /**
     * 候诊诊区
     */
    private String waitingArea;

    private Integer weight;

    /**
     * 看诊大夫
     */
    private String realDoctcode;

    /**
     * 看诊大夫
     */
    private String realDoctname;

    /**
     * 身份证号
     */
    private String idenno;

    /**
     * 急诊等级
     */
    private String grade;


    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getTreatCardNo() {
        return treatCardNo;
    }

    public void setTreatCardNo(String treatCardNo) {
        this.treatCardNo = treatCardNo;
    }

    public String getHealthcareCardNo() {
        return healthcareCardNo;
    }

    public void setHealthcareCardNo(String healthcareCardNo) {
        this.healthcareCardNo = healthcareCardNo;
    }

    public String getJytCardNo() {
        return jytCardNo;
    }

    public void setJytCardNo(String jytCardNo) {
        this.jytCardNo = jytCardNo;
    }

    public String getPatCode() {
        return patCode;
    }

    public void setPatCode(String patCode) {
        this.patCode = patCode;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPatSex() {
        return patSex;
    }

    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
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

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getRegGrade() {
        return regGrade;
    }

    public void setRegGrade(String regGrade) {
        this.regGrade = regGrade;
    }

    public Integer getRegSeqNo() {
        return regSeqNo;
    }

    public void setRegSeqNo(Integer regSeqNo) {
        this.regSeqNo = regSeqNo;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public String getNoonFlag() {
        return noonFlag;
    }

    public void setNoonFlag(String noonFlag) {
        this.noonFlag = noonFlag;
    }

    public Integer getIsJz() {
        return isJz;
    }

    public void setIsJz(Integer isJz) {
        this.isJz = isJz;
    }

    public BigDecimal getRoom() {
        return room;
    }

    public void setRoom(BigDecimal room) {
        this.room = room;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCallTime() {
        return callTime;
    }

    public void setCallTime(LocalDateTime callTime) {
        this.callTime = callTime;
    }

    public Integer getArrival() {
        return arrival;
    }

    public void setArrival(Integer arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDateTime getUpScreenTime() {
        return upScreenTime;
    }

    public void setUpScreenTime(LocalDateTime upScreenTime) {
        this.upScreenTime = upScreenTime;
    }

    public BigDecimal getUpScreen() {
        return upScreen;
    }

    public void setUpScreen(BigDecimal upScreen) {
        this.upScreen = upScreen;
    }

    public String getWithdrawFlag() {
        return withdrawFlag;
    }

    public void setWithdrawFlag(String withdrawFlag) {
        this.withdrawFlag = withdrawFlag;
    }

    public String getTriageDoct() {
        return triageDoct;
    }

    public void setTriageDoct(String triageDoct) {
        this.triageDoct = triageDoct;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getTriageDoctname() {
        return triageDoctname;
    }

    public void setTriageDoctname(String triageDoctname) {
        this.triageDoctname = triageDoctname;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getCallDoctcode() {
        return callDoctcode;
    }

    public void setCallDoctcode(String callDoctcode) {
        this.callDoctcode = callDoctcode;
    }

    public String getWaitingArea() {
        return waitingArea;
    }

    public void setWaitingArea(String waitingArea) {
        this.waitingArea = waitingArea;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getRealDoctcode() {
        return realDoctcode;
    }

    public void setRealDoctcode(String realDoctcode) {
        this.realDoctcode = realDoctcode;
    }

    public String getRealDoctname() {
        return realDoctname;
    }

    public void setRealDoctname(String realDoctname) {
        this.realDoctname = realDoctname;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "RegisterAssign{" +
        "regId=" + regId +
        ", treatCardNo=" + treatCardNo +
        ", healthcareCardNo=" + healthcareCardNo +
        ", jytCardNo=" + jytCardNo +
        ", patCode=" + patCode +
        ", patName=" + patName +
        ", patSex=" + patSex +
        ", doctorCode=" + doctorCode +
        ", doctorName=" + doctorName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", profCode=" + profCode +
        ", profName=" + profName +
        ", regGrade=" + regGrade +
        ", regSeqNo=" + regSeqNo +
        ", regTime=" + regTime +
        ", noonFlag=" + noonFlag +
        ", isJz=" + isJz +
        ", room=" + room +
        ", status=" + status +
        ", callTime=" + callTime +
        ", arrival=" + arrival +
        ", arrivalTime=" + arrivalTime +
        ", age=" + age +
        ", upScreenTime=" + upScreenTime +
        ", upScreen=" + upScreen +
        ", withdrawFlag=" + withdrawFlag +
        ", triageDoct=" + triageDoct +
        ", clinicCode=" + clinicCode +
        ", triageDoctname=" + triageDoctname +
        ", roomname=" + roomname +
        ", callDoctcode=" + callDoctcode +
        ", waitingArea=" + waitingArea +
        ", weight=" + weight +
        ", realDoctcode=" + realDoctcode +
        ", realDoctname=" + realDoctname +
        ", idenno=" + idenno +
        ", grade=" + grade +
        "}";
    }
}

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
public class LCheckregister implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 处方号
     */
    @TableId(value = "PRESCRIPTNO", type = IdType.AUTO)
    private String prescriptno;

    /**
     * 门诊或住院，1门诊，2住院
     */
    private Integer inorout;

    /**
     * 就诊卡号
     */
    private String cardid;

    /**
     * 门诊流水号
     */
    private String clinicno;

    /**
     * 住院号
     */
    private String patientid;

    /**
     * 住院流水号
     */
    private String inpatientno;

    /**
     * 机器编码
     */
    private String machinecode;

    /**
     * 检验单号
     */
    private String checkorder;

    /**
     * 检验日期
     */
    private LocalDateTime checkdate;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 地址
     */
    private String address;

    /**
     * 家庭住址
     */
    private String homeplace;

    /**
     * 执行科室
     */
    private String checkdeptid;

    /**
     * 处置数
     */
    private Integer treatmentnum;

    /**
     * 处置时间
     */
    private LocalDateTime treatmenttime;

    /**
     * 登记人
     */
    private String registerid;

    /**
     * 检验标识
     */
    private String checkmark;

    private LocalDateTime drawtime;

    /**
     * 核准标志
     */
    private String confirmid;

    /**
     * 仪检标志
     */
    private String automark;

    /**
     * 镜检标志
     */
    private String bymanmark;

    /**
     * 组合项目编码
     */
    private String multiitemcode;

    /**
     * 组合项目名称
     */
    private String multiitemname;

    /**
     * 备注
     */
    private String remark;

    /**
     * 疾病编码
     */
    private String icdCode;

    /**
     * 疾病名称
     */
    private String icdName;

    /**
     * 住院科室
     */
    private String roomid;

    private String remark1;

    /**
     * 组合序号
     */
    private String combNo;

    /**
     * 检验小组
     */
    private String groupcode;

    /**
     * 处置号
     */
    private String processno;

    private BigDecimal cost;

    private String machineid;

    private String labType;


    public String getPrescriptno() {
        return prescriptno;
    }

    public void setPrescriptno(String prescriptno) {
        this.prescriptno = prescriptno;
    }

    public Integer getInorout() {
        return inorout;
    }

    public void setInorout(Integer inorout) {
        this.inorout = inorout;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getClinicno() {
        return clinicno;
    }

    public void setClinicno(String clinicno) {
        this.clinicno = clinicno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder;
    }

    public LocalDateTime getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(LocalDateTime checkdate) {
        this.checkdate = checkdate;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    public String getCheckdeptid() {
        return checkdeptid;
    }

    public void setCheckdeptid(String checkdeptid) {
        this.checkdeptid = checkdeptid;
    }

    public Integer getTreatmentnum() {
        return treatmentnum;
    }

    public void setTreatmentnum(Integer treatmentnum) {
        this.treatmentnum = treatmentnum;
    }

    public LocalDateTime getTreatmenttime() {
        return treatmenttime;
    }

    public void setTreatmenttime(LocalDateTime treatmenttime) {
        this.treatmenttime = treatmenttime;
    }

    public String getRegisterid() {
        return registerid;
    }

    public void setRegisterid(String registerid) {
        this.registerid = registerid;
    }

    public String getCheckmark() {
        return checkmark;
    }

    public void setCheckmark(String checkmark) {
        this.checkmark = checkmark;
    }

    public LocalDateTime getDrawtime() {
        return drawtime;
    }

    public void setDrawtime(LocalDateTime drawtime) {
        this.drawtime = drawtime;
    }

    public String getConfirmid() {
        return confirmid;
    }

    public void setConfirmid(String confirmid) {
        this.confirmid = confirmid;
    }

    public String getAutomark() {
        return automark;
    }

    public void setAutomark(String automark) {
        this.automark = automark;
    }

    public String getBymanmark() {
        return bymanmark;
    }

    public void setBymanmark(String bymanmark) {
        this.bymanmark = bymanmark;
    }

    public String getMultiitemcode() {
        return multiitemcode;
    }

    public void setMultiitemcode(String multiitemcode) {
        this.multiitemcode = multiitemcode;
    }

    public String getMultiitemname() {
        return multiitemname;
    }

    public void setMultiitemname(String multiitemname) {
        this.multiitemname = multiitemname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getProcessno() {
        return processno;
    }

    public void setProcessno(String processno) {
        this.processno = processno;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid;
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType;
    }

    @Override
    public String toString() {
        return "LCheckregister{" +
        "prescriptno=" + prescriptno +
        ", inorout=" + inorout +
        ", cardid=" + cardid +
        ", clinicno=" + clinicno +
        ", patientid=" + patientid +
        ", inpatientno=" + inpatientno +
        ", machinecode=" + machinecode +
        ", checkorder=" + checkorder +
        ", checkdate=" + checkdate +
        ", name=" + name +
        ", sex=" + sex +
        ", age=" + age +
        ", address=" + address +
        ", homeplace=" + homeplace +
        ", checkdeptid=" + checkdeptid +
        ", treatmentnum=" + treatmentnum +
        ", treatmenttime=" + treatmenttime +
        ", registerid=" + registerid +
        ", checkmark=" + checkmark +
        ", drawtime=" + drawtime +
        ", confirmid=" + confirmid +
        ", automark=" + automark +
        ", bymanmark=" + bymanmark +
        ", multiitemcode=" + multiitemcode +
        ", multiitemname=" + multiitemname +
        ", remark=" + remark +
        ", icdCode=" + icdCode +
        ", icdName=" + icdName +
        ", roomid=" + roomid +
        ", remark1=" + remark1 +
        ", combNo=" + combNo +
        ", groupcode=" + groupcode +
        ", processno=" + processno +
        ", cost=" + cost +
        ", machineid=" + machineid +
        ", labType=" + labType +
        "}";
    }
}

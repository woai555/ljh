package com.ljh.bean;

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
public class PrpmIn306011uv01 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 消息ID
     */
    private String msgId;

    /**
     * 全局人员号
     */
    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;

    /**
     * 创建时间
     */
    private LocalDateTime creationtime;

    /**
     * 专业技术职务代码
     */
    private String stuffCode;

    /**
     * 专业技术职务名称
     */
    private String stuffName;

    /**
     * 工作地址
     */
    private String workPlace;

    /**
     * 工作联系电话
     */
    private String telecom;

    /**
     * 角色有效期间（开始）
     */
    private LocalDateTime effectivetimelow;

    /**
     * 角色有效期间（结束）
     */
    private LocalDateTime effectivetimehigh;

    /**
     * 身份证号
     */
    private String idcardno;

    /**
     * 姓名
     */
    private String emplName;

    /**
     * 性别
     */
    private String sexCode;

    /**
     * 性别
     */
    private String sexName;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 科室号
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 出生地
     */
    private String birthplace;

    /**
     * 插入时间
     */
    private LocalDateTime receiveTime;

    /**
     * 角色状态
     */
    private String status;

    /**
     * 操作员编码
     */
    private String operCode;

    /**
     * 操作员名称
     */
    private String operName;

    /**
     * 操作员科室编码
     */
    private String operDept;

    /**
     * 操作员科室
     */
    private String operDeptName;

    /**
     * 操作员联系人
     */
    private String operCont;


    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public LocalDateTime getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(LocalDateTime creationtime) {
        this.creationtime = creationtime;
    }

    public String getStuffCode() {
        return stuffCode;
    }

    public void setStuffCode(String stuffCode) {
        this.stuffCode = stuffCode;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getTelecom() {
        return telecom;
    }

    public void setTelecom(String telecom) {
        this.telecom = telecom;
    }

    public LocalDateTime getEffectivetimelow() {
        return effectivetimelow;
    }

    public void setEffectivetimelow(LocalDateTime effectivetimelow) {
        this.effectivetimelow = effectivetimelow;
    }

    public LocalDateTime getEffectivetimehigh() {
        return effectivetimehigh;
    }

    public void setEffectivetimehigh(LocalDateTime effectivetimehigh) {
        this.effectivetimehigh = effectivetimehigh;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
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

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(LocalDateTime receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getOperDept() {
        return operDept;
    }

    public void setOperDept(String operDept) {
        this.operDept = operDept;
    }

    public String getOperDeptName() {
        return operDeptName;
    }

    public void setOperDeptName(String operDeptName) {
        this.operDeptName = operDeptName;
    }

    public String getOperCont() {
        return operCont;
    }

    public void setOperCont(String operCont) {
        this.operCont = operCont;
    }

    @Override
    public String toString() {
        return "PrpmIn306011uv01{" +
        "msgId=" + msgId +
        ", emplCode=" + emplCode +
        ", creationtime=" + creationtime +
        ", stuffCode=" + stuffCode +
        ", stuffName=" + stuffName +
        ", workPlace=" + workPlace +
        ", telecom=" + telecom +
        ", effectivetimelow=" + effectivetimelow +
        ", effectivetimehigh=" + effectivetimehigh +
        ", idcardno=" + idcardno +
        ", emplName=" + emplName +
        ", sexCode=" + sexCode +
        ", sexName=" + sexName +
        ", birthday=" + birthday +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", birthplace=" + birthplace +
        ", receiveTime=" + receiveTime +
        ", status=" + status +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", operDept=" + operDept +
        ", operDeptName=" + operDeptName +
        ", operCont=" + operCont +
        "}";
    }
}

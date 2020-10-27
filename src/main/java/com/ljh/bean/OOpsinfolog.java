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
public class OOpsinfolog implements Serializable {

    private static final long serialVersionUID=1L;

    private String execSqn;

    private String inpatientno;

    private String patientid;

    private String bedno;

    private String name;

    private Integer sex;

    private LocalDateTime birthday;

    private Integer bloodkind;

    private String tutorcode;

    private String tutorname;

    private String ifquick;

    private String diatype;

    private LocalDateTime destinetime;

    private Integer anaetype;

    private Integer washnursenum;

    private Integer circuitenursenum;

    private Integer patientbranchid;

    private Integer patientroomid;

    private Integer addordot;

    private Integer execroomid;

    private String applydoccode;

    private String applydocname;

    private LocalDateTime applytime;

    private String applyremark;

    private String exadoccode;

    private String exadocname;

    private String exaremark;

    private BigDecimal opscost;

    private Integer opssize;

    private Integer cuttype;

    private Integer screenupe;

    private LocalDateTime opstime;

    private Integer roomid;

    private String opsdesk;

    private LocalDateTime sendtime;

    private String opsremark;

    private String anaeremark;

    private String bloodunit;

    private String execflag;

    private String opsflag;

    private String anaeflag;

    private Integer useblood;

    private String operatorname;

    private String operatorcode;

    private BigDecimal usetime;

    private Integer age;

    private String infection;

    private Integer excanaeroomid;

    private Integer exadocbranchid;

    private Integer exadocroomid;

    private String ifnewadd;

    private String ageremark;

    private String ifopscost;

    private String ifanaecost;

    private Integer ynselfblood;

    private String blkindcode;

    private String blkindname;

    private Integer infaction;

    private Integer ifnewitem;

    private Integer visitdoccode;

    private String visitdocname;

    private LocalDateTime receivedesktime;

    private String afteroutname;

    private Integer ifice;

    private Integer iftwice;

    private Integer opsOrder;

    private Integer iffirst;

    private String otherPerson;


    public String getExecSqn() {
        return execSqn;
    }

    public void setExecSqn(String execSqn) {
        this.execSqn = execSqn;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Integer getBloodkind() {
        return bloodkind;
    }

    public void setBloodkind(Integer bloodkind) {
        this.bloodkind = bloodkind;
    }

    public String getTutorcode() {
        return tutorcode;
    }

    public void setTutorcode(String tutorcode) {
        this.tutorcode = tutorcode;
    }

    public String getTutorname() {
        return tutorname;
    }

    public void setTutorname(String tutorname) {
        this.tutorname = tutorname;
    }

    public String getIfquick() {
        return ifquick;
    }

    public void setIfquick(String ifquick) {
        this.ifquick = ifquick;
    }

    public String getDiatype() {
        return diatype;
    }

    public void setDiatype(String diatype) {
        this.diatype = diatype;
    }

    public LocalDateTime getDestinetime() {
        return destinetime;
    }

    public void setDestinetime(LocalDateTime destinetime) {
        this.destinetime = destinetime;
    }

    public Integer getAnaetype() {
        return anaetype;
    }

    public void setAnaetype(Integer anaetype) {
        this.anaetype = anaetype;
    }

    public Integer getWashnursenum() {
        return washnursenum;
    }

    public void setWashnursenum(Integer washnursenum) {
        this.washnursenum = washnursenum;
    }

    public Integer getCircuitenursenum() {
        return circuitenursenum;
    }

    public void setCircuitenursenum(Integer circuitenursenum) {
        this.circuitenursenum = circuitenursenum;
    }

    public Integer getPatientbranchid() {
        return patientbranchid;
    }

    public void setPatientbranchid(Integer patientbranchid) {
        this.patientbranchid = patientbranchid;
    }

    public Integer getPatientroomid() {
        return patientroomid;
    }

    public void setPatientroomid(Integer patientroomid) {
        this.patientroomid = patientroomid;
    }

    public Integer getAddordot() {
        return addordot;
    }

    public void setAddordot(Integer addordot) {
        this.addordot = addordot;
    }

    public Integer getExecroomid() {
        return execroomid;
    }

    public void setExecroomid(Integer execroomid) {
        this.execroomid = execroomid;
    }

    public String getApplydoccode() {
        return applydoccode;
    }

    public void setApplydoccode(String applydoccode) {
        this.applydoccode = applydoccode;
    }

    public String getApplydocname() {
        return applydocname;
    }

    public void setApplydocname(String applydocname) {
        this.applydocname = applydocname;
    }

    public LocalDateTime getApplytime() {
        return applytime;
    }

    public void setApplytime(LocalDateTime applytime) {
        this.applytime = applytime;
    }

    public String getApplyremark() {
        return applyremark;
    }

    public void setApplyremark(String applyremark) {
        this.applyremark = applyremark;
    }

    public String getExadoccode() {
        return exadoccode;
    }

    public void setExadoccode(String exadoccode) {
        this.exadoccode = exadoccode;
    }

    public String getExadocname() {
        return exadocname;
    }

    public void setExadocname(String exadocname) {
        this.exadocname = exadocname;
    }

    public String getExaremark() {
        return exaremark;
    }

    public void setExaremark(String exaremark) {
        this.exaremark = exaremark;
    }

    public BigDecimal getOpscost() {
        return opscost;
    }

    public void setOpscost(BigDecimal opscost) {
        this.opscost = opscost;
    }

    public Integer getOpssize() {
        return opssize;
    }

    public void setOpssize(Integer opssize) {
        this.opssize = opssize;
    }

    public Integer getCuttype() {
        return cuttype;
    }

    public void setCuttype(Integer cuttype) {
        this.cuttype = cuttype;
    }

    public Integer getScreenupe() {
        return screenupe;
    }

    public void setScreenupe(Integer screenupe) {
        this.screenupe = screenupe;
    }

    public LocalDateTime getOpstime() {
        return opstime;
    }

    public void setOpstime(LocalDateTime opstime) {
        this.opstime = opstime;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getOpsdesk() {
        return opsdesk;
    }

    public void setOpsdesk(String opsdesk) {
        this.opsdesk = opsdesk;
    }

    public LocalDateTime getSendtime() {
        return sendtime;
    }

    public void setSendtime(LocalDateTime sendtime) {
        this.sendtime = sendtime;
    }

    public String getOpsremark() {
        return opsremark;
    }

    public void setOpsremark(String opsremark) {
        this.opsremark = opsremark;
    }

    public String getAnaeremark() {
        return anaeremark;
    }

    public void setAnaeremark(String anaeremark) {
        this.anaeremark = anaeremark;
    }

    public String getBloodunit() {
        return bloodunit;
    }

    public void setBloodunit(String bloodunit) {
        this.bloodunit = bloodunit;
    }

    public String getExecflag() {
        return execflag;
    }

    public void setExecflag(String execflag) {
        this.execflag = execflag;
    }

    public String getOpsflag() {
        return opsflag;
    }

    public void setOpsflag(String opsflag) {
        this.opsflag = opsflag;
    }

    public String getAnaeflag() {
        return anaeflag;
    }

    public void setAnaeflag(String anaeflag) {
        this.anaeflag = anaeflag;
    }

    public Integer getUseblood() {
        return useblood;
    }

    public void setUseblood(Integer useblood) {
        this.useblood = useblood;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public String getOperatorcode() {
        return operatorcode;
    }

    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode;
    }

    public BigDecimal getUsetime() {
        return usetime;
    }

    public void setUsetime(BigDecimal usetime) {
        this.usetime = usetime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfection() {
        return infection;
    }

    public void setInfection(String infection) {
        this.infection = infection;
    }

    public Integer getExcanaeroomid() {
        return excanaeroomid;
    }

    public void setExcanaeroomid(Integer excanaeroomid) {
        this.excanaeroomid = excanaeroomid;
    }

    public Integer getExadocbranchid() {
        return exadocbranchid;
    }

    public void setExadocbranchid(Integer exadocbranchid) {
        this.exadocbranchid = exadocbranchid;
    }

    public Integer getExadocroomid() {
        return exadocroomid;
    }

    public void setExadocroomid(Integer exadocroomid) {
        this.exadocroomid = exadocroomid;
    }

    public String getIfnewadd() {
        return ifnewadd;
    }

    public void setIfnewadd(String ifnewadd) {
        this.ifnewadd = ifnewadd;
    }

    public String getAgeremark() {
        return ageremark;
    }

    public void setAgeremark(String ageremark) {
        this.ageremark = ageremark;
    }

    public String getIfopscost() {
        return ifopscost;
    }

    public void setIfopscost(String ifopscost) {
        this.ifopscost = ifopscost;
    }

    public String getIfanaecost() {
        return ifanaecost;
    }

    public void setIfanaecost(String ifanaecost) {
        this.ifanaecost = ifanaecost;
    }

    public Integer getYnselfblood() {
        return ynselfblood;
    }

    public void setYnselfblood(Integer ynselfblood) {
        this.ynselfblood = ynselfblood;
    }

    public String getBlkindcode() {
        return blkindcode;
    }

    public void setBlkindcode(String blkindcode) {
        this.blkindcode = blkindcode;
    }

    public String getBlkindname() {
        return blkindname;
    }

    public void setBlkindname(String blkindname) {
        this.blkindname = blkindname;
    }

    public Integer getInfaction() {
        return infaction;
    }

    public void setInfaction(Integer infaction) {
        this.infaction = infaction;
    }

    public Integer getIfnewitem() {
        return ifnewitem;
    }

    public void setIfnewitem(Integer ifnewitem) {
        this.ifnewitem = ifnewitem;
    }

    public Integer getVisitdoccode() {
        return visitdoccode;
    }

    public void setVisitdoccode(Integer visitdoccode) {
        this.visitdoccode = visitdoccode;
    }

    public String getVisitdocname() {
        return visitdocname;
    }

    public void setVisitdocname(String visitdocname) {
        this.visitdocname = visitdocname;
    }

    public LocalDateTime getReceivedesktime() {
        return receivedesktime;
    }

    public void setReceivedesktime(LocalDateTime receivedesktime) {
        this.receivedesktime = receivedesktime;
    }

    public String getAfteroutname() {
        return afteroutname;
    }

    public void setAfteroutname(String afteroutname) {
        this.afteroutname = afteroutname;
    }

    public Integer getIfice() {
        return ifice;
    }

    public void setIfice(Integer ifice) {
        this.ifice = ifice;
    }

    public Integer getIftwice() {
        return iftwice;
    }

    public void setIftwice(Integer iftwice) {
        this.iftwice = iftwice;
    }

    public Integer getOpsOrder() {
        return opsOrder;
    }

    public void setOpsOrder(Integer opsOrder) {
        this.opsOrder = opsOrder;
    }

    public Integer getIffirst() {
        return iffirst;
    }

    public void setIffirst(Integer iffirst) {
        this.iffirst = iffirst;
    }

    public String getOtherPerson() {
        return otherPerson;
    }

    public void setOtherPerson(String otherPerson) {
        this.otherPerson = otherPerson;
    }

    @Override
    public String toString() {
        return "OOpsinfolog{" +
        "execSqn=" + execSqn +
        ", inpatientno=" + inpatientno +
        ", patientid=" + patientid +
        ", bedno=" + bedno +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", bloodkind=" + bloodkind +
        ", tutorcode=" + tutorcode +
        ", tutorname=" + tutorname +
        ", ifquick=" + ifquick +
        ", diatype=" + diatype +
        ", destinetime=" + destinetime +
        ", anaetype=" + anaetype +
        ", washnursenum=" + washnursenum +
        ", circuitenursenum=" + circuitenursenum +
        ", patientbranchid=" + patientbranchid +
        ", patientroomid=" + patientroomid +
        ", addordot=" + addordot +
        ", execroomid=" + execroomid +
        ", applydoccode=" + applydoccode +
        ", applydocname=" + applydocname +
        ", applytime=" + applytime +
        ", applyremark=" + applyremark +
        ", exadoccode=" + exadoccode +
        ", exadocname=" + exadocname +
        ", exaremark=" + exaremark +
        ", opscost=" + opscost +
        ", opssize=" + opssize +
        ", cuttype=" + cuttype +
        ", screenupe=" + screenupe +
        ", opstime=" + opstime +
        ", roomid=" + roomid +
        ", opsdesk=" + opsdesk +
        ", sendtime=" + sendtime +
        ", opsremark=" + opsremark +
        ", anaeremark=" + anaeremark +
        ", bloodunit=" + bloodunit +
        ", execflag=" + execflag +
        ", opsflag=" + opsflag +
        ", anaeflag=" + anaeflag +
        ", useblood=" + useblood +
        ", operatorname=" + operatorname +
        ", operatorcode=" + operatorcode +
        ", usetime=" + usetime +
        ", age=" + age +
        ", infection=" + infection +
        ", excanaeroomid=" + excanaeroomid +
        ", exadocbranchid=" + exadocbranchid +
        ", exadocroomid=" + exadocroomid +
        ", ifnewadd=" + ifnewadd +
        ", ageremark=" + ageremark +
        ", ifopscost=" + ifopscost +
        ", ifanaecost=" + ifanaecost +
        ", ynselfblood=" + ynselfblood +
        ", blkindcode=" + blkindcode +
        ", blkindname=" + blkindname +
        ", infaction=" + infaction +
        ", ifnewitem=" + ifnewitem +
        ", visitdoccode=" + visitdoccode +
        ", visitdocname=" + visitdocname +
        ", receivedesktime=" + receivedesktime +
        ", afteroutname=" + afteroutname +
        ", ifice=" + ifice +
        ", iftwice=" + iftwice +
        ", opsOrder=" + opsOrder +
        ", iffirst=" + iffirst +
        ", otherPerson=" + otherPerson +
        "}";
    }
}

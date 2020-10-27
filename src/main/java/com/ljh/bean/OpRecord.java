package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术登记表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private BigDecimal recordno;

    private String inpatientNo;

    private String patientNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String pasource;

    private String name;

    private String deptCode;

    private String bedNo;

    private String sex;

    private LocalDateTime birthday;

    private String bloodcode;

    private String operationitem;

    private String operationkind;

    private String operatedoc;

    private String guidedoc;

    private String emergency;

    private String seedoctype;

    private LocalDateTime predtime;

    private BigDecimal preduration;

    private String anestype;

    private BigDecimal helpernum;

    private BigDecimal washnurse;

    private BigDecimal acconurse;

    private BigDecimal prepnurse;

    /**
     * 1 平台  2 加台  3 点台  4 急诊台
     */
    private String consoletype;

    private String execcode;

    private String operoom;

    private String console;

    private String applydoc;

    private LocalDateTime applytime;

    private String approvedoc;

    private BigDecimal fee;

    private String degree;

    /**
     * 1有 2 无
     */
    private String yngerm;

    private String incisiontype;

    /**
     * 1幕上 2 幕下
     */
    private String screenupe;

    private LocalDateTime operationtime;

    private LocalDateTime recepttime;

    private String illustration;

    private String bloodkind;

    private BigDecimal bloodnum;

    private String bloodunit;

    private LocalDateTime entertime;

    private LocalDateTime outtime;

    private BigDecimal realduation;

    /**
     * 1清醒   2 不清醒
     */
    private String foreynsober;

    /**
     * 1清醒 2不清醒
     */
    private String stepynsober;

    private String forepress;

    private String steppress;

    private BigDecimal forepulse;

    private BigDecimal steppulse;

    /**
     * 1有 2 无
     */
    private BigDecimal scarNum;

    private Integer transfusionQty;

    private BigDecimal sampleQty;

    /**
     * 1有 2 无
     */
    private Integer guidtubeNum;

    private String recorder;

    private String beforeReady;

    private String toolExam;

    private String seperate;

    private String danger;

    private Integer letBlood;

    private Integer mainLine;

    private Integer muscleLine;

    private Integer transfusion;

    private Integer transoxyen;

    private Integer stale;

    private String question;

    private String iInfection;

    private String die;

    private String specialComment;

    private LocalDateTime recordtime;

    private String ynvalid;

    private String ynfee;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getRecordno() {
        return recordno;
    }

    public void setRecordno(BigDecimal recordno) {
        this.recordno = recordno;
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

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getPasource() {
        return pasource;
    }

    public void setPasource(String pasource) {
        this.pasource = pasource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
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

    public String getBloodcode() {
        return bloodcode;
    }

    public void setBloodcode(String bloodcode) {
        this.bloodcode = bloodcode;
    }

    public String getOperationitem() {
        return operationitem;
    }

    public void setOperationitem(String operationitem) {
        this.operationitem = operationitem;
    }

    public String getOperationkind() {
        return operationkind;
    }

    public void setOperationkind(String operationkind) {
        this.operationkind = operationkind;
    }

    public String getOperatedoc() {
        return operatedoc;
    }

    public void setOperatedoc(String operatedoc) {
        this.operatedoc = operatedoc;
    }

    public String getGuidedoc() {
        return guidedoc;
    }

    public void setGuidedoc(String guidedoc) {
        this.guidedoc = guidedoc;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public String getSeedoctype() {
        return seedoctype;
    }

    public void setSeedoctype(String seedoctype) {
        this.seedoctype = seedoctype;
    }

    public LocalDateTime getPredtime() {
        return predtime;
    }

    public void setPredtime(LocalDateTime predtime) {
        this.predtime = predtime;
    }

    public BigDecimal getPreduration() {
        return preduration;
    }

    public void setPreduration(BigDecimal preduration) {
        this.preduration = preduration;
    }

    public String getAnestype() {
        return anestype;
    }

    public void setAnestype(String anestype) {
        this.anestype = anestype;
    }

    public BigDecimal getHelpernum() {
        return helpernum;
    }

    public void setHelpernum(BigDecimal helpernum) {
        this.helpernum = helpernum;
    }

    public BigDecimal getWashnurse() {
        return washnurse;
    }

    public void setWashnurse(BigDecimal washnurse) {
        this.washnurse = washnurse;
    }

    public BigDecimal getAcconurse() {
        return acconurse;
    }

    public void setAcconurse(BigDecimal acconurse) {
        this.acconurse = acconurse;
    }

    public BigDecimal getPrepnurse() {
        return prepnurse;
    }

    public void setPrepnurse(BigDecimal prepnurse) {
        this.prepnurse = prepnurse;
    }

    public String getConsoletype() {
        return consoletype;
    }

    public void setConsoletype(String consoletype) {
        this.consoletype = consoletype;
    }

    public String getExeccode() {
        return execcode;
    }

    public void setExeccode(String execcode) {
        this.execcode = execcode;
    }

    public String getOperoom() {
        return operoom;
    }

    public void setOperoom(String operoom) {
        this.operoom = operoom;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getApplydoc() {
        return applydoc;
    }

    public void setApplydoc(String applydoc) {
        this.applydoc = applydoc;
    }

    public LocalDateTime getApplytime() {
        return applytime;
    }

    public void setApplytime(LocalDateTime applytime) {
        this.applytime = applytime;
    }

    public String getApprovedoc() {
        return approvedoc;
    }

    public void setApprovedoc(String approvedoc) {
        this.approvedoc = approvedoc;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getYngerm() {
        return yngerm;
    }

    public void setYngerm(String yngerm) {
        this.yngerm = yngerm;
    }

    public String getIncisiontype() {
        return incisiontype;
    }

    public void setIncisiontype(String incisiontype) {
        this.incisiontype = incisiontype;
    }

    public String getScreenupe() {
        return screenupe;
    }

    public void setScreenupe(String screenupe) {
        this.screenupe = screenupe;
    }

    public LocalDateTime getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(LocalDateTime operationtime) {
        this.operationtime = operationtime;
    }

    public LocalDateTime getRecepttime() {
        return recepttime;
    }

    public void setRecepttime(LocalDateTime recepttime) {
        this.recepttime = recepttime;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }

    public String getBloodkind() {
        return bloodkind;
    }

    public void setBloodkind(String bloodkind) {
        this.bloodkind = bloodkind;
    }

    public BigDecimal getBloodnum() {
        return bloodnum;
    }

    public void setBloodnum(BigDecimal bloodnum) {
        this.bloodnum = bloodnum;
    }

    public String getBloodunit() {
        return bloodunit;
    }

    public void setBloodunit(String bloodunit) {
        this.bloodunit = bloodunit;
    }

    public LocalDateTime getEntertime() {
        return entertime;
    }

    public void setEntertime(LocalDateTime entertime) {
        this.entertime = entertime;
    }

    public LocalDateTime getOuttime() {
        return outtime;
    }

    public void setOuttime(LocalDateTime outtime) {
        this.outtime = outtime;
    }

    public BigDecimal getRealduation() {
        return realduation;
    }

    public void setRealduation(BigDecimal realduation) {
        this.realduation = realduation;
    }

    public String getForeynsober() {
        return foreynsober;
    }

    public void setForeynsober(String foreynsober) {
        this.foreynsober = foreynsober;
    }

    public String getStepynsober() {
        return stepynsober;
    }

    public void setStepynsober(String stepynsober) {
        this.stepynsober = stepynsober;
    }

    public String getForepress() {
        return forepress;
    }

    public void setForepress(String forepress) {
        this.forepress = forepress;
    }

    public String getSteppress() {
        return steppress;
    }

    public void setSteppress(String steppress) {
        this.steppress = steppress;
    }

    public BigDecimal getForepulse() {
        return forepulse;
    }

    public void setForepulse(BigDecimal forepulse) {
        this.forepulse = forepulse;
    }

    public BigDecimal getSteppulse() {
        return steppulse;
    }

    public void setSteppulse(BigDecimal steppulse) {
        this.steppulse = steppulse;
    }

    public BigDecimal getScarNum() {
        return scarNum;
    }

    public void setScarNum(BigDecimal scarNum) {
        this.scarNum = scarNum;
    }

    public Integer getTransfusionQty() {
        return transfusionQty;
    }

    public void setTransfusionQty(Integer transfusionQty) {
        this.transfusionQty = transfusionQty;
    }

    public BigDecimal getSampleQty() {
        return sampleQty;
    }

    public void setSampleQty(BigDecimal sampleQty) {
        this.sampleQty = sampleQty;
    }

    public Integer getGuidtubeNum() {
        return guidtubeNum;
    }

    public void setGuidtubeNum(Integer guidtubeNum) {
        this.guidtubeNum = guidtubeNum;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public String getBeforeReady() {
        return beforeReady;
    }

    public void setBeforeReady(String beforeReady) {
        this.beforeReady = beforeReady;
    }

    public String getToolExam() {
        return toolExam;
    }

    public void setToolExam(String toolExam) {
        this.toolExam = toolExam;
    }

    public String getSeperate() {
        return seperate;
    }

    public void setSeperate(String seperate) {
        this.seperate = seperate;
    }

    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }

    public Integer getLetBlood() {
        return letBlood;
    }

    public void setLetBlood(Integer letBlood) {
        this.letBlood = letBlood;
    }

    public Integer getMainLine() {
        return mainLine;
    }

    public void setMainLine(Integer mainLine) {
        this.mainLine = mainLine;
    }

    public Integer getMuscleLine() {
        return muscleLine;
    }

    public void setMuscleLine(Integer muscleLine) {
        this.muscleLine = muscleLine;
    }

    public Integer getTransfusion() {
        return transfusion;
    }

    public void setTransfusion(Integer transfusion) {
        this.transfusion = transfusion;
    }

    public Integer getTransoxyen() {
        return transoxyen;
    }

    public void setTransoxyen(Integer transoxyen) {
        this.transoxyen = transoxyen;
    }

    public Integer getStale() {
        return stale;
    }

    public void setStale(Integer stale) {
        this.stale = stale;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getiInfection() {
        return iInfection;
    }

    public void setiInfection(String iInfection) {
        this.iInfection = iInfection;
    }

    public String getDie() {
        return die;
    }

    public void setDie(String die) {
        this.die = die;
    }

    public String getSpecialComment() {
        return specialComment;
    }

    public void setSpecialComment(String specialComment) {
        this.specialComment = specialComment;
    }

    public LocalDateTime getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(LocalDateTime recordtime) {
        this.recordtime = recordtime;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    public String getYnfee() {
        return ynfee;
    }

    public void setYnfee(String ynfee) {
        this.ynfee = ynfee;
    }

    @Override
    public String toString() {
        return "OpRecord{" +
        "operationno=" + operationno +
        ", recordno=" + recordno +
        ", inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", pasource=" + pasource +
        ", name=" + name +
        ", deptCode=" + deptCode +
        ", bedNo=" + bedNo +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", bloodcode=" + bloodcode +
        ", operationitem=" + operationitem +
        ", operationkind=" + operationkind +
        ", operatedoc=" + operatedoc +
        ", guidedoc=" + guidedoc +
        ", emergency=" + emergency +
        ", seedoctype=" + seedoctype +
        ", predtime=" + predtime +
        ", preduration=" + preduration +
        ", anestype=" + anestype +
        ", helpernum=" + helpernum +
        ", washnurse=" + washnurse +
        ", acconurse=" + acconurse +
        ", prepnurse=" + prepnurse +
        ", consoletype=" + consoletype +
        ", execcode=" + execcode +
        ", operoom=" + operoom +
        ", console=" + console +
        ", applydoc=" + applydoc +
        ", applytime=" + applytime +
        ", approvedoc=" + approvedoc +
        ", fee=" + fee +
        ", degree=" + degree +
        ", yngerm=" + yngerm +
        ", incisiontype=" + incisiontype +
        ", screenupe=" + screenupe +
        ", operationtime=" + operationtime +
        ", recepttime=" + recepttime +
        ", illustration=" + illustration +
        ", bloodkind=" + bloodkind +
        ", bloodnum=" + bloodnum +
        ", bloodunit=" + bloodunit +
        ", entertime=" + entertime +
        ", outtime=" + outtime +
        ", realduation=" + realduation +
        ", foreynsober=" + foreynsober +
        ", stepynsober=" + stepynsober +
        ", forepress=" + forepress +
        ", steppress=" + steppress +
        ", forepulse=" + forepulse +
        ", steppulse=" + steppulse +
        ", scarNum=" + scarNum +
        ", transfusionQty=" + transfusionQty +
        ", sampleQty=" + sampleQty +
        ", guidtubeNum=" + guidtubeNum +
        ", recorder=" + recorder +
        ", beforeReady=" + beforeReady +
        ", toolExam=" + toolExam +
        ", seperate=" + seperate +
        ", danger=" + danger +
        ", letBlood=" + letBlood +
        ", mainLine=" + mainLine +
        ", muscleLine=" + muscleLine +
        ", transfusion=" + transfusion +
        ", transoxyen=" + transoxyen +
        ", stale=" + stale +
        ", question=" + question +
        ", iInfection=" + iInfection +
        ", die=" + die +
        ", specialComment=" + specialComment +
        ", recordtime=" + recordtime +
        ", ynvalid=" + ynvalid +
        ", ynfee=" + ynfee +
        "}";
    }
}

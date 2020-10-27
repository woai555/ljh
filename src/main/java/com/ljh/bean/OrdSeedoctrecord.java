package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 问诊记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdSeedoctrecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊序号
     */
    @TableId(value = "SEE_NO", type = IdType.AUTO)
    private String seeNo;

    /**
     * 门诊号
     */
    private String clinicCode;

    /**
     * 病历号
     */
    private String cardNo;

    /**
     * 挂号日期
     */
    private LocalDateTime regDate;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 结算类别
     */
    private String paykindCode;

    /**
     * 性别
     */
    private String sex;

    /**
     * 个人编号
     */
    private String mcardNo;

    /**
     * 挂号级别
     */
    private String reglvlCode;

    /**
     * 看诊科室
     */
    private String seeDeptid;

    /**
     * 看诊医生代码
     */
    private String seeDoctid;

    /**
     * 看诊医生
     */
    private String seeDoctnm;

    /**
     * 看诊日期
     */
    private LocalDateTime seeDate;

    /**
     * 花费金额
     */
    private BigDecimal totCost;

    /**
     * 主诉
     */
    private String hostTell;

    /**
     * 现病史
     */
    private String currentIllness;

    /**
     * 既往史
     */
    private String anamnesis;

    /**
     * 过敏史
     */
    private String allergen;

    /**
     * 检体
     */
    private String checkbody;

    /**
     * 诊断代码1
     */
    private String diagCode1;

    /**
     * 诊断名称1
     */
    private String diagName1;

    /**
     * 诊断代码2
     */
    private String diagCode2;

    /**
     * 诊断名称2
     */
    private String diagName2;

    /**
     * 诊断代码3
     */
    private String diagCode3;

    /**
     * 诊断名称3
     */
    private String diagName3;

    /**
     * 备注
     */
    private String remark;

    /**
     * 看诊科室名称
     */
    private String seeDeptnm;

    /**
     * 0有效，1无效，2外配处方
     */
    private String status;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 婚否
     */
    private String marri;

    /**
     * 职业
     */
    private String profCode;

    /**
     * 病史叙述人
     */
    private String tellOwner;

    /**
     * '传染，0否，1是'
     */
    private String hepatitisFlag;

    /**
     * '过敏，0否，1是'
     */
    private String allergenFlag;

    /**
     * 个人史
     */
    private String individual;

    /**
     * 其它
     */
    private String other;

    /**
     * 辅助检查
     */
    private String adminical;

    /**
     * 处置意见
     */
    private String disposition;

    /**
     * 是否留观
     */
    private String emLeave;

    /**
     * 留观科室
     */
    private String leaveDept;

    /**
     * 诊断代码4
     */
    private String diagCode4;

    /**
     * 诊断代码5
     */
    private String diagCode5;

    /**
     * 诊断名称4
     */
    private String diagName4;

    /**
     * 诊断名称5
     */
    private String diagName5;

    /**
     * 诊断症状
     */
    private String diagTemp;

    /**
     * 急诊病房
     */
    private String roomCode;

    /**
     * 毒麻药代理人或执行人
     */
    private String executor;

    /**
     * 代理人性别
     */
    private String executorSex;

    /**
     * 代理人性别
     */
    private BigDecimal executorAge;

    /**
     * 代理人身份证号
     */
    private String executorId;

    /**
     * 处方类型，1医保内处方，2医保外处方
     */
    private Integer recipeType;

    /**
     * 医联卡就诊信息上传，1为已上传，-1为上传失败
     */
    private String ylcardSendflag;

    /**
     * 1行动不便
     */
    private String disabledFlag;

    /**
     * 是否特病患者1是
     */
    private String tbFlag;

    /**
     * 是否特病处方1是
     */
    private Integer recipeTbFlag;

    /**
     * 发票号用于京医通患者处方
     */
    private String invoiceNo;

    /**
     * 京医通处方结算人
     */
    private String invoiceOperid;

    /**
     * 绿色通道患者标志，1为绿道患者
     */
    private String greenChannel;

    /**
     * 处方已经结算需要再校验的发票号防止医生重复扣费
     */
    private String invoiceNoDjy;

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 疾病分类
     */
    private String diagCate;

    /**
     * 临床试验患者记录序号
     */
    private Long trialSeqno;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getReglvlCode() {
        return reglvlCode;
    }

    public void setReglvlCode(String reglvlCode) {
        this.reglvlCode = reglvlCode;
    }

    public String getSeeDeptid() {
        return seeDeptid;
    }

    public void setSeeDeptid(String seeDeptid) {
        this.seeDeptid = seeDeptid;
    }

    public String getSeeDoctid() {
        return seeDoctid;
    }

    public void setSeeDoctid(String seeDoctid) {
        this.seeDoctid = seeDoctid;
    }

    public String getSeeDoctnm() {
        return seeDoctnm;
    }

    public void setSeeDoctnm(String seeDoctnm) {
        this.seeDoctnm = seeDoctnm;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public String getHostTell() {
        return hostTell;
    }

    public void setHostTell(String hostTell) {
        this.hostTell = hostTell;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public String getCheckbody() {
        return checkbody;
    }

    public void setCheckbody(String checkbody) {
        this.checkbody = checkbody;
    }

    public String getDiagCode1() {
        return diagCode1;
    }

    public void setDiagCode1(String diagCode1) {
        this.diagCode1 = diagCode1;
    }

    public String getDiagName1() {
        return diagName1;
    }

    public void setDiagName1(String diagName1) {
        this.diagName1 = diagName1;
    }

    public String getDiagCode2() {
        return diagCode2;
    }

    public void setDiagCode2(String diagCode2) {
        this.diagCode2 = diagCode2;
    }

    public String getDiagName2() {
        return diagName2;
    }

    public void setDiagName2(String diagName2) {
        this.diagName2 = diagName2;
    }

    public String getDiagCode3() {
        return diagCode3;
    }

    public void setDiagCode3(String diagCode3) {
        this.diagCode3 = diagCode3;
    }

    public String getDiagName3() {
        return diagName3;
    }

    public void setDiagName3(String diagName3) {
        this.diagName3 = diagName3;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSeeDeptnm() {
        return seeDeptnm;
    }

    public void setSeeDeptnm(String seeDeptnm) {
        this.seeDeptnm = seeDeptnm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMarri() {
        return marri;
    }

    public void setMarri(String marri) {
        this.marri = marri;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getTellOwner() {
        return tellOwner;
    }

    public void setTellOwner(String tellOwner) {
        this.tellOwner = tellOwner;
    }

    public String getHepatitisFlag() {
        return hepatitisFlag;
    }

    public void setHepatitisFlag(String hepatitisFlag) {
        this.hepatitisFlag = hepatitisFlag;
    }

    public String getAllergenFlag() {
        return allergenFlag;
    }

    public void setAllergenFlag(String allergenFlag) {
        this.allergenFlag = allergenFlag;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getAdminical() {
        return adminical;
    }

    public void setAdminical(String adminical) {
        this.adminical = adminical;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getEmLeave() {
        return emLeave;
    }

    public void setEmLeave(String emLeave) {
        this.emLeave = emLeave;
    }

    public String getLeaveDept() {
        return leaveDept;
    }

    public void setLeaveDept(String leaveDept) {
        this.leaveDept = leaveDept;
    }

    public String getDiagCode4() {
        return diagCode4;
    }

    public void setDiagCode4(String diagCode4) {
        this.diagCode4 = diagCode4;
    }

    public String getDiagCode5() {
        return diagCode5;
    }

    public void setDiagCode5(String diagCode5) {
        this.diagCode5 = diagCode5;
    }

    public String getDiagName4() {
        return diagName4;
    }

    public void setDiagName4(String diagName4) {
        this.diagName4 = diagName4;
    }

    public String getDiagName5() {
        return diagName5;
    }

    public void setDiagName5(String diagName5) {
        this.diagName5 = diagName5;
    }

    public String getDiagTemp() {
        return diagTemp;
    }

    public void setDiagTemp(String diagTemp) {
        this.diagTemp = diagTemp;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getExecutorSex() {
        return executorSex;
    }

    public void setExecutorSex(String executorSex) {
        this.executorSex = executorSex;
    }

    public BigDecimal getExecutorAge() {
        return executorAge;
    }

    public void setExecutorAge(BigDecimal executorAge) {
        this.executorAge = executorAge;
    }

    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public Integer getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(Integer recipeType) {
        this.recipeType = recipeType;
    }

    public String getYlcardSendflag() {
        return ylcardSendflag;
    }

    public void setYlcardSendflag(String ylcardSendflag) {
        this.ylcardSendflag = ylcardSendflag;
    }

    public String getDisabledFlag() {
        return disabledFlag;
    }

    public void setDisabledFlag(String disabledFlag) {
        this.disabledFlag = disabledFlag;
    }

    public String getTbFlag() {
        return tbFlag;
    }

    public void setTbFlag(String tbFlag) {
        this.tbFlag = tbFlag;
    }

    public Integer getRecipeTbFlag() {
        return recipeTbFlag;
    }

    public void setRecipeTbFlag(Integer recipeTbFlag) {
        this.recipeTbFlag = recipeTbFlag;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceOperid() {
        return invoiceOperid;
    }

    public void setInvoiceOperid(String invoiceOperid) {
        this.invoiceOperid = invoiceOperid;
    }

    public String getGreenChannel() {
        return greenChannel;
    }

    public void setGreenChannel(String greenChannel) {
        this.greenChannel = greenChannel;
    }

    public String getInvoiceNoDjy() {
        return invoiceNoDjy;
    }

    public void setInvoiceNoDjy(String invoiceNoDjy) {
        this.invoiceNoDjy = invoiceNoDjy;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getDiagCate() {
        return diagCate;
    }

    public void setDiagCate(String diagCate) {
        this.diagCate = diagCate;
    }

    public Long getTrialSeqno() {
        return trialSeqno;
    }

    public void setTrialSeqno(Long trialSeqno) {
        this.trialSeqno = trialSeqno;
    }

    @Override
    public String toString() {
        return "OrdSeedoctrecord{" +
        "seeNo=" + seeNo +
        ", clinicCode=" + clinicCode +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", patientName=" + patientName +
        ", paykindCode=" + paykindCode +
        ", sex=" + sex +
        ", mcardNo=" + mcardNo +
        ", reglvlCode=" + reglvlCode +
        ", seeDeptid=" + seeDeptid +
        ", seeDoctid=" + seeDoctid +
        ", seeDoctnm=" + seeDoctnm +
        ", seeDate=" + seeDate +
        ", totCost=" + totCost +
        ", hostTell=" + hostTell +
        ", currentIllness=" + currentIllness +
        ", anamnesis=" + anamnesis +
        ", allergen=" + allergen +
        ", checkbody=" + checkbody +
        ", diagCode1=" + diagCode1 +
        ", diagName1=" + diagName1 +
        ", diagCode2=" + diagCode2 +
        ", diagName2=" + diagName2 +
        ", diagCode3=" + diagCode3 +
        ", diagName3=" + diagName3 +
        ", remark=" + remark +
        ", seeDeptnm=" + seeDeptnm +
        ", status=" + status +
        ", age=" + age +
        ", marri=" + marri +
        ", profCode=" + profCode +
        ", tellOwner=" + tellOwner +
        ", hepatitisFlag=" + hepatitisFlag +
        ", allergenFlag=" + allergenFlag +
        ", individual=" + individual +
        ", other=" + other +
        ", adminical=" + adminical +
        ", disposition=" + disposition +
        ", emLeave=" + emLeave +
        ", leaveDept=" + leaveDept +
        ", diagCode4=" + diagCode4 +
        ", diagCode5=" + diagCode5 +
        ", diagName4=" + diagName4 +
        ", diagName5=" + diagName5 +
        ", diagTemp=" + diagTemp +
        ", roomCode=" + roomCode +
        ", executor=" + executor +
        ", executorSex=" + executorSex +
        ", executorAge=" + executorAge +
        ", executorId=" + executorId +
        ", recipeType=" + recipeType +
        ", ylcardSendflag=" + ylcardSendflag +
        ", disabledFlag=" + disabledFlag +
        ", tbFlag=" + tbFlag +
        ", recipeTbFlag=" + recipeTbFlag +
        ", invoiceNo=" + invoiceNo +
        ", invoiceOperid=" + invoiceOperid +
        ", greenChannel=" + greenChannel +
        ", invoiceNoDjy=" + invoiceNoDjy +
        ", weight=" + weight +
        ", diagCate=" + diagCate +
        ", trialSeqno=" + trialSeqno +
        "}";
    }
}

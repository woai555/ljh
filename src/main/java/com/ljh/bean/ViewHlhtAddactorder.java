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
public class ViewHlhtAddactorder implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String msgId;

    private String recipeNo;

    private String inPatientId;

    private String cardNo;

    private String jcptNo;

    private String visitno;

    private LocalDateTime seeDate;

    private String code;

    private String codename;

    private String text;

    private String low;

    private String high;

    private String effectivetime;

    private String effectiveunit;

    private String routecode;

    private String routename;

    private BigDecimal dosequantity;

    private String doseunit;

    private BigDecimal numerator;

    private String numeratorunit;

    private BigDecimal denominator;

    private String denominatorUnit;

    private String administrationunitcode;

    private String administrationunitname;

    private String administerablemedicineName;

    private String capacityquantity;

    private String capacityunit;

    private String authorTime;

    private String signaturetext;

    private String assignedentityId;

    private String assignedpersonName;

    private String representedorganizationId;

    private String representedorganizationName;

    private String verifierTime;

    private String verifierSignaturetext;

    private String verifierAssignedentityId;

    private String verifierAssignedpersonname;

    private String annotationText;

    private String annotationStatuscode;

    private String authorAssignedentityId;

    private String entityAssignedpersonName;

    private String entityOrganizationId;

    private String entityOrganizationName;

    private String encounterId;

    private String patientId;

    private String patientTelecom;

    private String statuscode;

    private String patientpersonId;

    private String name;

    private String administrativegendercode;

    private String administrativegendername;

    private String birthtime;

    private String asotherids;

    private String asotheridm;

    private LocalDateTime operDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public String getInPatientId() {
        return inPatientId;
    }

    public void setInPatientId(String inPatientId) {
        this.inPatientId = inPatientId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getJcptNo() {
        return jcptNo;
    }

    public void setJcptNo(String jcptNo) {
        this.jcptNo = jcptNo;
    }

    public String getVisitno() {
        return visitno;
    }

    public void setVisitno(String visitno) {
        this.visitno = visitno;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(String effectivetime) {
        this.effectivetime = effectivetime;
    }

    public String getEffectiveunit() {
        return effectiveunit;
    }

    public void setEffectiveunit(String effectiveunit) {
        this.effectiveunit = effectiveunit;
    }

    public String getRoutecode() {
        return routecode;
    }

    public void setRoutecode(String routecode) {
        this.routecode = routecode;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public BigDecimal getDosequantity() {
        return dosequantity;
    }

    public void setDosequantity(BigDecimal dosequantity) {
        this.dosequantity = dosequantity;
    }

    public String getDoseunit() {
        return doseunit;
    }

    public void setDoseunit(String doseunit) {
        this.doseunit = doseunit;
    }

    public BigDecimal getNumerator() {
        return numerator;
    }

    public void setNumerator(BigDecimal numerator) {
        this.numerator = numerator;
    }

    public String getNumeratorunit() {
        return numeratorunit;
    }

    public void setNumeratorunit(String numeratorunit) {
        this.numeratorunit = numeratorunit;
    }

    public BigDecimal getDenominator() {
        return denominator;
    }

    public void setDenominator(BigDecimal denominator) {
        this.denominator = denominator;
    }

    public String getDenominatorUnit() {
        return denominatorUnit;
    }

    public void setDenominatorUnit(String denominatorUnit) {
        this.denominatorUnit = denominatorUnit;
    }

    public String getAdministrationunitcode() {
        return administrationunitcode;
    }

    public void setAdministrationunitcode(String administrationunitcode) {
        this.administrationunitcode = administrationunitcode;
    }

    public String getAdministrationunitname() {
        return administrationunitname;
    }

    public void setAdministrationunitname(String administrationunitname) {
        this.administrationunitname = administrationunitname;
    }

    public String getAdministerablemedicineName() {
        return administerablemedicineName;
    }

    public void setAdministerablemedicineName(String administerablemedicineName) {
        this.administerablemedicineName = administerablemedicineName;
    }

    public String getCapacityquantity() {
        return capacityquantity;
    }

    public void setCapacityquantity(String capacityquantity) {
        this.capacityquantity = capacityquantity;
    }

    public String getCapacityunit() {
        return capacityunit;
    }

    public void setCapacityunit(String capacityunit) {
        this.capacityunit = capacityunit;
    }

    public String getAuthorTime() {
        return authorTime;
    }

    public void setAuthorTime(String authorTime) {
        this.authorTime = authorTime;
    }

    public String getSignaturetext() {
        return signaturetext;
    }

    public void setSignaturetext(String signaturetext) {
        this.signaturetext = signaturetext;
    }

    public String getAssignedentityId() {
        return assignedentityId;
    }

    public void setAssignedentityId(String assignedentityId) {
        this.assignedentityId = assignedentityId;
    }

    public String getAssignedpersonName() {
        return assignedpersonName;
    }

    public void setAssignedpersonName(String assignedpersonName) {
        this.assignedpersonName = assignedpersonName;
    }

    public String getRepresentedorganizationId() {
        return representedorganizationId;
    }

    public void setRepresentedorganizationId(String representedorganizationId) {
        this.representedorganizationId = representedorganizationId;
    }

    public String getRepresentedorganizationName() {
        return representedorganizationName;
    }

    public void setRepresentedorganizationName(String representedorganizationName) {
        this.representedorganizationName = representedorganizationName;
    }

    public String getVerifierTime() {
        return verifierTime;
    }

    public void setVerifierTime(String verifierTime) {
        this.verifierTime = verifierTime;
    }

    public String getVerifierSignaturetext() {
        return verifierSignaturetext;
    }

    public void setVerifierSignaturetext(String verifierSignaturetext) {
        this.verifierSignaturetext = verifierSignaturetext;
    }

    public String getVerifierAssignedentityId() {
        return verifierAssignedentityId;
    }

    public void setVerifierAssignedentityId(String verifierAssignedentityId) {
        this.verifierAssignedentityId = verifierAssignedentityId;
    }

    public String getVerifierAssignedpersonname() {
        return verifierAssignedpersonname;
    }

    public void setVerifierAssignedpersonname(String verifierAssignedpersonname) {
        this.verifierAssignedpersonname = verifierAssignedpersonname;
    }

    public String getAnnotationText() {
        return annotationText;
    }

    public void setAnnotationText(String annotationText) {
        this.annotationText = annotationText;
    }

    public String getAnnotationStatuscode() {
        return annotationStatuscode;
    }

    public void setAnnotationStatuscode(String annotationStatuscode) {
        this.annotationStatuscode = annotationStatuscode;
    }

    public String getAuthorAssignedentityId() {
        return authorAssignedentityId;
    }

    public void setAuthorAssignedentityId(String authorAssignedentityId) {
        this.authorAssignedentityId = authorAssignedentityId;
    }

    public String getEntityAssignedpersonName() {
        return entityAssignedpersonName;
    }

    public void setEntityAssignedpersonName(String entityAssignedpersonName) {
        this.entityAssignedpersonName = entityAssignedpersonName;
    }

    public String getEntityOrganizationId() {
        return entityOrganizationId;
    }

    public void setEntityOrganizationId(String entityOrganizationId) {
        this.entityOrganizationId = entityOrganizationId;
    }

    public String getEntityOrganizationName() {
        return entityOrganizationName;
    }

    public void setEntityOrganizationName(String entityOrganizationName) {
        this.entityOrganizationName = entityOrganizationName;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientTelecom() {
        return patientTelecom;
    }

    public void setPatientTelecom(String patientTelecom) {
        this.patientTelecom = patientTelecom;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getPatientpersonId() {
        return patientpersonId;
    }

    public void setPatientpersonId(String patientpersonId) {
        this.patientpersonId = patientpersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdministrativegendercode() {
        return administrativegendercode;
    }

    public void setAdministrativegendercode(String administrativegendercode) {
        this.administrativegendercode = administrativegendercode;
    }

    public String getAdministrativegendername() {
        return administrativegendername;
    }

    public void setAdministrativegendername(String administrativegendername) {
        this.administrativegendername = administrativegendername;
    }

    public String getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(String birthtime) {
        this.birthtime = birthtime;
    }

    public String getAsotherids() {
        return asotherids;
    }

    public void setAsotherids(String asotherids) {
        this.asotherids = asotherids;
    }

    public String getAsotheridm() {
        return asotheridm;
    }

    public void setAsotheridm(String asotheridm) {
        this.asotheridm = asotheridm;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "ViewHlhtAddactorder{" +
        "id=" + id +
        ", msgId=" + msgId +
        ", recipeNo=" + recipeNo +
        ", inPatientId=" + inPatientId +
        ", cardNo=" + cardNo +
        ", jcptNo=" + jcptNo +
        ", visitno=" + visitno +
        ", seeDate=" + seeDate +
        ", code=" + code +
        ", codename=" + codename +
        ", text=" + text +
        ", low=" + low +
        ", high=" + high +
        ", effectivetime=" + effectivetime +
        ", effectiveunit=" + effectiveunit +
        ", routecode=" + routecode +
        ", routename=" + routename +
        ", dosequantity=" + dosequantity +
        ", doseunit=" + doseunit +
        ", numerator=" + numerator +
        ", numeratorunit=" + numeratorunit +
        ", denominator=" + denominator +
        ", denominatorUnit=" + denominatorUnit +
        ", administrationunitcode=" + administrationunitcode +
        ", administrationunitname=" + administrationunitname +
        ", administerablemedicineName=" + administerablemedicineName +
        ", capacityquantity=" + capacityquantity +
        ", capacityunit=" + capacityunit +
        ", authorTime=" + authorTime +
        ", signaturetext=" + signaturetext +
        ", assignedentityId=" + assignedentityId +
        ", assignedpersonName=" + assignedpersonName +
        ", representedorganizationId=" + representedorganizationId +
        ", representedorganizationName=" + representedorganizationName +
        ", verifierTime=" + verifierTime +
        ", verifierSignaturetext=" + verifierSignaturetext +
        ", verifierAssignedentityId=" + verifierAssignedentityId +
        ", verifierAssignedpersonname=" + verifierAssignedpersonname +
        ", annotationText=" + annotationText +
        ", annotationStatuscode=" + annotationStatuscode +
        ", authorAssignedentityId=" + authorAssignedentityId +
        ", entityAssignedpersonName=" + entityAssignedpersonName +
        ", entityOrganizationId=" + entityOrganizationId +
        ", entityOrganizationName=" + entityOrganizationName +
        ", encounterId=" + encounterId +
        ", patientId=" + patientId +
        ", patientTelecom=" + patientTelecom +
        ", statuscode=" + statuscode +
        ", patientpersonId=" + patientpersonId +
        ", name=" + name +
        ", administrativegendercode=" + administrativegendercode +
        ", administrativegendername=" + administrativegendername +
        ", birthtime=" + birthtime +
        ", asotherids=" + asotherids +
        ", asotheridm=" + asotheridm +
        ", operDate=" + operDate +
        "}";
    }
}

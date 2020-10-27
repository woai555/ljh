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
public class ViewJiaheMzbl implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private LocalDateTime visitDate;

    private String hostTell;

    private String currentIllness;

    private String anamnesis;

    private String individual;

    private String family;

    private String checkbody;

    private String adminical;

    private String disposition;

    private String diagnosis;

    private String remarks;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
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

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCheckbody() {
        return checkbody;
    }

    public void setCheckbody(String checkbody) {
        this.checkbody = checkbody;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzbl{" +
        "patientId=" + patientId +
        ", visitDate=" + visitDate +
        ", hostTell=" + hostTell +
        ", currentIllness=" + currentIllness +
        ", anamnesis=" + anamnesis +
        ", individual=" + individual +
        ", family=" + family +
        ", checkbody=" + checkbody +
        ", adminical=" + adminical +
        ", disposition=" + disposition +
        ", diagnosis=" + diagnosis +
        ", remarks=" + remarks +
        "}";
    }
}

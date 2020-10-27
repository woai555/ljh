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
public class ViewJiaheErHis implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientid;

    private String inpatientno;

    private LocalDateTime visittime;

    private String patientdestination;

    private LocalDateTime firstctmrtime;

    private LocalDateTime firstlabtime;


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

    public LocalDateTime getVisittime() {
        return visittime;
    }

    public void setVisittime(LocalDateTime visittime) {
        this.visittime = visittime;
    }

    public String getPatientdestination() {
        return patientdestination;
    }

    public void setPatientdestination(String patientdestination) {
        this.patientdestination = patientdestination;
    }

    public LocalDateTime getFirstctmrtime() {
        return firstctmrtime;
    }

    public void setFirstctmrtime(LocalDateTime firstctmrtime) {
        this.firstctmrtime = firstctmrtime;
    }

    public LocalDateTime getFirstlabtime() {
        return firstlabtime;
    }

    public void setFirstlabtime(LocalDateTime firstlabtime) {
        this.firstlabtime = firstlabtime;
    }

    @Override
    public String toString() {
        return "ViewJiaheErHis{" +
        "patientid=" + patientid +
        ", inpatientno=" + inpatientno +
        ", visittime=" + visittime +
        ", patientdestination=" + patientdestination +
        ", firstctmrtime=" + firstctmrtime +
        ", firstlabtime=" + firstlabtime +
        "}";
    }
}

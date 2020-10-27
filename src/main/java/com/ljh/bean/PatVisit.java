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
public class PatVisit implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private LocalDateTime visitDate;

    private String presciptionNo;

    private String diagnosis;

    private String orderingDept;

    private String orderingDoc;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public String getPresciptionNo() {
        return presciptionNo;
    }

    public void setPresciptionNo(String presciptionNo) {
        this.presciptionNo = presciptionNo;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getOrderingDept() {
        return orderingDept;
    }

    public void setOrderingDept(String orderingDept) {
        this.orderingDept = orderingDept;
    }

    public String getOrderingDoc() {
        return orderingDoc;
    }

    public void setOrderingDoc(String orderingDoc) {
        this.orderingDoc = orderingDoc;
    }

    @Override
    public String toString() {
        return "PatVisit{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", visitDate=" + visitDate +
        ", presciptionNo=" + presciptionNo +
        ", diagnosis=" + diagnosis +
        ", orderingDept=" + orderingDept +
        ", orderingDoc=" + orderingDoc +
        "}";
    }
}

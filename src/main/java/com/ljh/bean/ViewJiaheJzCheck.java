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
public class ViewJiaheJzCheck implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String name;

    private String patientid;

    private LocalDateTime regDate;

    private LocalDateTime operDate;

    private LocalDateTime indate;

    private String diagName;

    private LocalDateTime asplTime;

    private LocalDateTime rsTime;

    private LocalDateTime intime;

    private LocalDateTime jhTime;

    private LocalDateTime opstime;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public LocalDateTime getIndate() {
        return indate;
    }

    public void setIndate(LocalDateTime indate) {
        this.indate = indate;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public LocalDateTime getAsplTime() {
        return asplTime;
    }

    public void setAsplTime(LocalDateTime asplTime) {
        this.asplTime = asplTime;
    }

    public LocalDateTime getRsTime() {
        return rsTime;
    }

    public void setRsTime(LocalDateTime rsTime) {
        this.rsTime = rsTime;
    }

    public LocalDateTime getIntime() {
        return intime;
    }

    public void setIntime(LocalDateTime intime) {
        this.intime = intime;
    }

    public LocalDateTime getJhTime() {
        return jhTime;
    }

    public void setJhTime(LocalDateTime jhTime) {
        this.jhTime = jhTime;
    }

    public LocalDateTime getOpstime() {
        return opstime;
    }

    public void setOpstime(LocalDateTime opstime) {
        this.opstime = opstime;
    }

    @Override
    public String toString() {
        return "ViewJiaheJzCheck{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", patientid=" + patientid +
        ", regDate=" + regDate +
        ", operDate=" + operDate +
        ", indate=" + indate +
        ", diagName=" + diagName +
        ", asplTime=" + asplTime +
        ", rsTime=" + rsTime +
        ", intime=" + intime +
        ", jhTime=" + jhTime +
        ", opstime=" + opstime +
        "}";
    }
}

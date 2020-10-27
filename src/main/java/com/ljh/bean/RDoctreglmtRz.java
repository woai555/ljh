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
public class RDoctreglmtRz implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 医师
     */
    private String emplCode;

    /**
     * 科室
     */
    private String deptCode;

    /**
     * 医师级别
     */
    private String reglevlCode;

    /**
     * 看诊日期
     */
    private LocalDateTime seeDate;

    /**
     * 新预约限额
     */
    private Integer firReglmtNew;

    /**
     * 新预约总额
     */
    private Integer repReglmtNew;

    /**
     * 旧预约限额
     */
    private Integer firReglmtOld;

    /**
     * 旧预约总额
     */
    private Integer repReglmtOld;

    /**
     * 操作员
     */
    private String opercode;

    /**
     * 操作时间
     */
    private LocalDateTime operdate;

    /**
     * 停诊标志 1 停诊
     */
    private String reducedFlag;

    /**
     * 是否为分时段排班1是
     */
    private String fsdpb;

    /**
     * 清理排班
     */
    private LocalDateTime todate;


    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public Integer getFirReglmtNew() {
        return firReglmtNew;
    }

    public void setFirReglmtNew(Integer firReglmtNew) {
        this.firReglmtNew = firReglmtNew;
    }

    public Integer getRepReglmtNew() {
        return repReglmtNew;
    }

    public void setRepReglmtNew(Integer repReglmtNew) {
        this.repReglmtNew = repReglmtNew;
    }

    public Integer getFirReglmtOld() {
        return firReglmtOld;
    }

    public void setFirReglmtOld(Integer firReglmtOld) {
        this.firReglmtOld = firReglmtOld;
    }

    public Integer getRepReglmtOld() {
        return repReglmtOld;
    }

    public void setRepReglmtOld(Integer repReglmtOld) {
        this.repReglmtOld = repReglmtOld;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public String getReducedFlag() {
        return reducedFlag;
    }

    public void setReducedFlag(String reducedFlag) {
        this.reducedFlag = reducedFlag;
    }

    public String getFsdpb() {
        return fsdpb;
    }

    public void setFsdpb(String fsdpb) {
        this.fsdpb = fsdpb;
    }

    public LocalDateTime getTodate() {
        return todate;
    }

    public void setTodate(LocalDateTime todate) {
        this.todate = todate;
    }

    @Override
    public String toString() {
        return "RDoctreglmtRz{" +
        "noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", seeDate=" + seeDate +
        ", firReglmtNew=" + firReglmtNew +
        ", repReglmtNew=" + repReglmtNew +
        ", firReglmtOld=" + firReglmtOld +
        ", repReglmtOld=" + repReglmtOld +
        ", opercode=" + opercode +
        ", operdate=" + operdate +
        ", reducedFlag=" + reducedFlag +
        ", fsdpb=" + fsdpb +
        ", todate=" + todate +
        "}";
    }
}

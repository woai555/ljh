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
public class RDoctreglmtDefinedBak implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String timeCode;

    private String emplCode;

    private String reglevlCode;

    private String deptCode;

    private Integer firRegLmt;

    private Integer repRegLmt;

    private String week;

    private Integer firReged;

    private Integer repReged;

    private String ynfregfull;

    private String ynrregfull;

    private Integer operCode;

    private LocalDateTime operDate;

    private String note;

    private String reducedFlag;

    private Integer reducedFirnum;

    private Integer reducedRepnum;

    private String absentDoct;

    private String flag;

    private Integer addReged;

    private Integer addRegLmt;

    private Integer quitRegnum;

    private String regedFlag;

    private Integer jyt2ZzNum;

    private Integer quitBooknum;


    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Integer getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(Integer firRegLmt) {
        this.firRegLmt = firRegLmt;
    }

    public Integer getRepRegLmt() {
        return repRegLmt;
    }

    public void setRepRegLmt(Integer repRegLmt) {
        this.repRegLmt = repRegLmt;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Integer getFirReged() {
        return firReged;
    }

    public void setFirReged(Integer firReged) {
        this.firReged = firReged;
    }

    public Integer getRepReged() {
        return repReged;
    }

    public void setRepReged(Integer repReged) {
        this.repReged = repReged;
    }

    public String getYnfregfull() {
        return ynfregfull;
    }

    public void setYnfregfull(String ynfregfull) {
        this.ynfregfull = ynfregfull;
    }

    public String getYnrregfull() {
        return ynrregfull;
    }

    public void setYnrregfull(String ynrregfull) {
        this.ynrregfull = ynrregfull;
    }

    public Integer getOperCode() {
        return operCode;
    }

    public void setOperCode(Integer operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReducedFlag() {
        return reducedFlag;
    }

    public void setReducedFlag(String reducedFlag) {
        this.reducedFlag = reducedFlag;
    }

    public Integer getReducedFirnum() {
        return reducedFirnum;
    }

    public void setReducedFirnum(Integer reducedFirnum) {
        this.reducedFirnum = reducedFirnum;
    }

    public Integer getReducedRepnum() {
        return reducedRepnum;
    }

    public void setReducedRepnum(Integer reducedRepnum) {
        this.reducedRepnum = reducedRepnum;
    }

    public String getAbsentDoct() {
        return absentDoct;
    }

    public void setAbsentDoct(String absentDoct) {
        this.absentDoct = absentDoct;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getAddReged() {
        return addReged;
    }

    public void setAddReged(Integer addReged) {
        this.addReged = addReged;
    }

    public Integer getAddRegLmt() {
        return addRegLmt;
    }

    public void setAddRegLmt(Integer addRegLmt) {
        this.addRegLmt = addRegLmt;
    }

    public Integer getQuitRegnum() {
        return quitRegnum;
    }

    public void setQuitRegnum(Integer quitRegnum) {
        this.quitRegnum = quitRegnum;
    }

    public String getRegedFlag() {
        return regedFlag;
    }

    public void setRegedFlag(String regedFlag) {
        this.regedFlag = regedFlag;
    }

    public Integer getJyt2ZzNum() {
        return jyt2ZzNum;
    }

    public void setJyt2ZzNum(Integer jyt2ZzNum) {
        this.jyt2ZzNum = jyt2ZzNum;
    }

    public Integer getQuitBooknum() {
        return quitBooknum;
    }

    public void setQuitBooknum(Integer quitBooknum) {
        this.quitBooknum = quitBooknum;
    }

    @Override
    public String toString() {
        return "RDoctreglmtDefinedBak{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", timeCode=" + timeCode +
        ", emplCode=" + emplCode +
        ", reglevlCode=" + reglevlCode +
        ", deptCode=" + deptCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", week=" + week +
        ", firReged=" + firReged +
        ", repReged=" + repReged +
        ", ynfregfull=" + ynfregfull +
        ", ynrregfull=" + ynrregfull +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", note=" + note +
        ", reducedFlag=" + reducedFlag +
        ", reducedFirnum=" + reducedFirnum +
        ", reducedRepnum=" + reducedRepnum +
        ", absentDoct=" + absentDoct +
        ", flag=" + flag +
        ", addReged=" + addReged +
        ", addRegLmt=" + addRegLmt +
        ", quitRegnum=" + quitRegnum +
        ", regedFlag=" + regedFlag +
        ", jyt2ZzNum=" + jyt2ZzNum +
        ", quitBooknum=" + quitBooknum +
        "}";
    }
}

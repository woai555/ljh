package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医师出诊表R_DoctRegLmt
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDoctreglmt implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊日期
     */
    @TableId(value = "SEE_DATE", type = IdType.AUTO)
    private LocalDateTime seeDate;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 医师代号
     */
    private String emplCode;

    /**
     * 出诊科室
     */
    private String deptCode;

    /**
     * 挂号级别
     */
    private String reglevlCode;

    /**
     * 预约限额(天坛作为预约限额)
     */
    private Integer firRegLmt;

    /**
     * 复诊限额(天坛作为总限额)
     */
    private Integer repRegLmt;

    /**
     * 预约限额(天坛不用)
     */
    private Integer bkRegLmt;

    /**
     * 初诊已挂(天坛作为现场号已挂)
     */
    private Integer firReged;

    /**
     * 复诊已挂(天坛不用)
     */
    private Integer repReged;

    /**
     * 急诊已挂(天坛不用)
     */
    private Integer urgReged;

    /**
     * 预约已挂
     */
    private Integer bkReged;

    /**
     * 初诊额满标记(天坛作为总体额满)
     */
    private String ynfregfull;

    /**
     * 复诊额满标记(天坛不用)
     */
    private String ynrregfull;

    /**
     * 预约额满标记
     */
    private String ynbkregfull;

    /**
     * 初诊挂号费
     */
    private BigDecimal firRegFee;

    /**
     * 复诊挂号费
     */
    private BigDecimal repRegFee;

    /**
     * 检查费
     */
    private BigDecimal chckFee;

    /**
     * 诊察费
     */
    private BigDecimal diagFee;

    /**
     * 附加费
     */
    private BigDecimal othFee;

    /**
     * 急诊挂号费
     */
    private BigDecimal urgRegFee;

    /**
     * 急诊检查费
     */
    private BigDecimal urgChckFee;

    /**
     * 急诊诊察费
     */
    private BigDecimal urgDiagFee;

    /**
     * 急诊附加费
     */
    private BigDecimal urgOthFee;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 星期
     */
    private String week;

    /**
     * 备注
     */
    private String note;

    /**
     * 预约起始号
     */
    private BigDecimal bkBegin;

    /**
     * 预约终止号
     */
    private BigDecimal bkEnd;

    /**
     * 是否有停诊
     */
    private String reducedFlag;

    /**
     * 减少多少个预约限额
     */
    private Integer reducedFirnum;

    /**
     * 减少多少个总限额
     */
    private Integer reducedRepnum;

    /**
     * 停诊医师
     */
    private String absentDoct;

    /**
     * 指定患者加号数量,加11点时段
     */
    private Integer addReged;

    /**
     * 不指定患者允许加号数量，加11点时段
     */
    private Integer addRegLmt;

    /**
     * 爽约、退号数量，回收至总限额，分配至11点时段
     */
    private Integer quitRegnum;

    /**
     * 号源是否被预约，已经预约过，允许更新，不允许删除排班
     */
    private String regedFlag;

    /**
     * 京医通2期社区转诊限额
     */
    private Integer jyt2ZzNum;

    /**
     * 特需爽约回收至预约限额，分配至11点时段
     */
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

    public Integer getBkRegLmt() {
        return bkRegLmt;
    }

    public void setBkRegLmt(Integer bkRegLmt) {
        this.bkRegLmt = bkRegLmt;
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

    public Integer getUrgReged() {
        return urgReged;
    }

    public void setUrgReged(Integer urgReged) {
        this.urgReged = urgReged;
    }

    public Integer getBkReged() {
        return bkReged;
    }

    public void setBkReged(Integer bkReged) {
        this.bkReged = bkReged;
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

    public String getYnbkregfull() {
        return ynbkregfull;
    }

    public void setYnbkregfull(String ynbkregfull) {
        this.ynbkregfull = ynbkregfull;
    }

    public BigDecimal getFirRegFee() {
        return firRegFee;
    }

    public void setFirRegFee(BigDecimal firRegFee) {
        this.firRegFee = firRegFee;
    }

    public BigDecimal getRepRegFee() {
        return repRegFee;
    }

    public void setRepRegFee(BigDecimal repRegFee) {
        this.repRegFee = repRegFee;
    }

    public BigDecimal getChckFee() {
        return chckFee;
    }

    public void setChckFee(BigDecimal chckFee) {
        this.chckFee = chckFee;
    }

    public BigDecimal getDiagFee() {
        return diagFee;
    }

    public void setDiagFee(BigDecimal diagFee) {
        this.diagFee = diagFee;
    }

    public BigDecimal getOthFee() {
        return othFee;
    }

    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    public BigDecimal getUrgRegFee() {
        return urgRegFee;
    }

    public void setUrgRegFee(BigDecimal urgRegFee) {
        this.urgRegFee = urgRegFee;
    }

    public BigDecimal getUrgChckFee() {
        return urgChckFee;
    }

    public void setUrgChckFee(BigDecimal urgChckFee) {
        this.urgChckFee = urgChckFee;
    }

    public BigDecimal getUrgDiagFee() {
        return urgDiagFee;
    }

    public void setUrgDiagFee(BigDecimal urgDiagFee) {
        this.urgDiagFee = urgDiagFee;
    }

    public BigDecimal getUrgOthFee() {
        return urgOthFee;
    }

    public void setUrgOthFee(BigDecimal urgOthFee) {
        this.urgOthFee = urgOthFee;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getBkBegin() {
        return bkBegin;
    }

    public void setBkBegin(BigDecimal bkBegin) {
        this.bkBegin = bkBegin;
    }

    public BigDecimal getBkEnd() {
        return bkEnd;
    }

    public void setBkEnd(BigDecimal bkEnd) {
        this.bkEnd = bkEnd;
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
        return "RDoctreglmt{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", bkRegLmt=" + bkRegLmt +
        ", firReged=" + firReged +
        ", repReged=" + repReged +
        ", urgReged=" + urgReged +
        ", bkReged=" + bkReged +
        ", ynfregfull=" + ynfregfull +
        ", ynrregfull=" + ynrregfull +
        ", ynbkregfull=" + ynbkregfull +
        ", firRegFee=" + firRegFee +
        ", repRegFee=" + repRegFee +
        ", chckFee=" + chckFee +
        ", diagFee=" + diagFee +
        ", othFee=" + othFee +
        ", urgRegFee=" + urgRegFee +
        ", urgChckFee=" + urgChckFee +
        ", urgDiagFee=" + urgDiagFee +
        ", urgOthFee=" + urgOthFee +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", week=" + week +
        ", note=" + note +
        ", bkBegin=" + bkBegin +
        ", bkEnd=" + bkEnd +
        ", reducedFlag=" + reducedFlag +
        ", reducedFirnum=" + reducedFirnum +
        ", reducedRepnum=" + reducedRepnum +
        ", absentDoct=" + absentDoct +
        ", addReged=" + addReged +
        ", addRegLmt=" + addRegLmt +
        ", quitRegnum=" + quitRegnum +
        ", regedFlag=" + regedFlag +
        ", jyt2ZzNum=" + jyt2ZzNum +
        ", quitBooknum=" + quitBooknum +
        "}";
    }
}

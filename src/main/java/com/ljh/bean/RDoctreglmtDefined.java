package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医师出诊自定义分时段排班记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDoctreglmtDefined implements Serializable {

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
     * 时段
     */
    private String timeCode;

    /**
     * 医师代号
     */
    private String emplCode;

    /**
     * 挂号级别
     */
    private String reglevlCode;

    /**
     * 出诊科室
     */
    private String deptCode;

    /**
     * 预约限额(天坛作为预约限额)
     */
    private Integer firRegLmt;

    /**
     * 复诊限额(天坛作为总限额)
     */
    private Integer repRegLmt;

    /**
     * 星期
     */
    private String week;

    /**
     * 初诊已挂
     */
    private Integer firReged;

    /**
     * 预约已挂
     */
    private Integer repReged;

    /**
     * 初诊限额是否满
     */
    private String ynfregfull;

    /**
     * 复诊限额是否满
     */
    private String ynrregfull;

    /**
     * 操作员
     */
    private Integer operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 备注
     */
    private String note;

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
     * 0为加号时段
     */
    private String flag;

    /**
     * 指定患者加号数量，加11点时段
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
        return "RDoctreglmtDefined{" +
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

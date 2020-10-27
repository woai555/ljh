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
public class RDoctreglmtMaintance implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "SEE_DATE", type = IdType.AUTO)
    private LocalDateTime seeDate;

    private String noonCode;

    private String emplCode;

    private String deptCode;

    private String reglevlCode;

    private String week;

    private Integer firRegLmt;

    private LocalDateTime operDate;

    private String operCode;

    private Integer maxRegLmt;

    private String specialgroup;

    private String flag;


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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Integer getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(Integer firRegLmt) {
        this.firRegLmt = firRegLmt;
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

    public Integer getMaxRegLmt() {
        return maxRegLmt;
    }

    public void setMaxRegLmt(Integer maxRegLmt) {
        this.maxRegLmt = maxRegLmt;
    }

    public String getSpecialgroup() {
        return specialgroup;
    }

    public void setSpecialgroup(String specialgroup) {
        this.specialgroup = specialgroup;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "RDoctreglmtMaintance{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", week=" + week +
        ", firRegLmt=" + firRegLmt +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", maxRegLmt=" + maxRegLmt +
        ", specialgroup=" + specialgroup +
        ", flag=" + flag +
        "}";
    }
}

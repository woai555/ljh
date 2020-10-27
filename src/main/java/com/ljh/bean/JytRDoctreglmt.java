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
public class JytRDoctreglmt implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String emplCode;

    private String deptCode;

    private String reglevlCode;

    private BigDecimal firRegLmt;

    private BigDecimal repRegLmt;


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

    public BigDecimal getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(BigDecimal firRegLmt) {
        this.firRegLmt = firRegLmt;
    }

    public BigDecimal getRepRegLmt() {
        return repRegLmt;
    }

    public void setRepRegLmt(BigDecimal repRegLmt) {
        this.repRegLmt = repRegLmt;
    }

    @Override
    public String toString() {
        return "JytRDoctreglmt{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        "}";
    }
}

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
public class JytRDoctreglmtDefined implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String deptCode;

    private String emplCode;

    private String reglevlCode;

    private BigDecimal jyt2ZzNum;


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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public BigDecimal getJyt2ZzNum() {
        return jyt2ZzNum;
    }

    public void setJyt2ZzNum(BigDecimal jyt2ZzNum) {
        this.jyt2ZzNum = jyt2ZzNum;
    }

    @Override
    public String toString() {
        return "JytRDoctreglmtDefined{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", deptCode=" + deptCode +
        ", emplCode=" + emplCode +
        ", reglevlCode=" + reglevlCode +
        ", jyt2ZzNum=" + jyt2ZzNum +
        "}";
    }
}

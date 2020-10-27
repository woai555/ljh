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
public class VMeeting implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String dept;

    private String export;

    private BigDecimal limitFir;


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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public BigDecimal getLimitFir() {
        return limitFir;
    }

    public void setLimitFir(BigDecimal limitFir) {
        this.limitFir = limitFir;
    }

    @Override
    public String toString() {
        return "VMeeting{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", dept=" + dept +
        ", export=" + export +
        ", limitFir=" + limitFir +
        "}";
    }
}

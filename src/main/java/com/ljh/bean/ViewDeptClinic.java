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
public class ViewDeptClinic implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String pactCode;

    private LocalDateTime regDate;

    private BigDecimal drug;

    private BigDecimal undrug;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public BigDecimal getDrug() {
        return drug;
    }

    public void setDrug(BigDecimal drug) {
        this.drug = drug;
    }

    public BigDecimal getUndrug() {
        return undrug;
    }

    public void setUndrug(BigDecimal undrug) {
        this.undrug = undrug;
    }

    @Override
    public String toString() {
        return "ViewDeptClinic{" +
        "deptCode=" + deptCode +
        ", pactCode=" + pactCode +
        ", regDate=" + regDate +
        ", drug=" + drug +
        ", undrug=" + undrug +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class ViewMrmsInmaininfoQuery implements Serializable {

    private static final long serialVersionUID=1L;

    private String biliNo;

    private String pName;

    private BigDecimal caseFlag;


    public String getBiliNo() {
        return biliNo;
    }

    public void setBiliNo(String biliNo) {
        this.biliNo = biliNo;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public BigDecimal getCaseFlag() {
        return caseFlag;
    }

    public void setCaseFlag(BigDecimal caseFlag) {
        this.caseFlag = caseFlag;
    }

    @Override
    public String toString() {
        return "ViewMrmsInmaininfoQuery{" +
        "biliNo=" + biliNo +
        ", pName=" + pName +
        ", caseFlag=" + caseFlag +
        "}";
    }
}

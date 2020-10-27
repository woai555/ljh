package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 出院患者费用资料档MRMSFEES
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsfees implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院流水号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 科室号
     */
    private String deptCode;

    /**
     * 出院主诊断
     */
    private String icdCode;

    /**
     * 费用大类代码
     */
    private String feeId;

    /**
     * 费用金额
     */
    private BigDecimal totCost;

    /**
     * 出院日期
     */
    private LocalDateTime outDate2;

    /**
     * 费用大类名称
     */
    private String feeName;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public LocalDateTime getOutDate2() {
        return outDate2;
    }

    public void setOutDate2(LocalDateTime outDate2) {
        this.outDate2 = outDate2;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    @Override
    public String toString() {
        return "Mrmsfees{" +
        "inpatientNo=" + inpatientNo +
        ", deptCode=" + deptCode +
        ", icdCode=" + icdCode +
        ", feeId=" + feeId +
        ", totCost=" + totCost +
        ", outDate2=" + outDate2 +
        ", feeName=" + feeName +
        "}";
    }
}

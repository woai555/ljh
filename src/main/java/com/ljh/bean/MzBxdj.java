package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊保险登记
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MzBxdj implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 保险登记编号
     */
    @TableId(value = "BAOXIAN_NO", type = IdType.AUTO)
    private BigDecimal baoxianNo;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 单位信息
     */
    private String unitinfo;

    /**
     * 保险登记日期
     */
    private LocalDateTime operDate;

    /**
     * 操作人
     */
    private String operName;


    public BigDecimal getBaoxianNo() {
        return baoxianNo;
    }

    public void setBaoxianNo(BigDecimal baoxianNo) {
        this.baoxianNo = baoxianNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getUnitinfo() {
        return unitinfo;
    }

    public void setUnitinfo(String unitinfo) {
        this.unitinfo = unitinfo;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Override
    public String toString() {
        return "MzBxdj{" +
        "baoxianNo=" + baoxianNo +
        ", patientName=" + patientName +
        ", unitinfo=" + unitinfo +
        ", operDate=" + operDate +
        ", operName=" + operName +
        "}";
    }
}

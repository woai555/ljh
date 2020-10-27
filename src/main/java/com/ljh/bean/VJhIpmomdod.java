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
public class VJhIpmomdod implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String patientNo;

    private String deptCode;

    private String decmpsState;

    private LocalDateTime dateBgn;

    private LocalDateTime dateEnd;

    private String itemCode;

    private String itemName;

    private BigDecimal doseOnce;

    private String doseUnit;

    private String dfqFreq;

    private String dfqCexp;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDecmpsState() {
        return decmpsState;
    }

    public void setDecmpsState(String decmpsState) {
        this.decmpsState = decmpsState;
    }

    public LocalDateTime getDateBgn() {
        return dateBgn;
    }

    public void setDateBgn(LocalDateTime dateBgn) {
        this.dateBgn = dateBgn;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getDoseOnce() {
        return doseOnce;
    }

    public void setDoseOnce(BigDecimal doseOnce) {
        this.doseOnce = doseOnce;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public String getDfqFreq() {
        return dfqFreq;
    }

    public void setDfqFreq(String dfqFreq) {
        this.dfqFreq = dfqFreq;
    }

    public String getDfqCexp() {
        return dfqCexp;
    }

    public void setDfqCexp(String dfqCexp) {
        this.dfqCexp = dfqCexp;
    }

    @Override
    public String toString() {
        return "VJhIpmomdod{" +
        "inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", deptCode=" + deptCode +
        ", decmpsState=" + decmpsState +
        ", dateBgn=" + dateBgn +
        ", dateEnd=" + dateEnd +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", doseOnce=" + doseOnce +
        ", doseUnit=" + doseUnit +
        ", dfqFreq=" + dfqFreq +
        ", dfqCexp=" + dfqCexp +
        "}";
    }
}

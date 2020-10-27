package com.ljh.bean;

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
public class ViewMdyDrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String localDrugId;

    private String localDrugName;

    private String localDosageForm;

    private String manufacture;

    private String localDrugSpec;

    private String approveNumber;

    private String doseUnit;

    private String pyCode;

    private String stopDate;


    public String getLocalDrugId() {
        return localDrugId;
    }

    public void setLocalDrugId(String localDrugId) {
        this.localDrugId = localDrugId;
    }

    public String getLocalDrugName() {
        return localDrugName;
    }

    public void setLocalDrugName(String localDrugName) {
        this.localDrugName = localDrugName;
    }

    public String getLocalDosageForm() {
        return localDosageForm;
    }

    public void setLocalDosageForm(String localDosageForm) {
        this.localDosageForm = localDosageForm;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getLocalDrugSpec() {
        return localDrugSpec;
    }

    public void setLocalDrugSpec(String localDrugSpec) {
        this.localDrugSpec = localDrugSpec;
    }

    public String getApproveNumber() {
        return approveNumber;
    }

    public void setApproveNumber(String approveNumber) {
        this.approveNumber = approveNumber;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public String getPyCode() {
        return pyCode;
    }

    public void setPyCode(String pyCode) {
        this.pyCode = pyCode;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }

    @Override
    public String toString() {
        return "ViewMdyDrug{" +
        "localDrugId=" + localDrugId +
        ", localDrugName=" + localDrugName +
        ", localDosageForm=" + localDosageForm +
        ", manufacture=" + manufacture +
        ", localDrugSpec=" + localDrugSpec +
        ", approveNumber=" + approveNumber +
        ", doseUnit=" + doseUnit +
        ", pyCode=" + pyCode +
        ", stopDate=" + stopDate +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病人病历流转记录表(R_PatientMedicalInfo_record)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientmedicalinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 门诊病历号
     */
    @TableId(value = "CLINIC_NO", type = IdType.AUTO)
    private String clinicNo;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 病历存储位置
     */
    private String storagelocation;

    /**
     * 核收登记人
     */
    private String regOperator;

    /**
     * 核收登记时间
     */
    private LocalDateTime regDate;

    /**
     * 0.在库、1.出库、2、借出
     */
    private String currentState;


    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoragelocation() {
        return storagelocation;
    }

    public void setStoragelocation(String storagelocation) {
        this.storagelocation = storagelocation;
    }

    public String getRegOperator() {
        return regOperator;
    }

    public void setRegOperator(String regOperator) {
        this.regOperator = regOperator;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "RPatientmedicalinfo{" +
        "clinicNo=" + clinicNo +
        ", name=" + name +
        ", storagelocation=" + storagelocation +
        ", regOperator=" + regOperator +
        ", regDate=" + regDate +
        ", currentState=" + currentState +
        "}";
    }
}

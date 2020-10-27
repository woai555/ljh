package com.ljh.bean;

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
public class MachineBranchOld implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String machineCode;

    private String machineName;

    private String mark;

    private String machinePlace;

    private String machineType;

    private String bz;

    private String orderFlag;

    private String orderAfternoon;

    private LocalDateTime operDate;

    private String operCode;

    private String devicecode;

    private String machineTypename;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMachinePlace() {
        return machinePlace;
    }

    public void setMachinePlace(String machinePlace) {
        this.machinePlace = machinePlace;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getOrderAfternoon() {
        return orderAfternoon;
    }

    public void setOrderAfternoon(String orderAfternoon) {
        this.orderAfternoon = orderAfternoon;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getDevicecode() {
        return devicecode;
    }

    public void setDevicecode(String devicecode) {
        this.devicecode = devicecode;
    }

    public String getMachineTypename() {
        return machineTypename;
    }

    public void setMachineTypename(String machineTypename) {
        this.machineTypename = machineTypename;
    }

    @Override
    public String toString() {
        return "MachineBranchOld{" +
        "deptCode=" + deptCode +
        ", machineCode=" + machineCode +
        ", machineName=" + machineName +
        ", mark=" + mark +
        ", machinePlace=" + machinePlace +
        ", machineType=" + machineType +
        ", bz=" + bz +
        ", orderFlag=" + orderFlag +
        ", orderAfternoon=" + orderAfternoon +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", devicecode=" + devicecode +
        ", machineTypename=" + machineTypename +
        "}";
    }
}

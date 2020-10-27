package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 科室设备
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MachineBranchNew implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 设备代码
     */
    private String machineCode;

    /**
     * 设备名称
     */
    private String machineName;

    /**
     * 备注
     */
    private String mark;

    /**
     * 设备位置
     */
    private String machinePlace;

    /**
     * PACS设备类型编码
     */
    private String machineType;

    /**
     * 新院：1，老院 0
     */
    private String bz;

    /**
     * 上午是否启用分诊1启用0不启用
     */
    private String orderFlag;

    /**
     * 下午是否启用分诊1启用0不启用
     */
    private String orderAfternoon;

    private LocalDateTime operDate;

    private String operCode;

    /**
     * PACS设备编号
     */
    private String devicecode;

    /**
     * PACS设备类型名称
     */
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
        return "MachineBranchNew{" +
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

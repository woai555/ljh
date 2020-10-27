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
public class MachineBranch implements Serializable {

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
     * 操作人代码
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 检查类别编码
     */
    private String typeId;

    /**
     * 检查类别名称
     */
    private String typeName;

    /**
     * 设备位置
     */
    private String machinePlace;

    /**
     * 设备类别
     */
    private String macnineType;

    /**
     * 设备别名
     */
    private String macnineName2;


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

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getMachinePlace() {
        return machinePlace;
    }

    public void setMachinePlace(String machinePlace) {
        this.machinePlace = machinePlace;
    }

    public String getMacnineType() {
        return macnineType;
    }

    public void setMacnineType(String macnineType) {
        this.macnineType = macnineType;
    }

    public String getMacnineName2() {
        return macnineName2;
    }

    public void setMacnineName2(String macnineName2) {
        this.macnineName2 = macnineName2;
    }

    @Override
    public String toString() {
        return "MachineBranch{" +
        "deptCode=" + deptCode +
        ", machineCode=" + machineCode +
        ", machineName=" + machineName +
        ", mark=" + mark +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        ", machinePlace=" + machinePlace +
        ", macnineType=" + macnineType +
        ", macnineName2=" + macnineName2 +
        "}";
    }
}

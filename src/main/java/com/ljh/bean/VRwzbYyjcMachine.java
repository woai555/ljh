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
public class VRwzbYyjcMachine implements Serializable {

    private static final long serialVersionUID=1L;

    private String machineCode;

    private String machineName;

    private String deptCode;

    private String deptName;

    private String machinePlace;

    private String ynxinyua;


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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getMachinePlace() {
        return machinePlace;
    }

    public void setMachinePlace(String machinePlace) {
        this.machinePlace = machinePlace;
    }

    public String getYnxinyua() {
        return ynxinyua;
    }

    public void setYnxinyua(String ynxinyua) {
        this.ynxinyua = ynxinyua;
    }

    @Override
    public String toString() {
        return "VRwzbYyjcMachine{" +
        "machineCode=" + machineCode +
        ", machineName=" + machineName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", machinePlace=" + machinePlace +
        ", ynxinyua=" + ynxinyua +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 大型设备机业务机器对照表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TEquipToMachine implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 设备序号
     */
    @TableId(value = "YEARCODE", type = IdType.AUTO)
    private String yearcode;

    /**
     * 设备名称
     */
    private String facilityname;

    /**
     * 机器代码
     */
    private String machineCode;

    /**
     * 机器名称
     */
    private String machineName;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;


    public String getYearcode() {
        return yearcode;
    }

    public void setYearcode(String yearcode) {
        this.yearcode = yearcode;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
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

    @Override
    public String toString() {
        return "TEquipToMachine{" +
        "yearcode=" + yearcode +
        ", facilityname=" + facilityname +
        ", machineCode=" + machineCode +
        ", machineName=" + machineName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

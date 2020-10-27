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
public class ViewCbhsMachine implements Serializable {

    private static final long serialVersionUID=1L;

    private String yearcode;

    private String facilityname;

    private String machineCode;

    private String machineName;


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

    @Override
    public String toString() {
        return "ViewCbhsMachine{" +
        "yearcode=" + yearcode +
        ", facilityname=" + facilityname +
        ", machineCode=" + machineCode +
        ", machineName=" + machineName +
        "}";
    }
}

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
public class ViewTjUndrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String undrugName;

    private String pacsname;

    private String machineType;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public String getPacsname() {
        return pacsname;
    }

    public void setPacsname(String pacsname) {
        this.pacsname = pacsname;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    @Override
    public String toString() {
        return "ViewTjUndrug{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", pacsname=" + pacsname +
        ", machineType=" + machineType +
        "}";
    }
}

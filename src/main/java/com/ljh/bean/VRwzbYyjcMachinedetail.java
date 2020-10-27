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
public class VRwzbYyjcMachinedetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String machineCode;

    private String typeId;

    private String typeName;


    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
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

    @Override
    public String toString() {
        return "VRwzbYyjcMachinedetail{" +
        "machineCode=" + machineCode +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        "}";
    }
}

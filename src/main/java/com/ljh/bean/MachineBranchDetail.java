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
public class MachineBranchDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 机器编码
     */
    private String machineCode;

    /**
     * 项目类别
     */
    @TableId(value = "TYPE_ID", type = IdType.AUTO)
    private String typeId;

    /**
     * 类别名称
     */
    private String typeName;

    /**
     * 是否有效
     */
    private String isvalid;

    /**
     * 操作员
     */
    private String opercode;

    /**
     * 操作时间
     */
    private LocalDateTime operdate;


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

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    @Override
    public String toString() {
        return "MachineBranchDetail{" +
        "machineCode=" + machineCode +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        ", isvalid=" + isvalid +
        ", opercode=" + opercode +
        ", operdate=" + operdate +
        "}";
    }
}

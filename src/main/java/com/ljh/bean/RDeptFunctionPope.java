package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医院科室功能权限设置表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDeptFunctionPope implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室功能分类编码
     */
    @TableId(value = "DEPT_FUNCTIONCODE", type = IdType.AUTO)
    private String deptFunctioncode;

    /**
     * 系统功能组编码
     */
    private String functionGroupcode;

    /**
     * 操作人员ID
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatortime;


    public String getDeptFunctioncode() {
        return deptFunctioncode;
    }

    public void setDeptFunctioncode(String deptFunctioncode) {
        this.deptFunctioncode = deptFunctioncode;
    }

    public String getFunctionGroupcode() {
        return functionGroupcode;
    }

    public void setFunctionGroupcode(String functionGroupcode) {
        this.functionGroupcode = functionGroupcode;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "RDeptFunctionPope{" +
        "deptFunctioncode=" + deptFunctioncode +
        ", functionGroupcode=" + functionGroupcode +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 发药种类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class StorgeVsDrugtype implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * OPER_DTIME
     */
    private LocalDateTime operDtime;

    /**
     * FEE_CODE
     */
    @TableId(value = "FEE_CODE", type = IdType.AUTO)
    private String feeCode;

    /**
     * DEPT_CODE
     */
    private String deptCode;

    /**
     * OPER_CODE
     */
    private String operCode;

    /**
     * OPER_NAME
     */
    private String operName;


    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Override
    public String toString() {
        return "StorgeVsDrugtype{" +
        "operDtime=" + operDtime +
        ", feeCode=" + feeCode +
        ", deptCode=" + deptCode +
        ", operCode=" + operCode +
        ", operName=" + operName +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 看诊结果科室表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdSeeresultdept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 结果编码
     */
    @TableId(value = "RESULT_CODE", type = IdType.AUTO)
    private String resultCode;

    /**
     * 科室编码
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 顺序号
     */
    private Integer deptOrder;


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
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

    public Integer getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(Integer deptOrder) {
        this.deptOrder = deptOrder;
    }

    @Override
    public String toString() {
        return "OrdSeeresultdept{" +
        "resultCode=" + resultCode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", deptOrder=" + deptOrder +
        "}";
    }
}

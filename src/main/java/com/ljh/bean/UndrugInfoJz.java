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
public class UndrugInfoJz implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "UNDRUG_CODE", type = IdType.AUTO)
    private String undrugCode;

    private String undrugName;

    private String deptCode;

    private String deptName;

    private String invoName;

    private LocalDateTime operDate;

    private String operCode;

    /**
     * 0急诊项目，2急诊项目在科室树kkljzxm下的门诊科室可以开立，1门诊项目，3预留
     */
    private String flag;


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

    public String getInvoName() {
        return invoName;
    }

    public void setInvoName(String invoName) {
        this.invoName = invoName;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "UndrugInfoJz{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", invoName=" + invoName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", flag=" + flag +
        "}";
    }
}

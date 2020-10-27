package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号科室功能维护
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RegisterdeptInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 挂号科室
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 是否打印挂号小票 0 不打印 1 打印
     */
    private String printFlag;

    /**
     * 病历领取通知 0不通知 1通知
     */
    private String caseHistoryFlag;

    /**
     * 操作人
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 挂专家号是否必须输入医师
     */
    private String expertFlag;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag;
    }

    public String getCaseHistoryFlag() {
        return caseHistoryFlag;
    }

    public void setCaseHistoryFlag(String caseHistoryFlag) {
        this.caseHistoryFlag = caseHistoryFlag;
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

    public String getExpertFlag() {
        return expertFlag;
    }

    public void setExpertFlag(String expertFlag) {
        this.expertFlag = expertFlag;
    }

    @Override
    public String toString() {
        return "RegisterdeptInfo{" +
        "deptCode=" + deptCode +
        ", printFlag=" + printFlag +
        ", caseHistoryFlag=" + caseHistoryFlag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", expertFlag=" + expertFlag +
        "}";
    }
}

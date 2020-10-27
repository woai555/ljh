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
public class RegisterdeptInfoXiny implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String printFlag;

    private String caseHistoryFlag;

    private String operCode;

    private LocalDateTime operDate;

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
        return "RegisterdeptInfoXiny{" +
        "deptCode=" + deptCode +
        ", printFlag=" + printFlag +
        ", caseHistoryFlag=" + caseHistoryFlag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", expertFlag=" + expertFlag +
        "}";
    }
}

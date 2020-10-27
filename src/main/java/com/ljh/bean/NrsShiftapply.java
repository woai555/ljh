package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 转科申请表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsShiftapply implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院流水号
     */
    private String inpatientNo;

    /**
     * 发生序号
     */
    private Integer happenNo;

    /**
     * 原来科室
     */
    private String oldDeptCode;

    /**
     * 原来科室名称
     */
    private String oldDeptName;

    /**
     * 转往科室
     */
    private String newDeptCode;

    /**
     * 转往科室名称
     */
    private String newDeptName;

    /**
     * 转科原因
     */
    private String shiftCause;

    /**
     * 当前状态,1转科申请,2确认,3取消申请
     */
    private String shiftState;

    /**
     * 转科确认时间
     */
    private LocalDateTime confirmDate;

    /**
     * 确认人
     */
    private String confirmCode;

    /**
     * 申请人
     */
    private String operCode;

    /**
     * 申请时间
     */
    private LocalDateTime operDtime;

    /**
     * 取消申请时间
     */
    private LocalDateTime cancelDate;

    /**
     * 取消人
     */
    private String cancelCode;

    /**
     * 护理站代码
     */
    private String nurseCellCode;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public Integer getHappenNo() {
        return happenNo;
    }

    public void setHappenNo(Integer happenNo) {
        this.happenNo = happenNo;
    }

    public String getOldDeptCode() {
        return oldDeptCode;
    }

    public void setOldDeptCode(String oldDeptCode) {
        this.oldDeptCode = oldDeptCode;
    }

    public String getOldDeptName() {
        return oldDeptName;
    }

    public void setOldDeptName(String oldDeptName) {
        this.oldDeptName = oldDeptName;
    }

    public String getNewDeptCode() {
        return newDeptCode;
    }

    public void setNewDeptCode(String newDeptCode) {
        this.newDeptCode = newDeptCode;
    }

    public String getNewDeptName() {
        return newDeptName;
    }

    public void setNewDeptName(String newDeptName) {
        this.newDeptName = newDeptName;
    }

    public String getShiftCause() {
        return shiftCause;
    }

    public void setShiftCause(String shiftCause) {
        this.shiftCause = shiftCause;
    }

    public String getShiftState() {
        return shiftState;
    }

    public void setShiftState(String shiftState) {
        this.shiftState = shiftState;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelCode() {
        return cancelCode;
    }

    public void setCancelCode(String cancelCode) {
        this.cancelCode = cancelCode;
    }

    public String getNurseCellCode() {
        return nurseCellCode;
    }

    public void setNurseCellCode(String nurseCellCode) {
        this.nurseCellCode = nurseCellCode;
    }

    @Override
    public String toString() {
        return "NrsShiftapply{" +
        "inpatientNo=" + inpatientNo +
        ", happenNo=" + happenNo +
        ", oldDeptCode=" + oldDeptCode +
        ", oldDeptName=" + oldDeptName +
        ", newDeptCode=" + newDeptCode +
        ", newDeptName=" + newDeptName +
        ", shiftCause=" + shiftCause +
        ", shiftState=" + shiftState +
        ", confirmDate=" + confirmDate +
        ", confirmCode=" + confirmCode +
        ", operCode=" + operCode +
        ", operDtime=" + operDtime +
        ", cancelDate=" + cancelDate +
        ", cancelCode=" + cancelCode +
        ", nurseCellCode=" + nurseCellCode +
        "}";
    }
}

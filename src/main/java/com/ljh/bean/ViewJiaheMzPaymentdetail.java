package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewJiaheMzPaymentdetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String actId;

    private String patientId;

    private String outpId;

    private String staffEmployee;

    private String staffEmployeeName;

    private String staffDepartment;

    private String staffDepartmentName;

    private BigDecimal paymentFee;

    private LocalDateTime paymentTime;

    private String paymentMethod;

    private String paymentMethodName;

    private String payoffItem;

    private String payoffItemName;

    private String payoffItemDl;

    private String payoffItemDlName;

    private String visitType;


    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public String getStaffEmployee() {
        return staffEmployee;
    }

    public void setStaffEmployee(String staffEmployee) {
        this.staffEmployee = staffEmployee;
    }

    public String getStaffEmployeeName() {
        return staffEmployeeName;
    }

    public void setStaffEmployeeName(String staffEmployeeName) {
        this.staffEmployeeName = staffEmployeeName;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getStaffDepartmentName() {
        return staffDepartmentName;
    }

    public void setStaffDepartmentName(String staffDepartmentName) {
        this.staffDepartmentName = staffDepartmentName;
    }

    public BigDecimal getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(BigDecimal paymentFee) {
        this.paymentFee = paymentFee;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public String getPayoffItem() {
        return payoffItem;
    }

    public void setPayoffItem(String payoffItem) {
        this.payoffItem = payoffItem;
    }

    public String getPayoffItemName() {
        return payoffItemName;
    }

    public void setPayoffItemName(String payoffItemName) {
        this.payoffItemName = payoffItemName;
    }

    public String getPayoffItemDl() {
        return payoffItemDl;
    }

    public void setPayoffItemDl(String payoffItemDl) {
        this.payoffItemDl = payoffItemDl;
    }

    public String getPayoffItemDlName() {
        return payoffItemDlName;
    }

    public void setPayoffItemDlName(String payoffItemDlName) {
        this.payoffItemDlName = payoffItemDlName;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzPaymentdetail{" +
        "actId=" + actId +
        ", patientId=" + patientId +
        ", outpId=" + outpId +
        ", staffEmployee=" + staffEmployee +
        ", staffEmployeeName=" + staffEmployeeName +
        ", staffDepartment=" + staffDepartment +
        ", staffDepartmentName=" + staffDepartmentName +
        ", paymentFee=" + paymentFee +
        ", paymentTime=" + paymentTime +
        ", paymentMethod=" + paymentMethod +
        ", paymentMethodName=" + paymentMethodName +
        ", payoffItem=" + payoffItem +
        ", payoffItemName=" + payoffItemName +
        ", payoffItemDl=" + payoffItemDl +
        ", payoffItemDlName=" + payoffItemDlName +
        ", visitType=" + visitType +
        "}";
    }
}

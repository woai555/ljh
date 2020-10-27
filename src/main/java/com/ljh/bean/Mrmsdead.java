package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 死亡纪录档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsdead implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院流水号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 住院病历号
     */
    private String patientNo;

    /**
     * 门诊病历号
     */
    private String cardNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 死亡日期
     */
    private LocalDateTime deadDate;

    /**
     * 报出日期
     */
    private LocalDateTime operDate;

    /**
     * 死亡原因
     */
    private String deadReason;

    /**
     * 操作者代码
     */
    private String operCode;

    /**
     * 操作者姓名
     */
    private String operName;

    /**
     * 抢救措施1
     */
    private String method1;

    /**
     * 抢救措施2
     */
    private String method2;

    /**
     * 抢救措施3
     */
    private String method3;

    /**
     * 死亡通知单号
     */
    private String deadNo;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(LocalDateTime deadDate) {
        this.deadDate = deadDate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getDeadReason() {
        return deadReason;
    }

    public void setDeadReason(String deadReason) {
        this.deadReason = deadReason;
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

    public String getMethod1() {
        return method1;
    }

    public void setMethod1(String method1) {
        this.method1 = method1;
    }

    public String getMethod2() {
        return method2;
    }

    public void setMethod2(String method2) {
        this.method2 = method2;
    }

    public String getMethod3() {
        return method3;
    }

    public void setMethod3(String method3) {
        this.method3 = method3;
    }

    public String getDeadNo() {
        return deadNo;
    }

    public void setDeadNo(String deadNo) {
        this.deadNo = deadNo;
    }

    @Override
    public String toString() {
        return "Mrmsdead{" +
        "inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", deadDate=" + deadDate +
        ", operDate=" + operDate +
        ", deadReason=" + deadReason +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", method1=" + method1 +
        ", method2=" + method2 +
        ", method3=" + method3 +
        ", deadNo=" + deadNo +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病历领取通知
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RCliniccaseInformprint implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 门诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 挂号日期
     */
    private LocalDateTime regDate;

    /**
     * 姓名
     */
    private String name;

    /**
     * 挂号科室代码
     */
    private String deptCode;

    /**
     * 挂号科室名称
     */
    private String deptName;

    /**
     * 打印状态（0：未打印；1：已打印；2：取消）
     */
    private String printStatic;

    /**
     * 打印时间
     */
    private LocalDateTime printDate;

    /**
     * 取消时间
     */
    private LocalDateTime cancelDate;

    /**
     * 门诊病历号
     */
    private String clinicNo;

    /**
     * 看诊日期
     */
    private LocalDateTime seeDate;

    /**
     * 看诊午别
     */
    private String noonCode;

    /**
     * 看诊序号
     */
    private BigDecimal seeno;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPrintStatic() {
        return printStatic;
    }

    public void setPrintStatic(String printStatic) {
        this.printStatic = printStatic;
    }

    public LocalDateTime getPrintDate() {
        return printDate;
    }

    public void setPrintDate(LocalDateTime printDate) {
        this.printDate = printDate;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public BigDecimal getSeeno() {
        return seeno;
    }

    public void setSeeno(BigDecimal seeno) {
        this.seeno = seeno;
    }

    @Override
    public String toString() {
        return "RCliniccaseInformprint{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", name=" + name +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", printStatic=" + printStatic +
        ", printDate=" + printDate +
        ", cancelDate=" + cancelDate +
        ", clinicNo=" + clinicNo +
        ", seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", seeno=" + seeno +
        "}";
    }
}

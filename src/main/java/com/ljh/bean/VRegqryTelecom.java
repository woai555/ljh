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
public class VRegqryTelecom implements Serializable {

    private static final long serialVersionUID=1L;

    private String orderId;

    private String idenno;

    private String name;

    private String sexCode;

    private LocalDateTime bookDate;

    private String noonCode;

    private String ifReg;

    private String deptCode;

    private String deptName;

    private String reglevlCode;

    private String reglevlName;

    private String doctCode;

    private String doctName;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public LocalDateTime getBookDate() {
        return bookDate;
    }

    public void setBookDate(LocalDateTime bookDate) {
        this.bookDate = bookDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getIfReg() {
        return ifReg;
    }

    public void setIfReg(String ifReg) {
        this.ifReg = ifReg;
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

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    @Override
    public String toString() {
        return "VRegqryTelecom{" +
        "orderId=" + orderId +
        ", idenno=" + idenno +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", bookDate=" + bookDate +
        ", noonCode=" + noonCode +
        ", ifReg=" + ifReg +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", doctCode=" + doctCode +
        ", doctName=" + doctName +
        "}";
    }
}

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
public class ViewJhPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String deptName;

    private String reglevlName;

    private String cs;

    private LocalDateTime regDate;

    private String clinicNo;

    private String name;

    private String sexName;

    private LocalDateTime birthday;

    private String idenno;

    private String dist;

    private String home;

    private String homeTel;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    @Override
    public String toString() {
        return "ViewJhPatient{" +
        "cardNo=" + cardNo +
        ", deptName=" + deptName +
        ", reglevlName=" + reglevlName +
        ", cs=" + cs +
        ", regDate=" + regDate +
        ", clinicNo=" + clinicNo +
        ", name=" + name +
        ", sexName=" + sexName +
        ", birthday=" + birthday +
        ", idenno=" + idenno +
        ", dist=" + dist +
        ", home=" + home +
        ", homeTel=" + homeTel +
        "}";
    }
}

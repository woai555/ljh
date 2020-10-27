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
public class VEmregJzlgTzjl implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    private String tzjl;

    private String name;

    private String sexCode;

    private BigDecimal age;

    private String idenno;

    private String homeTel;

    private String tz;

    private String bloodPressure;

    private String xt;

    private String xl;


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

    public String getTzjl() {
        return tzjl;
    }

    public void setTzjl(String tzjl) {
        this.tzjl = tzjl;
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

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getXt() {
        return xt;
    }

    public void setXt(String xt) {
        this.xt = xt;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    @Override
    public String toString() {
        return "VEmregJzlgTzjl{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", tzjl=" + tzjl +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", age=" + age +
        ", idenno=" + idenno +
        ", homeTel=" + homeTel +
        ", tz=" + tz +
        ", bloodPressure=" + bloodPressure +
        ", xt=" + xt +
        ", xl=" + xl +
        "}";
    }
}

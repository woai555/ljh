package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 京医通患者基本信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class JytPersoninfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 京医通卡物理序列号
     */
    private String cardsn;

    /**
     * 京医通卡号(非医院门诊卡号)
     */
    @TableId(value = "CARDNO", type = IdType.AUTO)
    private String cardno;

    /**
     * 医联码
     */
    private String medicalalliancecode;

    /**
     * 证件类型
     */
    private String idtype;

    /**
     * 证件号码
     */
    private String idno;

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
     * 民族
     */
    private String nationality;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 证件住址
     */
    private String recordaddress;

    /**
     * 现住址
     */
    private String presentaddress;

    /**
     * 最后一次交易前账户余额
     */
    private BigDecimal balance;

    /**
     * 卡状态0正常1锁卡
     */
    private Integer cardstatus;


    public String getCardsn() {
        return cardsn;
    }

    public void setCardsn(String cardsn) {
        this.cardsn = cardsn;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getMedicalalliancecode() {
        return medicalalliancecode;
    }

    public void setMedicalalliancecode(String medicalalliancecode) {
        this.medicalalliancecode = medicalalliancecode;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRecordaddress() {
        return recordaddress;
    }

    public void setRecordaddress(String recordaddress) {
        this.recordaddress = recordaddress;
    }

    public String getPresentaddress() {
        return presentaddress;
    }

    public void setPresentaddress(String presentaddress) {
        this.presentaddress = presentaddress;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(Integer cardstatus) {
        this.cardstatus = cardstatus;
    }

    @Override
    public String toString() {
        return "JytPersoninfo{" +
        "cardsn=" + cardsn +
        ", cardno=" + cardno +
        ", medicalalliancecode=" + medicalalliancecode +
        ", idtype=" + idtype +
        ", idno=" + idno +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", nationality=" + nationality +
        ", phone=" + phone +
        ", recordaddress=" + recordaddress +
        ", presentaddress=" + presentaddress +
        ", balance=" + balance +
        ", cardstatus=" + cardstatus +
        "}";
    }
}

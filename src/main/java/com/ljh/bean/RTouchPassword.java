package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 触屏密码表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RTouchPassword implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 病历号
     */
    private String cardNo;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 密码
     */
    private String password;


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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RTouchPassword{" +
        "patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", patientName=" + patientName +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", password=" + password +
        "}";
    }
}

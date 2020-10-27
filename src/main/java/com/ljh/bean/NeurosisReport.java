package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 精神病报告卡
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NeurosisReport implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 报卡类别 1新诊断 2复发病人
     */
    private String baokaType;

    /**
     * 卡片编号
     */
    @TableId(value = "CARD_NUMBER", type = IdType.AUTO)
    private String cardNumber;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 联系人姓名
     */
    private String lianxirenName;

    /**
     * 联系人电话
     */
    private String lianxirenTel;

    /**
     * 性别 1男 2女
     */
    private String sex;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 工作单位
     */
    private String company;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 人员属地 1本市 2非本市 3临时来京 4外籍
     */
    private String patientShudi;

    /**
     * 现住址(省)
     */
    private String addressSheng;

    /**
     * 现住址(市)
     */
    private String addressShi;

    /**
     * 现住址(区)
     */
    private String addressQu;

    /**
     * 现住址
     */
    private String address;

    /**
     * 身份证号
     */
    private String idNo;

    /**
     * 职业类别
     */
    private String zhiyeType;

    /**
     * 最初发病日期
     */
    private LocalDateTime zuichufabingDate;

    /**
     * 确诊日期
     */
    private LocalDateTime quezhenDate;

    /**
     * 确诊医院
     */
    private String quezhenyiyuan;

    /**
     * 疾病名称
     */
    private String jibingName;

    /**
     * 报告单位
     */
    private String baogaodanwei;

    /**
     * 报告单位联系电话
     */
    private String danweiTel;

    /**
     * 填卡医生
     */
    private String tiankayisheng;

    /**
     * 填卡日期
     */
    private LocalDateTime tiankaDate;

    /**
     * 卡片类别 1第一类 2第二类
     */
    private String cardType;

    /**
     * 患者卡号
     */
    private String patientNo;


    public String getBaokaType() {
        return baokaType;
    }

    public void setBaokaType(String baokaType) {
        this.baokaType = baokaType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getLianxirenName() {
        return lianxirenName;
    }

    public void setLianxirenName(String lianxirenName) {
        this.lianxirenName = lianxirenName;
    }

    public String getLianxirenTel() {
        return lianxirenTel;
    }

    public void setLianxirenTel(String lianxirenTel) {
        this.lianxirenTel = lianxirenTel;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPatientShudi() {
        return patientShudi;
    }

    public void setPatientShudi(String patientShudi) {
        this.patientShudi = patientShudi;
    }

    public String getAddressSheng() {
        return addressSheng;
    }

    public void setAddressSheng(String addressSheng) {
        this.addressSheng = addressSheng;
    }

    public String getAddressShi() {
        return addressShi;
    }

    public void setAddressShi(String addressShi) {
        this.addressShi = addressShi;
    }

    public String getAddressQu() {
        return addressQu;
    }

    public void setAddressQu(String addressQu) {
        this.addressQu = addressQu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getZhiyeType() {
        return zhiyeType;
    }

    public void setZhiyeType(String zhiyeType) {
        this.zhiyeType = zhiyeType;
    }

    public LocalDateTime getZuichufabingDate() {
        return zuichufabingDate;
    }

    public void setZuichufabingDate(LocalDateTime zuichufabingDate) {
        this.zuichufabingDate = zuichufabingDate;
    }

    public LocalDateTime getQuezhenDate() {
        return quezhenDate;
    }

    public void setQuezhenDate(LocalDateTime quezhenDate) {
        this.quezhenDate = quezhenDate;
    }

    public String getQuezhenyiyuan() {
        return quezhenyiyuan;
    }

    public void setQuezhenyiyuan(String quezhenyiyuan) {
        this.quezhenyiyuan = quezhenyiyuan;
    }

    public String getJibingName() {
        return jibingName;
    }

    public void setJibingName(String jibingName) {
        this.jibingName = jibingName;
    }

    public String getBaogaodanwei() {
        return baogaodanwei;
    }

    public void setBaogaodanwei(String baogaodanwei) {
        this.baogaodanwei = baogaodanwei;
    }

    public String getDanweiTel() {
        return danweiTel;
    }

    public void setDanweiTel(String danweiTel) {
        this.danweiTel = danweiTel;
    }

    public String getTiankayisheng() {
        return tiankayisheng;
    }

    public void setTiankayisheng(String tiankayisheng) {
        this.tiankayisheng = tiankayisheng;
    }

    public LocalDateTime getTiankaDate() {
        return tiankaDate;
    }

    public void setTiankaDate(LocalDateTime tiankaDate) {
        this.tiankaDate = tiankaDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    @Override
    public String toString() {
        return "NeurosisReport{" +
        "baokaType=" + baokaType +
        ", cardNumber=" + cardNumber +
        ", patientName=" + patientName +
        ", lianxirenName=" + lianxirenName +
        ", lianxirenTel=" + lianxirenTel +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", company=" + company +
        ", tel=" + tel +
        ", patientShudi=" + patientShudi +
        ", addressSheng=" + addressSheng +
        ", addressShi=" + addressShi +
        ", addressQu=" + addressQu +
        ", address=" + address +
        ", idNo=" + idNo +
        ", zhiyeType=" + zhiyeType +
        ", zuichufabingDate=" + zuichufabingDate +
        ", quezhenDate=" + quezhenDate +
        ", quezhenyiyuan=" + quezhenyiyuan +
        ", jibingName=" + jibingName +
        ", baogaodanwei=" + baogaodanwei +
        ", danweiTel=" + danweiTel +
        ", tiankayisheng=" + tiankayisheng +
        ", tiankaDate=" + tiankaDate +
        ", cardType=" + cardType +
        ", patientNo=" + patientNo +
        "}";
    }
}

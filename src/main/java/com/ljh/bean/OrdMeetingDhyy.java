package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特需门诊电话预约登记信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdMeetingDhyy implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    private BigDecimal orderId;

    /**
     * 保险公司
     */
    private String insuranceCo;

    /**
     * 登记时间
     */
    private LocalDateTime registerDate;

    /**
     * 登记人
     */
    private String registerOper;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
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
     * 身份证号
     */
    private String idenno;

    /**
     * 居住地
     */
    private String area;

    /**
     * 联系电话
     */
    private String linkTel;

    /**
     * 联系手机
     */
    private String linkMobile;

    /**
     * 预约专家
     */
    private String expert;

    /**
     * 到款金额
     */
    private BigDecimal payCost;

    /**
     * 到款时间
     */
    private LocalDateTime payDate;

    /**
     * 邮寄编号
     */
    private String deliveryCode;

    /**
     * 确认标记
     */
    private String confirmFlag;

    /**
     * 确认人
     */
    private String confirmOper;

    /**
     * 确认时间
     */
    private LocalDateTime confirmDate;

    /**
     * 确认看诊时间
     */
    private LocalDateTime seeDate;

    /**
     * 是否取消，'1'是'0'否
     */
    private String ynvalid;

    /**
     * 取消人
     */
    private String cancelOper;

    /**
     * 取消时间
     */
    private LocalDateTime cancelDate;

    /**
     * 星期
     */
    private String week;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 专家组号
     */
    private String regNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 备注选择其它时录入的内容
     */
    private String remarkContent;


    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public String getInsuranceCo() {
        return insuranceCo;
    }

    public void setInsuranceCo(String insuranceCo) {
        this.insuranceCo = insuranceCo;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterOper() {
        return registerOper;
    }

    public void setRegisterOper(String registerOper) {
        this.registerOper = registerOper;
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

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public String getLinkMobile() {
        return linkMobile;
    }

    public void setLinkMobile(String linkMobile) {
        this.linkMobile = linkMobile;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public LocalDateTime getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDateTime payDate) {
        this.payDate = payDate;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public String getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(String confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public String getConfirmOper() {
        return confirmOper;
    }

    public void setConfirmOper(String confirmOper) {
        this.confirmOper = confirmOper;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    public String getCancelOper() {
        return cancelOper;
    }

    public void setCancelOper(String cancelOper) {
        this.cancelOper = cancelOper;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    @Override
    public String toString() {
        return "OrdMeetingDhyy{" +
        "orderId=" + orderId +
        ", insuranceCo=" + insuranceCo +
        ", registerDate=" + registerDate +
        ", registerOper=" + registerOper +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", sex=" + sex +
        ", idenno=" + idenno +
        ", area=" + area +
        ", linkTel=" + linkTel +
        ", linkMobile=" + linkMobile +
        ", expert=" + expert +
        ", payCost=" + payCost +
        ", payDate=" + payDate +
        ", deliveryCode=" + deliveryCode +
        ", confirmFlag=" + confirmFlag +
        ", confirmOper=" + confirmOper +
        ", confirmDate=" + confirmDate +
        ", seeDate=" + seeDate +
        ", ynvalid=" + ynvalid +
        ", cancelOper=" + cancelOper +
        ", cancelDate=" + cancelDate +
        ", week=" + week +
        ", noonCode=" + noonCode +
        ", regNo=" + regNo +
        ", remark=" + remark +
        ", remarkContent=" + remarkContent +
        "}";
    }
}

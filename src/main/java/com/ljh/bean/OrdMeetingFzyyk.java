package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特需门诊复诊预约卡登记信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdMeetingFzyyk implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    private BigDecimal orderId;

    /**
     * 预约卡号
     */
    @TableId(value = "YY_CARDNO", type = IdType.AUTO)
    private String yyCardno;

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
     * 居住地，对应r_province
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
     * 专家姓名
     */
    private String expert;

    /**
     * 预交挂号费
     */
    private BigDecimal prepayCost;

    /**
     * 确认标记，'0'未，'1'已
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
     * 计划看诊日期
     */
    private LocalDateTime meetDate;

    /**
     * 确认看诊日期
     */
    private LocalDateTime seeDate;

    /**
     * 是否有效
     */
    private String ynvalid;

    /**
     * 作废人
     */
    private String cancelOper;

    /**
     * 作废时间
     */
    private LocalDateTime cancelDate;


    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public String getYyCardno() {
        return yyCardno;
    }

    public void setYyCardno(String yyCardno) {
        this.yyCardno = yyCardno;
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

    public BigDecimal getPrepayCost() {
        return prepayCost;
    }

    public void setPrepayCost(BigDecimal prepayCost) {
        this.prepayCost = prepayCost;
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

    public LocalDateTime getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(LocalDateTime meetDate) {
        this.meetDate = meetDate;
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

    @Override
    public String toString() {
        return "OrdMeetingFzyyk{" +
        "orderId=" + orderId +
        ", yyCardno=" + yyCardno +
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
        ", prepayCost=" + prepayCost +
        ", confirmFlag=" + confirmFlag +
        ", confirmOper=" + confirmOper +
        ", confirmDate=" + confirmDate +
        ", meetDate=" + meetDate +
        ", seeDate=" + seeDate +
        ", ynvalid=" + ynvalid +
        ", cancelOper=" + cancelOper +
        ", cancelDate=" + cancelDate +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 短信发送明细
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SmsSendDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 短信记录编码
     */
    @TableId(value = "SMS_NO", type = IdType.AUTO)
    private String smsNo;

    /**
     * 手机号
     */
    private String telphone;

    /**
     * 姓名
     */
    private String name;

    /**
     * 发送内容
     */
    private String smsDetail;

    /**
     * 预计发送时间
     */
    private LocalDateTime sendTime;

    /**
     * 是否已发送  0未发送  1已发送
     */
    private BigDecimal ynsend;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 操作时间
     */
    private LocalDateTime opertime;

    /**
     * 短信平台返回XML
     */
    private String substatdes;

    /**
     * 是否处理成功 1成功 -1错误 错误时看错误代码
     */
    private String substat;

    /**
     * if saved in 10.100.100.47
     */
    private String yntrans;


    public String getSmsNo() {
        return smsNo;
    }

    public void setSmsNo(String smsNo) {
        this.smsNo = smsNo;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmsDetail() {
        return smsDetail;
    }

    public void setSmsDetail(String smsDetail) {
        this.smsDetail = smsDetail;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public BigDecimal getYnsend() {
        return ynsend;
    }

    public void setYnsend(BigDecimal ynsend) {
        this.ynsend = ynsend;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getOpertime() {
        return opertime;
    }

    public void setOpertime(LocalDateTime opertime) {
        this.opertime = opertime;
    }

    public String getSubstatdes() {
        return substatdes;
    }

    public void setSubstatdes(String substatdes) {
        this.substatdes = substatdes;
    }

    public String getSubstat() {
        return substat;
    }

    public void setSubstat(String substat) {
        this.substat = substat;
    }

    public String getYntrans() {
        return yntrans;
    }

    public void setYntrans(String yntrans) {
        this.yntrans = yntrans;
    }

    @Override
    public String toString() {
        return "SmsSendDetail{" +
        "smsNo=" + smsNo +
        ", telphone=" + telphone +
        ", name=" + name +
        ", smsDetail=" + smsDetail +
        ", sendTime=" + sendTime +
        ", ynsend=" + ynsend +
        ", operator=" + operator +
        ", opertime=" + opertime +
        ", substatdes=" + substatdes +
        ", substat=" + substat +
        ", yntrans=" + yntrans +
        "}";
    }
}

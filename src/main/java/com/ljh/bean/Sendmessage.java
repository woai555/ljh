package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class Sendmessage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "SENDMESSAGE_CODE", type = IdType.AUTO)
    private BigDecimal sendmessageCode;

    /**
     * 病区代码
     */
    private String wardCode;

    /**
     * 发送的机器
     */
    private String sendComputer;

    /**
     * 本地的标识
     */
    private String localFlag;

    /**
     * 发送标识
     */
    private String sendFlag;


    public BigDecimal getSendmessageCode() {
        return sendmessageCode;
    }

    public void setSendmessageCode(BigDecimal sendmessageCode) {
        this.sendmessageCode = sendmessageCode;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getSendComputer() {
        return sendComputer;
    }

    public void setSendComputer(String sendComputer) {
        this.sendComputer = sendComputer;
    }

    public String getLocalFlag() {
        return localFlag;
    }

    public void setLocalFlag(String localFlag) {
        this.localFlag = localFlag;
    }

    public String getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag;
    }

    @Override
    public String toString() {
        return "Sendmessage{" +
        "sendmessageCode=" + sendmessageCode +
        ", wardCode=" + wardCode +
        ", sendComputer=" + sendComputer +
        ", localFlag=" + localFlag +
        ", sendFlag=" + sendFlag +
        "}";
    }
}

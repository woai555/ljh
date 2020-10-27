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
public class RFactcodeRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 原实名号
     */
    private String oFactcode;

    /**
     * 现实名号
     */
    private String cFactcode;

    /**
     * 操作员
     */
    private String oper;

    /**
     * 操作时间
     */
    private LocalDateTime opDtime;


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

    public String getoFactcode() {
        return oFactcode;
    }

    public void setoFactcode(String oFactcode) {
        this.oFactcode = oFactcode;
    }

    public String getcFactcode() {
        return cFactcode;
    }

    public void setcFactcode(String cFactcode) {
        this.cFactcode = cFactcode;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public LocalDateTime getOpDtime() {
        return opDtime;
    }

    public void setOpDtime(LocalDateTime opDtime) {
        this.opDtime = opDtime;
    }

    @Override
    public String toString() {
        return "RFactcodeRecord{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", oFactcode=" + oFactcode +
        ", cFactcode=" + cFactcode +
        ", oper=" + oper +
        ", opDtime=" + opDtime +
        "}";
    }
}

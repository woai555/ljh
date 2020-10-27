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
public class RFactConsume implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    private String cardno;

    /**
     * 实名编号
     */
    private String factcode;

    /**
     * 姓名
     */
    private String name;

    /**
     * 操作员
     */
    private String oper;

    /**
     * 操作时间
     */
    private LocalDateTime opDtime;

    /**
     * 费用类别1挂号2收费
     */
    private String feetype;

    /**
     * 费用发生方式1收费2退费
     */
    private String transtype;

    /**
     * 金额
     */
    private BigDecimal cost;

    /**
     * 信息发送到实名系统成功与否1成功0失败
     */
    private String success;


    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getFactcode() {
        return factcode;
    }

    public void setFactcode(String factcode) {
        this.factcode = factcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "RFactConsume{" +
        "cardno=" + cardno +
        ", factcode=" + factcode +
        ", name=" + name +
        ", oper=" + oper +
        ", opDtime=" + opDtime +
        ", feetype=" + feetype +
        ", transtype=" + transtype +
        ", cost=" + cost +
        ", success=" + success +
        "}";
    }
}

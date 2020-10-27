package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 京医通患者交易信息（接口返回数据）
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class JytTradeinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 交易流水号
     */
    @TableId(value = "TRADENO", type = IdType.AUTO)
    private String tradeno;

    /**
     * 收费单据号（发票号）
     */
    private String feeno;

    /**
     * 交易类型0正交易2重打1退费交易
     */
    private String transtype;

    /**
     * 交易子类型0701正常缴费0702 预存金提取0703退卡预存金提取0603退费预存
     */
    private String tradesubclass;

    /**
     * 客户端类型1HIS2自助客户端3首信客户端
     */
    private String clienttype;

    /**
     * 费用总金额
     */
    private BigDecimal feeall;

    /**
     * 缴费前账户余额
     */
    private BigDecimal balancebefore;

    /**
     * 缴费后账户余额
     */
    private BigDecimal balanceafter;

    /**
     * 交易签名明文
     */
    private String plantext;

    /**
     * 交易签名
     */
    private String sign;

    /**
     * 医院门诊卡号
     */
    private String cardNo;

    /**
     * 京医通卡号
     */
    private String cardnoJyt;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 操作员编号
     */
    private String operid;

    /**
     * 操作员姓名
     */
    private String opername;

    /**
     * 首信系统交易日期
     */
    private LocalDateTime tradedate;

    /**
     * HIS系统交易日期
     */
    private LocalDateTime operDate;

    /**
     * 退费时被作废的原发票号
     */
    private String cancelFeeno;

    /**
     * 原交易流水号(用于退号)
     */
    private String tradenoOld;

    /**
     * 交易结果0未校验1成功2不成功(撤销交易)3挂起
     */
    private String tradestate;

    /**
     * 是否打印小票
     */
    private String printbill;

    /**
     * 校验失败后写cancel_flag = 1,退费时cancel_feeno不为空，此处记录补充金额标志为2
     */
    private String cancelFlag;


    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getFeeno() {
        return feeno;
    }

    public void setFeeno(String feeno) {
        this.feeno = feeno;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getTradesubclass() {
        return tradesubclass;
    }

    public void setTradesubclass(String tradesubclass) {
        this.tradesubclass = tradesubclass;
    }

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype;
    }

    public BigDecimal getFeeall() {
        return feeall;
    }

    public void setFeeall(BigDecimal feeall) {
        this.feeall = feeall;
    }

    public BigDecimal getBalancebefore() {
        return balancebefore;
    }

    public void setBalancebefore(BigDecimal balancebefore) {
        this.balancebefore = balancebefore;
    }

    public BigDecimal getBalanceafter() {
        return balanceafter;
    }

    public void setBalanceafter(BigDecimal balanceafter) {
        this.balanceafter = balanceafter;
    }

    public String getPlantext() {
        return plantext;
    }

    public void setPlantext(String plantext) {
        this.plantext = plantext;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public LocalDateTime getTradedate() {
        return tradedate;
    }

    public void setTradedate(LocalDateTime tradedate) {
        this.tradedate = tradedate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getCancelFeeno() {
        return cancelFeeno;
    }

    public void setCancelFeeno(String cancelFeeno) {
        this.cancelFeeno = cancelFeeno;
    }

    public String getTradenoOld() {
        return tradenoOld;
    }

    public void setTradenoOld(String tradenoOld) {
        this.tradenoOld = tradenoOld;
    }

    public String getTradestate() {
        return tradestate;
    }

    public void setTradestate(String tradestate) {
        this.tradestate = tradestate;
    }

    public String getPrintbill() {
        return printbill;
    }

    public void setPrintbill(String printbill) {
        this.printbill = printbill;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    @Override
    public String toString() {
        return "JytTradeinfo{" +
        "tradeno=" + tradeno +
        ", feeno=" + feeno +
        ", transtype=" + transtype +
        ", tradesubclass=" + tradesubclass +
        ", clienttype=" + clienttype +
        ", feeall=" + feeall +
        ", balancebefore=" + balancebefore +
        ", balanceafter=" + balanceafter +
        ", plantext=" + plantext +
        ", sign=" + sign +
        ", cardNo=" + cardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", patientName=" + patientName +
        ", operid=" + operid +
        ", opername=" + opername +
        ", tradedate=" + tradedate +
        ", operDate=" + operDate +
        ", cancelFeeno=" + cancelFeeno +
        ", tradenoOld=" + tradenoOld +
        ", tradestate=" + tradestate +
        ", printbill=" + printbill +
        ", cancelFlag=" + cancelFlag +
        "}";
    }
}

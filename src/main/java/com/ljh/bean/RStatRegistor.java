package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号员工作统计
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RStatRegistor implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计区间
     */
    private String statZone;

    /**
     * 统计时间
     */
    private LocalDateTime statDate;

    /**
     * 挂号员代号
     */
    private String emplCode;

    /**
     * 挂号员姓名
     */
    private String emplName;

    /**
     * 挂号级别
     */
    private String reglevlCode;

    /**
     * 挂号级别名称
     */
    private String reglevlName;

    /**
     * 预约人数
     */
    private Integer bookSum;

    /**
     * 人数
     */
    private Integer num;

    /**
     * 收入
     */
    private BigDecimal amt;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 现金
     */
    private BigDecimal cash;

    /**
     * 支票
     */
    private BigDecimal checkBill;

    /**
     * 帐户
     */
    private BigDecimal account;

    /**
     * 记帐
     */
    private BigDecimal debt;

    /**
     * 汇票
     */
    private BigDecimal exchange;

    /**
     * 医保统筹
     */
    private BigDecimal deptInsurance;

    /**
     * 医保帐户
     */
    private BigDecimal accountSi;

    /**
     * 退费
     */
    private Integer cancelSum;

    /**
     * 自费人数
     */
    private Integer ownNum;

    /**
     * 公费人数
     */
    private Integer pubNum;

    /**
     * 保险人数
     */
    private Integer siNum;

    /**
     * 检查费
     */
    private BigDecimal chckFee;

    /**
     * 检查费1
     */
    private BigDecimal chckFee1;

    /**
     * 其他费
     */
    private BigDecimal othFee;


    public String getStatZone() {
        return statZone;
    }

    public void setStatZone(String statZone) {
        this.statZone = statZone;
    }

    public LocalDateTime getStatDate() {
        return statDate;
    }

    public void setStatDate(LocalDateTime statDate) {
        this.statDate = statDate;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public Integer getBookSum() {
        return bookSum;
    }

    public void setBookSum(Integer bookSum) {
        this.bookSum = bookSum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getCheckBill() {
        return checkBill;
    }

    public void setCheckBill(BigDecimal checkBill) {
        this.checkBill = checkBill;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    public BigDecimal getExchange() {
        return exchange;
    }

    public void setExchange(BigDecimal exchange) {
        this.exchange = exchange;
    }

    public BigDecimal getDeptInsurance() {
        return deptInsurance;
    }

    public void setDeptInsurance(BigDecimal deptInsurance) {
        this.deptInsurance = deptInsurance;
    }

    public BigDecimal getAccountSi() {
        return accountSi;
    }

    public void setAccountSi(BigDecimal accountSi) {
        this.accountSi = accountSi;
    }

    public Integer getCancelSum() {
        return cancelSum;
    }

    public void setCancelSum(Integer cancelSum) {
        this.cancelSum = cancelSum;
    }

    public Integer getOwnNum() {
        return ownNum;
    }

    public void setOwnNum(Integer ownNum) {
        this.ownNum = ownNum;
    }

    public Integer getPubNum() {
        return pubNum;
    }

    public void setPubNum(Integer pubNum) {
        this.pubNum = pubNum;
    }

    public Integer getSiNum() {
        return siNum;
    }

    public void setSiNum(Integer siNum) {
        this.siNum = siNum;
    }

    public BigDecimal getChckFee() {
        return chckFee;
    }

    public void setChckFee(BigDecimal chckFee) {
        this.chckFee = chckFee;
    }

    public BigDecimal getChckFee1() {
        return chckFee1;
    }

    public void setChckFee1(BigDecimal chckFee1) {
        this.chckFee1 = chckFee1;
    }

    public BigDecimal getOthFee() {
        return othFee;
    }

    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    @Override
    public String toString() {
        return "RStatRegistor{" +
        "statZone=" + statZone +
        ", statDate=" + statDate +
        ", emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", bookSum=" + bookSum +
        ", num=" + num +
        ", amt=" + amt +
        ", operCode=" + operCode +
        ", cash=" + cash +
        ", checkBill=" + checkBill +
        ", account=" + account +
        ", debt=" + debt +
        ", exchange=" + exchange +
        ", deptInsurance=" + deptInsurance +
        ", accountSi=" + accountSi +
        ", cancelSum=" + cancelSum +
        ", ownNum=" + ownNum +
        ", pubNum=" + pubNum +
        ", siNum=" + siNum +
        ", chckFee=" + chckFee +
        ", chckFee1=" + chckFee1 +
        ", othFee=" + othFee +
        "}";
    }
}

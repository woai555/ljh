package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 科室挂号统计
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RStatDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计区间
     */
    @TableId(value = "STAT_ZONE", type = IdType.AUTO)
    private String statZone;

    /**
     * 统计时间
     */
    private LocalDateTime statDate;

    /**
     * 科室代号
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 挂号级别代号
     */
    private String reglevlCode;

    /**
     * 挂号级别名称
     */
    private String reglevlName;

    /**
     * 人数
     */
    private Integer num;

    /**
     * 收入
     */
    private Integer recnum;

    /**
     * 退号数
     */
    private Integer cancelSum;

    /**
     * 记帐
     */
    private BigDecimal debt;

    /**
     * 现金
     */
    private BigDecimal cash;

    /**
     * 保险帐户支付
     */
    private BigDecimal accountIs;

    /**
     * 帐户支付
     */
    private BigDecimal account;

    /**
     * AMT
     */
    private BigDecimal amt;

    /**
     * EMRNUM
     */
    private Integer emrnum;

    /**
     * REPNUM
     */
    private Integer repnum;

    /**
     * FIRNUM
     */
    private Integer firnum;

    /**
     * EMRCALNUM
     */
    private Integer emrcalnum;

    /**
     * REPCALNUM
     */
    private Integer repcalnum;

    /**
     * FIRCALNUM
     */
    private Integer fircalnum;

    /**
     * 操作员
     */
    private String operCode;

    private Integer bookSum;

    /**
     * 医保退号人数
     */
    private Integer sicancelnum;

    /**
     * 医保挂号人数
     */
    private Integer siregnum;

    /**
     * 省医保挂号人数
     */
    private Integer siregnumProvince;

    /**
     * 省医保退号人数
     */
    private Integer sicancelnumProvince;


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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getRecnum() {
        return recnum;
    }

    public void setRecnum(Integer recnum) {
        this.recnum = recnum;
    }

    public Integer getCancelSum() {
        return cancelSum;
    }

    public void setCancelSum(Integer cancelSum) {
        this.cancelSum = cancelSum;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getAccountIs() {
        return accountIs;
    }

    public void setAccountIs(BigDecimal accountIs) {
        this.accountIs = accountIs;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Integer getEmrnum() {
        return emrnum;
    }

    public void setEmrnum(Integer emrnum) {
        this.emrnum = emrnum;
    }

    public Integer getRepnum() {
        return repnum;
    }

    public void setRepnum(Integer repnum) {
        this.repnum = repnum;
    }

    public Integer getFirnum() {
        return firnum;
    }

    public void setFirnum(Integer firnum) {
        this.firnum = firnum;
    }

    public Integer getEmrcalnum() {
        return emrcalnum;
    }

    public void setEmrcalnum(Integer emrcalnum) {
        this.emrcalnum = emrcalnum;
    }

    public Integer getRepcalnum() {
        return repcalnum;
    }

    public void setRepcalnum(Integer repcalnum) {
        this.repcalnum = repcalnum;
    }

    public Integer getFircalnum() {
        return fircalnum;
    }

    public void setFircalnum(Integer fircalnum) {
        this.fircalnum = fircalnum;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public Integer getBookSum() {
        return bookSum;
    }

    public void setBookSum(Integer bookSum) {
        this.bookSum = bookSum;
    }

    public Integer getSicancelnum() {
        return sicancelnum;
    }

    public void setSicancelnum(Integer sicancelnum) {
        this.sicancelnum = sicancelnum;
    }

    public Integer getSiregnum() {
        return siregnum;
    }

    public void setSiregnum(Integer siregnum) {
        this.siregnum = siregnum;
    }

    public Integer getSiregnumProvince() {
        return siregnumProvince;
    }

    public void setSiregnumProvince(Integer siregnumProvince) {
        this.siregnumProvince = siregnumProvince;
    }

    public Integer getSicancelnumProvince() {
        return sicancelnumProvince;
    }

    public void setSicancelnumProvince(Integer sicancelnumProvince) {
        this.sicancelnumProvince = sicancelnumProvince;
    }

    @Override
    public String toString() {
        return "RStatDept{" +
        "statZone=" + statZone +
        ", statDate=" + statDate +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", num=" + num +
        ", recnum=" + recnum +
        ", cancelSum=" + cancelSum +
        ", debt=" + debt +
        ", cash=" + cash +
        ", accountIs=" + accountIs +
        ", account=" + account +
        ", amt=" + amt +
        ", emrnum=" + emrnum +
        ", repnum=" + repnum +
        ", firnum=" + firnum +
        ", emrcalnum=" + emrcalnum +
        ", repcalnum=" + repcalnum +
        ", fircalnum=" + fircalnum +
        ", operCode=" + operCode +
        ", bookSum=" + bookSum +
        ", sicancelnum=" + sicancelnum +
        ", siregnum=" + siregnum +
        ", siregnumProvince=" + siregnumProvince +
        ", sicancelnumProvince=" + sicancelnumProvince +
        "}";
    }
}

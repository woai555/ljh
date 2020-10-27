package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_ALLOPER_PEOPLE
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsAlloperPeople implements Serializable {

    private static final long serialVersionUID=1L;

    private String operDept;

    private BigDecimal operPeople;

    private BigDecimal zg04;

    private BigDecimal beforeOperdays;

    private BigDecimal piDays;

    private BigDecimal totCost;


    public String getOperDept() {
        return operDept;
    }

    public void setOperDept(String operDept) {
        this.operDept = operDept;
    }

    public BigDecimal getOperPeople() {
        return operPeople;
    }

    public void setOperPeople(BigDecimal operPeople) {
        this.operPeople = operPeople;
    }

    public BigDecimal getZg04() {
        return zg04;
    }

    public void setZg04(BigDecimal zg04) {
        this.zg04 = zg04;
    }

    public BigDecimal getBeforeOperdays() {
        return beforeOperdays;
    }

    public void setBeforeOperdays(BigDecimal beforeOperdays) {
        this.beforeOperdays = beforeOperdays;
    }

    public BigDecimal getPiDays() {
        return piDays;
    }

    public void setPiDays(BigDecimal piDays) {
        this.piDays = piDays;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    @Override
    public String toString() {
        return "ViewMrmsAlloperPeople{" +
        "operDept=" + operDept +
        ", operPeople=" + operPeople +
        ", zg04=" + zg04 +
        ", beforeOperdays=" + beforeOperdays +
        ", piDays=" + piDays +
        ", totCost=" + totCost +
        "}";
    }
}

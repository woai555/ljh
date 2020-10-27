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
public class SmsHqlisDetailTime implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "IPM_SQN", type = IdType.AUTO)
    private BigDecimal ipmSqn;

    private LocalDateTime operatortime;

    /**
     * 首次弹窗时间
     */
    private LocalDateTime firstOpenTime;

    /**
     * 首次弹窗时操作员
     */
    private String firstOpenOper;

    /**
     * 0 没弹过  1弹过
     */
    private BigDecimal firstOpen;


    public BigDecimal getIpmSqn() {
        return ipmSqn;
    }

    public void setIpmSqn(BigDecimal ipmSqn) {
        this.ipmSqn = ipmSqn;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public LocalDateTime getFirstOpenTime() {
        return firstOpenTime;
    }

    public void setFirstOpenTime(LocalDateTime firstOpenTime) {
        this.firstOpenTime = firstOpenTime;
    }

    public String getFirstOpenOper() {
        return firstOpenOper;
    }

    public void setFirstOpenOper(String firstOpenOper) {
        this.firstOpenOper = firstOpenOper;
    }

    public BigDecimal getFirstOpen() {
        return firstOpen;
    }

    public void setFirstOpen(BigDecimal firstOpen) {
        this.firstOpen = firstOpen;
    }

    @Override
    public String toString() {
        return "SmsHqlisDetailTime{" +
        "ipmSqn=" + ipmSqn +
        ", operatortime=" + operatortime +
        ", firstOpenTime=" + firstOpenTime +
        ", firstOpenOper=" + firstOpenOper +
        ", firstOpen=" + firstOpen +
        "}";
    }
}

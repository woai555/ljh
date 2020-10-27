package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 记录MZDJB清除痕迹信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RMzdjbClearInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 流水号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private BigDecimal id;

    /**
     * 清除痕迹的时间范围(开始时间)
     */
    private LocalDateTime fromDate;

    /**
     * 清除痕迹的时间范围(结束时间)
     */
    private LocalDateTime toDate;

    /**
     * 操作人
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "RMzdjbClearInfo{" +
        "id=" + id +
        ", fromDate=" + fromDate +
        ", toDate=" + toDate +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

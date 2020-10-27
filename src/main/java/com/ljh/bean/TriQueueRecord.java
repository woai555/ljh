package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 分诊队列记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TriQueueRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 所属分诊科室
     */
    private String triagedeptCode;

    /**
     * 日期
     */
    private String dateCode;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 分诊队列类别编码
     */
    @TableId(value = "QUEUE_CODE", type = IdType.AUTO)
    private String queueCode;

    /**
     * 分诊队列类别名称
     */
    private String queueName;

    /**
     * 分诊队列顺序号
     */
    private BigDecimal orderid;

    /**
     * 分诊队列说明
     */
    private String queueComemnt;

    /**
     * 分诊队列标志
     */
    private String queueFlag;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getTriagedeptCode() {
        return triagedeptCode;
    }

    public void setTriagedeptCode(String triagedeptCode) {
        this.triagedeptCode = triagedeptCode;
    }

    public String getDateCode() {
        return dateCode;
    }

    public void setDateCode(String dateCode) {
        this.dateCode = dateCode;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getQueueCode() {
        return queueCode;
    }

    public void setQueueCode(String queueCode) {
        this.queueCode = queueCode;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getQueueComemnt() {
        return queueComemnt;
    }

    public void setQueueComemnt(String queueComemnt) {
        this.queueComemnt = queueComemnt;
    }

    public String getQueueFlag() {
        return queueFlag;
    }

    public void setQueueFlag(String queueFlag) {
        this.queueFlag = queueFlag;
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
        return "TriQueueRecord{" +
        "triagedeptCode=" + triagedeptCode +
        ", dateCode=" + dateCode +
        ", noonCode=" + noonCode +
        ", queueCode=" + queueCode +
        ", queueName=" + queueName +
        ", orderid=" + orderid +
        ", queueComemnt=" + queueComemnt +
        ", queueFlag=" + queueFlag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

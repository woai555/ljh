package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 分诊队列类别维护
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TriQueueCode implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 所属分诊科室
     */
    @TableId(value = "TRIAGEDEPT_CODE", type = IdType.AUTO)
    private String triagedeptCode;

    /**
     * 分诊队列类别编码
     */
    private String queueCode;

    /**
     * 分诊队列类别名称
     */
    private String queueName;

    /**
     * 分诊队列排序
     */
    private BigDecimal orderid;

    /**
     * 分诊队列说明
     */
    private String queueComment;

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

    public String getQueueComment() {
        return queueComment;
    }

    public void setQueueComment(String queueComment) {
        this.queueComment = queueComment;
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
        return "TriQueueCode{" +
        "triagedeptCode=" + triagedeptCode +
        ", queueCode=" + queueCode +
        ", queueName=" + queueName +
        ", orderid=" + orderid +
        ", queueComment=" + queueComment +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医生常用项目维护(维护常用项目:用法,频次等)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdUsageIteminfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医生编码
     */
    @TableId(value = "DOCT_CODE", type = IdType.AUTO)
    private String doctCode;

    /**
     * 项目编码
     */
    private String itemCode;

    /**
     * 规格
     */
    private String specs;

    /**
     * 用法
     */
    private String usageCode;

    /**
     * 频次
     */
    private String frequencyCode;

    /**
     * 使用天数
     */
    private Integer days;

    /**
     * 维护人
     */
    private String operCode;

    /**
     * 维护时间
     */
    private LocalDateTime operDate;

    /**
     * 序号
     */
    private BigDecimal orderid;


    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public String getFrequencyCode() {
        return frequencyCode;
    }

    public void setFrequencyCode(String frequencyCode) {
        this.frequencyCode = frequencyCode;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
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

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "OrdUsageIteminfo{" +
        "doctCode=" + doctCode +
        ", itemCode=" + itemCode +
        ", specs=" + specs +
        ", usageCode=" + usageCode +
        ", frequencyCode=" + frequencyCode +
        ", days=" + days +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", orderid=" + orderid +
        "}";
    }
}

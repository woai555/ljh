package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 对于用法内的项目,根据单次剂量*频次*天数生成数量
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdUsageSetqty implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 流水号
     */
    private BigDecimal seqNo;

    /**
     * 项目编码
     */
    private String usageCode;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 作废标志
     */
    private String vaild;

    /**
     * 作废人
     */
    private String invaildOperCode;

    /**
     * 作废时间
     */
    private LocalDateTime invaildOperDate;


    public BigDecimal getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
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

    public String getVaild() {
        return vaild;
    }

    public void setVaild(String vaild) {
        this.vaild = vaild;
    }

    public String getInvaildOperCode() {
        return invaildOperCode;
    }

    public void setInvaildOperCode(String invaildOperCode) {
        this.invaildOperCode = invaildOperCode;
    }

    public LocalDateTime getInvaildOperDate() {
        return invaildOperDate;
    }

    public void setInvaildOperDate(LocalDateTime invaildOperDate) {
        this.invaildOperDate = invaildOperDate;
    }

    @Override
    public String toString() {
        return "OrdUsageSetqty{" +
        "seqNo=" + seqNo +
        ", usageCode=" + usageCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", vaild=" + vaild +
        ", invaildOperCode=" + invaildOperCode +
        ", invaildOperDate=" + invaildOperDate +
        "}";
    }
}

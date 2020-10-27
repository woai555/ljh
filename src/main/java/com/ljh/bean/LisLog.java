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
public class LisLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 错误代码
     */
    private String logCode;

    /**
     * 错误描述
     */
    private String logDetail;

    /**
     * 发生对象
     */
    private String logObjec;

    /**
     * 处方号
     */
    private String recipeno;

    /**
     * 流水号
     */
    private BigDecimal sequenceno;

    /**
     * 发生时间
     */
    @TableId(value = "OPER_DATE", type = IdType.AUTO)
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;


    public String getLogCode() {
        return logCode;
    }

    public void setLogCode(String logCode) {
        this.logCode = logCode;
    }

    public String getLogDetail() {
        return logDetail;
    }

    public void setLogDetail(String logDetail) {
        this.logDetail = logDetail;
    }

    public String getLogObjec() {
        return logObjec;
    }

    public void setLogObjec(String logObjec) {
        this.logObjec = logObjec;
    }

    public String getRecipeno() {
        return recipeno;
    }

    public void setRecipeno(String recipeno) {
        this.recipeno = recipeno;
    }

    public BigDecimal getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(BigDecimal sequenceno) {
        this.sequenceno = sequenceno;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "LisLog{" +
        "logCode=" + logCode +
        ", logDetail=" + logDetail +
        ", logObjec=" + logObjec +
        ", recipeno=" + recipeno +
        ", sequenceno=" + sequenceno +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

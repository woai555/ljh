package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 条形码打印
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RBarcodePrintRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 发生序号
     */
    @TableId(value = "HAPPEN_NO", type = IdType.AUTO)
    private Integer happenNo;

    /**
     * 打印类别（1：正常打印；2：补打）
     */
    private String printType;

    /**
     * 开始号码
     */
    private String startNo;

    /**
     * 结束号码
     */
    private String endNo;

    /**
     * 操作人代码
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;


    public Integer getHappenNo() {
        return happenNo;
    }

    public void setHappenNo(Integer happenNo) {
        this.happenNo = happenNo;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getStartNo() {
        return startNo;
    }

    public void setStartNo(String startNo) {
        this.startNo = startNo;
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(String endNo) {
        this.endNo = endNo;
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
        return "RBarcodePrintRecord{" +
        "happenNo=" + happenNo +
        ", printType=" + printType +
        ", startNo=" + startNo +
        ", endNo=" + endNo +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

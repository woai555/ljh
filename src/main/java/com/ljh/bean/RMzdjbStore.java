package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 设置药房是否发药
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RMzdjbStore implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 最小费用代码
     */
    private String feeCode;

    /**
     * 药柜编码
     */
    private String storeId;

    private String operCode;

    private LocalDateTime operDate;

    /**
     * 药房编码
     */
    private String deptCode;

    /**
     * 是否有效
     */
    private String value;


    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "RMzdjbStore{" +
        "feeCode=" + feeCode +
        ", storeId=" + storeId +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", deptCode=" + deptCode +
        ", value=" + value +
        "}";
    }
}

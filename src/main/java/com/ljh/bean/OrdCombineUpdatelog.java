package com.ljh.bean;

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
public class OrdCombineUpdatelog implements Serializable {

    private static final long serialVersionUID=1L;

    private String combCode;

    private String operCode;

    private LocalDateTime operDate;

    private LocalDateTime sysDate;


    public String getCombCode() {
        return combCode;
    }

    public void setCombCode(String combCode) {
        this.combCode = combCode;
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

    public LocalDateTime getSysDate() {
        return sysDate;
    }

    public void setSysDate(LocalDateTime sysDate) {
        this.sysDate = sysDate;
    }

    @Override
    public String toString() {
        return "OrdCombineUpdatelog{" +
        "combCode=" + combCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", sysDate=" + sysDate +
        "}";
    }
}

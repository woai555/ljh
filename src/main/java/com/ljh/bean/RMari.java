package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 婚姻代码表(R_MARI)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RMari implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 婚姻状况编号
     */
    @TableId(value = "MARI_CODE", type = IdType.AUTO)
    private String mariCode;

    /**
     * 婚姻状况
     */
    private String mari;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;


    public String getMariCode() {
        return mariCode;
    }

    public void setMariCode(String mariCode) {
        this.mariCode = mariCode;
    }

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
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
        return "RMari{" +
        "mariCode=" + mariCode +
        ", mari=" + mari +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

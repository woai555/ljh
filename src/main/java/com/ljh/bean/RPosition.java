package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 职务代码表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPosition implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 职务代号
     */
    @TableId(value = "POSI_CODE", type = IdType.AUTO)
    private String posiCode;

    /**
     * 职务名称
     */
    private String posiName;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;


    public String getPosiCode() {
        return posiCode;
    }

    public void setPosiCode(String posiCode) {
        this.posiCode = posiCode;
    }

    public String getPosiName() {
        return posiName;
    }

    public void setPosiName(String posiName) {
        this.posiName = posiName;
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
        return "RPosition{" +
        "posiCode=" + posiCode +
        ", posiName=" + posiName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

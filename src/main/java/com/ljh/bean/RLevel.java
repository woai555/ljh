package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 职级代码表(R_Level)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RLevel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 职级代号
     */
    @TableId(value = "LEVL_CODE", type = IdType.AUTO)
    private String levlCode;

    /**
     * 职级名称
     */
    private String levlName;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;


    public String getLevlCode() {
        return levlCode;
    }

    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public String getLevlName() {
        return levlName;
    }

    public void setLevlName(String levlName) {
        this.levlName = levlName;
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
        return "RLevel{" +
        "levlCode=" + levlCode +
        ", levlName=" + levlName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 关系代码档(R_Relative)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRelative implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 关系代号
     */
    @TableId(value = "RELA_CODE", type = IdType.AUTO)
    private String relaCode;

    /**
     * 关系名称
     */
    private String relaName;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;


    public String getRelaCode() {
        return relaCode;
    }

    public void setRelaCode(String relaCode) {
        this.relaCode = relaCode;
    }

    public String getRelaName() {
        return relaName;
    }

    public void setRelaName(String relaName) {
        this.relaName = relaName;
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
        return "RRelative{" +
        "relaCode=" + relaCode +
        ", relaName=" + relaName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

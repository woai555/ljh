package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 看诊类别代码表（R_SeeKind)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RSeekind implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊类别代号
     */
    @TableId(value = "SEEKIND_CODE", type = IdType.AUTO)
    private String seekindCode;

    /**
     * 看诊类别名称
     */
    private String seekindName;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;


    public String getSeekindCode() {
        return seekindCode;
    }

    public void setSeekindCode(String seekindCode) {
        this.seekindCode = seekindCode;
    }

    public String getSeekindName() {
        return seekindName;
    }

    public void setSeekindName(String seekindName) {
        this.seekindName = seekindName;
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
        return "RSeekind{" +
        "seekindCode=" + seekindCode +
        ", seekindName=" + seekindName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

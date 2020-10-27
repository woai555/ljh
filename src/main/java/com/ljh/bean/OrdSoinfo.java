package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 诊间医师常用诊断词汇表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdSoinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * SO
     */
    private String so;

    /**
     * 1。一级，2。二级，3。三级
     */
    private String soClass;

    /**
     * SO描述
     */
    private String soDetail;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;


    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getSoClass() {
        return soClass;
    }

    public void setSoClass(String soClass) {
        this.soClass = soClass;
    }

    public String getSoDetail() {
        return soDetail;
    }

    public void setSoDetail(String soDetail) {
        this.soDetail = soDetail;
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
        return "OrdSoinfo{" +
        "so=" + so +
        ", soClass=" + soClass +
        ", soDetail=" + soDetail +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

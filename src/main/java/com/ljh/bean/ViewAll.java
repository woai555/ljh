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
public class ViewAll implements Serializable {

    private static final long serialVersionUID=1L;

    private String 收费项目名称;

    private BigDecimal 收费数量;

    private BigDecimal 收费额;

    private String 收费项目编码;

    private String 计费单位;

    private String 规格;

    private LocalDateTime 收费日期;

    private String 收费对象;

    private String 记账凭证号码;

    private String 收费科室;


    public String get收费项目名称() {
        return 收费项目名称;
    }

    public void set收费项目名称(String 收费项目名称) {
        this.收费项目名称 = 收费项目名称;
    }

    public BigDecimal get收费数量() {
        return 收费数量;
    }

    public void set收费数量(BigDecimal 收费数量) {
        this.收费数量 = 收费数量;
    }

    public BigDecimal get收费额() {
        return 收费额;
    }

    public void set收费额(BigDecimal 收费额) {
        this.收费额 = 收费额;
    }

    public String get收费项目编码() {
        return 收费项目编码;
    }

    public void set收费项目编码(String 收费项目编码) {
        this.收费项目编码 = 收费项目编码;
    }

    public String get计费单位() {
        return 计费单位;
    }

    public void set计费单位(String 计费单位) {
        this.计费单位 = 计费单位;
    }

    public String get规格() {
        return 规格;
    }

    public void set规格(String 规格) {
        this.规格 = 规格;
    }

    public LocalDateTime get收费日期() {
        return 收费日期;
    }

    public void set收费日期(LocalDateTime 收费日期) {
        this.收费日期 = 收费日期;
    }

    public String get收费对象() {
        return 收费对象;
    }

    public void set收费对象(String 收费对象) {
        this.收费对象 = 收费对象;
    }

    public String get记账凭证号码() {
        return 记账凭证号码;
    }

    public void set记账凭证号码(String 记账凭证号码) {
        this.记账凭证号码 = 记账凭证号码;
    }

    public String get收费科室() {
        return 收费科室;
    }

    public void set收费科室(String 收费科室) {
        this.收费科室 = 收费科室;
    }

    @Override
    public String toString() {
        return "ViewAll{" +
        "收费项目名称=" + 收费项目名称 +
        ", 收费数量=" + 收费数量 +
        ", 收费额=" + 收费额 +
        ", 收费项目编码=" + 收费项目编码 +
        ", 计费单位=" + 计费单位 +
        ", 规格=" + 规格 +
        ", 收费日期=" + 收费日期 +
        ", 收费对象=" + 收费对象 +
        ", 记账凭证号码=" + 记账凭证号码 +
        ", 收费科室=" + 收费科室 +
        "}";
    }
}

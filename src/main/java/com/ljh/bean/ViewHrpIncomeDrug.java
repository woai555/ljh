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
public class ViewHrpIncomeDrug implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime 日期;

    private String 门诊;

    private String 收费编码;

    private String 标记;

    private String 物价代码;

    private String 核算归类编码;

    private String 会计核算分类编码;

    private String 统计分类编码;

    private String 病源分类编码;

    private String 人员编码;

    private String 从属科室编码;

    private String 病区编码;

    private BigDecimal 价格;

    private BigDecimal 金额;

    private BigDecimal 数量;

    private BigDecimal 处方记录数;

    private LocalDateTime 实际收费日期;

    private String 自费金额;

    private String 病人编码;

    private String 医嘱号;

    private String 操作耗时;


    public LocalDateTime get日期() {
        return 日期;
    }

    public void set日期(LocalDateTime 日期) {
        this.日期 = 日期;
    }

    public String get门诊() {
        return 门诊;
    }

    public void set门诊(String 门诊) {
        this.门诊 = 门诊;
    }

    public String get收费编码() {
        return 收费编码;
    }

    public void set收费编码(String 收费编码) {
        this.收费编码 = 收费编码;
    }

    public String get标记() {
        return 标记;
    }

    public void set标记(String 标记) {
        this.标记 = 标记;
    }

    public String get物价代码() {
        return 物价代码;
    }

    public void set物价代码(String 物价代码) {
        this.物价代码 = 物价代码;
    }

    public String get核算归类编码() {
        return 核算归类编码;
    }

    public void set核算归类编码(String 核算归类编码) {
        this.核算归类编码 = 核算归类编码;
    }

    public String get会计核算分类编码() {
        return 会计核算分类编码;
    }

    public void set会计核算分类编码(String 会计核算分类编码) {
        this.会计核算分类编码 = 会计核算分类编码;
    }

    public String get统计分类编码() {
        return 统计分类编码;
    }

    public void set统计分类编码(String 统计分类编码) {
        this.统计分类编码 = 统计分类编码;
    }

    public String get病源分类编码() {
        return 病源分类编码;
    }

    public void set病源分类编码(String 病源分类编码) {
        this.病源分类编码 = 病源分类编码;
    }

    public String get人员编码() {
        return 人员编码;
    }

    public void set人员编码(String 人员编码) {
        this.人员编码 = 人员编码;
    }

    public String get从属科室编码() {
        return 从属科室编码;
    }

    public void set从属科室编码(String 从属科室编码) {
        this.从属科室编码 = 从属科室编码;
    }

    public String get病区编码() {
        return 病区编码;
    }

    public void set病区编码(String 病区编码) {
        this.病区编码 = 病区编码;
    }

    public BigDecimal get价格() {
        return 价格;
    }

    public void set价格(BigDecimal 价格) {
        this.价格 = 价格;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    public BigDecimal get数量() {
        return 数量;
    }

    public void set数量(BigDecimal 数量) {
        this.数量 = 数量;
    }

    public BigDecimal get处方记录数() {
        return 处方记录数;
    }

    public void set处方记录数(BigDecimal 处方记录数) {
        this.处方记录数 = 处方记录数;
    }

    public LocalDateTime get实际收费日期() {
        return 实际收费日期;
    }

    public void set实际收费日期(LocalDateTime 实际收费日期) {
        this.实际收费日期 = 实际收费日期;
    }

    public String get自费金额() {
        return 自费金额;
    }

    public void set自费金额(String 自费金额) {
        this.自费金额 = 自费金额;
    }

    public String get病人编码() {
        return 病人编码;
    }

    public void set病人编码(String 病人编码) {
        this.病人编码 = 病人编码;
    }

    public String get医嘱号() {
        return 医嘱号;
    }

    public void set医嘱号(String 医嘱号) {
        this.医嘱号 = 医嘱号;
    }

    public String get操作耗时() {
        return 操作耗时;
    }

    public void set操作耗时(String 操作耗时) {
        this.操作耗时 = 操作耗时;
    }

    @Override
    public String toString() {
        return "ViewHrpIncomeDrug{" +
        "日期=" + 日期 +
        ", 门诊=" + 门诊 +
        ", 收费编码=" + 收费编码 +
        ", 标记=" + 标记 +
        ", 物价代码=" + 物价代码 +
        ", 核算归类编码=" + 核算归类编码 +
        ", 会计核算分类编码=" + 会计核算分类编码 +
        ", 统计分类编码=" + 统计分类编码 +
        ", 病源分类编码=" + 病源分类编码 +
        ", 人员编码=" + 人员编码 +
        ", 从属科室编码=" + 从属科室编码 +
        ", 病区编码=" + 病区编码 +
        ", 价格=" + 价格 +
        ", 金额=" + 金额 +
        ", 数量=" + 数量 +
        ", 处方记录数=" + 处方记录数 +
        ", 实际收费日期=" + 实际收费日期 +
        ", 自费金额=" + 自费金额 +
        ", 病人编码=" + 病人编码 +
        ", 医嘱号=" + 医嘱号 +
        ", 操作耗时=" + 操作耗时 +
        "}";
    }
}

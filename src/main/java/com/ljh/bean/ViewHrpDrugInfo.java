package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class ViewHrpDrugInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String 药品编码;

    private String 药品名称;

    private String 药品分类;

    private String 药理分类;

    private String 毒理分类;

    private String 剂型分类;

    private String 医保分类;

    private String 最小单位;

    private String 门诊包装单位与最小单位换算;

    private String 住院包装单位与最小单位换算;

    private BigDecimal 价格;

    private String 自费比例;

    private String 状态;

    private String 版本号;

    private String 启用时间;


    public String get药品编码() {
        return 药品编码;
    }

    public void set药品编码(String 药品编码) {
        this.药品编码 = 药品编码;
    }

    public String get药品名称() {
        return 药品名称;
    }

    public void set药品名称(String 药品名称) {
        this.药品名称 = 药品名称;
    }

    public String get药品分类() {
        return 药品分类;
    }

    public void set药品分类(String 药品分类) {
        this.药品分类 = 药品分类;
    }

    public String get药理分类() {
        return 药理分类;
    }

    public void set药理分类(String 药理分类) {
        this.药理分类 = 药理分类;
    }

    public String get毒理分类() {
        return 毒理分类;
    }

    public void set毒理分类(String 毒理分类) {
        this.毒理分类 = 毒理分类;
    }

    public String get剂型分类() {
        return 剂型分类;
    }

    public void set剂型分类(String 剂型分类) {
        this.剂型分类 = 剂型分类;
    }

    public String get医保分类() {
        return 医保分类;
    }

    public void set医保分类(String 医保分类) {
        this.医保分类 = 医保分类;
    }

    public String get最小单位() {
        return 最小单位;
    }

    public void set最小单位(String 最小单位) {
        this.最小单位 = 最小单位;
    }

    public String get门诊包装单位与最小单位换算() {
        return 门诊包装单位与最小单位换算;
    }

    public void set门诊包装单位与最小单位换算(String 门诊包装单位与最小单位换算) {
        this.门诊包装单位与最小单位换算 = 门诊包装单位与最小单位换算;
    }

    public String get住院包装单位与最小单位换算() {
        return 住院包装单位与最小单位换算;
    }

    public void set住院包装单位与最小单位换算(String 住院包装单位与最小单位换算) {
        this.住院包装单位与最小单位换算 = 住院包装单位与最小单位换算;
    }

    public BigDecimal get价格() {
        return 价格;
    }

    public void set价格(BigDecimal 价格) {
        this.价格 = 价格;
    }

    public String get自费比例() {
        return 自费比例;
    }

    public void set自费比例(String 自费比例) {
        this.自费比例 = 自费比例;
    }

    public String get状态() {
        return 状态;
    }

    public void set状态(String 状态) {
        this.状态 = 状态;
    }

    public String get版本号() {
        return 版本号;
    }

    public void set版本号(String 版本号) {
        this.版本号 = 版本号;
    }

    public String get启用时间() {
        return 启用时间;
    }

    public void set启用时间(String 启用时间) {
        this.启用时间 = 启用时间;
    }

    @Override
    public String toString() {
        return "ViewHrpDrugInfo{" +
        "药品编码=" + 药品编码 +
        ", 药品名称=" + 药品名称 +
        ", 药品分类=" + 药品分类 +
        ", 药理分类=" + 药理分类 +
        ", 毒理分类=" + 毒理分类 +
        ", 剂型分类=" + 剂型分类 +
        ", 医保分类=" + 医保分类 +
        ", 最小单位=" + 最小单位 +
        ", 门诊包装单位与最小单位换算=" + 门诊包装单位与最小单位换算 +
        ", 住院包装单位与最小单位换算=" + 住院包装单位与最小单位换算 +
        ", 价格=" + 价格 +
        ", 自费比例=" + 自费比例 +
        ", 状态=" + 状态 +
        ", 版本号=" + 版本号 +
        ", 启用时间=" + 启用时间 +
        "}";
    }
}

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
public class ViewHrpIncomePatient implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime 结算日期;

    private String 门诊;

    private String 患者卡号;

    private String 结算单位编码;

    private String 结算单位名称;

    private BigDecimal 费用金额;

    private String 账单号;

    private String 结算号;

    private String 病人号码;

    private String 标识;

    private String 费用类型;


    public LocalDateTime get结算日期() {
        return 结算日期;
    }

    public void set结算日期(LocalDateTime 结算日期) {
        this.结算日期 = 结算日期;
    }

    public String get门诊() {
        return 门诊;
    }

    public void set门诊(String 门诊) {
        this.门诊 = 门诊;
    }

    public String get患者卡号() {
        return 患者卡号;
    }

    public void set患者卡号(String 患者卡号) {
        this.患者卡号 = 患者卡号;
    }

    public String get结算单位编码() {
        return 结算单位编码;
    }

    public void set结算单位编码(String 结算单位编码) {
        this.结算单位编码 = 结算单位编码;
    }

    public String get结算单位名称() {
        return 结算单位名称;
    }

    public void set结算单位名称(String 结算单位名称) {
        this.结算单位名称 = 结算单位名称;
    }

    public BigDecimal get费用金额() {
        return 费用金额;
    }

    public void set费用金额(BigDecimal 费用金额) {
        this.费用金额 = 费用金额;
    }

    public String get账单号() {
        return 账单号;
    }

    public void set账单号(String 账单号) {
        this.账单号 = 账单号;
    }

    public String get结算号() {
        return 结算号;
    }

    public void set结算号(String 结算号) {
        this.结算号 = 结算号;
    }

    public String get病人号码() {
        return 病人号码;
    }

    public void set病人号码(String 病人号码) {
        this.病人号码 = 病人号码;
    }

    public String get标识() {
        return 标识;
    }

    public void set标识(String 标识) {
        this.标识 = 标识;
    }

    public String get费用类型() {
        return 费用类型;
    }

    public void set费用类型(String 费用类型) {
        this.费用类型 = 费用类型;
    }

    @Override
    public String toString() {
        return "ViewHrpIncomePatient{" +
        "结算日期=" + 结算日期 +
        ", 门诊=" + 门诊 +
        ", 患者卡号=" + 患者卡号 +
        ", 结算单位编码=" + 结算单位编码 +
        ", 结算单位名称=" + 结算单位名称 +
        ", 费用金额=" + 费用金额 +
        ", 账单号=" + 账单号 +
        ", 结算号=" + 结算号 +
        ", 病人号码=" + 病人号码 +
        ", 标识=" + 标识 +
        ", 费用类型=" + 费用类型 +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("VIEW_SJ_医保门诊即时结算")
public class ViewSj医保门诊即时结算 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 结算日期;

    private BigDecimal 费用总结算;

    private BigDecimal 自负费用;

    private BigDecimal 医保负担;


    public String get诊疗卡号() {
        return 诊疗卡号;
    }

    public void set诊疗卡号(String 诊疗卡号) {
        this.诊疗卡号 = 诊疗卡号;
    }

    public String get结算日期() {
        return 结算日期;
    }

    public void set结算日期(String 结算日期) {
        this.结算日期 = 结算日期;
    }

    public BigDecimal get费用总结算() {
        return 费用总结算;
    }

    public void set费用总结算(BigDecimal 费用总结算) {
        this.费用总结算 = 费用总结算;
    }

    public BigDecimal get自负费用() {
        return 自负费用;
    }

    public void set自负费用(BigDecimal 自负费用) {
        this.自负费用 = 自负费用;
    }

    public BigDecimal get医保负担() {
        return 医保负担;
    }

    public void set医保负担(BigDecimal 医保负担) {
        this.医保负担 = 医保负担;
    }

    @Override
    public String toString() {
        return "ViewSj医保门诊即时结算{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 结算日期=" + 结算日期 +
        ", 费用总结算=" + 费用总结算 +
        ", 自负费用=" + 自负费用 +
        ", 医保负担=" + 医保负担 +
        "}";
    }
}

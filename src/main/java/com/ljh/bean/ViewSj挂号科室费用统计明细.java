package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("VIEW_SJ_挂号科室费用统计明细")
public class ViewSj挂号科室费用统计明细 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 姓名;

    private String 科室;

    private LocalDateTime 收费时间;

    private String 费用类别;

    private BigDecimal 金额;

    private String 收款员;


    public String get诊疗卡号() {
        return 诊疗卡号;
    }

    public void set诊疗卡号(String 诊疗卡号) {
        this.诊疗卡号 = 诊疗卡号;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public String get科室() {
        return 科室;
    }

    public void set科室(String 科室) {
        this.科室 = 科室;
    }

    public LocalDateTime get收费时间() {
        return 收费时间;
    }

    public void set收费时间(LocalDateTime 收费时间) {
        this.收费时间 = 收费时间;
    }

    public String get费用类别() {
        return 费用类别;
    }

    public void set费用类别(String 费用类别) {
        this.费用类别 = 费用类别;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    public String get收款员() {
        return 收款员;
    }

    public void set收款员(String 收款员) {
        this.收款员 = 收款员;
    }

    @Override
    public String toString() {
        return "ViewSj挂号科室费用统计明细{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 姓名=" + 姓名 +
        ", 科室=" + 科室 +
        ", 收费时间=" + 收费时间 +
        ", 费用类别=" + 费用类别 +
        ", 金额=" + 金额 +
        ", 收款员=" + 收款员 +
        "}";
    }
}

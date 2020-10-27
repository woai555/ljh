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
@TableName("VIEW_SJ_影像检查全记录表_门诊")
public class ViewSj影像检查全记录表门诊 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 医嘱编号;

    private String 检查编号;

    private LocalDateTime 检查日期;

    private BigDecimal 总费用;

    private String 固定资产编号;

    private String 操作人;


    public String get诊疗卡号() {
        return 诊疗卡号;
    }

    public void set诊疗卡号(String 诊疗卡号) {
        this.诊疗卡号 = 诊疗卡号;
    }

    public String get医嘱编号() {
        return 医嘱编号;
    }

    public void set医嘱编号(String 医嘱编号) {
        this.医嘱编号 = 医嘱编号;
    }

    public String get检查编号() {
        return 检查编号;
    }

    public void set检查编号(String 检查编号) {
        this.检查编号 = 检查编号;
    }

    public LocalDateTime get检查日期() {
        return 检查日期;
    }

    public void set检查日期(LocalDateTime 检查日期) {
        this.检查日期 = 检查日期;
    }

    public BigDecimal get总费用() {
        return 总费用;
    }

    public void set总费用(BigDecimal 总费用) {
        this.总费用 = 总费用;
    }

    public String get固定资产编号() {
        return 固定资产编号;
    }

    public void set固定资产编号(String 固定资产编号) {
        this.固定资产编号 = 固定资产编号;
    }

    public String get操作人() {
        return 操作人;
    }

    public void set操作人(String 操作人) {
        this.操作人 = 操作人;
    }

    @Override
    public String toString() {
        return "ViewSj影像检查全记录表门诊{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 医嘱编号=" + 医嘱编号 +
        ", 检查编号=" + 检查编号 +
        ", 检查日期=" + 检查日期 +
        ", 总费用=" + 总费用 +
        ", 固定资产编号=" + 固定资产编号 +
        ", 操作人=" + 操作人 +
        "}";
    }
}

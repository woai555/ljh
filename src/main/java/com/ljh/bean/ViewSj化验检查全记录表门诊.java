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
@TableName("VIEW_SJ_化验检查全记录表_门诊")
public class ViewSj化验检查全记录表门诊 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 医嘱编号;

    private String 化验编号;

    private LocalDateTime 化验日期;

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

    public String get化验编号() {
        return 化验编号;
    }

    public void set化验编号(String 化验编号) {
        this.化验编号 = 化验编号;
    }

    public LocalDateTime get化验日期() {
        return 化验日期;
    }

    public void set化验日期(LocalDateTime 化验日期) {
        this.化验日期 = 化验日期;
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
        return "ViewSj化验检查全记录表门诊{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 医嘱编号=" + 医嘱编号 +
        ", 化验编号=" + 化验编号 +
        ", 化验日期=" + 化验日期 +
        ", 总费用=" + 总费用 +
        ", 固定资产编号=" + 固定资产编号 +
        ", 操作人=" + 操作人 +
        "}";
    }
}

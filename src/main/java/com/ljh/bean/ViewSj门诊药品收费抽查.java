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
@TableName("VIEW_SJ_门诊药品收费抽查")
public class ViewSj门诊药品收费抽查 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 医嘱编号;

    private Integer 分项序号;

    private String 收费项目;

    private BigDecimal 单价;

    private BigDecimal 数量;

    private BigDecimal 金额;

    private LocalDateTime 发药时间;


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

    public Integer get分项序号() {
        return 分项序号;
    }

    public void set分项序号(Integer 分项序号) {
        this.分项序号 = 分项序号;
    }

    public String get收费项目() {
        return 收费项目;
    }

    public void set收费项目(String 收费项目) {
        this.收费项目 = 收费项目;
    }

    public BigDecimal get单价() {
        return 单价;
    }

    public void set单价(BigDecimal 单价) {
        this.单价 = 单价;
    }

    public BigDecimal get数量() {
        return 数量;
    }

    public void set数量(BigDecimal 数量) {
        this.数量 = 数量;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    public LocalDateTime get发药时间() {
        return 发药时间;
    }

    public void set发药时间(LocalDateTime 发药时间) {
        this.发药时间 = 发药时间;
    }

    @Override
    public String toString() {
        return "ViewSj门诊药品收费抽查{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 医嘱编号=" + 医嘱编号 +
        ", 分项序号=" + 分项序号 +
        ", 收费项目=" + 收费项目 +
        ", 单价=" + 单价 +
        ", 数量=" + 数量 +
        ", 金额=" + 金额 +
        ", 发药时间=" + 发药时间 +
        "}";
    }
}

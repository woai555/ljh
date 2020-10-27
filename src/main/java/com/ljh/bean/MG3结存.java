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
@TableName("MG3结存")
public class MG3结存 implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime 结存日期;

    private String 药品编码;

    private String 药品名称;

    private String 规格;

    private BigDecimal 结存数量;

    private BigDecimal 单价;

    private BigDecimal 金额;


    public LocalDateTime get结存日期() {
        return 结存日期;
    }

    public void set结存日期(LocalDateTime 结存日期) {
        this.结存日期 = 结存日期;
    }

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

    public String get规格() {
        return 规格;
    }

    public void set规格(String 规格) {
        this.规格 = 规格;
    }

    public BigDecimal get结存数量() {
        return 结存数量;
    }

    public void set结存数量(BigDecimal 结存数量) {
        this.结存数量 = 结存数量;
    }

    public BigDecimal get单价() {
        return 单价;
    }

    public void set单价(BigDecimal 单价) {
        this.单价 = 单价;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    @Override
    public String toString() {
        return "MG3结存{" +
        "结存日期=" + 结存日期 +
        ", 药品编码=" + 药品编码 +
        ", 药品名称=" + 药品名称 +
        ", 规格=" + 规格 +
        ", 结存数量=" + 结存数量 +
        ", 单价=" + 单价 +
        ", 金额=" + 金额 +
        "}";
    }
}

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
@TableName("VIEW_SJ_门诊药房入库单")
public class ViewSj门诊药房入库单 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 库名;

    private String 药品编号;

    private String 入库单号;

    private LocalDateTime 入库时间;

    private BigDecimal 数量;

    private BigDecimal 进价;

    private BigDecimal 销价;


    public String get库名() {
        return 库名;
    }

    public void set库名(String 库名) {
        this.库名 = 库名;
    }

    public String get药品编号() {
        return 药品编号;
    }

    public void set药品编号(String 药品编号) {
        this.药品编号 = 药品编号;
    }

    public String get入库单号() {
        return 入库单号;
    }

    public void set入库单号(String 入库单号) {
        this.入库单号 = 入库单号;
    }

    public LocalDateTime get入库时间() {
        return 入库时间;
    }

    public void set入库时间(LocalDateTime 入库时间) {
        this.入库时间 = 入库时间;
    }

    public BigDecimal get数量() {
        return 数量;
    }

    public void set数量(BigDecimal 数量) {
        this.数量 = 数量;
    }

    public BigDecimal get进价() {
        return 进价;
    }

    public void set进价(BigDecimal 进价) {
        this.进价 = 进价;
    }

    public BigDecimal get销价() {
        return 销价;
    }

    public void set销价(BigDecimal 销价) {
        this.销价 = 销价;
    }

    @Override
    public String toString() {
        return "ViewSj门诊药房入库单{" +
        "库名=" + 库名 +
        ", 药品编号=" + 药品编号 +
        ", 入库单号=" + 入库单号 +
        ", 入库时间=" + 入库时间 +
        ", 数量=" + 数量 +
        ", 进价=" + 进价 +
        ", 销价=" + 销价 +
        "}";
    }
}

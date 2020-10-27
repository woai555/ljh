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
@TableName("VIEW_SJ_门诊药房出库单")
public class ViewSj门诊药房出库单 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 库名;

    private String 药品编号;

    private String 出库单号;

    private LocalDateTime 出库时间;

    private BigDecimal 数量;

    private BigDecimal 进价;

    private BigDecimal 销价;

    private String 领用部门;


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

    public String get出库单号() {
        return 出库单号;
    }

    public void set出库单号(String 出库单号) {
        this.出库单号 = 出库单号;
    }

    public LocalDateTime get出库时间() {
        return 出库时间;
    }

    public void set出库时间(LocalDateTime 出库时间) {
        this.出库时间 = 出库时间;
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

    public String get领用部门() {
        return 领用部门;
    }

    public void set领用部门(String 领用部门) {
        this.领用部门 = 领用部门;
    }

    @Override
    public String toString() {
        return "ViewSj门诊药房出库单{" +
        "库名=" + 库名 +
        ", 药品编号=" + 药品编号 +
        ", 出库单号=" + 出库单号 +
        ", 出库时间=" + 出库时间 +
        ", 数量=" + 数量 +
        ", 进价=" + 进价 +
        ", 销价=" + 销价 +
        ", 领用部门=" + 领用部门 +
        "}";
    }
}

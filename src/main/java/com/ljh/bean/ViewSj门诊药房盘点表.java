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
@TableName("VIEW_SJ_门诊药房盘点表")
public class ViewSj门诊药房盘点表 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 库名;

    private String 药品编号;

    private String 月份;

    private BigDecimal 数量;


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

    public String get月份() {
        return 月份;
    }

    public void set月份(String 月份) {
        this.月份 = 月份;
    }

    public BigDecimal get数量() {
        return 数量;
    }

    public void set数量(BigDecimal 数量) {
        this.数量 = 数量;
    }

    @Override
    public String toString() {
        return "ViewSj门诊药房盘点表{" +
        "库名=" + 库名 +
        ", 药品编号=" + 药品编号 +
        ", 月份=" + 月份 +
        ", 数量=" + 数量 +
        "}";
    }
}

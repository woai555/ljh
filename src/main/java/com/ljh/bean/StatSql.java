package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 统计SQL
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class StatSql implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "SERIAL_NO", type = IdType.AUTO)
    private BigDecimal serialNo;

    /**
     * 表名
     */
    private String tabName;

    /**
     * SQL表达式
     */
    private String sqlExpress;


    public BigDecimal getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(BigDecimal serialNo) {
        this.serialNo = serialNo;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public String getSqlExpress() {
        return sqlExpress;
    }

    public void setSqlExpress(String sqlExpress) {
        this.sqlExpress = sqlExpress;
    }

    @Override
    public String toString() {
        return "StatSql{" +
        "serialNo=" + serialNo +
        ", tabName=" + tabName +
        ", sqlExpress=" + sqlExpress +
        "}";
    }
}

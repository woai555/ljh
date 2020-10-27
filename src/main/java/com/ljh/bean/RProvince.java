package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 全国省份代码表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RProvince implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 省份代码
     */
    @TableId(value = "PRO_CODE", type = IdType.AUTO)
    private String proCode;

    /**
     * 省份名称
     */
    private String proName;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 顺序号
     */
    private BigDecimal orderId;


    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "RProvince{" +
        "proCode=" + proCode +
        ", proName=" + proName +
        ", spellCode=" + spellCode +
        ", orderId=" + orderId +
        "}";
    }
}

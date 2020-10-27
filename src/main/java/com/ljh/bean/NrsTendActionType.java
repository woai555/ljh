package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护理计划实施单项目分类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsTendActionType implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 护理单元编码
     */
    @TableId(value = "NRSCELL_CODE", type = IdType.AUTO)
    private String nrscellCode;

    /**
     * 项目编码
     */
    private String itemCode;

    /**
     * 项目顺序
     */
    private BigDecimal itemOrder;

    /**
     * 项目名称
     */
    private String itemName;


    public String getNrscellCode() {
        return nrscellCode;
    }

    public void setNrscellCode(String nrscellCode) {
        this.nrscellCode = nrscellCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public BigDecimal getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(BigDecimal itemOrder) {
        this.itemOrder = itemOrder;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "NrsTendActionType{" +
        "nrscellCode=" + nrscellCode +
        ", itemCode=" + itemCode +
        ", itemOrder=" + itemOrder +
        ", itemName=" + itemName +
        "}";
    }
}

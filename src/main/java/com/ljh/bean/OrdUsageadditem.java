package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医生站用法涉及的附材
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdUsageadditem implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室编码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 用法编码
     */
    private String usageCode;

    /**
     * 项目编码
     */
    private String itemCode;

    /**
     * 是否组套
     */
    private String ynZt;

    /**
     * 序号
     */
    private BigDecimal orderId;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getYnZt() {
        return ynZt;
    }

    public void setYnZt(String ynZt) {
        this.ynZt = ynZt;
    }

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrdUsageadditem{" +
        "deptCode=" + deptCode +
        ", usageCode=" + usageCode +
        ", itemCode=" + itemCode +
        ", ynZt=" + ynZt +
        ", orderId=" + orderId +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
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
public class NrsGroupDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组套流水号
     */
    private String groupid;

    /**
     * 组套药品单项流水号
     */
    private String preGroup;

    /**
     * 医嘱长短标志
     */
    private String longshort;

    /**
     * 执行科室
     */
    private String exeDeptCode;

    /**
     * 开立数量
     */
    private BigDecimal qty;

    /**
     * 医嘱备注
     */
    private String remark;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 病症编码
     */
    private String icdCode;

    /**
     * 项目代码
     */
    private String itemCode;

    /**
     * 用法名称
     */
    private String usageName;


    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getPreGroup() {
        return preGroup;
    }

    public void setPreGroup(String preGroup) {
        this.preGroup = preGroup;
    }

    public String getLongshort() {
        return longshort;
    }

    public void setLongshort(String longshort) {
        this.longshort = longshort;
    }

    public String getExeDeptCode() {
        return exeDeptCode;
    }

    public void setExeDeptCode(String exeDeptCode) {
        this.exeDeptCode = exeDeptCode;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getUsageName() {
        return usageName;
    }

    public void setUsageName(String usageName) {
        this.usageName = usageName;
    }

    @Override
    public String toString() {
        return "NrsGroupDetail{" +
        "groupid=" + groupid +
        ", preGroup=" + preGroup +
        ", longshort=" + longshort +
        ", exeDeptCode=" + exeDeptCode +
        ", qty=" + qty +
        ", remark=" + remark +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", icdCode=" + icdCode +
        ", itemCode=" + itemCode +
        ", usageName=" + usageName +
        "}";
    }
}

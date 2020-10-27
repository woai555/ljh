package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术资料安排
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpDatum implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 0术前  1术后
     */
    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private BigDecimal recordno;

    /**
     * 0.术前安排 1.术后记录
     */
    private String isfore;

    /**
     * 1 诊断  2 手术项目  3 手术器材  4 用药   5 手术规模 6 注意事项 7手术台
     */
    private String datumtype;

    private String itemcode;

    private String itemname;

    /**
     * 针对手术项目是否附加项   1是 2否
     */
    private String ynattached;

    private BigDecimal nums;

    private String unit;

    private LocalDateTime operationtime;

    private BigDecimal duration;

    private String operator;

    private LocalDateTime operatortime;

    /**
     * 0 无效  1 有效   删除或修改操作，原记录变为无效
     */
    private String ynvalid;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getRecordno() {
        return recordno;
    }

    public void setRecordno(BigDecimal recordno) {
        this.recordno = recordno;
    }

    public String getIsfore() {
        return isfore;
    }

    public void setIsfore(String isfore) {
        this.isfore = isfore;
    }

    public String getDatumtype() {
        return datumtype;
    }

    public void setDatumtype(String datumtype) {
        this.datumtype = datumtype;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getYnattached() {
        return ynattached;
    }

    public void setYnattached(String ynattached) {
        this.ynattached = ynattached;
    }

    public BigDecimal getNums() {
        return nums;
    }

    public void setNums(BigDecimal nums) {
        this.nums = nums;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDateTime getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(LocalDateTime operationtime) {
        this.operationtime = operationtime;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    @Override
    public String toString() {
        return "OpDatum{" +
        "operationno=" + operationno +
        ", recordno=" + recordno +
        ", isfore=" + isfore +
        ", datumtype=" + datumtype +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", ynattached=" + ynattached +
        ", nums=" + nums +
        ", unit=" + unit +
        ", operationtime=" + operationtime +
        ", duration=" + duration +
        ", operator=" + operator +
        ", operatortime=" + operatortime +
        ", ynvalid=" + ynvalid +
        "}";
    }
}

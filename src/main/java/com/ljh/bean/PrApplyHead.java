package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 打印模版头表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PrApplyHead implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MODELNO", type = IdType.AUTO)
    private String modelno;

    private String modelname;

    private BigDecimal modeltype;

    private String itemType;

    private String itemCode;

    private String deptCode;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal prNum;

    private BigDecimal orderid;

    private BigDecimal modellevel;

    private String supfileno;

    private String icon;

    private String back;

    private String operatorno;

    private LocalDateTime operatortime;


    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public BigDecimal getModeltype() {
        return modeltype;
    }

    public void setModeltype(BigDecimal modeltype) {
        this.modeltype = modeltype;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getPrNum() {
        return prNum;
    }

    public void setPrNum(BigDecimal prNum) {
        this.prNum = prNum;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getModellevel() {
        return modellevel;
    }

    public void setModellevel(BigDecimal modellevel) {
        this.modellevel = modellevel;
    }

    public String getSupfileno() {
        return supfileno;
    }

    public void setSupfileno(String supfileno) {
        this.supfileno = supfileno;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getOperatorno() {
        return operatorno;
    }

    public void setOperatorno(String operatorno) {
        this.operatorno = operatorno;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "PrApplyHead{" +
        "modelno=" + modelno +
        ", modelname=" + modelname +
        ", modeltype=" + modeltype +
        ", itemType=" + itemType +
        ", itemCode=" + itemCode +
        ", deptCode=" + deptCode +
        ", width=" + width +
        ", height=" + height +
        ", prNum=" + prNum +
        ", orderid=" + orderid +
        ", modellevel=" + modellevel +
        ", supfileno=" + supfileno +
        ", icon=" + icon +
        ", back=" + back +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        "}";
    }
}

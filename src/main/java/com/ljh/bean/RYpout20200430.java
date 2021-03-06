package com.ljh.bean;

import java.math.BigDecimal;
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
public class RYpout20200430 implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisid;

    private String hisname;

    private String ybid;

    private String ybname;

    private String model;

    private String specs;

    private String scaleunit;

    private BigDecimal saleprice;

    private String itemgrade;

    private String feetype;

    private String remark;


    public String getHisid() {
        return hisid;
    }

    public void setHisid(String hisid) {
        this.hisid = hisid;
    }

    public String getHisname() {
        return hisname;
    }

    public void setHisname(String hisname) {
        this.hisname = hisname;
    }

    public String getYbid() {
        return ybid;
    }

    public void setYbid(String ybid) {
        this.ybid = ybid;
    }

    public String getYbname() {
        return ybname;
    }

    public void setYbname(String ybname) {
        this.ybname = ybname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getScaleunit() {
        return scaleunit;
    }

    public void setScaleunit(String scaleunit) {
        this.scaleunit = scaleunit;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public String getItemgrade() {
        return itemgrade;
    }

    public void setItemgrade(String itemgrade) {
        this.itemgrade = itemgrade;
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RYpout20200430{" +
        "hisid=" + hisid +
        ", hisname=" + hisname +
        ", ybid=" + ybid +
        ", ybname=" + ybname +
        ", model=" + model +
        ", specs=" + specs +
        ", scaleunit=" + scaleunit +
        ", saleprice=" + saleprice +
        ", itemgrade=" + itemgrade +
        ", feetype=" + feetype +
        ", remark=" + remark +
        "}";
    }
}

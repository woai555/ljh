package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 就诊位置表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdLocation implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 位置编码
     */
    @TableId(value = "LOCATION_ID", type = IdType.AUTO)
    private BigDecimal locationId;

    /**
     * 位置名称
     */
    private String locationName;

    /**
     * 所属科室
     */
    private String deptCode;

    /**
     * 序号
     */
    private BigDecimal orderid;

    /**
     * 文字显示
     */
    private String showText;


    public BigDecimal getLocationId() {
        return locationId;
    }

    public void setLocationId(BigDecimal locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }

    @Override
    public String toString() {
        return "OrdLocation{" +
        "locationId=" + locationId +
        ", locationName=" + locationName +
        ", deptCode=" + deptCode +
        ", orderid=" + orderid +
        ", showText=" + showText +
        "}";
    }
}

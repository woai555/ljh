package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_DOC_CONTROL
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsDocControl implements Serializable {

    private static final long serialVersionUID=1L;

    private String houseDocCode;

    private String houseDocName;

    private String deptCode;

    private BigDecimal zy;

    private BigDecimal hz;

    private BigDecimal wy;

    private BigDecimal sw;

    private BigDecimal zc;

    private BigDecimal qt;


    public String getHouseDocCode() {
        return houseDocCode;
    }

    public void setHouseDocCode(String houseDocCode) {
        this.houseDocCode = houseDocCode;
    }

    public String getHouseDocName() {
        return houseDocName;
    }

    public void setHouseDocName(String houseDocName) {
        this.houseDocName = houseDocName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getZy() {
        return zy;
    }

    public void setZy(BigDecimal zy) {
        this.zy = zy;
    }

    public BigDecimal getHz() {
        return hz;
    }

    public void setHz(BigDecimal hz) {
        this.hz = hz;
    }

    public BigDecimal getWy() {
        return wy;
    }

    public void setWy(BigDecimal wy) {
        this.wy = wy;
    }

    public BigDecimal getSw() {
        return sw;
    }

    public void setSw(BigDecimal sw) {
        this.sw = sw;
    }

    public BigDecimal getZc() {
        return zc;
    }

    public void setZc(BigDecimal zc) {
        this.zc = zc;
    }

    public BigDecimal getQt() {
        return qt;
    }

    public void setQt(BigDecimal qt) {
        this.qt = qt;
    }

    @Override
    public String toString() {
        return "ViewMrmsDocControl{" +
        "houseDocCode=" + houseDocCode +
        ", houseDocName=" + houseDocName +
        ", deptCode=" + deptCode +
        ", zy=" + zy +
        ", hz=" + hz +
        ", wy=" + wy +
        ", sw=" + sw +
        ", zc=" + zc +
        ", qt=" + qt +
        "}";
    }
}

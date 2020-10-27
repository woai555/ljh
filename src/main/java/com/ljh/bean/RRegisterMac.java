package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号权限和Mac地址的绑定
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterMac implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 挂号科室
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * Mac地址
     */
    private String mac;

    /**
     * 1有效0无效
     */
    private BigDecimal ynvalid;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public BigDecimal getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(BigDecimal ynvalid) {
        this.ynvalid = ynvalid;
    }

    @Override
    public String toString() {
        return "RRegisterMac{" +
        "deptCode=" + deptCode +
        ", mac=" + mac +
        ", ynvalid=" + ynvalid +
        "}";
    }
}

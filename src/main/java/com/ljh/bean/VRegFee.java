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
public class VRegFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String reglevlCode;

    private BigDecimal fee;

    private String hisid;

    private String hisname;

    private String ybid;

    private String ybname;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

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

    @Override
    public String toString() {
        return "VRegFee{" +
        "deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", fee=" + fee +
        ", hisid=" + hisid +
        ", hisname=" + hisname +
        ", ybid=" + ybid +
        ", ybname=" + ybname +
        "}";
    }
}

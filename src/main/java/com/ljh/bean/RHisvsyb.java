package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * his和医保信息对照
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RHisvsyb implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 对照信息类别
     */
    @TableId(value = "STATICID", type = IdType.AUTO)
    private BigDecimal staticid;

    /**
     * his编码
     */
    private String hisid;

    /**
     * his名称
     */
    private String hisname;

    /**
     * 医保编码
     */
    private String ybid;

    /**
     * 医保名称
     */
    private String ybname;


    public BigDecimal getStaticid() {
        return staticid;
    }

    public void setStaticid(BigDecimal staticid) {
        this.staticid = staticid;
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
        return "RHisvsyb{" +
        "staticid=" + staticid +
        ", hisid=" + hisid +
        ", hisname=" + hisname +
        ", ybid=" + ybid +
        ", ybname=" + ybname +
        "}";
    }
}

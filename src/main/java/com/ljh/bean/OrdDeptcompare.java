package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 急诊科室和住院科室的对照(用于预约住院统计中的急诊患者信息)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdDeptcompare implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院科室编码
     */
    private BigDecimal zydeptid;

    /**
     * 急诊科室编码
     */
    private String jzdeptid;

    /**
     * 1有效0无效
     */
    private BigDecimal validflag;


    public BigDecimal getZydeptid() {
        return zydeptid;
    }

    public void setZydeptid(BigDecimal zydeptid) {
        this.zydeptid = zydeptid;
    }

    public String getJzdeptid() {
        return jzdeptid;
    }

    public void setJzdeptid(String jzdeptid) {
        this.jzdeptid = jzdeptid;
    }

    public BigDecimal getValidflag() {
        return validflag;
    }

    public void setValidflag(BigDecimal validflag) {
        this.validflag = validflag;
    }

    @Override
    public String toString() {
        return "OrdDeptcompare{" +
        "zydeptid=" + zydeptid +
        ", jzdeptid=" + jzdeptid +
        ", validflag=" + validflag +
        "}";
    }
}

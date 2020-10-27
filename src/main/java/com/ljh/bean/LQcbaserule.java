package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 质控基本规则表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LQcbaserule implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 基本规则编号
     */
    @TableId(value = "BASERULEID", type = IdType.AUTO)
    private Integer baseruleid;

    /**
     * 基本规则名称
     */
    private String baserulename;

    /**
     * 基本规则类别,1.N-xS,    2.R-xS,    3.N-T,     4.N-X,     5.(M of N)xS
     */
    private String ruletype;

    /**
     * 规则参数.N	
     */
    private BigDecimal parmn;

    /**
     * 规则参数.M	
     */
    private BigDecimal parmm;

    /**
     * 规则参数.x
     */
    private BigDecimal parmx;

    /**
     * 规则参数.y
     */
    private BigDecimal parmy;

    /**
     * 规则描述
     */
    private String baseruledesc;

    /**
     * 操作员
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatordate;


    public Integer getBaseruleid() {
        return baseruleid;
    }

    public void setBaseruleid(Integer baseruleid) {
        this.baseruleid = baseruleid;
    }

    public String getBaserulename() {
        return baserulename;
    }

    public void setBaserulename(String baserulename) {
        this.baserulename = baserulename;
    }

    public String getRuletype() {
        return ruletype;
    }

    public void setRuletype(String ruletype) {
        this.ruletype = ruletype;
    }

    public BigDecimal getParmn() {
        return parmn;
    }

    public void setParmn(BigDecimal parmn) {
        this.parmn = parmn;
    }

    public BigDecimal getParmm() {
        return parmm;
    }

    public void setParmm(BigDecimal parmm) {
        this.parmm = parmm;
    }

    public BigDecimal getParmx() {
        return parmx;
    }

    public void setParmx(BigDecimal parmx) {
        this.parmx = parmx;
    }

    public BigDecimal getParmy() {
        return parmy;
    }

    public void setParmy(BigDecimal parmy) {
        this.parmy = parmy;
    }

    public String getBaseruledesc() {
        return baseruledesc;
    }

    public void setBaseruledesc(String baseruledesc) {
        this.baseruledesc = baseruledesc;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(LocalDateTime operatordate) {
        this.operatordate = operatordate;
    }

    @Override
    public String toString() {
        return "LQcbaserule{" +
        "baseruleid=" + baseruleid +
        ", baserulename=" + baserulename +
        ", ruletype=" + ruletype +
        ", parmn=" + parmn +
        ", parmm=" + parmm +
        ", parmx=" + parmx +
        ", parmy=" + parmy +
        ", baseruledesc=" + baseruledesc +
        ", operatorid=" + operatorid +
        ", operatordate=" + operatordate +
        "}";
    }
}

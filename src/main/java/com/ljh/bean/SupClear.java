package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 消毒情况登记表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupClear implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 流水号
     */
    @TableId(value = "N_CODE", type = IdType.AUTO)
    private String nCode;

    /**
     * 物品编号
     */
    private String goodsCode;

    /**
     * 物品名称
     */
    private String goodsName;

    /**
     * 物品数量
     */
    private BigDecimal clrCount;

    /**
     * 牌号
     */
    private String pCode;

    /**
     * 消毒时间
     */
    private BigDecimal clrDt;

    /**
     * 压力
     */
    private BigDecimal pa;

    /**
     * 所需温度
     */
    private BigDecimal needTem;

    /**
     * 指示剂溶化情况
     */
    private String ifRh;

    /**
     * 干燥时间
     */
    private BigDecimal dryDt;

    /**
     * 锅号
     */
    private String gCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDtime;

    /**
     * 操作员
     */
    private String operCode;


    public String getnCode() {
        return nCode;
    }

    public void setnCode(String nCode) {
        this.nCode = nCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getClrCount() {
        return clrCount;
    }

    public void setClrCount(BigDecimal clrCount) {
        this.clrCount = clrCount;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public BigDecimal getClrDt() {
        return clrDt;
    }

    public void setClrDt(BigDecimal clrDt) {
        this.clrDt = clrDt;
    }

    public BigDecimal getPa() {
        return pa;
    }

    public void setPa(BigDecimal pa) {
        this.pa = pa;
    }

    public BigDecimal getNeedTem() {
        return needTem;
    }

    public void setNeedTem(BigDecimal needTem) {
        this.needTem = needTem;
    }

    public String getIfRh() {
        return ifRh;
    }

    public void setIfRh(String ifRh) {
        this.ifRh = ifRh;
    }

    public BigDecimal getDryDt() {
        return dryDt;
    }

    public void setDryDt(BigDecimal dryDt) {
        this.dryDt = dryDt;
    }

    public String getgCode() {
        return gCode;
    }

    public void setgCode(String gCode) {
        this.gCode = gCode;
    }

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "SupClear{" +
        "nCode=" + nCode +
        ", goodsCode=" + goodsCode +
        ", goodsName=" + goodsName +
        ", clrCount=" + clrCount +
        ", pCode=" + pCode +
        ", clrDt=" + clrDt +
        ", pa=" + pa +
        ", needTem=" + needTem +
        ", ifRh=" + ifRh +
        ", dryDt=" + dryDt +
        ", gCode=" + gCode +
        ", operDtime=" + operDtime +
        ", operCode=" + operCode +
        "}";
    }
}

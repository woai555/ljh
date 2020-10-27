package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class RXinruiGuahao implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisno;

    private String cardNo;

    private String regLevel;

    private String deptCode;

    private String sfxm;

    private String sfxmName;

    private LocalDateTime feeDate;

    private BigDecimal qty;

    private BigDecimal price;


    public String getHisno() {
        return hisno;
    }

    public void setHisno(String hisno) {
        this.hisno = hisno;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRegLevel() {
        return regLevel;
    }

    public void setRegLevel(String regLevel) {
        this.regLevel = regLevel;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getSfxm() {
        return sfxm;
    }

    public void setSfxm(String sfxm) {
        this.sfxm = sfxm;
    }

    public String getSfxmName() {
        return sfxmName;
    }

    public void setSfxmName(String sfxmName) {
        this.sfxmName = sfxmName;
    }

    public LocalDateTime getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(LocalDateTime feeDate) {
        this.feeDate = feeDate;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RXinruiGuahao{" +
        "hisno=" + hisno +
        ", cardNo=" + cardNo +
        ", regLevel=" + regLevel +
        ", deptCode=" + deptCode +
        ", sfxm=" + sfxm +
        ", sfxmName=" + sfxmName +
        ", feeDate=" + feeDate +
        ", qty=" + qty +
        ", price=" + price +
        "}";
    }
}

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
public class LscTest1125 implements Serializable {

    private static final long serialVersionUID=1L;

    private String clinicNo;

    private String cardNo;

    private String regType;

    private BigDecimal fee1;

    private BigDecimal fee2;

    private BigDecimal fee3;

    private BigDecimal fee4;

    private BigDecimal fee5;

    private BigDecimal fee6;

    private BigDecimal fee7;


    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public BigDecimal getFee1() {
        return fee1;
    }

    public void setFee1(BigDecimal fee1) {
        this.fee1 = fee1;
    }

    public BigDecimal getFee2() {
        return fee2;
    }

    public void setFee2(BigDecimal fee2) {
        this.fee2 = fee2;
    }

    public BigDecimal getFee3() {
        return fee3;
    }

    public void setFee3(BigDecimal fee3) {
        this.fee3 = fee3;
    }

    public BigDecimal getFee4() {
        return fee4;
    }

    public void setFee4(BigDecimal fee4) {
        this.fee4 = fee4;
    }

    public BigDecimal getFee5() {
        return fee5;
    }

    public void setFee5(BigDecimal fee5) {
        this.fee5 = fee5;
    }

    public BigDecimal getFee6() {
        return fee6;
    }

    public void setFee6(BigDecimal fee6) {
        this.fee6 = fee6;
    }

    public BigDecimal getFee7() {
        return fee7;
    }

    public void setFee7(BigDecimal fee7) {
        this.fee7 = fee7;
    }

    @Override
    public String toString() {
        return "LscTest1125{" +
        "clinicNo=" + clinicNo +
        ", cardNo=" + cardNo +
        ", regType=" + regType +
        ", fee1=" + fee1 +
        ", fee2=" + fee2 +
        ", fee3=" + fee3 +
        ", fee4=" + fee4 +
        ", fee5=" + fee5 +
        ", fee6=" + fee6 +
        ", fee7=" + fee7 +
        "}";
    }
}

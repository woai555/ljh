package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_DEPT_DRUG
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewDeptDrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String cardNo;

    private LocalDateTime regDate;

    private String pactCode;

    private BigDecimal cost;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ViewDeptDrug{" +
        "deptCode=" + deptCode +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", pactCode=" + pactCode +
        ", cost=" + cost +
        "}";
    }
}

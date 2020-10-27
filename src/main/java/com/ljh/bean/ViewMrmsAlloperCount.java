package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_ALLOPER_COUNT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsAlloperCount implements Serializable {

    private static final long serialVersionUID=1L;

    private String operCode;

    private String operCnname;

    private BigDecimal operCount;

    private BigDecimal oneCount;

    private BigDecimal oneANum;

    private BigDecimal oneBNum;

    private BigDecimal oneCNum;

    private BigDecimal twoCount;

    private BigDecimal twoANum;

    private BigDecimal twoBNum;

    private BigDecimal twoCNum;

    private BigDecimal threeCount;

    private BigDecimal threeANum;

    private BigDecimal threeBNum;

    private BigDecimal threeCNum;

    private BigDecimal syndNum;


    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperCnname() {
        return operCnname;
    }

    public void setOperCnname(String operCnname) {
        this.operCnname = operCnname;
    }

    public BigDecimal getOperCount() {
        return operCount;
    }

    public void setOperCount(BigDecimal operCount) {
        this.operCount = operCount;
    }

    public BigDecimal getOneCount() {
        return oneCount;
    }

    public void setOneCount(BigDecimal oneCount) {
        this.oneCount = oneCount;
    }

    public BigDecimal getOneANum() {
        return oneANum;
    }

    public void setOneANum(BigDecimal oneANum) {
        this.oneANum = oneANum;
    }

    public BigDecimal getOneBNum() {
        return oneBNum;
    }

    public void setOneBNum(BigDecimal oneBNum) {
        this.oneBNum = oneBNum;
    }

    public BigDecimal getOneCNum() {
        return oneCNum;
    }

    public void setOneCNum(BigDecimal oneCNum) {
        this.oneCNum = oneCNum;
    }

    public BigDecimal getTwoCount() {
        return twoCount;
    }

    public void setTwoCount(BigDecimal twoCount) {
        this.twoCount = twoCount;
    }

    public BigDecimal getTwoANum() {
        return twoANum;
    }

    public void setTwoANum(BigDecimal twoANum) {
        this.twoANum = twoANum;
    }

    public BigDecimal getTwoBNum() {
        return twoBNum;
    }

    public void setTwoBNum(BigDecimal twoBNum) {
        this.twoBNum = twoBNum;
    }

    public BigDecimal getTwoCNum() {
        return twoCNum;
    }

    public void setTwoCNum(BigDecimal twoCNum) {
        this.twoCNum = twoCNum;
    }

    public BigDecimal getThreeCount() {
        return threeCount;
    }

    public void setThreeCount(BigDecimal threeCount) {
        this.threeCount = threeCount;
    }

    public BigDecimal getThreeANum() {
        return threeANum;
    }

    public void setThreeANum(BigDecimal threeANum) {
        this.threeANum = threeANum;
    }

    public BigDecimal getThreeBNum() {
        return threeBNum;
    }

    public void setThreeBNum(BigDecimal threeBNum) {
        this.threeBNum = threeBNum;
    }

    public BigDecimal getThreeCNum() {
        return threeCNum;
    }

    public void setThreeCNum(BigDecimal threeCNum) {
        this.threeCNum = threeCNum;
    }

    public BigDecimal getSyndNum() {
        return syndNum;
    }

    public void setSyndNum(BigDecimal syndNum) {
        this.syndNum = syndNum;
    }

    @Override
    public String toString() {
        return "ViewMrmsAlloperCount{" +
        "operCode=" + operCode +
        ", operCnname=" + operCnname +
        ", operCount=" + operCount +
        ", oneCount=" + oneCount +
        ", oneANum=" + oneANum +
        ", oneBNum=" + oneBNum +
        ", oneCNum=" + oneCNum +
        ", twoCount=" + twoCount +
        ", twoANum=" + twoANum +
        ", twoBNum=" + twoBNum +
        ", twoCNum=" + twoCNum +
        ", threeCount=" + threeCount +
        ", threeANum=" + threeANum +
        ", threeBNum=" + threeBNum +
        ", threeCNum=" + threeCNum +
        ", syndNum=" + syndNum +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_OPER_TOTALDEPT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewOperTotaldept implements Serializable {

    private static final long serialVersionUID=1L;

    private String operDept;

    private BigDecimal operNum;

    private BigDecimal totalOne;

    private BigDecimal oneANum;

    private BigDecimal oneBNum;

    private BigDecimal oneCNum;

    private BigDecimal totalTwo;

    private BigDecimal twoANum;

    private BigDecimal twoBNum;

    private BigDecimal twoCNum;

    private BigDecimal totalThree;

    private BigDecimal threeANum;

    private BigDecimal threeBNum;

    private BigDecimal threeCNum;


    public String getOperDept() {
        return operDept;
    }

    public void setOperDept(String operDept) {
        this.operDept = operDept;
    }

    public BigDecimal getOperNum() {
        return operNum;
    }

    public void setOperNum(BigDecimal operNum) {
        this.operNum = operNum;
    }

    public BigDecimal getTotalOne() {
        return totalOne;
    }

    public void setTotalOne(BigDecimal totalOne) {
        this.totalOne = totalOne;
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

    public BigDecimal getTotalTwo() {
        return totalTwo;
    }

    public void setTotalTwo(BigDecimal totalTwo) {
        this.totalTwo = totalTwo;
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

    public BigDecimal getTotalThree() {
        return totalThree;
    }

    public void setTotalThree(BigDecimal totalThree) {
        this.totalThree = totalThree;
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

    @Override
    public String toString() {
        return "ViewOperTotaldept{" +
        "operDept=" + operDept +
        ", operNum=" + operNum +
        ", totalOne=" + totalOne +
        ", oneANum=" + oneANum +
        ", oneBNum=" + oneBNum +
        ", oneCNum=" + oneCNum +
        ", totalTwo=" + totalTwo +
        ", twoANum=" + twoANum +
        ", twoBNum=" + twoBNum +
        ", twoCNum=" + twoCNum +
        ", totalThree=" + totalThree +
        ", threeANum=" + threeANum +
        ", threeBNum=" + threeBNum +
        ", threeCNum=" + threeCNum +
        "}";
    }
}

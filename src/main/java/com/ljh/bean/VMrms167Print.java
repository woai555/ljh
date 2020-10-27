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
public class VMrms167Print implements Serializable {

    private static final long serialVersionUID=1L;

    private String leftDisname;

    private Integer leftCode;

    private Integer leftSumAll;

    private Integer leftSumPart;

    private Integer leftRtn1;

    private Integer leftRtn2;

    private Integer leftRtn3;

    private Integer leftRtn4;

    private Integer leftInbedday;

    private BigDecimal leftOther;

    private String rightDisname;

    private Integer rightCode;

    private Integer rightSumAll;

    private Integer rightSumPart;

    private Integer rightRtn1;

    private Integer rightRtn2;

    private Integer rightRtn3;

    private Integer rightRtn4;

    private Integer rightInbedday;

    private BigDecimal rightOther;


    public String getLeftDisname() {
        return leftDisname;
    }

    public void setLeftDisname(String leftDisname) {
        this.leftDisname = leftDisname;
    }

    public Integer getLeftCode() {
        return leftCode;
    }

    public void setLeftCode(Integer leftCode) {
        this.leftCode = leftCode;
    }

    public Integer getLeftSumAll() {
        return leftSumAll;
    }

    public void setLeftSumAll(Integer leftSumAll) {
        this.leftSumAll = leftSumAll;
    }

    public Integer getLeftSumPart() {
        return leftSumPart;
    }

    public void setLeftSumPart(Integer leftSumPart) {
        this.leftSumPart = leftSumPart;
    }

    public Integer getLeftRtn1() {
        return leftRtn1;
    }

    public void setLeftRtn1(Integer leftRtn1) {
        this.leftRtn1 = leftRtn1;
    }

    public Integer getLeftRtn2() {
        return leftRtn2;
    }

    public void setLeftRtn2(Integer leftRtn2) {
        this.leftRtn2 = leftRtn2;
    }

    public Integer getLeftRtn3() {
        return leftRtn3;
    }

    public void setLeftRtn3(Integer leftRtn3) {
        this.leftRtn3 = leftRtn3;
    }

    public Integer getLeftRtn4() {
        return leftRtn4;
    }

    public void setLeftRtn4(Integer leftRtn4) {
        this.leftRtn4 = leftRtn4;
    }

    public Integer getLeftInbedday() {
        return leftInbedday;
    }

    public void setLeftInbedday(Integer leftInbedday) {
        this.leftInbedday = leftInbedday;
    }

    public BigDecimal getLeftOther() {
        return leftOther;
    }

    public void setLeftOther(BigDecimal leftOther) {
        this.leftOther = leftOther;
    }

    public String getRightDisname() {
        return rightDisname;
    }

    public void setRightDisname(String rightDisname) {
        this.rightDisname = rightDisname;
    }

    public Integer getRightCode() {
        return rightCode;
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public Integer getRightSumAll() {
        return rightSumAll;
    }

    public void setRightSumAll(Integer rightSumAll) {
        this.rightSumAll = rightSumAll;
    }

    public Integer getRightSumPart() {
        return rightSumPart;
    }

    public void setRightSumPart(Integer rightSumPart) {
        this.rightSumPart = rightSumPart;
    }

    public Integer getRightRtn1() {
        return rightRtn1;
    }

    public void setRightRtn1(Integer rightRtn1) {
        this.rightRtn1 = rightRtn1;
    }

    public Integer getRightRtn2() {
        return rightRtn2;
    }

    public void setRightRtn2(Integer rightRtn2) {
        this.rightRtn2 = rightRtn2;
    }

    public Integer getRightRtn3() {
        return rightRtn3;
    }

    public void setRightRtn3(Integer rightRtn3) {
        this.rightRtn3 = rightRtn3;
    }

    public Integer getRightRtn4() {
        return rightRtn4;
    }

    public void setRightRtn4(Integer rightRtn4) {
        this.rightRtn4 = rightRtn4;
    }

    public Integer getRightInbedday() {
        return rightInbedday;
    }

    public void setRightInbedday(Integer rightInbedday) {
        this.rightInbedday = rightInbedday;
    }

    public BigDecimal getRightOther() {
        return rightOther;
    }

    public void setRightOther(BigDecimal rightOther) {
        this.rightOther = rightOther;
    }

    @Override
    public String toString() {
        return "VMrms167Print{" +
        "leftDisname=" + leftDisname +
        ", leftCode=" + leftCode +
        ", leftSumAll=" + leftSumAll +
        ", leftSumPart=" + leftSumPart +
        ", leftRtn1=" + leftRtn1 +
        ", leftRtn2=" + leftRtn2 +
        ", leftRtn3=" + leftRtn3 +
        ", leftRtn4=" + leftRtn4 +
        ", leftInbedday=" + leftInbedday +
        ", leftOther=" + leftOther +
        ", rightDisname=" + rightDisname +
        ", rightCode=" + rightCode +
        ", rightSumAll=" + rightSumAll +
        ", rightSumPart=" + rightSumPart +
        ", rightRtn1=" + rightRtn1 +
        ", rightRtn2=" + rightRtn2 +
        ", rightRtn3=" + rightRtn3 +
        ", rightRtn4=" + rightRtn4 +
        ", rightInbedday=" + rightInbedday +
        ", rightOther=" + rightOther +
        "}";
    }
}

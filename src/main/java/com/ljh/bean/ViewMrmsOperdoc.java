package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_OPERDOC
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsOperdoc implements Serializable {

    private static final long serialVersionUID=1L;

    private String docCode;

    private String operDept;

    private BigDecimal operNum;

    private BigDecimal zg01Num;

    private BigDecimal zg02Num;

    private BigDecimal zg03Num;

    private BigDecimal zg04Num;

    private BigDecimal zg05Num;

    private BigDecimal zg06Num;

    private BigDecimal oneANum;

    private BigDecimal oneBNum;

    private BigDecimal oneCNum;

    private BigDecimal twoANum;

    private BigDecimal twoBNum;

    private BigDecimal twoCNum;

    private BigDecimal threeANum;

    private BigDecimal threeBNum;

    private BigDecimal threeCNum;

    private BigDecimal syndNum;


    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

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

    public BigDecimal getZg01Num() {
        return zg01Num;
    }

    public void setZg01Num(BigDecimal zg01Num) {
        this.zg01Num = zg01Num;
    }

    public BigDecimal getZg02Num() {
        return zg02Num;
    }

    public void setZg02Num(BigDecimal zg02Num) {
        this.zg02Num = zg02Num;
    }

    public BigDecimal getZg03Num() {
        return zg03Num;
    }

    public void setZg03Num(BigDecimal zg03Num) {
        this.zg03Num = zg03Num;
    }

    public BigDecimal getZg04Num() {
        return zg04Num;
    }

    public void setZg04Num(BigDecimal zg04Num) {
        this.zg04Num = zg04Num;
    }

    public BigDecimal getZg05Num() {
        return zg05Num;
    }

    public void setZg05Num(BigDecimal zg05Num) {
        this.zg05Num = zg05Num;
    }

    public BigDecimal getZg06Num() {
        return zg06Num;
    }

    public void setZg06Num(BigDecimal zg06Num) {
        this.zg06Num = zg06Num;
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
        return "ViewMrmsOperdoc{" +
        "docCode=" + docCode +
        ", operDept=" + operDept +
        ", operNum=" + operNum +
        ", zg01Num=" + zg01Num +
        ", zg02Num=" + zg02Num +
        ", zg03Num=" + zg03Num +
        ", zg04Num=" + zg04Num +
        ", zg05Num=" + zg05Num +
        ", zg06Num=" + zg06Num +
        ", oneANum=" + oneANum +
        ", oneBNum=" + oneBNum +
        ", oneCNum=" + oneCNum +
        ", twoANum=" + twoANum +
        ", twoBNum=" + twoBNum +
        ", twoCNum=" + twoCNum +
        ", threeANum=" + threeANum +
        ", threeBNum=" + threeBNum +
        ", threeCNum=" + threeCNum +
        ", syndNum=" + syndNum +
        "}";
    }
}

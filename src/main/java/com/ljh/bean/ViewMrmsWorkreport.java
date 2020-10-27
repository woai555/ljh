package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_WORKREPORT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsWorkreport implements Serializable {

    private static final long serialVersionUID=1L;

    private String sDept;

    private BigDecimal sumCli;

    private BigDecimal sumEmc;

    private BigDecimal sumEmcd;

    private BigDecimal sumObsrv;

    private BigDecimal sumObsrvd;

    private BigDecimal sumBdchk;

    private Integer sumOrign;

    private BigDecimal sumIn;

    private Integer sumTrin;

    private Integer sumManout;

    private Integer sumRtn1;

    private Integer sumRtn2;

    private Integer sumRtn3;

    private Integer sumRtn4;

    private Integer sumTrout;

    private Integer sumReal;

    private Integer sumBedreal;

    private Integer sumBeddaysopen;

    private Integer sumBedavgopen;

    private Integer sumBeddaysuse;

    private Integer sumBedDaysop;


    public String getsDept() {
        return sDept;
    }

    public void setsDept(String sDept) {
        this.sDept = sDept;
    }

    public BigDecimal getSumCli() {
        return sumCli;
    }

    public void setSumCli(BigDecimal sumCli) {
        this.sumCli = sumCli;
    }

    public BigDecimal getSumEmc() {
        return sumEmc;
    }

    public void setSumEmc(BigDecimal sumEmc) {
        this.sumEmc = sumEmc;
    }

    public BigDecimal getSumEmcd() {
        return sumEmcd;
    }

    public void setSumEmcd(BigDecimal sumEmcd) {
        this.sumEmcd = sumEmcd;
    }

    public BigDecimal getSumObsrv() {
        return sumObsrv;
    }

    public void setSumObsrv(BigDecimal sumObsrv) {
        this.sumObsrv = sumObsrv;
    }

    public BigDecimal getSumObsrvd() {
        return sumObsrvd;
    }

    public void setSumObsrvd(BigDecimal sumObsrvd) {
        this.sumObsrvd = sumObsrvd;
    }

    public BigDecimal getSumBdchk() {
        return sumBdchk;
    }

    public void setSumBdchk(BigDecimal sumBdchk) {
        this.sumBdchk = sumBdchk;
    }

    public Integer getSumOrign() {
        return sumOrign;
    }

    public void setSumOrign(Integer sumOrign) {
        this.sumOrign = sumOrign;
    }

    public BigDecimal getSumIn() {
        return sumIn;
    }

    public void setSumIn(BigDecimal sumIn) {
        this.sumIn = sumIn;
    }

    public Integer getSumTrin() {
        return sumTrin;
    }

    public void setSumTrin(Integer sumTrin) {
        this.sumTrin = sumTrin;
    }

    public Integer getSumManout() {
        return sumManout;
    }

    public void setSumManout(Integer sumManout) {
        this.sumManout = sumManout;
    }

    public Integer getSumRtn1() {
        return sumRtn1;
    }

    public void setSumRtn1(Integer sumRtn1) {
        this.sumRtn1 = sumRtn1;
    }

    public Integer getSumRtn2() {
        return sumRtn2;
    }

    public void setSumRtn2(Integer sumRtn2) {
        this.sumRtn2 = sumRtn2;
    }

    public Integer getSumRtn3() {
        return sumRtn3;
    }

    public void setSumRtn3(Integer sumRtn3) {
        this.sumRtn3 = sumRtn3;
    }

    public Integer getSumRtn4() {
        return sumRtn4;
    }

    public void setSumRtn4(Integer sumRtn4) {
        this.sumRtn4 = sumRtn4;
    }

    public Integer getSumTrout() {
        return sumTrout;
    }

    public void setSumTrout(Integer sumTrout) {
        this.sumTrout = sumTrout;
    }

    public Integer getSumReal() {
        return sumReal;
    }

    public void setSumReal(Integer sumReal) {
        this.sumReal = sumReal;
    }

    public Integer getSumBedreal() {
        return sumBedreal;
    }

    public void setSumBedreal(Integer sumBedreal) {
        this.sumBedreal = sumBedreal;
    }

    public Integer getSumBeddaysopen() {
        return sumBeddaysopen;
    }

    public void setSumBeddaysopen(Integer sumBeddaysopen) {
        this.sumBeddaysopen = sumBeddaysopen;
    }

    public Integer getSumBedavgopen() {
        return sumBedavgopen;
    }

    public void setSumBedavgopen(Integer sumBedavgopen) {
        this.sumBedavgopen = sumBedavgopen;
    }

    public Integer getSumBeddaysuse() {
        return sumBeddaysuse;
    }

    public void setSumBeddaysuse(Integer sumBeddaysuse) {
        this.sumBeddaysuse = sumBeddaysuse;
    }

    public Integer getSumBedDaysop() {
        return sumBedDaysop;
    }

    public void setSumBedDaysop(Integer sumBedDaysop) {
        this.sumBedDaysop = sumBedDaysop;
    }

    @Override
    public String toString() {
        return "ViewMrmsWorkreport{" +
        "sDept=" + sDept +
        ", sumCli=" + sumCli +
        ", sumEmc=" + sumEmc +
        ", sumEmcd=" + sumEmcd +
        ", sumObsrv=" + sumObsrv +
        ", sumObsrvd=" + sumObsrvd +
        ", sumBdchk=" + sumBdchk +
        ", sumOrign=" + sumOrign +
        ", sumIn=" + sumIn +
        ", sumTrin=" + sumTrin +
        ", sumManout=" + sumManout +
        ", sumRtn1=" + sumRtn1 +
        ", sumRtn2=" + sumRtn2 +
        ", sumRtn3=" + sumRtn3 +
        ", sumRtn4=" + sumRtn4 +
        ", sumTrout=" + sumTrout +
        ", sumReal=" + sumReal +
        ", sumBedreal=" + sumBedreal +
        ", sumBeddaysopen=" + sumBeddaysopen +
        ", sumBedavgopen=" + sumBedavgopen +
        ", sumBeddaysuse=" + sumBeddaysuse +
        ", sumBedDaysop=" + sumBedDaysop +
        "}";
    }
}

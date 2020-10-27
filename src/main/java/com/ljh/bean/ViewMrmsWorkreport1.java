package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_WORKREPORT_1
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsWorkreport1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String sdept;

    private BigDecimal sumCli;

    private BigDecimal sumEmc;

    private BigDecimal sumEmcd;

    private BigDecimal sumObsrv;

    private BigDecimal sumObsrvd;

    private BigDecimal sumBdchk;


    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
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

    @Override
    public String toString() {
        return "ViewMrmsWorkreport1{" +
        "sdept=" + sdept +
        ", sumCli=" + sumCli +
        ", sumEmc=" + sumEmc +
        ", sumEmcd=" + sumEmcd +
        ", sumObsrv=" + sumObsrv +
        ", sumObsrvd=" + sumObsrvd +
        ", sumBdchk=" + sumBdchk +
        "}";
    }
}

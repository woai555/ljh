package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊情况日报表模版MRMSRPT3
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsrpt3 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 日报日期
     */
    @TableId(value = "DATE_STAT", type = IdType.AUTO)
    private LocalDateTime dateStat;

    /**
     * 门诊科室代码
     */
    private String deptCode;

    /**
     * 门诊人数
     */
    private Long numCli;

    /**
     * 急诊人数
     */
    private Long numEmc;

    /**
     * 急诊死亡
     */
    private Long numEmcd;

    /**
     * 观察人数
     */
    private Long numObsrv;

    /**
     * 观察死亡
     */
    private Long numObsrvd;

    /**
     * 复诊
     */
    private Long numFcnslt;

    /**
     * 会诊
     */
    private Long numCnslt;

    /**
     * 专家
     */
    private Long numSpcl;

    /**
     * 医保
     */
    private Integer ybNum;

    /**
     * 体检
     */
    private Long numBdchk;


    public LocalDateTime getDateStat() {
        return dateStat;
    }

    public void setDateStat(LocalDateTime dateStat) {
        this.dateStat = dateStat;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Long getNumCli() {
        return numCli;
    }

    public void setNumCli(Long numCli) {
        this.numCli = numCli;
    }

    public Long getNumEmc() {
        return numEmc;
    }

    public void setNumEmc(Long numEmc) {
        this.numEmc = numEmc;
    }

    public Long getNumEmcd() {
        return numEmcd;
    }

    public void setNumEmcd(Long numEmcd) {
        this.numEmcd = numEmcd;
    }

    public Long getNumObsrv() {
        return numObsrv;
    }

    public void setNumObsrv(Long numObsrv) {
        this.numObsrv = numObsrv;
    }

    public Long getNumObsrvd() {
        return numObsrvd;
    }

    public void setNumObsrvd(Long numObsrvd) {
        this.numObsrvd = numObsrvd;
    }

    public Long getNumFcnslt() {
        return numFcnslt;
    }

    public void setNumFcnslt(Long numFcnslt) {
        this.numFcnslt = numFcnslt;
    }

    public Long getNumCnslt() {
        return numCnslt;
    }

    public void setNumCnslt(Long numCnslt) {
        this.numCnslt = numCnslt;
    }

    public Long getNumSpcl() {
        return numSpcl;
    }

    public void setNumSpcl(Long numSpcl) {
        this.numSpcl = numSpcl;
    }

    public Integer getYbNum() {
        return ybNum;
    }

    public void setYbNum(Integer ybNum) {
        this.ybNum = ybNum;
    }

    public Long getNumBdchk() {
        return numBdchk;
    }

    public void setNumBdchk(Long numBdchk) {
        this.numBdchk = numBdchk;
    }

    @Override
    public String toString() {
        return "Mrmsrpt3{" +
        "dateStat=" + dateStat +
        ", deptCode=" + deptCode +
        ", numCli=" + numCli +
        ", numEmc=" + numEmc +
        ", numEmcd=" + numEmcd +
        ", numObsrv=" + numObsrv +
        ", numObsrvd=" + numObsrvd +
        ", numFcnslt=" + numFcnslt +
        ", numCnslt=" + numCnslt +
        ", numSpcl=" + numSpcl +
        ", ybNum=" + ybNum +
        ", numBdchk=" + numBdchk +
        "}";
    }
}

package com.ljh.bean;

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
public class UdOrdmdfq implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DFQ_FREQ", type = IdType.AUTO)
    private String dfqFreq;

    private Integer dfqCycl;

    private Integer dfqCont;

    private Integer dfqIntv;

    private String dfqCexp;

    private String dfqNote;

    private String dfqHicd;

    private Integer dfqTime;

    private Integer dfqOrder;

    private String doestime;

    /**
     * 电子病历共享平台对照编码
     */
    private String ygjCompare;


    public String getDfqFreq() {
        return dfqFreq;
    }

    public void setDfqFreq(String dfqFreq) {
        this.dfqFreq = dfqFreq;
    }

    public Integer getDfqCycl() {
        return dfqCycl;
    }

    public void setDfqCycl(Integer dfqCycl) {
        this.dfqCycl = dfqCycl;
    }

    public Integer getDfqCont() {
        return dfqCont;
    }

    public void setDfqCont(Integer dfqCont) {
        this.dfqCont = dfqCont;
    }

    public Integer getDfqIntv() {
        return dfqIntv;
    }

    public void setDfqIntv(Integer dfqIntv) {
        this.dfqIntv = dfqIntv;
    }

    public String getDfqCexp() {
        return dfqCexp;
    }

    public void setDfqCexp(String dfqCexp) {
        this.dfqCexp = dfqCexp;
    }

    public String getDfqNote() {
        return dfqNote;
    }

    public void setDfqNote(String dfqNote) {
        this.dfqNote = dfqNote;
    }

    public String getDfqHicd() {
        return dfqHicd;
    }

    public void setDfqHicd(String dfqHicd) {
        this.dfqHicd = dfqHicd;
    }

    public Integer getDfqTime() {
        return dfqTime;
    }

    public void setDfqTime(Integer dfqTime) {
        this.dfqTime = dfqTime;
    }

    public Integer getDfqOrder() {
        return dfqOrder;
    }

    public void setDfqOrder(Integer dfqOrder) {
        this.dfqOrder = dfqOrder;
    }

    public String getDoestime() {
        return doestime;
    }

    public void setDoestime(String doestime) {
        this.doestime = doestime;
    }

    public String getYgjCompare() {
        return ygjCompare;
    }

    public void setYgjCompare(String ygjCompare) {
        this.ygjCompare = ygjCompare;
    }

    @Override
    public String toString() {
        return "UdOrdmdfq{" +
        "dfqFreq=" + dfqFreq +
        ", dfqCycl=" + dfqCycl +
        ", dfqCont=" + dfqCont +
        ", dfqIntv=" + dfqIntv +
        ", dfqCexp=" + dfqCexp +
        ", dfqNote=" + dfqNote +
        ", dfqHicd=" + dfqHicd +
        ", dfqTime=" + dfqTime +
        ", dfqOrder=" + dfqOrder +
        ", doestime=" + doestime +
        ", ygjCompare=" + ygjCompare +
        "}";
    }
}

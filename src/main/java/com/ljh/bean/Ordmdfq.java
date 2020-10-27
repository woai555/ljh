package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 频次代码档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Ordmdfq implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科别
     */
    private String dfqDept;

    /**
     * 频次代码
     */
    @TableId(value = "DFQ_FREQ", type = IdType.AUTO)
    private String dfqFreq;

    /**
     * 周期
     */
    private Integer dfqCycl;

    /**
     * 次数
     */
    private Integer dfqCont;

    /**
     * 时隔
     */
    private Integer dfqIntv;

    /**
     * 中文说明
     */
    private String dfqCexp;

    /**
     * 备注
     */
    private String dfqNote;

    /**
     * 医保频次代码
     */
    private String dfqHicd;

    /**
     * 排列顺序
     */
    private Integer dfqOrder;

    /**
     * 1点服药
     */
    private String dfq01h;

    /**
     * 2点服药
     */
    private String dfq02h;

    /**
     * 3点服药
     */
    private String dfq03h;

    /**
     * 4点服药
     */
    private String dfq04h;

    /**
     * 5点服药
     */
    private String dfq05h;

    /**
     * 6点服药
     */
    private String dfq06h;

    /**
     * 7点服药
     */
    private String dfq07h;

    /**
     * 8点服药
     */
    private String dfq08h;

    /**
     * 9点服药
     */
    private String dfq09h;

    /**
     * 10点服药
     */
    private String dfq10h;

    /**
     * 11点服药
     */
    private String dfq11h;

    /**
     * 12点服药
     */
    private String dfq12h;

    /**
     * 13点服药
     */
    private String dfq13h;

    /**
     * 14点服药
     */
    private String dfq14h;

    /**
     * 15点服药
     */
    private String dfq15h;

    /**
     * 16点服药
     */
    private String dfq16h;

    /**
     * 17点服药
     */
    private String dfq17h;

    /**
     * 18点服药
     */
    private String dfq18h;

    /**
     * 19点服药
     */
    private String dfq19h;

    /**
     * 20点服药
     */
    private String dfq20h;

    /**
     * 21点服药
     */
    private String dfq21h;

    /**
     * 22点服药
     */
    private String dfq22h;

    /**
     * 23点服药
     */
    private String dfq23h;

    /**
     * 24点服药
     */
    private String dfq24h;

    /**
     * 电子病历共享工程编码
     */
    private String mrCode;

    /**
     * 电子病历共享工程名称
     */
    private String mrName;

    /**
     * 周次星期明细
     */
    private String dayDetail;


    public String getDfqDept() {
        return dfqDept;
    }

    public void setDfqDept(String dfqDept) {
        this.dfqDept = dfqDept;
    }

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

    public Integer getDfqOrder() {
        return dfqOrder;
    }

    public void setDfqOrder(Integer dfqOrder) {
        this.dfqOrder = dfqOrder;
    }

    public String getDfq01h() {
        return dfq01h;
    }

    public void setDfq01h(String dfq01h) {
        this.dfq01h = dfq01h;
    }

    public String getDfq02h() {
        return dfq02h;
    }

    public void setDfq02h(String dfq02h) {
        this.dfq02h = dfq02h;
    }

    public String getDfq03h() {
        return dfq03h;
    }

    public void setDfq03h(String dfq03h) {
        this.dfq03h = dfq03h;
    }

    public String getDfq04h() {
        return dfq04h;
    }

    public void setDfq04h(String dfq04h) {
        this.dfq04h = dfq04h;
    }

    public String getDfq05h() {
        return dfq05h;
    }

    public void setDfq05h(String dfq05h) {
        this.dfq05h = dfq05h;
    }

    public String getDfq06h() {
        return dfq06h;
    }

    public void setDfq06h(String dfq06h) {
        this.dfq06h = dfq06h;
    }

    public String getDfq07h() {
        return dfq07h;
    }

    public void setDfq07h(String dfq07h) {
        this.dfq07h = dfq07h;
    }

    public String getDfq08h() {
        return dfq08h;
    }

    public void setDfq08h(String dfq08h) {
        this.dfq08h = dfq08h;
    }

    public String getDfq09h() {
        return dfq09h;
    }

    public void setDfq09h(String dfq09h) {
        this.dfq09h = dfq09h;
    }

    public String getDfq10h() {
        return dfq10h;
    }

    public void setDfq10h(String dfq10h) {
        this.dfq10h = dfq10h;
    }

    public String getDfq11h() {
        return dfq11h;
    }

    public void setDfq11h(String dfq11h) {
        this.dfq11h = dfq11h;
    }

    public String getDfq12h() {
        return dfq12h;
    }

    public void setDfq12h(String dfq12h) {
        this.dfq12h = dfq12h;
    }

    public String getDfq13h() {
        return dfq13h;
    }

    public void setDfq13h(String dfq13h) {
        this.dfq13h = dfq13h;
    }

    public String getDfq14h() {
        return dfq14h;
    }

    public void setDfq14h(String dfq14h) {
        this.dfq14h = dfq14h;
    }

    public String getDfq15h() {
        return dfq15h;
    }

    public void setDfq15h(String dfq15h) {
        this.dfq15h = dfq15h;
    }

    public String getDfq16h() {
        return dfq16h;
    }

    public void setDfq16h(String dfq16h) {
        this.dfq16h = dfq16h;
    }

    public String getDfq17h() {
        return dfq17h;
    }

    public void setDfq17h(String dfq17h) {
        this.dfq17h = dfq17h;
    }

    public String getDfq18h() {
        return dfq18h;
    }

    public void setDfq18h(String dfq18h) {
        this.dfq18h = dfq18h;
    }

    public String getDfq19h() {
        return dfq19h;
    }

    public void setDfq19h(String dfq19h) {
        this.dfq19h = dfq19h;
    }

    public String getDfq20h() {
        return dfq20h;
    }

    public void setDfq20h(String dfq20h) {
        this.dfq20h = dfq20h;
    }

    public String getDfq21h() {
        return dfq21h;
    }

    public void setDfq21h(String dfq21h) {
        this.dfq21h = dfq21h;
    }

    public String getDfq22h() {
        return dfq22h;
    }

    public void setDfq22h(String dfq22h) {
        this.dfq22h = dfq22h;
    }

    public String getDfq23h() {
        return dfq23h;
    }

    public void setDfq23h(String dfq23h) {
        this.dfq23h = dfq23h;
    }

    public String getDfq24h() {
        return dfq24h;
    }

    public void setDfq24h(String dfq24h) {
        this.dfq24h = dfq24h;
    }

    public String getMrCode() {
        return mrCode;
    }

    public void setMrCode(String mrCode) {
        this.mrCode = mrCode;
    }

    public String getMrName() {
        return mrName;
    }

    public void setMrName(String mrName) {
        this.mrName = mrName;
    }

    public String getDayDetail() {
        return dayDetail;
    }

    public void setDayDetail(String dayDetail) {
        this.dayDetail = dayDetail;
    }

    @Override
    public String toString() {
        return "Ordmdfq{" +
        "dfqDept=" + dfqDept +
        ", dfqFreq=" + dfqFreq +
        ", dfqCycl=" + dfqCycl +
        ", dfqCont=" + dfqCont +
        ", dfqIntv=" + dfqIntv +
        ", dfqCexp=" + dfqCexp +
        ", dfqNote=" + dfqNote +
        ", dfqHicd=" + dfqHicd +
        ", dfqOrder=" + dfqOrder +
        ", dfq01h=" + dfq01h +
        ", dfq02h=" + dfq02h +
        ", dfq03h=" + dfq03h +
        ", dfq04h=" + dfq04h +
        ", dfq05h=" + dfq05h +
        ", dfq06h=" + dfq06h +
        ", dfq07h=" + dfq07h +
        ", dfq08h=" + dfq08h +
        ", dfq09h=" + dfq09h +
        ", dfq10h=" + dfq10h +
        ", dfq11h=" + dfq11h +
        ", dfq12h=" + dfq12h +
        ", dfq13h=" + dfq13h +
        ", dfq14h=" + dfq14h +
        ", dfq15h=" + dfq15h +
        ", dfq16h=" + dfq16h +
        ", dfq17h=" + dfq17h +
        ", dfq18h=" + dfq18h +
        ", dfq19h=" + dfq19h +
        ", dfq20h=" + dfq20h +
        ", dfq21h=" + dfq21h +
        ", dfq22h=" + dfq22h +
        ", dfq23h=" + dfq23h +
        ", dfq24h=" + dfq24h +
        ", mrCode=" + mrCode +
        ", mrName=" + mrName +
        ", dayDetail=" + dayDetail +
        "}";
    }
}

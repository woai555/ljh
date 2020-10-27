package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class ViewYytHospitalFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String zhuyuanhao;

    private String shenfenzheng;

    private Integer times;

    private LocalDateTime inTime;

    private String status;

    private String patName;

    private String keshi;

    private String bingqu;

    private BigDecimal yajin;

    private BigDecimal totalMoney;

    private LocalDateTime outTime;


    public String getZhuyuanhao() {
        return zhuyuanhao;
    }

    public void setZhuyuanhao(String zhuyuanhao) {
        this.zhuyuanhao = zhuyuanhao;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalDateTime inTime) {
        this.inTime = inTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getKeshi() {
        return keshi;
    }

    public void setKeshi(String keshi) {
        this.keshi = keshi;
    }

    public String getBingqu() {
        return bingqu;
    }

    public void setBingqu(String bingqu) {
        this.bingqu = bingqu;
    }

    public BigDecimal getYajin() {
        return yajin;
    }

    public void setYajin(BigDecimal yajin) {
        this.yajin = yajin;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public LocalDateTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }

    @Override
    public String toString() {
        return "ViewYytHospitalFee{" +
        "zhuyuanhao=" + zhuyuanhao +
        ", shenfenzheng=" + shenfenzheng +
        ", times=" + times +
        ", inTime=" + inTime +
        ", status=" + status +
        ", patName=" + patName +
        ", keshi=" + keshi +
        ", bingqu=" + bingqu +
        ", yajin=" + yajin +
        ", totalMoney=" + totalMoney +
        ", outTime=" + outTime +
        "}";
    }
}

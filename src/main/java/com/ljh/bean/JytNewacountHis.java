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
public class JytNewacountHis implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String aliorderid;

    private String dingdanhao;

    private String kahao;

    private String huanzhe;

    private String keshi;

    private String guahaoliushui;

    private LocalDateTime zhifushijian;

    private LocalDateTime kanzhenshijian;

    private String laiyuan;

    private BigDecimal zongjine;

    private BigDecimal shebaojine;

    private BigDecimal ybzhanghu;

    private BigDecimal zifeijine;

    private String status;

    private String quhaoren;

    private String tuihaoren;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAliorderid() {
        return aliorderid;
    }

    public void setAliorderid(String aliorderid) {
        this.aliorderid = aliorderid;
    }

    public String getDingdanhao() {
        return dingdanhao;
    }

    public void setDingdanhao(String dingdanhao) {
        this.dingdanhao = dingdanhao;
    }

    public String getKahao() {
        return kahao;
    }

    public void setKahao(String kahao) {
        this.kahao = kahao;
    }

    public String getHuanzhe() {
        return huanzhe;
    }

    public void setHuanzhe(String huanzhe) {
        this.huanzhe = huanzhe;
    }

    public String getKeshi() {
        return keshi;
    }

    public void setKeshi(String keshi) {
        this.keshi = keshi;
    }

    public String getGuahaoliushui() {
        return guahaoliushui;
    }

    public void setGuahaoliushui(String guahaoliushui) {
        this.guahaoliushui = guahaoliushui;
    }

    public LocalDateTime getZhifushijian() {
        return zhifushijian;
    }

    public void setZhifushijian(LocalDateTime zhifushijian) {
        this.zhifushijian = zhifushijian;
    }

    public LocalDateTime getKanzhenshijian() {
        return kanzhenshijian;
    }

    public void setKanzhenshijian(LocalDateTime kanzhenshijian) {
        this.kanzhenshijian = kanzhenshijian;
    }

    public String getLaiyuan() {
        return laiyuan;
    }

    public void setLaiyuan(String laiyuan) {
        this.laiyuan = laiyuan;
    }

    public BigDecimal getZongjine() {
        return zongjine;
    }

    public void setZongjine(BigDecimal zongjine) {
        this.zongjine = zongjine;
    }

    public BigDecimal getShebaojine() {
        return shebaojine;
    }

    public void setShebaojine(BigDecimal shebaojine) {
        this.shebaojine = shebaojine;
    }

    public BigDecimal getYbzhanghu() {
        return ybzhanghu;
    }

    public void setYbzhanghu(BigDecimal ybzhanghu) {
        this.ybzhanghu = ybzhanghu;
    }

    public BigDecimal getZifeijine() {
        return zifeijine;
    }

    public void setZifeijine(BigDecimal zifeijine) {
        this.zifeijine = zifeijine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuhaoren() {
        return quhaoren;
    }

    public void setQuhaoren(String quhaoren) {
        this.quhaoren = quhaoren;
    }

    public String getTuihaoren() {
        return tuihaoren;
    }

    public void setTuihaoren(String tuihaoren) {
        this.tuihaoren = tuihaoren;
    }

    @Override
    public String toString() {
        return "JytNewacountHis{" +
        "cardNo=" + cardNo +
        ", aliorderid=" + aliorderid +
        ", dingdanhao=" + dingdanhao +
        ", kahao=" + kahao +
        ", huanzhe=" + huanzhe +
        ", keshi=" + keshi +
        ", guahaoliushui=" + guahaoliushui +
        ", zhifushijian=" + zhifushijian +
        ", kanzhenshijian=" + kanzhenshijian +
        ", laiyuan=" + laiyuan +
        ", zongjine=" + zongjine +
        ", shebaojine=" + shebaojine +
        ", ybzhanghu=" + ybzhanghu +
        ", zifeijine=" + zifeijine +
        ", status=" + status +
        ", quhaoren=" + quhaoren +
        ", tuihaoren=" + tuihaoren +
        "}";
    }
}

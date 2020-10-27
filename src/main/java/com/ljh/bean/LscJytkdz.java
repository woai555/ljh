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
public class LscJytkdz implements Serializable {

    private static final long serialVersionUID=1L;

    private String jylsh;

    private String jylx;

    private String jysj;

    private String cardNo;

    private String card;

    private String patientname;

    private BigDecimal je;


    public String getJylsh() {
        return jylsh;
    }

    public void setJylsh(String jylsh) {
        this.jylsh = jylsh;
    }

    public String getJylx() {
        return jylx;
    }

    public void setJylx(String jylx) {
        this.jylx = jylx;
    }

    public String getJysj() {
        return jysj;
    }

    public void setJysj(String jysj) {
        this.jysj = jysj;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public BigDecimal getJe() {
        return je;
    }

    public void setJe(BigDecimal je) {
        this.je = je;
    }

    @Override
    public String toString() {
        return "LscJytkdz{" +
        "jylsh=" + jylsh +
        ", jylx=" + jylx +
        ", jysj=" + jysj +
        ", cardNo=" + cardNo +
        ", card=" + card +
        ", patientname=" + patientname +
        ", je=" + je +
        "}";
    }
}

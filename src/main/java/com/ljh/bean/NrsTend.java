package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护理评估表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsTend implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 入院方式
     */
    private String inWay;

    /**
     * 入院处置
     */
    private String inAction;

    /**
     * 护理体查T
     */
    private BigDecimal tendExamT;

    /**
     * 护理体查P
     */
    private BigDecimal tendExamP;

    /**
     * 护理体查R
     */
    private BigDecimal tendExamR;

    /**
     * 护理体查BP
     */
    private String tendExamBp;

    /**
     * 护理体查KG
     */
    private Integer tendExamKg;

    /**
     * 意识状态
     */
    private String conStatus;

    /**
     * 瞳孔
     */
    private String pupil;

    /**
     * 对光反射
     */
    private String echo;

    /**
     * 营养及水分
     */
    private String water;

    /**
     * 面容及表情
     */
    private String face;

    /**
     * 呼吸
     */
    private String breath;

    /**
     * 咳漱
     */
    private String well;

    /**
     * 痰
     */
    private String phlegm;

    /**
     * 性质
     */
    private String kind;

    /**
     * 咳血
     */
    private String blood;

    /**
     * 心律
     */
    private String heart;

    /**
     * 早搏
     */
    private String beat;

    /**
     * 其他
     */
    private String remark;

    /**
     * 皮肤
     */
    private String skin;

    /**
     * 疮
     */
    private String sore;

    /**
     * 睡眠
     */
    private String sleep;

    /**
     * 饮食
     */
    private String drink;

    /**
     * 其他
     */
    private String dRemark;

    /**
     * 舒适
     */
    private String comfort;

    /**
     * 部位
     */
    private String part;

    /**
     * 性质
     */
    private String charactor;

    /**
     * 活动
     */
    private String sport;

    /**
     * 不能活动：上肢
     */
    private String unactionU;

    /**
     * 不能活动：下肢
     */
    private String unactionD;

    /**
     * 生活自理能力
     */
    private String self;

    /**
     * 感觉
     */
    private String feelong;

    /**
     * 缺损：视觉
     */
    private String eye;

    /**
     * 缺损：听觉
     */
    private String listen;

    /**
     * 沟通
     */
    private String speak;

    /**
     * 排泄：小便
     */
    private String pee;

    /**
     * 排泄：大便
     */
    private String stool;

    /**
     * 便秘
     */
    private BigDecimal astrication;

    /**
     * 腹泻
     */
    private BigDecimal scour;

    /**
     * 对自身疾病的感知
     */
    private String feelingSelf;

    /**
     * 心理状况
     */
    private String mind;

    /**
     * 既往病史
     */
    private String ago;

    /**
     * 家庭史
     */
    private String family;

    /**
     * 过敏史
     */
    private String hyper;

    /**
     * 家属态度
     */
    private String sib;

    /**
     * 医疗费支付
     */
    private String costWay;

    /**
     * 其他
     */
    private String qita;

    private String operCode;

    private String operName;

    private LocalDateTime operTime;

    private String write;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getInWay() {
        return inWay;
    }

    public void setInWay(String inWay) {
        this.inWay = inWay;
    }

    public String getInAction() {
        return inAction;
    }

    public void setInAction(String inAction) {
        this.inAction = inAction;
    }

    public BigDecimal getTendExamT() {
        return tendExamT;
    }

    public void setTendExamT(BigDecimal tendExamT) {
        this.tendExamT = tendExamT;
    }

    public BigDecimal getTendExamP() {
        return tendExamP;
    }

    public void setTendExamP(BigDecimal tendExamP) {
        this.tendExamP = tendExamP;
    }

    public BigDecimal getTendExamR() {
        return tendExamR;
    }

    public void setTendExamR(BigDecimal tendExamR) {
        this.tendExamR = tendExamR;
    }

    public String getTendExamBp() {
        return tendExamBp;
    }

    public void setTendExamBp(String tendExamBp) {
        this.tendExamBp = tendExamBp;
    }

    public Integer getTendExamKg() {
        return tendExamKg;
    }

    public void setTendExamKg(Integer tendExamKg) {
        this.tendExamKg = tendExamKg;
    }

    public String getConStatus() {
        return conStatus;
    }

    public void setConStatus(String conStatus) {
        this.conStatus = conStatus;
    }

    public String getPupil() {
        return pupil;
    }

    public void setPupil(String pupil) {
        this.pupil = pupil;
    }

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBreath() {
        return breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getWell() {
        return well;
    }

    public void setWell(String well) {
        this.well = well;
    }

    public String getPhlegm() {
        return phlegm;
    }

    public void setPhlegm(String phlegm) {
        this.phlegm = phlegm;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getSore() {
        return sore;
    }

    public void setSore(String sore) {
        this.sore = sore;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getdRemark() {
        return dRemark;
    }

    public void setdRemark(String dRemark) {
        this.dRemark = dRemark;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getCharactor() {
        return charactor;
    }

    public void setCharactor(String charactor) {
        this.charactor = charactor;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getUnactionU() {
        return unactionU;
    }

    public void setUnactionU(String unactionU) {
        this.unactionU = unactionU;
    }

    public String getUnactionD() {
        return unactionD;
    }

    public void setUnactionD(String unactionD) {
        this.unactionD = unactionD;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getFeelong() {
        return feelong;
    }

    public void setFeelong(String feelong) {
        this.feelong = feelong;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getListen() {
        return listen;
    }

    public void setListen(String listen) {
        this.listen = listen;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getPee() {
        return pee;
    }

    public void setPee(String pee) {
        this.pee = pee;
    }

    public String getStool() {
        return stool;
    }

    public void setStool(String stool) {
        this.stool = stool;
    }

    public BigDecimal getAstrication() {
        return astrication;
    }

    public void setAstrication(BigDecimal astrication) {
        this.astrication = astrication;
    }

    public BigDecimal getScour() {
        return scour;
    }

    public void setScour(BigDecimal scour) {
        this.scour = scour;
    }

    public String getFeelingSelf() {
        return feelingSelf;
    }

    public void setFeelingSelf(String feelingSelf) {
        this.feelingSelf = feelingSelf;
    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }

    public String getAgo() {
        return ago;
    }

    public void setAgo(String ago) {
        this.ago = ago;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getHyper() {
        return hyper;
    }

    public void setHyper(String hyper) {
        this.hyper = hyper;
    }

    public String getSib() {
        return sib;
    }

    public void setSib(String sib) {
        this.sib = sib;
    }

    public String getCostWay() {
        return costWay;
    }

    public void setCostWay(String costWay) {
        this.costWay = costWay;
    }

    public String getQita() {
        return qita;
    }

    public void setQita(String qita) {
        this.qita = qita;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public LocalDateTime getOperTime() {
        return operTime;
    }

    public void setOperTime(LocalDateTime operTime) {
        this.operTime = operTime;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    @Override
    public String toString() {
        return "NrsTend{" +
        "inpatientNo=" + inpatientNo +
        ", inWay=" + inWay +
        ", inAction=" + inAction +
        ", tendExamT=" + tendExamT +
        ", tendExamP=" + tendExamP +
        ", tendExamR=" + tendExamR +
        ", tendExamBp=" + tendExamBp +
        ", tendExamKg=" + tendExamKg +
        ", conStatus=" + conStatus +
        ", pupil=" + pupil +
        ", echo=" + echo +
        ", water=" + water +
        ", face=" + face +
        ", breath=" + breath +
        ", well=" + well +
        ", phlegm=" + phlegm +
        ", kind=" + kind +
        ", blood=" + blood +
        ", heart=" + heart +
        ", beat=" + beat +
        ", remark=" + remark +
        ", skin=" + skin +
        ", sore=" + sore +
        ", sleep=" + sleep +
        ", drink=" + drink +
        ", dRemark=" + dRemark +
        ", comfort=" + comfort +
        ", part=" + part +
        ", charactor=" + charactor +
        ", sport=" + sport +
        ", unactionU=" + unactionU +
        ", unactionD=" + unactionD +
        ", self=" + self +
        ", feelong=" + feelong +
        ", eye=" + eye +
        ", listen=" + listen +
        ", speak=" + speak +
        ", pee=" + pee +
        ", stool=" + stool +
        ", astrication=" + astrication +
        ", scour=" + scour +
        ", feelingSelf=" + feelingSelf +
        ", mind=" + mind +
        ", ago=" + ago +
        ", family=" + family +
        ", hyper=" + hyper +
        ", sib=" + sib +
        ", costWay=" + costWay +
        ", qita=" + qita +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", operTime=" + operTime +
        ", write=" + write +
        "}";
    }
}

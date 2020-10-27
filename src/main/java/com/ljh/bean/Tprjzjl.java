package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 救治记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Tprjzjl implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 救治编码
     */
    @TableId(value = "TREATMENT_CODE", type = IdType.AUTO)
    private String treatmentCode;

    /**
     * 任务编码
     */
    private String missionCode;

    /**
     * 时间
     */
    private String jzjlTime;

    /**
     * BP1
     */
    private String bp1;

    /**
     * BP2
     */
    private String bp2;

    /**
     * HR
     */
    private String hr;

    /**
     * 呼吸
     */
    private String breathing;

    /**
     * 病情
     */
    private String illness;

    /**
     * 抢救效果
     */
    private String rescueEffect;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastupdatetime;


    public String getTreatmentCode() {
        return treatmentCode;
    }

    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    public String getMissionCode() {
        return missionCode;
    }

    public void setMissionCode(String missionCode) {
        this.missionCode = missionCode;
    }

    public String getJzjlTime() {
        return jzjlTime;
    }

    public void setJzjlTime(String jzjlTime) {
        this.jzjlTime = jzjlTime;
    }

    public String getBp1() {
        return bp1;
    }

    public void setBp1(String bp1) {
        this.bp1 = bp1;
    }

    public String getBp2() {
        return bp2;
    }

    public void setBp2(String bp2) {
        this.bp2 = bp2;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getBreathing() {
        return breathing;
    }

    public void setBreathing(String breathing) {
        this.breathing = breathing;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getRescueEffect() {
        return rescueEffect;
    }

    public void setRescueEffect(String rescueEffect) {
        this.rescueEffect = rescueEffect;
    }

    public LocalDateTime getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(LocalDateTime lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    @Override
    public String toString() {
        return "Tprjzjl{" +
        "treatmentCode=" + treatmentCode +
        ", missionCode=" + missionCode +
        ", jzjlTime=" + jzjlTime +
        ", bp1=" + bp1 +
        ", bp2=" + bp2 +
        ", hr=" + hr +
        ", breathing=" + breathing +
        ", illness=" + illness +
        ", rescueEffect=" + rescueEffect +
        ", lastupdatetime=" + lastupdatetime +
        "}";
    }
}

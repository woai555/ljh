package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医管局标准药品类型
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MApproveMedtype implements Serializable {

    private static final long serialVersionUID=1L;

    private String medicinecode;

    private String medicinename;

    private String specs;

    /**
     * 基本药物
     */
    private String jbyw;

    /**
     * 抗癌药物
     */
    private String kayw;

    /**
     * 集中采购
     */
    private String jzcg;

    /**
     * 抗菌药物
     */
    private String kjyw;

    /**
     * 自费药物
     */
    private String zfyw;

    /**
     * 辅助用药
     */
    private String fzyy;

    /**
     * 中药注射剂
     */
    private String zyzsj;


    public String getMedicinecode() {
        return medicinecode;
    }

    public void setMedicinecode(String medicinecode) {
        this.medicinecode = medicinecode;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getJbyw() {
        return jbyw;
    }

    public void setJbyw(String jbyw) {
        this.jbyw = jbyw;
    }

    public String getKayw() {
        return kayw;
    }

    public void setKayw(String kayw) {
        this.kayw = kayw;
    }

    public String getJzcg() {
        return jzcg;
    }

    public void setJzcg(String jzcg) {
        this.jzcg = jzcg;
    }

    public String getKjyw() {
        return kjyw;
    }

    public void setKjyw(String kjyw) {
        this.kjyw = kjyw;
    }

    public String getZfyw() {
        return zfyw;
    }

    public void setZfyw(String zfyw) {
        this.zfyw = zfyw;
    }

    public String getFzyy() {
        return fzyy;
    }

    public void setFzyy(String fzyy) {
        this.fzyy = fzyy;
    }

    public String getZyzsj() {
        return zyzsj;
    }

    public void setZyzsj(String zyzsj) {
        this.zyzsj = zyzsj;
    }

    @Override
    public String toString() {
        return "MApproveMedtype{" +
        "medicinecode=" + medicinecode +
        ", medicinename=" + medicinename +
        ", specs=" + specs +
        ", jbyw=" + jbyw +
        ", kayw=" + kayw +
        ", jzcg=" + jzcg +
        ", kjyw=" + kjyw +
        ", zfyw=" + zfyw +
        ", fzyy=" + fzyy +
        ", zyzsj=" + zyzsj +
        "}";
    }
}

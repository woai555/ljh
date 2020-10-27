package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 损伤中毒归类模板档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrms167 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计归类码
     */
    private Integer diseaseCode;

    /**
     * 统计归类名称
     */
    private String diseaseName;

    /**
     * 总计
     */
    private Integer sumAll;

    /**
     * 患者总计
     */
    private Integer sumPart;

    /**
     * 治愈数
     */
    private Integer rtn1;

    /**
     * 好转数
     */
    private Integer rtn2;

    /**
     * 未愈数
     */
    private Integer rtn3;

    /**
     * 死亡数
     */
    private Integer rtn4;

    /**
     * 住院天数
     */
    private Integer inbedDays;

    /**
     * 父项代码
     */
    private Integer parentitem;

    /**
     * 下级项目数
     */
    private Integer sublines;


    public Integer getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(Integer diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public Integer getSumAll() {
        return sumAll;
    }

    public void setSumAll(Integer sumAll) {
        this.sumAll = sumAll;
    }

    public Integer getSumPart() {
        return sumPart;
    }

    public void setSumPart(Integer sumPart) {
        this.sumPart = sumPart;
    }

    public Integer getRtn1() {
        return rtn1;
    }

    public void setRtn1(Integer rtn1) {
        this.rtn1 = rtn1;
    }

    public Integer getRtn2() {
        return rtn2;
    }

    public void setRtn2(Integer rtn2) {
        this.rtn2 = rtn2;
    }

    public Integer getRtn3() {
        return rtn3;
    }

    public void setRtn3(Integer rtn3) {
        this.rtn3 = rtn3;
    }

    public Integer getRtn4() {
        return rtn4;
    }

    public void setRtn4(Integer rtn4) {
        this.rtn4 = rtn4;
    }

    public Integer getInbedDays() {
        return inbedDays;
    }

    public void setInbedDays(Integer inbedDays) {
        this.inbedDays = inbedDays;
    }

    public Integer getParentitem() {
        return parentitem;
    }

    public void setParentitem(Integer parentitem) {
        this.parentitem = parentitem;
    }

    public Integer getSublines() {
        return sublines;
    }

    public void setSublines(Integer sublines) {
        this.sublines = sublines;
    }

    @Override
    public String toString() {
        return "Mrms167{" +
        "diseaseCode=" + diseaseCode +
        ", diseaseName=" + diseaseName +
        ", sumAll=" + sumAll +
        ", sumPart=" + sumPart +
        ", rtn1=" + rtn1 +
        ", rtn2=" + rtn2 +
        ", rtn3=" + rtn3 +
        ", rtn4=" + rtn4 +
        ", inbedDays=" + inbedDays +
        ", parentitem=" + parentitem +
        ", sublines=" + sublines +
        "}";
    }
}

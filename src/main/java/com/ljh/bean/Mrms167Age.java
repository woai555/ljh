package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 173种疾病按年龄分类模板档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrms167Age implements Serializable {

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
     * 患者总计
     */
    private Integer sumPart;

    /**
     * 0-4
     */
    private Integer age1;

    /**
     * 5-14
     */
    private Integer age2;

    /**
     * 15-44
     */
    private Integer age3;

    /**
     * 44-59
     */
    private Integer age4;

    /**
     * 60-
     */
    private Integer age5;

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

    public Integer getSumPart() {
        return sumPart;
    }

    public void setSumPart(Integer sumPart) {
        this.sumPart = sumPart;
    }

    public Integer getAge1() {
        return age1;
    }

    public void setAge1(Integer age1) {
        this.age1 = age1;
    }

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public Integer getAge3() {
        return age3;
    }

    public void setAge3(Integer age3) {
        this.age3 = age3;
    }

    public Integer getAge4() {
        return age4;
    }

    public void setAge4(Integer age4) {
        this.age4 = age4;
    }

    public Integer getAge5() {
        return age5;
    }

    public void setAge5(Integer age5) {
        this.age5 = age5;
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
        return "Mrms167Age{" +
        "diseaseCode=" + diseaseCode +
        ", diseaseName=" + diseaseName +
        ", sumPart=" + sumPart +
        ", age1=" + age1 +
        ", age2=" + age2 +
        ", age3=" + age3 +
        ", age4=" + age4 +
        ", age5=" + age5 +
        ", inbedDays=" + inbedDays +
        ", parentitem=" + parentitem +
        ", sublines=" + sublines +
        "}";
    }
}

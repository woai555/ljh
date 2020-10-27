package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 导入药品提示临时建的表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MedicineHintsTemp implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugCode;

    private String indication;

    private String usage;

    private String childrenusage;

    private String seniorusage;

    private String pregnantusage;

    private String note1;

    private String note2;

    private String note3;

    private String note4;

    private String note5;

    private String isdanger;


    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getChildrenusage() {
        return childrenusage;
    }

    public void setChildrenusage(String childrenusage) {
        this.childrenusage = childrenusage;
    }

    public String getSeniorusage() {
        return seniorusage;
    }

    public void setSeniorusage(String seniorusage) {
        this.seniorusage = seniorusage;
    }

    public String getPregnantusage() {
        return pregnantusage;
    }

    public void setPregnantusage(String pregnantusage) {
        this.pregnantusage = pregnantusage;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }

    public String getIsdanger() {
        return isdanger;
    }

    public void setIsdanger(String isdanger) {
        this.isdanger = isdanger;
    }

    @Override
    public String toString() {
        return "MedicineHintsTemp{" +
        "drugCode=" + drugCode +
        ", indication=" + indication +
        ", usage=" + usage +
        ", childrenusage=" + childrenusage +
        ", seniorusage=" + seniorusage +
        ", pregnantusage=" + pregnantusage +
        ", note1=" + note1 +
        ", note2=" + note2 +
        ", note3=" + note3 +
        ", note4=" + note4 +
        ", note5=" + note5 +
        ", isdanger=" + isdanger +
        "}";
    }
}

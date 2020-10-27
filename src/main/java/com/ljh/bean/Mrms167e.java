package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * designed by 陈宇
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrms167e implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 损伤中毒分类码
     */
    private String e167Reason;

    /**
     * 损伤中毒分类名称
     */
    private String e167Name;

    /**
     * 出院人数总计
     */
    private Integer sumAll;

    /**
     * 出院人数小计
     */
    private Integer sumPart;

    /**
     * 治愈
     */
    private Integer rtn1;

    /**
     * 好转
     */
    private Integer rtn2;

    /**
     * 未愈
     */
    private Integer rtn3;

    /**
     * 死亡
     */
    private Integer rtn4;

    /**
     * 出院者占用总床日数
     */
    private Integer inbedDays;

    /**
     * 直接父项
     */
    private Integer parentitem;


    public String getE167Reason() {
        return e167Reason;
    }

    public void setE167Reason(String e167Reason) {
        this.e167Reason = e167Reason;
    }

    public String getE167Name() {
        return e167Name;
    }

    public void setE167Name(String e167Name) {
        this.e167Name = e167Name;
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

    @Override
    public String toString() {
        return "Mrms167e{" +
        "e167Reason=" + e167Reason +
        ", e167Name=" + e167Name +
        ", sumAll=" + sumAll +
        ", sumPart=" + sumPart +
        ", rtn1=" + rtn1 +
        ", rtn2=" + rtn2 +
        ", rtn3=" + rtn3 +
        ", rtn4=" + rtn4 +
        ", inbedDays=" + inbedDays +
        ", parentitem=" + parentitem +
        "}";
    }
}

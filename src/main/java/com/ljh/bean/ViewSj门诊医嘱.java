package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("VIEW_SJ_门诊医嘱")
public class ViewSj门诊医嘱 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 医嘱编号;

    private String 科别;

    private String 医生编号;

    private String 医嘱时间;

    private Integer 分项序号;

    private String 医嘱类别;

    private String 医嘱项目编号;

    private BigDecimal 数量;


    public String get诊疗卡号() {
        return 诊疗卡号;
    }

    public void set诊疗卡号(String 诊疗卡号) {
        this.诊疗卡号 = 诊疗卡号;
    }

    public String get医嘱编号() {
        return 医嘱编号;
    }

    public void set医嘱编号(String 医嘱编号) {
        this.医嘱编号 = 医嘱编号;
    }

    public String get科别() {
        return 科别;
    }

    public void set科别(String 科别) {
        this.科别 = 科别;
    }

    public String get医生编号() {
        return 医生编号;
    }

    public void set医生编号(String 医生编号) {
        this.医生编号 = 医生编号;
    }

    public String get医嘱时间() {
        return 医嘱时间;
    }

    public void set医嘱时间(String 医嘱时间) {
        this.医嘱时间 = 医嘱时间;
    }

    public Integer get分项序号() {
        return 分项序号;
    }

    public void set分项序号(Integer 分项序号) {
        this.分项序号 = 分项序号;
    }

    public String get医嘱类别() {
        return 医嘱类别;
    }

    public void set医嘱类别(String 医嘱类别) {
        this.医嘱类别 = 医嘱类别;
    }

    public String get医嘱项目编号() {
        return 医嘱项目编号;
    }

    public void set医嘱项目编号(String 医嘱项目编号) {
        this.医嘱项目编号 = 医嘱项目编号;
    }

    public BigDecimal get数量() {
        return 数量;
    }

    public void set数量(BigDecimal 数量) {
        this.数量 = 数量;
    }

    @Override
    public String toString() {
        return "ViewSj门诊医嘱{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 医嘱编号=" + 医嘱编号 +
        ", 科别=" + 科别 +
        ", 医生编号=" + 医生编号 +
        ", 医嘱时间=" + 医嘱时间 +
        ", 分项序号=" + 分项序号 +
        ", 医嘱类别=" + 医嘱类别 +
        ", 医嘱项目编号=" + 医嘱项目编号 +
        ", 数量=" + 数量 +
        "}";
    }
}

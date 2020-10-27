package com.ljh.bean;

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
@TableName("VIEW_SJ_诊疗卡")
public class ViewSj诊疗卡 implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 姓名;

    private String 患者类别;

    private String 性别;

    private String 出生年月;

    private String 身份证号;

    private String 医保卡号;

    private String 建诊疗卡时间;


    public String get诊疗卡号() {
        return 诊疗卡号;
    }

    public void set诊疗卡号(String 诊疗卡号) {
        this.诊疗卡号 = 诊疗卡号;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public String get患者类别() {
        return 患者类别;
    }

    public void set患者类别(String 患者类别) {
        this.患者类别 = 患者类别;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public String get出生年月() {
        return 出生年月;
    }

    public void set出生年月(String 出生年月) {
        this.出生年月 = 出生年月;
    }

    public String get身份证号() {
        return 身份证号;
    }

    public void set身份证号(String 身份证号) {
        this.身份证号 = 身份证号;
    }

    public String get医保卡号() {
        return 医保卡号;
    }

    public void set医保卡号(String 医保卡号) {
        this.医保卡号 = 医保卡号;
    }

    public String get建诊疗卡时间() {
        return 建诊疗卡时间;
    }

    public void set建诊疗卡时间(String 建诊疗卡时间) {
        this.建诊疗卡时间 = 建诊疗卡时间;
    }

    @Override
    public String toString() {
        return "ViewSj诊疗卡{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 姓名=" + 姓名 +
        ", 患者类别=" + 患者类别 +
        ", 性别=" + 性别 +
        ", 出生年月=" + 出生年月 +
        ", 身份证号=" + 身份证号 +
        ", 医保卡号=" + 医保卡号 +
        ", 建诊疗卡时间=" + 建诊疗卡时间 +
        "}";
    }
}

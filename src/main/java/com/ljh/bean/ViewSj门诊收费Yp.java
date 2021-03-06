package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
@TableName("VIEW_SJ_门诊收费_YP")
public class ViewSj门诊收费Yp implements Serializable {

    private static final long serialVersionUID=1L;

    private String 诊疗卡号;

    private String 科室编码;

    private String 科室名称;

    private String 医嘱编号;

    private Integer 分项序号;

    private String 收费项目;

    private String 类型;

    private String 剂型;

    private BigDecimal 剂量;

    private BigDecimal 单价;

    private BigDecimal 数量;

    private Integer 付数;

    private BigDecimal 金额;

    private LocalDateTime 交费时间;

    private String 收款员;

    private LocalDateTime 结账时间;


    public String get诊疗卡号() {
        return 诊疗卡号;
    }

    public void set诊疗卡号(String 诊疗卡号) {
        this.诊疗卡号 = 诊疗卡号;
    }

    public String get科室编码() {
        return 科室编码;
    }

    public void set科室编码(String 科室编码) {
        this.科室编码 = 科室编码;
    }

    public String get科室名称() {
        return 科室名称;
    }

    public void set科室名称(String 科室名称) {
        this.科室名称 = 科室名称;
    }

    public String get医嘱编号() {
        return 医嘱编号;
    }

    public void set医嘱编号(String 医嘱编号) {
        this.医嘱编号 = 医嘱编号;
    }

    public Integer get分项序号() {
        return 分项序号;
    }

    public void set分项序号(Integer 分项序号) {
        this.分项序号 = 分项序号;
    }

    public String get收费项目() {
        return 收费项目;
    }

    public void set收费项目(String 收费项目) {
        this.收费项目 = 收费项目;
    }

    public String get类型() {
        return 类型;
    }

    public void set类型(String 类型) {
        this.类型 = 类型;
    }

    public String get剂型() {
        return 剂型;
    }

    public void set剂型(String 剂型) {
        this.剂型 = 剂型;
    }

    public BigDecimal get剂量() {
        return 剂量;
    }

    public void set剂量(BigDecimal 剂量) {
        this.剂量 = 剂量;
    }

    public BigDecimal get单价() {
        return 单价;
    }

    public void set单价(BigDecimal 单价) {
        this.单价 = 单价;
    }

    public BigDecimal get数量() {
        return 数量;
    }

    public void set数量(BigDecimal 数量) {
        this.数量 = 数量;
    }

    public Integer get付数() {
        return 付数;
    }

    public void set付数(Integer 付数) {
        this.付数 = 付数;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    public LocalDateTime get交费时间() {
        return 交费时间;
    }

    public void set交费时间(LocalDateTime 交费时间) {
        this.交费时间 = 交费时间;
    }

    public String get收款员() {
        return 收款员;
    }

    public void set收款员(String 收款员) {
        this.收款员 = 收款员;
    }

    public LocalDateTime get结账时间() {
        return 结账时间;
    }

    public void set结账时间(LocalDateTime 结账时间) {
        this.结账时间 = 结账时间;
    }

    @Override
    public String toString() {
        return "ViewSj门诊收费Yp{" +
        "诊疗卡号=" + 诊疗卡号 +
        ", 科室编码=" + 科室编码 +
        ", 科室名称=" + 科室名称 +
        ", 医嘱编号=" + 医嘱编号 +
        ", 分项序号=" + 分项序号 +
        ", 收费项目=" + 收费项目 +
        ", 类型=" + 类型 +
        ", 剂型=" + 剂型 +
        ", 剂量=" + 剂量 +
        ", 单价=" + 单价 +
        ", 数量=" + 数量 +
        ", 付数=" + 付数 +
        ", 金额=" + 金额 +
        ", 交费时间=" + 交费时间 +
        ", 收款员=" + 收款员 +
        ", 结账时间=" + 结账时间 +
        "}";
    }
}

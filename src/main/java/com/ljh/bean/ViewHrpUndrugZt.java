package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewHrpUndrugZt implements Serializable {

    private static final long serialVersionUID=1L;

    private String 组套编码;

    private String 组套名称;

    private String 执行科室;

    private String 对应项目编码;

    private BigDecimal 组套中项目数量;

    private String 版本号;

    private String 启用时间;


    public String get组套编码() {
        return 组套编码;
    }

    public void set组套编码(String 组套编码) {
        this.组套编码 = 组套编码;
    }

    public String get组套名称() {
        return 组套名称;
    }

    public void set组套名称(String 组套名称) {
        this.组套名称 = 组套名称;
    }

    public String get执行科室() {
        return 执行科室;
    }

    public void set执行科室(String 执行科室) {
        this.执行科室 = 执行科室;
    }

    public String get对应项目编码() {
        return 对应项目编码;
    }

    public void set对应项目编码(String 对应项目编码) {
        this.对应项目编码 = 对应项目编码;
    }

    public BigDecimal get组套中项目数量() {
        return 组套中项目数量;
    }

    public void set组套中项目数量(BigDecimal 组套中项目数量) {
        this.组套中项目数量 = 组套中项目数量;
    }

    public String get版本号() {
        return 版本号;
    }

    public void set版本号(String 版本号) {
        this.版本号 = 版本号;
    }

    public String get启用时间() {
        return 启用时间;
    }

    public void set启用时间(String 启用时间) {
        this.启用时间 = 启用时间;
    }

    @Override
    public String toString() {
        return "ViewHrpUndrugZt{" +
        "组套编码=" + 组套编码 +
        ", 组套名称=" + 组套名称 +
        ", 执行科室=" + 执行科室 +
        ", 对应项目编码=" + 对应项目编码 +
        ", 组套中项目数量=" + 组套中项目数量 +
        ", 版本号=" + 版本号 +
        ", 启用时间=" + 启用时间 +
        "}";
    }
}

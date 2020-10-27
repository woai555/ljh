package com.ljh.bean;

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
public class ViewHrpEmployee implements Serializable {

    private static final long serialVersionUID=1L;

    private String 人员编码;

    private String 姓名;

    private String 科室编码;

    private String 岗位;

    private String 角色类型;

    private String 职业;

    private String 技术职级分类;

    private String 状态;

    private String 版本号;

    private String 启用时间;


    public String get人员编码() {
        return 人员编码;
    }

    public void set人员编码(String 人员编码) {
        this.人员编码 = 人员编码;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public String get科室编码() {
        return 科室编码;
    }

    public void set科室编码(String 科室编码) {
        this.科室编码 = 科室编码;
    }

    public String get岗位() {
        return 岗位;
    }

    public void set岗位(String 岗位) {
        this.岗位 = 岗位;
    }

    public String get角色类型() {
        return 角色类型;
    }

    public void set角色类型(String 角色类型) {
        this.角色类型 = 角色类型;
    }

    public String get职业() {
        return 职业;
    }

    public void set职业(String 职业) {
        this.职业 = 职业;
    }

    public String get技术职级分类() {
        return 技术职级分类;
    }

    public void set技术职级分类(String 技术职级分类) {
        this.技术职级分类 = 技术职级分类;
    }

    public String get状态() {
        return 状态;
    }

    public void set状态(String 状态) {
        this.状态 = 状态;
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
        return "ViewHrpEmployee{" +
        "人员编码=" + 人员编码 +
        ", 姓名=" + 姓名 +
        ", 科室编码=" + 科室编码 +
        ", 岗位=" + 岗位 +
        ", 角色类型=" + 角色类型 +
        ", 职业=" + 职业 +
        ", 技术职级分类=" + 技术职级分类 +
        ", 状态=" + 状态 +
        ", 版本号=" + 版本号 +
        ", 启用时间=" + 启用时间 +
        "}";
    }
}

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
public class MrmsAgeTotal implements Serializable {

    private static final long serialVersionUID=1L;

    private String type167;

    private String typeName;

    private Integer age0;

    private Integer age1;

    private Integer age5;

    private Integer age10;

    private Integer age15;

    private Integer age20;

    private Integer age30;

    private Integer age40;

    private Integer age50;

    private Integer age60;

    private Integer age70;

    private Integer age80;

    private Integer age85;

    private Integer levels;

    private String parentItem;


    public String getType167() {
        return type167;
    }

    public void setType167(String type167) {
        this.type167 = type167;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getAge0() {
        return age0;
    }

    public void setAge0(Integer age0) {
        this.age0 = age0;
    }

    public Integer getAge1() {
        return age1;
    }

    public void setAge1(Integer age1) {
        this.age1 = age1;
    }

    public Integer getAge5() {
        return age5;
    }

    public void setAge5(Integer age5) {
        this.age5 = age5;
    }

    public Integer getAge10() {
        return age10;
    }

    public void setAge10(Integer age10) {
        this.age10 = age10;
    }

    public Integer getAge15() {
        return age15;
    }

    public void setAge15(Integer age15) {
        this.age15 = age15;
    }

    public Integer getAge20() {
        return age20;
    }

    public void setAge20(Integer age20) {
        this.age20 = age20;
    }

    public Integer getAge30() {
        return age30;
    }

    public void setAge30(Integer age30) {
        this.age30 = age30;
    }

    public Integer getAge40() {
        return age40;
    }

    public void setAge40(Integer age40) {
        this.age40 = age40;
    }

    public Integer getAge50() {
        return age50;
    }

    public void setAge50(Integer age50) {
        this.age50 = age50;
    }

    public Integer getAge60() {
        return age60;
    }

    public void setAge60(Integer age60) {
        this.age60 = age60;
    }

    public Integer getAge70() {
        return age70;
    }

    public void setAge70(Integer age70) {
        this.age70 = age70;
    }

    public Integer getAge80() {
        return age80;
    }

    public void setAge80(Integer age80) {
        this.age80 = age80;
    }

    public Integer getAge85() {
        return age85;
    }

    public void setAge85(Integer age85) {
        this.age85 = age85;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public String getParentItem() {
        return parentItem;
    }

    public void setParentItem(String parentItem) {
        this.parentItem = parentItem;
    }

    @Override
    public String toString() {
        return "MrmsAgeTotal{" +
        "type167=" + type167 +
        ", typeName=" + typeName +
        ", age0=" + age0 +
        ", age1=" + age1 +
        ", age5=" + age5 +
        ", age10=" + age10 +
        ", age15=" + age15 +
        ", age20=" + age20 +
        ", age30=" + age30 +
        ", age40=" + age40 +
        ", age50=" + age50 +
        ", age60=" + age60 +
        ", age70=" + age70 +
        ", age80=" + age80 +
        ", age85=" + age85 +
        ", levels=" + levels +
        ", parentItem=" + parentItem +
        "}";
    }
}

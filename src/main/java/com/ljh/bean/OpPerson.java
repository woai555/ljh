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
public class OpPerson implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编码
     */
    @TableId(value = "CODE", type = IdType.AUTO)
    private String code;

    /**
     * 姓名
     */
    private String name;

    /**
     * 职务
     */
    private String posiCode;

    /**
     * 职级
     */
    private String levelCode;

    /**
     * 科室编码
     */
    private String deptcode;

    /**
     * 性别
     */
    private String sexCode;

    /**
     * 职责
     */
    private String duty;

    /**
     * 1有 2无
     */
    private String authority;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosiCode() {
        return posiCode;
    }

    public void setPosiCode(String posiCode) {
        this.posiCode = posiCode;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "OpPerson{" +
        "code=" + code +
        ", name=" + name +
        ", posiCode=" + posiCode +
        ", levelCode=" + levelCode +
        ", deptcode=" + deptcode +
        ", sexCode=" + sexCode +
        ", duty=" + duty +
        ", authority=" + authority +
        "}";
    }
}

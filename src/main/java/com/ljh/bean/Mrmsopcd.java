package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术代码档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsopcd implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 手术代码
     */
    @TableId(value = "OPER_CODE", type = IdType.AUTO)
    private String operCode;

    /**
     * 拼音码
     */
    private String operPycd;

    /**
     * 中文名称
     */
    private String operCnname;

    /**
     * 英文名称
     */
    private String operEnname;

    /**
     * 手术码1
     */
    private String operCode1;

    /**
     * 手术码2
     */
    private String operCode2;

    /**
     * 暂时不用3
     */
    private Integer operNum1;

    private String wbCode;


    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperPycd() {
        return operPycd;
    }

    public void setOperPycd(String operPycd) {
        this.operPycd = operPycd;
    }

    public String getOperCnname() {
        return operCnname;
    }

    public void setOperCnname(String operCnname) {
        this.operCnname = operCnname;
    }

    public String getOperEnname() {
        return operEnname;
    }

    public void setOperEnname(String operEnname) {
        this.operEnname = operEnname;
    }

    public String getOperCode1() {
        return operCode1;
    }

    public void setOperCode1(String operCode1) {
        this.operCode1 = operCode1;
    }

    public String getOperCode2() {
        return operCode2;
    }

    public void setOperCode2(String operCode2) {
        this.operCode2 = operCode2;
    }

    public Integer getOperNum1() {
        return operNum1;
    }

    public void setOperNum1(Integer operNum1) {
        this.operNum1 = operNum1;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    @Override
    public String toString() {
        return "Mrmsopcd{" +
        "operCode=" + operCode +
        ", operPycd=" + operPycd +
        ", operCnname=" + operCnname +
        ", operEnname=" + operEnname +
        ", operCode1=" + operCode1 +
        ", operCode2=" + operCode2 +
        ", operNum1=" + operNum1 +
        ", wbCode=" + wbCode +
        "}";
    }
}

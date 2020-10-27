package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 通用查询存储表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MrmsCommon implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 数据窗口对象名
     */
    @TableId(value = "DW_NAME", type = IdType.AUTO)
    private String dwName;

    /**
     * 序号
     */
    private Integer queryNumber;

    /**
     * 数据窗口对象的字段名
     */
    private String colName;

    /**
     * 数据库中对应字段名
     */
    private String colDbname;

    /**
     * 数据窗口对象中对应中文名
     */
    private String colCname;

    /**
     * 操作符
     */
    private String operator;

    /**
     * 数据项
     */
    private String datavalue;

    /**
     * 逻辑符
     */
    private String logical;

    /**
     * pb中的数据类型
     */
    private String datatype;

    /**
     * 子数据窗口名
     */
    private String dwChild;

    /**
     * 实际数据项
     */
    private String dwChildDatacol;

    /**
     * 显示数据项
     */
    private String dwChildDisplaycol;

    /**
     * 备注说明
     */
    private String demo;

    /**
     * 模板中文名
     */
    private String dwCname;

    /**
     * 左括号
     */
    private String leftBracket;

    /**
     * 右括号
     */
    private String rightBracket;


    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public Integer getQueryNumber() {
        return queryNumber;
    }

    public void setQueryNumber(Integer queryNumber) {
        this.queryNumber = queryNumber;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getColDbname() {
        return colDbname;
    }

    public void setColDbname(String colDbname) {
        this.colDbname = colDbname;
    }

    public String getColCname() {
        return colCname;
    }

    public void setColCname(String colCname) {
        this.colCname = colCname;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(String datavalue) {
        this.datavalue = datavalue;
    }

    public String getLogical() {
        return logical;
    }

    public void setLogical(String logical) {
        this.logical = logical;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getDwChild() {
        return dwChild;
    }

    public void setDwChild(String dwChild) {
        this.dwChild = dwChild;
    }

    public String getDwChildDatacol() {
        return dwChildDatacol;
    }

    public void setDwChildDatacol(String dwChildDatacol) {
        this.dwChildDatacol = dwChildDatacol;
    }

    public String getDwChildDisplaycol() {
        return dwChildDisplaycol;
    }

    public void setDwChildDisplaycol(String dwChildDisplaycol) {
        this.dwChildDisplaycol = dwChildDisplaycol;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getDwCname() {
        return dwCname;
    }

    public void setDwCname(String dwCname) {
        this.dwCname = dwCname;
    }

    public String getLeftBracket() {
        return leftBracket;
    }

    public void setLeftBracket(String leftBracket) {
        this.leftBracket = leftBracket;
    }

    public String getRightBracket() {
        return rightBracket;
    }

    public void setRightBracket(String rightBracket) {
        this.rightBracket = rightBracket;
    }

    @Override
    public String toString() {
        return "MrmsCommon{" +
        "dwName=" + dwName +
        ", queryNumber=" + queryNumber +
        ", colName=" + colName +
        ", colDbname=" + colDbname +
        ", colCname=" + colCname +
        ", operator=" + operator +
        ", datavalue=" + datavalue +
        ", logical=" + logical +
        ", datatype=" + datatype +
        ", dwChild=" + dwChild +
        ", dwChildDatacol=" + dwChildDatacol +
        ", dwChildDisplaycol=" + dwChildDisplaycol +
        ", demo=" + demo +
        ", dwCname=" + dwCname +
        ", leftBracket=" + leftBracket +
        ", rightBracket=" + rightBracket +
        "}";
    }
}

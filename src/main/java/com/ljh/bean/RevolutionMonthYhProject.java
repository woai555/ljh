package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医改监测月报表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RevolutionMonthYhProject implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编号
     */
    @TableId(value = "CODE", type = IdType.AUTO)
    private Integer code;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否显示
     */
    private String visibleYn;

    /**
     * 排序
     */
    private Integer sortNum;

    /**
     * 文档名
     */
    private String fileName;

    /**
     * 列名
     */
    private String columnName;

    /**
     * 单位
     */
    private String unit;

    /**
     * 备注
     */
    private String remark;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVisibleYn() {
        return visibleYn;
    }

    public void setVisibleYn(String visibleYn) {
        this.visibleYn = visibleYn;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RevolutionMonthYhProject{" +
        "code=" + code +
        ", name=" + name +
        ", visibleYn=" + visibleYn +
        ", sortNum=" + sortNum +
        ", fileName=" + fileName +
        ", columnName=" + columnName +
        ", unit=" + unit +
        ", remark=" + remark +
        "}";
    }
}

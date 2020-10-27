package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 科常用项目
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdUndrug implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 系统类别
     */
    private String itemClass;

    /**
     * 用途代码
     */
    private String itemType;

    /**
     * 用途名称
     */
    private String itemTypename;

    /**
     * 项目代码
     */
    private String itemCode;

    /**
     * 项目名称
     */
    private String itemName;

    /**
     * 输入码
     */
    private String inputCode;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemTypename() {
        return itemTypename;
    }

    public void setItemTypename(String itemTypename) {
        this.itemTypename = itemTypename;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    @Override
    public String toString() {
        return "OrdUndrug{" +
        "deptCode=" + deptCode +
        ", itemClass=" + itemClass +
        ", itemType=" + itemType +
        ", itemTypename=" + itemTypename +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", inputCode=" + inputCode +
        "}";
    }
}

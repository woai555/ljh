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
public class RRegAddpower implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;

    /**
     * 1可指定患者加号 2 可扩11点时段号源 3 二者皆可 4无加号权限
     */
    private String addType;

    private String emplName;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    @Override
    public String toString() {
        return "RRegAddpower{" +
        "emplCode=" + emplCode +
        ", addType=" + addType +
        ", emplName=" + emplName +
        "}";
    }
}

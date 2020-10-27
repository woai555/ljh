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
public class SupUnit implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "UNIT_CODE", type = IdType.AUTO)
    private String unitCode;

    private String unitName;


    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "SupUnit{" +
        "unitCode=" + unitCode +
        ", unitName=" + unitName +
        "}";
    }
}

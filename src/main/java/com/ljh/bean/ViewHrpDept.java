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
public class ViewHrpDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String unitid;

    private String unitname;

    private String unitcode;

    private String hosBranch;


    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getHosBranch() {
        return hosBranch;
    }

    public void setHosBranch(String hosBranch) {
        this.hosBranch = hosBranch;
    }

    @Override
    public String toString() {
        return "ViewHrpDept{" +
        "unitid=" + unitid +
        ", unitname=" + unitname +
        ", unitcode=" + unitcode +
        ", hosBranch=" + hosBranch +
        "}";
    }
}

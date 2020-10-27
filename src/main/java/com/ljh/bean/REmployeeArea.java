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
public class REmployeeArea implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;

    private String emplName;

    private String ynXinyuan;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getYnXinyuan() {
        return ynXinyuan;
    }

    public void setYnXinyuan(String ynXinyuan) {
        this.ynXinyuan = ynXinyuan;
    }

    @Override
    public String toString() {
        return "REmployeeArea{" +
        "emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", ynXinyuan=" + ynXinyuan +
        "}";
    }
}

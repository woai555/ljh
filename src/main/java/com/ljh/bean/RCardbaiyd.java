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
public class RCardbaiyd implements Serializable {

    private static final long serialVersionUID=1L;

    private String emplCode;

    private String emplName;

    private String doctCardid;


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

    public String getDoctCardid() {
        return doctCardid;
    }

    public void setDoctCardid(String doctCardid) {
        this.doctCardid = doctCardid;
    }

    @Override
    public String toString() {
        return "RCardbaiyd{" +
        "emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", doctCardid=" + doctCardid +
        "}";
    }
}

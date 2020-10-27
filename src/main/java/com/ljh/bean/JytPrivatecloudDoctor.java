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
public class JytPrivatecloudDoctor implements Serializable {

    private static final long serialVersionUID=1L;

    private String doctid;

    private String deptid;

    private String doctname;

    private String doctlevelname;

    private String sexCode;

    private String isexpert;


    public String getDoctid() {
        return doctid;
    }

    public void setDoctid(String doctid) {
        this.doctid = doctid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDoctname() {
        return doctname;
    }

    public void setDoctname(String doctname) {
        this.doctname = doctname;
    }

    public String getDoctlevelname() {
        return doctlevelname;
    }

    public void setDoctlevelname(String doctlevelname) {
        this.doctlevelname = doctlevelname;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getIsexpert() {
        return isexpert;
    }

    public void setIsexpert(String isexpert) {
        this.isexpert = isexpert;
    }

    @Override
    public String toString() {
        return "JytPrivatecloudDoctor{" +
        "doctid=" + doctid +
        ", deptid=" + deptid +
        ", doctname=" + doctname +
        ", doctlevelname=" + doctlevelname +
        ", sexCode=" + sexCode +
        ", isexpert=" + isexpert +
        "}";
    }
}

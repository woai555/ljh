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
public class ViewJhJcsyPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientid;

    private Integer innumber;

    private String inpatientno;


    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public Integer getInnumber() {
        return innumber;
    }

    public void setInnumber(Integer innumber) {
        this.innumber = innumber;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    @Override
    public String toString() {
        return "ViewJhJcsyPatient{" +
        "patientid=" + patientid +
        ", innumber=" + innumber +
        ", inpatientno=" + inpatientno +
        "}";
    }
}

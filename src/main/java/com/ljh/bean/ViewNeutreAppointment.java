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
public class ViewNeutreAppointment implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientno;

    private String appointmenttime;

    private String appointmentitem;

    private String patientname;


    public String getPatientno() {
        return patientno;
    }

    public void setPatientno(String patientno) {
        this.patientno = patientno;
    }

    public String getAppointmenttime() {
        return appointmenttime;
    }

    public void setAppointmenttime(String appointmenttime) {
        this.appointmenttime = appointmenttime;
    }

    public String getAppointmentitem() {
        return appointmentitem;
    }

    public void setAppointmentitem(String appointmentitem) {
        this.appointmentitem = appointmentitem;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    @Override
    public String toString() {
        return "ViewNeutreAppointment{" +
        "patientno=" + patientno +
        ", appointmenttime=" + appointmenttime +
        ", appointmentitem=" + appointmentitem +
        ", patientname=" + patientname +
        "}";
    }
}

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
public class VQyylHopitalInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosorgcode;

    private String hosname;

    private String hospitalgrade;

    private String hospitallevel;

    private String hospitaltype;

    private String paymode;

    private String ordermode;


    public String getHosorgcode() {
        return hosorgcode;
    }

    public void setHosorgcode(String hosorgcode) {
        this.hosorgcode = hosorgcode;
    }

    public String getHosname() {
        return hosname;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public String getHospitalgrade() {
        return hospitalgrade;
    }

    public void setHospitalgrade(String hospitalgrade) {
        this.hospitalgrade = hospitalgrade;
    }

    public String getHospitallevel() {
        return hospitallevel;
    }

    public void setHospitallevel(String hospitallevel) {
        this.hospitallevel = hospitallevel;
    }

    public String getHospitaltype() {
        return hospitaltype;
    }

    public void setHospitaltype(String hospitaltype) {
        this.hospitaltype = hospitaltype;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    public String getOrdermode() {
        return ordermode;
    }

    public void setOrdermode(String ordermode) {
        this.ordermode = ordermode;
    }

    @Override
    public String toString() {
        return "VQyylHopitalInfo{" +
        "hosorgcode=" + hosorgcode +
        ", hosname=" + hosname +
        ", hospitalgrade=" + hospitalgrade +
        ", hospitallevel=" + hospitallevel +
        ", hospitaltype=" + hospitaltype +
        ", paymode=" + paymode +
        ", ordermode=" + ordermode +
        "}";
    }
}

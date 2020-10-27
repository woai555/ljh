package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class OOpspersonlog implements Serializable {

    private static final long serialVersionUID=1L;

    private String execSqn;

    private String doctorcode;

    private Integer actor;

    private String doctorname;

    private Integer duty;

    private Integer opssize;

    private Integer operatorid;

    private LocalDateTime operatortime;

    private Integer flag;


    public String getExecSqn() {
        return execSqn;
    }

    public void setExecSqn(String execSqn) {
        this.execSqn = execSqn;
    }

    public String getDoctorcode() {
        return doctorcode;
    }

    public void setDoctorcode(String doctorcode) {
        this.doctorcode = doctorcode;
    }

    public Integer getActor() {
        return actor;
    }

    public void setActor(Integer actor) {
        this.actor = actor;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public Integer getDuty() {
        return duty;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

    public Integer getOpssize() {
        return opssize;
    }

    public void setOpssize(Integer opssize) {
        this.opssize = opssize;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "OOpspersonlog{" +
        "execSqn=" + execSqn +
        ", doctorcode=" + doctorcode +
        ", actor=" + actor +
        ", doctorname=" + doctorname +
        ", duty=" + duty +
        ", opssize=" + opssize +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        ", flag=" + flag +
        "}";
    }
}

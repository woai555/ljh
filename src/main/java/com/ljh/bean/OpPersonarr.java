package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术人员安排
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpPersonarr implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    /**
     * 0术前安排  1术后记录
     */
    private String isfore;

    private String emplCode;

    private String emplName;

    private String duty;

    private LocalDateTime operationtime;

    private BigDecimal duration;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public String getIsfore() {
        return isfore;
    }

    public void setIsfore(String isfore) {
        this.isfore = isfore;
    }

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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public LocalDateTime getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(LocalDateTime operationtime) {
        this.operationtime = operationtime;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "OpPersonarr{" +
        "operationno=" + operationno +
        ", isfore=" + isfore +
        ", emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", duty=" + duty +
        ", operationtime=" + operationtime +
        ", duration=" + duration +
        "}";
    }
}

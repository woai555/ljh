package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术室护士排班
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpWork implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    private String nrsCode;

    private LocalDateTime workDate;

    private String workNoon;

    private String operCode;

    private LocalDateTime operDate;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getNrsCode() {
        return nrsCode;
    }

    public void setNrsCode(String nrsCode) {
        this.nrsCode = nrsCode;
    }

    public LocalDateTime getWorkDate() {
        return workDate;
    }

    public void setWorkDate(LocalDateTime workDate) {
        this.workDate = workDate;
    }

    public String getWorkNoon() {
        return workNoon;
    }

    public void setWorkNoon(String workNoon) {
        this.workNoon = workNoon;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "OpWork{" +
        "deptCode=" + deptCode +
        ", nrsCode=" + nrsCode +
        ", workDate=" + workDate +
        ", workNoon=" + workNoon +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

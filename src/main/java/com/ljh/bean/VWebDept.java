package com.ljh.bean;

import java.math.BigDecimal;
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
public class VWebDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptname;

    private String deptid;

    private String sectid;

    private String resume;

    private String detail;

    private String addr;

    private String depttype;

    private BigDecimal priority;


    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getSectid() {
        return sectid;
    }

    public void setSectid(String sectid) {
        this.sectid = sectid;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype;
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "VWebDept{" +
        "deptname=" + deptname +
        ", deptid=" + deptid +
        ", sectid=" + sectid +
        ", resume=" + resume +
        ", detail=" + detail +
        ", addr=" + addr +
        ", depttype=" + depttype +
        ", priority=" + priority +
        "}";
    }
}

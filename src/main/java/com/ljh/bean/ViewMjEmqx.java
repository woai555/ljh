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
public class ViewMjEmqx implements Serializable {

    private static final long serialVersionUID=1L;

    private String triageserialno;

    private String patientid;

    private String patientname;

    private String deptname;

    private LocalDateTime applydate;

    private LocalDateTime seeDate;

    private String applyoper;

    private String roomname;

    private String bedNo;

    private String status;

    private LocalDateTime inDate;

    private LocalDateTime outDate;

    private String zs;

    private String xbs;

    private String jws;

    private String ct;

    private String zl;


    public String getTriageserialno() {
        return triageserialno;
    }

    public void setTriageserialno(String triageserialno) {
        this.triageserialno = triageserialno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public LocalDateTime getApplydate() {
        return applydate;
    }

    public void setApplydate(LocalDateTime applydate) {
        this.applydate = applydate;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getApplyoper() {
        return applyoper;
    }

    public void setApplyoper(String applyoper) {
        this.applyoper = applyoper;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    public String getXbs() {
        return xbs;
    }

    public void setXbs(String xbs) {
        this.xbs = xbs;
    }

    public String getJws() {
        return jws;
    }

    public void setJws(String jws) {
        this.jws = jws;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getZl() {
        return zl;
    }

    public void setZl(String zl) {
        this.zl = zl;
    }

    @Override
    public String toString() {
        return "ViewMjEmqx{" +
        "triageserialno=" + triageserialno +
        ", patientid=" + patientid +
        ", patientname=" + patientname +
        ", deptname=" + deptname +
        ", applydate=" + applydate +
        ", seeDate=" + seeDate +
        ", applyoper=" + applyoper +
        ", roomname=" + roomname +
        ", bedNo=" + bedNo +
        ", status=" + status +
        ", inDate=" + inDate +
        ", outDate=" + outDate +
        ", zs=" + zs +
        ", xbs=" + xbs +
        ", jws=" + jws +
        ", ct=" + ct +
        ", zl=" + zl +
        "}";
    }
}

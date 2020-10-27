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
public class ViOutpatientemr implements Serializable {

    private static final long serialVersionUID=1L;

    private String ylcardNo;

    private LocalDateTime birthday;

    private String pname;

    private String sex;

    private LocalDateTime seeDate;

    private String deptName;

    private String hostTell;

    private String currentIllness;

    private String anamnesis;

    private String diagName;

    private String adminical;

    private String disposition;

    private String seeNo;


    public String getYlcardNo() {
        return ylcardNo;
    }

    public void setYlcardNo(String ylcardNo) {
        this.ylcardNo = ylcardNo;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHostTell() {
        return hostTell;
    }

    public void setHostTell(String hostTell) {
        this.hostTell = hostTell;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public String getAdminical() {
        return adminical;
    }

    public void setAdminical(String adminical) {
        this.adminical = adminical;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    @Override
    public String toString() {
        return "ViOutpatientemr{" +
        "ylcardNo=" + ylcardNo +
        ", birthday=" + birthday +
        ", pname=" + pname +
        ", sex=" + sex +
        ", seeDate=" + seeDate +
        ", deptName=" + deptName +
        ", hostTell=" + hostTell +
        ", currentIllness=" + currentIllness +
        ", anamnesis=" + anamnesis +
        ", diagName=" + diagName +
        ", adminical=" + adminical +
        ", disposition=" + disposition +
        ", seeNo=" + seeNo +
        "}";
    }
}

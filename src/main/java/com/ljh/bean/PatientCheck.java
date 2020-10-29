package com.ljh.bean;

public class PatientCheck {
    private static final long serialVersionUID=1L;

    private String patname;
    private String patcardno;
    private String patcardtype;
    private String idcardtype;
    private String idcardno;
    private String phoneno;
    private String sex;
    private String guardianname;
    private String accesspatid;
    private String patientid;
    private Integer appcode;
    private String errmsg;

    @Override
    public String toString() {
        return "PatientCheck{" +
                "patname='" + patname + '\'' +
                ", patcardno='" + patcardno + '\'' +
                ", patcardtype='" + patcardtype + '\'' +
                ", idcardtype='" + idcardtype + '\'' +
                ", idcardno='" + idcardno + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", sex='" + sex + '\'' +
                ", guardianname='" + guardianname + '\'' +
                ", accesspatid='" + accesspatid + '\'' +
                ", patientid='" + patientid + '\'' +
                ", appcode=" + appcode +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public String getPatcardno() {
        return patcardno;
    }

    public void setPatcardno(String patcardno) {
        this.patcardno = patcardno;
    }

    public String getPatcardtype() {
        return patcardtype;
    }

    public void setPatcardtype(String patcardtype) {
        this.patcardtype = patcardtype;
    }

    public String getIdcardtype() {
        return idcardtype;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public void setGuardianname(String guardianname) {
        this.guardianname = guardianname;
    }

    public String getAccesspatid() {
        return accesspatid;
    }

    public void setAccesspatid(String accesspatid) {
        this.accesspatid = accesspatid;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public Integer getAppcode() {
        return appcode;
    }

    public void setAppcode(Integer appcode) {
        this.appcode = appcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public PatientCheck() {
    }
}

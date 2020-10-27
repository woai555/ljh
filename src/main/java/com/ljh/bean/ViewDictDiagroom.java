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
public class ViewDictDiagroom implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptcode;

    private String deptname;

    private String diagroomcode;

    private String diagroomname;

    private String specialsign;

    private String inputcode;

    private String shortname;

    private String deptmemo;


    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDiagroomcode() {
        return diagroomcode;
    }

    public void setDiagroomcode(String diagroomcode) {
        this.diagroomcode = diagroomcode;
    }

    public String getDiagroomname() {
        return diagroomname;
    }

    public void setDiagroomname(String diagroomname) {
        this.diagroomname = diagroomname;
    }

    public String getSpecialsign() {
        return specialsign;
    }

    public void setSpecialsign(String specialsign) {
        this.specialsign = specialsign;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getDeptmemo() {
        return deptmemo;
    }

    public void setDeptmemo(String deptmemo) {
        this.deptmemo = deptmemo;
    }

    @Override
    public String toString() {
        return "ViewDictDiagroom{" +
        "deptcode=" + deptcode +
        ", deptname=" + deptname +
        ", diagroomcode=" + diagroomcode +
        ", diagroomname=" + diagroomname +
        ", specialsign=" + specialsign +
        ", inputcode=" + inputcode +
        ", shortname=" + shortname +
        ", deptmemo=" + deptmemo +
        "}";
    }
}

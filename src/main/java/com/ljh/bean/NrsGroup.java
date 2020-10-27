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
public class NrsGroup implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组套ID
     */
    @TableId(value = "GROUPID", type = IdType.AUTO)
    private String groupid;

    /**
     * 组套名称
     */
    private String groupname;

    /**
     * 组套类型,1.医师组套；2.科室组套
     */
    private String grouptype;

    /**
     * 护士站ID
     */
    private String deptCode;

    /**
     * 组套医师
     */
    private String doctCode;

    /**
     * 组套备注
     */
    private String remark;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 组套拼音码
     */
    private String spellCode;


    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    @Override
    public String toString() {
        return "NrsGroup{" +
        "groupid=" + groupid +
        ", groupname=" + groupname +
        ", grouptype=" + grouptype +
        ", deptCode=" + deptCode +
        ", doctCode=" + doctCode +
        ", remark=" + remark +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", spellCode=" + spellCode +
        "}";
    }
}

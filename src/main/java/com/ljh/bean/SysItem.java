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
public class SysItem implements Serializable {

    private static final long serialVersionUID=1L;

    private String operid;

    private String operbs;

    private String usrName;

    private String usrPassword;

    private String realName;

    private BigDecimal kindCode;

    private String branchname;

    private BigDecimal roomid;

    private String roomname;

    private String groupname;

    private BigDecimal groupid;

    private String nurseid;

    private String nursename;

    private String departmentid;

    private String departmentname;

    private String branchid;

    private String doctorid;


    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid;
    }

    public String getOperbs() {
        return operbs;
    }

    public void setOperbs(String operbs) {
        this.operbs = operbs;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public BigDecimal getKindCode() {
        return kindCode;
    }

    public void setKindCode(BigDecimal kindCode) {
        this.kindCode = kindCode;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public BigDecimal getRoomid() {
        return roomid;
    }

    public void setRoomid(BigDecimal roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public BigDecimal getGroupid() {
        return groupid;
    }

    public void setGroupid(BigDecimal groupid) {
        this.groupid = groupid;
    }

    public String getNurseid() {
        return nurseid;
    }

    public void setNurseid(String nurseid) {
        this.nurseid = nurseid;
    }

    public String getNursename() {
        return nursename;
    }

    public void setNursename(String nursename) {
        this.nursename = nursename;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    @Override
    public String toString() {
        return "SysItem{" +
        "operid=" + operid +
        ", operbs=" + operbs +
        ", usrName=" + usrName +
        ", usrPassword=" + usrPassword +
        ", realName=" + realName +
        ", kindCode=" + kindCode +
        ", branchname=" + branchname +
        ", roomid=" + roomid +
        ", roomname=" + roomname +
        ", groupname=" + groupname +
        ", groupid=" + groupid +
        ", nurseid=" + nurseid +
        ", nursename=" + nursename +
        ", departmentid=" + departmentid +
        ", departmentname=" + departmentname +
        ", branchid=" + branchid +
        ", doctorid=" + doctorid +
        "}";
    }
}

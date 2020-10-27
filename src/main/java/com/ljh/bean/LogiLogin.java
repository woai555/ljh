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
public class LogiLogin implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptName;

    private String deptCode;

    private String emplCode;

    private String userName;

    private String loginName;

    private String loginPassword;

    private Integer purview;

    private LocalDateTime operDate;


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Integer getPurview() {
        return purview;
    }

    public void setPurview(Integer purview) {
        this.purview = purview;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "LogiLogin{" +
        "deptName=" + deptName +
        ", deptCode=" + deptCode +
        ", emplCode=" + emplCode +
        ", userName=" + userName +
        ", loginName=" + loginName +
        ", loginPassword=" + loginPassword +
        ", purview=" + purview +
        ", operDate=" + operDate +
        "}";
    }
}

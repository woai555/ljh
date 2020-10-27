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
public class ViewJhDzblUser implements Serializable {

    private static final long serialVersionUID=1L;

    private String dbUser;

    private String userId;

    private String userName;

    private String userDept;

    private String createDate;

    private String userPwd;

    private String inputCode;

    private String pym;

    private String wbm;

    private String domainuser;

    private BigDecimal secretLevel;

    private String userLoginName;

    private String groupCode;

    private String educationTitle;

    private String educationTitleCode;

    private String educationFlag;

    private String caNo;

    private String userType;

    private String userDutyName;


    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public String getWbm() {
        return wbm;
    }

    public void setWbm(String wbm) {
        this.wbm = wbm;
    }

    public String getDomainuser() {
        return domainuser;
    }

    public void setDomainuser(String domainuser) {
        this.domainuser = domainuser;
    }

    public BigDecimal getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(BigDecimal secretLevel) {
        this.secretLevel = secretLevel;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getEducationTitle() {
        return educationTitle;
    }

    public void setEducationTitle(String educationTitle) {
        this.educationTitle = educationTitle;
    }

    public String getEducationTitleCode() {
        return educationTitleCode;
    }

    public void setEducationTitleCode(String educationTitleCode) {
        this.educationTitleCode = educationTitleCode;
    }

    public String getEducationFlag() {
        return educationFlag;
    }

    public void setEducationFlag(String educationFlag) {
        this.educationFlag = educationFlag;
    }

    public String getCaNo() {
        return caNo;
    }

    public void setCaNo(String caNo) {
        this.caNo = caNo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserDutyName() {
        return userDutyName;
    }

    public void setUserDutyName(String userDutyName) {
        this.userDutyName = userDutyName;
    }

    @Override
    public String toString() {
        return "ViewJhDzblUser{" +
        "dbUser=" + dbUser +
        ", userId=" + userId +
        ", userName=" + userName +
        ", userDept=" + userDept +
        ", createDate=" + createDate +
        ", userPwd=" + userPwd +
        ", inputCode=" + inputCode +
        ", pym=" + pym +
        ", wbm=" + wbm +
        ", domainuser=" + domainuser +
        ", secretLevel=" + secretLevel +
        ", userLoginName=" + userLoginName +
        ", groupCode=" + groupCode +
        ", educationTitle=" + educationTitle +
        ", educationTitleCode=" + educationTitleCode +
        ", educationFlag=" + educationFlag +
        ", caNo=" + caNo +
        ", userType=" + userType +
        ", userDutyName=" + userDutyName +
        "}";
    }
}

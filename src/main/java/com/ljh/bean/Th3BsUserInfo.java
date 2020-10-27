package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 第三方表博思用户信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Th3BsUserInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * HIS登陆账号
     */
    @TableId(value = "LOGIN_NAME", type = IdType.AUTO)
    private String loginName;

    /**
     * 用户代码
     */
    private String userCode;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 博思开票点
     */
    private String bsInvoiceNode;

    /**
     * 博思开票点校验码
     */
    private String bsCheckKey;

    /**
     * 博思发票类型
     */
    private String bsBillType;

    /**
     * 博思发票注册号
     */
    private String bsBillReg;

    /**
     * 废弃不用，可以rename改用
     */
    private String lastUpInvoice;

    /**
     * 是否新发票
     */
    private String newInvoice;

    /**
     * 是否可退已过就诊日期号
     */
    private String ifCalregOutofdate;


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBsInvoiceNode() {
        return bsInvoiceNode;
    }

    public void setBsInvoiceNode(String bsInvoiceNode) {
        this.bsInvoiceNode = bsInvoiceNode;
    }

    public String getBsCheckKey() {
        return bsCheckKey;
    }

    public void setBsCheckKey(String bsCheckKey) {
        this.bsCheckKey = bsCheckKey;
    }

    public String getBsBillType() {
        return bsBillType;
    }

    public void setBsBillType(String bsBillType) {
        this.bsBillType = bsBillType;
    }

    public String getBsBillReg() {
        return bsBillReg;
    }

    public void setBsBillReg(String bsBillReg) {
        this.bsBillReg = bsBillReg;
    }

    public String getLastUpInvoice() {
        return lastUpInvoice;
    }

    public void setLastUpInvoice(String lastUpInvoice) {
        this.lastUpInvoice = lastUpInvoice;
    }

    public String getNewInvoice() {
        return newInvoice;
    }

    public void setNewInvoice(String newInvoice) {
        this.newInvoice = newInvoice;
    }

    public String getIfCalregOutofdate() {
        return ifCalregOutofdate;
    }

    public void setIfCalregOutofdate(String ifCalregOutofdate) {
        this.ifCalregOutofdate = ifCalregOutofdate;
    }

    @Override
    public String toString() {
        return "Th3BsUserInfo{" +
        "loginName=" + loginName +
        ", userCode=" + userCode +
        ", userName=" + userName +
        ", bsInvoiceNode=" + bsInvoiceNode +
        ", bsCheckKey=" + bsCheckKey +
        ", bsBillType=" + bsBillType +
        ", bsBillReg=" + bsBillReg +
        ", lastUpInvoice=" + lastUpInvoice +
        ", newInvoice=" + newInvoice +
        ", ifCalregOutofdate=" + ifCalregOutofdate +
        "}";
    }
}

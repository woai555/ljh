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
public class OrdWords implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科别代码
     */
    private String deptCode;

    /**
     * 医生代码
     */
    private String userCode;

    /**
     * 大类别
     */
    private String wType;

    /**
     * 内容
     */
    private String wName;

    /**
     * 小类
     */
    private String wGroup;

    /**
     * 操作员
     */
    private String oper;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 项目代码
     */
    private String code;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getwType() {
        return wType;
    }

    public void setwType(String wType) {
        this.wType = wType;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getwGroup() {
        return wGroup;
    }

    public void setwGroup(String wGroup) {
        this.wGroup = wGroup;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "OrdWords{" +
        "deptCode=" + deptCode +
        ", userCode=" + userCode +
        ", wType=" + wType +
        ", wName=" + wName +
        ", wGroup=" + wGroup +
        ", oper=" + oper +
        ", operDate=" + operDate +
        ", code=" + code +
        "}";
    }
}

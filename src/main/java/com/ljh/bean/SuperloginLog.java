package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 住院系统超级登陆日志
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SuperloginLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 实际操作员ID
     */
    @TableId(value = "REAL_OPERID", type = IdType.AUTO)
    private String realOperid;

    /**
     * 实际操作员
     */
    private String realName;

    /**
     * 操作时间
     */
    private LocalDateTime operatortime;

    /**
     * 超级登陆的ID
     */
    private String superloginOperid;

    /**
     * 超级登陆的操作员
     */
    private String superloginName;

    /**
     * IP地址
     */
    private String ipaddress;

    /**
     * 超级登陆的权限组
     */
    private String superloginGroup;


    public String getRealOperid() {
        return realOperid;
    }

    public void setRealOperid(String realOperid) {
        this.realOperid = realOperid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public String getSuperloginOperid() {
        return superloginOperid;
    }

    public void setSuperloginOperid(String superloginOperid) {
        this.superloginOperid = superloginOperid;
    }

    public String getSuperloginName() {
        return superloginName;
    }

    public void setSuperloginName(String superloginName) {
        this.superloginName = superloginName;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getSuperloginGroup() {
        return superloginGroup;
    }

    public void setSuperloginGroup(String superloginGroup) {
        this.superloginGroup = superloginGroup;
    }

    @Override
    public String toString() {
        return "SuperloginLog{" +
        "realOperid=" + realOperid +
        ", realName=" + realName +
        ", operatortime=" + operatortime +
        ", superloginOperid=" + superloginOperid +
        ", superloginName=" + superloginName +
        ", ipaddress=" + ipaddress +
        ", superloginGroup=" + superloginGroup +
        "}";
    }
}

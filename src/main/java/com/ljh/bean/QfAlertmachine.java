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
public class QfAlertmachine implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * IP地址
     */
    private String ipAddress;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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

    @Override
    public String toString() {
        return "QfAlertmachine{" +
        "deptCode=" + deptCode +
        ", ipAddress=" + ipAddress +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
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
public class LMachineid implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 仪器编码
     */
    private String machinecode;

    /**
     * 仪器标识
     */
    @TableId(value = "MACHINEID", type = IdType.AUTO)
    private String machineid;

    /**
     * 仪器名称
     */
    private String machineidname;

    /**
     * 所属检验小组编码
     */
    private String groupcode;

    /**
     * 所属检验小组名称
     */
    private String groupname;

    /**
     * 所属科室编码
     */
    private String deptCode;

    /**
     * 操作员
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatordate;

    /**
     * 波特率
     */
    private BigDecimal baudrate;

    /**
     * 奇偶校验位
     */
    private BigDecimal parity;

    /**
     * 停止位
     */
    private BigDecimal stopbits;

    /**
     * 字节数
     */
    private BigDecimal bytesize;

    /**
     * COM口
     */
    private BigDecimal whichcom;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid;
    }

    public String getMachineidname() {
        return machineidname;
    }

    public void setMachineidname(String machineidname) {
        this.machineidname = machineidname;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(LocalDateTime operatordate) {
        this.operatordate = operatordate;
    }

    public BigDecimal getBaudrate() {
        return baudrate;
    }

    public void setBaudrate(BigDecimal baudrate) {
        this.baudrate = baudrate;
    }

    public BigDecimal getParity() {
        return parity;
    }

    public void setParity(BigDecimal parity) {
        this.parity = parity;
    }

    public BigDecimal getStopbits() {
        return stopbits;
    }

    public void setStopbits(BigDecimal stopbits) {
        this.stopbits = stopbits;
    }

    public BigDecimal getBytesize() {
        return bytesize;
    }

    public void setBytesize(BigDecimal bytesize) {
        this.bytesize = bytesize;
    }

    public BigDecimal getWhichcom() {
        return whichcom;
    }

    public void setWhichcom(BigDecimal whichcom) {
        this.whichcom = whichcom;
    }

    @Override
    public String toString() {
        return "LMachineid{" +
        "machinecode=" + machinecode +
        ", machineid=" + machineid +
        ", machineidname=" + machineidname +
        ", groupcode=" + groupcode +
        ", groupname=" + groupname +
        ", deptCode=" + deptCode +
        ", operatorid=" + operatorid +
        ", operatordate=" + operatordate +
        ", baudrate=" + baudrate +
        ", parity=" + parity +
        ", stopbits=" + stopbits +
        ", bytesize=" + bytesize +
        ", whichcom=" + whichcom +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 单机版下传日志
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MzdjbDownloadLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号: seq_downloadlog
     */
    @TableId(value = "SEQNO", type = IdType.AUTO)
    private BigDecimal seqno;

    /**
     * IP地址
     */
    private String ipaddress;

    /**
     * 机器名
     */
    private String machinename;

    /**
     * mac
     */
    private String mac;

    /**
     * 下传时间
     */
    private LocalDateTime downDate;

    /**
     * 成功失败标记1成功
     */
    private String flag;

    /**
     * 备注
     */
    private String remark;


    public BigDecimal getSeqno() {
        return seqno;
    }

    public void setSeqno(BigDecimal seqno) {
        this.seqno = seqno;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public LocalDateTime getDownDate() {
        return downDate;
    }

    public void setDownDate(LocalDateTime downDate) {
        this.downDate = downDate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MzdjbDownloadLog{" +
        "seqno=" + seqno +
        ", ipaddress=" + ipaddress +
        ", machinename=" + machinename +
        ", mac=" + mac +
        ", downDate=" + downDate +
        ", flag=" + flag +
        ", remark=" + remark +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊单机版收费系统计算机IP明细设置表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ROutpClinicRegmess implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "COMPUTER_IP", type = IdType.AUTO)
    private String computerIp;

    private String computerMac;

    private String computerName;

    private String computerAddress;

    private BigDecimal sortId;


    public String getComputerIp() {
        return computerIp;
    }

    public void setComputerIp(String computerIp) {
        this.computerIp = computerIp;
    }

    public String getComputerMac() {
        return computerMac;
    }

    public void setComputerMac(String computerMac) {
        this.computerMac = computerMac;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getComputerAddress() {
        return computerAddress;
    }

    public void setComputerAddress(String computerAddress) {
        this.computerAddress = computerAddress;
    }

    public BigDecimal getSortId() {
        return sortId;
    }

    public void setSortId(BigDecimal sortId) {
        this.sortId = sortId;
    }

    @Override
    public String toString() {
        return "ROutpClinicRegmess{" +
        "computerIp=" + computerIp +
        ", computerMac=" + computerMac +
        ", computerName=" + computerName +
        ", computerAddress=" + computerAddress +
        ", sortId=" + sortId +
        "}";
    }
}

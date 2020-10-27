package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号退号日志表(R_REGISTER_TUIHAOLOG)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterTuihaolog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 患者姓名
     */
    private String patiName;

    /**
     * 挂号日期
     */
    private LocalDateTime regDate;

    /**
     * 医师姓名
     */
    private String doctName;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * ip地址
     */
    private String ipaddress;

    /**
     * mac地址
     */
    private String macaddress;

    /**
     * 机器名
     */
    private String machinename;

    /**
     * 操作人编码(审核人)
     */
    private String operId;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 退号类型
     */
    private String quitType;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPatiName() {
        return patiName;
    }

    public void setPatiName(String patiName) {
        this.patiName = patiName;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getQuitType() {
        return quitType;
    }

    public void setQuitType(String quitType) {
        this.quitType = quitType;
    }

    @Override
    public String toString() {
        return "RRegisterTuihaolog{" +
        "cardNo=" + cardNo +
        ", patiName=" + patiName +
        ", regDate=" + regDate +
        ", doctName=" + doctName +
        ", deptName=" + deptName +
        ", ipaddress=" + ipaddress +
        ", macaddress=" + macaddress +
        ", machinename=" + machinename +
        ", operId=" + operId +
        ", operDate=" + operDate +
        ", quitType=" + quitType +
        "}";
    }
}

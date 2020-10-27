package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 会诊医生工作登记表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterMeetingDoc implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 挂号时间
     */
    @TableId(value = "REG_DATE", type = IdType.AUTO)
    private LocalDateTime regDate;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 医生编码
     */
    private String realDoctid;

    /**
     * 医生姓名
     */
    private String realDoctname;

    /**
     * 登记人
     */
    private String operCode;

    /**
     * 登记时间
     */
    private LocalDateTime operDate;

    /**
     * 患者姓名
     */
    private String name;


    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRealDoctid() {
        return realDoctid;
    }

    public void setRealDoctid(String realDoctid) {
        this.realDoctid = realDoctid;
    }

    public String getRealDoctname() {
        return realDoctname;
    }

    public void setRealDoctname(String realDoctname) {
        this.realDoctname = realDoctname;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RRegisterMeetingDoc{" +
        "regDate=" + regDate +
        ", cardNo=" + cardNo +
        ", realDoctid=" + realDoctid +
        ", realDoctname=" + realDoctname +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", name=" + name +
        "}";
    }
}

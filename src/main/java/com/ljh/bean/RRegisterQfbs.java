package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号欠费补收记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterQfbs implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 患者姓名
     */
    private String name;

    /**
     * 挂号日期
     */
    private LocalDateTime regDate;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 操作人编码(欠费)
     */
    private String operCodeQf;

    /**
     * 操作人编码(补收)
     */
    private String operCode;

    /**
     * 操作日期（补收）
     */
    private LocalDateTime operDate;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperCodeQf() {
        return operCodeQf;
    }

    public void setOperCodeQf(String operCodeQf) {
        this.operCodeQf = operCodeQf;
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
        return "RRegisterQfbs{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", regDate=" + regDate +
        ", deptCode=" + deptCode +
        ", operCodeQf=" + operCodeQf +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

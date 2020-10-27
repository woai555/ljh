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
public class RPatientinfoWarning implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String name;

    private String warningMsg;

    private String program;

    /**
     * -1中断程序,-2不提示（仅用于PROGRAM不为all的），若除却-2，其它都提示，需要有一条PROGRAM为all的记录
     */
    private BigDecimal terminate;

    private String operCode;

    private LocalDateTime operDate;

    private LocalDateTime birthday;

    private String idenno;

    @TableId(value = "XH", type = IdType.AUTO)
    private Integer xh;


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

    public String getWarningMsg() {
        return warningMsg;
    }

    public void setWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public BigDecimal getTerminate() {
        return terminate;
    }

    public void setTerminate(BigDecimal terminate) {
        this.terminate = terminate;
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

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    @Override
    public String toString() {
        return "RPatientinfoWarning{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", warningMsg=" + warningMsg +
        ", program=" + program +
        ", terminate=" + terminate +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", birthday=" + birthday +
        ", idenno=" + idenno +
        ", xh=" + xh +
        "}";
    }
}

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
public class OrdDiaginfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String doctCode;

    private String diagKey;

    private String ordSubject;

    private String ordObject;

    private String diag1;

    private String diag2;

    private String diag3;

    private LocalDateTime operDtime;

    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    private LocalDateTime regDate;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDiagKey() {
        return diagKey;
    }

    public void setDiagKey(String diagKey) {
        this.diagKey = diagKey;
    }

    public String getOrdSubject() {
        return ordSubject;
    }

    public void setOrdSubject(String ordSubject) {
        this.ordSubject = ordSubject;
    }

    public String getOrdObject() {
        return ordObject;
    }

    public void setOrdObject(String ordObject) {
        this.ordObject = ordObject;
    }

    public String getDiag1() {
        return diag1;
    }

    public void setDiag1(String diag1) {
        this.diag1 = diag1;
    }

    public String getDiag2() {
        return diag2;
    }

    public void setDiag2(String diag2) {
        this.diag2 = diag2;
    }

    public String getDiag3() {
        return diag3;
    }

    public void setDiag3(String diag3) {
        this.diag3 = diag3;
    }

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "OrdDiaginfo{" +
        "deptCode=" + deptCode +
        ", doctCode=" + doctCode +
        ", diagKey=" + diagKey +
        ", ordSubject=" + ordSubject +
        ", ordObject=" + ordObject +
        ", diag1=" + diag1 +
        ", diag2=" + diag2 +
        ", diag3=" + diag3 +
        ", operDtime=" + operDtime +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        "}";
    }
}

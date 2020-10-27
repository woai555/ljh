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
public class ViewJiaheMzDiaginfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String seeNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String diagTemp;

    private String diagCode1;

    private String diagName1;

    private String diagCode2;

    private String diagName2;

    private String diagCode3;

    private String diagName3;

    private String diagCode4;

    private String diagName4;

    private String diagCode5;

    private String diagName5;

    private LocalDateTime seeDate;

    private String presDept;

    private LocalDateTime lastDate;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
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

    public String getDiagTemp() {
        return diagTemp;
    }

    public void setDiagTemp(String diagTemp) {
        this.diagTemp = diagTemp;
    }

    public String getDiagCode1() {
        return diagCode1;
    }

    public void setDiagCode1(String diagCode1) {
        this.diagCode1 = diagCode1;
    }

    public String getDiagName1() {
        return diagName1;
    }

    public void setDiagName1(String diagName1) {
        this.diagName1 = diagName1;
    }

    public String getDiagCode2() {
        return diagCode2;
    }

    public void setDiagCode2(String diagCode2) {
        this.diagCode2 = diagCode2;
    }

    public String getDiagName2() {
        return diagName2;
    }

    public void setDiagName2(String diagName2) {
        this.diagName2 = diagName2;
    }

    public String getDiagCode3() {
        return diagCode3;
    }

    public void setDiagCode3(String diagCode3) {
        this.diagCode3 = diagCode3;
    }

    public String getDiagName3() {
        return diagName3;
    }

    public void setDiagName3(String diagName3) {
        this.diagName3 = diagName3;
    }

    public String getDiagCode4() {
        return diagCode4;
    }

    public void setDiagCode4(String diagCode4) {
        this.diagCode4 = diagCode4;
    }

    public String getDiagName4() {
        return diagName4;
    }

    public void setDiagName4(String diagName4) {
        this.diagName4 = diagName4;
    }

    public String getDiagCode5() {
        return diagCode5;
    }

    public void setDiagCode5(String diagCode5) {
        this.diagCode5 = diagCode5;
    }

    public String getDiagName5() {
        return diagName5;
    }

    public void setDiagName5(String diagName5) {
        this.diagName5 = diagName5;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getPresDept() {
        return presDept;
    }

    public void setPresDept(String presDept) {
        this.presDept = presDept;
    }

    public LocalDateTime getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDateTime lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzDiaginfo{" +
        "seeNo=" + seeNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", diagTemp=" + diagTemp +
        ", diagCode1=" + diagCode1 +
        ", diagName1=" + diagName1 +
        ", diagCode2=" + diagCode2 +
        ", diagName2=" + diagName2 +
        ", diagCode3=" + diagCode3 +
        ", diagName3=" + diagName3 +
        ", diagCode4=" + diagCode4 +
        ", diagName4=" + diagName4 +
        ", diagCode5=" + diagCode5 +
        ", diagName5=" + diagName5 +
        ", seeDate=" + seeDate +
        ", presDept=" + presDept +
        ", lastDate=" + lastDate +
        "}";
    }
}

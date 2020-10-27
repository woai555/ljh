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
public class VAppPscriptdetailDiag implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    private Integer ageDesc;

    private String sex;

    private String diagResult;


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

    public Integer getAgeDesc() {
        return ageDesc;
    }

    public void setAgeDesc(Integer ageDesc) {
        this.ageDesc = ageDesc;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDiagResult() {
        return diagResult;
    }

    public void setDiagResult(String diagResult) {
        this.diagResult = diagResult;
    }

    @Override
    public String toString() {
        return "VAppPscriptdetailDiag{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", ageDesc=" + ageDesc +
        ", sex=" + sex +
        ", diagResult=" + diagResult +
        "}";
    }
}

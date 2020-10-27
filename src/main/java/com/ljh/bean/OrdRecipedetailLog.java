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
public class OrdRecipedetailLog implements Serializable {

    private static final long serialVersionUID=1L;

    private String describe;

    private String cardNo;

    private LocalDateTime regDate;

    @TableId(value = "SEE_NO", type = IdType.AUTO)
    private String seeNo;

    private Integer sequenceNo;

    private String modifiedcol;

    private String oldvalue;

    private String newvalue;

    private String operCode;

    private LocalDateTime operDate;


    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getModifiedcol() {
        return modifiedcol;
    }

    public void setModifiedcol(String modifiedcol) {
        this.modifiedcol = modifiedcol;
    }

    public String getOldvalue() {
        return oldvalue;
    }

    public void setOldvalue(String oldvalue) {
        this.oldvalue = oldvalue;
    }

    public String getNewvalue() {
        return newvalue;
    }

    public void setNewvalue(String newvalue) {
        this.newvalue = newvalue;
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
        return "OrdRecipedetailLog{" +
        "describe=" + describe +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", seeNo=" + seeNo +
        ", sequenceNo=" + sequenceNo +
        ", modifiedcol=" + modifiedcol +
        ", oldvalue=" + oldvalue +
        ", newvalue=" + newvalue +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

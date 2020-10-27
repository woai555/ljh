package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 费用时间修改记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugModifyRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 门诊流水号
     */
    private String clinicCode;

    /**
     * 门诊卡号
     */
    private String cardNo;

    /**
     * 挂号时间
     */
    private LocalDateTime regDate;

    /**
     * 处方号
     */
    private String recipeNo;

    /**
     * 处方内序号
     */
    private Integer sequenceNo;

    /**
     * 交易类型
     */
    private String transType;

    /**
     * 原收费日期
     */
    private LocalDateTime oldDate;

    /**
     * 修改后收费日期
     */
    private LocalDateTime newDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
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

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public LocalDateTime getOldDate() {
        return oldDate;
    }

    public void setOldDate(LocalDateTime oldDate) {
        this.oldDate = oldDate;
    }

    public LocalDateTime getNewDate() {
        return newDate;
    }

    public void setNewDate(LocalDateTime newDate) {
        this.newDate = newDate;
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
        return "UndrugModifyRecord{" +
        "clinicCode=" + clinicCode +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", transType=" + transType +
        ", oldDate=" + oldDate +
        ", newDate=" + newDate +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

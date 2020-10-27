package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 急诊绿色通道患者信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientGreenChannel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊序号主键（普通留观为see_no预付费的为inpatientno）
     */
    private String seeNo;

    /**
     * 患者卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 入观挂号时间
     */
    private LocalDateTime regDate;

    /**
     * 患者姓名
     */
    private String pname;

    /**
     * 是否预付费
     */
    private String ifYff;

    /**
     * 绿道信息是否有效
     */
    private String ifValid;

    /**
     * 开通绿道操作员
     */
    private String operCode;

    /**
     * 开通绿道操作时间
     */
    private LocalDateTime operDate;

    /**
     * 审核人
     */
    private String examCode;

    /**
     * 审核时间
     */
    private LocalDateTime examDate;

    /**
     * 1 为护士登记，2为医生已读取
     */
    private String status;

    /**
     * 患者分级信息
     */
    private String levl;

    /**
     * 备注
     */
    private String remark;


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

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getIfYff() {
        return ifYff;
    }

    public void setIfYff(String ifYff) {
        this.ifYff = ifYff;
    }

    public String getIfValid() {
        return ifValid;
    }

    public void setIfValid(String ifValid) {
        this.ifValid = ifValid;
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

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevl() {
        return levl;
    }

    public void setLevl(String levl) {
        this.levl = levl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RPatientGreenChannel{" +
        "seeNo=" + seeNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", pname=" + pname +
        ", ifYff=" + ifYff +
        ", ifValid=" + ifValid +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", examCode=" + examCode +
        ", examDate=" + examDate +
        ", status=" + status +
        ", levl=" + levl +
        ", remark=" + remark +
        "}";
    }
}

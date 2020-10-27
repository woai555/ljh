package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 患者看诊信息登记
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TriSeeinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者就诊卡号
     */
    private String cardNo;

    /**
     * 患者挂号时间
     */
    private LocalDateTime regDate;

    /**
     * 看诊类别
     */
    @TableId(value = "SEE_KIND", type = IdType.AUTO)
    private String seeKind;

    /**
     * 看诊内容
     */
    private String seeInfo;

    /**
     * 分诊科室
     */
    private String triageCode;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


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

    public String getSeeKind() {
        return seeKind;
    }

    public void setSeeKind(String seeKind) {
        this.seeKind = seeKind;
    }

    public String getSeeInfo() {
        return seeInfo;
    }

    public void setSeeInfo(String seeInfo) {
        this.seeInfo = seeInfo;
    }

    public String getTriageCode() {
        return triageCode;
    }

    public void setTriageCode(String triageCode) {
        this.triageCode = triageCode;
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
        return "TriSeeinfo{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", seeKind=" + seeKind +
        ", seeInfo=" + seeInfo +
        ", triageCode=" + triageCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

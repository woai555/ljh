package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 京医通自助建卡记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class JytCreatecardList implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    private String cardnoHis;

    /**
     * 京医通卡号
     */
    private String cardNo;

    /**
     * 京医通类型 0 临时自费 1 自费 2 临时医保 3医保
     */
    private String cardType;

    /**
     * 证件号码
     */
    private String idCardNo;

    /**
     * 证件类型-关联表r_idcard
     */
    private String idCardType;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 1:本木自助建卡绑定2:窗口变更 3：rwzb自助建卡
     */
    private String createaddr;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 院区编号
     */
    private String hosArea;


    public String getCardnoHis() {
        return cardnoHis;
    }

    public void setCardnoHis(String cardnoHis) {
        this.cardnoHis = cardnoHis;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getCreateaddr() {
        return createaddr;
    }

    public void setCreateaddr(String createaddr) {
        this.createaddr = createaddr;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getHosArea() {
        return hosArea;
    }

    public void setHosArea(String hosArea) {
        this.hosArea = hosArea;
    }

    @Override
    public String toString() {
        return "JytCreatecardList{" +
        "cardnoHis=" + cardnoHis +
        ", cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", idCardNo=" + idCardNo +
        ", idCardType=" + idCardType +
        ", patientName=" + patientName +
        ", operDate=" + operDate +
        ", createaddr=" + createaddr +
        ", operCode=" + operCode +
        ", hosArea=" + hosArea +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 电子病历查阅授权
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdAppEmrempower implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 医生工号
     */
    private String docCode;

    /**
     * 是否授权1已授0未授
     */
    private String status;

    private String operCode;

    private LocalDateTime operDate;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "OrdAppEmrempower{" +
        "cardNo=" + cardNo +
        ", docCode=" + docCode +
        ", status=" + status +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

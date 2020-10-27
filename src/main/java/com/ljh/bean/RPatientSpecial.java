package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特殊患者记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientSpecial implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别01离休高干
     */
    @TableId(value = "KIND_CODE", type = IdType.AUTO)
    private String kindCode;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 姓名
     */
    private String pname;

    /**
     * 操作员
     */
    private LocalDateTime operDate;

    /**
     * 记录时间
     */
    private String operCode;


    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "RPatientSpecial{" +
        "kindCode=" + kindCode +
        ", cardNo=" + cardNo +
        ", pname=" + pname +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特殊患者删除记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientSpecialDel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别
     */
    private String kindCode;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 患者姓名
     */
    private String pname;

    /**
     * 记录时间
     */
    private LocalDateTime operDate;

    /**
     * 操作人
     */
    private String operCode;

    /**
     * 删除时间
     */
    private LocalDateTime delDate;

    /**
     * 删除人
     */
    private String delMan;


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

    public LocalDateTime getDelDate() {
        return delDate;
    }

    public void setDelDate(LocalDateTime delDate) {
        this.delDate = delDate;
    }

    public String getDelMan() {
        return delMan;
    }

    public void setDelMan(String delMan) {
        this.delMan = delMan;
    }

    @Override
    public String toString() {
        return "RPatientSpecialDel{" +
        "kindCode=" + kindCode +
        ", cardNo=" + cardNo +
        ", pname=" + pname +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", delDate=" + delDate +
        ", delMan=" + delMan +
        "}";
    }
}

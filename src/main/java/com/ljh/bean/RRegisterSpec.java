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
public class RRegisterSpec implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    private LocalDateTime regDate;

    private String flag;

    private String operCode;

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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
        return "RRegisterSpec{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", flag=" + flag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

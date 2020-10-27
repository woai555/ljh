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
public class ViewJiaheMjzDiag implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    private String diagId;


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

    public String getDiagId() {
        return diagId;
    }

    public void setDiagId(String diagId) {
        this.diagId = diagId;
    }

    @Override
    public String toString() {
        return "ViewJiaheMjzDiag{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", diagId=" + diagId +
        "}";
    }
}

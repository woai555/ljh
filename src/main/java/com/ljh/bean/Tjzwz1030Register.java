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
public class Tjzwz1030Register implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String name;

    private LocalDateTime seeDate;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    @Override
    public String toString() {
        return "Tjzwz1030Register{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", seeDate=" + seeDate +
        "}";
    }
}

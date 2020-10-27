package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class ViewXtLinkman implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String happenNo;

    private String homeTel;

    private String linkmanName;

    private String linkmanTel;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getHappenNo() {
        return happenNo;
    }

    public void setHappenNo(String happenNo) {
        this.happenNo = happenNo;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    @Override
    public String toString() {
        return "ViewXtLinkman{" +
        "cardNo=" + cardNo +
        ", happenNo=" + happenNo +
        ", homeTel=" + homeTel +
        ", linkmanName=" + linkmanName +
        ", linkmanTel=" + linkmanTel +
        "}";
    }
}

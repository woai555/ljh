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
public class VLisitemlist implements Serializable {

    private static final long serialVersionUID=1L;

    private String kdys;

    private String kdysxm;

    private String kdks;

    private String kdksmc;

    private String kdrq;

    private String kdsj;

    private String itemcode;

    private String zyh;

    private String cardno;


    public String getKdys() {
        return kdys;
    }

    public void setKdys(String kdys) {
        this.kdys = kdys;
    }

    public String getKdysxm() {
        return kdysxm;
    }

    public void setKdysxm(String kdysxm) {
        this.kdysxm = kdysxm;
    }

    public String getKdks() {
        return kdks;
    }

    public void setKdks(String kdks) {
        this.kdks = kdks;
    }

    public String getKdksmc() {
        return kdksmc;
    }

    public void setKdksmc(String kdksmc) {
        this.kdksmc = kdksmc;
    }

    public String getKdrq() {
        return kdrq;
    }

    public void setKdrq(String kdrq) {
        this.kdrq = kdrq;
    }

    public String getKdsj() {
        return kdsj;
    }

    public void setKdsj(String kdsj) {
        this.kdsj = kdsj;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @Override
    public String toString() {
        return "VLisitemlist{" +
        "kdys=" + kdys +
        ", kdysxm=" + kdysxm +
        ", kdks=" + kdks +
        ", kdksmc=" + kdksmc +
        ", kdrq=" + kdrq +
        ", kdsj=" + kdsj +
        ", itemcode=" + itemcode +
        ", zyh=" + zyh +
        ", cardno=" + cardno +
        "}";
    }
}

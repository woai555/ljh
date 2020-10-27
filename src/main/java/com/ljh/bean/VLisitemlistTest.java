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
public class VLisitemlistTest implements Serializable {

    private static final long serialVersionUID=1L;

    private String kdys;

    private String kdrq;

    private String kdsj;

    private String itemcode;

    private String zyh;

    private String cardno;

    private String deptCode;


    public String getKdys() {
        return kdys;
    }

    public void setKdys(String kdys) {
        this.kdys = kdys;
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "VLisitemlistTest{" +
        "kdys=" + kdys +
        ", kdrq=" + kdrq +
        ", kdsj=" + kdsj +
        ", itemcode=" + itemcode +
        ", zyh=" + zyh +
        ", cardno=" + cardno +
        ", deptCode=" + deptCode +
        "}";
    }
}

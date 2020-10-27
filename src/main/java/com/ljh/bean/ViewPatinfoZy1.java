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
public class ViewPatinfoZy1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardid;

    private LocalDateTime indate;

    private LocalDateTime intime;

    private LocalDateTime bedIntime;

    private String inpatientno;


    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public LocalDateTime getIndate() {
        return indate;
    }

    public void setIndate(LocalDateTime indate) {
        this.indate = indate;
    }

    public LocalDateTime getIntime() {
        return intime;
    }

    public void setIntime(LocalDateTime intime) {
        this.intime = intime;
    }

    public LocalDateTime getBedIntime() {
        return bedIntime;
    }

    public void setBedIntime(LocalDateTime bedIntime) {
        this.bedIntime = bedIntime;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    @Override
    public String toString() {
        return "ViewPatinfoZy1{" +
        "cardid=" + cardid +
        ", indate=" + indate +
        ", intime=" + intime +
        ", bedIntime=" + bedIntime +
        ", inpatientno=" + inpatientno +
        "}";
    }
}

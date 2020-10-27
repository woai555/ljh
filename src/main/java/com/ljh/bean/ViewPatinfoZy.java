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
public class ViewPatinfoZy implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardid;

    private LocalDateTime indate;

    private LocalDateTime intime;


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

    @Override
    public String toString() {
        return "ViewPatinfoZy{" +
        "cardid=" + cardid +
        ", indate=" + indate +
        ", intime=" + intime +
        "}";
    }
}

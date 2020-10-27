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
public class Mrmsbasetime1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String pkey;

    private LocalDateTime fromdate;

    private LocalDateTime enddate;


    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey;
    }

    public LocalDateTime getFromdate() {
        return fromdate;
    }

    public void setFromdate(LocalDateTime fromdate) {
        this.fromdate = fromdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "Mrmsbasetime1{" +
        "pkey=" + pkey +
        ", fromdate=" + fromdate +
        ", enddate=" + enddate +
        "}";
    }
}

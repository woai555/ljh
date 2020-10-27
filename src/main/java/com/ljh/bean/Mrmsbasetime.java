package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病案统计时间基准表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsbasetime implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 此表主键（没有特别含义）
     */
    private String pkey;

    /**
     * 开始时间
     */
    private LocalDateTime fromdate;

    /**
     * 截至时间
     */
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
        return "Mrmsbasetime{" +
        "pkey=" + pkey +
        ", fromdate=" + fromdate +
        ", enddate=" + enddate +
        "}";
    }
}

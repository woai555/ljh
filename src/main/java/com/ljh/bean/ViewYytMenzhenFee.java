package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewYytMenzhenFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String fapiao;

    private String jytCardno;

    private String mzCardno;

    private String ybCardno;

    private BigDecimal total;

    private LocalDateTime opertime;


    public String getFapiao() {
        return fapiao;
    }

    public void setFapiao(String fapiao) {
        this.fapiao = fapiao;
    }

    public String getJytCardno() {
        return jytCardno;
    }

    public void setJytCardno(String jytCardno) {
        this.jytCardno = jytCardno;
    }

    public String getMzCardno() {
        return mzCardno;
    }

    public void setMzCardno(String mzCardno) {
        this.mzCardno = mzCardno;
    }

    public String getYbCardno() {
        return ybCardno;
    }

    public void setYbCardno(String ybCardno) {
        this.ybCardno = ybCardno;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getOpertime() {
        return opertime;
    }

    public void setOpertime(LocalDateTime opertime) {
        this.opertime = opertime;
    }

    @Override
    public String toString() {
        return "ViewYytMenzhenFee{" +
        "fapiao=" + fapiao +
        ", jytCardno=" + jytCardno +
        ", mzCardno=" + mzCardno +
        ", ybCardno=" + ybCardno +
        ", total=" + total +
        ", opertime=" + opertime +
        "}";
    }
}

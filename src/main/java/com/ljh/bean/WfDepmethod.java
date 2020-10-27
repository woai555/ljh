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
public class WfDepmethod implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPNO", type = IdType.AUTO)
    private BigDecimal depno;

    private String methname;

    private String methdesc;

    private BigDecimal deprate;

    private String funcname;

    private String operator;

    private LocalDateTime registdate;


    public BigDecimal getDepno() {
        return depno;
    }

    public void setDepno(BigDecimal depno) {
        this.depno = depno;
    }

    public String getMethname() {
        return methname;
    }

    public void setMethname(String methname) {
        this.methname = methname;
    }

    public String getMethdesc() {
        return methdesc;
    }

    public void setMethdesc(String methdesc) {
        this.methdesc = methdesc;
    }

    public BigDecimal getDeprate() {
        return deprate;
    }

    public void setDeprate(BigDecimal deprate) {
        this.deprate = deprate;
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getRegistdate() {
        return registdate;
    }

    public void setRegistdate(LocalDateTime registdate) {
        this.registdate = registdate;
    }

    @Override
    public String toString() {
        return "WfDepmethod{" +
        "depno=" + depno +
        ", methname=" + methname +
        ", methdesc=" + methdesc +
        ", deprate=" + deprate +
        ", funcname=" + funcname +
        ", operator=" + operator +
        ", registdate=" + registdate +
        "}";
    }
}

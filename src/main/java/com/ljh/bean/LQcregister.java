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
public class LQcregister implements Serializable {

    private static final long serialVersionUID=1L;

    private String machinecode;

    private String itemcode;

    private Integer sampleid;

    private LocalDateTime checkdatetime;

    private BigDecimal qcresult;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public Integer getSampleid() {
        return sampleid;
    }

    public void setSampleid(Integer sampleid) {
        this.sampleid = sampleid;
    }

    public LocalDateTime getCheckdatetime() {
        return checkdatetime;
    }

    public void setCheckdatetime(LocalDateTime checkdatetime) {
        this.checkdatetime = checkdatetime;
    }

    public BigDecimal getQcresult() {
        return qcresult;
    }

    public void setQcresult(BigDecimal qcresult) {
        this.qcresult = qcresult;
    }

    @Override
    public String toString() {
        return "LQcregister{" +
        "machinecode=" + machinecode +
        ", itemcode=" + itemcode +
        ", sampleid=" + sampleid +
        ", checkdatetime=" + checkdatetime +
        ", qcresult=" + qcresult +
        "}";
    }
}

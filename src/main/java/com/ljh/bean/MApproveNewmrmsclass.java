package com.ljh.bean;

import java.math.BigDecimal;
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
public class MApproveNewmrmsclass implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MEDICINECODE", type = IdType.AUTO)
    private String medicinecode;

    private BigDecimal newmrmsclass;


    public String getMedicinecode() {
        return medicinecode;
    }

    public void setMedicinecode(String medicinecode) {
        this.medicinecode = medicinecode;
    }

    public BigDecimal getNewmrmsclass() {
        return newmrmsclass;
    }

    public void setNewmrmsclass(BigDecimal newmrmsclass) {
        this.newmrmsclass = newmrmsclass;
    }

    @Override
    public String toString() {
        return "MApproveNewmrmsclass{" +
        "medicinecode=" + medicinecode +
        ", newmrmsclass=" + newmrmsclass +
        "}";
    }
}

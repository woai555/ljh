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
public class SUnit implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "UNITID", type = IdType.AUTO)
    private BigDecimal unitid;

    private String unitname;

    private String unitcode;

    private String operatorid;

    private LocalDateTime operatortime;


    public BigDecimal getUnitid() {
        return unitid;
    }

    public void setUnitid(BigDecimal unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "SUnit{" +
        "unitid=" + unitid +
        ", unitname=" + unitname +
        ", unitcode=" + unitcode +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}

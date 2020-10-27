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
public class LItemcontrol implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private String itemcode;

    private String itemname;

    private BigDecimal upstandard;

    private BigDecimal downstandard;

    private String operatorid;

    private LocalDateTime modifydate;


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

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public BigDecimal getUpstandard() {
        return upstandard;
    }

    public void setUpstandard(BigDecimal upstandard) {
        this.upstandard = upstandard;
    }

    public BigDecimal getDownstandard() {
        return downstandard;
    }

    public void setDownstandard(BigDecimal downstandard) {
        this.downstandard = downstandard;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getModifydate() {
        return modifydate;
    }

    public void setModifydate(LocalDateTime modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        return "LItemcontrol{" +
        "machinecode=" + machinecode +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", upstandard=" + upstandard +
        ", downstandard=" + downstandard +
        ", operatorid=" + operatorid +
        ", modifydate=" + modifydate +
        "}";
    }
}

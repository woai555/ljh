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
public class LCheckstandard implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private String itemcode;

    private String itemname;

    private String sex;

    private String upage;

    private String downage;

    private BigDecimal upstandard;

    private BigDecimal downstandard;

    private String resultunit;

    private String operatorid;

    private LocalDateTime changedate;

    private Integer printnum;


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUpage() {
        return upage;
    }

    public void setUpage(String upage) {
        this.upage = upage;
    }

    public String getDownage() {
        return downage;
    }

    public void setDownage(String downage) {
        this.downage = downage;
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

    public String getResultunit() {
        return resultunit;
    }

    public void setResultunit(String resultunit) {
        this.resultunit = resultunit;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getChangedate() {
        return changedate;
    }

    public void setChangedate(LocalDateTime changedate) {
        this.changedate = changedate;
    }

    public Integer getPrintnum() {
        return printnum;
    }

    public void setPrintnum(Integer printnum) {
        this.printnum = printnum;
    }

    @Override
    public String toString() {
        return "LCheckstandard{" +
        "machinecode=" + machinecode +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", sex=" + sex +
        ", upage=" + upage +
        ", downage=" + downage +
        ", upstandard=" + upstandard +
        ", downstandard=" + downstandard +
        ", resultunit=" + resultunit +
        ", operatorid=" + operatorid +
        ", changedate=" + changedate +
        ", printnum=" + printnum +
        "}";
    }
}

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
public class LCustitem implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private String custitemcode;

    private String custitemname;

    private Integer printorder;

    private String operatorid;

    private LocalDateTime operatortime;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getCustitemcode() {
        return custitemcode;
    }

    public void setCustitemcode(String custitemcode) {
        this.custitemcode = custitemcode;
    }

    public String getCustitemname() {
        return custitemname;
    }

    public void setCustitemname(String custitemname) {
        this.custitemname = custitemname;
    }

    public Integer getPrintorder() {
        return printorder;
    }

    public void setPrintorder(Integer printorder) {
        this.printorder = printorder;
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
        return "LCustitem{" +
        "machinecode=" + machinecode +
        ", custitemcode=" + custitemcode +
        ", custitemname=" + custitemname +
        ", printorder=" + printorder +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}

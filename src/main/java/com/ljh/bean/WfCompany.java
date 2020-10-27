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
public class WfCompany implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "COMPANYNO", type = IdType.AUTO)
    private String companyno;

    private String companyname;

    private String spellcode;

    private String wbcode;

    private String defcode;

    private String operator;

    private LocalDateTime registdate;


    public String getCompanyno() {
        return companyno;
    }

    public void setCompanyno(String companyno) {
        this.companyno = companyno;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getSpellcode() {
        return spellcode;
    }

    public void setSpellcode(String spellcode) {
        this.spellcode = spellcode;
    }

    public String getWbcode() {
        return wbcode;
    }

    public void setWbcode(String wbcode) {
        this.wbcode = wbcode;
    }

    public String getDefcode() {
        return defcode;
    }

    public void setDefcode(String defcode) {
        this.defcode = defcode;
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
        return "WfCompany{" +
        "companyno=" + companyno +
        ", companyname=" + companyname +
        ", spellcode=" + spellcode +
        ", wbcode=" + wbcode +
        ", defcode=" + defcode +
        ", operator=" + operator +
        ", registdate=" + registdate +
        "}";
    }
}

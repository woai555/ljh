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
public class WfCountry implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "COUNTRYCODE", type = IdType.AUTO)
    private String countrycode;

    private String name;

    private String spellcode;

    private String wbcode;

    private String defcode;

    private String operator;

    private LocalDateTime registdate;


    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "WfCountry{" +
        "countrycode=" + countrycode +
        ", name=" + name +
        ", spellcode=" + spellcode +
        ", wbcode=" + wbcode +
        ", defcode=" + defcode +
        ", operator=" + operator +
        ", registdate=" + registdate +
        "}";
    }
}

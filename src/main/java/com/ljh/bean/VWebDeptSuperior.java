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
public class VWebDeptSuperior implements Serializable {

    private static final long serialVersionUID=1L;

    private String sectname;

    private String sectid;

    private String importance;

    private String sectsummary;

    private String sectaddr;

    private String secttype;

    private BigDecimal priority;


    public String getSectname() {
        return sectname;
    }

    public void setSectname(String sectname) {
        this.sectname = sectname;
    }

    public String getSectid() {
        return sectid;
    }

    public void setSectid(String sectid) {
        this.sectid = sectid;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getSectsummary() {
        return sectsummary;
    }

    public void setSectsummary(String sectsummary) {
        this.sectsummary = sectsummary;
    }

    public String getSectaddr() {
        return sectaddr;
    }

    public void setSectaddr(String sectaddr) {
        this.sectaddr = sectaddr;
    }

    public String getSecttype() {
        return secttype;
    }

    public void setSecttype(String secttype) {
        this.secttype = secttype;
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "VWebDeptSuperior{" +
        "sectname=" + sectname +
        ", sectid=" + sectid +
        ", importance=" + importance +
        ", sectsummary=" + sectsummary +
        ", sectaddr=" + sectaddr +
        ", secttype=" + secttype +
        ", priority=" + priority +
        "}";
    }
}

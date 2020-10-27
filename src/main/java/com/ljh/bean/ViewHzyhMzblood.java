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
public class ViewHzyhMzblood implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientno;

    private String name;

    private BigDecimal departmentid;

    private String depatrmentname;

    private String blbarcode;

    private String blkinddetialname;

    private BigDecimal packqty;

    private String unit;

    private BigDecimal packprice;

    private Integer operid;

    private LocalDateTime operdate;

    private String bltypename;

    private String bltypecode;


    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(BigDecimal departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepatrmentname() {
        return depatrmentname;
    }

    public void setDepatrmentname(String depatrmentname) {
        this.depatrmentname = depatrmentname;
    }

    public String getBlbarcode() {
        return blbarcode;
    }

    public void setBlbarcode(String blbarcode) {
        this.blbarcode = blbarcode;
    }

    public String getBlkinddetialname() {
        return blkinddetialname;
    }

    public void setBlkinddetialname(String blkinddetialname) {
        this.blkinddetialname = blkinddetialname;
    }

    public BigDecimal getPackqty() {
        return packqty;
    }

    public void setPackqty(BigDecimal packqty) {
        this.packqty = packqty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPackprice() {
        return packprice;
    }

    public void setPackprice(BigDecimal packprice) {
        this.packprice = packprice;
    }

    public Integer getOperid() {
        return operid;
    }

    public void setOperid(Integer operid) {
        this.operid = operid;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public String getBltypename() {
        return bltypename;
    }

    public void setBltypename(String bltypename) {
        this.bltypename = bltypename;
    }

    public String getBltypecode() {
        return bltypecode;
    }

    public void setBltypecode(String bltypecode) {
        this.bltypecode = bltypecode;
    }

    @Override
    public String toString() {
        return "ViewHzyhMzblood{" +
        "inpatientno=" + inpatientno +
        ", name=" + name +
        ", departmentid=" + departmentid +
        ", depatrmentname=" + depatrmentname +
        ", blbarcode=" + blbarcode +
        ", blkinddetialname=" + blkinddetialname +
        ", packqty=" + packqty +
        ", unit=" + unit +
        ", packprice=" + packprice +
        ", operid=" + operid +
        ", operdate=" + operdate +
        ", bltypename=" + bltypename +
        ", bltypecode=" + bltypecode +
        "}";
    }
}

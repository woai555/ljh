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
public class VQyylUndrugInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String itemcode;

    private String itemname;

    private BigDecimal price;

    private LocalDateTime yydate;

    private String timecode;

    private String tixing;

    private String addr;

    private BigDecimal kyxe;

    private BigDecimal mbId;

    private String flagQz;

    private String typeId;

    private String typeName;

    private String deptName;

    private String pacsname;


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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getYydate() {
        return yydate;
    }

    public void setYydate(LocalDateTime yydate) {
        this.yydate = yydate;
    }

    public String getTimecode() {
        return timecode;
    }

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    public String getTixing() {
        return tixing;
    }

    public void setTixing(String tixing) {
        this.tixing = tixing;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public BigDecimal getKyxe() {
        return kyxe;
    }

    public void setKyxe(BigDecimal kyxe) {
        this.kyxe = kyxe;
    }

    public BigDecimal getMbId() {
        return mbId;
    }

    public void setMbId(BigDecimal mbId) {
        this.mbId = mbId;
    }

    public String getFlagQz() {
        return flagQz;
    }

    public void setFlagQz(String flagQz) {
        this.flagQz = flagQz;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPacsname() {
        return pacsname;
    }

    public void setPacsname(String pacsname) {
        this.pacsname = pacsname;
    }

    @Override
    public String toString() {
        return "VQyylUndrugInfo{" +
        "itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", price=" + price +
        ", yydate=" + yydate +
        ", timecode=" + timecode +
        ", tixing=" + tixing +
        ", addr=" + addr +
        ", kyxe=" + kyxe +
        ", mbId=" + mbId +
        ", flagQz=" + flagQz +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        ", deptName=" + deptName +
        ", pacsname=" + pacsname +
        "}";
    }
}

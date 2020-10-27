package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 镜检项目标准表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LCheckitembyman implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MULTIITEMCODE", type = IdType.AUTO)
    private String multiitemcode;

    private String itembymancode;

    private String itembymanname;

    private String itemunit;

    private BigDecimal downstandard;

    private BigDecimal upstandard;

    private Integer printorder;

    private String operatorid;

    private LocalDateTime modifydate;


    public String getMultiitemcode() {
        return multiitemcode;
    }

    public void setMultiitemcode(String multiitemcode) {
        this.multiitemcode = multiitemcode;
    }

    public String getItembymancode() {
        return itembymancode;
    }

    public void setItembymancode(String itembymancode) {
        this.itembymancode = itembymancode;
    }

    public String getItembymanname() {
        return itembymanname;
    }

    public void setItembymanname(String itembymanname) {
        this.itembymanname = itembymanname;
    }

    public String getItemunit() {
        return itemunit;
    }

    public void setItemunit(String itemunit) {
        this.itemunit = itemunit;
    }

    public BigDecimal getDownstandard() {
        return downstandard;
    }

    public void setDownstandard(BigDecimal downstandard) {
        this.downstandard = downstandard;
    }

    public BigDecimal getUpstandard() {
        return upstandard;
    }

    public void setUpstandard(BigDecimal upstandard) {
        this.upstandard = upstandard;
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

    public LocalDateTime getModifydate() {
        return modifydate;
    }

    public void setModifydate(LocalDateTime modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        return "LCheckitembyman{" +
        "multiitemcode=" + multiitemcode +
        ", itembymancode=" + itembymancode +
        ", itembymanname=" + itembymanname +
        ", itemunit=" + itemunit +
        ", downstandard=" + downstandard +
        ", upstandard=" + upstandard +
        ", printorder=" + printorder +
        ", operatorid=" + operatorid +
        ", modifydate=" + modifydate +
        "}";
    }
}

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
public class LOveritem implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 特殊项目编码
     */
    @TableId(value = "ITEMCODE", type = IdType.AUTO)
    private String itemcode;

    /**
     * 特殊项目名称
     */
    private String itemname;

    /**
     * 标准值上限
     */
    private BigDecimal upstandard;

    /**
     * 标准值下限
     */
    private BigDecimal downstandard;

    /**
     * 操作员ID
     */
    private String operatorid;

    /**
     * 修改日期
     */
    private LocalDateTime changedate;

    private String icdCode;

    private String icdName;


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

    public LocalDateTime getChangedate() {
        return changedate;
    }

    public void setChangedate(LocalDateTime changedate) {
        this.changedate = changedate;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    @Override
    public String toString() {
        return "LOveritem{" +
        "itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", upstandard=" + upstandard +
        ", downstandard=" + downstandard +
        ", operatorid=" + operatorid +
        ", changedate=" + changedate +
        ", icdCode=" + icdCode +
        ", icdName=" + icdName +
        "}";
    }
}

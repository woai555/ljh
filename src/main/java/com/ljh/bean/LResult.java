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
public class LResult implements Serializable {

    private static final long serialVersionUID=1L;

    private String machinecode;

    private String checkorder;

    @TableId(value = "CHECKDATE", type = IdType.AUTO)
    private LocalDateTime checkdate;

    private String itemcode;

    private LocalDateTime checktime;

    private String checkresult;

    private BigDecimal resultvalue;

    private String groupcode;

    private String machineid;

    /**
     * 是否自动,a自动,不允许修改,m手工，可以修改
     */
    private String isauto;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder;
    }

    public LocalDateTime getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(LocalDateTime checkdate) {
        this.checkdate = checkdate;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public LocalDateTime getChecktime() {
        return checktime;
    }

    public void setChecktime(LocalDateTime checktime) {
        this.checktime = checktime;
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    public BigDecimal getResultvalue() {
        return resultvalue;
    }

    public void setResultvalue(BigDecimal resultvalue) {
        this.resultvalue = resultvalue;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid;
    }

    public String getIsauto() {
        return isauto;
    }

    public void setIsauto(String isauto) {
        this.isauto = isauto;
    }

    @Override
    public String toString() {
        return "LResult{" +
        "machinecode=" + machinecode +
        ", checkorder=" + checkorder +
        ", checkdate=" + checkdate +
        ", itemcode=" + itemcode +
        ", checktime=" + checktime +
        ", checkresult=" + checkresult +
        ", resultvalue=" + resultvalue +
        ", groupcode=" + groupcode +
        ", machineid=" + machineid +
        ", isauto=" + isauto +
        "}";
    }
}

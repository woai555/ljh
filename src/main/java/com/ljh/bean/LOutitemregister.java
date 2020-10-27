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
public class LOutitemregister implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private LocalDateTime checkdate;

    private String checkorder;

    private String itemcode;

    private Integer ifout;

    private Integer checkdeptid;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public LocalDateTime getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(LocalDateTime checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public Integer getIfout() {
        return ifout;
    }

    public void setIfout(Integer ifout) {
        this.ifout = ifout;
    }

    public Integer getCheckdeptid() {
        return checkdeptid;
    }

    public void setCheckdeptid(Integer checkdeptid) {
        this.checkdeptid = checkdeptid;
    }

    @Override
    public String toString() {
        return "LOutitemregister{" +
        "machinecode=" + machinecode +
        ", checkdate=" + checkdate +
        ", checkorder=" + checkorder +
        ", itemcode=" + itemcode +
        ", ifout=" + ifout +
        ", checkdeptid=" + checkdeptid +
        "}";
    }
}

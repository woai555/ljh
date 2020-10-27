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
public class LResultbyman implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private String checkorder;

    private LocalDateTime checkdate;

    private String checktype;

    private String itemcode;

    private String itemresult;


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

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemresult() {
        return itemresult;
    }

    public void setItemresult(String itemresult) {
        this.itemresult = itemresult;
    }

    @Override
    public String toString() {
        return "LResultbyman{" +
        "machinecode=" + machinecode +
        ", checkorder=" + checkorder +
        ", checkdate=" + checkdate +
        ", checktype=" + checktype +
        ", itemcode=" + itemcode +
        ", itemresult=" + itemresult +
        "}";
    }
}

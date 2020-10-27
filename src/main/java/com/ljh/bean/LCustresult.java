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
public class LCustresult implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private String checkorder;

    private LocalDateTime checkdate;

    private String itemcode;

    private LocalDateTime checktime;

    private String result;

    private String groupcode;

    private String machineid;


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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

    @Override
    public String toString() {
        return "LCustresult{" +
        "machinecode=" + machinecode +
        ", checkorder=" + checkorder +
        ", checkdate=" + checkdate +
        ", itemcode=" + itemcode +
        ", checktime=" + checktime +
        ", result=" + result +
        ", groupcode=" + groupcode +
        ", machineid=" + machineid +
        "}";
    }
}

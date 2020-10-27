package com.ljh.bean;

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
public class LCheckResult implements Serializable {

    private static final long serialVersionUID=1L;

    private String result;

    private String grafid;

    @TableId(value = "CHECKDATE", type = IdType.AUTO)
    private String checkdate;

    private String checkorder;

    private String machinecode;

    private String groupcode;


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getGrafid() {
        return grafid;
    }

    public void setGrafid(String grafid) {
        this.grafid = grafid;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder;
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    @Override
    public String toString() {
        return "LCheckResult{" +
        "result=" + result +
        ", grafid=" + grafid +
        ", checkdate=" + checkdate +
        ", checkorder=" + checkorder +
        ", machinecode=" + machinecode +
        ", groupcode=" + groupcode +
        "}";
    }
}

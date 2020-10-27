package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术台维护表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpConsole implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CONSOLECODE", type = IdType.AUTO)
    private String consolecode;

    private String consolename;

    private String spell;

    private String roomid;

    private String deptCode;

    /**
     * 1.平诊 2.急诊
     */
    private String attribute;


    public String getConsolecode() {
        return consolecode;
    }

    public void setConsolecode(String consolecode) {
        this.consolecode = consolecode;
    }

    public String getConsolename() {
        return consolename;
    }

    public void setConsolename(String consolename) {
        this.consolename = consolename;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "OpConsole{" +
        "consolecode=" + consolecode +
        ", consolename=" + consolename +
        ", spell=" + spell +
        ", roomid=" + roomid +
        ", deptCode=" + deptCode +
        ", attribute=" + attribute +
        "}";
    }
}

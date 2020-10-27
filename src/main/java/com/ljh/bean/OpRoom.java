package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术室
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpRoom implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ROOMID", type = IdType.AUTO)
    private String roomid;

    private String roomname;

    private String spell;

    private String deptCode;

    /**
     * 1.门诊 2.住院
     */
    private String attribute;

    private String onduty;


    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
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

    public String getOnduty() {
        return onduty;
    }

    public void setOnduty(String onduty) {
        this.onduty = onduty;
    }

    @Override
    public String toString() {
        return "OpRoom{" +
        "roomid=" + roomid +
        ", roomname=" + roomname +
        ", spell=" + spell +
        ", deptCode=" + deptCode +
        ", attribute=" + attribute +
        ", onduty=" + onduty +
        "}";
    }
}

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
public class WatchRoomBeds implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 观察室
     */
    private String room;

    /**
     * 病床
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态('0'无人'1'占用)
     */
    private String state;

    /**
     * 当前患者
     */
    private String cardno;


    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @Override
    public String toString() {
        return "WatchRoomBeds{" +
        "room=" + room +
        ", code=" + code +
        ", name=" + name +
        ", remark=" + remark +
        ", state=" + state +
        ", cardno=" + cardno +
        "}";
    }
}

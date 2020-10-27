package com.ljh.bean;

import java.math.BigDecimal;
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
public class OOpsdesklog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ROOMID", type = IdType.AUTO)
    private BigDecimal roomid;

    private String roomname;

    private BigDecimal opsroomid;

    private String opsroomname;

    private String opsdeskcode;

    private String opsdeksname;


    public BigDecimal getRoomid() {
        return roomid;
    }

    public void setRoomid(BigDecimal roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public BigDecimal getOpsroomid() {
        return opsroomid;
    }

    public void setOpsroomid(BigDecimal opsroomid) {
        this.opsroomid = opsroomid;
    }

    public String getOpsroomname() {
        return opsroomname;
    }

    public void setOpsroomname(String opsroomname) {
        this.opsroomname = opsroomname;
    }

    public String getOpsdeskcode() {
        return opsdeskcode;
    }

    public void setOpsdeskcode(String opsdeskcode) {
        this.opsdeskcode = opsdeskcode;
    }

    public String getOpsdeksname() {
        return opsdeksname;
    }

    public void setOpsdeksname(String opsdeksname) {
        this.opsdeksname = opsdeksname;
    }

    @Override
    public String toString() {
        return "OOpsdesklog{" +
        "roomid=" + roomid +
        ", roomname=" + roomname +
        ", opsroomid=" + opsroomid +
        ", opsroomname=" + opsroomname +
        ", opsdeskcode=" + opsdeskcode +
        ", opsdeksname=" + opsdeksname +
        "}";
    }
}

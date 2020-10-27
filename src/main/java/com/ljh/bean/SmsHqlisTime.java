package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 检验危急值-科室上线时间。用于过滤条件
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SmsHqlisTime implements Serializable {

    private static final long serialVersionUID=1L;

    private String roomid;

    private String roomname;

    private LocalDateTime starttime;


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

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    @Override
    public String toString() {
        return "SmsHqlisTime{" +
        "roomid=" + roomid +
        ", roomname=" + roomname +
        ", starttime=" + starttime +
        "}";
    }
}

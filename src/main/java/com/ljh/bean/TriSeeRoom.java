package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 诊室信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TriSeeRoom implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 所属分诊科室
     */
    private String triagedeptCode;

    /**
     * 诊室编码
     */
    @TableId(value = "ROOM_CODE", type = IdType.AUTO)
    private String roomCode;

    /**
     * 诊室名称
     */
    private String roomName;

    /**
     * 诊室排序
     */
    private BigDecimal orderid;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getTriagedeptCode() {
        return triagedeptCode;
    }

    public void setTriagedeptCode(String triagedeptCode) {
        this.triagedeptCode = triagedeptCode;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "TriSeeRoom{" +
        "triagedeptCode=" + triagedeptCode +
        ", roomCode=" + roomCode +
        ", roomName=" + roomName +
        ", orderid=" + orderid +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

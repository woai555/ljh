package com.ljh.bean;

import java.math.BigDecimal;
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
public class PutdrugControl implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药房部门
     */
    private String deptCode;

    /**
     * 控制编码
     */
    private String printCode;

    /**
     * 控制名称
     */
    private String printName;

    /**
     * 科室编码
     */
    @TableId(value = "ROOM_CODE", type = IdType.AUTO)
    private String roomCode;

    /**
     * 配药单编码
     */
    private String queCode;

    /**
     * 占用标志
     */
    private BigDecimal flag;

    /**
     * 占用时间
     */
    private LocalDateTime activetime;

    /**
     * 操作员ID
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operTime;

    private String queName;

    /**
     * 每天开始时间
     */
    private LocalDateTime fromTime;

    /**
     * 每天结束时间
     */
    private LocalDateTime endTime;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getPrintCode() {
        return printCode;
    }

    public void setPrintCode(String printCode) {
        this.printCode = printCode;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getQueCode() {
        return queCode;
    }

    public void setQueCode(String queCode) {
        this.queCode = queCode;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public LocalDateTime getActivetime() {
        return activetime;
    }

    public void setActivetime(LocalDateTime activetime) {
        this.activetime = activetime;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperTime() {
        return operTime;
    }

    public void setOperTime(LocalDateTime operTime) {
        this.operTime = operTime;
    }

    public String getQueName() {
        return queName;
    }

    public void setQueName(String queName) {
        this.queName = queName;
    }

    public LocalDateTime getFromTime() {
        return fromTime;
    }

    public void setFromTime(LocalDateTime fromTime) {
        this.fromTime = fromTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "PutdrugControl{" +
        "deptCode=" + deptCode +
        ", printCode=" + printCode +
        ", printName=" + printName +
        ", roomCode=" + roomCode +
        ", queCode=" + queCode +
        ", flag=" + flag +
        ", activetime=" + activetime +
        ", operCode=" + operCode +
        ", operTime=" + operTime +
        ", queName=" + queName +
        ", fromTime=" + fromTime +
        ", endTime=" + endTime +
        "}";
    }
}

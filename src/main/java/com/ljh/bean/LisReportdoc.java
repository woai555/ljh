package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 科室处理危急值的医生维护
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LisReportdoc implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室编码
     */
    @TableId(value = "ROOMID", type = IdType.AUTO)
    private String roomid;

    /**
     * 医生编码
     */
    private String operid;

    /**
     * 医生姓名
     */
    private String realName;

    /**
     * 操作员
     */
    private BigDecimal operator;

    /**
     * 操作时间
     */
    private LocalDateTime opertime;

    /**
     * 医生登陆名
     */
    private String usrName;


    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public BigDecimal getOperator() {
        return operator;
    }

    public void setOperator(BigDecimal operator) {
        this.operator = operator;
    }

    public LocalDateTime getOpertime() {
        return opertime;
    }

    public void setOpertime(LocalDateTime opertime) {
        this.opertime = opertime;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    @Override
    public String toString() {
        return "LisReportdoc{" +
        "roomid=" + roomid +
        ", operid=" + operid +
        ", realName=" + realName +
        ", operator=" + operator +
        ", opertime=" + opertime +
        ", usrName=" + usrName +
        "}";
    }
}

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
public class Mj implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户序列号
     */
    @TableId(value = "CONSUMERID", type = IdType.AUTO)
    private BigDecimal consumerid;

    /**
     * 用户编号
     */
    private BigDecimal consumerno;

    /**
     * 用户姓名
     */
    private String consumername;

    /**
     * 用户卡号
     */
    private String cardno;

    /**
     * 用户工号
     */
    private String workno;

    /**
     * 部门班组ID
     */
    private String groupid;

    /**
     * 部门班组名称
     */
    private String groupname;

    /**
     * 用于考勤
     */
    private BigDecimal attendenabled;

    /**
     * 用于门禁
     */
    private BigDecimal doorenabled;

    /**
     * 建卡日期
     */
    private LocalDateTime beginymd;

    /**
     * 有效日期
     */
    private LocalDateTime endymd;


    public BigDecimal getConsumerid() {
        return consumerid;
    }

    public void setConsumerid(BigDecimal consumerid) {
        this.consumerid = consumerid;
    }

    public BigDecimal getConsumerno() {
        return consumerno;
    }

    public void setConsumerno(BigDecimal consumerno) {
        this.consumerno = consumerno;
    }

    public String getConsumername() {
        return consumername;
    }

    public void setConsumername(String consumername) {
        this.consumername = consumername;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getWorkno() {
        return workno;
    }

    public void setWorkno(String workno) {
        this.workno = workno;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public BigDecimal getAttendenabled() {
        return attendenabled;
    }

    public void setAttendenabled(BigDecimal attendenabled) {
        this.attendenabled = attendenabled;
    }

    public BigDecimal getDoorenabled() {
        return doorenabled;
    }

    public void setDoorenabled(BigDecimal doorenabled) {
        this.doorenabled = doorenabled;
    }

    public LocalDateTime getBeginymd() {
        return beginymd;
    }

    public void setBeginymd(LocalDateTime beginymd) {
        this.beginymd = beginymd;
    }

    public LocalDateTime getEndymd() {
        return endymd;
    }

    public void setEndymd(LocalDateTime endymd) {
        this.endymd = endymd;
    }

    @Override
    public String toString() {
        return "Mj{" +
        "consumerid=" + consumerid +
        ", consumerno=" + consumerno +
        ", consumername=" + consumername +
        ", cardno=" + cardno +
        ", workno=" + workno +
        ", groupid=" + groupid +
        ", groupname=" + groupname +
        ", attendenabled=" + attendenabled +
        ", doorenabled=" + doorenabled +
        ", beginymd=" + beginymd +
        ", endymd=" + endymd +
        "}";
    }
}

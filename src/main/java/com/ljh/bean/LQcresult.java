package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 质控检测结果表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LQcresult implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 质控项目ID
     */
    private Integer itemid;

    /**
     * 原始结果
     */
    private BigDecimal originalvalue;

    /**
     * 用户结果
     */
    private BigDecimal uservalue;

    /**
     * 是否使用,1是，2否
     */
    private String isused;

    private String receivedate;

    /**
     * 接收时间
     */
    @TableId(value = "RECEIVEDTIME", type = IdType.AUTO)
    private LocalDateTime receivedtime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 质控物代码
     */
    private Integer materialno;


    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public BigDecimal getOriginalvalue() {
        return originalvalue;
    }

    public void setOriginalvalue(BigDecimal originalvalue) {
        this.originalvalue = originalvalue;
    }

    public BigDecimal getUservalue() {
        return uservalue;
    }

    public void setUservalue(BigDecimal uservalue) {
        this.uservalue = uservalue;
    }

    public String getIsused() {
        return isused;
    }

    public void setIsused(String isused) {
        this.isused = isused;
    }

    public String getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate;
    }

    public LocalDateTime getReceivedtime() {
        return receivedtime;
    }

    public void setReceivedtime(LocalDateTime receivedtime) {
        this.receivedtime = receivedtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMaterialno() {
        return materialno;
    }

    public void setMaterialno(Integer materialno) {
        this.materialno = materialno;
    }

    @Override
    public String toString() {
        return "LQcresult{" +
        "itemid=" + itemid +
        ", originalvalue=" + originalvalue +
        ", uservalue=" + uservalue +
        ", isused=" + isused +
        ", receivedate=" + receivedate +
        ", receivedtime=" + receivedtime +
        ", remark=" + remark +
        ", materialno=" + materialno +
        "}";
    }
}

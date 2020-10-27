package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 质控样本项目表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LQcitem implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 项目ID
     */
    @TableId(value = "ITEMID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 仪器编码
     */
    private String machineid;

    /**
     * 样本编码
     */
    private BigDecimal materialno;

    /**
     * 项目编码
     */
    private String itemcode;

    /**
     * 靶值
     */
    private BigDecimal target;

    /**
     * 标准差
     */
    private BigDecimal sd;

    /**
     * 操作员
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatordate;

    /**
     * 试剂代码
     */
    private BigDecimal reagentno;

    /**
     * 测定方法
     */
    private String testmethod;

    private String isdefault;

    private String isused;


    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid;
    }

    public BigDecimal getMaterialno() {
        return materialno;
    }

    public void setMaterialno(BigDecimal materialno) {
        this.materialno = materialno;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public BigDecimal getTarget() {
        return target;
    }

    public void setTarget(BigDecimal target) {
        this.target = target;
    }

    public BigDecimal getSd() {
        return sd;
    }

    public void setSd(BigDecimal sd) {
        this.sd = sd;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(LocalDateTime operatordate) {
        this.operatordate = operatordate;
    }

    public BigDecimal getReagentno() {
        return reagentno;
    }

    public void setReagentno(BigDecimal reagentno) {
        this.reagentno = reagentno;
    }

    public String getTestmethod() {
        return testmethod;
    }

    public void setTestmethod(String testmethod) {
        this.testmethod = testmethod;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    public String getIsused() {
        return isused;
    }

    public void setIsused(String isused) {
        this.isused = isused;
    }

    @Override
    public String toString() {
        return "LQcitem{" +
        "itemid=" + itemid +
        ", machineid=" + machineid +
        ", materialno=" + materialno +
        ", itemcode=" + itemcode +
        ", target=" + target +
        ", sd=" + sd +
        ", operatorid=" + operatorid +
        ", operatordate=" + operatordate +
        ", reagentno=" + reagentno +
        ", testmethod=" + testmethod +
        ", isdefault=" + isdefault +
        ", isused=" + isused +
        "}";
    }
}

package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 质控样本表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LQcmaterial implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 样本编码
     */
    @TableId(value = "MATERIALNO", type = IdType.AUTO)
    private Integer materialno;

    /**
     * 样本中文名称
     */
    private String materialcname;

    /**
     * 样本英文名称
     */
    private String materialename;

    /**
     * 显示顺序
     */
    private BigDecimal disporder;

    /**
     * 输入码
     */
    private String inputcode;

    /**
     * 批号
     */
    private String patchno;

    /**
     * 生产厂家
     */
    private String producer;

    /**
     * 是否使用1使用，2不用
     */
    private String isused;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作员
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatordate;

    /**
     * 有效时间
     */
    private LocalDateTime validdate;


    public Integer getMaterialno() {
        return materialno;
    }

    public void setMaterialno(Integer materialno) {
        this.materialno = materialno;
    }

    public String getMaterialcname() {
        return materialcname;
    }

    public void setMaterialcname(String materialcname) {
        this.materialcname = materialcname;
    }

    public String getMaterialename() {
        return materialename;
    }

    public void setMaterialename(String materialename) {
        this.materialename = materialename;
    }

    public BigDecimal getDisporder() {
        return disporder;
    }

    public void setDisporder(BigDecimal disporder) {
        this.disporder = disporder;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }

    public String getPatchno() {
        return patchno;
    }

    public void setPatchno(String patchno) {
        this.patchno = patchno;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getIsused() {
        return isused;
    }

    public void setIsused(String isused) {
        this.isused = isused;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public LocalDateTime getValiddate() {
        return validdate;
    }

    public void setValiddate(LocalDateTime validdate) {
        this.validdate = validdate;
    }

    @Override
    public String toString() {
        return "LQcmaterial{" +
        "materialno=" + materialno +
        ", materialcname=" + materialcname +
        ", materialename=" + materialename +
        ", disporder=" + disporder +
        ", inputcode=" + inputcode +
        ", patchno=" + patchno +
        ", producer=" + producer +
        ", isused=" + isused +
        ", remark=" + remark +
        ", operatorid=" + operatorid +
        ", operatordate=" + operatordate +
        ", validdate=" + validdate +
        "}";
    }
}

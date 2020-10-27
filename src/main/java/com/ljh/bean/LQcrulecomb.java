package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 判定质控规则表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LQcrulecomb implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 质控规则ID
     */
    @TableId(value = "RULEID", type = IdType.AUTO)
    private Integer ruleid;

    /**
     * 质控规则名称
     */
    private String rulename;

    /**
     * 质控规则描述
     */
    private String ruledesc;

    /**
     * 是否默认,1是，2否
     */
    private String isdefault;

    /**
     * 显示顺序
     */
    private Integer disporder;

    /**
     * 操作员
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatordate;


    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public String getRulename() {
        return rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    public String getRuledesc() {
        return ruledesc;
    }

    public void setRuledesc(String ruledesc) {
        this.ruledesc = ruledesc;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    public Integer getDisporder() {
        return disporder;
    }

    public void setDisporder(Integer disporder) {
        this.disporder = disporder;
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

    @Override
    public String toString() {
        return "LQcrulecomb{" +
        "ruleid=" + ruleid +
        ", rulename=" + rulename +
        ", ruledesc=" + ruledesc +
        ", isdefault=" + isdefault +
        ", disporder=" + disporder +
        ", operatorid=" + operatorid +
        ", operatordate=" + operatordate +
        "}";
    }
}

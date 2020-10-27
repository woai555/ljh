package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 判定质控规则明细
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LQcruledetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 质控规则ID
     */
    @TableId(value = "RULEID", type = IdType.AUTO)
    private Integer ruleid;

    /**
     * 基本质控规则ID
     */
    private Integer baseruleid;


    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public Integer getBaseruleid() {
        return baseruleid;
    }

    public void setBaseruleid(Integer baseruleid) {
        this.baseruleid = baseruleid;
    }

    @Override
    public String toString() {
        return "LQcruledetail{" +
        "ruleid=" + ruleid +
        ", baseruleid=" + baseruleid +
        "}";
    }
}

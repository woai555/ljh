package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 细菌信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LGermitem implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 细菌代码
     */
    @TableId(value = "GERMID", type = IdType.AUTO)
    private String germid;

    /**
     * 菌群代码
     */
    private BigDecimal germgroupid;

    /**
     * 细菌中文名称
     */
    private String germcname;

    /**
     * 细菌英文名称
     */
    private String germename;

    /**
     * 缩写
     */
    private String shortname;

    /**
     * 助记码
     */
    private String inputcode;

    /**
     * 是否在用，1是，2否
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
    private LocalDateTime operdate;


    public String getGermid() {
        return germid;
    }

    public void setGermid(String germid) {
        this.germid = germid;
    }

    public BigDecimal getGermgroupid() {
        return germgroupid;
    }

    public void setGermgroupid(BigDecimal germgroupid) {
        this.germgroupid = germgroupid;
    }

    public String getGermcname() {
        return germcname;
    }

    public void setGermcname(String germcname) {
        this.germcname = germcname;
    }

    public String getGermename() {
        return germename;
    }

    public void setGermename(String germename) {
        this.germename = germename;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
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

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    @Override
    public String toString() {
        return "LGermitem{" +
        "germid=" + germid +
        ", germgroupid=" + germgroupid +
        ", germcname=" + germcname +
        ", germename=" + germename +
        ", shortname=" + shortname +
        ", inputcode=" + inputcode +
        ", isused=" + isused +
        ", remark=" + remark +
        ", operatorid=" + operatorid +
        ", operdate=" + operdate +
        "}";
    }
}

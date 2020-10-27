package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 抗生素信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LAntibiotic implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 抗生素代码
     */
    @TableId(value = "ITEMCODE", type = IdType.AUTO)
    private String itemcode;

    /**
     * 抗生素中文名称
     */
    private String anticname;

    /**
     * 抗生素英文名称
     */
    private String antiename;

    /**
     * 缩写
     */
    private String shortname;

    /**
     * 助记码
     */
    private String inputcode;

    /**
     * 单位,默认为mm
     */
    private String antiunit;

    /**
     * 上限，超过上限为敏感
     */
    private BigDecimal upperlimit;

    /**
     * 下限，低于下限为耐药
     */
    private BigDecimal lowerlimit;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作员id
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operdate;


    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getAnticname() {
        return anticname;
    }

    public void setAnticname(String anticname) {
        this.anticname = anticname;
    }

    public String getAntiename() {
        return antiename;
    }

    public void setAntiename(String antiename) {
        this.antiename = antiename;
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

    public String getAntiunit() {
        return antiunit;
    }

    public void setAntiunit(String antiunit) {
        this.antiunit = antiunit;
    }

    public BigDecimal getUpperlimit() {
        return upperlimit;
    }

    public void setUpperlimit(BigDecimal upperlimit) {
        this.upperlimit = upperlimit;
    }

    public BigDecimal getLowerlimit() {
        return lowerlimit;
    }

    public void setLowerlimit(BigDecimal lowerlimit) {
        this.lowerlimit = lowerlimit;
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
        return "LAntibiotic{" +
        "itemcode=" + itemcode +
        ", anticname=" + anticname +
        ", antiename=" + antiename +
        ", shortname=" + shortname +
        ", inputcode=" + inputcode +
        ", antiunit=" + antiunit +
        ", upperlimit=" + upperlimit +
        ", lowerlimit=" + lowerlimit +
        ", remark=" + remark +
        ", operatorid=" + operatorid +
        ", operdate=" + operdate +
        "}";
    }
}

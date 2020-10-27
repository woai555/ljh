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
public class LGermantibiotic implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 细菌类别
     */
    @TableId(value = "GERMGROUPID", type = IdType.AUTO)
    private BigDecimal germgroupid;

    /**
     * 抗生素代码
     */
    private String itemcode;

    /**
     * 抗生素名称
     */
    private String itemname;

    /**
     * 显示顺序
     */
    private BigDecimal disporder;

    /**
     * 上限
     */
    private BigDecimal upperlimit;

    /**
     * 下限
     */
    private BigDecimal lowerlimit;

    /**
     * 单位
     */
    private String resultunit;

    /**
     * 操作员
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operdate;


    public BigDecimal getGermgroupid() {
        return germgroupid;
    }

    public void setGermgroupid(BigDecimal germgroupid) {
        this.germgroupid = germgroupid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public BigDecimal getDisporder() {
        return disporder;
    }

    public void setDisporder(BigDecimal disporder) {
        this.disporder = disporder;
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

    public String getResultunit() {
        return resultunit;
    }

    public void setResultunit(String resultunit) {
        this.resultunit = resultunit;
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
        return "LGermantibiotic{" +
        "germgroupid=" + germgroupid +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", disporder=" + disporder +
        ", upperlimit=" + upperlimit +
        ", lowerlimit=" + lowerlimit +
        ", resultunit=" + resultunit +
        ", operatorid=" + operatorid +
        ", operdate=" + operdate +
        "}";
    }
}

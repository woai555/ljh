package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 菌群信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LGermgroup implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 菌群代码
     */
    @TableId(value = "GERMGROUPID", type = IdType.AUTO)
    private BigDecimal germgroupid;

    /**
     * 菌群名称
     */
    private String germgroupname;

    /**
     * 助记码
     */
    private String inputcode;

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


    public BigDecimal getGermgroupid() {
        return germgroupid;
    }

    public void setGermgroupid(BigDecimal germgroupid) {
        this.germgroupid = germgroupid;
    }

    public String getGermgroupname() {
        return germgroupname;
    }

    public void setGermgroupname(String germgroupname) {
        this.germgroupname = germgroupname;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
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
        return "LGermgroup{" +
        "germgroupid=" + germgroupid +
        ", germgroupname=" + germgroupname +
        ", inputcode=" + inputcode +
        ", remark=" + remark +
        ", operatorid=" + operatorid +
        ", operdate=" + operdate +
        "}";
    }
}

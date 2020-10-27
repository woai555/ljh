package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 药敏结果表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LAntiresult implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 仪器代码
     */
    private String machinecode;

    /**
     * 检验单号
     */
    @TableId(value = "CHECKORDER", type = IdType.AUTO)
    private String checkorder;

    /**
     * 检验日期
     */
    private LocalDateTime checkdate;

    /**
     * 项目流水号
     */
    private Integer seqNo;

    /**
     * 小组代码
     */
    private String groupcode;

    /**
     * 培养结果代码
     */
    private Integer germresultNo;

    /**
     * 抗生素代码
     */
    private String itemcode;

    /**
     * 菌群代码
     */
    private BigDecimal germgroupid;

    /**
     * 结果
     */
    private BigDecimal result;

    /**
     * 超标标志
     */
    private String superscaleFlag;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder;
    }

    public LocalDateTime getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(LocalDateTime checkdate) {
        this.checkdate = checkdate;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public Integer getGermresultNo() {
        return germresultNo;
    }

    public void setGermresultNo(Integer germresultNo) {
        this.germresultNo = germresultNo;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public BigDecimal getGermgroupid() {
        return germgroupid;
    }

    public void setGermgroupid(BigDecimal germgroupid) {
        this.germgroupid = germgroupid;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public String getSuperscaleFlag() {
        return superscaleFlag;
    }

    public void setSuperscaleFlag(String superscaleFlag) {
        this.superscaleFlag = superscaleFlag;
    }

    @Override
    public String toString() {
        return "LAntiresult{" +
        "machinecode=" + machinecode +
        ", checkorder=" + checkorder +
        ", checkdate=" + checkdate +
        ", seqNo=" + seqNo +
        ", groupcode=" + groupcode +
        ", germresultNo=" + germresultNo +
        ", itemcode=" + itemcode +
        ", germgroupid=" + germgroupid +
        ", result=" + result +
        ", superscaleFlag=" + superscaleFlag +
        "}";
    }
}

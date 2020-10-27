package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 欠费等级维护
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class QfLevel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编码
     */
    @TableId(value = "QF_LIMITCODE", type = IdType.AUTO)
    private String qfLimitcode;

    /**
     * 名称
     */
    private String qfLimitname;

    /**
     * 允许欠费金额
     */
    private BigDecimal value;

    /**
     * 正负
     */
    private String valueType;

    /**
     * 是否科主任1是0否
     */
    private String ifZr;

    /**
     * 提示内容
     */
    private String content;

    /**
     * 是否控制：1是0否
     */
    private String ifControl;

    private LocalDateTime operDate;

    private Integer operatorid;


    public String getQfLimitcode() {
        return qfLimitcode;
    }

    public void setQfLimitcode(String qfLimitcode) {
        this.qfLimitcode = qfLimitcode;
    }

    public String getQfLimitname() {
        return qfLimitname;
    }

    public void setQfLimitname(String qfLimitname) {
        this.qfLimitname = qfLimitname;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getIfZr() {
        return ifZr;
    }

    public void setIfZr(String ifZr) {
        this.ifZr = ifZr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIfControl() {
        return ifControl;
    }

    public void setIfControl(String ifControl) {
        this.ifControl = ifControl;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    @Override
    public String toString() {
        return "QfLevel{" +
        "qfLimitcode=" + qfLimitcode +
        ", qfLimitname=" + qfLimitname +
        ", value=" + value +
        ", valueType=" + valueType +
        ", ifZr=" + ifZr +
        ", content=" + content +
        ", ifControl=" + ifControl +
        ", operDate=" + operDate +
        ", operatorid=" + operatorid +
        "}";
    }
}

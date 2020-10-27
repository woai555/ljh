package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 结果描述短语表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LResultphrase implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 短语代码
     */
    @TableId(value = "PHRASEID", type = IdType.AUTO)
    private BigDecimal phraseid;

    /**
     * 短语描述
     */
    private String phrasename;

    /**
     * 显示顺序
     */
    private BigDecimal disporder;

    /**
     * 操作员
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operdate;


    public BigDecimal getPhraseid() {
        return phraseid;
    }

    public void setPhraseid(BigDecimal phraseid) {
        this.phraseid = phraseid;
    }

    public String getPhrasename() {
        return phrasename;
    }

    public void setPhrasename(String phrasename) {
        this.phrasename = phrasename;
    }

    public BigDecimal getDisporder() {
        return disporder;
    }

    public void setDisporder(BigDecimal disporder) {
        this.disporder = disporder;
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
        return "LResultphrase{" +
        "phraseid=" + phraseid +
        ", phrasename=" + phrasename +
        ", disporder=" + disporder +
        ", operatorid=" + operatorid +
        ", operdate=" + operdate +
        "}";
    }
}

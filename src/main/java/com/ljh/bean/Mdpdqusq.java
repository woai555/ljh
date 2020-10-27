package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 配药单序号
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpdqusq implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 日期
     */
    @TableId(value = "SQN_DATE", type = IdType.AUTO)
    private LocalDateTime sqnDate;

    /**
     * 配药药房代码
     */
    private String deptCode;

    /**
     * 配药单序号
     */
    private Integer queSeqn;


    public LocalDateTime getSqnDate() {
        return sqnDate;
    }

    public void setSqnDate(LocalDateTime sqnDate) {
        this.sqnDate = sqnDate;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Integer getQueSeqn() {
        return queSeqn;
    }

    public void setQueSeqn(Integer queSeqn) {
        this.queSeqn = queSeqn;
    }

    @Override
    public String toString() {
        return "Mdpdqusq{" +
        "sqnDate=" + sqnDate +
        ", deptCode=" + deptCode +
        ", queSeqn=" + queSeqn +
        "}";
    }
}

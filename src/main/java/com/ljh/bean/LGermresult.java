package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 培养结果表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LGermresult implements Serializable {

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
     * 1有菌，2无菌
     */
    private String isgerm;

    /**
     * 结果
     */
    private String result;


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

    public String getIsgerm() {
        return isgerm;
    }

    public void setIsgerm(String isgerm) {
        this.isgerm = isgerm;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "LGermresult{" +
        "machinecode=" + machinecode +
        ", checkorder=" + checkorder +
        ", checkdate=" + checkdate +
        ", seqNo=" + seqNo +
        ", groupcode=" + groupcode +
        ", isgerm=" + isgerm +
        ", result=" + result +
        "}";
    }
}

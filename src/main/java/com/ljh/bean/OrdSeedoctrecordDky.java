package com.ljh.bean;

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
public class OrdSeedoctrecordDky implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 代开药人姓名
     */
    private String replaceName;

    /**
     * 代开药人身份证号
     */
    private String replaceIdenno;

    /**
     * 代开药人电话
     */
    private String replaceTel;

    /**
     * 代开药人原因
     */
    private String replaceReason;

    /**
     * 看诊序号
     */
    @TableId(value = "SEE_NO", type = IdType.AUTO)
    private Long seeNo;

    /**
     * 看诊日期
     */
    private LocalDateTime seeDate;

    /**
     * 患者姓名
     */
    private String name;


    public String getReplaceName() {
        return replaceName;
    }

    public void setReplaceName(String replaceName) {
        this.replaceName = replaceName;
    }

    public String getReplaceIdenno() {
        return replaceIdenno;
    }

    public void setReplaceIdenno(String replaceIdenno) {
        this.replaceIdenno = replaceIdenno;
    }

    public String getReplaceTel() {
        return replaceTel;
    }

    public void setReplaceTel(String replaceTel) {
        this.replaceTel = replaceTel;
    }

    public String getReplaceReason() {
        return replaceReason;
    }

    public void setReplaceReason(String replaceReason) {
        this.replaceReason = replaceReason;
    }

    public Long getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(Long seeNo) {
        this.seeNo = seeNo;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrdSeedoctrecordDky{" +
        "replaceName=" + replaceName +
        ", replaceIdenno=" + replaceIdenno +
        ", replaceTel=" + replaceTel +
        ", replaceReason=" + replaceReason +
        ", seeNo=" + seeNo +
        ", seeDate=" + seeDate +
        ", name=" + name +
        "}";
    }
}

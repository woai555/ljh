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
public class ReportBlank implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 考核开始时间
     */
    @TableId(value = "BEGIN_DATE", type = IdType.AUTO)
    private LocalDateTime beginDate;

    /**
     * 考核截止时间
     */
    private LocalDateTime endDate;

    /**
     * 模板类型枚举值：全区，站，中心
     */
    private String mc;

    /**
     * 机构名称
     */
    private String jgmc;

    /**
     * 需要替换的字符串
     */
    private String blank;

    /**
     * 替换为新的字符串
     */
    private String detail;

    /**
     * 是否需要转换为百分比值为1报告中指标要转换成百分比
     */
    private String flag;


    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "ReportBlank{" +
        "beginDate=" + beginDate +
        ", endDate=" + endDate +
        ", mc=" + mc +
        ", jgmc=" + jgmc +
        ", blank=" + blank +
        ", detail=" + detail +
        ", flag=" + flag +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 配药队列主档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpddsqh implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 配药队列代码
     */
    @TableId(value = "QUE_CODE", type = IdType.AUTO)
    private Integer queCode;

    /**
     * 队列名称
     */
    private String queName;

    /**
     * 自动打印程序
     */
    private String prnProg;

    /**
     * 打印队列脚本
     */
    private String prnShel;

    /**
     * 所属药房代码
     */
    private String deptCode;

    /**
     * 工作开始时间
     */
    private LocalDateTime wrkBgtm;

    /**
     * 工作结束时间
     */
    private LocalDateTime wrkEdtm;

    /**
     * 有后备队列否
     */
    private String queBack;


    public Integer getQueCode() {
        return queCode;
    }

    public void setQueCode(Integer queCode) {
        this.queCode = queCode;
    }

    public String getQueName() {
        return queName;
    }

    public void setQueName(String queName) {
        this.queName = queName;
    }

    public String getPrnProg() {
        return prnProg;
    }

    public void setPrnProg(String prnProg) {
        this.prnProg = prnProg;
    }

    public String getPrnShel() {
        return prnShel;
    }

    public void setPrnShel(String prnShel) {
        this.prnShel = prnShel;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public LocalDateTime getWrkBgtm() {
        return wrkBgtm;
    }

    public void setWrkBgtm(LocalDateTime wrkBgtm) {
        this.wrkBgtm = wrkBgtm;
    }

    public LocalDateTime getWrkEdtm() {
        return wrkEdtm;
    }

    public void setWrkEdtm(LocalDateTime wrkEdtm) {
        this.wrkEdtm = wrkEdtm;
    }

    public String getQueBack() {
        return queBack;
    }

    public void setQueBack(String queBack) {
        this.queBack = queBack;
    }

    @Override
    public String toString() {
        return "Mdpddsqh{" +
        "queCode=" + queCode +
        ", queName=" + queName +
        ", prnProg=" + prnProg +
        ", prnShel=" + prnShel +
        ", deptCode=" + deptCode +
        ", wrkBgtm=" + wrkBgtm +
        ", wrkEdtm=" + wrkEdtm +
        ", queBack=" + queBack +
        "}";
    }
}

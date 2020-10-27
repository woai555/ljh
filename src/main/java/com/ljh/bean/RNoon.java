package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 午别代码表(R_Noon)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RNoon implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 午别号
     */
    @TableId(value = "NOON_CODE", type = IdType.AUTO)
    private String noonCode;

    /**
     * 午别名称
     */
    private String noonName;

    /**
     * 起始时间
     */
    private String begtime;

    /**
     * 终止时间
     */
    private String endtime;

    /**
     * 是否急诊
     */
    private String ynurg;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 看诊开始时间
     */
    private String begSee;

    /**
     * 看诊结束时间
     */
    private String endSee;


    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getNoonName() {
        return noonName;
    }

    public void setNoonName(String noonName) {
        this.noonName = noonName;
    }

    public String getBegtime() {
        return begtime;
    }

    public void setBegtime(String begtime) {
        this.begtime = begtime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getYnurg() {
        return ynurg;
    }

    public void setYnurg(String ynurg) {
        this.ynurg = ynurg;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getBegSee() {
        return begSee;
    }

    public void setBegSee(String begSee) {
        this.begSee = begSee;
    }

    public String getEndSee() {
        return endSee;
    }

    public void setEndSee(String endSee) {
        this.endSee = endSee;
    }

    @Override
    public String toString() {
        return "RNoon{" +
        "noonCode=" + noonCode +
        ", noonName=" + noonName +
        ", begtime=" + begtime +
        ", endtime=" + endtime +
        ", ynurg=" + ynurg +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", begSee=" + begSee +
        ", endSee=" + endSee +
        "}";
    }
}

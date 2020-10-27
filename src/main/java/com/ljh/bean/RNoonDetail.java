package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 午别分段表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RNoonDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别号
     */
    private String noonCode;

    /**
     * 类别名称
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
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 时间段编码
     */
    private String timeCode;

    /**
     * 末端标志,1末端，0不预约，2普通
     */
    private String flag;


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

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "RNoonDetail{" +
        "noonCode=" + noonCode +
        ", noonName=" + noonName +
        ", begtime=" + begtime +
        ", endtime=" + endtime +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", timeCode=" + timeCode +
        ", flag=" + flag +
        "}";
    }
}

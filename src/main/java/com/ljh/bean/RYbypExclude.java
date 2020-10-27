package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医保特殊药品
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RYbypExclude implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医保码
     */
    @TableId(value = "YBID", type = IdType.AUTO)
    private String ybid;

    /**
     * 医保药品名
     */
    private String ybname;

    private String operCode;

    /**
     * 维护时间
     */
    private LocalDateTime operDate;


    public String getYbid() {
        return ybid;
    }

    public void setYbid(String ybid) {
        this.ybid = ybid;
    }

    public String getYbname() {
        return ybname;
    }

    public void setYbname(String ybname) {
        this.ybname = ybname;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "RYbypExclude{" +
        "ybid=" + ybid +
        ", ybname=" + ybname +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

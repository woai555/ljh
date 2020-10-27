package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 药房配药日历档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpdcald implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药房代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 配药日期
     */
    private LocalDateTime dispDate;

    /**
     * 节假日标记
     */
    private String holiFlag;

    /**
     * 星期
     */
    private String weekNo;

    /**
     * 长嘱配药标记
     */
    private String dispFlagr;

    /**
     * 临嘱配药标记
     */
    private String dispFlagt;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public LocalDateTime getDispDate() {
        return dispDate;
    }

    public void setDispDate(LocalDateTime dispDate) {
        this.dispDate = dispDate;
    }

    public String getHoliFlag() {
        return holiFlag;
    }

    public void setHoliFlag(String holiFlag) {
        this.holiFlag = holiFlag;
    }

    public String getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(String weekNo) {
        this.weekNo = weekNo;
    }

    public String getDispFlagr() {
        return dispFlagr;
    }

    public void setDispFlagr(String dispFlagr) {
        this.dispFlagr = dispFlagr;
    }

    public String getDispFlagt() {
        return dispFlagt;
    }

    public void setDispFlagt(String dispFlagt) {
        this.dispFlagt = dispFlagt;
    }

    @Override
    public String toString() {
        return "Mdpdcald{" +
        "deptCode=" + deptCode +
        ", dispDate=" + dispDate +
        ", holiFlag=" + holiFlag +
        ", weekNo=" + weekNo +
        ", dispFlagr=" + dispFlagr +
        ", dispFlagt=" + dispFlagt +
        "}";
    }
}

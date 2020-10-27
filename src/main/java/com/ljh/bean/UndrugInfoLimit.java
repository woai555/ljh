package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class UndrugInfoLimit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 项目编码
     */
    @TableId(value = "UNDRUG_CODE", type = IdType.AUTO)
    private String undrugCode;

    /**
     * 项目名称
     */
    private String undrugName;

    /**
     * 限制类型 1限制 0允许
     */
    private Integer limitType;

    /**
     * 科室列表
     */
    private String deptList;

    /**
     * 医生列表
     */
    private String doctorList;

    /**
     * 互联网医院
     */
    private Integer onLine;

    /**
     * 预付费患者是否可用：1可用，0不可用
     */
    private Integer yffEnable;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public Integer getLimitType() {
        return limitType;
    }

    public void setLimitType(Integer limitType) {
        this.limitType = limitType;
    }

    public String getDeptList() {
        return deptList;
    }

    public void setDeptList(String deptList) {
        this.deptList = deptList;
    }

    public String getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(String doctorList) {
        this.doctorList = doctorList;
    }

    public Integer getOnLine() {
        return onLine;
    }

    public void setOnLine(Integer onLine) {
        this.onLine = onLine;
    }

    public Integer getYffEnable() {
        return yffEnable;
    }

    public void setYffEnable(Integer yffEnable) {
        this.yffEnable = yffEnable;
    }

    @Override
    public String toString() {
        return "UndrugInfoLimit{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", limitType=" + limitType +
        ", deptList=" + deptList +
        ", doctorList=" + doctorList +
        ", onLine=" + onLine +
        ", yffEnable=" + yffEnable +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护士站表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NurseStation implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 护士站代码
     */
    @TableId(value = "STATION_CODE", type = IdType.AUTO)
    private String stationCode;

    /**
     * 护士站名称
     */
    private String stationName;

    private Integer sendDrugtime;

    /**
     * 护士站拼音码
     */
    private String stationPy;

    /**
     * r_deptment中科室代码
     */
    private String deptCode;

    /**
     * 科室属性01留观
     */
    private String deptType;


    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getSendDrugtime() {
        return sendDrugtime;
    }

    public void setSendDrugtime(Integer sendDrugtime) {
        this.sendDrugtime = sendDrugtime;
    }

    public String getStationPy() {
        return stationPy;
    }

    public void setStationPy(String stationPy) {
        this.stationPy = stationPy;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    @Override
    public String toString() {
        return "NurseStation{" +
        "stationCode=" + stationCode +
        ", stationName=" + stationName +
        ", sendDrugtime=" + sendDrugtime +
        ", stationPy=" + stationPy +
        ", deptCode=" + deptCode +
        ", deptType=" + deptType +
        "}";
    }
}

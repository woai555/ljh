package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 患者生命体征记录档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsLfch implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 护理站代码
     */
    private String stationCode;

    /**
     * 护理站名称
     */
    private String stationName;

    /**
     * 病床号
     */
    private String bedNo;

    /**
     * 住院流水号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 患者姓名
     */
    private String name;

    /**
     * 入院日期
     */
    private LocalDateTime inDate;

    /**
     * 测量日期
     */
    private LocalDateTime lfchDate;

    /**
     * 呼吸
     */
    private Integer lfchBrth;

    /**
     * 脉搏
     */
    private Integer lfchPuls;

    /**
     * 温度
     */
    private BigDecimal lfchHeat;

    /**
     * 血压(高)
     */
    private Integer lfchBldh;

    /**
     * 血压(低)
     */
    private Integer lfchBldl;

    /**
     * 时间点标记:1-2,2-6,3-10,4-14,5-18,6-22
     */
    private String lfchFlag;

    /**
     * 备注
     */
    private String lfchNote;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 操作员姓名
     */
    private String operName;

    /**
     * 强行降温标志(1降温)
     */
    private Integer dropHeat;

    /**
     * 目标温度
     */
    private BigDecimal lfchHeatDown;

    /**
     * 体温类型
     */
    private String lfchStyle;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

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

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getLfchDate() {
        return lfchDate;
    }

    public void setLfchDate(LocalDateTime lfchDate) {
        this.lfchDate = lfchDate;
    }

    public Integer getLfchBrth() {
        return lfchBrth;
    }

    public void setLfchBrth(Integer lfchBrth) {
        this.lfchBrth = lfchBrth;
    }

    public Integer getLfchPuls() {
        return lfchPuls;
    }

    public void setLfchPuls(Integer lfchPuls) {
        this.lfchPuls = lfchPuls;
    }

    public BigDecimal getLfchHeat() {
        return lfchHeat;
    }

    public void setLfchHeat(BigDecimal lfchHeat) {
        this.lfchHeat = lfchHeat;
    }

    public Integer getLfchBldh() {
        return lfchBldh;
    }

    public void setLfchBldh(Integer lfchBldh) {
        this.lfchBldh = lfchBldh;
    }

    public Integer getLfchBldl() {
        return lfchBldl;
    }

    public void setLfchBldl(Integer lfchBldl) {
        this.lfchBldl = lfchBldl;
    }

    public String getLfchFlag() {
        return lfchFlag;
    }

    public void setLfchFlag(String lfchFlag) {
        this.lfchFlag = lfchFlag;
    }

    public String getLfchNote() {
        return lfchNote;
    }

    public void setLfchNote(String lfchNote) {
        this.lfchNote = lfchNote;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public Integer getDropHeat() {
        return dropHeat;
    }

    public void setDropHeat(Integer dropHeat) {
        this.dropHeat = dropHeat;
    }

    public BigDecimal getLfchHeatDown() {
        return lfchHeatDown;
    }

    public void setLfchHeatDown(BigDecimal lfchHeatDown) {
        this.lfchHeatDown = lfchHeatDown;
    }

    public String getLfchStyle() {
        return lfchStyle;
    }

    public void setLfchStyle(String lfchStyle) {
        this.lfchStyle = lfchStyle;
    }

    @Override
    public String toString() {
        return "NrsLfch{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", stationCode=" + stationCode +
        ", stationName=" + stationName +
        ", bedNo=" + bedNo +
        ", inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", name=" + name +
        ", inDate=" + inDate +
        ", lfchDate=" + lfchDate +
        ", lfchBrth=" + lfchBrth +
        ", lfchPuls=" + lfchPuls +
        ", lfchHeat=" + lfchHeat +
        ", lfchBldh=" + lfchBldh +
        ", lfchBldl=" + lfchBldl +
        ", lfchFlag=" + lfchFlag +
        ", lfchNote=" + lfchNote +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", dropHeat=" + dropHeat +
        ", lfchHeatDown=" + lfchHeatDown +
        ", lfchStyle=" + lfchStyle +
        "}";
    }
}

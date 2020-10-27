package com.ljh.bean;

import java.math.BigDecimal;
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
public class OrdDoctLimitDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别编号
     */
    @TableId(value = "LIMIT_ID", type = IdType.AUTO)
    private BigDecimal limitId;

    /**
     * 员工编码
     */
    private String emplCode;

    /**
     * 姓名
     */
    private String emplName;

    /**
     * 性别
     */
    private String sexCode;

    /**
     * 科室编码
     */
    private String deptCode;

    /**
     * 拼音码
     */
    private String emplEname;

    /**
     * 记录人
     */
    private String operCode;

    /**
     * 记录时间
     */
    private LocalDateTime operDate;


    public BigDecimal getLimitId() {
        return limitId;
    }

    public void setLimitId(BigDecimal limitId) {
        this.limitId = limitId;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getEmplEname() {
        return emplEname;
    }

    public void setEmplEname(String emplEname) {
        this.emplEname = emplEname;
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
        return "OrdDoctLimitDetail{" +
        "limitId=" + limitId +
        ", emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", sexCode=" + sexCode +
        ", deptCode=" + deptCode +
        ", emplEname=" + emplEname +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

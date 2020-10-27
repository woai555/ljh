package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 经济效益分类资料档MRMSFICD
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsficd implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 科名称
     */
    private String deptName;

    /**
     * ICD代码
     */
    private String icdCode;

    /**
     * 中文名称
     */
    private String icdName;

    /**
     * 子类代码
     */
    private String statKind;

    /**
     * 子类名称
     */
    private String statName;

    /**
     * 操作人
     */
    private String operMan;

    /**
     * 操作时日
     */
    private LocalDateTime operDate;


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

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getStatKind() {
        return statKind;
    }

    public void setStatKind(String statKind) {
        this.statKind = statKind;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public String getOperMan() {
        return operMan;
    }

    public void setOperMan(String operMan) {
        this.operMan = operMan;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "Mrmsficd{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", icdCode=" + icdCode +
        ", icdName=" + icdName +
        ", statKind=" + statKind +
        ", statName=" + statName +
        ", operMan=" + operMan +
        ", operDate=" + operDate +
        "}";
    }
}

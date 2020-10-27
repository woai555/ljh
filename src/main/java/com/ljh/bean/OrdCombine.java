package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 组套名称表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdCombine implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组套代码
     */
    @TableId(value = "COMB_CODE", type = IdType.AUTO)
    private String combCode;

    /**
     * 组套类别，1医生，2科室
     */
    private String combType;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 医生代码
     */
    private String doctCode;

    /**
     * 组套类别
     */
    private String typeCode;

    /**
     * 组套类别名称
     */
    private String typeName;

    /**
     * 助记码
     */
    private String combSpell;

    /**
     * 组套名称
     */
    private String combName;

    /**
     * 备注
     */
    private String combNote;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 是否共享,0是，1否
     */
    private String shareFlag;


    public String getCombCode() {
        return combCode;
    }

    public void setCombCode(String combCode) {
        this.combCode = combCode;
    }

    public String getCombType() {
        return combType;
    }

    public void setCombType(String combType) {
        this.combType = combType;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCombSpell() {
        return combSpell;
    }

    public void setCombSpell(String combSpell) {
        this.combSpell = combSpell;
    }

    public String getCombName() {
        return combName;
    }

    public void setCombName(String combName) {
        this.combName = combName;
    }

    public String getCombNote() {
        return combNote;
    }

    public void setCombNote(String combNote) {
        this.combNote = combNote;
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

    public String getShareFlag() {
        return shareFlag;
    }

    public void setShareFlag(String shareFlag) {
        this.shareFlag = shareFlag;
    }

    @Override
    public String toString() {
        return "OrdCombine{" +
        "combCode=" + combCode +
        ", combType=" + combType +
        ", deptCode=" + deptCode +
        ", doctCode=" + doctCode +
        ", typeCode=" + typeCode +
        ", typeName=" + typeName +
        ", combSpell=" + combSpell +
        ", combName=" + combName +
        ", combNote=" + combNote +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", shareFlag=" + shareFlag +
        "}";
    }
}

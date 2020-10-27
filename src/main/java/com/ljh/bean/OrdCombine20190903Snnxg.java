package com.ljh.bean;

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
public class OrdCombine20190903Snnxg implements Serializable {

    private static final long serialVersionUID=1L;

    private String combCode;

    private String combType;

    private String deptCode;

    private String doctCode;

    private String typeCode;

    private String typeName;

    private String combSpell;

    private String combName;

    private String combNote;

    private String operCode;

    private LocalDateTime operDate;

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
        return "OrdCombine20190903Snnxg{" +
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

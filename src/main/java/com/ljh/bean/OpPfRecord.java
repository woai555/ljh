package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术批费处方表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpPfRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 处方流水号
     */
    @TableId(value = "NOTE_NO", type = IdType.AUTO)
    private String noteNo;

    /**
     * 住院流水号
     */
    private String inpatientNo;

    /**
     * 手术序号
     */
    private String operationNo;

    /**
     * 操作时间
     */
    private LocalDateTime opeTime;

    /**
     * 操作员
     */
    private String opecode;

    /**
     * 批费类型：1－非药品，2－药品
     */
    private String pfType;


    public String getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(String noteNo) {
        this.noteNo = noteNo;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getOperationNo() {
        return operationNo;
    }

    public void setOperationNo(String operationNo) {
        this.operationNo = operationNo;
    }

    public LocalDateTime getOpeTime() {
        return opeTime;
    }

    public void setOpeTime(LocalDateTime opeTime) {
        this.opeTime = opeTime;
    }

    public String getOpecode() {
        return opecode;
    }

    public void setOpecode(String opecode) {
        this.opecode = opecode;
    }

    public String getPfType() {
        return pfType;
    }

    public void setPfType(String pfType) {
        this.pfType = pfType;
    }

    @Override
    public String toString() {
        return "OpPfRecord{" +
        "noteNo=" + noteNo +
        ", inpatientNo=" + inpatientNo +
        ", operationNo=" + operationNo +
        ", opeTime=" + opeTime +
        ", opecode=" + opecode +
        ", pfType=" + pfType +
        "}";
    }
}

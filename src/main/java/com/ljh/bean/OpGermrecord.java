package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 无菌检查记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpGermrecord implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private BigDecimal checkno;

    private String itemcode;

    private String checker;

    private BigDecimal checknum;

    private String checkunit;

    private String illustration;

    private String recorder;

    private LocalDateTime recordtime;

    /**
     * 0 无效 1 有效
     */
    private String ynvalid;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getCheckno() {
        return checkno;
    }

    public void setCheckno(BigDecimal checkno) {
        this.checkno = checkno;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public BigDecimal getChecknum() {
        return checknum;
    }

    public void setChecknum(BigDecimal checknum) {
        this.checknum = checknum;
    }

    public String getCheckunit() {
        return checkunit;
    }

    public void setCheckunit(String checkunit) {
        this.checkunit = checkunit;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public LocalDateTime getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(LocalDateTime recordtime) {
        this.recordtime = recordtime;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    @Override
    public String toString() {
        return "OpGermrecord{" +
        "operationno=" + operationno +
        ", checkno=" + checkno +
        ", itemcode=" + itemcode +
        ", checker=" + checker +
        ", checknum=" + checknum +
        ", checkunit=" + checkunit +
        ", illustration=" + illustration +
        ", recorder=" + recorder +
        ", recordtime=" + recordtime +
        ", ynvalid=" + ynvalid +
        "}";
    }
}

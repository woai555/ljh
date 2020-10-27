package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术效果评定表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpEvaluation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private String emplCode;

    private String duty;

    private BigDecimal basic;

    private BigDecimal amount;

    private BigDecimal effect;

    private String recorder;

    private LocalDateTime recordtime;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public BigDecimal getBasic() {
        return basic;
    }

    public void setBasic(BigDecimal basic) {
        this.basic = basic;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getEffect() {
        return effect;
    }

    public void setEffect(BigDecimal effect) {
        this.effect = effect;
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

    @Override
    public String toString() {
        return "OpEvaluation{" +
        "operationno=" + operationno +
        ", emplCode=" + emplCode +
        ", duty=" + duty +
        ", basic=" + basic +
        ", amount=" + amount +
        ", effect=" + effect +
        ", recorder=" + recorder +
        ", recordtime=" + recordtime +
        "}";
    }
}

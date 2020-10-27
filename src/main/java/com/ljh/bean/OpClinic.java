package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 术前会诊记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpClinic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private BigDecimal clinicno;

    private String clinicdoc;

    private String anesthtype;

    private String operateitem;

    private LocalDateTime clinicdate;

    private String illustration;

    private String recorder;

    private LocalDateTime recordtime;

    /**
     * 0 无效  1 有效
     */
    private String ynvalid;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getClinicno() {
        return clinicno;
    }

    public void setClinicno(BigDecimal clinicno) {
        this.clinicno = clinicno;
    }

    public String getClinicdoc() {
        return clinicdoc;
    }

    public void setClinicdoc(String clinicdoc) {
        this.clinicdoc = clinicdoc;
    }

    public String getAnesthtype() {
        return anesthtype;
    }

    public void setAnesthtype(String anesthtype) {
        this.anesthtype = anesthtype;
    }

    public String getOperateitem() {
        return operateitem;
    }

    public void setOperateitem(String operateitem) {
        this.operateitem = operateitem;
    }

    public LocalDateTime getClinicdate() {
        return clinicdate;
    }

    public void setClinicdate(LocalDateTime clinicdate) {
        this.clinicdate = clinicdate;
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
        return "OpClinic{" +
        "operationno=" + operationno +
        ", clinicno=" + clinicno +
        ", clinicdoc=" + clinicdoc +
        ", anesthtype=" + anesthtype +
        ", operateitem=" + operateitem +
        ", clinicdate=" + clinicdate +
        ", illustration=" + illustration +
        ", recorder=" + recorder +
        ", recordtime=" + recordtime +
        ", ynvalid=" + ynvalid +
        "}";
    }
}

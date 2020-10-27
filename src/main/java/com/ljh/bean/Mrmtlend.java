package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病案借阅表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmtlend implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院流水号
     */
    @TableId(value = "LEN_INPATIENTNO", type = IdType.AUTO)
    private String lenInpatientno;

    /**
     * 病人就诊卡号
     */
    private String lenCardno;

    /**
     * 病人姓名
     */
    private String lenPname;

    /**
     * 性别
     */
    private String lenSex;

    /**
     * 病历状态 O 出库中,I 在架上
     */
    private LocalDateTime lenBirth;

    private String lenStus;

    /**
     * 借阅日期
     */
    private LocalDateTime lenLndtime;

    /**
     * 预定还期
     */
    private LocalDateTime lenPrdtime;

    /**
     * 实际归还日期
     */
    private LocalDateTime lenRedtime;

    /**
     * 借阅性质代号 1门诊 2住院 3医师 9其他
     */
    private String lenRson;

    /**
     * 借阅人代号
     */
    private String lenLcode;

    /**
     * 借阅人姓名
     */
    private String lenLname;

    /**
     * 借阅人所在科室
     */
    private String lenDept;

    /**
     * 操作员代号
     */
    private String lenOper;

    /**
     * 操作时间
     */
    private LocalDateTime lenOpdtime;

    /**
     * 归还操作员代号
     */
    private String lenBackoper;

    /**
     * 归还操作时间
     */
    private LocalDateTime lenBackopdtime;


    public String getLenInpatientno() {
        return lenInpatientno;
    }

    public void setLenInpatientno(String lenInpatientno) {
        this.lenInpatientno = lenInpatientno;
    }

    public String getLenCardno() {
        return lenCardno;
    }

    public void setLenCardno(String lenCardno) {
        this.lenCardno = lenCardno;
    }

    public String getLenPname() {
        return lenPname;
    }

    public void setLenPname(String lenPname) {
        this.lenPname = lenPname;
    }

    public String getLenSex() {
        return lenSex;
    }

    public void setLenSex(String lenSex) {
        this.lenSex = lenSex;
    }

    public LocalDateTime getLenBirth() {
        return lenBirth;
    }

    public void setLenBirth(LocalDateTime lenBirth) {
        this.lenBirth = lenBirth;
    }

    public String getLenStus() {
        return lenStus;
    }

    public void setLenStus(String lenStus) {
        this.lenStus = lenStus;
    }

    public LocalDateTime getLenLndtime() {
        return lenLndtime;
    }

    public void setLenLndtime(LocalDateTime lenLndtime) {
        this.lenLndtime = lenLndtime;
    }

    public LocalDateTime getLenPrdtime() {
        return lenPrdtime;
    }

    public void setLenPrdtime(LocalDateTime lenPrdtime) {
        this.lenPrdtime = lenPrdtime;
    }

    public LocalDateTime getLenRedtime() {
        return lenRedtime;
    }

    public void setLenRedtime(LocalDateTime lenRedtime) {
        this.lenRedtime = lenRedtime;
    }

    public String getLenRson() {
        return lenRson;
    }

    public void setLenRson(String lenRson) {
        this.lenRson = lenRson;
    }

    public String getLenLcode() {
        return lenLcode;
    }

    public void setLenLcode(String lenLcode) {
        this.lenLcode = lenLcode;
    }

    public String getLenLname() {
        return lenLname;
    }

    public void setLenLname(String lenLname) {
        this.lenLname = lenLname;
    }

    public String getLenDept() {
        return lenDept;
    }

    public void setLenDept(String lenDept) {
        this.lenDept = lenDept;
    }

    public String getLenOper() {
        return lenOper;
    }

    public void setLenOper(String lenOper) {
        this.lenOper = lenOper;
    }

    public LocalDateTime getLenOpdtime() {
        return lenOpdtime;
    }

    public void setLenOpdtime(LocalDateTime lenOpdtime) {
        this.lenOpdtime = lenOpdtime;
    }

    public String getLenBackoper() {
        return lenBackoper;
    }

    public void setLenBackoper(String lenBackoper) {
        this.lenBackoper = lenBackoper;
    }

    public LocalDateTime getLenBackopdtime() {
        return lenBackopdtime;
    }

    public void setLenBackopdtime(LocalDateTime lenBackopdtime) {
        this.lenBackopdtime = lenBackopdtime;
    }

    @Override
    public String toString() {
        return "Mrmtlend{" +
        "lenInpatientno=" + lenInpatientno +
        ", lenCardno=" + lenCardno +
        ", lenPname=" + lenPname +
        ", lenSex=" + lenSex +
        ", lenBirth=" + lenBirth +
        ", lenStus=" + lenStus +
        ", lenLndtime=" + lenLndtime +
        ", lenPrdtime=" + lenPrdtime +
        ", lenRedtime=" + lenRedtime +
        ", lenRson=" + lenRson +
        ", lenLcode=" + lenLcode +
        ", lenLname=" + lenLname +
        ", lenDept=" + lenDept +
        ", lenOper=" + lenOper +
        ", lenOpdtime=" + lenOpdtime +
        ", lenBackoper=" + lenBackoper +
        ", lenBackopdtime=" + lenBackopdtime +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 平均住院日信息档(出院患者)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsavdy implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院流水号
     */
    private String inpatientNo;

    /**
     * 病房代码
     */
    private String deptCode;

    /**
     * 出院日期
     */
    private LocalDateTime outdate;

    /**
     * 记录属性
     */
    private String recAttr;

    /**
     * 进病房日期
     */
    private LocalDateTime dateIn;

    /**
     * 出病房日期
     */
    private LocalDateTime dateOut;

    /**
     * 手术日期
     */
    private LocalDateTime dateOper;

    /**
     * 出院主诊断
     */
    private String icdCode;

    /**
     * V码患者
     */
    private String icdKind;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public LocalDateTime getOutdate() {
        return outdate;
    }

    public void setOutdate(LocalDateTime outdate) {
        this.outdate = outdate;
    }

    public String getRecAttr() {
        return recAttr;
    }

    public void setRecAttr(String recAttr) {
        this.recAttr = recAttr;
    }

    public LocalDateTime getDateIn() {
        return dateIn;
    }

    public void setDateIn(LocalDateTime dateIn) {
        this.dateIn = dateIn;
    }

    public LocalDateTime getDateOut() {
        return dateOut;
    }

    public void setDateOut(LocalDateTime dateOut) {
        this.dateOut = dateOut;
    }

    public LocalDateTime getDateOper() {
        return dateOper;
    }

    public void setDateOper(LocalDateTime dateOper) {
        this.dateOper = dateOper;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdKind() {
        return icdKind;
    }

    public void setIcdKind(String icdKind) {
        this.icdKind = icdKind;
    }

    @Override
    public String toString() {
        return "Mrmsavdy{" +
        "inpatientNo=" + inpatientNo +
        ", deptCode=" + deptCode +
        ", outdate=" + outdate +
        ", recAttr=" + recAttr +
        ", dateIn=" + dateIn +
        ", dateOut=" + dateOut +
        ", dateOper=" + dateOper +
        ", icdCode=" + icdCode +
        ", icdKind=" + icdKind +
        "}";
    }
}

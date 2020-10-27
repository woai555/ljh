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
public class OrdDocvsdept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医生编码
     */
    @TableId(value = "DOC_CODE", type = IdType.AUTO)
    private String docCode;

    /**
     * 挂号科室
     */
    private String deptCode;

    /**
     * 操作人
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 1诊断默认代入上次看诊
     */
    private String bz;

    /**
     * 1全院诊断
     */
    private String diag;


    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getDiag() {
        return diag;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    @Override
    public String toString() {
        return "OrdDocvsdept{" +
        "docCode=" + docCode +
        ", deptCode=" + deptCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", bz=" + bz +
        ", diag=" + diag +
        "}";
    }
}

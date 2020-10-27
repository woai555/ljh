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
public class OpOutsidedoc implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DOC_CODE", type = IdType.AUTO)
    private String docCode;

    private String docName;

    private String docSex;

    private Integer docAge;

    private String docLevel;

    private String inHos;

    private String mark;

    private String operCode;

    private LocalDateTime operDate;


    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocSex() {
        return docSex;
    }

    public void setDocSex(String docSex) {
        this.docSex = docSex;
    }

    public Integer getDocAge() {
        return docAge;
    }

    public void setDocAge(Integer docAge) {
        this.docAge = docAge;
    }

    public String getDocLevel() {
        return docLevel;
    }

    public void setDocLevel(String docLevel) {
        this.docLevel = docLevel;
    }

    public String getInHos() {
        return inHos;
    }

    public void setInHos(String inHos) {
        this.inHos = inHos;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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

    @Override
    public String toString() {
        return "OpOutsidedoc{" +
        "docCode=" + docCode +
        ", docName=" + docName +
        ", docSex=" + docSex +
        ", docAge=" + docAge +
        ", docLevel=" + docLevel +
        ", inHos=" + inHos +
        ", mark=" + mark +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

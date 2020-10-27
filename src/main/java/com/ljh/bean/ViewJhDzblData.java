package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class ViewJhDzblData implements Serializable {

    private static final long serialVersionUID=1L;

    private String classCode;

    private String dictCode;

    private String dictName;

    private String inputCode;

    private String hospitalNo;


    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    @Override
    public String toString() {
        return "ViewJhDzblData{" +
        "classCode=" + classCode +
        ", dictCode=" + dictCode +
        ", dictName=" + dictName +
        ", inputCode=" + inputCode +
        ", hospitalNo=" + hospitalNo +
        "}";
    }
}

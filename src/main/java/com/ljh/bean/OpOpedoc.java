package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术室人员维护表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpOpedoc implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CODE", type = IdType.AUTO)
    private String code;

    private String name;

    private String levelCode;

    private String deptcode;

    private String sexCode;

    private String operCode;

    private LocalDateTime operDate;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
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
        return "OpOpedoc{" +
        "code=" + code +
        ", name=" + name +
        ", levelCode=" + levelCode +
        ", deptcode=" + deptcode +
        ", sexCode=" + sexCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}

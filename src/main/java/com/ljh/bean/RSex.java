package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 性别代码表(R_SEX)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RSex implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 性别编号
     */
    @TableId(value = "SEX_CODE", type = IdType.AUTO)
    private String sexCode;

    /**
     * 性别
     */
    private String sex;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;


    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "RSex{" +
        "sexCode=" + sexCode +
        ", sex=" + sex +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}

package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 设置挂号日结要统计的挂号员
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RSetRegstatistics implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 1挂号日结统计
     */
    @TableId(value = "TYPE_CODE", type = IdType.AUTO)
    private String typeCode;

    /**
     * 统计人
     */
    private String getPerson;

    /**
     * 挂号员
     */
    private String regPerson;

    /**
     * 设置时间
     */
    private LocalDateTime operDate;

    /**
     * 是否统计
     */
    private String yntj;

    /**
     * 挂号员所在科室
     */
    private String regpersonDept;

    /**
     * 挂号员登录名
     */
    private String regLogname;


    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getGetPerson() {
        return getPerson;
    }

    public void setGetPerson(String getPerson) {
        this.getPerson = getPerson;
    }

    public String getRegPerson() {
        return regPerson;
    }

    public void setRegPerson(String regPerson) {
        this.regPerson = regPerson;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getYntj() {
        return yntj;
    }

    public void setYntj(String yntj) {
        this.yntj = yntj;
    }

    public String getRegpersonDept() {
        return regpersonDept;
    }

    public void setRegpersonDept(String regpersonDept) {
        this.regpersonDept = regpersonDept;
    }

    public String getRegLogname() {
        return regLogname;
    }

    public void setRegLogname(String regLogname) {
        this.regLogname = regLogname;
    }

    @Override
    public String toString() {
        return "RSetRegstatistics{" +
        "typeCode=" + typeCode +
        ", getPerson=" + getPerson +
        ", regPerson=" + regPerson +
        ", operDate=" + operDate +
        ", yntj=" + yntj +
        ", regpersonDept=" + regpersonDept +
        ", regLogname=" + regLogname +
        "}";
    }
}

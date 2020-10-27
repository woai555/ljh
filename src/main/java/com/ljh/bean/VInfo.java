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
public class VInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 卡号
     */
    @TableId(value = "V_CARD_NO", type = IdType.AUTO)
    private String vCardNo;

    /**
     * 身份证号
     */
    private String vIdenNo;

    /**
     * 姓名
     */
    private String vName;

    /**
     * 性别
     */
    private String vSex;

    /**
     * 科室编号
     */
    private String vDeptid;

    /**
     * 科室名称
     */
    private String vDeptnm;

    /**
     * 办卡日期
     */
    private LocalDateTime vDate;


    public String getvCardNo() {
        return vCardNo;
    }

    public void setvCardNo(String vCardNo) {
        this.vCardNo = vCardNo;
    }

    public String getvIdenNo() {
        return vIdenNo;
    }

    public void setvIdenNo(String vIdenNo) {
        this.vIdenNo = vIdenNo;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getvSex() {
        return vSex;
    }

    public void setvSex(String vSex) {
        this.vSex = vSex;
    }

    public String getvDeptid() {
        return vDeptid;
    }

    public void setvDeptid(String vDeptid) {
        this.vDeptid = vDeptid;
    }

    public String getvDeptnm() {
        return vDeptnm;
    }

    public void setvDeptnm(String vDeptnm) {
        this.vDeptnm = vDeptnm;
    }

    public LocalDateTime getvDate() {
        return vDate;
    }

    public void setvDate(LocalDateTime vDate) {
        this.vDate = vDate;
    }

    @Override
    public String toString() {
        return "VInfo{" +
        "vCardNo=" + vCardNo +
        ", vIdenNo=" + vIdenNo +
        ", vName=" + vName +
        ", vSex=" + vSex +
        ", vDeptid=" + vDeptid +
        ", vDeptnm=" + vDeptnm +
        ", vDate=" + vDate +
        "}";
    }
}

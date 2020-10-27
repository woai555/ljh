package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 电话科室对应表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TeleKeshiImport implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "DEPTNUM", type = IdType.AUTO)
    private String deptnum;

    /**
     * 科室代码
     */
    private String deptno;

    /**
     * 科室名称
     */
    private String deptname;

    /**
     * 科室分项
     */
    private String deptitem;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 操作时间
     */
    private LocalDateTime operdate;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 标志
     */
    private String bz;


    public String getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(String deptnum) {
        this.deptnum = deptnum;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptitem() {
        return deptitem;
    }

    public void setDeptitem(String deptitem) {
        this.deptitem = deptitem;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "TeleKeshiImport{" +
        "deptnum=" + deptnum +
        ", deptno=" + deptno +
        ", deptname=" + deptname +
        ", deptitem=" + deptitem +
        ", telephone=" + telephone +
        ", operdate=" + operdate +
        ", remark=" + remark +
        ", bz=" + bz +
        "}";
    }
}

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
public class TeleKeshi implements Serializable {

    private static final long serialVersionUID=1L;

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
     * 科室名称拼音码
     */
    private String deptnamePy;

    /**
     * 科室分项拼音码
     */
    private String deptitemPy;

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
     * 行序号
     */
    @TableId(value = "ROW_NUMBER", type = IdType.AUTO)
    private String rowNumber;

    /**
     * 标志
     */
    private String teleBz;


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

    public String getDeptnamePy() {
        return deptnamePy;
    }

    public void setDeptnamePy(String deptnamePy) {
        this.deptnamePy = deptnamePy;
    }

    public String getDeptitemPy() {
        return deptitemPy;
    }

    public void setDeptitemPy(String deptitemPy) {
        this.deptitemPy = deptitemPy;
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

    public String getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getTeleBz() {
        return teleBz;
    }

    public void setTeleBz(String teleBz) {
        this.teleBz = teleBz;
    }

    @Override
    public String toString() {
        return "TeleKeshi{" +
        "deptno=" + deptno +
        ", deptname=" + deptname +
        ", deptitem=" + deptitem +
        ", deptnamePy=" + deptnamePy +
        ", deptitemPy=" + deptitemPy +
        ", telephone=" + telephone +
        ", operdate=" + operdate +
        ", remark=" + remark +
        ", rowNumber=" + rowNumber +
        ", teleBz=" + teleBz +
        "}";
    }
}

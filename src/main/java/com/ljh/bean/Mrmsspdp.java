package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 大科分类资料档MRMSSPDP
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsspdp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 大科代码
     */
    private String sdeptCode;

    /**
     * 大科名称
     */
    private String sdeptName;

    /**
     * 科室号
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 科室拼音
     */
    private String deptPy;

    /**
     * 科室英文名称
     */
    private String deptEname;

    /**
     * 科室类型
     */
    private String deptType;

    /**
     * 科室报表排序号
     */
    private Integer deptOrder;

    /**
     * 相关报表
     */
    private String rltvRept;

    /**
     * 操作人
     */
    private String operMan;

    /**
     * 操作时日
     */
    private LocalDateTime operDate;


    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getSdeptName() {
        return sdeptName;
    }

    public void setSdeptName(String sdeptName) {
        this.sdeptName = sdeptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptPy() {
        return deptPy;
    }

    public void setDeptPy(String deptPy) {
        this.deptPy = deptPy;
    }

    public String getDeptEname() {
        return deptEname;
    }

    public void setDeptEname(String deptEname) {
        this.deptEname = deptEname;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public Integer getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(Integer deptOrder) {
        this.deptOrder = deptOrder;
    }

    public String getRltvRept() {
        return rltvRept;
    }

    public void setRltvRept(String rltvRept) {
        this.rltvRept = rltvRept;
    }

    public String getOperMan() {
        return operMan;
    }

    public void setOperMan(String operMan) {
        this.operMan = operMan;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "Mrmsspdp{" +
        "sdeptCode=" + sdeptCode +
        ", sdeptName=" + sdeptName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptPy=" + deptPy +
        ", deptEname=" + deptEname +
        ", deptType=" + deptType +
        ", deptOrder=" + deptOrder +
        ", rltvRept=" + rltvRept +
        ", operMan=" + operMan +
        ", operDate=" + operDate +
        "}";
    }
}

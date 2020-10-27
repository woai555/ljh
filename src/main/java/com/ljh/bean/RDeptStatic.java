package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医院科室功能明细设置表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDeptStatic implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室功能分类编码
     */
    @TableId(value = "DEPT_FUNCTIONCODE", type = IdType.AUTO)
    private String deptFunctioncode;

    /**
     * 科室编码                  --DEPTKIND = 1：科室编码（R_DEPARTMENT.DEPT_CODE）;DEPTKIND = 2：科室分类流水号（R_DEPTTYPE.DEPTTYPE_NO）
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 科室分类级别(当functioncode=windownoyy_empl时用来限制预约，1表示窗口不能挂，2表示复诊不能约，0表示都不能)
     */
    private BigDecimal depttypelevel;

    /**
     * 排列顺序
     */
    private BigDecimal orderid;

    private String deptorderid;

    /**
     * 科室类别                   --1：最终科室;2：科室分类
     */
    private BigDecimal deptkind;

    /**
     * 上级科室编码
     */
    private String superiordeptcode;

    /**
     * 操作人员ID
     */
    private String operatorid;

    /**
     * 操作时间
     */
    private LocalDateTime operatortime;


    public String getDeptFunctioncode() {
        return deptFunctioncode;
    }

    public void setDeptFunctioncode(String deptFunctioncode) {
        this.deptFunctioncode = deptFunctioncode;
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

    public BigDecimal getDepttypelevel() {
        return depttypelevel;
    }

    public void setDepttypelevel(BigDecimal depttypelevel) {
        this.depttypelevel = depttypelevel;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getDeptorderid() {
        return deptorderid;
    }

    public void setDeptorderid(String deptorderid) {
        this.deptorderid = deptorderid;
    }

    public BigDecimal getDeptkind() {
        return deptkind;
    }

    public void setDeptkind(BigDecimal deptkind) {
        this.deptkind = deptkind;
    }

    public String getSuperiordeptcode() {
        return superiordeptcode;
    }

    public void setSuperiordeptcode(String superiordeptcode) {
        this.superiordeptcode = superiordeptcode;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "RDeptStatic{" +
        "deptFunctioncode=" + deptFunctioncode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", depttypelevel=" + depttypelevel +
        ", orderid=" + orderid +
        ", deptorderid=" + deptorderid +
        ", deptkind=" + deptkind +
        ", superiordeptcode=" + superiordeptcode +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}

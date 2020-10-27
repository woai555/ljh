package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 配药单分类档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpdqutp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药单分类代码
     */
    @TableId(value = "QUE_CODE", type = IdType.AUTO)
    private String queCode;

    /**
     * 药单分类名称
     */
    private String queName;

    /**
     * 药房代码
     */
    private String deptCode;

    /**
     * 药房名称
     */
    private String deptName;

    /**
     * 配药单类别:1全院/2本药房
     */
    private String queScope;

    /**
     * 摆药单打印内容1汇总/2明细/3全部
     */
    private String prnType;

    /**
     * 药嘱类型
     */
    private String decmpsState;


    public String getQueCode() {
        return queCode;
    }

    public void setQueCode(String queCode) {
        this.queCode = queCode;
    }

    public String getQueName() {
        return queName;
    }

    public void setQueName(String queName) {
        this.queName = queName;
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

    public String getQueScope() {
        return queScope;
    }

    public void setQueScope(String queScope) {
        this.queScope = queScope;
    }

    public String getPrnType() {
        return prnType;
    }

    public void setPrnType(String prnType) {
        this.prnType = prnType;
    }

    public String getDecmpsState() {
        return decmpsState;
    }

    public void setDecmpsState(String decmpsState) {
        this.decmpsState = decmpsState;
    }

    @Override
    public String toString() {
        return "Mdpdqutp{" +
        "queCode=" + queCode +
        ", queName=" + queName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", queScope=" + queScope +
        ", prnType=" + prnType +
        ", decmpsState=" + decmpsState +
        "}";
    }
}

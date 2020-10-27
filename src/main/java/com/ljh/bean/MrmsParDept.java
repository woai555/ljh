package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 统计科室
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MrmsParDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 参数类型
     */
    private String parType;

    /**
     * 是否有效
     */
    private String ynvalid;


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

    public String getParType() {
        return parType;
    }

    public void setParType(String parType) {
        this.parType = parType;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    @Override
    public String toString() {
        return "MrmsParDept{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", parType=" + parType +
        ", ynvalid=" + ynvalid +
        "}";
    }
}

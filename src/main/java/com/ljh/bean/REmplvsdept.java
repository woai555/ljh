package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 京医通n科显示同一大夫，一个大夫需维护n条记录,同时人员字典BZ赋2
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class REmplvsdept implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;

    private String deptCode;

    private String deptName;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
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

    @Override
    public String toString() {
        return "REmplvsdept{" +
        "emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        "}";
    }
}

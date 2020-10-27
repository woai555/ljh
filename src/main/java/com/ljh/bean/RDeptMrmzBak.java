package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class RDeptMrmzBak implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String mrmDept;

    private String mzDeptcode;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getMrmDept() {
        return mrmDept;
    }

    public void setMrmDept(String mrmDept) {
        this.mrmDept = mrmDept;
    }

    public String getMzDeptcode() {
        return mzDeptcode;
    }

    public void setMzDeptcode(String mzDeptcode) {
        this.mzDeptcode = mzDeptcode;
    }

    @Override
    public String toString() {
        return "RDeptMrmzBak{" +
        "deptCode=" + deptCode +
        ", mrmDept=" + mrmDept +
        ", mzDeptcode=" + mzDeptcode +
        "}";
    }
}

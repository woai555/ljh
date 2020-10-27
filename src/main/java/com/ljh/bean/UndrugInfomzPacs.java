package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊和pacs项目对照
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugInfomzPacs implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 门诊项目编码
     */
    @TableId(value = "MZCODE", type = IdType.AUTO)
    private String mzcode;

    /**
     * 门诊项目名称
     */
    private String mzname;

    /**
     * pacs名称
     */
    private String pacsname;

    /**
     * 科室
     */
    private String dept;


    public String getMzcode() {
        return mzcode;
    }

    public void setMzcode(String mzcode) {
        this.mzcode = mzcode;
    }

    public String getMzname() {
        return mzname;
    }

    public void setMzname(String mzname) {
        this.mzname = mzname;
    }

    public String getPacsname() {
        return pacsname;
    }

    public void setPacsname(String pacsname) {
        this.pacsname = pacsname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "UndrugInfomzPacs{" +
        "mzcode=" + mzcode +
        ", mzname=" + mzname +
        ", pacsname=" + pacsname +
        ", dept=" + dept +
        "}";
    }
}

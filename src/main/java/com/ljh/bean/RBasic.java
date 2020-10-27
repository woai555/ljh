package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 基本信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RBasic implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 表名
     */
    @TableId(value = "TBL_NAME", type = IdType.AUTO)
    private String tblName;

    /**
     * 数据窗口名
     */
    private String dwName;

    /**
     * 表名描述
     */
    private String tblCname;


    public String getTblName() {
        return tblName;
    }

    public void setTblName(String tblName) {
        this.tblName = tblName;
    }

    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public String getTblCname() {
        return tblCname;
    }

    public void setTblCname(String tblCname) {
        this.tblCname = tblCname;
    }

    @Override
    public String toString() {
        return "RBasic{" +
        "tblName=" + tblName +
        ", dwName=" + dwName +
        ", tblCname=" + tblCname +
        "}";
    }
}

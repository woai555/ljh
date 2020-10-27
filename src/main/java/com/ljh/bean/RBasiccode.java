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
public class RBasiccode implements Serializable {

    private static final long serialVersionUID=1L;

    private String tblName;

    private String dwName;

    private String tblCname;

    private String groupCode;


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

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    @Override
    public String toString() {
        return "RBasiccode{" +
        "tblName=" + tblName +
        ", dwName=" + dwName +
        ", tblCname=" + tblCname +
        ", groupCode=" + groupCode +
        "}";
    }
}
